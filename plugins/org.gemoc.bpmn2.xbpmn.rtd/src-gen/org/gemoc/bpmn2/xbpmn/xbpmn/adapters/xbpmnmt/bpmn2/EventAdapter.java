package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Event;

@SuppressWarnings("all")
public class EventAdapter extends EObjectAdapter<Event> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Event {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public EventAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
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
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition> */Object extensionDefinitions_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition> */Object getExtensionDefinitions() {
    if (extensionDefinitions_ == null)
    	extensionDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionDefinitions(), adaptersFactory, eResource);
    return extensionDefinitions_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue> */Object extensionValues_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue> */Object getExtensionValues() {
    if (extensionValues_ == null)
    	extensionValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionValues(), adaptersFactory, eResource);
    return extensionValues_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation> */Object documentation_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation> */Object getDocumentation() {
    if (documentation_ == null)
    	documentation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDocumentation(), adaptersFactory, eResource);
    return documentation_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing getAuditing() {
    return () adaptersFactory.createAdapter(adaptee.getAuditing(), eResource);
  }
  
  @Override
  public void setAuditing(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing o) {
    if (o != null)
    	adaptee.setAuditing(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.AuditingAdapter) o).getAdaptee());
    else adaptee.setAuditing(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring getMonitoring() {
    return () adaptersFactory.createAdapter(adaptee.getMonitoring(), eResource);
  }
  
  @Override
  public void setMonitoring(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring o) {
    if (o != null)
    	adaptee.setMonitoring(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.MonitoringAdapter) o).getAdaptee());
    else adaptee.setMonitoring(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CategoryValue> */Object categoryValueRef_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CategoryValue> */Object getCategoryValueRef() {
    if (categoryValueRef_ == null)
    	categoryValueRef_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCategoryValueRef(), adaptersFactory, eResource);
    return categoryValueRef_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow> */Object outgoing_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow> */Object getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow> */Object incoming_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow> */Object getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Lane> */Object lanes_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Lane> */Object getLanes() {
    if (lanes_ == null)
    	lanes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLanes(), adaptersFactory, eResource);
    return lanes_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationLink> */Object incomingConversationLinks_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationLink> */Object getIncomingConversationLinks() {
    if (incomingConversationLinks_ == null)
    	incomingConversationLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingConversationLinks(), adaptersFactory, eResource);
    return incomingConversationLinks_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationLink> */Object outgoingConversationLinks_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationLink> */Object getOutgoingConversationLinks() {
    if (outgoingConversationLinks_ == null)
    	outgoingConversationLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingConversationLinks(), adaptersFactory, eResource);
    return outgoingConversationLinks_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property> */Object properties_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property> */Object getProperties() {
    if (properties_ == null)
    	properties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProperties(), adaptersFactory, eResource);
    return properties_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__ID:
    		return getId();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__AUDITING:
    		return getAuditing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__MONITORING:
    		return getMonitoring();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__INCOMING:
    		return getIncoming();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__LANES:
    		return getLanes();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__PROPERTIES:
    		return getProperties();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__AUDITING:
    		return getAuditing() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__MONITORING:
    		return getMonitoring() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__LANES:
    		return getLanes() != null && !getLanes().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks() != null && !getIncomingConversationLinks().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks() != null && !getOutgoingConversationLinks().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__AUDITING:
    		setAuditing(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__MONITORING:
    		setMonitoring(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__LANES:
    		getLanes().clear();
    		getLanes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InteractionNode.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InteractionNode.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
