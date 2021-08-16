/**
 */
package org.gemoc.bpsim2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.Parameter#getResultRequest <em>Result Request</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.Parameter#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.Parameter#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getParameter()
 * @model extendedMetaData="name='Parameter' kind='elementOnly'"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Request</b></em>' attribute list.
	 * The list contents are of type {@link org.gemoc.bpsim2.ResultType}.
	 * The literals are from the enumeration {@link org.gemoc.bpsim2.ResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Request</em>' attribute list.
	 * @see org.gemoc.bpsim2.ResultType
	 * @see org.gemoc.bpsim2.Bpsim2Package#getParameter_ResultRequest()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='ResultRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResultType> getResultRequest();

	/**
	 * Returns the value of the '<em><b>Parameter Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value Group</em>' attribute list.
	 * @see org.gemoc.bpsim2.Bpsim2Package#getParameter_ParameterValueGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ParameterValue:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getParameterValueGroup();

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpsim2.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @see org.gemoc.bpsim2.Bpsim2Package#getParameter_ParameterValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterValue' namespace='##targetNamespace' group='ParameterValue:group'"
	 * @generated
	 */
	EList<ParameterValue> getParameterValue();

} // Parameter
