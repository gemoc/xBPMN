/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Artifact {
	/**
	 * Returns the value of the '<em><b>Association Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.AssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Direction</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.AssociationDirection
	 * @see #setAssociationDirection(AssociationDirection)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getAssociation_AssociationDirection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssociationDirection getAssociationDirection();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Direction</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.AssociationDirection
	 * @see #getAssociationDirection()
	 * @generated
	 */
	void setAssociationDirection(AssociationDirection value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(BaseElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getAssociation_SourceRef()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getSourceRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(BaseElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getAssociation_TargetRef()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getTargetRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Association#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(BaseElement value);

} // Association
