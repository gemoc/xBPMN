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

import org.eclipse.emf.ecore.EClass;

import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DynamicPackage.TOKEN__SOURCE_SEQUENCE_FLOW:
			if (resolve)
				return getSourceSequenceFlow();
			return basicGetSourceSequenceFlow();
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
		}
		return super.eIsSet(featureID);
	}

} //TokenImpl
