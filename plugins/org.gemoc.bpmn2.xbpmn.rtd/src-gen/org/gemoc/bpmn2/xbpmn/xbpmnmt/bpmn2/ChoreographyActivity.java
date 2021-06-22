/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyActivity#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyActivity#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyActivity#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getChoreographyActivity()
 * @model abstract="true"
 * @generated
 */
public interface ChoreographyActivity extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Participant Refs</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Refs</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getChoreographyActivity_ParticipantRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipantRefs();

	/**
	 * Returns the value of the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #setInitiatingParticipantRef(Participant)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getChoreographyActivity_InitiatingParticipantRef()
	 * @model ordered="false"
	 * @generated
	 */
	Participant getInitiatingParticipantRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #getInitiatingParticipantRef()
	 * @generated
	 */
	void setInitiatingParticipantRef(Participant value);

	/**
	 * Returns the value of the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Keys</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getChoreographyActivity_CorrelationKeys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationKey> getCorrelationKeys();

	/**
	 * Returns the value of the '<em><b>Loop Type</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType
	 * @see #setLoopType(ChoreographyLoopType)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getChoreographyActivity_LoopType()
	 * @model default="None" required="true" ordered="false"
	 * @generated
	 */
	ChoreographyLoopType getLoopType();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyActivity#getLoopType <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Type</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ChoreographyLoopType
	 * @see #getLoopType()
	 * @generated
	 */
	void setLoopType(ChoreographyLoopType value);

} // ChoreographyActivity
