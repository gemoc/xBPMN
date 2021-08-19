/**
 */
package org.gemoc.bpsim2.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.ControlParameters;
import org.gemoc.bpsim2.CostParameters;
import org.gemoc.bpsim2.ElementParameters;
import org.gemoc.bpsim2.PriorityParameters;
import org.gemoc.bpsim2.PropertyParameters;
import org.gemoc.bpsim2.ResourceParameters;
import org.gemoc.bpsim2.TimeParameters;
import org.gemoc.bpsim2.VendorExtension;
import org.obeonetwork.dsl.bpmn2.FlowElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getTimeParameters <em>Time Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getResourceParameters <em>Resource Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getPriorityParameters <em>Priority Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getCostParameters <em>Cost Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getPropertyParameters <em>Property Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getElementRef <em>Element Ref</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ElementParametersImpl#getBpmnElementRef <em>Bpmn Element Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementParametersImpl extends MinimalEObjectImpl.Container implements ElementParameters {
	/**
	 * The cached value of the '{@link #getTimeParameters() <em>Time Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeParameters()
	 * @generated
	 * @ordered
	 */
	protected TimeParameters timeParameters;

	/**
	 * The cached value of the '{@link #getControlParameters() <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameters()
	 * @generated
	 * @ordered
	 */
	protected ControlParameters controlParameters;

	/**
	 * The cached value of the '{@link #getResourceParameters() <em>Resource Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceParameters()
	 * @generated
	 * @ordered
	 */
	protected ResourceParameters resourceParameters;

	/**
	 * The cached value of the '{@link #getPriorityParameters() <em>Priority Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityParameters()
	 * @generated
	 * @ordered
	 */
	protected PriorityParameters priorityParameters;

	/**
	 * The cached value of the '{@link #getCostParameters() <em>Cost Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostParameters()
	 * @generated
	 * @ordered
	 */
	protected CostParameters costParameters;

	/**
	 * The cached value of the '{@link #getPropertyParameters() <em>Property Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyParameters()
	 * @generated
	 * @ordered
	 */
	protected PropertyParameters propertyParameters;

	/**
	 * The cached value of the '{@link #getVendorExtension() <em>Vendor Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<VendorExtension> vendorExtension;

	/**
	 * The default value of the '{@link #getElementRef() <em>Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName ELEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementRef() <em>Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRef()
	 * @generated
	 * @ordered
	 */
	protected QName elementRef = ELEMENT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBpmnElementRef() <em>Bpmn Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnElementRef()
	 * @generated
	 * @ordered
	 */
	protected FlowElement bpmnElementRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.ELEMENT_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParameters getTimeParameters() {
		return timeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeParameters(TimeParameters newTimeParameters, NotificationChain msgs) {
		TimeParameters oldTimeParameters = timeParameters;
		timeParameters = newTimeParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS, oldTimeParameters, newTimeParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeParameters(TimeParameters newTimeParameters) {
		if (newTimeParameters != timeParameters) {
			NotificationChain msgs = null;
			if (timeParameters != null)
				msgs = ((InternalEObject)timeParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS, null, msgs);
			if (newTimeParameters != null)
				msgs = ((InternalEObject)newTimeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS, null, msgs);
			msgs = basicSetTimeParameters(newTimeParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS, newTimeParameters, newTimeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParameters getControlParameters() {
		return controlParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameters(ControlParameters newControlParameters, NotificationChain msgs) {
		ControlParameters oldControlParameters = controlParameters;
		controlParameters = newControlParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS, oldControlParameters, newControlParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlParameters(ControlParameters newControlParameters) {
		if (newControlParameters != controlParameters) {
			NotificationChain msgs = null;
			if (controlParameters != null)
				msgs = ((InternalEObject)controlParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS, null, msgs);
			if (newControlParameters != null)
				msgs = ((InternalEObject)newControlParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS, null, msgs);
			msgs = basicSetControlParameters(newControlParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS, newControlParameters, newControlParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameters getResourceParameters() {
		return resourceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceParameters(ResourceParameters newResourceParameters, NotificationChain msgs) {
		ResourceParameters oldResourceParameters = resourceParameters;
		resourceParameters = newResourceParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS, oldResourceParameters, newResourceParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceParameters(ResourceParameters newResourceParameters) {
		if (newResourceParameters != resourceParameters) {
			NotificationChain msgs = null;
			if (resourceParameters != null)
				msgs = ((InternalEObject)resourceParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS, null, msgs);
			if (newResourceParameters != null)
				msgs = ((InternalEObject)newResourceParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS, null, msgs);
			msgs = basicSetResourceParameters(newResourceParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS, newResourceParameters, newResourceParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityParameters getPriorityParameters() {
		return priorityParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorityParameters(PriorityParameters newPriorityParameters, NotificationChain msgs) {
		PriorityParameters oldPriorityParameters = priorityParameters;
		priorityParameters = newPriorityParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS, oldPriorityParameters, newPriorityParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityParameters(PriorityParameters newPriorityParameters) {
		if (newPriorityParameters != priorityParameters) {
			NotificationChain msgs = null;
			if (priorityParameters != null)
				msgs = ((InternalEObject)priorityParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS, null, msgs);
			if (newPriorityParameters != null)
				msgs = ((InternalEObject)newPriorityParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS, null, msgs);
			msgs = basicSetPriorityParameters(newPriorityParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS, newPriorityParameters, newPriorityParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostParameters getCostParameters() {
		return costParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostParameters(CostParameters newCostParameters, NotificationChain msgs) {
		CostParameters oldCostParameters = costParameters;
		costParameters = newCostParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS, oldCostParameters, newCostParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostParameters(CostParameters newCostParameters) {
		if (newCostParameters != costParameters) {
			NotificationChain msgs = null;
			if (costParameters != null)
				msgs = ((InternalEObject)costParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS, null, msgs);
			if (newCostParameters != null)
				msgs = ((InternalEObject)newCostParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS, null, msgs);
			msgs = basicSetCostParameters(newCostParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS, newCostParameters, newCostParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyParameters getPropertyParameters() {
		return propertyParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyParameters(PropertyParameters newPropertyParameters, NotificationChain msgs) {
		PropertyParameters oldPropertyParameters = propertyParameters;
		propertyParameters = newPropertyParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS, oldPropertyParameters, newPropertyParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyParameters(PropertyParameters newPropertyParameters) {
		if (newPropertyParameters != propertyParameters) {
			NotificationChain msgs = null;
			if (propertyParameters != null)
				msgs = ((InternalEObject)propertyParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS, null, msgs);
			if (newPropertyParameters != null)
				msgs = ((InternalEObject)newPropertyParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS, null, msgs);
			msgs = basicSetPropertyParameters(newPropertyParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS, newPropertyParameters, newPropertyParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, Bpsim2Package.ELEMENT_PARAMETERS__VENDOR_EXTENSION);
		}
		return vendorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getElementRef() {
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementRef(QName newElementRef) {
		QName oldElementRef = elementRef;
		elementRef = newElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__ELEMENT_REF, oldElementRef, elementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowElement getBpmnElementRef() {
		if (bpmnElementRef != null && ((EObject)bpmnElementRef).eIsProxy()) {
			InternalEObject oldBpmnElementRef = (InternalEObject)bpmnElementRef;
			bpmnElementRef = (FlowElement)eResolveProxy(oldBpmnElementRef);
			if (bpmnElementRef != oldBpmnElementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpsim2Package.ELEMENT_PARAMETERS__BPMN_ELEMENT_REF, oldBpmnElementRef, bpmnElementRef));
			}
		}
		return bpmnElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowElement basicGetBpmnElementRef() {
		return bpmnElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnElementRef(FlowElement newBpmnElementRef) {
		FlowElement oldBpmnElementRef = bpmnElementRef;
		bpmnElementRef = newBpmnElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.ELEMENT_PARAMETERS__BPMN_ELEMENT_REF, oldBpmnElementRef, bpmnElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startEval() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void endEval() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS:
				return basicSetTimeParameters(null, msgs);
			case Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS:
				return basicSetControlParameters(null, msgs);
			case Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS:
				return basicSetResourceParameters(null, msgs);
			case Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS:
				return basicSetPriorityParameters(null, msgs);
			case Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS:
				return basicSetCostParameters(null, msgs);
			case Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS:
				return basicSetPropertyParameters(null, msgs);
			case Bpsim2Package.ELEMENT_PARAMETERS__VENDOR_EXTENSION:
				return ((InternalEList<?>)getVendorExtension()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS:
				return getTimeParameters();
			case Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS:
				return getControlParameters();
			case Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS:
				return getResourceParameters();
			case Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS:
				return getPriorityParameters();
			case Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS:
				return getCostParameters();
			case Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS:
				return getPropertyParameters();
			case Bpsim2Package.ELEMENT_PARAMETERS__VENDOR_EXTENSION:
				return getVendorExtension();
			case Bpsim2Package.ELEMENT_PARAMETERS__ELEMENT_REF:
				return getElementRef();
			case Bpsim2Package.ELEMENT_PARAMETERS__ID:
				return getId();
			case Bpsim2Package.ELEMENT_PARAMETERS__BPMN_ELEMENT_REF:
				if (resolve) return getBpmnElementRef();
				return basicGetBpmnElementRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS:
				setTimeParameters((TimeParameters)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS:
				setControlParameters((ControlParameters)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS:
				setResourceParameters((ResourceParameters)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS:
				setPriorityParameters((PriorityParameters)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS:
				setCostParameters((CostParameters)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS:
				setPropertyParameters((PropertyParameters)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__VENDOR_EXTENSION:
				getVendorExtension().clear();
				getVendorExtension().addAll((Collection<? extends VendorExtension>)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__ELEMENT_REF:
				setElementRef((QName)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__ID:
				setId((String)newValue);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__BPMN_ELEMENT_REF:
				setBpmnElementRef((FlowElement)newValue);
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
			case Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS:
				setTimeParameters((TimeParameters)null);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS:
				setControlParameters((ControlParameters)null);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS:
				setResourceParameters((ResourceParameters)null);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS:
				setPriorityParameters((PriorityParameters)null);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS:
				setCostParameters((CostParameters)null);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS:
				setPropertyParameters((PropertyParameters)null);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__VENDOR_EXTENSION:
				getVendorExtension().clear();
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__ELEMENT_REF:
				setElementRef(ELEMENT_REF_EDEFAULT);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__ID:
				setId(ID_EDEFAULT);
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__BPMN_ELEMENT_REF:
				setBpmnElementRef((FlowElement)null);
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
			case Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS:
				return timeParameters != null;
			case Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS:
				return controlParameters != null;
			case Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS:
				return resourceParameters != null;
			case Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS:
				return priorityParameters != null;
			case Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS:
				return costParameters != null;
			case Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS:
				return propertyParameters != null;
			case Bpsim2Package.ELEMENT_PARAMETERS__VENDOR_EXTENSION:
				return vendorExtension != null && !vendorExtension.isEmpty();
			case Bpsim2Package.ELEMENT_PARAMETERS__ELEMENT_REF:
				return ELEMENT_REF_EDEFAULT == null ? elementRef != null : !ELEMENT_REF_EDEFAULT.equals(elementRef);
			case Bpsim2Package.ELEMENT_PARAMETERS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Bpsim2Package.ELEMENT_PARAMETERS__BPMN_ELEMENT_REF:
				return bpmnElementRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Bpsim2Package.ELEMENT_PARAMETERS___START_EVAL:
				startEval();
				return null;
			case Bpsim2Package.ELEMENT_PARAMETERS___END_EVAL:
				endEval();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (elementRef: ");
		result.append(elementRef);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ElementParametersImpl
