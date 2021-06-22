/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmdiFactoryImpl extends EFactoryImpl implements BpmdiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmdiFactory init() {
		try {
			BpmdiFactory theBpmdiFactory = (BpmdiFactory)EPackage.Registry.INSTANCE.getEFactory(BpmdiPackage.eNS_URI);
			if (theBpmdiFactory != null) {
				return theBpmdiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmdiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmdiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BpmdiPackage.BPMN_PLANE: return createBPMNPlane();
			case BpmdiPackage.BPMN_SHAPE: return createBPMNShape();
			case BpmdiPackage.BPMN_LABEL: return createBPMNLabel();
			case BpmdiPackage.BPMN_LABEL_STYLE: return createBPMNLabelStyle();
			case BpmdiPackage.BPMN_EDGE: return createBPMNEdge();
			case BpmdiPackage.BPMN_DIAGRAM: return createBPMNDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BpmdiPackage.PARTICIPANT_BAND_KIND:
				return createParticipantBandKindFromString(eDataType, initialValue);
			case BpmdiPackage.MESSAGE_VISIBLE_KIND:
				return createMessageVisibleKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BpmdiPackage.PARTICIPANT_BAND_KIND:
				return convertParticipantBandKindToString(eDataType, instanceValue);
			case BpmdiPackage.MESSAGE_VISIBLE_KIND:
				return convertMessageVisibleKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNPlane createBPMNPlane() {
		BPMNPlaneImpl bpmnPlane = new BPMNPlaneImpl();
		return bpmnPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNShape createBPMNShape() {
		BPMNShapeImpl bpmnShape = new BPMNShapeImpl();
		return bpmnShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNLabel createBPMNLabel() {
		BPMNLabelImpl bpmnLabel = new BPMNLabelImpl();
		return bpmnLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNLabelStyle createBPMNLabelStyle() {
		BPMNLabelStyleImpl bpmnLabelStyle = new BPMNLabelStyleImpl();
		return bpmnLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNEdge createBPMNEdge() {
		BPMNEdgeImpl bpmnEdge = new BPMNEdgeImpl();
		return bpmnEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNDiagram createBPMNDiagram() {
		BPMNDiagramImpl bpmnDiagram = new BPMNDiagramImpl();
		return bpmnDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantBandKind createParticipantBandKindFromString(EDataType eDataType, String initialValue) {
		ParticipantBandKind result = ParticipantBandKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantBandKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVisibleKind createMessageVisibleKindFromString(EDataType eDataType, String initialValue) {
		MessageVisibleKind result = MessageVisibleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageVisibleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpmdiPackage getBpmdiPackage() {
		return (BpmdiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpmdiPackage getPackage() {
		return BpmdiPackage.eINSTANCE;
	}

} //BpmdiFactoryImpl
