package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.DiFactory;

@SuppressWarnings("all")
public class DiFactoryAdapter extends EFactoryImpl implements org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiFactory {
  private XBPMNMTAdaptersFactory adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  
  private DiFactory diAdaptee = org.gemoc.bpmn2.xbpmn.xbpmn.di.DiFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getDiPackage();
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage getDiPackage() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.eINSTANCE;
  }
}
