package org.gemoc.xbpmn.k3dsa.bpmn2.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.obeonetwork.dsl.bpmn2.Interface
import org.obeonetwork.dsl.bpmn2.RootElement
import org.obeonetwork.dsl.bpmn2.BaseElement
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue
import org.obeonetwork.dsl.bpmn2.Documentation
import org.obeonetwork.dsl.bpmn2.Operation
import org.obeonetwork.dsl.bpmn2.Message
import org.obeonetwork.dsl.bpmn2.ItemDefinition
import org.obeonetwork.dsl.bpmn2.Import
import org.obeonetwork.dsl.bpmn2.Error
import org.obeonetwork.dsl.bpmn2.EndPoint
import org.obeonetwork.dsl.bpmn2.Auditing
import org.obeonetwork.dsl.bpmn2.GlobalTask
import org.obeonetwork.dsl.bpmn2.CallableElement
import org.obeonetwork.dsl.bpmn2.InputOutputSpecification
import org.obeonetwork.dsl.bpmn2.InputSet
import org.obeonetwork.dsl.bpmn2.DataInput
import org.obeonetwork.dsl.bpmn2.ItemAwareElement
import org.obeonetwork.dsl.bpmn2.DataState
import org.obeonetwork.dsl.bpmn2.OutputSet
import org.obeonetwork.dsl.bpmn2.DataOutput
import org.obeonetwork.dsl.bpmn2.InputOutputBinding
import org.obeonetwork.dsl.bpmn2.ResourceRole
import org.obeonetwork.dsl.bpmn2.Resource
import org.obeonetwork.dsl.bpmn2.ResourceParameter
import org.obeonetwork.dsl.bpmn2.ResourceParameterBinding
import org.obeonetwork.dsl.bpmn2.Expression
import org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression
import org.obeonetwork.dsl.bpmn2.Monitoring
import org.obeonetwork.dsl.bpmn2.Performer
import org.obeonetwork.dsl.bpmn2.Process
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer
import org.obeonetwork.dsl.bpmn2.FlowElement
import org.obeonetwork.dsl.bpmn2.CategoryValue
import org.obeonetwork.dsl.bpmn2.LaneSet
import org.obeonetwork.dsl.bpmn2.Lane
import org.obeonetwork.dsl.bpmn2.FlowNode
import org.obeonetwork.dsl.bpmn2.SequenceFlow
import org.obeonetwork.dsl.bpmn2.Property
import org.obeonetwork.dsl.bpmn2.Collaboration
import org.obeonetwork.dsl.bpmn2.Choreography
import org.obeonetwork.dsl.bpmn2.Artifact
import org.obeonetwork.dsl.bpmn2.ParticipantAssociation
import org.obeonetwork.dsl.bpmn2.Participant
import org.obeonetwork.dsl.bpmn2.InteractionNode
import org.obeonetwork.dsl.bpmn2.ConversationLink
import org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity
import org.obeonetwork.dsl.bpmn2.MessageFlowAssociation
import org.obeonetwork.dsl.bpmn2.MessageFlow
import org.obeonetwork.dsl.bpmn2.ConversationAssociation
import org.obeonetwork.dsl.bpmn2.ConversationNode
import org.obeonetwork.dsl.bpmn2.CorrelationKey
import org.obeonetwork.dsl.bpmn2.CorrelationProperty
import org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression
import org.obeonetwork.dsl.bpmn2.FormalExpression
import org.obeonetwork.dsl.bpmn2.CorrelationSubscription
import org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding
import org.obeonetwork.dsl.bpmn2.GlobalManualTask
import org.obeonetwork.dsl.bpmn2.ManualTask
import org.obeonetwork.dsl.bpmn2.Task
import org.obeonetwork.dsl.bpmn2.Activity
import org.obeonetwork.dsl.bpmn2.LoopCharacteristics
import org.obeonetwork.dsl.bpmn2.BoundaryEvent
import org.obeonetwork.dsl.bpmn2.CatchEvent
import org.obeonetwork.dsl.bpmn2.Event
import org.obeonetwork.dsl.bpmn2.EventDefinition
import org.obeonetwork.dsl.bpmn2.DataOutputAssociation
import org.obeonetwork.dsl.bpmn2.DataAssociation
import org.obeonetwork.dsl.bpmn2.Assignment
import org.obeonetwork.dsl.bpmn2.DataInputAssociation
import org.obeonetwork.dsl.bpmn2.UserTask
import org.obeonetwork.dsl.bpmn2.Rendering
import org.obeonetwork.dsl.bpmn2.HumanPerformer
import org.obeonetwork.dsl.bpmn2.PotentialOwner
import org.obeonetwork.dsl.bpmn2.GlobalUserTask
import org.obeonetwork.dsl.bpmn2.Gateway
import org.obeonetwork.dsl.bpmn2.EventBasedGateway
import org.obeonetwork.dsl.bpmn2.ComplexGateway
import org.obeonetwork.dsl.bpmn2.ExclusiveGateway
import org.obeonetwork.dsl.bpmn2.InclusiveGateway
import org.obeonetwork.dsl.bpmn2.ParallelGateway
import org.obeonetwork.dsl.bpmn2.Relationship
import org.obeonetwork.dsl.bpmn2.Extension
import org.obeonetwork.dsl.bpmn2.IntermediateCatchEvent
import org.obeonetwork.dsl.bpmn2.IntermediateThrowEvent
import org.obeonetwork.dsl.bpmn2.ThrowEvent
import org.obeonetwork.dsl.bpmn2.EndEvent
import org.obeonetwork.dsl.bpmn2.StartEvent
import org.obeonetwork.dsl.bpmn2.CancelEventDefinition
import org.obeonetwork.dsl.bpmn2.ErrorEventDefinition
import org.obeonetwork.dsl.bpmn2.TerminateEventDefinition
import org.obeonetwork.dsl.bpmn2.EscalationEventDefinition
import org.obeonetwork.dsl.bpmn2.Escalation
import org.obeonetwork.dsl.bpmn2.CompensateEventDefinition
import org.obeonetwork.dsl.bpmn2.TimerEventDefinition
import org.obeonetwork.dsl.bpmn2.LinkEventDefinition
import org.obeonetwork.dsl.bpmn2.MessageEventDefinition
import org.obeonetwork.dsl.bpmn2.ConditionalEventDefinition
import org.obeonetwork.dsl.bpmn2.SignalEventDefinition
import org.obeonetwork.dsl.bpmn2.Signal
import org.obeonetwork.dsl.bpmn2.ImplicitThrowEvent
import org.obeonetwork.dsl.bpmn2.DataObject
import org.obeonetwork.dsl.bpmn2.DataStore
import org.obeonetwork.dsl.bpmn2.DataStoreReference
import org.obeonetwork.dsl.bpmn2.DataObjectReference
import org.obeonetwork.dsl.bpmn2.CallConversation
import org.obeonetwork.dsl.bpmn2.Conversation
import org.obeonetwork.dsl.bpmn2.SubConversation
import org.obeonetwork.dsl.bpmn2.GlobalConversation
import org.obeonetwork.dsl.bpmn2.PartnerEntity
import org.obeonetwork.dsl.bpmn2.PartnerRole
import org.obeonetwork.dsl.bpmn2.ChoreographyActivity
import org.obeonetwork.dsl.bpmn2.CallChoreography
import org.obeonetwork.dsl.bpmn2.SubChoreography
import org.obeonetwork.dsl.bpmn2.ChoreographyTask
import org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask
import org.obeonetwork.dsl.bpmn2.TextAnnotation
import org.obeonetwork.dsl.bpmn2.Group
import org.obeonetwork.dsl.bpmn2.Association
import org.obeonetwork.dsl.bpmn2.Category
import org.obeonetwork.dsl.bpmn2.ServiceTask
import org.obeonetwork.dsl.bpmn2.SubProcess
import org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics
import org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition
import org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics
import org.obeonetwork.dsl.bpmn2.CallActivity
import org.obeonetwork.dsl.bpmn2.SendTask
import org.obeonetwork.dsl.bpmn2.ReceiveTask
import org.obeonetwork.dsl.bpmn2.ScriptTask
import org.obeonetwork.dsl.bpmn2.BusinessRuleTask
import org.obeonetwork.dsl.bpmn2.AdHocSubProcess
import org.obeonetwork.dsl.bpmn2.Transaction
import org.obeonetwork.dsl.bpmn2.GlobalScriptTask
import org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask
import org.obeonetwork.dsl.bpmn2.Definitions

