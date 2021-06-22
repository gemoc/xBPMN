package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmdi;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNDiagram;

@SuppressWarnings("all")
public class BPMNDiagramAdapter extends EObjectAdapter<BPMNDiagram> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNDiagram {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public BPMNDiagramAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public String getDocumentation() {
    return adaptee.getDocumentation();
  }
  
  @Override
  public void setDocumentation(final String o) {
    adaptee.setDocumentation(o);
  }
  
  @Override
  public float getResolution() {
    return adaptee.getResolution();
  }
  
  @Override
  public void setResolution(final float o) {
    adaptee.setResolution(o);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Style> */Object ownedStyle_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Style> */Object getOwnedStyle() {
    if (ownedStyle_ == null)
    	ownedStyle_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStyle(), adaptersFactory, eResource);
    return ownedStyle_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiagramElement getRootElement() {
    return () adaptersFactory.createAdapter(adaptee.getRootElement(), eResource);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNPlane getPlane() {
    return () adaptersFactory.createAdapter(adaptee.getPlane(), eResource);
  }
  
  @Override
  public void setPlane(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNPlane o) {
    if (o != null)
    	adaptee.setPlane(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmdi.BPMNPlaneAdapter) o).getAdaptee());
    else adaptee.setPlane(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabelStyle> */Object labelStyle_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabelStyle> */Object getLabelStyle() {
    if (labelStyle_ == null)
    	labelStyle_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLabelStyle(), adaptersFactory, eResource);
    return labelStyle_;
  }
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final String DOCUMENTATION_EDEFAULT = null;
  
  protected static final float RESOLUTION_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.eINSTANCE.getBPMNDiagram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__RESOLUTION:
    		return new java.lang.Float(getResolution());
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__OWNED_STYLE:
    		return getOwnedStyle();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__ROOT_ELEMENT:
    		return getRootElement();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__PLANE:
    		return getPlane();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__LABEL_STYLE:
    		return getLabelStyle();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__DOCUMENTATION:
    		return getDocumentation() != DOCUMENTATION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__RESOLUTION:
    		return getResolution() != RESOLUTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__OWNED_STYLE:
    		return getOwnedStyle() != null && !getOwnedStyle().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__ROOT_ELEMENT:
    		return getRootElement() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__PLANE:
    		return getPlane() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__LABEL_STYLE:
    		return getLabelStyle() != null && !getLabelStyle().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__DOCUMENTATION:
    		setDocumentation(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__RESOLUTION:
    		setResolution(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__PLANE:
    		setPlane(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNPlane)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage.BPMN_DIAGRAM__LABEL_STYLE:
    		getLabelStyle().clear();
    		getLabelStyle().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
