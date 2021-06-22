package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmdi;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge;

@SuppressWarnings("all")
public class BPMNEdgeAdapter extends EObjectAdapter<BPMNEdge> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNEdge {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public BPMNEdgeAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.MessageVisibleKind getMessageVisibleKind() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.MessageVisibleKind.get(adaptee.getMessageVisibleKind().getValue());
  }
  
  @Override
  public void setMessageVisibleKind(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.MessageVisibleKind o) {
    adaptee.setMessageVisibleKind(org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.MessageVisibleKind.get(o.getValue()));
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
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement getSource() {
    return () adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement getTarget() {
    return () adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Point> */Object waypoint_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Point> */Object getWaypoint() {
    if (waypoint_ == null)
    	waypoint_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getWaypoint(), adaptersFactory, eResource);
    return waypoint_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Label> */Object ownedLabel_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Label> */Object getOwnedLabel() {
    if (ownedLabel_ == null)
    	ownedLabel_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedLabel(), adaptersFactory, eResource);
    return ownedLabel_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabel getLabel() {
    return () adaptersFactory.createAdapter(adaptee.getLabel(), eResource);
  }
  
  @Override
  public void setLabel(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabel o) {
    if (o != null)
    	adaptee.setLabel(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmdi.BPMNLabelAdapter) o).getAdaptee());
    else adaptee.setLabel(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BaseElement getBpmnElement() {
    return () adaptersFactory.createAdapter(adaptee.getBpmnElement(), eResource);
  }
  
  @Override
  public void setBpmnElement(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BaseElement o) {
    if (o != null)
    	adaptee.setBpmnElement(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.BaseElementAdapter) o).getAdaptee());
    else adaptee.setBpmnElement(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement getSourceElement() {
    return () adaptersFactory.createAdapter(adaptee.getSourceElement(), eResource);
  }
  
  @Override
  public void setSourceElement(final org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement o) {
    if (o != null)
    	adaptee.setSourceElement(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di.DiagramElementAdapter) o).getAdaptee());
    else adaptee.setSourceElement(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement getTargetElement() {
    return () adaptersFactory.createAdapter(adaptee.getTargetElement(), eResource);
  }
  
  @Override
  public void setTargetElement(final org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement o) {
    if (o != null)
    	adaptee.setTargetElement(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di.DiagramElementAdapter) o).getAdaptee());
    else adaptee.setTargetElement(null);
  }
  
  protected static final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.MessageVisibleKind MESSAGE_VISIBLE_KIND_EDEFAULT = org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.MessageVisibleKind.INITIATING;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.eINSTANCE.getBPMNEdge();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__MODEL_ELEMENT:
    		return getModelElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__STYLE:
    		return getStyle();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__SOURCE:
    		return getSource();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__TARGET:
    		return getTarget();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__WAYPOINT:
    		return getWaypoint();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNED_LABEL:
    		return getOwnedLabel();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__LABEL:
    		return getLabel();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__BPMN_ELEMENT:
    		return getBpmnElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__SOURCE_ELEMENT:
    		return getSourceElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__TARGET_ELEMENT:
    		return getTargetElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND:
    		return getMessageVisibleKind();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__STYLE:
    		return getStyle() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__SOURCE:
    		return getSource() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__TARGET:
    		return getTarget() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__WAYPOINT:
    		return getWaypoint() != null && !getWaypoint().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__OWNED_LABEL:
    		return getOwnedLabel() != null && !getOwnedLabel().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__LABEL:
    		return getLabel() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__BPMN_ELEMENT:
    		return getBpmnElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__SOURCE_ELEMENT:
    		return getSourceElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__TARGET_ELEMENT:
    		return getTargetElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND:
    		return getMessageVisibleKind() != MESSAGE_VISIBLE_KIND_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__WAYPOINT:
    		getWaypoint().clear();
    		getWaypoint().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__LABEL:
    		setLabel(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabel)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__BPMN_ELEMENT:
    		setBpmnElement(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BaseElement)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__SOURCE_ELEMENT:
    		setSourceElement(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__TARGET_ELEMENT:
    		setTargetElement(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND:
    		setMessageVisibleKind(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.MessageVisibleKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
