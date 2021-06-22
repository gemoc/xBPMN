package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.IntermediateThrowEvent;

@SuppressWarnings("all")
public class IntermediateThrowEventAdapter extends EObjectAdapter<IntermediateThrowEvent> implements org.obeonetwork.dsl.bpmn2.IntermediateThrowEvent {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public IntermediateThrowEventAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object outgoing_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object incoming_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.SequenceFlow> */Object getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Lane> */Object lanes_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Lane> */Object getLanes() {
    if (lanes_ == null)
    	lanes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLanes(), adaptersFactory, eResource);
    return lanes_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ConversationLink> */Object incomingConversationLinks_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ConversationLink> */Object getIncomingConversationLinks() {
    if (incomingConversationLinks_ == null)
    	incomingConversationLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingConversationLinks(), adaptersFactory, eResource);
    return incomingConversationLinks_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ConversationLink> */Object outgoingConversationLinks_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ConversationLink> */Object getOutgoingConversationLinks() {
    if (outgoingConversationLinks_ == null)
    	outgoingConversationLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingConversationLinks(), adaptersFactory, eResource);
    return outgoingConversationLinks_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Property> */Object properties_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Property> */Object getProperties() {
    if (properties_ == null)
    	properties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProperties(), adaptersFactory, eResource);
    return properties_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.InputSet getInputSet() {
    return () adaptersFactory.createAdapter(adaptee.getInputSet(), eResource);
  }
  
  @Override
  public void setInputSet(final org.obeonetwork.dsl.bpmn2.InputSet o) {
    if (o != null)
    	adaptee.setInputSet(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputSetAdapter) o).getAdaptee());
    else adaptee.setInputSet(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.EventDefinition> */Object eventDefinitionRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.EventDefinition> */Object getEventDefinitionRefs() {
    if (eventDefinitionRefs_ == null)
    	eventDefinitionRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEventDefinitionRefs(), adaptersFactory, eResource);
    return eventDefinitionRefs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.DataInputAssociation> */Object dataInputAssociation_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.DataInputAssociation> */Object getDataInputAssociation() {
    if (dataInputAssociation_ == null)
    	dataInputAssociation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataInputAssociation(), adaptersFactory, eResource);
    return dataInputAssociation_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object dataInputs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.DataInput> */Object getDataInputs() {
    if (dataInputs_ == null)
    	dataInputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataInputs(), adaptersFactory, eResource);
    return dataInputs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.EventDefinition> */Object eventDefinitions_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.EventDefinition> */Object getEventDefinitions() {
    if (eventDefinitions_ == null)
    	eventDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEventDefinitions(), adaptersFactory, eResource);
    return eventDefinitions_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getIntermediateThrowEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__AUDITING:
    		return getAuditing();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__MONITORING:
    		return getMonitoring();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__OUTGOING:
    		return getOutgoing();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INCOMING:
    		return getIncoming();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__LANES:
    		return getLanes();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__PROPERTIES:
    		return getProperties();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INPUT_SET:
    		return getInputSet();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_REFS:
    		return getEventDefinitionRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION:
    		return getDataInputAssociation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DATA_INPUTS:
    		return getDataInputs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EVENT_DEFINITIONS:
    		return getEventDefinitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__AUDITING:
    		return getAuditing() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__MONITORING:
    		return getMonitoring() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__LANES:
    		return getLanes() != null && !getLanes().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks() != null && !getIncomingConversationLinks().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks() != null && !getOutgoingConversationLinks().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INPUT_SET:
    		return getInputSet() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_REFS:
    		return getEventDefinitionRefs() != null && !getEventDefinitionRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION:
    		return getDataInputAssociation() != null && !getDataInputAssociation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DATA_INPUTS:
    		return getDataInputs() != null && !getDataInputs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EVENT_DEFINITIONS:
    		return getEventDefinitions() != null && !getEventDefinitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__AUDITING:
    		setAuditing(
    		(org.obeonetwork.dsl.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__MONITORING:
    		setMonitoring(
    		(org.obeonetwork.dsl.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__LANES:
    		getLanes().clear();
    		getLanes().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__INPUT_SET:
    		setInputSet(
    		(org.obeonetwork.dsl.bpmn2.InputSet)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_REFS:
    		getEventDefinitionRefs().clear();
    		getEventDefinitionRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION:
    		getDataInputAssociation().clear();
    		getDataInputAssociation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__DATA_INPUTS:
    		getDataInputs().clear();
    		getDataInputs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERMEDIATE_THROW_EVENT__EVENT_DEFINITIONS:
    		getEventDefinitions().clear();
    		getEventDefinitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
