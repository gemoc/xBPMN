package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubChoreography;

@SuppressWarnings("all")
public class SubChoreographyAdapter extends EObjectAdapter<SubChoreography> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubChoreography {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public SubChoreographyAdapter() {
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
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType getLoopType() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType.get(adaptee.getLoopType().getValue());
  }
  
  @Override
  public void setLoopType(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType o) {
    adaptee.setLoopType(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ChoreographyLoopType.get(o.getValue()));
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
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant> */Object participantRefs_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant> */Object getParticipantRefs() {
    if (participantRefs_ == null)
    	participantRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipantRefs(), adaptersFactory, eResource);
    return participantRefs_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant getInitiatingParticipantRef() {
    return () adaptersFactory.createAdapter(adaptee.getInitiatingParticipantRef(), eResource);
  }
  
  @Override
  public void setInitiatingParticipantRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant o) {
    if (o != null)
    	adaptee.setInitiatingParticipantRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ParticipantAdapter) o).getAdaptee());
    else adaptee.setInitiatingParticipantRef(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationKey> */Object correlationKeys_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationKey> */Object getCorrelationKeys() {
    if (correlationKeys_ == null)
    	correlationKeys_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCorrelationKeys(), adaptersFactory, eResource);
    return correlationKeys_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElement> */Object flowElements_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElement> */Object getFlowElements() {
    if (flowElements_ == null)
    	flowElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFlowElements(), adaptersFactory, eResource);
    return flowElements_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LaneSet> */Object laneSets_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LaneSet> */Object getLaneSets() {
    if (laneSets_ == null)
    	laneSets_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLaneSets(), adaptersFactory, eResource);
    return laneSets_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Artifact> */Object artifacts_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Artifact> */Object getArtifacts() {
    if (artifacts_ == null)
    	artifacts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArtifacts(), adaptersFactory, eResource);
    return artifacts_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType LOOP_TYPE_EDEFAULT = org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType.NONE;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getSubChoreography();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__ID:
    		return getId();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__AUDITING:
    		return getAuditing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__MONITORING:
    		return getMonitoring();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__INCOMING:
    		return getIncoming();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANES:
    		return getLanes();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__PARTICIPANT_REFS:
    		return getParticipantRefs();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF:
    		return getInitiatingParticipantRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__CORRELATION_KEYS:
    		return getCorrelationKeys();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LOOP_TYPE:
    		return getLoopType();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
    		return getFlowElements();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANE_SETS:
    		return getLaneSets();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__ARTIFACTS:
    		return getArtifacts();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__AUDITING:
    		return getAuditing() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__MONITORING:
    		return getMonitoring() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANES:
    		return getLanes() != null && !getLanes().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__PARTICIPANT_REFS:
    		return getParticipantRefs() != null && !getParticipantRefs().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF:
    		return getInitiatingParticipantRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__CORRELATION_KEYS:
    		return getCorrelationKeys() != null && !getCorrelationKeys().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LOOP_TYPE:
    		return getLoopType() != LOOP_TYPE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
    		return getFlowElements() != null && !getFlowElements().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANE_SETS:
    		return getLaneSets() != null && !getLaneSets().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__ARTIFACTS:
    		return getArtifacts() != null && !getArtifacts().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__AUDITING:
    		setAuditing(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__MONITORING:
    		setMonitoring(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANES:
    		getLanes().clear();
    		getLanes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__PARTICIPANT_REFS:
    		getParticipantRefs().clear();
    		getParticipantRefs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF:
    		setInitiatingParticipantRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__CORRELATION_KEYS:
    		getCorrelationKeys().clear();
    		getCorrelationKeys().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LOOP_TYPE:
    		setLoopType(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
    		getFlowElements().clear();
    		getFlowElements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANE_SETS:
    		getLaneSets().clear();
    		getLaneSets().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__ARTIFACTS:
    		getArtifacts().clear();
    		getArtifacts().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElementsContainer.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANE_SETS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElementsContainer.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__FLOW_ELEMENTS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_CHOREOGRAPHY__LANE_SETS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
