package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Style;

@SuppressWarnings("all")
public class StyleAdapter extends EObjectAdapter<Style> implements org.obeonetwork.dsl.dd.di.Style {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public StyleAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.dd.di.DiPackage.eINSTANCE.getStyle();
  }
}
