package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeValue;

@SuppressWarnings("all")
public class ExtensionAttributeValueAdapter extends EObjectAdapter<ExtensionAttributeValue> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public ExtensionAttributeValueAdapter() {
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
  public EObject getValueRef() {
    return adaptee.getValueRef();
  }
  
  @Override
  public void setValueRef(final EObject o) {
    if (o != null)
    	adaptee.setValueRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.ecore.EObjectAdapter) o).getAdaptee());
    else adaptee.setValueRef(null);
  }
  
  @Override
  public EObject getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final EObject o) {
    if (o != null)
    	adaptee.setValue(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.ecore.EObjectAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeDefinition getExtensionAttributeDefinition() {
    return () adaptersFactory.createAdapter(adaptee.getExtensionAttributeDefinition(), eResource);
  }
  
  @Override
  public void setExtensionAttributeDefinition(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeDefinition o) {
    if (o != null)
    	adaptee.setExtensionAttributeDefinition(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ExtensionAttributeDefinitionAdapter) o).getAdaptee());
    else adaptee.setExtensionAttributeDefinition(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getExtensionAttributeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
    		return getValueRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
    		return getValue();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
    		return getExtensionAttributeDefinition();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
    		return getValueRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
    		return getValue() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
    		return getExtensionAttributeDefinition() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
    		setValueRef(
    		(org.eclipse.emf.ecore.EObject)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
    		setValue(
    		(org.eclipse.emf.ecore.EObject)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
    		setExtensionAttributeDefinition(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeDefinition)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
