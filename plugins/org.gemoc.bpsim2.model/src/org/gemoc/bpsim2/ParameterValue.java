/**
 */
package org.gemoc.bpsim2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.ParameterValue#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ParameterValue#getResult <em>Result</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ParameterValue#getResultTimeStamp <em>Result Time Stamp</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ParameterValue#getValidFor <em>Valid For</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getParameterValue()
 * @model extendedMetaData="name='ParameterValue' kind='empty'"
 * @generated
 */
public interface ParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(String)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getParameterValue_Instance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='instance'"
	 * @generated
	 */
	String getInstance();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ParameterValue#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.bpsim2.ResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see org.gemoc.bpsim2.ResultType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #setResult(ResultType)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getParameterValue_Result()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='result'"
	 * @generated
	 */
	ResultType getResult();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ParameterValue#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see org.gemoc.bpsim2.ResultType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ResultType value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ParameterValue#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResult()
	 * @see #getResult()
	 * @see #setResult(ResultType)
	 * @generated
	 */
	void unsetResult();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ParameterValue#getResult <em>Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result</em>' attribute is set.
	 * @see #unsetResult()
	 * @see #getResult()
	 * @see #setResult(ResultType)
	 * @generated
	 */
	boolean isSetResult();

	/**
	 * Returns the value of the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Time Stamp</em>' attribute.
	 * @see #setResultTimeStamp(XMLGregorianCalendar)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getParameterValue_ResultTimeStamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='resultTimeStamp'"
	 * @generated
	 */
	XMLGregorianCalendar getResultTimeStamp();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ParameterValue#getResultTimeStamp <em>Result Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Time Stamp</em>' attribute.
	 * @see #getResultTimeStamp()
	 * @generated
	 */
	void setResultTimeStamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid For</em>' attribute.
	 * @see #setValidFor(String)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getParameterValue_ValidFor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='validFor'"
	 * @generated
	 */
	String getValidFor();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ParameterValue#getValidFor <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid For</em>' attribute.
	 * @see #getValidFor()
	 * @generated
	 */
	void setValidFor(String value);

} // ParameterValue
