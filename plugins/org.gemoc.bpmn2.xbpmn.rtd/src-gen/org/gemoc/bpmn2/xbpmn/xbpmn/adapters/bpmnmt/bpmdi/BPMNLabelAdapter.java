package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabel;

@SuppressWarnings("all")
public class BPMNLabelAdapter extends EObjectAdapter<BPMNLabel> implements org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public BPMNLabelAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.Diagram getOwningDiagram() {
    return () adaptersFactory.createAdapter(adaptee.getOwningDiagram(), eResource);
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.DiagramElement getOwningElement() {
    return () adaptersFactory.createAdapter(adaptee.getOwningElement(), eResource);
  }
  
  private /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object ownedElement_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object getOwnedElement() {
    if (ownedElement_ == null)
    	ownedElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedElement(), adaptersFactory, eResource);
    return ownedElement_;
  }
  
  @Override
  public EObject getModelElement() {
    return adaptee.getModelElement();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.Style getStyle() {
    return () adaptersFactory.createAdapter(adaptee.getStyle(), eResource);
  }
  
  @Override
  public org.obeonetwork.dsl.dd.dc.Bounds getBounds() {
    return () adaptersFactory.createAdapter(adaptee.getBounds(), eResource);
  }
  
  @Override
  public void setBounds(final org.obeonetwork.dsl.dd.dc.Bounds o) {
    if (o != null)
    	adaptee.setBounds(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.BoundsAdapter) o).getAdaptee());
    else adaptee.setBounds(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle getLabelStyle() {
    return () adaptersFactory.createAdapter(adaptee.getLabelStyle(), eResource);
  }
  
  @Override
  public void setLabelStyle(final org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle o) {
    if (o != null)
    	adaptee.setLabelStyle(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelStyleAdapter) o).getAdaptee());
    else adaptee.setLabelStyle(null);
  }
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.eINSTANCE.getBPMNLabel();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__MODEL_ELEMENT:
    		return getModelElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__STYLE:
    		return getStyle();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__BOUNDS:
    		return getBounds();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__LABEL_STYLE:
    		return getLabelStyle();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__STYLE:
    		return getStyle() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__BOUNDS:
    		return getBounds() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__LABEL_STYLE:
    		return getLabelStyle() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__BOUNDS:
    		setBounds(
    		(org.obeonetwork.dsl.dd.dc.Bounds)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_LABEL__LABEL_STYLE:
    		setLabelStyle(
    		(org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
