package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Factory;

@SuppressWarnings("all")
public class Bpmn2FactoryAdapter extends EFactoryImpl implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Factory {
  private XBPMNMTAdaptersFactory adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
  
  private Bpmn2Factory bpmn2Adaptee = org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Factory.eINSTANCE;
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Interface createInterface() {
    return adaptersFactory.createInterfaceAdapter(bpmn2Adaptee.createInterface(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition createExtensionDefinition() {
    return adaptersFactory.createExtensionDefinitionAdapter(bpmn2Adaptee.createExtensionDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeDefinition createExtensionAttributeDefinition() {
    return adaptersFactory.createExtensionAttributeDefinitionAdapter(bpmn2Adaptee.createExtensionAttributeDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue createExtensionAttributeValue() {
    return adaptersFactory.createExtensionAttributeValueAdapter(bpmn2Adaptee.createExtensionAttributeValue(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation createDocumentation() {
    return adaptersFactory.createDocumentationAdapter(bpmn2Adaptee.createDocumentation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Operation createOperation() {
    return adaptersFactory.createOperationAdapter(bpmn2Adaptee.createOperation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Message createMessage() {
    return adaptersFactory.createMessageAdapter(bpmn2Adaptee.createMessage(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemDefinition createItemDefinition() {
    return adaptersFactory.createItemDefinitionAdapter(bpmn2Adaptee.createItemDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Import createImport() {
    return adaptersFactory.createImportAdapter(bpmn2Adaptee.createImport(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Error createError() {
    return adaptersFactory.createErrorAdapter(bpmn2Adaptee.createError(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EndPoint createEndPoint() {
    return adaptersFactory.createEndPointAdapter(bpmn2Adaptee.createEndPoint(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing createAuditing() {
    return adaptersFactory.createAuditingAdapter(bpmn2Adaptee.createAuditing(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalTask createGlobalTask() {
    return adaptersFactory.createGlobalTaskAdapter(bpmn2Adaptee.createGlobalTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification createInputOutputSpecification() {
    return adaptersFactory.createInputOutputSpecificationAdapter(bpmn2Adaptee.createInputOutputSpecification(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputSet createInputSet() {
    return adaptersFactory.createInputSetAdapter(bpmn2Adaptee.createInputSet(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInput createDataInput() {
    return adaptersFactory.createDataInputAdapter(bpmn2Adaptee.createDataInput(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement createItemAwareElement() {
    return adaptersFactory.createItemAwareElementAdapter(bpmn2Adaptee.createItemAwareElement(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataState createDataState() {
    return adaptersFactory.createDataStateAdapter(bpmn2Adaptee.createDataState(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.OutputSet createOutputSet() {
    return adaptersFactory.createOutputSetAdapter(bpmn2Adaptee.createOutputSet(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutput createDataOutput() {
    return adaptersFactory.createDataOutputAdapter(bpmn2Adaptee.createDataOutput(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputBinding createInputOutputBinding() {
    return adaptersFactory.createInputOutputBindingAdapter(bpmn2Adaptee.createInputOutputBinding(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceRole createResourceRole() {
    return adaptersFactory.createResourceRoleAdapter(bpmn2Adaptee.createResourceRole(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Resource createResource() {
    return adaptersFactory.createResourceAdapter(bpmn2Adaptee.createResource(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter createResourceParameter() {
    return adaptersFactory.createResourceParameterAdapter(bpmn2Adaptee.createResourceParameter(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameterBinding createResourceParameterBinding() {
    return adaptersFactory.createResourceParameterBindingAdapter(bpmn2Adaptee.createResourceParameterBinding(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression createExpression() {
    return adaptersFactory.createExpressionAdapter(bpmn2Adaptee.createExpression(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceAssignmentExpression createResourceAssignmentExpression() {
    return adaptersFactory.createResourceAssignmentExpressionAdapter(bpmn2Adaptee.createResourceAssignmentExpression(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring createMonitoring() {
    return adaptersFactory.createMonitoringAdapter(bpmn2Adaptee.createMonitoring(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Performer createPerformer() {
    return adaptersFactory.createPerformerAdapter(bpmn2Adaptee.createPerformer(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process createProcess() {
    return adaptersFactory.createProcessAdapter(bpmn2Adaptee.createProcess(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CategoryValue createCategoryValue() {
    return adaptersFactory.createCategoryValueAdapter(bpmn2Adaptee.createCategoryValue(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LaneSet createLaneSet() {
    return adaptersFactory.createLaneSetAdapter(bpmn2Adaptee.createLaneSet(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Lane createLane() {
    return adaptersFactory.createLaneAdapter(bpmn2Adaptee.createLane(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow createSequenceFlow() {
    return adaptersFactory.createSequenceFlowAdapter(bpmn2Adaptee.createSequenceFlow(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property createProperty() {
    return adaptersFactory.createPropertyAdapter(bpmn2Adaptee.createProperty(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Collaboration createCollaboration() {
    return adaptersFactory.createCollaborationAdapter(bpmn2Adaptee.createCollaboration(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Choreography createChoreography() {
    return adaptersFactory.createChoreographyAdapter(bpmn2Adaptee.createChoreography(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantAssociation createParticipantAssociation() {
    return adaptersFactory.createParticipantAssociationAdapter(bpmn2Adaptee.createParticipantAssociation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant createParticipant() {
    return adaptersFactory.createParticipantAdapter(bpmn2Adaptee.createParticipant(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationLink createConversationLink() {
    return adaptersFactory.createConversationLinkAdapter(bpmn2Adaptee.createConversationLink(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantMultiplicity createParticipantMultiplicity() {
    return adaptersFactory.createParticipantMultiplicityAdapter(bpmn2Adaptee.createParticipantMultiplicity(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MessageFlowAssociation createMessageFlowAssociation() {
    return adaptersFactory.createMessageFlowAssociationAdapter(bpmn2Adaptee.createMessageFlowAssociation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MessageFlow createMessageFlow() {
    return adaptersFactory.createMessageFlowAdapter(bpmn2Adaptee.createMessageFlow(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationAssociation createConversationAssociation() {
    return adaptersFactory.createConversationAssociationAdapter(bpmn2Adaptee.createConversationAssociation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationKey createCorrelationKey() {
    return adaptersFactory.createCorrelationKeyAdapter(bpmn2Adaptee.createCorrelationKey(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationProperty createCorrelationProperty() {
    return adaptersFactory.createCorrelationPropertyAdapter(bpmn2Adaptee.createCorrelationProperty(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
    return adaptersFactory.createCorrelationPropertyRetrievalExpressionAdapter(bpmn2Adaptee.createCorrelationPropertyRetrievalExpression(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FormalExpression createFormalExpression() {
    return adaptersFactory.createFormalExpressionAdapter(bpmn2Adaptee.createFormalExpression(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationSubscription createCorrelationSubscription() {
    return adaptersFactory.createCorrelationSubscriptionAdapter(bpmn2Adaptee.createCorrelationSubscription(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyBinding createCorrelationPropertyBinding() {
    return adaptersFactory.createCorrelationPropertyBindingAdapter(bpmn2Adaptee.createCorrelationPropertyBinding(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalManualTask createGlobalManualTask() {
    return adaptersFactory.createGlobalManualTaskAdapter(bpmn2Adaptee.createGlobalManualTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ManualTask createManualTask() {
    return adaptersFactory.createManualTaskAdapter(bpmn2Adaptee.createManualTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Task createTask() {
    return adaptersFactory.createTaskAdapter(bpmn2Adaptee.createTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BoundaryEvent createBoundaryEvent() {
    return adaptersFactory.createBoundaryEventAdapter(bpmn2Adaptee.createBoundaryEvent(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutputAssociation createDataOutputAssociation() {
    return adaptersFactory.createDataOutputAssociationAdapter(bpmn2Adaptee.createDataOutputAssociation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataAssociation createDataAssociation() {
    return adaptersFactory.createDataAssociationAdapter(bpmn2Adaptee.createDataAssociation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Assignment createAssignment() {
    return adaptersFactory.createAssignmentAdapter(bpmn2Adaptee.createAssignment(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInputAssociation createDataInputAssociation() {
    return adaptersFactory.createDataInputAssociationAdapter(bpmn2Adaptee.createDataInputAssociation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.UserTask createUserTask() {
    return adaptersFactory.createUserTaskAdapter(bpmn2Adaptee.createUserTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Rendering createRendering() {
    return adaptersFactory.createRenderingAdapter(bpmn2Adaptee.createRendering(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.HumanPerformer createHumanPerformer() {
    return adaptersFactory.createHumanPerformerAdapter(bpmn2Adaptee.createHumanPerformer(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.PotentialOwner createPotentialOwner() {
    return adaptersFactory.createPotentialOwnerAdapter(bpmn2Adaptee.createPotentialOwner(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalUserTask createGlobalUserTask() {
    return adaptersFactory.createGlobalUserTaskAdapter(bpmn2Adaptee.createGlobalUserTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventBasedGateway createEventBasedGateway() {
    return adaptersFactory.createEventBasedGatewayAdapter(bpmn2Adaptee.createEventBasedGateway(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ComplexGateway createComplexGateway() {
    return adaptersFactory.createComplexGatewayAdapter(bpmn2Adaptee.createComplexGateway(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExclusiveGateway createExclusiveGateway() {
    return adaptersFactory.createExclusiveGatewayAdapter(bpmn2Adaptee.createExclusiveGateway(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InclusiveGateway createInclusiveGateway() {
    return adaptersFactory.createInclusiveGatewayAdapter(bpmn2Adaptee.createInclusiveGateway(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParallelGateway createParallelGateway() {
    return adaptersFactory.createParallelGatewayAdapter(bpmn2Adaptee.createParallelGateway(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Relationship createRelationship() {
    return adaptersFactory.createRelationshipAdapter(bpmn2Adaptee.createRelationship(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Extension createExtension() {
    return adaptersFactory.createExtensionAdapter(bpmn2Adaptee.createExtension(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.IntermediateCatchEvent createIntermediateCatchEvent() {
    return adaptersFactory.createIntermediateCatchEventAdapter(bpmn2Adaptee.createIntermediateCatchEvent(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.IntermediateThrowEvent createIntermediateThrowEvent() {
    return adaptersFactory.createIntermediateThrowEventAdapter(bpmn2Adaptee.createIntermediateThrowEvent(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EndEvent createEndEvent() {
    return adaptersFactory.createEndEventAdapter(bpmn2Adaptee.createEndEvent(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.StartEvent createStartEvent() {
    return adaptersFactory.createStartEventAdapter(bpmn2Adaptee.createStartEvent(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CancelEventDefinition createCancelEventDefinition() {
    return adaptersFactory.createCancelEventDefinitionAdapter(bpmn2Adaptee.createCancelEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ErrorEventDefinition createErrorEventDefinition() {
    return adaptersFactory.createErrorEventDefinitionAdapter(bpmn2Adaptee.createErrorEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.TerminateEventDefinition createTerminateEventDefinition() {
    return adaptersFactory.createTerminateEventDefinitionAdapter(bpmn2Adaptee.createTerminateEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EscalationEventDefinition createEscalationEventDefinition() {
    return adaptersFactory.createEscalationEventDefinitionAdapter(bpmn2Adaptee.createEscalationEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Escalation createEscalation() {
    return adaptersFactory.createEscalationAdapter(bpmn2Adaptee.createEscalation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CompensateEventDefinition createCompensateEventDefinition() {
    return adaptersFactory.createCompensateEventDefinitionAdapter(bpmn2Adaptee.createCompensateEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.TimerEventDefinition createTimerEventDefinition() {
    return adaptersFactory.createTimerEventDefinitionAdapter(bpmn2Adaptee.createTimerEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LinkEventDefinition createLinkEventDefinition() {
    return adaptersFactory.createLinkEventDefinitionAdapter(bpmn2Adaptee.createLinkEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MessageEventDefinition createMessageEventDefinition() {
    return adaptersFactory.createMessageEventDefinitionAdapter(bpmn2Adaptee.createMessageEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConditionalEventDefinition createConditionalEventDefinition() {
    return adaptersFactory.createConditionalEventDefinitionAdapter(bpmn2Adaptee.createConditionalEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SignalEventDefinition createSignalEventDefinition() {
    return adaptersFactory.createSignalEventDefinitionAdapter(bpmn2Adaptee.createSignalEventDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Signal createSignal() {
    return adaptersFactory.createSignalAdapter(bpmn2Adaptee.createSignal(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ImplicitThrowEvent createImplicitThrowEvent() {
    return adaptersFactory.createImplicitThrowEventAdapter(bpmn2Adaptee.createImplicitThrowEvent(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataObject createDataObject() {
    return adaptersFactory.createDataObjectAdapter(bpmn2Adaptee.createDataObject(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataStore createDataStore() {
    return adaptersFactory.createDataStoreAdapter(bpmn2Adaptee.createDataStore(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataStoreReference createDataStoreReference() {
    return adaptersFactory.createDataStoreReferenceAdapter(bpmn2Adaptee.createDataStoreReference(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataObjectReference createDataObjectReference() {
    return adaptersFactory.createDataObjectReferenceAdapter(bpmn2Adaptee.createDataObjectReference(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallConversation createCallConversation() {
    return adaptersFactory.createCallConversationAdapter(bpmn2Adaptee.createCallConversation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Conversation createConversation() {
    return adaptersFactory.createConversationAdapter(bpmn2Adaptee.createConversation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubConversation createSubConversation() {
    return adaptersFactory.createSubConversationAdapter(bpmn2Adaptee.createSubConversation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalConversation createGlobalConversation() {
    return adaptersFactory.createGlobalConversationAdapter(bpmn2Adaptee.createGlobalConversation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.PartnerEntity createPartnerEntity() {
    return adaptersFactory.createPartnerEntityAdapter(bpmn2Adaptee.createPartnerEntity(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.PartnerRole createPartnerRole() {
    return adaptersFactory.createPartnerRoleAdapter(bpmn2Adaptee.createPartnerRole(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallChoreography createCallChoreography() {
    return adaptersFactory.createCallChoreographyAdapter(bpmn2Adaptee.createCallChoreography(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubChoreography createSubChoreography() {
    return adaptersFactory.createSubChoreographyAdapter(bpmn2Adaptee.createSubChoreography(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyTask createChoreographyTask() {
    return adaptersFactory.createChoreographyTaskAdapter(bpmn2Adaptee.createChoreographyTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalChoreographyTask createGlobalChoreographyTask() {
    return adaptersFactory.createGlobalChoreographyTaskAdapter(bpmn2Adaptee.createGlobalChoreographyTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.TextAnnotation createTextAnnotation() {
    return adaptersFactory.createTextAnnotationAdapter(bpmn2Adaptee.createTextAnnotation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Group createGroup() {
    return adaptersFactory.createGroupAdapter(bpmn2Adaptee.createGroup(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Association createAssociation() {
    return adaptersFactory.createAssociationAdapter(bpmn2Adaptee.createAssociation(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Category createCategory() {
    return adaptersFactory.createCategoryAdapter(bpmn2Adaptee.createCategory(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ServiceTask createServiceTask() {
    return adaptersFactory.createServiceTaskAdapter(bpmn2Adaptee.createServiceTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubProcess createSubProcess() {
    return adaptersFactory.createSubProcessAdapter(bpmn2Adaptee.createSubProcess(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
    return adaptersFactory.createMultiInstanceLoopCharacteristicsAdapter(bpmn2Adaptee.createMultiInstanceLoopCharacteristics(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ComplexBehaviorDefinition createComplexBehaviorDefinition() {
    return adaptersFactory.createComplexBehaviorDefinitionAdapter(bpmn2Adaptee.createComplexBehaviorDefinition(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.StandardLoopCharacteristics createStandardLoopCharacteristics() {
    return adaptersFactory.createStandardLoopCharacteristicsAdapter(bpmn2Adaptee.createStandardLoopCharacteristics(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallActivity createCallActivity() {
    return adaptersFactory.createCallActivityAdapter(bpmn2Adaptee.createCallActivity(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SendTask createSendTask() {
    return adaptersFactory.createSendTaskAdapter(bpmn2Adaptee.createSendTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ReceiveTask createReceiveTask() {
    return adaptersFactory.createReceiveTaskAdapter(bpmn2Adaptee.createReceiveTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ScriptTask createScriptTask() {
    return adaptersFactory.createScriptTaskAdapter(bpmn2Adaptee.createScriptTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BusinessRuleTask createBusinessRuleTask() {
    return adaptersFactory.createBusinessRuleTaskAdapter(bpmn2Adaptee.createBusinessRuleTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.AdHocSubProcess createAdHocSubProcess() {
    return adaptersFactory.createAdHocSubProcessAdapter(bpmn2Adaptee.createAdHocSubProcess(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Transaction createTransaction() {
    return adaptersFactory.createTransactionAdapter(bpmn2Adaptee.createTransaction(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalScriptTask createGlobalScriptTask() {
    return adaptersFactory.createGlobalScriptTaskAdapter(bpmn2Adaptee.createGlobalScriptTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
    return adaptersFactory.createGlobalBusinessRuleTaskAdapter(bpmn2Adaptee.createGlobalBusinessRuleTask(), null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Definitions createDefinitions() {
    return adaptersFactory.createDefinitionsAdapter(bpmn2Adaptee.createDefinitions(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getBpmn2Package();
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package getBpmn2Package() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE;
  }
}
