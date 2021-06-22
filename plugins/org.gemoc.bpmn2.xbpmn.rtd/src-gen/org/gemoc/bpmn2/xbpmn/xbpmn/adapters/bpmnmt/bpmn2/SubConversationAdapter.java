package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubConversation;

@SuppressWarnings("all")
public class SubConversationAdapter extends EObjectAdapter<SubConversation> implements org.obeonetwork.dsl.bpmn2.SubConversation {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public SubConversationAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Participant> */Object participantRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Participant> */Object getParticipantRefs() {
    if (participantRefs_ == null)
    	participantRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipantRefs(), adaptersFactory, eResource);
    return participantRefs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.MessageFlow> */Object messageFlowRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.MessageFlow> */Object getMessageFlowRefs() {
    if (messageFlowRefs_ == null)
    	messageFlowRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMessageFlowRefs(), adaptersFactory, eResource);
    return messageFlowRefs_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.CorrelationKey> */Object correlationKeys_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.CorrelationKey> */Object getCorrelationKeys() {
    if (correlationKeys_ == null)
    	correlationKeys_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCorrelationKeys(), adaptersFactory, eResource);
    return correlationKeys_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ConversationNode> */Object conversationNodes_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ConversationNode> */Object getConversationNodes() {
    if (conversationNodes_ == null)
    	conversationNodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConversationNodes(), adaptersFactory, eResource);
    return conversationNodes_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getSubConversation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__PARTICIPANT_REFS:
    		return getParticipantRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__MESSAGE_FLOW_REFS:
    		return getMessageFlowRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__CORRELATION_KEYS:
    		return getCorrelationKeys();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__CONVERSATION_NODES:
    		return getConversationNodes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks() != null && !getIncomingConversationLinks().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks() != null && !getOutgoingConversationLinks().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__PARTICIPANT_REFS:
    		return getParticipantRefs() != null && !getParticipantRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__MESSAGE_FLOW_REFS:
    		return getMessageFlowRefs() != null && !getMessageFlowRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__CORRELATION_KEYS:
    		return getCorrelationKeys() != null && !getCorrelationKeys().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__CONVERSATION_NODES:
    		return getConversationNodes() != null && !getConversationNodes().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__PARTICIPANT_REFS:
    		getParticipantRefs().clear();
    		getParticipantRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__MESSAGE_FLOW_REFS:
    		getMessageFlowRefs().clear();
    		getMessageFlowRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__CORRELATION_KEYS:
    		getCorrelationKeys().clear();
    		getCorrelationKeys().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.SUB_CONVERSATION__CONVERSATION_NODES:
    		getConversationNodes().clear();
    		getConversationNodes().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
