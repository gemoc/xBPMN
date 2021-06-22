package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalBusinessRuleTask;

@SuppressWarnings("all")
public class GlobalBusinessRuleTaskAdapter extends EObjectAdapter<GlobalBusinessRuleTask> implements org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public GlobalBusinessRuleTaskAdapter() {
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
  public String getDescription() {
    return adaptee.getDescription();
  }
  
  @Override
  public void setDescription(final String o) {
    adaptee.setDescription(o);
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
  public String getImplementation() {
    return adaptee.getImplementation();
  }
  
  @Override
  public void setImplementation(final String o) {
    adaptee.setImplementation(o);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ExtensionDefinition> */Object extensionDefinitions_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ExtensionDefinition> */Object getExtensionDefinitions() {
    if (extensionDefinitions_ == null)
    	extensionDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionDefinitions(), adaptersFactory, eResource);
    return extensionDefinitions_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue> */Object extensionValues_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue> */Object getExtensionValues() {
    if (extensionValues_ == null)
    	extensionValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionValues(), adaptersFactory, eResource);
    return extensionValues_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Documentation> */Object documentation_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Documentation> */Object getDocumentation() {
    if (documentation_ == null)
    	documentation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDocumentation(), adaptersFactory, eResource);
    return documentation_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.InputOutputSpecification getIoSpecification() {
    return () adaptersFactory.createAdapter(adaptee.getIoSpecification(), eResource);
  }
  
  @Override
  public void setIoSpecification(final org.obeonetwork.dsl.bpmn2.InputOutputSpecification o) {
    if (o != null)
    	adaptee.setIoSpecification(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputSpecificationAdapter) o).getAdaptee());
    else adaptee.setIoSpecification(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Interface> */Object supportedInterfaceRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Interface> */Object getSupportedInterfaceRefs() {
    if (supportedInterfaceRefs_ == null)
    	supportedInterfaceRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSupportedInterfaceRefs(), adaptersFactory, eResource);
    return supportedInterfaceRefs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.InputOutputBinding> */Object ioBinding_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.InputOutputBinding> */Object getIoBinding() {
    if (ioBinding_ == null)
    	ioBinding_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIoBinding(), adaptersFactory, eResource);
    return ioBinding_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ResourceRole> */Object resources_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ResourceRole> */Object getResources() {
    if (resources_ == null)
    	resources_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getResources(), adaptersFactory, eResource);
    return resources_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final String IMPLEMENTATION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getGlobalBusinessRuleTask();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IO_SPECIFICATION:
    		return getIoSpecification();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__SUPPORTED_INTERFACE_REFS:
    		return getSupportedInterfaceRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IO_BINDING:
    		return getIoBinding();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__RESOURCES:
    		return getResources();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IMPLEMENTATION:
    		return getImplementation();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IO_SPECIFICATION:
    		return getIoSpecification() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__SUPPORTED_INTERFACE_REFS:
    		return getSupportedInterfaceRefs() != null && !getSupportedInterfaceRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IO_BINDING:
    		return getIoBinding() != null && !getIoBinding().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__RESOURCES:
    		return getResources() != null && !getResources().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IMPLEMENTATION:
    		return getImplementation() != IMPLEMENTATION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IO_SPECIFICATION:
    		setIoSpecification(
    		(org.obeonetwork.dsl.bpmn2.InputOutputSpecification)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__SUPPORTED_INTERFACE_REFS:
    		getSupportedInterfaceRefs().clear();
    		getSupportedInterfaceRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IO_BINDING:
    		getIoBinding().clear();
    		getIoBinding().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__RESOURCES:
    		getResources().clear();
    		getResources().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK__IMPLEMENTATION:
    		setImplementation(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
