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
package org.obeonetwork.dsl.bpmn2.dynamic.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;

import org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage;
import org.obeonetwork.dsl.bpmn2.dynamic.FlowElementContainerContext;
import org.obeonetwork.dsl.bpmn2.dynamic.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element Container Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.impl.FlowElementContainerContextImpl#getOwnedTokens <em>Owned Tokens</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.impl.FlowElementContainerContextImpl#getStartCounter <em>Start Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowElementContainerContextImpl extends BPMN2ObjectImpl implements FlowElementContainerContext {
	/**
	 * The default value of the '{@link #getStartCounter() <em>Start Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int START_COUNTER_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementContainerContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPackage.Literals.FLOW_ELEMENT_CONTAINER_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Token> getOwnedTokens() {
		return (EList<Token>) eDynamicGet(DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS,
				DynamicPackage.Literals.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartCounter() {
		return (Integer) eDynamicGet(DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER,
				DynamicPackage.Literals.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartCounter(int newStartCounter) {
		eDynamicSet(DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER,
				DynamicPackage.Literals.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER, newStartCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedTokens()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS:
			return ((InternalEList<?>) getOwnedTokens()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS:
			return getOwnedTokens();
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER:
			return getStartCounter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS:
			getOwnedTokens().clear();
			getOwnedTokens().addAll((Collection<? extends Token>) newValue);
			return;
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER:
			setStartCounter((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS:
			getOwnedTokens().clear();
			return;
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER:
			setStartCounter(START_COUNTER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__OWNED_TOKENS:
			return !getOwnedTokens().isEmpty();
		case DynamicPackage.FLOW_ELEMENT_CONTAINER_CONTEXT__START_COUNTER:
			return getStartCounter() != START_COUNTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FlowElementContainerContextImpl
