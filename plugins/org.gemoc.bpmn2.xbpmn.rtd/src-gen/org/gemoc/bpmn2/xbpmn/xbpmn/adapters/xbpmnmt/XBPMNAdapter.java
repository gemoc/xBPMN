package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.bpmn2.xbpmn.XBPMNMT;

@SuppressWarnings("all")
public class XBPMNAdapter extends ResourceAdapter implements XBPMNMT {
  public XBPMNAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Factory getBpmn2Factory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.Bpmn2FactoryAdapter();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiFactory getDiFactory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di.DiFactoryAdapter();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiFactory getBpmdiFactory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmdi.BpmdiFactoryAdapter();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcFactory getDcFactory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.dc.DcFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getBpmn2Factory());
    res.add(getDiFactory());
    res.add(getBpmdiFactory());
    res.add(getDcFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
