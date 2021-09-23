package org.gemoc.bpmn2.converter;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.SequenceFlow;
import org.eclipse.bpmn2.impl.Bpmn2FactoryImpl;
import org.eclipse.bpmn2.modeler.core.model.Bpmn2ModelerResourceFactoryImpl;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.bpmn2.util.Bpmn2XMIResourceFactoryImpl;
import org.eclipse.bpmn2.util.Bpmn2XMIResourceImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BPMN2Converter {

	public void moveResourceContent(Resource inputModelRes, Resource outputModelRes) {
		ArrayList<EObject> rootElements = new ArrayList<EObject>();
		for (EObject eObject : inputModelRes.getContents()) {
			if(eObject instanceof DocumentRoot) {
				rootElements.add(((DocumentRoot)eObject).getDefinitions());
			}
		}
		//inputModelRes.getContents().forEach(docRoot -> {true });
		//rootElements.addAll(inputModelRes.getContents());
		rootElements.forEach( x -> outputModelRes.getContents().add(x)  );
	}
	
	
	HashMap<EObject, EObject> clonedEObjectsMap = new HashMap<EObject, EObject>();
	public void cloneResource( Resource inputModelRes, Resource outputModelRes) {
		
//		for (TreeIterator<Object> iterator = EcoreUtil.getAllContents(inputModelRes, true); iterator.hasNext();) {
//			Object o = iterator.next();
//			if (o instanceof SequenceFlow) {
//				//EcoreUtil.CrossReferencer.
//				SequenceFlow sf = (SequenceFlow) o;
//				//sf.eAdapters().get(0).
//				sf.getSourceRef();
//				//sf.eCrossReferences()
//				sf.getTargetRef();
//			}
//		}
		for (EObject objectToClone : inputModelRes.getContents()) {
			//this.cloneEObject(objectToClone);
			if(objectToClone instanceof DocumentRoot) {
				outputModelRes.getContents().add(
					EcoreUtil.copy(((DocumentRoot)objectToClone).getDefinitions()));
					//	this.cloneEObject(((DocumentRoot)objectToClone).getDefinitions()));
			}
		}
	}
	
	public EObject cloneEObject(EObject objectToClone) {
		
		return EcoreUtil.copy(objectToClone);
	}
	
	public void bpmnXsdTobpmnXmi(String modelPath, String resultModelPath) {
		//ResourceFactoryImpl bpmnFactory = new Bpmn2ResourceFactoryImpl();
		//ResourceFactoryImpl bpmnFactory = new Bpmn2XMIResourceFactoryImpl();
		ResourceFactoryImpl bpmnFactory = new Bpmn2ModelerResourceFactoryImpl();
		
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
			
			ArrayList<EObject> allElements = new ArrayList<EObject>();
			inputModelRes.getAllContents().forEachRemaining(x -> allElements.add(x));
			Map<EObject, Collection<Setting>> f = EcoreUtil.CrossReferencer.find(allElements);
			
			
			inputModelRes.getContents().forEach( x -> System.out.println(x)  );
			
			
			ResourceSet outputResourceSet = new ResourceSetImpl();
			URI outUri = URI.createURI(resultModelPath);
			Resource outputModelRes = new Bpmn2XMIResourceImpl(outUri);
			outputResourceSet.getResources().add(outputModelRes);
			
			
			
			this.cloneResource(inputModelRes, outputModelRes);
			// remove teh diagram
			for(EObject eo : outputModelRes.getContents()) {
				if(eo instanceof Definitions) {
					Definitions d = (Definitions)eo;
					d.getDiagrams().clear();
				}
			}
			
			outputModelRes.save(null);
			
			System.out.println(resultModelPath + " saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new BPMN2Converter().bpmnXsdTobpmnXmi("BPMN_model_AP1.bpmn", "BPMN_model_AP1.bpmn_model");
		
	}

}
