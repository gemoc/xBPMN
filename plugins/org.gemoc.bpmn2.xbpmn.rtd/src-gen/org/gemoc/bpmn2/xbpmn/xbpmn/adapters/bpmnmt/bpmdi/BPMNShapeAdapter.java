package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNShape;

@SuppressWarnings("all")
public class BPMNShapeAdapter extends EObjectAdapter<BPMNShape> implements org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public BPMNShapeAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isIsHorizontal() {
    return adaptee.isIsHorizontal();
  }
  
  @Override
  public void setIsHorizontal(final boolean o) {
    adaptee.setIsHorizontal(o);
  }
  
  @Override
  public boolean isIsExpanded() {
    return adaptee.isIsExpanded();
  }
  
  @Override
  public void setIsExpanded(final boolean o) {
    adaptee.setIsExpanded(o);
  }
  
  @Override
  public boolean isIsMarkerVisible() {
    return adaptee.isIsMarkerVisible();
  }
  
  @Override
  public void setIsMarkerVisible(final boolean o) {
    adaptee.setIsMarkerVisible(o);
  }
  
  @Override
  public boolean isIsMessageVisible() {
    return adaptee.isIsMessageVisible();
  }
  
  @Override
  public void setIsMessageVisible(final boolean o) {
    adaptee.setIsMessageVisible(o);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind getParticipantBandKind() {
    return org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind.get(adaptee.getParticipantBandKind().getValue());
  }
  
  @Override
  public void setParticipantBandKind(final org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind o) {
    adaptee.setParticipantBandKind(org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.ParticipantBandKind.get(o.getValue()));
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
  public org.obeonetwork.dsl.bpmn2.BaseElement getBpmnElement() {
    return () adaptersFactory.createAdapter(adaptee.getBpmnElement(), eResource);
  }
  
  @Override
  public void setBpmnElement(final org.obeonetwork.dsl.bpmn2.BaseElement o) {
    if (o != null)
    	adaptee.setBpmnElement(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) o).getAdaptee());
    else adaptee.setBpmnElement(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel getLabel() {
    return () adaptersFactory.createAdapter(adaptee.getLabel(), eResource);
  }
  
  @Override
  public void setLabel(final org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel o) {
    if (o != null)
    	adaptee.setLabel(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelAdapter) o).getAdaptee());
    else adaptee.setLabel(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape getChoreographyActivityShape() {
    return () adaptersFactory.createAdapter(adaptee.getChoreographyActivityShape(), eResource);
  }
  
  @Override
  public void setChoreographyActivityShape(final org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape o) {
    if (o != null)
    	adaptee.setChoreographyActivityShape(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNShapeAdapter) o).getAdaptee());
    else adaptee.setChoreographyActivityShape(null);
  }
  
  protected static final boolean IS_HORIZONTAL_EDEFAULT = false;
  
  protected static final boolean IS_EXPANDED_EDEFAULT = false;
  
  protected static final boolean IS_MARKER_VISIBLE_EDEFAULT = false;
  
  protected static final boolean IS_MESSAGE_VISIBLE_EDEFAULT = false;
  
  protected static final org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind PARTICIPANT_BAND_KIND_EDEFAULT = org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind.TOP_INITIATING;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.eINSTANCE.getBPMNShape();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__MODEL_ELEMENT:
    		return getModelElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__STYLE:
    		return getStyle();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__BOUNDS:
    		return getBounds();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNED_LABEL:
    		return getOwnedLabel();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT:
    		return getBpmnElement();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL:
    		return isIsHorizontal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED:
    		return isIsExpanded() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
    		return isIsMarkerVisible() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__LABEL:
    		return getLabel();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
    		return isIsMessageVisible() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
    		return getParticipantBandKind();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
    		return getChoreographyActivityShape();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__STYLE:
    		return getStyle() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__BOUNDS:
    		return getBounds() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__OWNED_LABEL:
    		return getOwnedLabel() != null && !getOwnedLabel().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT:
    		return getBpmnElement() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL:
    		return isIsHorizontal() != IS_HORIZONTAL_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED:
    		return isIsExpanded() != IS_EXPANDED_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
    		return isIsMarkerVisible() != IS_MARKER_VISIBLE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__LABEL:
    		return getLabel() != null;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
    		return isIsMessageVisible() != IS_MESSAGE_VISIBLE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
    		return getParticipantBandKind() != PARTICIPANT_BAND_KIND_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
    		return getChoreographyActivityShape() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__BOUNDS:
    		setBounds(
    		(org.obeonetwork.dsl.dd.dc.Bounds)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT:
    		setBpmnElement(
    		(org.obeonetwork.dsl.bpmn2.BaseElement)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL:
    		setIsHorizontal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED:
    		setIsExpanded(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
    		setIsMarkerVisible(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__LABEL:
    		setLabel(
    		(org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
    		setIsMessageVisible(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
    		setParticipantBandKind(
    		(org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
    		setChoreographyActivityShape(
    		(org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
