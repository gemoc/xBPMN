package org.gemoc.bpmn2.xbpmn;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.bpmn2.bpmn.BPMNMT;
import org.gemoc.bpmn2.xbpmn.XBPMNMT;

@SuppressWarnings("all")
public class XBPMN implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XBPMN load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XBPMN mm = new XBPMN();
    mm.setResource(res);
    return mm ;
  }
  
  public BPMNMT toBPMNMT() {
    org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.XBPMNAdapter adaptee = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.XBPMNAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XBPMNMT toXBPMNMT() {
    org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNAdapter adaptee = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
