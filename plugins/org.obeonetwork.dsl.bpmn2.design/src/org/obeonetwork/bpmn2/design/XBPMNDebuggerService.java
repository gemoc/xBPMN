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

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;


public class XBPMNDebuggerService extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ProcessDiagram","Debug"));
		res.add(new StringCouple("CollaborationDiagram","Debug"));
		
		return res;
	}

	@Override
	public String getModelIdentifier() {
		return org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.Activator.PLUGIN_ID+".debugModel";
	}
	
}
