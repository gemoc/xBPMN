package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallChoreography;

@SuppressWarnings("all")
public class CallChoreographyAdapter extends EObjectAdapter<CallChoreography> implements org.obeonetwork.dsl.bpmn2.CallChoreography {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public CallChoreographyAdapter() {
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
  public org.obeonetwork.dsl.bpmn2.ChoreographyLoopType getLoopType() {
    return org.obeonetwork.dsl.bpmn2.ChoreographyLoopType.get(adaptee.getLoopType().getValue());
  }
  
  @Override
  public void setLoopType(final org.obeonetwork.dsl.bpmn2.ChoreographyLoopType o) {
    adaptee.setLoopType(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ChoreographyLoopType.get(o.getValue()));
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Participant> */Object participantRefs_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Participant> */Object getParticipantRefs() {
    if (participantRefs_ == null)
    	participantRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipantRefs(), adaptersFactory, eResource);
    return participantRefs_;
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.CorrelationKey> */Object correlationKeys_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.CorrelationKey> */Object getCorrelationKeys() {
    if (correlationKeys_ == null)
    	correlationKeys_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCorrelationKeys(), adaptersFactory, eResource);
    return correlationKeys_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Choreography getCalledChoreographyRef() {
    return () adaptersFactory.createAdapter(adaptee.getCalledChoreographyRef(), eResource);
  }
  
  @Override
  public void setCalledChoreographyRef(final org.obeonetwork.dsl.bpmn2.Choreography o) {
    if (o != null)
    	adaptee.setCalledChoreographyRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyAdapter) o).getAdaptee());
    else adaptee.setCalledChoreographyRef(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ParticipantAssociation> */Object participantAssociations_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ParticipantAssociation> */Object getParticipantAssociations() {
    if (participantAssociations_ == null)
    	participantAssociations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipantAssociations(), adaptersFactory, eResource);
    return participantAssociations_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final org.obeonetwork.dsl.bpmn2.ChoreographyLoopType LOOP_TYPE_EDEFAULT = org.obeonetwork.dsl.bpmn2.ChoreographyLoopType.NONE;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getCallChoreography();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__AUDITING:
    		return getAuditing();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__MONITORING:
    		return getMonitoring();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__OUTGOING:
    		return getOutgoing();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__INCOMING:
    		return getIncoming();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__LANES:
    		return getLanes();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_REFS:
    		return getParticipantRefs();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF:
    		return getInitiatingParticipantRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CORRELATION_KEYS:
    		return getCorrelationKeys();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__LOOP_TYPE:
    		return getLoopType();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
    		return getCalledChoreographyRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
    		return getParticipantAssociations();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__AUDITING:
    		return getAuditing() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__MONITORING:
    		return getMonitoring() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__LANES:
    		return getLanes() != null && !getLanes().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_REFS:
    		return getParticipantRefs() != null && !getParticipantRefs().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF:
    		return getInitiatingParticipantRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CORRELATION_KEYS:
    		return getCorrelationKeys() != null && !getCorrelationKeys().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__LOOP_TYPE:
    		return getLoopType() != LOOP_TYPE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
    		return getCalledChoreographyRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
    		return getParticipantAssociations() != null && !getParticipantAssociations().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__AUDITING:
    		setAuditing(
    		(org.obeonetwork.dsl.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__MONITORING:
    		setMonitoring(
    		(org.obeonetwork.dsl.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__LANES:
    		getLanes().clear();
    		getLanes().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_REFS:
    		getParticipantRefs().clear();
    		getParticipantRefs().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF:
    		setInitiatingParticipantRef(
    		(org.obeonetwork.dsl.bpmn2.Participant)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CORRELATION_KEYS:
    		getCorrelationKeys().clear();
    		getCorrelationKeys().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__LOOP_TYPE:
    		setLoopType(
    		(org.obeonetwork.dsl.bpmn2.ChoreographyLoopType)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
    		setCalledChoreographyRef(
    		(org.obeonetwork.dsl.bpmn2.Choreography)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
    		getParticipantAssociations().clear();
    		getParticipantAssociations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
