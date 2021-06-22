package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.DcFactory;

@SuppressWarnings("all")
public class DcFactoryAdapter extends EFactoryImpl implements org.obeonetwork.dsl.dd.dc.DcFactory {
  private BPMNMTAdaptersFactory adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  
  private DcFactory dcAdaptee = org.gemoc.bpmn2.xbpmn.xbpmn.dc.DcFactory.eINSTANCE;
  
  @Override
  public org.obeonetwork.dsl.dd.dc.Font createFont() {
    return adaptersFactory.createFontAdapter(dcAdaptee.createFont(), null);
  }
  
  @Override
  public org.obeonetwork.dsl.dd.dc.Point createPoint() {
    return adaptersFactory.createPointAdapter(dcAdaptee.createPoint(), null);
  }
  
  @Override
  public org.obeonetwork.dsl.dd.dc.Bounds createBounds() {
    return adaptersFactory.createBoundsAdapter(dcAdaptee.createBounds(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getDcPackage();
  }
  
  public org.obeonetwork.dsl.dd.dc.DcPackage getDcPackage() {
    return org.obeonetwork.dsl.dd.dc.DcPackage.eINSTANCE;
  }
}
