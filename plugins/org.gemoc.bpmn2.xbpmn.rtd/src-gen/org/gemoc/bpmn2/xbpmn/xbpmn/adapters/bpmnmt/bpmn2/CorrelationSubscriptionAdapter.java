package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription;

@SuppressWarnings("all")
public class CorrelationSubscriptionAdapter extends EObjectAdapter<CorrelationSubscription> implements org.obeonetwork.dsl.bpmn2.CorrelationSubscription {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public CorrelationSubscriptionAdapter() {
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
  public org.obeonetwork.dsl.bpmn2.CorrelationKey getCorrelationKeyRef() {
    return () adaptersFactory.createAdapter(adaptee.getCorrelationKeyRef(), eResource);
  }
  
  @Override
  public void setCorrelationKeyRef(final org.obeonetwork.dsl.bpmn2.CorrelationKey o) {
    if (o != null)
    	adaptee.setCorrelationKeyRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationKeyAdapter) o).getAdaptee());
    else adaptee.setCorrelationKeyRef(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding> */Object correlationPropertyBinding_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding> */Object getCorrelationPropertyBinding() {
    if (correlationPropertyBinding_ == null)
    	correlationPropertyBinding_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCorrelationPropertyBinding(), adaptersFactory, eResource);
    return correlationPropertyBinding_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getCorrelationSubscription();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
    		return getCorrelationKeyRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
    		return getCorrelationPropertyBinding();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
    		return getCorrelationKeyRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
    		return getCorrelationPropertyBinding() != null && !getCorrelationPropertyBinding().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
    		setCorrelationKeyRef(
    		(org.obeonetwork.dsl.bpmn2.CorrelationKey)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
    		getCorrelationPropertyBinding().clear();
    		getCorrelationPropertyBinding().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