import org.gemoc.xbpmn.k3dsa.commons.NotImplementedException
import org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage
import java.util.ArrayList
import org.obeonetwork.dsl.bpmn2.dynamic.Token

import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.InterfaceAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.RootElementAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.BaseElementAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ExtensionDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ExtensionAttributeDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ExtensionAttributeValueAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DocumentationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.OperationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.MessageAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ItemDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ImportAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ErrorAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EndPointAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.AuditingAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GlobalTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CallableElementAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.InputOutputSpecificationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.InputSetAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataInputAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ItemAwareElementAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataStateAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.OutputSetAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataOutputAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.InputOutputBindingAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ResourceRoleAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ResourceAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ResourceParameterAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ResourceParameterBindingAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ExpressionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ResourceAssignmentExpressionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.MonitoringAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.PerformerAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.FlowElementsContainerAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.FlowElementAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CategoryValueAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LaneSetAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LaneAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.FlowNodeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SequenceFlowAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.PropertyAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CollaborationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ChoreographyAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ArtifactAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ParticipantAssociationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ParticipantAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.InteractionNodeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ConversationLinkAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ParticipantMultiplicityAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.MessageFlowAssociationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.MessageFlowAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ConversationAssociationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ConversationNodeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CorrelationKeyAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CorrelationPropertyAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CorrelationPropertyRetrievalExpressionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.FormalExpressionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CorrelationSubscriptionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CorrelationPropertyBindingAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GlobalManualTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ManualTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ActivityAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LoopCharacteristicsAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.BoundaryEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CatchEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataOutputAssociationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataAssociationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.AssignmentAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataInputAssociationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.UserTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.RenderingAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.HumanPerformerAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.PotentialOwnerAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GlobalUserTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GatewayAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EventBasedGatewayAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ComplexGatewayAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ExclusiveGatewayAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.InclusiveGatewayAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ParallelGatewayAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.RelationshipAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ExtensionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.IntermediateCatchEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.IntermediateThrowEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ThrowEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EndEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.StartEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CancelEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ErrorEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TerminateEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EscalationEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EscalationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CompensateEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TimerEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LinkEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.MessageEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ConditionalEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SignalEventDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SignalAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ImplicitThrowEventAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataObjectAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataStoreAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataStoreReferenceAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DataObjectReferenceAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CallConversationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ConversationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SubConversationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GlobalConversationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.PartnerEntityAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.PartnerRoleAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ChoreographyActivityAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CallChoreographyAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SubChoreographyAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ChoreographyTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GlobalChoreographyTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TextAnnotationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GroupAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.AssociationAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CategoryAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ServiceTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SubProcessAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.MultiInstanceLoopCharacteristicsAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ComplexBehaviorDefinitionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.StandardLoopCharacteristicsAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.CallActivityAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SendTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ReceiveTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ScriptTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.BusinessRuleTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.AdHocSubProcessAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TransactionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GlobalScriptTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GlobalBusinessRuleTaskAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DefinitionsAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TokenAspect.*

