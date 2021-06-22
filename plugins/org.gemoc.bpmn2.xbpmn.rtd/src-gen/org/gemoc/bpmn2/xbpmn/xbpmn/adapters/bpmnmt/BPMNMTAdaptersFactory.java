package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNDiagram;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabel;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabelStyle;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNPlane;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNShape;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Activity;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.AdHocSubProcess;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Artifact;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Assignment;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Auditing;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BaseElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BoundaryEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BusinessRuleTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallActivity;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallChoreography;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallConversation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallableElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CancelEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CatchEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Category;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CategoryValue;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Choreography;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ChoreographyActivity;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ChoreographyTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Collaboration;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CompensateEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexBehaviorDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexGateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConditionalEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Conversation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConversationAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConversationLink;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConversationNode;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationKey;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationProperty;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyRetrievalExpression;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInputAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataObjectReference;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutput;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutputAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataState;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStore;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStoreReference;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Definitions;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Documentation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EndEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EndPoint;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ErrorEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Escalation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EscalationEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Event;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExclusiveGateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Expression;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Extension;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeValue;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowElementsContainer;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowNode;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FormalExpression;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Gateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalBusinessRuleTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalChoreographyTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalConversation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalManualTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalScriptTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalUserTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Group;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.HumanPerformer;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ImplicitThrowEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Import;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InclusiveGateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputBinding;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputSpecification;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InteractionNode;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Interface;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.IntermediateCatchEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.IntermediateThrowEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemAwareElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LaneSet;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LinkEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LoopCharacteristics;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ManualTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Message;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlow;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlowAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Monitoring;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Operation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.OutputSet;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParallelGateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Participant;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParticipantAssociation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParticipantMultiplicity;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PartnerEntity;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PartnerRole;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Performer;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PotentialOwner;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Property;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ReceiveTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Relationship;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Rendering;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceAssignmentExpression;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceParameter;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceParameterBinding;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceRole;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.RootElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ScriptTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SendTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SequenceFlow;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ServiceTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Signal;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SignalEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.StandardLoopCharacteristics;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.StartEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubChoreography;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubConversation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubProcess;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Task;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TerminateEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TextAnnotation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ThrowEvent;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Transaction;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.UserTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.Bounds;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.Font;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.Point;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Diagram;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Edge;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Label;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.LabeledEdge;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.LabeledShape;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Node;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Plane;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Shape;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Style;

@SuppressWarnings("all")
public class BPMNMTAdaptersFactory implements AdaptersFactory {
  private static BPMNMTAdaptersFactory instance;
  
