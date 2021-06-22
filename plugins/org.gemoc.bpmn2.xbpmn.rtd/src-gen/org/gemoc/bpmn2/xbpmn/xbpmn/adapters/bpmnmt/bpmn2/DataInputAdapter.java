package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput;

@SuppressWarnings("all")
public class DataInputAdapter extends EObjectAdapter<DataInput> implements org.obeonetwork.dsl.bpmn2.DataInput {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public DataInputAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object inputSetWithOptional_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object getInputSetWithOptional() {
    if (inputSetWithOptional_ == null)
    	inputSetWithOptional_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputSetWithOptional(), adaptersFactory, eResource);
    return inputSetWithOptional_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object inputSetWithWhileExecuting_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object getInputSetWithWhileExecuting() {
    if (inputSetWithWhileExecuting_ == null)
    	inputSetWithWhileExecuting_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputSetWithWhileExecuting(), adaptersFactory, eResource);
    return inputSetWithWhileExecuting_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object inputSetRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.InputSet> */Object getInputSetRefs() {
    if (inputSetRefs_ == null)
    	inputSetRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputSetRefs(), adaptersFactory, eResource);
    return inputSetRefs_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final boolean IS_COLLECTION_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getDataInput();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__ITEM_SUBJECT_REF:
    		return getItemSubjectRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DATA_STATE:
    		return getDataState();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__IS_COLLECTION:
    		return isIsCollection() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
    		return getInputSetWithOptional();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
    		return getInputSetWithWhileExecuting();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
    		return getInputSetRefs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__ITEM_SUBJECT_REF:
    		return getItemSubjectRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DATA_STATE:
    		return getDataState() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__IS_COLLECTION:
    		return isIsCollection() != IS_COLLECTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
    		return getInputSetWithOptional() != null && !getInputSetWithOptional().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
    		return getInputSetWithWhileExecuting() != null && !getInputSetWithWhileExecuting().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
    		return getInputSetRefs() != null && !getInputSetRefs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__ITEM_SUBJECT_REF:
    		setItemSubjectRef(
    		(org.obeonetwork.dsl.bpmn2.ItemDefinition)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__DATA_STATE:
    		setDataState(
    		(org.obeonetwork.dsl.bpmn2.DataState)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__IS_COLLECTION:
    		setIsCollection(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
    		getInputSetWithOptional().clear();
    		getInputSetWithOptional().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
    		getInputSetWithWhileExecuting().clear();
    		getInputSetWithWhileExecuting().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
    		getInputSetRefs().clear();
    		getInputSetRefs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
