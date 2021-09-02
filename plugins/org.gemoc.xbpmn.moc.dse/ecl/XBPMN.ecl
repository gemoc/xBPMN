--import 'platform:/resource/org.gemoc.bpsim2.model/model/bpsim2.ecore'
import 'http://www.bpsim.org/schemas/2.0'
import 'platform:/resource/org.obeonetwork.dsl.bpmn2/model/BPMN20.ecore'
--import 'http://www.omg.org/spec/BPMN/20100524/MODEL-XMI'
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
		
--	context Lane
--		def : startLane : Event = self.startEval()
--		def : endLane : Event = self.endEval()
		
	
	context FlowNode
		def : startFlowNode : Event = self.startEval()
		def : endFlowNode : Event = self.endEval()
		
--	context _'StartEvent'
--		def : triggerStartEvent : Event = self.startEval()
--		-- def : endStartEvent : Event = self.endEval()
--		inv activityFlowNodeStartInheritance:
--			Relation Coincides(self.startFlowNode, self.triggerStartEvent)
--		inv activityFlowNodeEndInheritance:
--			Relation Coincides(self.endFlowNode, self.triggerStartEvent)
--		
--	context EndEvent
--		def : triggerEndEvent : Event = self.startEval()
--		-- def : endEndEvent : Event = self.endEval()
--		inv activityFlowNodeStartInheritance:
--			Relation Coincides(self.startFlowNode, self.triggerEndEvent)
--		inv activityFlowNodeEndInheritance:
--			Relation Coincides(self.endFlowNode, self.triggerEndEvent)
		
	context SequenceFlow
		def : triggerSequenceFlow : Event = self.startEval()

--		def if (self.expression <> null): evalFalse : Event = self.clearOffer()
--		def if (self.expression <> null): evalTrue : Event = self
--		def if (self.expression <> null): evaluate : Event = self.evaluateExpression()[res] switch
--														case false force evalFalse;
--														case true force evalTrue;
	
--	context Activity	
--		def : startActivity : Event = self.startEval()
--		def : endActivity : Event = self.endEval()
--		inv activityFlowNodeStartInheritance:
--			Relation Coincides(self.startFlowNode, self.startActivity)
--		inv activityFlowNodeEndInheritance:
--			Relation Coincides(self.endFlowNode, self.endActivity)
--			
--	context Gateway	
--		def : startGateway : Event = self.startEval()
--		def : endGateway : Event = self.endEval()	
--		inv activityFlowNodeStartInheritance:
--			Relation Coincides(self.startFlowNode, self.startGateway)
--		inv activityFlowNodeEndInheritance:
--			Relation Coincides(self.endFlowNode, self.endGateway)
		
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
--		inv nonReentrant:
--			Relation Alternates(self.startProcess, self.endProcess)
		
		inv noSimultaneousStarts:
			Relation Exclusion(self.flowElements->selectByKind(_'StartEvent').startFlowNode)
		inv noSimultaneousStops:
			Relation Exclusion(self.flowElements->selectByKind(EndEvent).startFlowNode)
		
		
		--def : allStartEvents: Event = Expression Union(self.flowElements->selectByKind(_'StartEvent').triggerStartEvent)
		--def : allEndEvents : Event = Expression Union(self.flowElements->selectByKind(EndEvent).triggerEndEvent)
			
--		inv noMultipleCallOfStartEvents:
--		let allStartEvents : Event = Expression Union(self.flowElements->selectByKind(_'StartEvent').triggerStartEvent)	in
--		let allEndEvents : Event = Expression Union(self.flowElements->selectByKind(EndEvent).triggerEndEvent)	in
--			Relation Alternates(allStartEvents, allEndEvents)
		
		
		-- Process Start/End:   starts on any StartEvent, ends on any EndEvent
		inv processStartEnd_on_StartEvent_EndEvent:
		let allStartEvents_2 : Event = Expression Union(self.flowElements->selectByKind(_'StartEvent').startFlowNode) in
		let allEndEvents_2 : Event = Expression Union(self.flowElements->selectByKind(EndEvent).startFlowNode)	in
			Relation ProcessStartEnd(allStartEvents_2, self.startProcess, allEndEvents_2, self.endProcess)


