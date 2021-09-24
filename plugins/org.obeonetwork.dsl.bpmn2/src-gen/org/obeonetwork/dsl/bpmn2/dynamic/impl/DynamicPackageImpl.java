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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;

import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;

import org.obeonetwork.dsl.bpmn2.bpmdi.impl.BpmnDiPackageImpl;

import org.obeonetwork.dsl.bpmn2.dynamic.DynamicFactory;
import org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage;

import org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl;

import org.obeonetwork.dsl.dd.dc.DcPackage;

import org.obeonetwork.dsl.dd.dc.impl.DcPackageImpl;

import org.obeonetwork.dsl.dd.di.DiPackage;

import org.obeonetwork.dsl.dd.di.impl.DiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicPackageImpl extends EPackageImpl implements DynamicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.obeonetwork.dsl.bpmn2.dynamic.DynamicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DynamicPackageImpl() {
		super(eNS_URI, DynamicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DynamicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static DynamicPackage init() {
		if (isInited)
			return (DynamicPackage) EPackage.Registry.INSTANCE.getEPackage(DynamicPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDynamicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DynamicPackageImpl theDynamicPackage = registeredDynamicPackage instanceof DynamicPackageImpl
				? (DynamicPackageImpl) registeredDynamicPackage
				: new DynamicPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Bpmn2Package.eNS_URI);
		Bpmn2PackageImpl theBpmn2Package = (Bpmn2PackageImpl) (registeredPackage instanceof Bpmn2PackageImpl
				? registeredPackage
				: Bpmn2Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BpmnDiPackage.eNS_URI);
		BpmnDiPackageImpl theBpmnDiPackage = (BpmnDiPackageImpl) (registeredPackage instanceof BpmnDiPackageImpl
				? registeredPackage
				: BpmnDiPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI);
		DiPackageImpl theDiPackage = (DiPackageImpl) (registeredPackage instanceof DiPackageImpl ? registeredPackage
				: DiPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI);
		DcPackageImpl theDcPackage = (DcPackageImpl) (registeredPackage instanceof DcPackageImpl ? registeredPackage
				: DcPackage.eINSTANCE);

		// Load packages
		theBpmn2Package.loadPackage();

		// Create package meta-data objects
		theBpmnDiPackage.createPackageContents();
		theDiPackage.createPackageContents();
		theDcPackage.createPackageContents();

		// Initialize created meta-data
		theBpmnDiPackage.initializePackageContents();
		theDiPackage.initializePackageContents();
		theDcPackage.initializePackageContents();

		// Fix loaded packages
		theDynamicPackage.fixPackageContents();
		theBpmn2Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDynamicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DynamicPackage.eNS_URI, theDynamicPackage);
		return theDynamicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToken() {
		if (tokenEClass == null) {
			tokenEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(DynamicPackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToken_SourceSequenceFlow() {
		return (EReference) getToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToken_Origin() {
		return (EReference) getToken().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToken_Position() {
		return (EReference) getToken().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFactory getDynamicFactory() {
		return (DynamicFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.obeonetwork.dsl.bpmn2.dynamic." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //DynamicPackageImpl
