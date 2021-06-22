package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputBinding;

@SuppressWarnings("all")
public class InputOutputBindingAdapter extends EObjectAdapter<InputOutputBinding> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputBinding {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public InputOutputBindingAdapter() {
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
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputSet getInputDataRef() {
    return () adaptersFactory.createAdapter(adaptee.getInputDataRef(), eResource);
  }
  
  @Override
  public void setInputDataRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputSet o) {
    if (o != null)
    	adaptee.setInputDataRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.InputSetAdapter) o).getAdaptee());
    else adaptee.setInputDataRef(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.OutputSet getOutputDataRef() {
    return () adaptersFactory.createAdapter(adaptee.getOutputDataRef(), eResource);
  }
  
  @Override
  public void setOutputDataRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.OutputSet o) {
    if (o != null)
    	adaptee.setOutputDataRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.OutputSetAdapter) o).getAdaptee());
    else adaptee.setOutputDataRef(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Operation getOperationRef() {
    return () adaptersFactory.createAdapter(adaptee.getOperationRef(), eResource);
  }
  
  @Override
  public void setOperationRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Operation o) {
    if (o != null)
    	adaptee.setOperationRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.OperationAdapter) o).getAdaptee());
    else adaptee.setOperationRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getInputOutputBinding();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
    		return getInputDataRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
    		return getOutputDataRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
    		return getOperationRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
    		return getInputDataRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
    		return getOutputDataRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
    		return getOperationRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
    		setInputDataRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputSet)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
    		setOutputDataRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.OutputSet)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
    		setOperationRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Operation)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
