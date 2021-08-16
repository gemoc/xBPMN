/**
 */
package org.gemoc.bpsim2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.PropertyParameters#getProperty <em>Property</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.PropertyParameters#getQueueLength <em>Queue Length</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getPropertyParameters()
 * @model extendedMetaData="name='PropertyParameters' kind='elementOnly'"
 * @generated
 */
public interface PropertyParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpsim2.PropertyType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.gemoc.bpsim2.Bpsim2Package#getPropertyParameters_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyType1> getProperty();

	/**
	 * Returns the value of the '<em><b>Queue Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Length</em>' containment reference.
	 * @see #setQueueLength(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getPropertyParameters_QueueLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueueLength' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getQueueLength();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.PropertyParameters#getQueueLength <em>Queue Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Length</em>' containment reference.
	 * @see #getQueueLength()
	 * @generated
	 */
	void setQueueLength(Parameter value);

} // PropertyParameters
