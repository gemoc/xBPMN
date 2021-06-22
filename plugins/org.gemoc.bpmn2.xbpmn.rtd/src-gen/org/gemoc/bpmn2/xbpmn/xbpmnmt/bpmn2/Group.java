/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Group#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getGroup()
 * @model
 * @generated
 */
public interface Group extends Artifact {
	/**
	 * Returns the value of the '<em><b>Category Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value Ref</em>' reference.
	 * @see #setCategoryValueRef(CategoryValue)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getGroup_CategoryValueRef()
	 * @model ordered="false"
	 * @generated
	 */
	CategoryValue getCategoryValueRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Group#getCategoryValueRef <em>Category Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Value Ref</em>' reference.
	 * @see #getCategoryValueRef()
	 * @generated
	 */
	void setCategoryValueRef(CategoryValue value);

} // Group
