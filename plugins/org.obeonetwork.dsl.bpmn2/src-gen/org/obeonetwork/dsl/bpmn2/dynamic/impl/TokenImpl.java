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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;
import org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage;
import org.obeonetwork.dsl.bpmn2.dynamic.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.impl.TokenImpl#getSourceSequenceFlow <em>Source Sequence Flow</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.impl.TokenImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.dynamic.impl.TokenImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends BPMN2ObjectImpl implements Token {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPackage.Literals.TOKEN;
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
	@Override
	public SequenceFlow getSourceSequenceFlow() {
		return (SequenceFlow) eDynamicGet(DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW,
				DynamicPackage.Literals.TOKEN__SOURCE_SEQUENCE_FLOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow basicGetSourceSequenceFlow() {
		return (SequenceFlow) eDynamicGet(DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW,
				DynamicPackage.Literals.TOKEN__SOURCE_SEQUENCE_FLOW, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceSequenceFlow(SequenceFlow newSourceSequenceFlow) {
		eDynamicSet(DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW, DynamicPackage.Literals.TOKEN__SOURCE_SEQUENCE_FLOW,
				newSourceSequenceFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowElement getOrigin() {
		return (FlowElement) eDynamicGet(DynamicPackage.TOKEN__ORIGIN, DynamicPackage.Literals.TOKEN__ORIGIN, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowElement basicGetOrigin() {
		return (FlowElement) eDynamicGet(DynamicPackage.TOKEN__ORIGIN, DynamicPackage.Literals.TOKEN__ORIGIN, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(FlowElement newOrigin) {
		eDynamicSet(DynamicPackage.TOKEN__ORIGIN, DynamicPackage.Literals.TOKEN__ORIGIN, newOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowElement getPosition() {
		return (FlowElement) eDynamicGet(DynamicPackage.TOKEN__POSITION, DynamicPackage.Literals.TOKEN__POSITION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowElement basicGetPosition() {
		return (FlowElement) eDynamicGet(DynamicPackage.TOKEN__POSITION, DynamicPackage.Literals.TOKEN__POSITION, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(FlowElement newPosition) {
		eDynamicSet(DynamicPackage.TOKEN__POSITION, DynamicPackage.Literals.TOKEN__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW:
			if (resolve)
				return getSourceSequenceFlow();
			return basicGetSourceSequenceFlow();
		case DynamicPackage.TOKEN__ORIGIN:
			if (resolve)
				return getOrigin();
			return basicGetOrigin();
		case DynamicPackage.TOKEN__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW:
			setSourceSequenceFlow((SequenceFlow) newValue);
			return;
		case DynamicPackage.TOKEN__ORIGIN:
			setOrigin((FlowElement) newValue);
			return;
		case DynamicPackage.TOKEN__POSITION:
			setPosition((FlowElement) newValue);
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
		case DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW:
			setSourceSequenceFlow((SequenceFlow) null);
			return;
		case DynamicPackage.TOKEN__ORIGIN:
			setOrigin((FlowElement) null);
			return;
		case DynamicPackage.TOKEN__POSITION:
			setPosition((FlowElement) null);
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
		case DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW:
			return basicGetSourceSequenceFlow() != null;
		case DynamicPackage.TOKEN__ORIGIN:
			return basicGetOrigin() != null;
		case DynamicPackage.TOKEN__POSITION:
			return basicGetPosition() != null;
		}
		return super.eIsSet(featureID);
	}

} //TokenImpl
