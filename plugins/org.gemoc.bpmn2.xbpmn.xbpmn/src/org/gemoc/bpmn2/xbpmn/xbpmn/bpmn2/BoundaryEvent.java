/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getBoundaryEvent()
 * @model
 * @generated
 */
public interface BoundaryEvent extends CatchEvent {
	/**
	 * Returns the value of the '<em><b>Cancel Activity</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Activity</em>' attribute.
	 * @see #setCancelActivity(boolean)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getBoundaryEvent_CancelActivity()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isCancelActivity();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Activity</em>' attribute.
	 * @see #isCancelActivity()
	 * @generated
	 */
	void setCancelActivity(boolean value);

	/**
	 * Returns the value of the '<em><b>Attached To Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached To Ref</em>' reference.
	 * @see #setAttachedToRef(Activity)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getBoundaryEvent_AttachedToRef()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Activity#getBoundaryEventRefs
	 * @model opposite="boundaryEventRefs" required="true" ordered="false"
	 * @generated
	 */
	Activity getAttachedToRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached To Ref</em>' reference.
	 * @see #getAttachedToRef()
	 * @generated
	 */
	void setAttachedToRef(Activity value);

} // BoundaryEvent
