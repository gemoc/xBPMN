package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalChoreographyTask;

@SuppressWarnings("all")
public class GlobalChoreographyTaskAdapter extends EObjectAdapter<GlobalChoreographyTask> implements org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public GlobalChoreographyTaskAdapter() {
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
  public boolean isIsClosed() {
    return adaptee.isIsClosed();
  }
  
  @Override
  public void setIsClosed(final boolean o) {
    adaptee.setIsClosed(o);
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Choreography> */Object choreographyRef_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Choreography> */Object getChoreographyRef() {
    if (choreographyRef_ == null)
    	choreographyRef_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getChoreographyRef(), adaptersFactory, eResource);
    return choreographyRef_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Artifact> */Object artifacts_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Artifact> */Object getArtifacts() {
    if (artifacts_ == null)
    	artifacts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArtifacts(), adaptersFactory, eResource);
    return artifacts_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ParticipantAssociation> */Object participantAssociations_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ParticipantAssociation> */Object getParticipantAssociations() {
    if (participantAssociations_ == null)
    	participantAssociations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipantAssociations(), adaptersFactory, eResource);
    return participantAssociations_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.MessageFlowAssociation> */Object messageFlowAssociations_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.MessageFlowAssociation> */Object getMessageFlowAssociations() {
    if (messageFlowAssociations_ == null)
    	messageFlowAssociations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMessageFlowAssociations(), adaptersFactory, eResource);
    return messageFlowAssociations_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.ConversationAssociation getConversationAssociations() {
    return () adaptersFactory.createAdapter(adaptee.getConversationAssociations(), eResource);
  }
  
  @Override
  public void setConversationAssociations(final org.obeonetwork.dsl.bpmn2.ConversationAssociation o) {
    if (o != null)
    	adaptee.setConversationAssociations(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAssociationAdapter) o).getAdaptee());
    else adaptee.setConversationAssociations(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Participant> */Object participants_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Participant> */Object getParticipants() {
    if (participants_ == null)
    	participants_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipants(), adaptersFactory, eResource);
    return participants_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.MessageFlow> */Object messageFlows_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.MessageFlow> */Object getMessageFlows() {
    if (messageFlows_ == null)
    	messageFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMessageFlows(), adaptersFactory, eResource);
    return messageFlows_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.CorrelationKey> */Object correlationKeys_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.CorrelationKey> */Object getCorrelationKeys() {
    if (correlationKeys_ == null)
    	correlationKeys_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCorrelationKeys(), adaptersFactory, eResource);
    return correlationKeys_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ConversationNode> */Object conversations_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ConversationNode> */Object getConversations() {
    if (conversations_ == null)
    	conversations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConversations(), adaptersFactory, eResource);
    return conversations_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ConversationLink> */Object conversationLinks_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ConversationLink> */Object getConversationLinks() {
    if (conversationLinks_ == null)
    	conversationLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConversationLinks(), adaptersFactory, eResource);
    return conversationLinks_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.FlowElement> */Object flowElements_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.FlowElement> */Object getFlowElements() {
    if (flowElements_ == null)
    	flowElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFlowElements(), adaptersFactory, eResource);
    return flowElements_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.LaneSet> */Object laneSets_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.LaneSet> */Object getLaneSets() {
    if (laneSets_ == null)
    	laneSets_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLaneSets(), adaptersFactory, eResource);
    return laneSets_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Participant getInitiatingParticipantRef() {
    return () adaptersFactory.createAdapter(adaptee.getInitiatingParticipantRef(), eResource);
  }
  
  @Override
  public void setInitiatingParticipantRef(final org.obeonetwork.dsl.bpmn2.Participant o) {
    if (o != null)
    	adaptee.setInitiatingParticipantRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAdapter) o).getAdaptee());
    else adaptee.setInitiatingParticipantRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final boolean IS_CLOSED_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getGlobalChoreographyTask();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__IS_CLOSED:
    		return isIsClosed() ? Boolean.TRUE : Boolean.FALSE;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CHOREOGRAPHY_REF:
    		return getChoreographyRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__ARTIFACTS:
    		return getArtifacts();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT_ASSOCIATIONS:
    		return getParticipantAssociations();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW_ASSOCIATIONS:
    		return getMessageFlowAssociations();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_ASSOCIATIONS:
    		return getConversationAssociations();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANTS:
    		return getParticipants();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOWS:
    		return getMessageFlows();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CORRELATION_KEYS:
    		return getCorrelationKeys();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATIONS:
    		return getConversations();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_LINKS:
    		return getConversationLinks();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__FLOW_ELEMENTS:
    		return getFlowElements();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__LANE_SETS:
    		return getLaneSets();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF:
    		return getInitiatingParticipantRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__IS_CLOSED:
    		return isIsClosed() != IS_CLOSED_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CHOREOGRAPHY_REF:
    		return getChoreographyRef() != null && !getChoreographyRef().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__ARTIFACTS:
    		return getArtifacts() != null && !getArtifacts().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT_ASSOCIATIONS:
    		return getParticipantAssociations() != null && !getParticipantAssociations().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW_ASSOCIATIONS:
    		return getMessageFlowAssociations() != null && !getMessageFlowAssociations().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_ASSOCIATIONS:
    		return getConversationAssociations() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANTS:
    		return getParticipants() != null && !getParticipants().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOWS:
    		return getMessageFlows() != null && !getMessageFlows().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CORRELATION_KEYS:
    		return getCorrelationKeys() != null && !getCorrelationKeys().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATIONS:
    		return getConversations() != null && !getConversations().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_LINKS:
    		return getConversationLinks() != null && !getConversationLinks().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__FLOW_ELEMENTS:
    		return getFlowElements() != null && !getFlowElements().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__LANE_SETS:
    		return getLaneSets() != null && !getLaneSets().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF:
    		return getInitiatingParticipantRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__IS_CLOSED:
    		setIsClosed(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CHOREOGRAPHY_REF:
    		getChoreographyRef().clear();
    		getChoreographyRef().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__ARTIFACTS:
    		getArtifacts().clear();
    		getArtifacts().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT_ASSOCIATIONS:
    		getParticipantAssociations().clear();
    		getParticipantAssociations().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW_ASSOCIATIONS:
    		getMessageFlowAssociations().clear();
    		getMessageFlowAssociations().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_ASSOCIATIONS:
    		setConversationAssociations(
    		(org.obeonetwork.dsl.bpmn2.ConversationAssociation)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANTS:
    		getParticipants().clear();
    		getParticipants().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOWS:
    		getMessageFlows().clear();
    		getMessageFlows().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CORRELATION_KEYS:
    		getCorrelationKeys().clear();
    		getCorrelationKeys().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATIONS:
    		getConversations().clear();
    		getConversations().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_LINKS:
    		getConversationLinks().clear();
    		getConversationLinks().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__FLOW_ELEMENTS:
    		getFlowElements().clear();
    		getFlowElements().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__LANE_SETS:
    		getLaneSets().clear();
    		getLaneSets().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF:
    		setInitiatingParticipantRef(
    		(org.obeonetwork.dsl.bpmn2.Participant)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
