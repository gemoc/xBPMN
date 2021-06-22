package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationProperty;

@SuppressWarnings("all")
public class CorrelationPropertyAdapter extends EObjectAdapter<CorrelationProperty> implements org.obeonetwork.dsl.bpmn2.CorrelationProperty {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public CorrelationPropertyAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression> */Object correlationPropertyRetrievalExpression_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression> */Object getCorrelationPropertyRetrievalExpression() {
    if (correlationPropertyRetrievalExpression_ == null)
    	correlationPropertyRetrievalExpression_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCorrelationPropertyRetrievalExpression(), adaptersFactory, eResource);
    return correlationPropertyRetrievalExpression_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.ItemDefinition getType() {
    return () adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final org.obeonetwork.dsl.bpmn2.ItemDefinition o) {
    if (o != null)
    	adaptee.setType(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemDefinitionAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getCorrelationProperty();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
    		return getCorrelationPropertyRetrievalExpression();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__TYPE:
    		return getType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
    		return getCorrelationPropertyRetrievalExpression() != null && !getCorrelationPropertyRetrievalExpression().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__TYPE:
    		return getType() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
    		getCorrelationPropertyRetrievalExpression().clear();
    		getCorrelationPropertyRetrievalExpression().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CORRELATION_PROPERTY__TYPE:
    		setType(
    		(org.obeonetwork.dsl.bpmn2.ItemDefinition)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
