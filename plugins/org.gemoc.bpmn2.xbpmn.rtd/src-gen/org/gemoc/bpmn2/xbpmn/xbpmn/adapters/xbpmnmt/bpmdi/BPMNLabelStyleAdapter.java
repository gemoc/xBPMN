package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmdi;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabelStyle;

@SuppressWarnings("all")
public class BPMNLabelStyleAdapter extends EObjectAdapter<BPMNLabelStyle> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabelStyle {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public BPMNLabelStyleAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Font getFont() {
    return () adaptersFactory.createAdapter(adaptee.getFont(), eResource);
  }
  
  @Override
  public void setFont(final org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Font o) {
    if (o != null)
    	adaptee.setFont(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.dc.FontAdapter) o).getAdaptee());
    else adaptee.setFont(null);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.eINSTANCE.getBPMNLabelStyle();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_LABEL_STYLE__FONT:
    		return getFont();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_LABEL_STYLE__FONT:
    		return getFont() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_LABEL_STYLE__FONT:
    		setFont(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Font)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
