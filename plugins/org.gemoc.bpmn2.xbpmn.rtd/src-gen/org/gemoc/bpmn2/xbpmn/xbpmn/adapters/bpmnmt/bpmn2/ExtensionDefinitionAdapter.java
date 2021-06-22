package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionDefinition;

@SuppressWarnings("all")
public class ExtensionDefinitionAdapter extends EObjectAdapter<ExtensionDefinition> implements org.obeonetwork.dsl.bpmn2.ExtensionDefinition {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public ExtensionDefinitionAdapter() {
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
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition> */Object extensionAttributeDefinitions_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition> */Object getExtensionAttributeDefinitions() {
    if (extensionAttributeDefinitions_ == null)
    	extensionAttributeDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionAttributeDefinitions(), adaptersFactory, eResource);
    return extensionAttributeDefinitions_;
  }
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final String ID_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getExtensionDefinition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
    		return getExtensionAttributeDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__ID:
    		return getId();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
    		return getExtensionAttributeDefinitions() != null && !getExtensionAttributeDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__ID:
    		return getId() != ID_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
    		getExtensionAttributeDefinitions().clear();
    		getExtensionAttributeDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.EXTENSION_DEFINITION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
