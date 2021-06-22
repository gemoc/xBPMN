package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.LabeledEdge;

@SuppressWarnings("all")
public class LabeledEdgeAdapter extends EObjectAdapter<LabeledEdge> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.di.LabeledEdge {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public LabeledEdgeAdapter() {
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
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.eINSTANCE.getLabeledEdge();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__MODEL_ELEMENT:
    		return getModelElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__STYLE:
    		return getStyle();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__SOURCE:
    		return getSource();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__TARGET:
    		return getTarget();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__WAYPOINT:
    		return getWaypoint();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNED_LABEL:
    		return getOwnedLabel();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__STYLE:
    		return getStyle() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__SOURCE:
    		return getSource() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__TARGET:
    		return getTarget() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__WAYPOINT:
    		return getWaypoint() != null && !getWaypoint().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__OWNED_LABEL:
    		return getOwnedLabel() != null && !getOwnedLabel().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.LABELED_EDGE__WAYPOINT:
    		getWaypoint().clear();
    		getWaypoint().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
