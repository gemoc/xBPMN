/**
 */
package org.gemoc.bpsim2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.StringParameterType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getStringParameterType()
 * @model extendedMetaData="name='StringParameter_._type' kind='empty'"
 * @generated
 */
public interface StringParameterType extends ConstantParameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getStringParameterType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.StringParameterType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringParameterType
