package org.obeonetwork.bpmn2.design;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.gemoc.bpsim2.ControlParameters;
import org.gemoc.bpsim2.ElementParameters;
import org.gemoc.bpsim2.Parameter;
import org.gemoc.bpsim2.ScenarioParametersType;
import org.gemoc.bpsim2.util.Bpsim2ResourceImpl;
import org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ControlParametersAspect;
import org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ParameterAspect;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.Process;
import org.obeonetwork.dsl.bpmn2.SubProcess;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

import java.util.Iterator;
import java.util.List;

public class BPSimScenarioService {
	
	public EList<ElementParameters> getRelatedElementParameters(EObject eo) {

		EList<ElementParameters> result = new BasicEList<ElementParameters>();
		EList<FlowNode> consideredFlowNode = new BasicEList<FlowNode>();
		if (eo instanceof Lane) {
			consideredFlowNode.addAll(((Lane)eo).getFlowNodeRefs());
		} else if( eo instanceof FlowNode){
			consideredFlowNode.add((FlowNode)eo);
		}
		if(eo.eResource() != null && eo.eResource().getResourceSet() != null) {
			List<Resource> bpsimResources = eo.eResource().getResourceSet().getResources().stream()
				.filter(sc -> sc instanceof Bpsim2ResourceImpl)
				.collect(Collectors.toList());
			EList<ElementParameters> allParameterType = new BasicEList<ElementParameters>();
			for(Resource res : bpsimResources) {
				//res.getAllContents().forEachRemaining(allParameterType::add);
				res.getAllContents().forEachRemaining(r -> {
					if(r instanceof ElementParameters) {
						ElementParameters elementParameters =(ElementParameters)r;
						allParameterType.add(elementParameters);
						if(consideredFlowNode.contains(elementParameters.getBpmnElementRef())) {
							result.add(elementParameters);
						}
					}
				});
			}
		}
		return result;
	}
	
	
	public String getPrettyLabel(EObject eo) {
		if( eo instanceof ControlParameters) {
			return ControlParametersAspect.prettyLabel((ControlParameters) eo);
		} else if( eo instanceof Parameter) {
			return ParameterAspect.prettyLabel((Parameter) eo);
		}
		return "";
	}
}
