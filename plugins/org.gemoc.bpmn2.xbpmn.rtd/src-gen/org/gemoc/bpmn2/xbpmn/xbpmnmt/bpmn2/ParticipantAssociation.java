/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getParticipantAssociation()
 * @model
 * @generated
 */
public interface ParticipantAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Participant Ref</em>' reference.
	 * @see #setInnerParticipantRef(Participant)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getParticipantAssociation_InnerParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getInnerParticipantRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Participant Ref</em>' reference.
	 * @see #getInnerParticipantRef()
	 * @generated
	 */
	void setInnerParticipantRef(Participant value);

	/**
	 * Returns the value of the '<em><b>Outer Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Participant Ref</em>' reference.
	 * @see #setOuterParticipantRef(Participant)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getParticipantAssociation_OuterParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getOuterParticipantRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Participant Ref</em>' reference.
	 * @see #getOuterParticipantRef()
	 * @generated
	 */
	void setOuterParticipantRef(Participant value);

} // ParticipantAssociation