import static extension org.gemoc.xbpmn.k3dsa.ecore.aspects.EObjectAspect.*

import static extension  org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.emf.common.util.EList
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.api.Containment

@Aspect(className=Interface)
class InterfaceAspect extends RootElementAspect {

}

@Aspect(className=RootElement)
abstract class RootElementAspect extends BaseElementAspect {

}

@Aspect(className=BaseElement)
abstract class BaseElementAspect {
	
	//public Integer startCounter = 0
	
	def void startEval() {
		throw new NotImplementedException('not implemented, please implement startEval() for '+_self );
	}

	def void endEval() {
		throw new NotImplementedException('not implemented, please implement startEval() for '+_self );
	}
}

@Aspect(className=Lane)
class LaneAspect extends BaseElementAspect {
	
	public Boolean isStarted = false
	
	def void startEval() {
		_self.info("Starting Lane "+_self.name)
		_self.isStarted = true
	}

	def void endEval() {
		_self.info("Ending   Lane "+_self.name)
		_self.isStarted = false
	}
}

@Aspect(className=Definitions)
class DefinitionsAspect extends BaseElementAspect {

}

@Aspect(className=ExtensionDefinition)
class ExtensionDefinitionAspect {

}

@Aspect(className=ExtensionAttributeDefinition)
class ExtensionAttributeDefinitionAspect {

}

@Aspect(className=ExtensionAttributeValue)
class ExtensionAttributeValueAspect {

}

@Aspect(className=Documentation)
class DocumentationAspect extends BaseElementAspect {

}

@Aspect(className=Operation)
class OperationAspect extends BaseElementAspect {

}

@Aspect(className=Message)
class MessageAspect extends RootElementAspect {

}

@Aspect(className=ItemDefinition)
class ItemDefinitionAspect extends RootElementAspect {

}

@Aspect(className=Import)
class ImportAspect {

}

@Aspect(className=Error)
class ErrorAspect extends RootElementAspect {

}

@Aspect(className=EndPoint)
class EndPointAspect extends RootElementAspect {

}

@Aspect(className=Auditing)
class AuditingAspect extends BaseElementAspect {

}

@Aspect(className=GlobalTask)
class GlobalTaskAspect extends CallableElementAspect {

}

@Aspect(className=CallableElement)
abstract class CallableElementAspect extends RootElementAspect {

}

