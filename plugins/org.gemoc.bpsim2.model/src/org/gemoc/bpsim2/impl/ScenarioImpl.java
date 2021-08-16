/**
 */
package org.gemoc.bpsim2.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.Calendar;
import org.gemoc.bpsim2.ElementParametersType;
import org.gemoc.bpsim2.Scenario;
import org.gemoc.bpsim2.ScenarioParametersType;
import org.gemoc.bpsim2.VendorExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getScenarioParameters <em>Scenario Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getElementParameters <em>Element Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getScenarioParameters() <em>Scenario Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioParameters()
	 * @generated
	 * @ordered
	 */
	protected ScenarioParametersType scenarioParameters;

	/**
	 * The cached value of the '{@link #getElementParameters() <em>Element Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementParametersType> elementParameters;

	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected EList<Calendar> calendar;

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
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getInherits() <em>Inherits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected static final String INHERITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected String inherits = INHERITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioParametersType getScenarioParameters() {
		return scenarioParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenarioParameters(ScenarioParametersType newScenarioParameters, NotificationChain msgs) {
		ScenarioParametersType oldScenarioParameters = scenarioParameters;
		scenarioParameters = newScenarioParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS, oldScenarioParameters, newScenarioParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioParameters(ScenarioParametersType newScenarioParameters) {
		if (newScenarioParameters != scenarioParameters) {
			NotificationChain msgs = null;
			if (scenarioParameters != null)
				msgs = ((InternalEObject)scenarioParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS, null, msgs);
			if (newScenarioParameters != null)
				msgs = ((InternalEObject)newScenarioParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS, null, msgs);
			msgs = basicSetScenarioParameters(newScenarioParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS, newScenarioParameters, newScenarioParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementParametersType> getElementParameters() {
		if (elementParameters == null) {
			elementParameters = new EObjectContainmentEList<ElementParametersType>(ElementParametersType.class, this, Bpsim2Package.SCENARIO__ELEMENT_PARAMETERS);
		}
		return elementParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Calendar> getCalendar() {
		if (calendar == null) {
			calendar = new EObjectContainmentEList<Calendar>(Calendar.class, this, Bpsim2Package.SCENARIO__CALENDAR);
		}
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, Bpsim2Package.SCENARIO__VENDOR_EXTENSION);
		}
		return vendorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(XMLGregorianCalendar newCreated) {
		XMLGregorianCalendar oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInherits() {
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherits(String newInherits) {
		String oldInherits = inherits;
		inherits = newInherits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__INHERITS, oldInherits, inherits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(XMLGregorianCalendar newModified) {
		XMLGregorianCalendar oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS:
				return basicSetScenarioParameters(null, msgs);
			case Bpsim2Package.SCENARIO__ELEMENT_PARAMETERS:
				return ((InternalEList<?>)getElementParameters()).basicRemove(otherEnd, msgs);
			case Bpsim2Package.SCENARIO__CALENDAR:
				return ((InternalEList<?>)getCalendar()).basicRemove(otherEnd, msgs);
			case Bpsim2Package.SCENARIO__VENDOR_EXTENSION:
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
			case Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS:
				return getScenarioParameters();
			case Bpsim2Package.SCENARIO__ELEMENT_PARAMETERS:
				return getElementParameters();
			case Bpsim2Package.SCENARIO__CALENDAR:
				return getCalendar();
			case Bpsim2Package.SCENARIO__VENDOR_EXTENSION:
				return getVendorExtension();
			case Bpsim2Package.SCENARIO__AUTHOR:
				return getAuthor();
			case Bpsim2Package.SCENARIO__CREATED:
				return getCreated();
			case Bpsim2Package.SCENARIO__DESCRIPTION:
				return getDescription();
			case Bpsim2Package.SCENARIO__ID:
				return getId();
			case Bpsim2Package.SCENARIO__INHERITS:
				return getInherits();
			case Bpsim2Package.SCENARIO__MODIFIED:
				return getModified();
			case Bpsim2Package.SCENARIO__NAME:
				return getName();
			case Bpsim2Package.SCENARIO__RESULT:
				return getResult();
			case Bpsim2Package.SCENARIO__VENDOR:
				return getVendor();
			case Bpsim2Package.SCENARIO__VERSION:
				return getVersion();
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
			case Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS:
				setScenarioParameters((ScenarioParametersType)newValue);
				return;
			case Bpsim2Package.SCENARIO__ELEMENT_PARAMETERS:
				getElementParameters().clear();
				getElementParameters().addAll((Collection<? extends ElementParametersType>)newValue);
				return;
			case Bpsim2Package.SCENARIO__CALENDAR:
				getCalendar().clear();
				getCalendar().addAll((Collection<? extends Calendar>)newValue);
				return;
			case Bpsim2Package.SCENARIO__VENDOR_EXTENSION:
				getVendorExtension().clear();
				getVendorExtension().addAll((Collection<? extends VendorExtension>)newValue);
				return;
			case Bpsim2Package.SCENARIO__AUTHOR:
				setAuthor((String)newValue);
				return;
			case Bpsim2Package.SCENARIO__CREATED:
				setCreated((XMLGregorianCalendar)newValue);
				return;
			case Bpsim2Package.SCENARIO__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Bpsim2Package.SCENARIO__ID:
				setId((String)newValue);
				return;
			case Bpsim2Package.SCENARIO__INHERITS:
				setInherits((String)newValue);
				return;
			case Bpsim2Package.SCENARIO__MODIFIED:
				setModified((XMLGregorianCalendar)newValue);
				return;
			case Bpsim2Package.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case Bpsim2Package.SCENARIO__RESULT:
				setResult((String)newValue);
				return;
			case Bpsim2Package.SCENARIO__VENDOR:
				setVendor((String)newValue);
				return;
			case Bpsim2Package.SCENARIO__VERSION:
				setVersion((String)newValue);
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
			case Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS:
				setScenarioParameters((ScenarioParametersType)null);
				return;
			case Bpsim2Package.SCENARIO__ELEMENT_PARAMETERS:
				getElementParameters().clear();
				return;
			case Bpsim2Package.SCENARIO__CALENDAR:
				getCalendar().clear();
				return;
			case Bpsim2Package.SCENARIO__VENDOR_EXTENSION:
				getVendorExtension().clear();
				return;
			case Bpsim2Package.SCENARIO__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__INHERITS:
				setInherits(INHERITS_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case Bpsim2Package.SCENARIO__SCENARIO_PARAMETERS:
				return scenarioParameters != null;
			case Bpsim2Package.SCENARIO__ELEMENT_PARAMETERS:
				return elementParameters != null && !elementParameters.isEmpty();
			case Bpsim2Package.SCENARIO__CALENDAR:
				return calendar != null && !calendar.isEmpty();
			case Bpsim2Package.SCENARIO__VENDOR_EXTENSION:
				return vendorExtension != null && !vendorExtension.isEmpty();
			case Bpsim2Package.SCENARIO__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case Bpsim2Package.SCENARIO__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case Bpsim2Package.SCENARIO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Bpsim2Package.SCENARIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Bpsim2Package.SCENARIO__INHERITS:
				return INHERITS_EDEFAULT == null ? inherits != null : !INHERITS_EDEFAULT.equals(inherits);
			case Bpsim2Package.SCENARIO__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case Bpsim2Package.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Bpsim2Package.SCENARIO__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case Bpsim2Package.SCENARIO__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case Bpsim2Package.SCENARIO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (author: ");
		result.append(author);
		result.append(", created: ");
		result.append(created);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", inherits: ");
		result.append(inherits);
		result.append(", modified: ");
		result.append(modified);
		result.append(", name: ");
		result.append(name);
		result.append(", result: ");
		result.append(result);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
