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
package org.obeonetwork.dsl.bpmn2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.Artifact;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.SubProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubProcessImpl extends ActivityImpl implements SubProcess {
	/**
	 * The default value of the '{@link #isTriggeredByEvent() <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggeredByEvent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIGGERED_BY_EVENT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.SUB_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowElement> getFlowElements() {
		return (EList<FlowElement>) eDynamicGet(Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS,
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LaneSet> getLaneSets() {
		return (EList<LaneSet>) eDynamicGet(Bpmn2Package.SUB_PROCESS__LANE_SETS,
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__LANE_SETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTriggeredByEvent() {
		return (Boolean) eDynamicGet(Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT,
				Bpmn2Package.Literals.SUB_PROCESS__TRIGGERED_BY_EVENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggeredByEvent(boolean newTriggeredByEvent) {
		eDynamicSet(Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT, Bpmn2Package.Literals.SUB_PROCESS__TRIGGERED_BY_EVENT,
				newTriggeredByEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>) eDynamicGet(Bpmn2Package.SUB_PROCESS__ARTIFACTS,
				Bpmn2Package.Literals.SUB_PROCESS__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
			return ((InternalEList<?>) getFlowElements()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.SUB_PROCESS__LANE_SETS:
			return ((InternalEList<?>) getLaneSets()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.SUB_PROCESS__ARTIFACTS:
			return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
			return getFlowElements();
		case Bpmn2Package.SUB_PROCESS__LANE_SETS:
			return getLaneSets();
		case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
			return isTriggeredByEvent();
		case Bpmn2Package.SUB_PROCESS__ARTIFACTS:
			return getArtifacts();
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
		case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
			getFlowElements().clear();
			getFlowElements().addAll((Collection<? extends FlowElement>) newValue);
			return;
		case Bpmn2Package.SUB_PROCESS__LANE_SETS:
			getLaneSets().clear();
			getLaneSets().addAll((Collection<? extends LaneSet>) newValue);
			return;
		case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
			setTriggeredByEvent((Boolean) newValue);
			return;
		case Bpmn2Package.SUB_PROCESS__ARTIFACTS:
			getArtifacts().clear();
			getArtifacts().addAll((Collection<? extends Artifact>) newValue);
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
		case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
			getFlowElements().clear();
			return;
		case Bpmn2Package.SUB_PROCESS__LANE_SETS:
			getLaneSets().clear();
			return;
		case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
			setTriggeredByEvent(TRIGGERED_BY_EVENT_EDEFAULT);
			return;
		case Bpmn2Package.SUB_PROCESS__ARTIFACTS:
			getArtifacts().clear();
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
		case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
			return !getFlowElements().isEmpty();
		case Bpmn2Package.SUB_PROCESS__LANE_SETS:
			return !getLaneSets().isEmpty();
		case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
			return isTriggeredByEvent() != TRIGGERED_BY_EVENT_EDEFAULT;
		case Bpmn2Package.SUB_PROCESS__ARTIFACTS:
			return !getArtifacts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (derivedFeatureID) {
			case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
				return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
			case Bpmn2Package.SUB_PROCESS__LANE_SETS:
				return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (baseFeatureID) {
			case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				return Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS;
			case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				return Bpmn2Package.SUB_PROCESS__LANE_SETS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubProcessImpl
