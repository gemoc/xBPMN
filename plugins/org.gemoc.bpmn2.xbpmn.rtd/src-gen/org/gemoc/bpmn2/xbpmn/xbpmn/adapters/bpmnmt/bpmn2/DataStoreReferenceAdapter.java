package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStoreReference;

@SuppressWarnings("all")
public class DataStoreReferenceAdapter extends EObjectAdapter<DataStoreReference> implements org.obeonetwork.dsl.bpmn2.DataStoreReference {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public DataStoreReferenceAdapter() {
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
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Auditing getAuditing() {
    return () adaptersFactory.createAdapter(adaptee.getAuditing(), eResource);
  }
  
  @Override
  public void setAuditing(final org.obeonetwork.dsl.bpmn2.Auditing o) {
    if (o != null)
    	adaptee.setAuditing(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AuditingAdapter) o).getAdaptee());
    else adaptee.setAuditing(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Monitoring getMonitoring() {
    return () adaptersFactory.createAdapter(adaptee.getMonitoring(), eResource);
  }
  
  @Override
  public void setMonitoring(final org.obeonetwork.dsl.bpmn2.Monitoring o) {
    if (o != null)
    	adaptee.setMonitoring(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MonitoringAdapter) o).getAdaptee());
    else adaptee.setMonitoring(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.CategoryValue> */Object categoryValueRef_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.CategoryValue> */Object getCategoryValueRef() {
    if (categoryValueRef_ == null)
    	categoryValueRef_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCategoryValueRef(), adaptersFactory, eResource);
    return categoryValueRef_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.ItemDefinition getItemSubjectRef() {
    return () adaptersFactory.createAdapter(adaptee.getItemSubjectRef(), eResource);
  }
  
  @Override
  public void setItemSubjectRef(final org.obeonetwork.dsl.bpmn2.ItemDefinition o) {
    if (o != null)
    	adaptee.setItemSubjectRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemDefinitionAdapter) o).getAdaptee());
    else adaptee.setItemSubjectRef(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.DataState getDataState() {
    return () adaptersFactory.createAdapter(adaptee.getDataState(), eResource);
  }
  
  @Override
  public void setDataState(final org.obeonetwork.dsl.bpmn2.DataState o) {
    if (o != null)
    	adaptee.setDataState(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStateAdapter) o).getAdaptee());
    else adaptee.setDataState(null);
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.DataStore getDataStoreRef() {
    return () adaptersFactory.createAdapter(adaptee.getDataStoreRef(), eResource);
  }
  
  @Override
  public void setDataStoreRef(final org.obeonetwork.dsl.bpmn2.DataStore o) {
    if (o != null)
    	adaptee.setDataStoreRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreAdapter) o).getAdaptee());
    else adaptee.setDataStoreRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getDataStoreReference();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__AUDITING:
    		return getAuditing();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__MONITORING:
    		return getMonitoring();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
    		return getItemSubjectRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STATE:
    		return getDataState();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STORE_REF:
    		return getDataStoreRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__AUDITING:
    		return getAuditing() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__MONITORING:
    		return getMonitoring() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
    		return getItemSubjectRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STATE:
    		return getDataState() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STORE_REF:
    		return getDataStoreRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__AUDITING:
    		setAuditing(
    		(org.obeonetwork.dsl.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__MONITORING:
    		setMonitoring(
    		(org.obeonetwork.dsl.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
    		setItemSubjectRef(
    		(org.obeonetwork.dsl.bpmn2.ItemDefinition)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STATE:
    		setDataState(
    		(org.obeonetwork.dsl.bpmn2.DataState)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STORE_REF:
    		setDataStoreRef(
    		(org.obeonetwork.dsl.bpmn2.DataStore)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.obeonetwork.dsl.bpmn2.ItemAwareElement.class) {
    	switch (derivedFeatureID) {
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STATE:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.obeonetwork.dsl.bpmn2.ItemAwareElement.class) {
    	switch (baseFeatureID) {
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF;
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_STORE_REFERENCE__DATA_STATE;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}