package org.gemoc.bpmn.converter.handlers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gemoc.bpmn2.converter.BPMN2Converter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public class BpmnXml2BpmnXmiHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		IFile selectedIFile = this.getIFileFromSelection(event);
		String filePath = selectedIFile.getFullPath().toString();
		new BPMN2Converter().bpmnXsdTobpmnXmi("platform:/resource"+filePath, "platform:/resource"+filePath+"_model");
		
		// QUICK and DIRTY PATCH change nsURI in resulting file to bpmn_model
		IFile resultingIFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath+"_model"));	
		try {
			//resultingIFile.refreshLocal(IResource.DEPTH_ZERO, null);
			resultingIFile.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(resultingIFile.getContents(), resultingIFile.getCharset()));
				) {
			String line;
		     while ((line = br.readLine()) != null) {
		    	 // change nsURI
		         sb.append(line.replaceAll("http://www.omg.org/spec/BPMN/20100524/MODEL-XMI", "http://www.omg.org/spec/BPMN/20100524/MODEL-EMF")+"\n");
		     }
		} catch (IOException | CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// write back to file
		try {
			InputStream stream =  new ByteArrayInputStream(sb.toString().getBytes(("UTF-8")));
			resultingIFile.setContents(stream, true, true, null);
		} catch (UnsupportedEncodingException | CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MessageDialog.openInformation(
				window.getShell(),
				"BPMN2 Converter",
				"Converted "+filePath+" to "+filePath+"_model");
		
		return null;
	}
	
	
	protected IFile getIFileFromSelection(ExecutionEvent event) {
		IFile selectedIFile = null;
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			for (@SuppressWarnings("unchecked")
			Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {

				Object element = iterator.next();

				if (element instanceof IFile ) {
					return (IFile) element;

				}
				if (element instanceof IAdaptable) {
					IFile res = (IFile) ((IAdaptable) element).getAdapter(IFile.class);
					if (res != null ) {
						return res;
					}
				}
			}
		}
		return selectedIFile;
	}
	
	
	
}
