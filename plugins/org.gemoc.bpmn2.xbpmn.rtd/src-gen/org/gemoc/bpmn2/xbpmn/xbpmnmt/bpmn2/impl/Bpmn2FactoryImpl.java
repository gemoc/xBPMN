/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.AdHocOrdering;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.AdHocSubProcess;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Assignment;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Association;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.AssociationDirection;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BoundaryEvent;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Factory;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.BusinessRuleTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallActivity;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallChoreography;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallConversation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CancelEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Category;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CategoryValue;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Choreography;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Collaboration;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CompensateEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ComplexBehaviorDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ComplexGateway;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConditionalEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Conversation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ConversationLink;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationKey;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationProperty;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyBinding;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyRetrievalExpression;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationSubscription;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInput;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInputAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataObject;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataObjectReference;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutput;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutputAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataState;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataStore;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataStoreReference;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Definitions;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EndEvent;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EndPoint;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ErrorEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Escalation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EscalationEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventBasedGateway;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.EventBasedGatewayType;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExclusiveGateway;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Expression;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Extension;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FormalExpression;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GatewayDirection;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalBusinessRuleTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalChoreographyTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalConversation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalManualTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalScriptTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalUserTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Group;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.HumanPerformer;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ImplicitThrowEvent;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Import;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InclusiveGateway;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputBinding;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputSet;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Interface;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.IntermediateCatchEvent;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.IntermediateThrowEvent;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemAwareElement;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ItemKind;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Lane;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LaneSet;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LinkEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ManualTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Message;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MessageEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MessageFlow;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MessageFlowAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceBehavior;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.MultiInstanceLoopCharacteristics;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Operation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.OutputSet;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParallelGateway;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantMultiplicity;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.PartnerEntity;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.PartnerRole;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Performer;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.PotentialOwner;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ProcessType;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ReceiveTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Relationship;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.RelationshipDirection;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Rendering;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Resource;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceAssignmentExpression;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameterBinding;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceRole;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ScriptTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SendTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SequenceFlow;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ServiceTask;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Signal;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SignalEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.StandardLoopCharacteristics;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.StartEvent;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubChoreography;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubConversation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SubProcess;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Task;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.TerminateEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.TextAnnotation;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.TimerEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Transaction;
import org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.UserTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bpmn2FactoryImpl extends EFactoryImpl implements Bpmn2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bpmn2Factory init() {
		try {
			Bpmn2Factory theBpmn2Factory = (Bpmn2Factory)EPackage.Registry.INSTANCE.getEFactory(Bpmn2Package.eNS_URI);
			if (theBpmn2Factory != null) {
				return theBpmn2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bpmn2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bpmn2Package.INTERFACE: return createInterface();
			case Bpmn2Package.EXTENSION_DEFINITION: return createExtensionDefinition();
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION: return createExtensionAttributeDefinition();
			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE: return createExtensionAttributeValue();
			case Bpmn2Package.DOCUMENTATION: return createDocumentation();
			case Bpmn2Package.OPERATION: return createOperation();
			case Bpmn2Package.MESSAGE: return createMessage();
			case Bpmn2Package.ITEM_DEFINITION: return createItemDefinition();
			case Bpmn2Package.IMPORT: return createImport();
			case Bpmn2Package.ERROR: return createError();
			case Bpmn2Package.END_POINT: return createEndPoint();
			case Bpmn2Package.AUDITING: return createAuditing();
			case Bpmn2Package.GLOBAL_TASK: return createGlobalTask();
			case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION: return createInputOutputSpecification();
			case Bpmn2Package.INPUT_SET: return createInputSet();
			case Bpmn2Package.DATA_INPUT: return createDataInput();
			case Bpmn2Package.ITEM_AWARE_ELEMENT: return createItemAwareElement();
			case Bpmn2Package.DATA_STATE: return createDataState();
			case Bpmn2Package.OUTPUT_SET: return createOutputSet();
			case Bpmn2Package.DATA_OUTPUT: return createDataOutput();
			case Bpmn2Package.INPUT_OUTPUT_BINDING: return createInputOutputBinding();
			case Bpmn2Package.RESOURCE_ROLE: return createResourceRole();
			case Bpmn2Package.RESOURCE: return createResource();
			case Bpmn2Package.RESOURCE_PARAMETER: return createResourceParameter();
			case Bpmn2Package.RESOURCE_PARAMETER_BINDING: return createResourceParameterBinding();
			case Bpmn2Package.EXPRESSION: return createExpression();
			case Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION: return createResourceAssignmentExpression();
			case Bpmn2Package.MONITORING: return createMonitoring();
			case Bpmn2Package.PERFORMER: return createPerformer();
			case Bpmn2Package.PROCESS: return createProcess();
			case Bpmn2Package.CATEGORY_VALUE: return createCategoryValue();
			case Bpmn2Package.LANE_SET: return createLaneSet();
			case Bpmn2Package.LANE: return createLane();
			case Bpmn2Package.SEQUENCE_FLOW: return createSequenceFlow();
			case Bpmn2Package.PROPERTY: return createProperty();
			case Bpmn2Package.COLLABORATION: return createCollaboration();
			case Bpmn2Package.CHOREOGRAPHY: return createChoreography();
			case Bpmn2Package.PARTICIPANT_ASSOCIATION: return createParticipantAssociation();
			case Bpmn2Package.PARTICIPANT: return createParticipant();
			case Bpmn2Package.CONVERSATION_LINK: return createConversationLink();
			case Bpmn2Package.PARTICIPANT_MULTIPLICITY: return createParticipantMultiplicity();
			case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION: return createMessageFlowAssociation();
			case Bpmn2Package.MESSAGE_FLOW: return createMessageFlow();
			case Bpmn2Package.CONVERSATION_ASSOCIATION: return createConversationAssociation();
			case Bpmn2Package.CORRELATION_KEY: return createCorrelationKey();
			case Bpmn2Package.CORRELATION_PROPERTY: return createCorrelationProperty();
			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION: return createCorrelationPropertyRetrievalExpression();
			case Bpmn2Package.FORMAL_EXPRESSION: return createFormalExpression();
			case Bpmn2Package.CORRELATION_SUBSCRIPTION: return createCorrelationSubscription();
			case Bpmn2Package.CORRELATION_PROPERTY_BINDING: return createCorrelationPropertyBinding();
			case Bpmn2Package.GLOBAL_MANUAL_TASK: return createGlobalManualTask();
			case Bpmn2Package.MANUAL_TASK: return createManualTask();
			case Bpmn2Package.TASK: return createTask();
			case Bpmn2Package.BOUNDARY_EVENT: return createBoundaryEvent();
			case Bpmn2Package.DATA_OUTPUT_ASSOCIATION: return createDataOutputAssociation();
			case Bpmn2Package.DATA_ASSOCIATION: return createDataAssociation();
			case Bpmn2Package.ASSIGNMENT: return createAssignment();
			case Bpmn2Package.DATA_INPUT_ASSOCIATION: return createDataInputAssociation();
			case Bpmn2Package.USER_TASK: return createUserTask();
			case Bpmn2Package.RENDERING: return createRendering();
			case Bpmn2Package.HUMAN_PERFORMER: return createHumanPerformer();
			case Bpmn2Package.POTENTIAL_OWNER: return createPotentialOwner();
			case Bpmn2Package.GLOBAL_USER_TASK: return createGlobalUserTask();
			case Bpmn2Package.EVENT_BASED_GATEWAY: return createEventBasedGateway();
			case Bpmn2Package.COMPLEX_GATEWAY: return createComplexGateway();
			case Bpmn2Package.EXCLUSIVE_GATEWAY: return createExclusiveGateway();
			case Bpmn2Package.INCLUSIVE_GATEWAY: return createInclusiveGateway();
			case Bpmn2Package.PARALLEL_GATEWAY: return createParallelGateway();
			case Bpmn2Package.RELATIONSHIP: return createRelationship();
			case Bpmn2Package.EXTENSION: return createExtension();
			case Bpmn2Package.INTERMEDIATE_CATCH_EVENT: return createIntermediateCatchEvent();
			case Bpmn2Package.INTERMEDIATE_THROW_EVENT: return createIntermediateThrowEvent();
			case Bpmn2Package.END_EVENT: return createEndEvent();
			case Bpmn2Package.START_EVENT: return createStartEvent();
			case Bpmn2Package.CANCEL_EVENT_DEFINITION: return createCancelEventDefinition();
			case Bpmn2Package.ERROR_EVENT_DEFINITION: return createErrorEventDefinition();
			case Bpmn2Package.TERMINATE_EVENT_DEFINITION: return createTerminateEventDefinition();
			case Bpmn2Package.ESCALATION_EVENT_DEFINITION: return createEscalationEventDefinition();
			case Bpmn2Package.ESCALATION: return createEscalation();
			case Bpmn2Package.COMPENSATE_EVENT_DEFINITION: return createCompensateEventDefinition();
			case Bpmn2Package.TIMER_EVENT_DEFINITION: return createTimerEventDefinition();
			case Bpmn2Package.LINK_EVENT_DEFINITION: return createLinkEventDefinition();
			case Bpmn2Package.MESSAGE_EVENT_DEFINITION: return createMessageEventDefinition();
			case Bpmn2Package.CONDITIONAL_EVENT_DEFINITION: return createConditionalEventDefinition();
			case Bpmn2Package.SIGNAL_EVENT_DEFINITION: return createSignalEventDefinition();
			case Bpmn2Package.SIGNAL: return createSignal();
			case Bpmn2Package.IMPLICIT_THROW_EVENT: return createImplicitThrowEvent();
			case Bpmn2Package.DATA_OBJECT: return createDataObject();
			case Bpmn2Package.DATA_STORE: return createDataStore();
			case Bpmn2Package.DATA_STORE_REFERENCE: return createDataStoreReference();
			case Bpmn2Package.DATA_OBJECT_REFERENCE: return createDataObjectReference();
			case Bpmn2Package.CALL_CONVERSATION: return createCallConversation();
			case Bpmn2Package.CONVERSATION: return createConversation();
			case Bpmn2Package.SUB_CONVERSATION: return createSubConversation();
			case Bpmn2Package.GLOBAL_CONVERSATION: return createGlobalConversation();
			case Bpmn2Package.PARTNER_ENTITY: return createPartnerEntity();
			case Bpmn2Package.PARTNER_ROLE: return createPartnerRole();
			case Bpmn2Package.CALL_CHOREOGRAPHY: return createCallChoreography();
			case Bpmn2Package.SUB_CHOREOGRAPHY: return createSubChoreography();
			case Bpmn2Package.CHOREOGRAPHY_TASK: return createChoreographyTask();
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK: return createGlobalChoreographyTask();
			case Bpmn2Package.TEXT_ANNOTATION: return createTextAnnotation();
			case Bpmn2Package.GROUP: return createGroup();
			case Bpmn2Package.ASSOCIATION: return createAssociation();
			case Bpmn2Package.CATEGORY: return createCategory();
			case Bpmn2Package.SERVICE_TASK: return createServiceTask();
			case Bpmn2Package.SUB_PROCESS: return createSubProcess();
			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS: return createMultiInstanceLoopCharacteristics();
			case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION: return createComplexBehaviorDefinition();
			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS: return createStandardLoopCharacteristics();
			case Bpmn2Package.CALL_ACTIVITY: return createCallActivity();
			case Bpmn2Package.SEND_TASK: return createSendTask();
			case Bpmn2Package.RECEIVE_TASK: return createReceiveTask();
			case Bpmn2Package.SCRIPT_TASK: return createScriptTask();
			case Bpmn2Package.BUSINESS_RULE_TASK: return createBusinessRuleTask();
			case Bpmn2Package.AD_HOC_SUB_PROCESS: return createAdHocSubProcess();
			case Bpmn2Package.TRANSACTION: return createTransaction();
			case Bpmn2Package.GLOBAL_SCRIPT_TASK: return createGlobalScriptTask();
			case Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK: return createGlobalBusinessRuleTask();
			case Bpmn2Package.DEFINITIONS: return createDefinitions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Bpmn2Package.ITEM_KIND:
				return createItemKindFromString(eDataType, initialValue);
			case Bpmn2Package.PROCESS_TYPE:
				return createProcessTypeFromString(eDataType, initialValue);
			case Bpmn2Package.GATEWAY_DIRECTION:
				return createGatewayDirectionFromString(eDataType, initialValue);
			case Bpmn2Package.EVENT_BASED_GATEWAY_TYPE:
				return createEventBasedGatewayTypeFromString(eDataType, initialValue);
			case Bpmn2Package.RELATIONSHIP_DIRECTION:
				return createRelationshipDirectionFromString(eDataType, initialValue);
			case Bpmn2Package.CHOREOGRAPHY_LOOP_TYPE:
				return createChoreographyLoopTypeFromString(eDataType, initialValue);
			case Bpmn2Package.ASSOCIATION_DIRECTION:
				return createAssociationDirectionFromString(eDataType, initialValue);
			case Bpmn2Package.MULTI_INSTANCE_BEHAVIOR:
				return createMultiInstanceBehaviorFromString(eDataType, initialValue);
			case Bpmn2Package.AD_HOC_ORDERING:
				return createAdHocOrderingFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Bpmn2Package.ITEM_KIND:
				return convertItemKindToString(eDataType, instanceValue);
			case Bpmn2Package.PROCESS_TYPE:
				return convertProcessTypeToString(eDataType, instanceValue);
			case Bpmn2Package.GATEWAY_DIRECTION:
				return convertGatewayDirectionToString(eDataType, instanceValue);
			case Bpmn2Package.EVENT_BASED_GATEWAY_TYPE:
				return convertEventBasedGatewayTypeToString(eDataType, instanceValue);
			case Bpmn2Package.RELATIONSHIP_DIRECTION:
				return convertRelationshipDirectionToString(eDataType, instanceValue);
			case Bpmn2Package.CHOREOGRAPHY_LOOP_TYPE:
				return convertChoreographyLoopTypeToString(eDataType, instanceValue);
			case Bpmn2Package.ASSOCIATION_DIRECTION:
				return convertAssociationDirectionToString(eDataType, instanceValue);
			case Bpmn2Package.MULTI_INSTANCE_BEHAVIOR:
				return convertMultiInstanceBehaviorToString(eDataType, instanceValue);
			case Bpmn2Package.AD_HOC_ORDERING:
				return convertAdHocOrderingToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition createExtensionDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition createExtensionAttributeDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeValue createExtensionAttributeValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition createItemDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Error createError() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPoint createEndPoint() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing createAuditing() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTask createGlobalTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification createInputOutputSpecification() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet createInputSet() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput createDataInput() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement createItemAwareElement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState createDataState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet createOutputSet() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput createDataOutput() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputBinding createInputOutputBinding() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole createResourceRole() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameter createResourceParameter() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameterBinding createResourceParameterBinding() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAssignmentExpression createResourceAssignmentExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring createMonitoring() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer createPerformer() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process createProcess() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue createCategoryValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet createLaneSet() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography createChoreography() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantAssociation createParticipantAssociation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationLink createConversationLink() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity createParticipantMultiplicity() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlowAssociation createMessageFlowAssociation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow createMessageFlow() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAssociation createConversationAssociation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey createCorrelationKey() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty createCorrelationProperty() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression createFormalExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSubscription createCorrelationSubscription() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyBinding createCorrelationPropertyBinding() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalManualTask createGlobalManualTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualTask createManualTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent createBoundaryEvent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutputAssociation createDataOutputAssociation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation createDataAssociation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInputAssociation createDataInputAssociation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering createRendering() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanPerformer createHumanPerformer() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialOwner createPotentialOwner() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalUserTask createGlobalUserTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGateway createEventBasedGateway() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexGateway createComplexGateway() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveGateway createInclusiveGateway() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEvent createIntermediateCatchEvent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateThrowEvent createIntermediateThrowEvent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelEventDefinition createCancelEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventDefinition createErrorEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateEventDefinition createTerminateEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscalationEventDefinition createEscalationEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation createEscalation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateEventDefinition createCompensateEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEventDefinition createTimerEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEventDefinition createLinkEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventDefinition createMessageEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalEventDefinition createConditionalEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEventDefinition createSignalEventDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent createImplicitThrowEvent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore createDataStore() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreReference createDataStoreReference() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectReference createDataObjectReference() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConversation createCallConversation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversation createConversation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubConversation createSubConversation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalConversation createGlobalConversation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerEntity createPartnerEntity() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerRole createPartnerRole() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallChoreography createCallChoreography() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubChoreography createSubChoreography() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyTask createChoreographyTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalChoreographyTask createGlobalChoreographyTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAnnotation createTextAnnotation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess createSubProcess() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristics createStandardLoopCharacteristics() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActivity createCallActivity() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendTask createSendTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveTask createReceiveTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTask createScriptTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRuleTask createBusinessRuleTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocSubProcess createAdHocSubProcess() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScriptTask createGlobalScriptTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemKind createItemKindFromString(EDataType eDataType, String initialValue) {
		ItemKind result = ItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
		ProcessType result = ProcessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		GatewayDirection result = GatewayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayType createEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
		EventBasedGatewayType result = EventBasedGatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDirection createRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
		RelationshipDirection result = RelationshipDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyLoopType createChoreographyLoopTypeFromString(EDataType eDataType, String initialValue) {
		ChoreographyLoopType result = ChoreographyLoopType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoreographyLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		AssociationDirection result = AssociationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceBehavior createMultiInstanceBehaviorFromString(EDataType eDataType, String initialValue) {
		MultiInstanceBehavior result = MultiInstanceBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiInstanceBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType, String initialValue) {
		AdHocOrdering result = AdHocOrdering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2Package getBpmn2Package() {
		return (Bpmn2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bpmn2Package getPackage() {
		return Bpmn2Package.eINSTANCE;
	}

} //Bpmn2FactoryImpl
