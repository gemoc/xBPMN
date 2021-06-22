/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallChoreography#getParticipantAssociations <em>Participant Associations</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCallChoreography()
 * @model
 * @generated
 */
public interface CallChoreography extends ChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Called Choreography Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Choreography Ref</em>' reference.
	 * @see #setCalledChoreographyRef(Choreography)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCallChoreography_CalledChoreographyRef()
	 * @model ordered="false"
	 * @generated
	 */
	Choreography getCalledChoreographyRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Choreography Ref</em>' reference.
	 * @see #getCalledChoreographyRef()
	 * @generated
	 */
	void setCalledChoreographyRef(Choreography value);

	/**
	 * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Associations</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCallChoreography_ParticipantAssociations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParticipantAssociation> getParticipantAssociations();

} // CallChoreography
