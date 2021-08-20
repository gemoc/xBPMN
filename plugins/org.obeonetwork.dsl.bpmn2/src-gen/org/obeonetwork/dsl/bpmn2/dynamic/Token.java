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
import org.obeonetwork.dsl.bpmn2.FlowElement;
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
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getContext <em>Context</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getToken()
 * @model annotation="aspect"
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

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.dynamic.FlowElementContainerContext#getOwnedTokens <em>Owned Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(FlowElementContainerContext)
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getToken_Context()
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.FlowElementContainerContext#getOwnedTokens
	 * @model opposite="ownedTokens" transient="false"
	 * @generated
	 */
	FlowElementContainerContext getContext();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(FlowElementContainerContext value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(FlowElement)
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getToken_Origin()
	 * @model
	 * @generated
	 */
	FlowElement getOrigin();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(FlowElement value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(FlowElement)
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#getToken_Position()
	 * @see org.obeonetwork.dsl.bpmn2.FlowElement#getTokens
	 * @model opposite="tokens"
	 * @generated
	 */
	FlowElement getPosition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(FlowElement value);
} // Token