--		inv startProcessOnAnyStartEvent:
--		let allStartEvents_2 : Event = Expression Union(self.flowElements->selectByKind(_'StartEvent').triggerStartEvent)	in
--			Relation Coincides(allStartEvents_2, self.startProcess)
--		inv endProcessOnAnyStartEvent:
--		let allEndEvents_2 : Event = Expression Union(self.flowElements->selectByKind(EndEvent).triggerEndEvent)	in
--			Relation Coincides(allEndEvents_2, self.endProcess)

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
			 
		-- TODO deal with othe gateways

	context Activity
	
		-- TODO non Reentrant for a given context
--		inv activityNonReentrant:
--			Relation Alternates(self.startActivity, self.endActivity)
			
			
		inv startOnAnyIncomingSequenceFlow:
		let allIncomingSequenceFlow_1 : Event = Expression Union(self.incoming->selectByKind(SequenceFlow).triggerSequenceFlow)	in
			Relation Coincides(allIncomingSequenceFlow_1, self.startFlowNode)


	context ParallelGateway
		-- start when all incoming are received
		-- FIXME
--		inv startWhenReceivedAllIncomingSequenceFlow:
--		let unionOfAllIncomingSequenceFlow_pgw1 : Event = Expression Union(self.incoming->selectByKind(SequenceFlow).sourceRef.endFlowNode)	in
--			Relation Precedes(unionOfAllIncomingSequenceFlow_pgw1, self.startFlowNode)
		inv startWhenReceivedAllIncomingSequenceFlow:
		let unionOfAllIncomingSequenceFlow_pgw1 : Event = Expression Sup(self.incoming->selectByKind(SequenceFlow).triggerSequenceFlow)	in
--			Relation Coincides(unionOfAllIncomingSequenceFlow_pgw1, self.startFlowNode)
			Relation Precedes(unionOfAllIncomingSequenceFlow_pgw1, self.startFlowNode)
		-- end all simultaneously
		inv triggerAllOutgoingSequenceFlow:
		let unionOfAllOutgoingSequenceFlow_pgw1 : Event = Expression Union(self.outgoing->selectByKind(SequenceFlow).triggerSequenceFlow)	in
			Relation Coincides(self.endFlowNode, unionOfAllOutgoingSequenceFlow_pgw1)


--	context Gateway
--		inv gatewayNonReentrant:
--			Relation Alternates(self.startGateway, self.endGateway)
--			
--		-- start when all incoming are received
--		-- FIXME
--		inv startOnAnyIncomingSequenceFlow:
--		let allIncomingSequenceFlow_2 : Event = Expression Union(self.incoming->selectByKind(SequenceFlow).triggerSequenceFlow)	in
--			Relation Coincides(allIncomingSequenceFlow_2, self.startGateway)
--		-- end all simultaneously
--		inv triggerAllOutgoingSequenceFlow:
--		let allOutgoingSequenceFlow_1 : Event = Expression Union(self.outgoing->selectByKind(SequenceFlow).triggerSequenceFlow)	in
--			Relation Precedes(self.endGateway, allOutgoingSequenceFlow_1)
--
	context EndEvent
		inv triggeredOnAnyIncomingSequenceFlow:
		let allIncomingSequenceFlow_2 : Event = Expression Union(self.incoming->selectByKind(SequenceFlow).triggerSequenceFlow)	in
			Relation Coincides(allIncomingSequenceFlow_2, self.startFlowNode)

--  for example only
	
--	context Lane
--		inv nonReentrant:
--			Relation Alternates(self.startLane, self.endLane)
					
		-- can stop Lane only if received a StopEvent associated to the Lane
		-- FIXME -- OneTickAndNoMore instead of Union ?
--		inv canStopWhenReceivedEndEvent:
--			--let anyEndLaneInLane : Event = Expression Union(self.flowNodeRefs->select(n |n.oclIsKindOf(EndEvent))->collect(b | b.oclAsType(EndEvent).endEndEvent) ) in
--			let anyEndEventInLane : Event = Expression Union(self.flowNodeRefs->selectByKind(EndEvent).triggerEndEvent) in
--			Relation Precedes(anyEndEventInLane, self.endLane  ) 
			
--	context _'StartEvent'
--		
--		inv startProcessOnStartEvent:
--			Relation Precedes(self.triggerStartEvent, self.oclAsType(ecore::EObject).eContainer().oclAsType(Process).startProcess  )  
--	
--	context EndEvent
--			
--		inv endProcessOnEndEvent:
--			Relation Precedes(self.triggerEndEvent, self.oclAsType(ecore::EObject).eContainer().oclAsType(Process).endProcess  )
		
endpackage

