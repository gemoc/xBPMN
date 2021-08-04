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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.Process;

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
		if (eo instanceof Lane) {
			System.out.println("isStarted Lane: "+((Lane)eo).getName()+" "+XBPMNRTDAccessor.getIsStarted((Lane)eo) );
			return XBPMNRTDAccessor.getIsStarted((Lane)eo);
		}else if (eo instanceof Process) {
			System.out.println("isStarted Process: "+((Process)eo).getName()+" "+XBPMNRTDAccessor.getIsStarted((Process)eo) );
			return XBPMNRTDAccessor.getIsStarted((Process)eo);
		} else {
			return false;
		}
	}
	
}
