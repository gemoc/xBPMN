/*******************************************************************************
 * Copyright (c) 2015, 2017  I3S Laboratory  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.bpmn2.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.xtext.EcoreUtil2;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.gemoc.xbpmn.k3dsa.bpmn2.aspects.BaseElementAspect;
import org.gemoc.xbpmn.k3dsa.bpmn2.aspects.FlowElementAspect;
import org.gemoc.xbpmn.k3dsa.bpmn2.aspects.FlowElementsContainerAspect;
import org.gemoc.xbpmn.k3dsa.bpmn2.aspects.GatewayAspect;
import org.gemoc.xbpmn.k3dsa.bpmn2.aspects.ProcessAspect;
import org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TaskAspect;
import org.gemoc.xbpmn.k3dsa.bpmn2.aspects.TokenAspect;
import org.obeonetwork.dsl.bpmn2.Gateway;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.ParallelGateway;
import org.obeonetwork.dsl.bpmn2.Process;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;
import org.obeonetwork.dsl.bpmn2.Task;
import org.obeonetwork.dsl.bpmn2.dynamic.Token;

import xbpmn.xdsml.api.impl.XBPMNRTDAccessor;

public class XBPMNAnimatorService extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ProcessDiagram","Animation"));
		res.add(new StringCouple("ProcessDiagram", null)); // force refresh of all layers
		res.add(new StringCouple("CollaborationDiagram","Animation"));
		
		return res;
	}

	
	public boolean isStarted(EObject eo) {
		boolean res = false;
		if (eo instanceof Lane) {
			Lane lane = (Lane)eo;
			// Lane is started if container Process is started
			res = XBPMNRTDAccessor.getisStarted(EcoreUtil2.getContainerOfType(lane, Process.class));
			//System.out.println("isStarted Lane: "+lane.getName()+" "+res );
			return res;
		} else if (eo instanceof Process) {
			Process process =  (Process)eo;
			res = XBPMNRTDAccessor.getisStarted(process);
			//System.out.println("isStarted Process: "+process.getName()+" "+res );
			return res;
//		} else if (eo instanceof Task) {
//			Task task =  (Task)eo;
//			res = XBPMNRTDAccessor.getisStarted(task);
//			//System.out.println("isStarted Task: "+task.getName()+" "+res );
//			return res;
		} else {
			return false;
		}
	}
	
	public Integer nbPossibleTokens(EObject eo) {
		int result = 1;
		if(eo instanceof Process) {
			Process p = (Process)eo;
			List<ParallelGateway> gateways = EcoreUtil2.eAllOfType(p, ParallelGateway.class);
			result += gateways.stream().filter(gw -> gw.getOutgoing().size() > 1).mapToInt(gw -> gw.getOutgoing().size()-1).sum();
			//gateways.stream().filter(gw -> gw.getOutgoing().size() > 1).forEach(gw -> result += gw.getOutgoing().size() -1);
			//result += gateways.stream().filter(gw -> gw.getOutgoing().size() > 1).count();
		}
		return result;
	}
	
	public EList<Token> ownedTokens(EObject eo) {
		EList<Token> result = new BasicEList<Token>();
		if(eo instanceof Process) {
			Process p = (Process)eo;
			result.addAll(ProcessAspect.ownedTokens(p));
		}
		return result;
	}
	
	public Integer startCounter(EObject eo) {
//		if(eo instanceof BaseElement) {
//			BaseElement p = (BaseElement)eo;
//			return BaseElementAspect.startCounter(p);
//		}
		if(eo instanceof Gateway) {
			Gateway p = (Gateway)eo;
			return GatewayAspect.startCounter(p);
		}
		if(eo instanceof Task) {
			Task p = (Task)eo;
			return TaskAspect.startCounter(p);
		}
		if(eo instanceof Process) {
			Process p = (Process)eo;
			return ProcessAspect.startCounter(p);
		}
		return null;
	}
	
	public EList<Token> associatedTokens(EObject eo) {
		EList<Token> result = new BasicEList<Token>();
		if(eo instanceof FlowElement) {
			FlowElement gateway = (FlowElement)eo;
			result.addAll(FlowElementAspect.tokens(gateway));
		}
		return result;
	}
	
	public EList<SequenceFlow> sourceSequenceFlow(EObject eo) {
		EList<SequenceFlow> result = new BasicEList<SequenceFlow>();
		if(eo instanceof Token) {
			Token t = (Token)eo;
			
			result.add(t.getSourceSequenceFlow());
		}
		return result;
	}
	
	
	// public EList<FlowElementContainerContext> getRelatedContexts(EObject eo) {
	public Process getRelatedProcess(EObject eo) {
		return EcoreUtil2.getContainerOfType(eo, Process.class);
	}
	
}
