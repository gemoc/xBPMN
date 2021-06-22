package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabelStyle;

@SuppressWarnings("all")
public class BPMNLabelStyleAdapter extends EObjectAdapter<BPMNLabelStyle> implements org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public BPMNLabelStyleAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.dc.Font getFont() {
    return () adaptersFactory.createAdapter(adaptee.getFont(), eResource);
  }
  
  @Override
  public void setFont(final org.obeonetwork.dsl.dd.dc.Font o) {
    if (o != null)
    	adaptee.setFont(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.FontAdapter) o).getAdaptee());
    else adaptee.setFont(null);
  }
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.eINSTANCE.getBPMNLabelStyle();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
    		return getFont();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
    		return getFont() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
    		setFont(
    		(org.obeonetwork.dsl.dd.dc.Font)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
