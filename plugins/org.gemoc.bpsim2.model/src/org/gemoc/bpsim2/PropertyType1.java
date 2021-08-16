/**
 */
package org.gemoc.bpsim2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.PropertyType1#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.PropertyType1#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getPropertyType1()
 * @model extendedMetaData="name='Property_._type' kind='elementOnly'"
 * @generated
 */
public interface PropertyType1 extends Parameter {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getPropertyType1_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.PropertyType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.bpsim2.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.gemoc.bpsim2.PropertyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(PropertyType)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getPropertyType1_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	PropertyType getType();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.PropertyType1#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.gemoc.bpsim2.PropertyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyType value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.PropertyType1#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PropertyType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.PropertyType1#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PropertyType)
	 * @generated
	 */
	boolean isSetType();

} // PropertyType1