@Aspect(className=Process)
class ProcessAspect extends CallableElementAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/
	
	public Boolean isStarted = false
	public Integer startCounter = 0
	@Containment()
	public EList<Token> ownedTokens = new BasicEList<Token>()
	
	def String contextInfo() {
		_self.ownedTokens
		'''PROCESS(«_self.name»)[startCounter=«_self.startCounter»; «FOR token : _self.ownedTokens BEFORE "\n " SEPARATOR ",\n " AFTER "\n"»«token.tokenInfo»«ENDFOR»]'''
	}
	
	def void startEval() {
		_self.info("Starting Process "+_self.name)
		_self.isStarted = true
	}

	def void endEval() {
		_self.info("Ending   Process "+_self.name)
		_self.isStarted = false
	}
}

@Aspect(className=InputOutputSpecification)
class InputOutputSpecificationAspect extends BaseElementAspect {

}

@Aspect(className=InputSet)
class InputSetAspect extends BaseElementAspect {

}

@Aspect(className=DataInput)
class DataInputAspect extends ItemAwareElementAspect {

}

@Aspect(className=ItemAwareElement)
class ItemAwareElementAspect extends BaseElementAspect {

}

@Aspect(className=DataState)
class DataStateAspect extends BaseElementAspect {

}

@Aspect(className=OutputSet)
class OutputSetAspect extends BaseElementAspect {

}

@Aspect(className=DataOutput)
class DataOutputAspect extends ItemAwareElementAspect {

}

@Aspect(className=InputOutputBinding)
class InputOutputBindingAspect {

}

@Aspect(className=ResourceRole)
class ResourceRoleAspect extends BaseElementAspect {

}

@Aspect(className=Resource)
class ResourceAspect extends RootElementAspect {

}

@Aspect(className=ResourceParameter)
class ResourceParameterAspect extends BaseElementAspect {

}

@Aspect(className=ResourceParameterBinding)
class ResourceParameterBindingAspect {

}

@Aspect(className=Expression)
class ExpressionAspect extends BaseElementAspect {

}

@Aspect(className=ResourceAssignmentExpression)
class ResourceAssignmentExpressionAspect {

}

@Aspect(className=Monitoring)
class MonitoringAspect extends BaseElementAspect {

}

@Aspect(className=Performer)
class PerformerAspect extends ResourceRoleAspect {

}



@Aspect(className=FlowElementsContainer)
abstract class FlowElementsContainerAspect extends BaseElementAspect {
//	public Integer startCounter = 0
//	public List<Token> ownedTokens = new ArrayList<Token>()
//	
//	def String contextInfo() {
//		_self.ownedTokens
//		'''[startCounter=«_self.startCounter»; «FOR token : _self.ownedTokens SEPARATOR ", "»«token.tokenInfo»«ENDFOR»]'''
//	}
}


@Aspect(className=FlowElement)
abstract class FlowElementAspect extends BaseElementAspect {
	//public List<Token> tokens = newArrayList
	// todo implement a method returning the list of tokens associated with this FlowElement
	
	/** tokens of the owning process that are  on this FlowElement
	 * Warning: derived; removing from this list will have not effect
	 */ 
	def List<Token> tokens() {
		val process = _self.getContainerOfType(Process)
		return process.ownedTokens.filter[t | t.position == _self].toList
	}
	
	def String tokensShortInfo() {
		'''[«FOR t : _self.tokens() BEFORE '[' SEPARATOR ',' AFTER ']' » «t.tokenShortInfo()»«ENDFOR»]'''
	}
	
}

@Aspect(className=FlowNode)
abstract class FlowNodeAspect extends FlowElementAspect {

}

@Aspect(className=SequenceFlow)
class SequenceFlowAspect extends FlowElementAspect {
		
