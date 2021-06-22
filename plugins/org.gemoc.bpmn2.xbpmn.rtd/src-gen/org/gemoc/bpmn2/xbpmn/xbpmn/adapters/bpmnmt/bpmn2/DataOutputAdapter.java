package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutput;

@SuppressWarnings("all")
public class DataOutputAdapter extends EObjectAdapter<DataOutput> implements org.obeonetwork.dsl.bpmn2.DataOutput {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public DataOutputAdapter() {
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
  public boolean isIsCollection() {
    return adaptee.isIsCollection();
  }
  
  @Override
  public void setIsCollection(final boolean o) {
    adaptee.setIsCollection(o);
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object outputSetWithOptional_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object getOutputSetWithOptional() {
    if (outputSetWithOptional_ == null)
    	outputSetWithOptional_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputSetWithOptional(), adaptersFactory, eResource);
    return outputSetWithOptional_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object outputSetWithWhileExecuting_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object getOutputSetWithWhileExecuting() {
    if (outputSetWithWhileExecuting_ == null)
    	outputSetWithWhileExecuting_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputSetWithWhileExecuting(), adaptersFactory, eResource);
    return outputSetWithWhileExecuting_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object outputSetRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.OutputSet> */Object getOutputSetRefs() {
    if (outputSetRefs_ == null)
    	outputSetRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputSetRefs(), adaptersFactory, eResource);
    return outputSetRefs_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final boolean IS_COLLECTION_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getDataOutput();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__ITEM_SUBJECT_REF:
    		return getItemSubjectRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DATA_STATE:
    		return getDataState();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__IS_COLLECTION:
    		return isIsCollection() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
    		return getOutputSetWithOptional();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
    		return getOutputSetWithWhileExecuting();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
    		return getOutputSetRefs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__ITEM_SUBJECT_REF:
    		return getItemSubjectRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DATA_STATE:
    		return getDataState() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__IS_COLLECTION:
    		return isIsCollection() != IS_COLLECTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
    		return getOutputSetWithOptional() != null && !getOutputSetWithOptional().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
    		return getOutputSetWithWhileExecuting() != null && !getOutputSetWithWhileExecuting().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
    		return getOutputSetRefs() != null && !getOutputSetRefs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__ITEM_SUBJECT_REF:
    		setItemSubjectRef(
    		(org.obeonetwork.dsl.bpmn2.ItemDefinition)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__DATA_STATE:
    		setDataState(
    		(org.obeonetwork.dsl.bpmn2.DataState)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__IS_COLLECTION:
    		setIsCollection(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
    		getOutputSetWithOptional().clear();
    		getOutputSetWithOptional().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
    		getOutputSetWithWhileExecuting().clear();
    		getOutputSetWithWhileExecuting().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
    		getOutputSetRefs().clear();
    		getOutputSetRefs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
