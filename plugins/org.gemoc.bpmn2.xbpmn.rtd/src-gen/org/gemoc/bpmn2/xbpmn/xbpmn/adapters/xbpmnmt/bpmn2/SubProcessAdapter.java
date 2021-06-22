package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubProcess;

@SuppressWarnings("all")
public class SubProcessAdapter extends EObjectAdapter<SubProcess> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubProcess {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public SubProcessAdapter() {
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
  public boolean isIsForCompensation() {
    return adaptee.isIsForCompensation();
  }
  
  @Override
  public void setIsForCompensation(final boolean o) {
    adaptee.setIsForCompensation(o);
  }
  
  @Override
  public int getStartQuantity() {
    return adaptee.getStartQuantity();
  }
  
  @Override
  public void setStartQuantity(final int o) {
    adaptee.setStartQuantity(o);
  }
  
  @Override
  public int getCompletionQuantity() {
    return adaptee.getCompletionQuantity();
  }
  
  @Override
  public void setCompletionQuantity(final int o) {
    adaptee.setCompletionQuantity(o);
  }
  
  @Override
  public boolean isTriggeredByEvent() {
    return adaptee.isTriggeredByEvent();
  }
  
  @Override
  public void setTriggeredByEvent(final boolean o) {
    adaptee.setTriggeredByEvent(o);
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
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LoopCharacteristics getLoopCharacteristics() {
    return () adaptersFactory.createAdapter(adaptee.getLoopCharacteristics(), eResource);
  }
  
  @Override
  public void setLoopCharacteristics(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LoopCharacteristics o) {
    if (o != null)
    	adaptee.setLoopCharacteristics(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.LoopCharacteristicsAdapter) o).getAdaptee());
    else adaptee.setLoopCharacteristics(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceRole> */Object resources_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceRole> */Object getResources() {
    if (resources_ == null)
    	resources_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getResources(), adaptersFactory, eResource);
    return resources_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow getDefault() {
    return () adaptersFactory.createAdapter(adaptee.getDefault(), eResource);
  }
  
  @Override
  public void setDefault(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow o) {
    if (o != null)
    	adaptee.setDefault(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.SequenceFlowAdapter) o).getAdaptee());
    else adaptee.setDefault(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property> */Object properties_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property> */Object getProperties() {
    if (properties_ == null)
    	properties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProperties(), adaptersFactory, eResource);
    return properties_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification getIoSpecification() {
    return () adaptersFactory.createAdapter(adaptee.getIoSpecification(), eResource);
  }
  
  @Override
  public void setIoSpecification(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification o) {
    if (o != null)
    	adaptee.setIoSpecification(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.InputOutputSpecificationAdapter) o).getAdaptee());
    else adaptee.setIoSpecification(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BoundaryEvent> */Object boundaryEventRefs_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BoundaryEvent> */Object getBoundaryEventRefs() {
    if (boundaryEventRefs_ == null)
    	boundaryEventRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBoundaryEventRefs(), adaptersFactory, eResource);
    return boundaryEventRefs_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInputAssociation> */Object dataInputAssociations_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInputAssociation> */Object getDataInputAssociations() {
    if (dataInputAssociations_ == null)
    	dataInputAssociations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataInputAssociations(), adaptersFactory, eResource);
    return dataInputAssociations_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutputAssociation> */Object dataOutputAssociations_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutputAssociation> */Object getDataOutputAssociations() {
    if (dataOutputAssociations_ == null)
    	dataOutputAssociations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataOutputAssociations(), adaptersFactory, eResource);
    return dataOutputAssociations_;
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
  
  protected static final boolean IS_FOR_COMPENSATION_EDEFAULT = false;
  
  protected static final int START_QUANTITY_EDEFAULT = 1;
  
  protected static final int COMPLETION_QUANTITY_EDEFAULT = 1;
  
  protected static final boolean TRIGGERED_BY_EVENT_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getSubProcess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__ID:
    		return getId();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__AUDITING:
    		return getAuditing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__MONITORING:
    		return getMonitoring();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__CATEGORY_VALUE_REF:
    		return getCategoryValueRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__INCOMING:
    		return getIncoming();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANES:
    		return getLanes();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__IS_FOR_COMPENSATION:
    		return isIsForCompensation() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LOOP_CHARACTERISTICS:
    		return getLoopCharacteristics();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__RESOURCES:
    		return getResources();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DEFAULT:
    		return getDefault();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__PROPERTIES:
    		return getProperties();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__IO_SPECIFICATION:
    		return getIoSpecification();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__BOUNDARY_EVENT_REFS:
    		return getBoundaryEventRefs();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DATA_INPUT_ASSOCIATIONS:
    		return getDataInputAssociations();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS:
    		return getDataOutputAssociations();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__START_QUANTITY:
    		return new java.lang.Integer(getStartQuantity());
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__COMPLETION_QUANTITY:
    		return new java.lang.Integer(getCompletionQuantity());
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
    		return getFlowElements();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANE_SETS:
    		return getLaneSets();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
    		return isTriggeredByEvent() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__ARTIFACTS:
    		return getArtifacts();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__AUDITING:
    		return getAuditing() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__MONITORING:
    		return getMonitoring() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__CATEGORY_VALUE_REF:
    		return getCategoryValueRef() != null && !getCategoryValueRef().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANES:
    		return getLanes() != null && !getLanes().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__INCOMING_CONVERSATION_LINKS:
    		return getIncomingConversationLinks() != null && !getIncomingConversationLinks().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__OUTGOING_CONVERSATION_LINKS:
    		return getOutgoingConversationLinks() != null && !getOutgoingConversationLinks().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__IS_FOR_COMPENSATION:
    		return isIsForCompensation() != IS_FOR_COMPENSATION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LOOP_CHARACTERISTICS:
    		return getLoopCharacteristics() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__RESOURCES:
    		return getResources() != null && !getResources().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DEFAULT:
    		return getDefault() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__IO_SPECIFICATION:
    		return getIoSpecification() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__BOUNDARY_EVENT_REFS:
    		return getBoundaryEventRefs() != null && !getBoundaryEventRefs().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DATA_INPUT_ASSOCIATIONS:
    		return getDataInputAssociations() != null && !getDataInputAssociations().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS:
    		return getDataOutputAssociations() != null && !getDataOutputAssociations().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__START_QUANTITY:
    		return getStartQuantity() != START_QUANTITY_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__COMPLETION_QUANTITY:
    		return getCompletionQuantity() != COMPLETION_QUANTITY_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
    		return getFlowElements() != null && !getFlowElements().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANE_SETS:
    		return getLaneSets() != null && !getLaneSets().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
    		return isTriggeredByEvent() != TRIGGERED_BY_EVENT_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__ARTIFACTS:
    		return getArtifacts() != null && !getArtifacts().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__AUDITING:
    		setAuditing(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__MONITORING:
    		setMonitoring(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__CATEGORY_VALUE_REF:
    		getCategoryValueRef().clear();
    		getCategoryValueRef().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANES:
    		getLanes().clear();
    		getLanes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__IS_FOR_COMPENSATION:
    		setIsForCompensation(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LOOP_CHARACTERISTICS:
    		setLoopCharacteristics(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LoopCharacteristics)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__RESOURCES:
    		getResources().clear();
    		getResources().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DEFAULT:
    		setDefault(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__IO_SPECIFICATION:
    		setIoSpecification(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__BOUNDARY_EVENT_REFS:
    		getBoundaryEventRefs().clear();
    		getBoundaryEventRefs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DATA_INPUT_ASSOCIATIONS:
    		getDataInputAssociations().clear();
    		getDataInputAssociations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS:
    		getDataOutputAssociations().clear();
    		getDataOutputAssociations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__START_QUANTITY:
    		setStartQuantity(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__COMPLETION_QUANTITY:
    		setCompletionQuantity(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
    		getFlowElements().clear();
    		getFlowElements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANE_SETS:
    		getLaneSets().clear();
    		getLaneSets().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
    		setTriggeredByEvent(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__ARTIFACTS:
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
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANE_SETS:
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
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.SUB_PROCESS__LANE_SETS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
