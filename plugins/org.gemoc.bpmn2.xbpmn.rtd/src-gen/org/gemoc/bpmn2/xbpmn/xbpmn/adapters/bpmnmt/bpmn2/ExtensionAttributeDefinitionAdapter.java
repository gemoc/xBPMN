package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeDefinition;

@SuppressWarnings("all")
public class ExtensionAttributeDefinitionAdapter extends EObjectAdapter<ExtensionAttributeDefinition> implements org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public ExtensionAttributeDefinitionAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
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
  public String getType() {
    return adaptee.getType();
  }
  
  @Override
  public void setType(final String o) {
    adaptee.setType(o);
  }
  
  @Override
  public boolean isIsReference() {
    return adaptee.isIsReference();
  }
  
  @Override
  public void setIsReference(final boolean o) {
    adaptee.setIsReference(o);
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
  public org.obeonetwork.dsl.bpmn2.ExtensionDefinition getExtensionDefinition() {
    return () adaptersFactory.createAdapter(adaptee.getExtensionDefinition(), eResource);
  }
  
  @Override
  public void setExtensionDefinition(final org.obeonetwork.dsl.bpmn2.ExtensionDefinition o) {
    if (o != null)
    	adaptee.setExtensionDefinition(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionDefinitionAdapter) o).getAdaptee());
    else adaptee.setExtensionDefinition(null);
  }
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final String TYPE_EDEFAULT = null;
  
  protected static final boolean IS_REFERENCE_EDEFAULT = false;
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE:
    		return getType();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE:
    		return isIsReference() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
    		return getExtensionDefinition();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE:
    		return isIsReference() != IS_REFERENCE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
    		return getExtensionDefinition() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE:
    		setType(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE:
    		setIsReference(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
    		setExtensionDefinition(
    		(org.obeonetwork.dsl.bpmn2.ExtensionDefinition)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
