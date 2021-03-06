/**
 */
package org.gemoc.bpsim2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.UserDistributionType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.UserDistributionType#getUserDistributionDataPoint <em>User Distribution Data Point</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.UserDistributionType#isDiscrete <em>Discrete</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getUserDistributionType()
 * @model extendedMetaData="name='UserDistribution_._type' kind='elementOnly'"
 * @generated
 */
public interface UserDistributionType extends DistributionParameter {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.gemoc.bpsim2.Bpsim2Package#getUserDistributionType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>User Distribution Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpsim2.UserDistributionDataPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Distribution Data Point</em>' containment reference list.
	 * @see org.gemoc.bpsim2.Bpsim2Package#getUserDistributionType_UserDistributionDataPoint()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserDistributionDataPoint' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<UserDistributionDataPointType> getUserDistributionDataPoint();

	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' attribute.
	 * @see #isSetDiscrete()
	 * @see #unsetDiscrete()
	 * @see #setDiscrete(boolean)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getUserDistributionType_Discrete()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='discrete'"
	 * @generated
	 */
	boolean isDiscrete();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.UserDistributionType#isDiscrete <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete</em>' attribute.
	 * @see #isSetDiscrete()
	 * @see #unsetDiscrete()
	 * @see #isDiscrete()
	 * @generated
	 */
	void setDiscrete(boolean value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.UserDistributionType#isDiscrete <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscrete()
	 * @see #isDiscrete()
	 * @see #setDiscrete(boolean)
	 * @generated
	 */
	void unsetDiscrete();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.UserDistributionType#isDiscrete <em>Discrete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discrete</em>' attribute is set.
	 * @see #unsetDiscrete()
	 * @see #isDiscrete()
	 * @see #setDiscrete(boolean)
	 * @generated
	 */
	boolean isSetDiscrete();

} // UserDistributionType
