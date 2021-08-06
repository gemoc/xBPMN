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
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getSourceSequenceFlow <em>Source Sequence Flow</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getToken()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Token extends CDOObject {

	/**
	 * Returns the value of the '<em><b>Source Sequence Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Sequence Flow</em>' reference.
	 * @see #setSourceSequenceFlow(SequenceFlow)
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getToken_SourceSequenceFlow()
	 * @model
	 * @generated
	 */
	SequenceFlow getSourceSequenceFlow();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getSourceSequenceFlow <em>Source Sequence Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Sequence Flow</em>' reference.
	 * @see #getSourceSequenceFlow()
	 * @generated
	 */
	void setSourceSequenceFlow(SequenceFlow value);
} // Token