	def void startEval() {
		_self.info("Starting  SequenceFlow "+_self.name)	
		//_self.devDebug('''     >«_self.getContainerOfType(Process).contextInfo»''')
		val sourceRef = _self.sourceRef
		val targetRef = _self.targetRef
		if(sourceRef.tokens.size == 0){
			_self.devError('''no token with position for sourceRef «sourceRef»''')
			
		}
		switch sourceRef {
			StartEvent : {
				switch targetRef {
		    		Activity : {
						// StartEvent to Activity
		    			sourceRef.tokens.get(0).moveToken(_self,_self.targetRef)
		    		}
		    		ParallelGateway : {
		    			// StartEvent to ParallelGateway
		    			sourceRef.tokens.get(0).moveToken(_self,_self.targetRef)
		    		}
		    		default : throw new NotImplementedException('startEval not implemented for SequenceFlow ' +_self + ' from ' +sourceRef + ' to ' + targetRef)
		    	}
			}
		    Activity : {
		    	switch targetRef {
		    		Activity : {
						// Activity to Activity
		    			sourceRef.tokens.get(0).moveToken(_self,_self.targetRef)
		    		}
		    		Gateway : {
		    			// Activity to Gateway
		    			sourceRef.tokens.get(0).moveToken(_self,_self.targetRef)
		    		}
		    		EndEvent : {
		    			// Activity to EndEvent
					//	_self.removeToken(sourceRef, targetRef)
		    		}
		    		default : throw new NotImplementedException('startEval not implemented for SequenceFlow ' +_self + ' from ' +sourceRef + ' to ' + targetRef)
		    	}
		    } 
		    Gateway : {
		    	switch targetRef {
		    		Activity : {
		    			// Gateway to Activity
		    			sourceRef.tokens.get(0).moveToken(_self,_self.targetRef)
		    			//throw new NotImplementedException('startEval not implemented for SequenceFlow ' +_self + ' from ' +sourceRef + ' to ' + targetRef)
		    		}
		    		Gateway : {
		    			// Gateway to Gateway
						throw new NotImplementedException('startEval not implemented for SequenceFlow ' +_self + ' from ' +sourceRef + ' to ' + targetRef)
		    		}
		    		EndEvent : {
		    			// Gateway to EndEvent
					//	_self.removeToken(sourceRef, targetRef)
		    		}
		    		default : throw new NotImplementedException('startEval not implemented for SequenceFlow ' +_self + ' from ' +sourceRef + ' to ' + targetRef)
		    	}
		    }
		    default : throw new NotImplementedException('startEval not implemented for SequenceFlow ' +_self + ' from ' +sourceRef + ' to ' + targetRef)
		}
		//_self.devDebug('''     <«_self.getContainerOfType(Process).contextInfo»''')
		
	}

	def void endEval() {
		_self.info("Ending  SequenceFlow "+_self.name)
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
	}
	
//	def void moveToken(FlowNode sourceRef, FlowNode targetRef) {
//		if(sourceRef.tokens.size > 0) {
//			val token = sourceRef.tokens.get(0)
//			_self.devDebug("before movetoken "+sourceRef+sourceRef.tokens+" -> "+targetRef+targetRef.tokens + " / "+ token.tokenInfo())
//			sourceRef.tokens.remove(token)
//			token.sourceSequenceFlow =  _self
//			token.position = targetRef
//			targetRef.tokens.add(token)
//			_self.devDebug("after movetoken "+sourceRef+sourceRef.tokens+" -> "+targetRef+targetRef.tokens + " / "+ token.tokenInfo())
//		} else {
//			throw new RuntimeException("error, cannot moveToken with SequenceFlow " +_self + ' from ' +sourceRef + ' to ' + targetRef + ". Missing token in sourceRef")
//		}
//	}
	
//	def void removeToken(FlowNode sourceRef, FlowNode targetRef) {
//		if(sourceRef.tokens.size > 0) {
//			sourceRef.tokens.clear
//		} else {
//			throw new RuntimeException("error, cannot removeToken for SequenceFlow " +_self + ' from ' +sourceRef + ' to ' + targetRef + ". Missing token in sourceRef")
//		}
//	}

}

@Aspect(className=Event)
abstract class EventAspect extends FlowNodeAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=CatchEvent)
abstract class CatchEventAspect extends EventAspect {

}
@Aspect(className=ThrowEvent)
abstract class ThrowEventAspect extends EventAspect {

}

@Aspect(className=IntermediateCatchEvent)
class IntermediateCatchEventAspect extends CatchEventAspect {

}

@Aspect(className=StartEvent)
class StartEventAspect extends CatchEventAspect {

	def void startEval() {
		_self.info("Starting  StartEvent "+_self.name)
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
		// initiate a token
		val token = DynamicPackage.eINSTANCE.dynamicFactory.createToken
		token.origin = _self
		token.position = _self
		// get or create context in containing Process (which is started simultaneously thanks to an ECL rule)
		val process = _self.getContainerOfType(Process) 
		
		
		process.ownedTokens.add(token)
		process.eResource.contents.add(token)
		// make sure to update RTD
		//process.ownedTokens = new ArrayList<Token>(process.ownedTokens)
		//process.ownedTokens = new BasicEList<Token>().addAll(process.ownedTokens)
		
		// increment startCount for the process
		process.startCounter = process.startCounter +1
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
	}

	def void endEval() {
		_self.info("Ending    StartEvent "+_self.name)
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
	}
}


@Aspect(className=BoundaryEvent)
class BoundaryEventAspect extends CatchEventAspect {

}


@Aspect(className=IntermediateThrowEvent)
class IntermediateThrowEventAspect extends ThrowEventAspect {

}


@Aspect(className=EndEvent)
class EndEventAspect extends ThrowEventAspect {

