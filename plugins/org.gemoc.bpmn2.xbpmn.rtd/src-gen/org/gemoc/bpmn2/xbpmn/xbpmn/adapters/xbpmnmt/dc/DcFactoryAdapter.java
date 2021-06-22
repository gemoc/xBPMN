package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.dc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.DcFactory;

@SuppressWarnings("all")
public class DcFactoryAdapter extends EFactoryImpl implements org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcFactory {
  private XBPMNMTAdaptersFactory adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  
  private DcFactory dcAdaptee = org.gemoc.bpmn2.xbpmn.xbpmn.dc.DcFactory.eINSTANCE;
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Font createFont() {
    return adaptersFactory.createFontAdapter(dcAdaptee.createFont(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Point createPoint() {
    return adaptersFactory.createPointAdapter(dcAdaptee.createPoint(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Bounds createBounds() {
    return adaptersFactory.createBoundsAdapter(dcAdaptee.createBounds(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getDcPackage();
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage getDcPackage() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.eINSTANCE;
  }
}
