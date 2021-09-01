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
import org.obeonetwork.dsl.bpmn2.Gateway;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.ParallelGateway;
import org.obeonetwork.dsl.bpmn2.Process;
import org.obeonetwork.dsl.bpmn2.Task;
import org.obeonetwork.dsl.bpmn2.dynamic.FlowElementContainerContext;
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
			res = XBPMNRTDAccessor.getIsStarted(EcoreUtil2.getContainerOfType(lane, Process.class));
			//System.out.println("isStarted Lane: "+lane.getName()+" "+res );
			return res;
		} else if (eo instanceof Process) {
			Process process =  (Process)eo;
			res = XBPMNRTDAccessor.getIsStarted(process);
			//System.out.println("isStarted Process: "+process.getName()+" "+res );
			return res;
		} else if (eo instanceof Task) {
			Task task =  (Task)eo;
			res = XBPMNRTDAccessor.getIsStarted(task);
			//System.out.println("isStarted Task: "+task.getName()+" "+res );
			return res;
		} else {
			return false;
		}
	}
	
	public Integer nbPossibleTokens(EObject eo) {
		int result = 1;
		if(eo instanceof FlowElementContainerContext) {
			FlowElementContainerContext fecc = (FlowElementContainerContext)eo;
			List<ParallelGateway> gateways = EcoreUtil2.eAllOfType(fecc.eContainer(), ParallelGateway.class);
			result += gateways.stream().filter(gw -> gw.getOutgoing().size() > 1).mapToInt(gw -> gw.getOutgoing().size()-1).sum();
			//gateways.stream().filter(gw -> gw.getOutgoing().size() > 1).forEach(gw -> result += gw.getOutgoing().size() -1);
			//result += gateways.stream().filter(gw -> gw.getOutgoing().size() > 1).count();
		}
		return result;
	}
	
	public EList<Token> associatedTokens(EObject eo) {
		EList<Token> result = new BasicEList<Token>();
		if(eo instanceof Gateway) {
			Gateway gateway = (Gateway)eo;
			result.addAll(gateway.getTokens());
		}
		return result;
	}
	
	
	public EList<FlowElementContainerContext> getRelatedContexts(EObject eo) {

		EList<FlowElementContainerContext> result = new BasicEList<FlowElementContainerContext>();
		if (eo instanceof Lane) {
			result.addAll(EcoreUtil2.getContainerOfType(eo, Process.class).getContexts());
		} else if( eo instanceof LaneSet){
			result.addAll(EcoreUtil2.getContainerOfType(eo, Process.class).getContexts());
		}
		return result;
	}
	
}
