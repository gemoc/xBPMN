name = org.gemoc.xbpmn.XBPMN
ecore = platform:/resource/org.obeonetwork.dsl.bpmn2/model/BPMN20.ecore
k3 = org.gemoc.xbpmn.k3dsa.bpmn2.aspects.BaseElementAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DefinitionsAspect,\
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.StartEventAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EndEventAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GatewayAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LaneAspect
#k3 = org.gemoc.xbpmn.k3dsa.SystemFunctionAspect,\
#	 org.gemoc.xbpmn.k3dsa.AbstractEndAspect,\
#	 org.gemoc.xbpmn.k3dsa.TimeLapseAspect,\
#	 org.gemoc.xbpmn.k3dsa.SystemAspect,\
#	 org.gemoc.xbpmn.k3dsa.ExchangeItemAspect,\
#	 org.gemoc.xbpmn.k3dsa.StateMachineAspect,\
#	 org.gemoc.xbpmn.k3dsa.StateTransitionAspect,\
#	 org.gemoc.xbpmn.k3dsa.ModeAspect,\
#	 org.gemoc.xbpmn.k3dsa.PhysicalArchitectureAspect,\
#	 org.gemoc.xbpmn.k3dsa.ComponentExchangeAspect,\
#	 org.gemoc.xbpmn.k3dsa.PhysicalComponentAspect
ecl = /org.gemoc.xbpmn.moc.dse/ecl/XBPMN.ecl
metaprog=org.eclipse.gemoc.metaprog.moccml
