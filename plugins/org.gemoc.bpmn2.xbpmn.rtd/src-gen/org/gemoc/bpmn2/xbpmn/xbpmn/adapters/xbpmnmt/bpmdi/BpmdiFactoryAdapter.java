package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmdi;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiFactory;

@SuppressWarnings("all")
public class BpmdiFactoryAdapter extends EFactoryImpl implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiFactory {
  private XBPMNMTAdaptersFactory adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  
  private BpmdiFactory bpmdiAdaptee = org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiFactory.eINSTANCE;
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNPlane createBPMNPlane() {
    return adaptersFactory.createBPMNPlaneAdapter(bpmdiAdaptee.createBPMNPlane(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNShape createBPMNShape() {
    return adaptersFactory.createBPMNShapeAdapter(bpmdiAdaptee.createBPMNShape(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabel createBPMNLabel() {
    return adaptersFactory.createBPMNLabelAdapter(bpmdiAdaptee.createBPMNLabel(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabelStyle createBPMNLabelStyle() {
    return adaptersFactory.createBPMNLabelStyleAdapter(bpmdiAdaptee.createBPMNLabelStyle(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNEdge createBPMNEdge() {
    return adaptersFactory.createBPMNEdgeAdapter(bpmdiAdaptee.createBPMNEdge(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNDiagram createBPMNDiagram() {
    return adaptersFactory.createBPMNDiagramAdapter(bpmdiAdaptee.createBPMNDiagram(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getBpmdiPackage();
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage getBpmdiPackage() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.eINSTANCE;
  }
}