  public static BPMNMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public BPMNMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.dc.Font){
    	return createFontAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.dc.Font) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.dc.Point){
    	return createPointAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.dc.Point) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.dc.Bounds){
    	return createBoundsAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.dc.Bounds) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNPlane){
    	return createBPMNPlaneAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNPlane) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNShape){
    	return createBPMNShapeAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNShape) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabel){
    	return createBPMNLabelAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabel) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabelStyle){
    	return createBPMNLabelStyleAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabelStyle) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge){
    	return createBPMNEdgeAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNDiagram){
    	return createBPMNDiagramAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNDiagram) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Interface){
    	return createInterfaceAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Interface) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionDefinition){
    	return createExtensionDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeDefinition){
    	return createExtensionAttributeDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeValue){
    	return createExtensionAttributeValueAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExtensionAttributeValue) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Documentation){
    	return createDocumentationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Documentation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Operation){
    	return createOperationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Operation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Message){
    	return createMessageAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Message) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemDefinition){
    	return createItemDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Import){
    	return createImportAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Import) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Error){
    	return createErrorAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Error) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EndPoint){
    	return createEndPointAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EndPoint) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Auditing){
    	return createAuditingAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Auditing) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalTask){
    	return createGlobalTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputSpecification){
    	return createInputOutputSpecificationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputSpecification) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet){
    	return createInputSetAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput){
    	return createDataInputAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemAwareElement){
    	return createItemAwareElementAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemAwareElement) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataState){
    	return createDataStateAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataState) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.OutputSet){
    	return createOutputSetAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.OutputSet) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutput){
    	return createDataOutputAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutput) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputBinding){
    	return createInputOutputBindingAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputBinding) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceRole){
    	return createResourceRoleAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceRole) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Resource){
    	return createResourceAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Resource) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceParameter){
    	return createResourceParameterAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceParameter) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceParameterBinding){
    	return createResourceParameterBindingAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceParameterBinding) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Expression){
    	return createExpressionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Expression) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceAssignmentExpression){
    	return createResourceAssignmentExpressionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceAssignmentExpression) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Monitoring){
    	return createMonitoringAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Monitoring) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Performer){
    	return createPerformerAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Performer) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process){
    	return createProcessAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CategoryValue){
    	return createCategoryValueAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CategoryValue) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LaneSet){
    	return createLaneSetAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LaneSet) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane){
    	return createLaneAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SequenceFlow){
    	return createSequenceFlowAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SequenceFlow) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Property){
    	return createPropertyAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Property) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Choreography){
    	return createChoreographyAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Choreography) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Collaboration){
    	return createCollaborationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Collaboration) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParticipantAssociation){
    	return createParticipantAssociationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParticipantAssociation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Participant){
    	return createParticipantAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Participant) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConversationLink){
    	return createConversationLinkAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConversationLink) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParticipantMultiplicity){
    	return createParticipantMultiplicityAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParticipantMultiplicity) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlowAssociation){
    	return createMessageFlowAssociationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlowAssociation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlow){
    	return createMessageFlowAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlow) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConversationAssociation){
    	return createConversationAssociationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConversationAssociation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationKey){
    	return createCorrelationKeyAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationKey) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationProperty){
    	return createCorrelationPropertyAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationProperty) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyRetrievalExpression){
    	return createCorrelationPropertyRetrievalExpressionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyRetrievalExpression) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FormalExpression){
    	return createFormalExpressionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FormalExpression) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription){
    	return createCorrelationSubscriptionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding){
    	return createCorrelationPropertyBindingAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalManualTask){
    	return createGlobalManualTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalManualTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ManualTask){
    	return createManualTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ManualTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Task){
    	return createTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Task) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BoundaryEvent){
    	return createBoundaryEventAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BoundaryEvent) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutputAssociation){
    	return createDataOutputAssociationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataOutputAssociation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataAssociation){
    	return createDataAssociationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataAssociation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Assignment){
    	return createAssignmentAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Assignment) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInputAssociation){
    	return createDataInputAssociationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInputAssociation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.UserTask){
    	return createUserTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.UserTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Rendering){
    	return createRenderingAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Rendering) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PotentialOwner){
    	return createPotentialOwnerAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PotentialOwner) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.HumanPerformer){
    	return createHumanPerformerAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.HumanPerformer) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalUserTask){
    	return createGlobalUserTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalUserTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway){
    	return createEventBasedGatewayAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexGateway){
    	return createComplexGatewayAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexGateway) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExclusiveGateway){
    	return createExclusiveGatewayAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ExclusiveGateway) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InclusiveGateway){
    	return createInclusiveGatewayAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InclusiveGateway) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParallelGateway){
    	return createParallelGatewayAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ParallelGateway) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Relationship){
    	return createRelationshipAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Relationship) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Extension){
    	return createExtensionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Extension) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.IntermediateCatchEvent){
    	return createIntermediateCatchEventAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.IntermediateCatchEvent) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.IntermediateThrowEvent){
    	return createIntermediateThrowEventAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.IntermediateThrowEvent) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EndEvent){
    	return createEndEventAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EndEvent) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.StartEvent){
    	return createStartEventAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.StartEvent) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CancelEventDefinition){
    	return createCancelEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CancelEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ErrorEventDefinition){
    	return createErrorEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ErrorEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TerminateEventDefinition){
    	return createTerminateEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TerminateEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EscalationEventDefinition){
    	return createEscalationEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EscalationEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Escalation){
    	return createEscalationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Escalation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CompensateEventDefinition){
    	return createCompensateEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CompensateEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition){
    	return createTimerEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LinkEventDefinition){
    	return createLinkEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LinkEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageEventDefinition){
    	return createMessageEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConditionalEventDefinition){
    	return createConditionalEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ConditionalEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SignalEventDefinition){
    	return createSignalEventDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SignalEventDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Signal){
    	return createSignalAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Signal) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ImplicitThrowEvent){
    	return createImplicitThrowEventAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ImplicitThrowEvent) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataObject){
    	return createDataObjectAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataObject) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStore){
    	return createDataStoreAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStore) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStoreReference){
    	return createDataStoreReferenceAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStoreReference) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataObjectReference){
    	return createDataObjectReferenceAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataObjectReference) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallConversation){
    	return createCallConversationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallConversation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Conversation){
    	return createConversationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Conversation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubConversation){
    	return createSubConversationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubConversation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalConversation){
    	return createGlobalConversationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalConversation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PartnerEntity){
    	return createPartnerEntityAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PartnerEntity) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PartnerRole){
    	return createPartnerRoleAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.PartnerRole) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallChoreography){
    	return createCallChoreographyAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallChoreography) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubChoreography){
    	return createSubChoreographyAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubChoreography) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ChoreographyTask){
    	return createChoreographyTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ChoreographyTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalChoreographyTask){
    	return createGlobalChoreographyTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalChoreographyTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TextAnnotation){
    	return createTextAnnotationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TextAnnotation) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Group){
    	return createGroupAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Group) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association){
    	return createAssociationAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Category){
    	return createCategoryAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Category) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ServiceTask){
    	return createServiceTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ServiceTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubProcess){
    	return createSubProcessAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SubProcess) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics){
    	return createMultiInstanceLoopCharacteristicsAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexBehaviorDefinition){
    	return createComplexBehaviorDefinitionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexBehaviorDefinition) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.StandardLoopCharacteristics){
    	return createStandardLoopCharacteristicsAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.StandardLoopCharacteristics) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallActivity){
    	return createCallActivityAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallActivity) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SendTask){
    	return createSendTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SendTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ReceiveTask){
    	return createReceiveTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ReceiveTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ScriptTask){
    	return createScriptTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ScriptTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BusinessRuleTask){
    	return createBusinessRuleTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BusinessRuleTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.AdHocSubProcess){
    	return createAdHocSubProcessAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.AdHocSubProcess) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Transaction){
    	return createTransactionAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Transaction) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalScriptTask){
    	return createGlobalScriptTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalScriptTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalBusinessRuleTask){
    	return createGlobalBusinessRuleTaskAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalBusinessRuleTask) o, res);
    }
    if (o instanceof org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Definitions){
    	return createDefinitionsAdapter((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Definitions) o, res);
    }
    
    return null;
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.FontAdapter createFontAdapter(final Font adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.FontAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.FontAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.FontAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.PointAdapter createPointAdapter(final Point adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.PointAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.PointAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.PointAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.BoundsAdapter createBoundsAdapter(final Bounds adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.BoundsAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.BoundsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc.BoundsAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNPlaneAdapter createBPMNPlaneAdapter(final BPMNPlane adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNPlaneAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNPlaneAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNPlaneAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNShapeAdapter createBPMNShapeAdapter(final BPMNShape adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNShapeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNShapeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNShapeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelAdapter createBPMNLabelAdapter(final BPMNLabel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelStyleAdapter createBPMNLabelStyleAdapter(final BPMNLabelStyle adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelStyleAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelStyleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNLabelStyleAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNEdgeAdapter createBPMNEdgeAdapter(final BPMNEdge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNEdgeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNEdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNEdgeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNDiagramAdapter createBPMNDiagramAdapter(final BPMNDiagram adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNDiagramAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNDiagramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmdi.BPMNDiagramAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramElementAdapter createDiagramElementAdapter(final DiagramElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramElementAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramAdapter createDiagramAdapter(final Diagram adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.DiagramAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.StyleAdapter createStyleAdapter(final Style adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.StyleAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.StyleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.StyleAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.NodeAdapter createNodeAdapter(final Node adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.NodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.NodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.NodeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.EdgeAdapter createEdgeAdapter(final Edge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.EdgeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.EdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.EdgeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.ShapeAdapter createShapeAdapter(final Shape adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.ShapeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.ShapeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.ShapeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledEdgeAdapter createLabeledEdgeAdapter(final LabeledEdge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledEdgeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledEdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledEdgeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabelAdapter createLabelAdapter(final Label adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabelAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabelAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledShapeAdapter createLabeledShapeAdapter(final LabeledShape adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledShapeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledShapeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.LabeledShapeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.PlaneAdapter createPlaneAdapter(final Plane adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.PlaneAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.PlaneAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di.PlaneAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InterfaceAdapter createInterfaceAdapter(final Interface adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InterfaceAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InterfaceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InterfaceAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RootElementAdapter createRootElementAdapter(final RootElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RootElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RootElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RootElementAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter createBaseElementAdapter(final BaseElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BaseElementAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionDefinitionAdapter createExtensionDefinitionAdapter(final ExtensionDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeDefinitionAdapter createExtensionAttributeDefinitionAdapter(final ExtensionAttributeDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeValueAdapter createExtensionAttributeValueAdapter(final ExtensionAttributeValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAttributeValueAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DocumentationAdapter createDocumentationAdapter(final Documentation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DocumentationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DocumentationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DocumentationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OperationAdapter createOperationAdapter(final Operation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OperationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OperationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageAdapter createMessageAdapter(final Message adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemDefinitionAdapter createItemDefinitionAdapter(final ItemDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImportAdapter createImportAdapter(final Import adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImportAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImportAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImportAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorAdapter createErrorAdapter(final org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Error adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndPointAdapter createEndPointAdapter(final EndPoint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndPointAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndPointAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndPointAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AuditingAdapter createAuditingAdapter(final Auditing adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AuditingAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AuditingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AuditingAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalTaskAdapter createGlobalTaskAdapter(final GlobalTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallableElementAdapter createCallableElementAdapter(final CallableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallableElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallableElementAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputSpecificationAdapter createInputOutputSpecificationAdapter(final InputOutputSpecification adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputSpecificationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputSpecificationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputSpecificationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputSetAdapter createInputSetAdapter(final InputSet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputSetAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputSetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputSetAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAdapter createDataInputAdapter(final DataInput adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemAwareElementAdapter createItemAwareElementAdapter(final ItemAwareElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemAwareElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemAwareElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ItemAwareElementAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStateAdapter createDataStateAdapter(final DataState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStateAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OutputSetAdapter createOutputSetAdapter(final OutputSet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OutputSetAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OutputSetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.OutputSetAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAdapter createDataOutputAdapter(final DataOutput adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputBindingAdapter createInputOutputBindingAdapter(final InputOutputBinding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputBindingAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputBindingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InputOutputBindingAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceRoleAdapter createResourceRoleAdapter(final ResourceRole adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceRoleAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceRoleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceRoleAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAdapter createResourceAdapter(final org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Resource adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterAdapter createResourceParameterAdapter(final ResourceParameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterBindingAdapter createResourceParameterBindingAdapter(final ResourceParameterBinding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterBindingAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterBindingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceParameterBindingAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAssignmentExpressionAdapter createResourceAssignmentExpressionAdapter(final ResourceAssignmentExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAssignmentExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAssignmentExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAssignmentExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MonitoringAdapter createMonitoringAdapter(final Monitoring adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MonitoringAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MonitoringAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MonitoringAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PerformerAdapter createPerformerAdapter(final Performer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PerformerAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PerformerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PerformerAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ProcessAdapter createProcessAdapter(final org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ProcessAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ProcessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ProcessAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementsContainerAdapter createFlowElementsContainerAdapter(final FlowElementsContainer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementsContainerAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementsContainerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementsContainerAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementAdapter createFlowElementAdapter(final FlowElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowElementAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryValueAdapter createCategoryValueAdapter(final CategoryValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryValueAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneSetAdapter createLaneSetAdapter(final LaneSet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneSetAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneSetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneSetAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneAdapter createLaneAdapter(final Lane adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LaneAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowNodeAdapter createFlowNodeAdapter(final FlowNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FlowNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SequenceFlowAdapter createSequenceFlowAdapter(final SequenceFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SequenceFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SequenceFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SequenceFlowAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PropertyAdapter createPropertyAdapter(final Property adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PropertyAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PropertyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PropertyAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CollaborationAdapter createCollaborationAdapter(final Collaboration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CollaborationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CollaborationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CollaborationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyAdapter createChoreographyAdapter(final Choreography adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ArtifactAdapter createArtifactAdapter(final Artifact adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ArtifactAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ArtifactAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ArtifactAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAssociationAdapter createParticipantAssociationAdapter(final ParticipantAssociation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAdapter createParticipantAdapter(final Participant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InteractionNodeAdapter createInteractionNodeAdapter(final InteractionNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InteractionNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InteractionNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InteractionNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationLinkAdapter createConversationLinkAdapter(final ConversationLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantMultiplicityAdapter createParticipantMultiplicityAdapter(final ParticipantMultiplicity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantMultiplicityAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantMultiplicityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParticipantMultiplicityAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAssociationAdapter createMessageFlowAssociationAdapter(final MessageFlowAssociation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAdapter createMessageFlowAdapter(final MessageFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageFlowAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAssociationAdapter createConversationAssociationAdapter(final ConversationAssociation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationNodeAdapter createConversationNodeAdapter(final ConversationNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationKeyAdapter createCorrelationKeyAdapter(final CorrelationKey adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationKeyAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationKeyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationKeyAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyAdapter createCorrelationPropertyAdapter(final CorrelationProperty adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyRetrievalExpressionAdapter createCorrelationPropertyRetrievalExpressionAdapter(final CorrelationPropertyRetrievalExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyRetrievalExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyRetrievalExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyRetrievalExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FormalExpressionAdapter createFormalExpressionAdapter(final FormalExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FormalExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FormalExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.FormalExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationSubscriptionAdapter createCorrelationSubscriptionAdapter(final CorrelationSubscription adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationSubscriptionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationSubscriptionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationSubscriptionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyBindingAdapter createCorrelationPropertyBindingAdapter(final CorrelationPropertyBinding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyBindingAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyBindingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CorrelationPropertyBindingAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalManualTaskAdapter createGlobalManualTaskAdapter(final GlobalManualTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalManualTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalManualTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalManualTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ManualTaskAdapter createManualTaskAdapter(final ManualTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ManualTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ManualTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ManualTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TaskAdapter createTaskAdapter(final Task adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ActivityAdapter createActivityAdapter(final Activity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ActivityAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LoopCharacteristicsAdapter createLoopCharacteristicsAdapter(final LoopCharacteristics adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LoopCharacteristicsAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LoopCharacteristicsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LoopCharacteristicsAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BoundaryEventAdapter createBoundaryEventAdapter(final BoundaryEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BoundaryEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BoundaryEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BoundaryEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CatchEventAdapter createCatchEventAdapter(final CatchEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CatchEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CatchEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CatchEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventAdapter createEventAdapter(final Event adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventDefinitionAdapter createEventDefinitionAdapter(final EventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAssociationAdapter createDataOutputAssociationAdapter(final DataOutputAssociation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataOutputAssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataAssociationAdapter createDataAssociationAdapter(final DataAssociation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataAssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataAssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataAssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssignmentAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAssociationAdapter createDataInputAssociationAdapter(final DataInputAssociation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataInputAssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.UserTaskAdapter createUserTaskAdapter(final UserTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.UserTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.UserTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.UserTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RenderingAdapter createRenderingAdapter(final Rendering adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RenderingAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RenderingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RenderingAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.HumanPerformerAdapter createHumanPerformerAdapter(final HumanPerformer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.HumanPerformerAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.HumanPerformerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.HumanPerformerAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PotentialOwnerAdapter createPotentialOwnerAdapter(final PotentialOwner adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PotentialOwnerAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PotentialOwnerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PotentialOwnerAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalUserTaskAdapter createGlobalUserTaskAdapter(final GlobalUserTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalUserTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalUserTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalUserTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GatewayAdapter createGatewayAdapter(final Gateway adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GatewayAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GatewayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GatewayAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventBasedGatewayAdapter createEventBasedGatewayAdapter(final EventBasedGateway adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventBasedGatewayAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventBasedGatewayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EventBasedGatewayAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexGatewayAdapter createComplexGatewayAdapter(final ComplexGateway adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexGatewayAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexGatewayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexGatewayAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExclusiveGatewayAdapter createExclusiveGatewayAdapter(final ExclusiveGateway adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExclusiveGatewayAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExclusiveGatewayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExclusiveGatewayAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InclusiveGatewayAdapter createInclusiveGatewayAdapter(final InclusiveGateway adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InclusiveGatewayAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InclusiveGatewayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.InclusiveGatewayAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParallelGatewayAdapter createParallelGatewayAdapter(final ParallelGateway adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParallelGatewayAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParallelGatewayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ParallelGatewayAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RelationshipAdapter createRelationshipAdapter(final Relationship adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RelationshipAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RelationshipAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.RelationshipAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAdapter createExtensionAdapter(final Extension adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ExtensionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateCatchEventAdapter createIntermediateCatchEventAdapter(final IntermediateCatchEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateCatchEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateCatchEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateCatchEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateThrowEventAdapter createIntermediateThrowEventAdapter(final IntermediateThrowEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateThrowEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateThrowEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.IntermediateThrowEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ThrowEventAdapter createThrowEventAdapter(final ThrowEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ThrowEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ThrowEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ThrowEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndEventAdapter createEndEventAdapter(final EndEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EndEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StartEventAdapter createStartEventAdapter(final StartEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StartEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StartEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StartEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CancelEventDefinitionAdapter createCancelEventDefinitionAdapter(final CancelEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CancelEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CancelEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CancelEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorEventDefinitionAdapter createErrorEventDefinitionAdapter(final ErrorEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ErrorEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TerminateEventDefinitionAdapter createTerminateEventDefinitionAdapter(final TerminateEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TerminateEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TerminateEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TerminateEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationEventDefinitionAdapter createEscalationEventDefinitionAdapter(final EscalationEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationAdapter createEscalationAdapter(final Escalation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.EscalationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CompensateEventDefinitionAdapter createCompensateEventDefinitionAdapter(final CompensateEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CompensateEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CompensateEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CompensateEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TimerEventDefinitionAdapter createTimerEventDefinitionAdapter(final TimerEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TimerEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TimerEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TimerEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LinkEventDefinitionAdapter createLinkEventDefinitionAdapter(final LinkEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LinkEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LinkEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.LinkEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageEventDefinitionAdapter createMessageEventDefinitionAdapter(final MessageEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MessageEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConditionalEventDefinitionAdapter createConditionalEventDefinitionAdapter(final ConditionalEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConditionalEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConditionalEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConditionalEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalEventDefinitionAdapter createSignalEventDefinitionAdapter(final SignalEventDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalEventDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalEventDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalEventDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalAdapter createSignalAdapter(final Signal adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SignalAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImplicitThrowEventAdapter createImplicitThrowEventAdapter(final ImplicitThrowEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImplicitThrowEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImplicitThrowEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ImplicitThrowEventAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectAdapter createDataObjectAdapter(final DataObject adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreAdapter createDataStoreAdapter(final DataStore adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreReferenceAdapter createDataStoreReferenceAdapter(final DataStoreReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataStoreReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectReferenceAdapter createDataObjectReferenceAdapter(final DataObjectReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DataObjectReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallConversationAdapter createCallConversationAdapter(final CallConversation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallConversationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallConversationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallConversationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAdapter createConversationAdapter(final Conversation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ConversationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubConversationAdapter createSubConversationAdapter(final SubConversation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubConversationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubConversationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubConversationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalConversationAdapter createGlobalConversationAdapter(final GlobalConversation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalConversationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalConversationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalConversationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerEntityAdapter createPartnerEntityAdapter(final PartnerEntity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerEntityAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerEntityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerEntityAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerRoleAdapter createPartnerRoleAdapter(final PartnerRole adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerRoleAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerRoleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.PartnerRoleAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyActivityAdapter createChoreographyActivityAdapter(final ChoreographyActivity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyActivityAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallChoreographyAdapter createCallChoreographyAdapter(final CallChoreography adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallChoreographyAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallChoreographyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallChoreographyAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubChoreographyAdapter createSubChoreographyAdapter(final SubChoreography adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubChoreographyAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubChoreographyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubChoreographyAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyTaskAdapter createChoreographyTaskAdapter(final ChoreographyTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ChoreographyTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalChoreographyTaskAdapter createGlobalChoreographyTaskAdapter(final GlobalChoreographyTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalChoreographyTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalChoreographyTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalChoreographyTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TextAnnotationAdapter createTextAnnotationAdapter(final TextAnnotation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TextAnnotationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TextAnnotationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TextAnnotationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GroupAdapter createGroupAdapter(final Group adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GroupAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GroupAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssociationAdapter createAssociationAdapter(final Association adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryAdapter createCategoryAdapter(final Category adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CategoryAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ServiceTaskAdapter createServiceTaskAdapter(final ServiceTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ServiceTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ServiceTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ServiceTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubProcessAdapter createSubProcessAdapter(final SubProcess adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubProcessAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubProcessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SubProcessAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MultiInstanceLoopCharacteristicsAdapter createMultiInstanceLoopCharacteristicsAdapter(final MultiInstanceLoopCharacteristics adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MultiInstanceLoopCharacteristicsAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MultiInstanceLoopCharacteristicsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.MultiInstanceLoopCharacteristicsAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexBehaviorDefinitionAdapter createComplexBehaviorDefinitionAdapter(final ComplexBehaviorDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexBehaviorDefinitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexBehaviorDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ComplexBehaviorDefinitionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StandardLoopCharacteristicsAdapter createStandardLoopCharacteristicsAdapter(final StandardLoopCharacteristics adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StandardLoopCharacteristicsAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StandardLoopCharacteristicsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.StandardLoopCharacteristicsAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallActivityAdapter createCallActivityAdapter(final CallActivity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.CallActivityAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SendTaskAdapter createSendTaskAdapter(final SendTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SendTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SendTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.SendTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ReceiveTaskAdapter createReceiveTaskAdapter(final ReceiveTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ReceiveTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ReceiveTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ReceiveTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ScriptTaskAdapter createScriptTaskAdapter(final ScriptTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ScriptTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ScriptTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ScriptTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BusinessRuleTaskAdapter createBusinessRuleTaskAdapter(final BusinessRuleTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BusinessRuleTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BusinessRuleTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.BusinessRuleTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AdHocSubProcessAdapter createAdHocSubProcessAdapter(final AdHocSubProcess adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AdHocSubProcessAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AdHocSubProcessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.AdHocSubProcessAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TransactionAdapter createTransactionAdapter(final Transaction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TransactionAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TransactionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.TransactionAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalScriptTaskAdapter createGlobalScriptTaskAdapter(final GlobalScriptTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalScriptTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalScriptTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalScriptTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalBusinessRuleTaskAdapter createGlobalBusinessRuleTaskAdapter(final GlobalBusinessRuleTask adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalBusinessRuleTaskAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalBusinessRuleTaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.GlobalBusinessRuleTaskAdapter) adapter;
    }
  }
  
  public org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DefinitionsAdapter createDefinitionsAdapter(final Definitions adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DefinitionsAdapter) adapter;
    else {
    	adapter = new org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DefinitionsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.DefinitionsAdapter) adapter;
    }
  }
}
