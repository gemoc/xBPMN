package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Label;

@SuppressWarnings("all")
public class LabelAdapter extends EObjectAdapter<Label> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Label {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public LabelAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Diagram getOwningDiagram() {
    return () adaptersFactory.createAdapter(adaptee.getOwningDiagram(), eResource);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement getOwningElement() {
    return () adaptersFactory.createAdapter(adaptee.getOwningElement(), eResource);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement> */Object ownedElement_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement> */Object getOwnedElement() {
    if (ownedElement_ == null)
    	ownedElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedElement(), adaptersFactory, eResource);
    return ownedElement_;
  }
  
  @Override
  public EObject getModelElement() {
    return adaptee.getModelElement();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Style getStyle() {
    return () adaptersFactory.createAdapter(adaptee.getStyle(), eResource);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Bounds getBounds() {
    return () adaptersFactory.createAdapter(adaptee.getBounds(), eResource);
  }
  
  @Override
  public void setBounds(final org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Bounds o) {
    if (o != null)
    	adaptee.setBounds(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.dc.BoundsAdapter) o).getAdaptee());
    else adaptee.setBounds(null);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.eINSTANCE.getLabel();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__MODEL_ELEMENT:
    		return getModelElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__STYLE:
    		return getStyle();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__BOUNDS:
    		return getBounds();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__STYLE:
    		return getStyle() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__BOUNDS:
    		return getBounds() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABEL__BOUNDS:
    		setBounds(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Bounds)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
