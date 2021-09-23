package org.gemoc.bpsim2.ui.handlers;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gemoc.bpsim2.BPSimDataType;
import org.gemoc.bpsim2.Bpsim2Factory;
import org.gemoc.bpsim2.ControlParameters;
import org.gemoc.bpsim2.DocumentRoot;
import org.gemoc.bpsim2.ElementParameters;
import org.gemoc.bpsim2.ElementParametersType;
import org.gemoc.bpsim2.NumericParameterType;
import org.gemoc.bpsim2.Parameter;
import org.gemoc.bpsim2.Scenario;
import org.gemoc.bpsim2.util.Bpsim2ResourceFactoryImpl;
import org.obeonetwork.dsl.bpmn2.StartEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public class InitiateScenarioForBPMNHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IFile selectedIFile = this.getIFileFromSelection(event);
		String filePath = selectedIFile.getFullPath().toString();

		this.initiateBPSIM(filePath);
		MessageDialog.openInformation(
				window.getShell(),
				"BPSim2 UI",
				"generated a basic scenario: \n"+selectedIFile.getFullPath().removeFileExtension().removeTrailingSeparator().toString()+"_scenario_01.bpsim2");
		return null;
	}
	
	
	public void initiateBPSIM(String bpmnModelPath) {
		//ResourceFactoryImpl bsimFactory = new Bpsim2ResourceFactoryImpl();

		try {
			ResourceSet rs = new ResourceSetImpl();
			URI bpmnUri = URI.createURI(bpmnModelPath);
			Resource bpmnRes = rs.getResource(bpmnUri, true);
			bpmnUri.trimFileExtension().appendFileExtension("bpsim2");
			URI bpsimUri = URI.createURI(bpmnUri.trimFileExtension().toString() + "_scenario_01.bpsim2");
			Resource bpsimRes = rs.createResource(bpsimUri);
		
			DocumentRoot dr = Bpsim2Factory.eINSTANCE.createDocumentRoot();
			dr.setBPSimData(Bpsim2Factory.eINSTANCE.createBPSimDataType());
	//		BPSimDataType bpsimData = Bpsim2Factory.eINSTANCE.createBPSimData();
			Scenario scenario = Bpsim2Factory.eINSTANCE.createScenario();
			scenario.setId("Scenario_01");
			scenario.setName("Scenario_01");
			
			TreeIterator<EObject> iterator = bpmnRes.getAllContents();
			while (iterator.hasNext()) {
				EObject eo = iterator.next();
				if(eo instanceof StartEvent) {
					StartEvent startEvent = (StartEvent)eo;
					ElementParametersType ept = Bpsim2Factory.eINSTANCE.createElementParametersType();
					//ept.setId(startEvent.getId()+"_param");
					ept.setId(startEvent.getName().replaceAll(" ", "_")+"_param");
					ept.setBpmnElementRef(startEvent);
					ControlParameters cp = Bpsim2Factory.eINSTANCE.createControlParameters();
					ept.setControlParameters(cp);
					Parameter p =Bpsim2Factory.eINSTANCE.createParameter();
					NumericParameterType npt = Bpsim2Factory.eINSTANCE.createNumericParameterType();
					npt.setValue(1);
					p.getParameterValue().add(npt);
					cp.setTriggerCount(p);
					//ept.getControlParameters().getInterTriggerTimer().getParameterValue();
					//ept.getControlParameters().setInterTriggerTimer();
					scenario.getElementParameters().add(ept);
				}
			}
			dr.getBPSimData().getScenario().add(scenario);
			bpsimRes.getContents().add(dr);
			bpsimRes.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
