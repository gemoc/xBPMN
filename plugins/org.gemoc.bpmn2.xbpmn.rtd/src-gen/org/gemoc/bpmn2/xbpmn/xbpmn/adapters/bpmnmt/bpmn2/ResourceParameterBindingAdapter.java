package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceParameterBinding;

@SuppressWarnings("all")
public class ResourceParameterBindingAdapter extends EObjectAdapter<ResourceParameterBinding> implements org.obeonetwork.dsl.bpmn2.ResourceParameterBinding {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public ResourceParameterBindingAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
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
  public org.obeonetwork.dsl.bpmn2.Expression getExpression() {
    return () adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final org.obeonetwork.dsl.bpmn2.Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.ResourceParameter getParameterRef() {
    return () adaptersFactory.createAdapter(adaptee.getParameterRef(), eResource);
  }
  
  @Override
  public void setParameterRef(final org.obeonetwork.dsl.bpmn2.ResourceParameter o) {
    if (o != null)
    	adaptee.setParameterRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterAdapter) o).getAdaptee());
    else adaptee.setParameterRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getResourceParameterBinding();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
    		return getExpression();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
    		return getParameterRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
    		return getExpression() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
    		return getParameterRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
    		setExpression(
    		(org.obeonetwork.dsl.bpmn2.Expression)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
    		setParameterRef(
    		(org.obeonetwork.dsl.bpmn2.ResourceParameter)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
