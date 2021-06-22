package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.bpmn2.bpmn.BPMNMT;

@SuppressWarnings("all")
public class XBPMNAdapter extends ResourceAdapter implements BPMNMT {
  public XBPMNAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Bpmn2Factory getBpmn2Factory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.Bpmn2FactoryAdapter();
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiFactory getBpmnDiFactory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BpmnDiFactoryAdapter();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.DiFactory getDiFactory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiFactoryAdapter();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.dc.DcFactory getDcFactory() {
    return new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.DcFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getBpmn2Factory());
    res.add(getBpmnDiFactory());
    res.add(getDiFactory());
    res.add(getDcFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
