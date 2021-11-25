--import 'platform:/resource/org.gemoc.bpsim2.model/model/bpsim2.ecore'
import 'http://www.bpsim.org/schemas/2.0'
import 'platform:/resource/org.obeonetwork.dsl.bpmn2/model/BPMN20.ecore'
--import 'http://www.omg.org/spec/BPMN/20100524/MODEL-EMF'
import 'http://www.eclipse.org/emf/2002/Ecore'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "platform:/resource/org.gemoc.xbpmn.moc.lib/moclib/ProcessStartEnd.moccml"
 
-- event declaration
package bpsim2
  
	context ElementParameters 
		def : entering : Event = self.startEval()
--		def : leaving : Event = self.endEval()
		 
endpackage
 
package bpmn2 

	context Process
		def : startProcess : Event = self.startEval()
		def : endProcess : Event = self.endEval() 
		
	context FlowNode
		def : startFlowNode : Event = self.startEval()
		def : endFlowNode : Event = self.endEval()
		
	context SequenceFlow
		def : triggerSequenceFlow : Event = self.startEval()

endpackage

-- BPMN/BPSim coordination event constraints
package bpsim2
	context ElementParameters
		inv simultaneousBPSim_BPMNStartEvent:
			(self.bpmnElementRef.oclIsKindOf(bpmn2::_'StartEvent'))
			implies
				Relation Coincides(self.bpmnElementRef.oclAsType(bpmn2::_'StartEvent').startFlowNode, self.entering)
endpackage

-- BPSim event constraints
--package bpsim2
--
--endpackage

-- BPMN event constraints
package bpmn2

	context Process
		
		inv noSimultaneousStarts:
			Relation Exclusion(self.flowElements->selectByKind(_'StartEvent').startFlowNode)
		inv noSimultaneousStops:
			Relation Exclusion(self.flowElements->selectByKind(EndEvent).startFlowNode)
	
		-- Process Start/End:   starts on any StartEvent, ends on any EndEvent
		inv processStartEnd_on_StartEvent_EndEvent:
			let allStartEvents_2 : Event = Expression Union(self.flowElements->selectByKind(_'StartEvent').startFlowNode) in
			let allEndEvents_2 : Event = Expression Union(self.flowElements->selectByKind(EndEvent).startFlowNode)	in
			Relation ProcessStartEnd(allStartEvents_2, self.startProcess, allEndEvents_2, self.endProcess)

		-- TODO timer based StartEvent	
	context FlowNode
		inv activityNonReentrant:
			Relation Alternates(self.startFlowNode, self.endFlowNode)
	context SequenceFlow
	
		inv waitActivityBeforeTriggeringFlow:
			((self.sourceRef).oclIsKindOf(Activity))
			implies
			(Relation Precedes(self.sourceRef.oclAsType(Activity).endFlowNode, self.triggerSequenceFlow)) 
			
		inv waitStartEventBeforeTriggeringFlow:
			((self.sourceRef).oclIsKindOf(_'StartEvent'))
			implies 
			(Relation Precedes(self.sourceRef.oclAsType(_'StartEvent').endFlowNode, self.triggerSequenceFlow)) 
	
	
		inv waitGatewaytBeforeTriggeringFlow:
			((self.sourceRef).oclIsKindOf(ParallelGateway))
			implies 
			(Relation Coincides(self.sourceRef.oclAsType(ParallelGateway).endFlowNode, self.triggerSequenceFlow)) 			
			 
		-- TODO deal with other gateways

	context Activity
			
		inv startOnAnyIncomingSequenceFlow:
		let allIncomingSequenceFlow_1 : Event = Expression Union(self.incoming->selectByKind(SequenceFlow).triggerSequenceFlow)	in
			Relation Coincides(allIncomingSequenceFlow_1, self.startFlowNode)

	context ParallelGateway
		-- start when all incoming are received
		inv startWhenReceivedAllIncomingSequenceFlow:
		let unionOfAllIncomingSequenceFlow_pgw1 : Event = Expression Sup(self.incoming->selectByKind(SequenceFlow).triggerSequenceFlow)	in
			--	Relation Coincides(unionOfAllIncomingSequenceFlow_pgw1, self.startFlowNode)
			Relation Precedes(unionOfAllIncomingSequenceFlow_pgw1, self.startFlowNode)
		
		-- end all simultaneously
		inv triggerAllOutgoingSequenceFlow:
		let unionOfAllOutgoingSequenceFlow_pgw1 : Event = Expression Union(self.outgoing->selectByKind(SequenceFlow).triggerSequenceFlow)	in
			Relation Coincides(self.endFlowNode, unionOfAllOutgoingSequenceFlow_pgw1)


	context EndEvent
		inv triggeredOnAnyIncomingSequenceFlow:
		let allIncomingSequenceFlow_2 : Event = Expression Union(self.incoming->selectByKind(SequenceFlow).triggerSequenceFlow)	in
			Relation Coincides(allIncomingSequenceFlow_2, self.startFlowNode)
		
endpackage

