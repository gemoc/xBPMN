/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BaseElement;

import org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.LabeledEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNEdge()
 * @model
 * @generated
 */
public interface BPMNEdge extends LabeledEdge {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(BPMNLabel)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNEdge_Label()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BPMNLabel getLabel();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(BPMNLabel value);

	/**
	 * Returns the value of the '<em><b>Bpmn Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Element</em>' reference.
	 * @see #setBpmnElement(BaseElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNEdge_BpmnElement()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getBpmnElement();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Element</em>' reference.
	 * @see #getBpmnElement()
	 * @generated
	 */
	void setBpmnElement(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(DiagramElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNEdge_SourceElement()
	 * @model ordered="false"
	 * @generated
	 */
	DiagramElement getSourceElement();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(DiagramElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNEdge_TargetElement()
	 * @model ordered="false"
	 * @generated
	 */
	DiagramElement getTargetElement();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Message Visible Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.MessageVisibleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Visible Kind</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.MessageVisibleKind
	 * @see #setMessageVisibleKind(MessageVisibleKind)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNEdge_MessageVisibleKind()
	 * @model ordered="false"
	 * @generated
	 */
	MessageVisibleKind getMessageVisibleKind();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Visible Kind</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.MessageVisibleKind
	 * @see #getMessageVisibleKind()
	 * @generated
	 */
	void setMessageVisibleKind(MessageVisibleKind value);

} // BPMNEdge
