/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataStoreReference()
 * @model
 * @generated
 */
public interface DataStoreReference extends FlowElement, ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Data Store Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Store Ref</em>' reference.
	 * @see #setDataStoreRef(DataStore)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataStoreReference_DataStoreRef()
	 * @model ordered="false"
	 * @generated
	 */
	DataStore getDataStoreRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Store Ref</em>' reference.
	 * @see #getDataStoreRef()
	 * @generated
	 */
	void setDataStoreRef(DataStore value);

} // DataStoreReference
