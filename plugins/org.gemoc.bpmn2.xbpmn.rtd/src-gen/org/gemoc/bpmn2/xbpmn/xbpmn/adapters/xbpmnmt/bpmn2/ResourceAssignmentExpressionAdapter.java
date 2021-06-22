package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceAssignmentExpression;

@SuppressWarnings("all")
public class ResourceAssignmentExpressionAdapter extends EObjectAdapter<ResourceAssignmentExpression> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceAssignmentExpression {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public ResourceAssignmentExpressionAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression getExpression() {
    return () adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getResourceAssignmentExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
    		return getExpression();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
    		return getExpression() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
    		setExpression(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
