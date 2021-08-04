import 'platform:/resource/org.obeonetwork.dsl.bpmn2/model/BPMN20.ecore'
--import 'http://www.omg.org/spec/BPMN/20100524/MODEL-XMI'
import 'http://www.eclipse.org/emf/2002/Ecore'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

-- event declaration
package bpmn2

	context Process
		def : startProcess : Event = self.startEval()
		def : endProcess : Event = self.endEval()
		
--	context Lane
--		def : startLane : Event = self.startEval()
--		def : endLane : Event = self.endEval()
		
	context _'StartEvent'
		def : triggerStartEvent : Event = self.startEval()
		-- def : endStartEvent : Event = self.endEval()
		
	context EndEvent
		def : triggerEndEvent : Event = self.startEval()
		-- def : endEndEvent : Event = self.endEval()
endpackage

-- event constraints

package bpmn2

	context Process
--		inv nonReentrant:
--			Relation Alternates(self.startProcess, self.endProcess)

			
		inv noSimultaneousStarts:
			Relation Exclusion(self.flowElements->selectByKind(_'StartEvent').triggerStartEvent)
			
		inv noMultipleCallOfStartEvents:
		let allStartEvents : Event = Expression Union(self.flowElements->selectByKind(_'StartEvent').triggerStartEvent)	in
		let allEndEvents : Event = Expression Union(self.flowElements->selectByKind(EndEvent).triggerEndEvent)	in
			Relation Alternates(allStartEvents, allEndEvents)
	
	-- TODO Stop Process when all Lanes have stopped
	
--	context Lane
--		inv nonReentrant:
--			Relation Alternates(self.startLane, self.endLane)
					
		-- can stop Lane only if received a StopEvent associated to the Lane
		-- FIXME -- OneTickAndNoMore instead of Union ?
--		inv canStopWhenReceivedEndEvent:
--			--let anyEndLaneInLane : Event = Expression Union(self.flowNodeRefs->select(n |n.oclIsKindOf(EndEvent))->collect(b | b.oclAsType(EndEvent).endEndEvent) ) in
--			let anyEndEventInLane : Event = Expression Union(self.flowNodeRefs->selectByKind(EndEvent).triggerEndEvent) in
--			Relation Precedes(anyEndEventInLane, self.endLane  ) 
			
	context _'StartEvent'
		
		inv startProcessOnStartEvent:
			Relation Coincides(self.oclAsType(ecore::EObject).eContainer().oclAsType(Process).startProcess, self.triggerStartEvent  )  
	
	context EndEvent
			
		inv endProcessOnEndEvent:
			Relation Coincides(self.oclAsType(ecore::EObject).eContainer().oclAsType(Process).endProcess, self.triggerEndEvent  )
		
endpackage