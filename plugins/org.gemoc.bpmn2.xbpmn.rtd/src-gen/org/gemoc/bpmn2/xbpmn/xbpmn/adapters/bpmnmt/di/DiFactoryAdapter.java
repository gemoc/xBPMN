package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.DiFactory;

@SuppressWarnings("all")
public class DiFactoryAdapter extends EFactoryImpl implements org.obeonetwork.dsl.dd.di.DiFactory {
  private BPMNMTAdaptersFactory adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  
  private DiFactory diAdaptee = org.gemoc.bpmn2.xbpmn.xbpmn.di.DiFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getDiPackage();
  }
  
  public org.obeonetwork.dsl.dd.di.DiPackage getDiPackage() {
    return org.obeonetwork.dsl.dd.di.DiPackage.eINSTANCE;
  }
}
