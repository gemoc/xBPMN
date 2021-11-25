name = org.gemoc.xbpmn.XBPMN
#ecore = platform:/resource/org.obeonetwork.dsl.bpmn2/model/BPMN20.ecore
ecore = platform:/resource/org.gemoc.bpsim2.model/model/bpsim2.ecore
k3 = org.gemoc.xbpmn.k3dsa.bpmn2.aspects.BaseElementAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.DefinitionsAspect,\
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.StartEventAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.EndEventAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GatewayAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.LaneAspect, \
	org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ControlParametersAspect, \
	org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ParameterAspect, \
	org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ElementParametersAspect, \
	org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ElementParametersTypeAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.FlowElementsContainerAspect, \
	org.gemoc.xbpmn.k3dsa.bpmn2.aspects.SequenceFlowAspect
	
ecl = /org.gemoc.xbpmn.moc.dse/ecl/XBPMN.ecl
metaprog=org.eclipse.gemoc.metaprog.moccml
