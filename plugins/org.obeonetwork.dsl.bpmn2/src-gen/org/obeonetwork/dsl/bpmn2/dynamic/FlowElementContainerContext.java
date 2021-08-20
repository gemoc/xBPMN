/**
 * <copyright>
 * 
 * Copyright (c) 2011-2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 * 
 * </copyright>
 */
package org.obeonetwork.dsl.bpmn2.dynamic;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element Container Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.FlowElementContainerContext#getOwnedTokens <em>Owned Tokens</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getFlowElementContainerContext()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface FlowElementContainerContext extends CDOObject {

	/**
	 * Returns the value of the '<em><b>Owned Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.dynamic.Token}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tokens</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getFlowElementContainerContext_OwnedTokens()
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.Token#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<Token> getOwnedTokens();
} // FlowElementContainerContext