	def void startEval() {
		_self.info("Starting  EndEvent "+_self.name)
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
		
		// destroy containing process's context for the corresponding token
		val process = _self.getContainerOfType(Process) 
		process.ownedTokens.forEach[t | 
			t.position = null
			t.origin = null
			t.sourceSequenceFlow = null
			process.eResource.contents.remove(t)
		]
		process.ownedTokens.clear
		
		// make sure to update RTD
		// process.ownedTokens = new ArrayList<Token>()
	}

	def void endEval() {
		_self.info("Ending    EndEvent "+_self.name)
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
	}

}

@Aspect(className=ImplicitThrowEvent)
class ImplicitThrowEventAspect extends ThrowEventAspect {

}


@Aspect(className=Activity)
abstract class ActivityAspect extends FlowNodeAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}


@Aspect(className=Task)
class TaskAspect extends ActivityAspect {
	public Integer startCounter = 0
	public Boolean isStarted = false
	
	def void startEval() {
		_self.info("Starting  Task "+_self.name)
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
		//_self.devDebug('''     «_self.taskInfo»''')
		_self.isStarted = true
		
	 	// increment local startCounter for the Task
	 	_self.startCounter = _self.startCounter +1
	}

	def void endEval() {
		_self.info("Ending    Task "+_self.name)
		_self.isStarted = false
		//_self.devDebug('''     >«_self.getContainerOfType(Process).contextInfo»''')
		//_self.devDebug('''     «_self.taskInfo»''')
		switch _self.outgoing.size {
			case 0: {
				val process = _self.getContainerOfType(Process)
				// destroy the token on this element
				_self.tokens.toList.forEach[ t |
					t.position = null
					t.origin = null
					process.ownedTokens.remove(t)
					process.eResource.contents.remove(t)
				]
			}
			case 1: { if(_self.tokens.size == 1){
					_self.tokens.get(0).sourceSequenceFlow = _self.outgoing.get(0)
				} else {
					throw new RuntimeException("error, cannot moveToken to outgoing SequenceFlow for " +_self + " " + _self.name+ ". too many token on Task")
				}
			}
			default: {throw new NotImplementedException('endEval not implemented for Task ' +_self + ' with more than one outgoing')}
		}
		//_self.devDebug('''     <«_self.getContainerOfType(Process).contextInfo»''')
	}
	
	def String taskInfo() {
		'''TASK(«_self.name»)[startCounter=«_self.startCounter»; «FOR token : _self.tokens BEFORE "\n " SEPARATOR ",\n " AFTER "\n"»«token.tokenInfo»«ENDFOR»]'''
	}
}

@Aspect(className=ManualTask)
class ManualTaskAspect extends TaskAspect {

}



@Aspect(className=UserTask)
class UserTaskAspect extends TaskAspect {

}

@Aspect(className=Gateway)
abstract class GatewayAspect extends FlowNodeAspect {
	public Integer startCounter = 0
	def void startEval() {
		_self.info("Starting  Gateway "+_self.name)
		//_self.devDebug('''     >«_self.getContainerOfType(Process).contextInfo»''')
		// get or create context in containing Process (which is started simultaneously thanks to an ECL rule)
		val process = _self.getContainerOfType(Process) 
			
		// remove incoming tokens 
		val prevTokens = new ArrayList<Token>() 
		prevTokens.addAll(_self.tokens.toList)
		prevTokens.forEach[ t |
			t.position = null
			t.origin = null
			process.ownedTokens.remove(t)
			process.eResource.contents.remove(t)
		]
		// recreate tokens for all outgoing
		_self.outgoing.forEach[sequenceFlow |
			 val token = DynamicPackage.eINSTANCE.dynamicFactory.createToken
			 token.origin = _self
			 token.position = _self
			 token.sourceSequenceFlow = sequenceFlow
			 process.ownedTokens.add(token)
			 process.eResource.contents.add(token)
		]
		// increment local startCounter for the GateWay
		_self.startCounter = _self.startCounter +1
		// make sure to update RTD
		//process.ownedTokens = new ArrayList<Token>(process.ownedTokens)
		
		//_self.devDebug('''     <«_self.getContainerOfType(Process).contextInfo»''')
	}

	def void endEval() {
		_self.info("Ending    Gateway "+_self.name)
		//_self.devDebug('''     «_self.getContainerOfType(Process).contextInfo»''')
		
	}
}

@Aspect(className=EventBasedGateway)
class EventBasedGatewayAspect extends GatewayAspect {

}

@Aspect(className=ComplexGateway)
class ComplexGatewayAspect extends GatewayAspect {

}

@Aspect(className=ExclusiveGateway)
class ExclusiveGatewayAspect extends GatewayAspect {

} 

@Aspect(className=InclusiveGateway)
class InclusiveGatewayAspect extends GatewayAspect {

}

@Aspect(className=ParallelGateway)
class ParallelGatewayAspect extends GatewayAspect {

}


