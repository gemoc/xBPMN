/**
 */
package org.gemoc.bpsim2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.UniformDistributionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniform Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.UniformDistributionTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.UniformDistributionTypeImpl#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniformDistributionTypeImpl extends DistributionParameterImpl implements UniformDistributionType {
	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * This is true if the Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxESet;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * This is true if the Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformDistributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.UNIFORM_DISTRIBUTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		boolean oldMaxESet = maxESet;
		maxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MAX, oldMax, max, !oldMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMax() {
		double oldMax = max;
		boolean oldMaxESet = maxESet;
		max = MAX_EDEFAULT;
		maxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MAX, oldMax, MAX_EDEFAULT, oldMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return maxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		boolean oldMinESet = minESet;
		minESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MIN, oldMin, min, !oldMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMin() {
		double oldMin = min;
		boolean oldMinESet = minESet;
		min = MIN_EDEFAULT;
		minESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MIN, oldMin, MIN_EDEFAULT, oldMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return minESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MAX:
				return getMax();
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MIN:
				return getMin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MAX:
				setMax((Double)newValue);
				return;
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MIN:
				setMin((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MAX:
				unsetMax();
				return;
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MIN:
				unsetMin();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MAX:
				return isSetMax();
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE__MIN:
				return isSetMin();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (max: ");
		if (maxESet) result.append(max); else result.append("<unset>");
		result.append(", min: ");
		if (minESet) result.append(min); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UniformDistributionTypeImpl
