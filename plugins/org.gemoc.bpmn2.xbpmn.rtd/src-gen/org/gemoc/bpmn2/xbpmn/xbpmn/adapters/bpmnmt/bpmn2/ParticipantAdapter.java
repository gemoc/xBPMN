package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Participant;

@SuppressWarnings("all")
public class ParticipantAdapter extends EObjectAdapter<Participant> implements org.obeonetwork.dsl.bpmn2.Participant {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public ParticipantAdapter() {
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Interface> */Object interfaceRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Interface> */Object getInterfaceRefs() {
    if (interfaceRefs_ == null)
    	interfaceRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInterfaceRefs(), adaptersFactory, eResource);
    return interfaceRefs_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity getParticipantMultiplicity() {
    return () adaptersFactory.createAdapter(adaptee.getParticipantMultiplicity(), eResource);
  }
  
  @Override
  public void setParticipantMultiplicity(final org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity o) {
    if (o != null)
    	adaptee.setParticipantMultiplicity(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantMultiplicityAdapter) o).getAdaptee());
    else adaptee.setParticipantMultiplicity(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.EndPoint> */Object endPointRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.EndPoint> */Object getEndPointRefs() {
    if (endPointRefs_ == null)
    	endPointRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEndPointRefs(), adaptersFactory, eResource);
    return endPointRefs_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Process getProcessRef() {
    return () adaptersFactory.createAdapter(adaptee.getProcessRef(), eResource);
  }
  
  @Override
  public void setProcessRef(final org.obeonetwork.dsl.bpmn2.Process o) {
    if (o != null)
    	adaptee.setProcessRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ProcessAdapter) o).getAdaptee());
    else adaptee.setProcessRef(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getParticipant();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
    		return getInterfaceRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
    		return getParticipantMultiplicity();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__END_POINT_REFS:
    		return getEndPointRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__PROCESS_REF:
    		return getProcessRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks() != null && !getIncomingConversationLinks().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks() != null && !getOutgoingConversationLinks().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
    		return getInterfaceRefs() != null && !getInterfaceRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
    		return getParticipantMultiplicity() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__END_POINT_REFS:
    		return getEndPointRefs() != null && !getEndPointRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__PROCESS_REF:
    		return getProcessRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
    		getInterfaceRefs().clear();
    		getInterfaceRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
    		setParticipantMultiplicity(
    		(org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__END_POINT_REFS:
    		getEndPointRefs().clear();
    		getEndPointRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__PROCESS_REF:
    		setProcessRef(
    		(org.obeonetwork.dsl.bpmn2.Process)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.obeonetwork.dsl.bpmn2.InteractionNode.class) {
    	switch (derivedFeatureID) {
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.obeonetwork.dsl.bpmn2.InteractionNode.class) {
    	switch (baseFeatureID) {
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS;
    		case org.obeonetwork.dsl.bpmn2.Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
    			return org.obeonetwork.dsl.bpmn2.Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