@Aspect(className=CategoryValue)
class CategoryValueAspect extends BaseElementAspect {

}

@Aspect(className=LaneSet)
class LaneSetAspect extends BaseElementAspect {

}







@Aspect(className=Property)
class PropertyAspect extends ItemAwareElementAspect {

}

@Aspect(className=Collaboration)
class CollaborationAspect extends RootElementAspect {

}

@Aspect(className=Choreography)
class ChoreographyAspect extends CollaborationAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=Artifact)
abstract class ArtifactAspect extends BaseElementAspect {

}

@Aspect(className=ParticipantAssociation)
class ParticipantAssociationAspect extends BaseElementAspect {

}

@Aspect(className=Participant)
class ParticipantAspect extends BaseElementAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=InteractionNode)
abstract class InteractionNodeAspect {

}

@Aspect(className=ConversationLink)
class ConversationLinkAspect extends BaseElementAspect {

}

@Aspect(className=ParticipantMultiplicity)
class ParticipantMultiplicityAspect {

}

@Aspect(className=MessageFlowAssociation)
class MessageFlowAssociationAspect extends BaseElementAspect {

}

@Aspect(className=MessageFlow)
class MessageFlowAspect extends BaseElementAspect {

}

@Aspect(className=ConversationAssociation)
class ConversationAssociationAspect extends BaseElementAspect {

}

@Aspect(className=ConversationNode)
abstract class ConversationNodeAspect extends BaseElementAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=CorrelationKey)
class CorrelationKeyAspect extends BaseElementAspect {

}

@Aspect(className=CorrelationProperty)
class CorrelationPropertyAspect extends RootElementAspect {

}

@Aspect(className=CorrelationPropertyRetrievalExpression)
class CorrelationPropertyRetrievalExpressionAspect extends BaseElementAspect {

}

@Aspect(className=FormalExpression)
class FormalExpressionAspect extends ExpressionAspect {

}

@Aspect(className=CorrelationSubscription)
class CorrelationSubscriptionAspect extends BaseElementAspect {

}

@Aspect(className=CorrelationPropertyBinding)
class CorrelationPropertyBindingAspect extends BaseElementAspect {

}

@Aspect(className=GlobalManualTask)
class GlobalManualTaskAspect extends GlobalTaskAspect {

}

@Aspect(className=LoopCharacteristics)
abstract class LoopCharacteristicsAspect extends BaseElementAspect {

}



@Aspect(className=EventDefinition)
abstract class EventDefinitionAspect extends RootElementAspect {

}

@Aspect(className=DataOutputAssociation)
class DataOutputAssociationAspect extends DataAssociationAspect {

}

@Aspect(className=DataAssociation)
class DataAssociationAspect extends BaseElementAspect {

}

@Aspect(className=Assignment)
class AssignmentAspect extends BaseElementAspect {

}

@Aspect(className=DataInputAssociation)
class DataInputAssociationAspect extends DataAssociationAspect {

}


@Aspect(className=Rendering)
class RenderingAspect extends BaseElementAspect {

}

@Aspect(className=HumanPerformer)
class HumanPerformerAspect extends PerformerAspect {

}

@Aspect(className=PotentialOwner)
class PotentialOwnerAspect extends HumanPerformerAspect {

}

@Aspect(className=GlobalUserTask)
class GlobalUserTaskAspect extends GlobalTaskAspect {

}

@Aspect(className=Relationship)
class RelationshipAspect extends BaseElementAspect {

}

@Aspect(className=Extension)
class ExtensionAspect {

}



@Aspect(className=CancelEventDefinition)
class CancelEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=ErrorEventDefinition)
class ErrorEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=TerminateEventDefinition)
class TerminateEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=EscalationEventDefinition)
class EscalationEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=Escalation)
class EscalationAspect {

}

@Aspect(className=CompensateEventDefinition)
class CompensateEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=TimerEventDefinition)
class TimerEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=LinkEventDefinition)
class LinkEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=MessageEventDefinition)
class MessageEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=ConditionalEventDefinition)
class ConditionalEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=SignalEventDefinition)
class SignalEventDefinitionAspect extends EventDefinitionAspect {

}

@Aspect(className=Signal)
class SignalAspect extends RootElementAspect {

}


@Aspect(className=DataObject)
class DataObjectAspect extends FlowElementAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=DataStore)
class DataStoreAspect extends ItemAwareElementAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=DataStoreReference)
class DataStoreReferenceAspect extends FlowElementAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=DataObjectReference)
class DataObjectReferenceAspect extends FlowElementAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=CallConversation)
class CallConversationAspect extends ConversationNodeAspect {

}

@Aspect(className=Conversation)
class ConversationAspect extends ConversationNodeAspect {

}

