/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Aware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemAwareElement#getDataState <em>Data State</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getItemAwareElement()
 * @model
 * @generated
 */
public interface ItemAwareElement extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Subject Ref</em>' reference.
	 * @see #setItemSubjectRef(ItemDefinition)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getItemAwareElement_ItemSubjectRef()
	 * @model ordered="false"
	 * @generated
	 */
	ItemDefinition getItemSubjectRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Subject Ref</em>' reference.
	 * @see #getItemSubjectRef()
	 * @generated
	 */
	void setItemSubjectRef(ItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data State</em>' containment reference.
	 * @see #setDataState(DataState)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getItemAwareElement_DataState()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataState getDataState();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ItemAwareElement#getDataState <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data State</em>' containment reference.
	 * @see #getDataState()
	 * @generated
	 */
	void setDataState(DataState value);

} // ItemAwareElement
