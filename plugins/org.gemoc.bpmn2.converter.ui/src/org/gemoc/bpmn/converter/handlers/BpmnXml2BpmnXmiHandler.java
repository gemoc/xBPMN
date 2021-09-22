package org.gemoc.bpmn.converter.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
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
		new BPMN2Converter().bpmnXsdTobpmnXmi("platform:/resource"+filePath, "platform:/resource"+filePath+"xmi");
		MessageDialog.openInformation(
				window.getShell(),
				"BPMN2 Converter",
				"Convert bpmn xml to bpmn xmi\n"+filePath);
		
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
