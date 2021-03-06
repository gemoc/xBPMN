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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicFactory
 * @model kind="package"
 * @generated
 */
public interface DynamicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dynamic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gemoc.org/xbpmn/dynamic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dynamic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicPackage eINSTANCE = org.obeonetwork.dsl.bpmn2.dynamic.impl.DynamicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.dynamic.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.impl.TokenImpl
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.impl.DynamicPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Source Sequence Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__SOURCE_SEQUENCE_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__POSITION = 2;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getSourceSequenceFlow <em>Source Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Sequence Flow</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.Token#getSourceSequenceFlow()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_SourceSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.Token#getOrigin()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.dynamic.Token#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.Token#getPosition()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Position();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DynamicFactory getDynamicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.dynamic.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.dynamic.impl.TokenImpl
		 * @see org.obeonetwork.dsl.bpmn2.dynamic.impl.DynamicPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();
		/**
		 * The meta object literal for the '<em><b>Source Sequence Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__SOURCE_SEQUENCE_FLOW = eINSTANCE.getToken_SourceSequenceFlow();
		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__ORIGIN = eINSTANCE.getToken_Origin();
		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__POSITION = eINSTANCE.getToken_Position();

	}

} //DynamicPackage
