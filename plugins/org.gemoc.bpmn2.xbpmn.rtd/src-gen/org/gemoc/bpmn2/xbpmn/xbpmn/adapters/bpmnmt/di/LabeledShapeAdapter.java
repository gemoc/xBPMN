package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.LabeledShape;

@SuppressWarnings("all")
public class LabeledShapeAdapter extends EObjectAdapter<LabeledShape> implements org.obeonetwork.dsl.dd.di.LabeledShape {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public LabeledShapeAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.dd.di.Label> */Object ownedLabel_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.dd.di.Label> */Object getOwnedLabel() {
    if (ownedLabel_ == null)
    	ownedLabel_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedLabel(), adaptersFactory, eResource);
    return ownedLabel_;
  }
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.dd.di.DiPackage.eINSTANCE.getLabeledShape();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__MODEL_ELEMENT:
    		return getModelElement();
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__STYLE:
    		return getStyle();
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__BOUNDS:
    		return getBounds();
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNED_LABEL:
    		return getOwnedLabel();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__STYLE:
    		return getStyle() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__BOUNDS:
    		return getBounds() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__OWNED_LABEL:
    		return getOwnedLabel() != null && !getOwnedLabel().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.di.DiPackage.LABELED_SHAPE__BOUNDS:
    		setBounds(
    		(org.obeonetwork.dsl.dd.dc.Bounds)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