@Aspect(className=SubConversation)
class SubConversationAspect extends ConversationNodeAspect {

}

@Aspect(className=GlobalConversation)
class GlobalConversationAspect extends CollaborationAspect {

}

@Aspect(className=PartnerEntity)
class PartnerEntityAspect extends RootElementAspect {

}

@Aspect(className=PartnerRole)
class PartnerRoleAspect extends RootElementAspect {

}

@Aspect(className=ChoreographyActivity)
abstract class ChoreographyActivityAspect extends FlowNodeAspect {

}

@Aspect(className=CallChoreography)
class CallChoreographyAspect extends ChoreographyActivityAspect {

}

@Aspect(className=SubChoreography)
class SubChoreographyAspect extends ChoreographyActivityAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=ChoreographyTask)
class ChoreographyTaskAspect extends ChoreographyActivityAspect {

}

@Aspect(className=GlobalChoreographyTask)
class GlobalChoreographyTaskAspect extends ChoreographyAspect {

}

@Aspect(className=TextAnnotation)
class TextAnnotationAspect extends ArtifactAspect {

}

@Aspect(className=Group)
class GroupAspect extends ArtifactAspect {

}

@Aspect(className=Association)
class AssociationAspect extends ArtifactAspect {

}

@Aspect(className=Category)
class CategoryAspect extends RootElementAspect {

}

@Aspect(className=ServiceTask)
class ServiceTaskAspect extends TaskAspect {

}

@Aspect(className=SubProcess)
class SubProcessAspect extends ActivityAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=MultiInstanceLoopCharacteristics)
class MultiInstanceLoopCharacteristicsAspect extends LoopCharacteristicsAspect {

}

@Aspect(className=ComplexBehaviorDefinition)
class ComplexBehaviorDefinitionAspect extends BaseElementAspect {

}

@Aspect(className=StandardLoopCharacteristics)
class StandardLoopCharacteristicsAspect extends LoopCharacteristicsAspect {

}

@Aspect(className=CallActivity)
class CallActivityAspect extends ActivityAspect {

}

@Aspect(className=SendTask)
class SendTaskAspect extends TaskAspect {

}

@Aspect(className=ReceiveTask)
class ReceiveTaskAspect extends TaskAspect {

}

@Aspect(className=ScriptTask)
class ScriptTaskAspect extends TaskAspect {

}

@Aspect(className=BusinessRuleTask)
class BusinessRuleTaskAspect extends TaskAspect {

}

@Aspect(className=AdHocSubProcess)
class AdHocSubProcessAspect extends SubProcessAspect {

}

@Aspect(className=Transaction)
class TransactionAspect extends SubProcessAspect {

}

@Aspect(className=GlobalScriptTask)
class GlobalScriptTaskAspect extends GlobalTaskAspect {

}

@Aspect(className=GlobalBusinessRuleTask)
class GlobalBusinessRuleTaskAspect extends GlobalTaskAspect {

}

@Aspect(className=Token)
class TokenAspect {
	
	def void moveToken(SequenceFlow sourceSequenceFlow, FlowNode targetRef) {
			_self.devInfo("before moveToken to "+targetRef+targetRef.tokensShortInfo() + " / "+ _self.tokenInfo())
			
			
			//sourceRef.tokens.remove(token)
			_self.sourceSequenceFlow =  sourceSequenceFlow
			_self.position = targetRef
			// targetRef.tokens.add(_self)
			
			// Makes sure to update the RTD create a new token and a new list
			var process = _self.position.getContainerOfType(Process)
			process.ownedTokens.remove(_self)
			val tokenCopy = _self.copy
			process.ownedTokens.add(tokenCopy)
			process.eResource.contents.add(tokenCopy)
			process.eResource.contents.remove(_self)
			//process.ownedTokens = new ArrayList<Token>(process.ownedTokens)
			_self.devInfo("after moveToken to "+targetRef+targetRef.tokensShortInfo() + " / "+ _self.tokenInfo())
	}
	
	def String tokenInfo() {
		'''TOKEN[id=«String.format("%x", System.identityHashCode(_self))»; origin=«_self.origin?.name?:'null'»; position=«_self.position?.name?:'null'»; sourceSequenceFlow=«_self.sourceSequenceFlow?.name?:'null'»]'''
//		'''TOKEN[origin=«_self.origin?.name?:'null'»; position=«_self.position?.name?:'null'»; sourceSequenceFlow=«_self.sourceSequenceFlow?.name?:'null'»]«IF _self.position !== null»
//		    	tokens on «_self.position?.name?:'null'»: «_self.position.tokens»«ENDIF»'''
		
	}
	def String tokenShortInfo() {
		'''TOKEN[id=«String.format("%x", System.identityHashCode(_self))»]'''
	}
}



