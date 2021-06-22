package org.gemoc.bpmn2.xbpmn;

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
    	org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package.eNS_URI,
    	org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage.eNS_URI,
    	org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage.eNS_URI,
    	org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.bpmn2.xbpmn.xbpmn.dc.DcPackage.eNS_URI,
    	org.gemoc.bpmn2.xbpmn.xbpmn.dc.DcPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor xBPMN = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.bpmn2.xbpmn.XBPMN", "", "http://org.gemoc.bpmn2.xbpmn.xbpmn/bpmn2/", "org.gemoc.bpmn2.xbpmn.XBPMNMT"
    );
    xBPMN.addAdapter("org.gemoc.bpmn2.bpmn.BPMNMT", org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.XBPMNAdapter.class);
    xBPMN.addAdapter("org.gemoc.bpmn2.xbpmn.XBPMNMT", org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.bpmn2.xbpmn.XBPMN",
    	xBPMN
    );
    MelangeRegistry.ModelTypeDescriptor xBPMNMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.bpmn2.xbpmn.XBPMNMT", "", "http://org.gemoc.bpmn2.xbpmn.xbpmnmt/"
    );
    xBPMNMT.addSuperType("org.gemoc.bpmn2.bpmn.BPMNMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.bpmn2.xbpmn.XBPMNMT",
    	xBPMNMT
    );
  }
}
