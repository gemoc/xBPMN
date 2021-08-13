package org.gemoc.bpmn2.converter;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.impl.Bpmn2FactoryImpl;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.bpmn2.util.Bpmn2XMIResourceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BPMN2Converter {

	
	public void bpmnTobpmnXmi(String modelPath, String resultModelPath) {
		ResourceFactoryImpl bpmnFactory = new Bpmn2ResourceFactoryImpl();
		
		if(!EPackage.Registry.INSTANCE.containsKey(Bpmn2Package.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(Bpmn2Package.eNS_URI, Bpmn2Package.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("bpmn", bpmnFactory);
		ResourceSet rs = new ResourceSetImpl();
		URI inUri = URI.createURI(modelPath);
		Resource inputModelRes = rs.getResource(inUri, true);
		//rs.getResources()
		try {
			inputModelRes.load(null);
			EcoreUtil.resolveAll(inputModelRes);
			inputModelRes.getContents().forEach( x -> System.out.println(x)  );
			
			
			ResourceSet outputResourceSet = new ResourceSetImpl();
			URI outUri = URI.createURI(resultModelPath);
			Resource outputModelRes = new Bpmn2XMIResourceImpl(outUri);
			outputResourceSet.getResources().add(outputModelRes);
			ArrayList<EObject> rootElements = new ArrayList<EObject>();
			rootElements.addAll(inputModelRes.getContents());
			rootElements.forEach( x -> outputModelRes.getContents().add(x)  );
			outputModelRes.save(null);
			
			System.out.println(resultModelPath + " saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new BPMN2Converter().bpmnTobpmnXmi("BPMN_model_AP1.bpmn", "BPMN_model_AP1.bpmnxmi");
		
	}

}
