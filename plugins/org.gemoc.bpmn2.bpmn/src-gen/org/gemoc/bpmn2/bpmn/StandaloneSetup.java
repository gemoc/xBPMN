package org.gemoc.bpmn2.bpmn;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.obeonetwork.dsl.bpmn2.Bpmn2Package.eNS_URI,
    	org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.eNS_URI,
    	org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.obeonetwork.dsl.dd.di.DiPackage.eNS_URI,
    	org.obeonetwork.dsl.dd.di.DiPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.obeonetwork.dsl.dd.dc.DcPackage.eNS_URI,
    	org.obeonetwork.dsl.dd.dc.DcPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor bPMN = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.bpmn2.bpmn.BPMN", "", "http://www.omg.org/spec/BPMN/20100524/MODEL-XMI", "org.gemoc.bpmn2.bpmn.BPMNMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.bpmn2.bpmn.BPMN",
    	bPMN
    );
    MelangeRegistry.ModelTypeDescriptor bPMNMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.bpmn2.bpmn.BPMNMT", "", "http://org.gemoc.bpmn2.bpmn.bpmnmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.bpmn2.bpmn.BPMNMT",
    	bPMNMT
    );
  }
}
