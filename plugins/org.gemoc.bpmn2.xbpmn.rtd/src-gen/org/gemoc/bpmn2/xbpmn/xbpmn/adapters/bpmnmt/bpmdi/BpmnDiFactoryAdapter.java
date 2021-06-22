package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiFactory;

@SuppressWarnings("all")
public class BpmnDiFactoryAdapter extends EFactoryImpl implements org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiFactory {
  private BPMNMTAdaptersFactory adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  
  private BpmdiFactory bpmdiAdaptee = org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiFactory.eINSTANCE;
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNPlane createBPMNPlane() {
    return adaptersFactory.createBPMNPlaneAdapter(bpmdiAdaptee.createBPMNPlane(), null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape createBPMNShape() {
    return adaptersFactory.createBPMNShapeAdapter(bpmdiAdaptee.createBPMNShape(), null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel createBPMNLabel() {
    return adaptersFactory.createBPMNLabelAdapter(bpmdiAdaptee.createBPMNLabel(), null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle createBPMNLabelStyle() {
    return adaptersFactory.createBPMNLabelStyleAdapter(bpmdiAdaptee.createBPMNLabelStyle(), null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNEdge createBPMNEdge() {
    return adaptersFactory.createBPMNEdgeAdapter(bpmdiAdaptee.createBPMNEdge(), null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNDiagram createBPMNDiagram() {
    return adaptersFactory.createBPMNDiagramAdapter(bpmdiAdaptee.createBPMNDiagram(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getBpmnDiPackage();
  }
  
  public org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage getBpmnDiPackage() {
    return org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.eINSTANCE;
  }
}
