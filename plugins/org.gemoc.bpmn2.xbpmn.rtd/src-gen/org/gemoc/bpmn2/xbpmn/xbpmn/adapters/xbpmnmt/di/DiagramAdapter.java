package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.di;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Diagram;

@SuppressWarnings("all")
public class DiagramAdapter extends EObjectAdapter<Diagram> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Diagram {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public DiagramAdapter() {
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
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final String DOCUMENTATION_EDEFAULT = null;
  
  protected static final float RESOLUTION_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.eINSTANCE.getDiagram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__RESOLUTION:
    		return new java.lang.Float(getResolution());
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__OWNED_STYLE:
    		return getOwnedStyle();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__ROOT_ELEMENT:
    		return getRootElement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__DOCUMENTATION:
    		return getDocumentation() != DOCUMENTATION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__RESOLUTION:
    		return getResolution() != RESOLUTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__OWNED_STYLE:
    		return getOwnedStyle() != null && !getOwnedStyle().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__ROOT_ELEMENT:
    		return getRootElement() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__DOCUMENTATION:
    		setDocumentation(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage.DIAGRAM__RESOLUTION:
    		setResolution(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}