/**
 */
package org.gemoc.bpsim2.impl;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.Parameter;
import org.gemoc.bpsim2.PropertyParameters;
import org.gemoc.bpsim2.ScenarioParameters;
import org.gemoc.bpsim2.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getWarmup <em>Warmup</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getPropertyParameters <em>Property Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getBaseCurrencyUnit <em>Base Currency Unit</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getBaseResultFrequency <em>Base Result Frequency</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#isBaseResultFrequencyCumul <em>Base Result Frequency Cumul</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getBaseTimeUnit <em>Base Time Unit</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#getTraceFormat <em>Trace Format</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl#isTraceOutput <em>Trace Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioParametersImpl extends MinimalEObjectImpl.Container implements ScenarioParameters {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Parameter start;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Parameter duration;

	/**
	 * The cached value of the '{@link #getWarmup() <em>Warmup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarmup()
	 * @generated
	 * @ordered
	 */
	protected Parameter warmup;

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
	 * The default value of the '{@link #getBaseCurrencyUnit() <em>Base Currency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCurrencyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_CURRENCY_UNIT_EDEFAULT = "USD";

	/**
	 * The cached value of the '{@link #getBaseCurrencyUnit() <em>Base Currency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCurrencyUnit()
	 * @generated
	 * @ordered
	 */
	protected String baseCurrencyUnit = BASE_CURRENCY_UNIT_EDEFAULT;

	/**
	 * This is true if the Base Currency Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseCurrencyUnitESet;

	/**
	 * The default value of the '{@link #getBaseResultFrequency() <em>Base Result Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseResultFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final Duration BASE_RESULT_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseResultFrequency() <em>Base Result Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseResultFrequency()
	 * @generated
	 * @ordered
	 */
	protected Duration baseResultFrequency = BASE_RESULT_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isBaseResultFrequencyCumul() <em>Base Result Frequency Cumul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseResultFrequencyCumul()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BASE_RESULT_FREQUENCY_CUMUL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBaseResultFrequencyCumul() <em>Base Result Frequency Cumul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseResultFrequencyCumul()
	 * @generated
	 * @ordered
	 */
	protected boolean baseResultFrequencyCumul = BASE_RESULT_FREQUENCY_CUMUL_EDEFAULT;

	/**
	 * This is true if the Base Result Frequency Cumul attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseResultFrequencyCumulESet;

	/**
	 * The default value of the '{@link #getBaseTimeUnit() <em>Base Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit BASE_TIME_UNIT_EDEFAULT = TimeUnit.MIN;

	/**
	 * The cached value of the '{@link #getBaseTimeUnit() <em>Base Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit baseTimeUnit = BASE_TIME_UNIT_EDEFAULT;

	/**
	 * This is true if the Base Time Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseTimeUnitESet;

	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected int replication = REPLICATION_EDEFAULT;

	/**
	 * This is true if the Replication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replicationESet;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final long SEED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected long seed = SEED_EDEFAULT;

	/**
	 * This is true if the Seed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seedESet;

	/**
	 * The default value of the '{@link #getTraceFormat() <em>Trace Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_FORMAT_EDEFAULT = "XES";

	/**
	 * The cached value of the '{@link #getTraceFormat() <em>Trace Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceFormat()
	 * @generated
	 * @ordered
	 */
	protected String traceFormat = TRACE_FORMAT_EDEFAULT;

	/**
	 * This is true if the Trace Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean traceFormatESet;

	/**
	 * The default value of the '{@link #isTraceOutput() <em>Trace Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraceOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACE_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTraceOutput() <em>Trace Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraceOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean traceOutput = TRACE_OUTPUT_EDEFAULT;

	/**
	 * This is true if the Trace Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean traceOutputESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.SCENARIO_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Parameter newStart, NotificationChain msgs) {
		Parameter oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Parameter newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Parameter newDuration, NotificationChain msgs) {
		Parameter oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Parameter newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getWarmup() {
		return warmup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarmup(Parameter newWarmup, NotificationChain msgs) {
		Parameter oldWarmup = warmup;
		warmup = newWarmup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__WARMUP, oldWarmup, newWarmup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarmup(Parameter newWarmup) {
		if (newWarmup != warmup) {
			NotificationChain msgs = null;
			if (warmup != null)
				msgs = ((InternalEObject)warmup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__WARMUP, null, msgs);
			if (newWarmup != null)
				msgs = ((InternalEObject)newWarmup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__WARMUP, null, msgs);
			msgs = basicSetWarmup(newWarmup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__WARMUP, newWarmup, newWarmup));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS, oldPropertyParameters, newPropertyParameters);
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
				msgs = ((InternalEObject)propertyParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS, null, msgs);
			if (newPropertyParameters != null)
				msgs = ((InternalEObject)newPropertyParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS, null, msgs);
			msgs = basicSetPropertyParameters(newPropertyParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS, newPropertyParameters, newPropertyParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseCurrencyUnit() {
		return baseCurrencyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCurrencyUnit(String newBaseCurrencyUnit) {
		String oldBaseCurrencyUnit = baseCurrencyUnit;
		baseCurrencyUnit = newBaseCurrencyUnit;
		boolean oldBaseCurrencyUnitESet = baseCurrencyUnitESet;
		baseCurrencyUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT, oldBaseCurrencyUnit, baseCurrencyUnit, !oldBaseCurrencyUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseCurrencyUnit() {
		String oldBaseCurrencyUnit = baseCurrencyUnit;
		boolean oldBaseCurrencyUnitESet = baseCurrencyUnitESet;
		baseCurrencyUnit = BASE_CURRENCY_UNIT_EDEFAULT;
		baseCurrencyUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT, oldBaseCurrencyUnit, BASE_CURRENCY_UNIT_EDEFAULT, oldBaseCurrencyUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseCurrencyUnit() {
		return baseCurrencyUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getBaseResultFrequency() {
		return baseResultFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseResultFrequency(Duration newBaseResultFrequency) {
		Duration oldBaseResultFrequency = baseResultFrequency;
		baseResultFrequency = newBaseResultFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY, oldBaseResultFrequency, baseResultFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBaseResultFrequencyCumul() {
		return baseResultFrequencyCumul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseResultFrequencyCumul(boolean newBaseResultFrequencyCumul) {
		boolean oldBaseResultFrequencyCumul = baseResultFrequencyCumul;
		baseResultFrequencyCumul = newBaseResultFrequencyCumul;
		boolean oldBaseResultFrequencyCumulESet = baseResultFrequencyCumulESet;
		baseResultFrequencyCumulESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL, oldBaseResultFrequencyCumul, baseResultFrequencyCumul, !oldBaseResultFrequencyCumulESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseResultFrequencyCumul() {
		boolean oldBaseResultFrequencyCumul = baseResultFrequencyCumul;
		boolean oldBaseResultFrequencyCumulESet = baseResultFrequencyCumulESet;
		baseResultFrequencyCumul = BASE_RESULT_FREQUENCY_CUMUL_EDEFAULT;
		baseResultFrequencyCumulESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL, oldBaseResultFrequencyCumul, BASE_RESULT_FREQUENCY_CUMUL_EDEFAULT, oldBaseResultFrequencyCumulESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseResultFrequencyCumul() {
		return baseResultFrequencyCumulESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getBaseTimeUnit() {
		return baseTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTimeUnit(TimeUnit newBaseTimeUnit) {
		TimeUnit oldBaseTimeUnit = baseTimeUnit;
		baseTimeUnit = newBaseTimeUnit == null ? BASE_TIME_UNIT_EDEFAULT : newBaseTimeUnit;
		boolean oldBaseTimeUnitESet = baseTimeUnitESet;
		baseTimeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__BASE_TIME_UNIT, oldBaseTimeUnit, baseTimeUnit, !oldBaseTimeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseTimeUnit() {
		TimeUnit oldBaseTimeUnit = baseTimeUnit;
		boolean oldBaseTimeUnitESet = baseTimeUnitESet;
		baseTimeUnit = BASE_TIME_UNIT_EDEFAULT;
		baseTimeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.SCENARIO_PARAMETERS__BASE_TIME_UNIT, oldBaseTimeUnit, BASE_TIME_UNIT_EDEFAULT, oldBaseTimeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseTimeUnit() {
		return baseTimeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplication(int newReplication) {
		int oldReplication = replication;
		replication = newReplication;
		boolean oldReplicationESet = replicationESet;
		replicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__REPLICATION, oldReplication, replication, !oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplication() {
		int oldReplication = replication;
		boolean oldReplicationESet = replicationESet;
		replication = REPLICATION_EDEFAULT;
		replicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.SCENARIO_PARAMETERS__REPLICATION, oldReplication, REPLICATION_EDEFAULT, oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplication() {
		return replicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeed(long newSeed) {
		long oldSeed = seed;
		seed = newSeed;
		boolean oldSeedESet = seedESet;
		seedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__SEED, oldSeed, seed, !oldSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeed() {
		long oldSeed = seed;
		boolean oldSeedESet = seedESet;
		seed = SEED_EDEFAULT;
		seedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.SCENARIO_PARAMETERS__SEED, oldSeed, SEED_EDEFAULT, oldSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeed() {
		return seedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceFormat() {
		return traceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceFormat(String newTraceFormat) {
		String oldTraceFormat = traceFormat;
		traceFormat = newTraceFormat;
		boolean oldTraceFormatESet = traceFormatESet;
		traceFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__TRACE_FORMAT, oldTraceFormat, traceFormat, !oldTraceFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTraceFormat() {
		String oldTraceFormat = traceFormat;
		boolean oldTraceFormatESet = traceFormatESet;
		traceFormat = TRACE_FORMAT_EDEFAULT;
		traceFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.SCENARIO_PARAMETERS__TRACE_FORMAT, oldTraceFormat, TRACE_FORMAT_EDEFAULT, oldTraceFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTraceFormat() {
		return traceFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTraceOutput() {
		return traceOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceOutput(boolean newTraceOutput) {
		boolean oldTraceOutput = traceOutput;
		traceOutput = newTraceOutput;
		boolean oldTraceOutputESet = traceOutputESet;
		traceOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.SCENARIO_PARAMETERS__TRACE_OUTPUT, oldTraceOutput, traceOutput, !oldTraceOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTraceOutput() {
		boolean oldTraceOutput = traceOutput;
		boolean oldTraceOutputESet = traceOutputESet;
		traceOutput = TRACE_OUTPUT_EDEFAULT;
		traceOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.SCENARIO_PARAMETERS__TRACE_OUTPUT, oldTraceOutput, TRACE_OUTPUT_EDEFAULT, oldTraceOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTraceOutput() {
		return traceOutputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpsim2Package.SCENARIO_PARAMETERS__START:
				return basicSetStart(null, msgs);
			case Bpsim2Package.SCENARIO_PARAMETERS__DURATION:
				return basicSetDuration(null, msgs);
			case Bpsim2Package.SCENARIO_PARAMETERS__WARMUP:
				return basicSetWarmup(null, msgs);
			case Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS:
				return basicSetPropertyParameters(null, msgs);
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
			case Bpsim2Package.SCENARIO_PARAMETERS__START:
				return getStart();
			case Bpsim2Package.SCENARIO_PARAMETERS__DURATION:
				return getDuration();
			case Bpsim2Package.SCENARIO_PARAMETERS__WARMUP:
				return getWarmup();
			case Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS:
				return getPropertyParameters();
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT:
				return getBaseCurrencyUnit();
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY:
				return getBaseResultFrequency();
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL:
				return isBaseResultFrequencyCumul();
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_TIME_UNIT:
				return getBaseTimeUnit();
			case Bpsim2Package.SCENARIO_PARAMETERS__REPLICATION:
				return getReplication();
			case Bpsim2Package.SCENARIO_PARAMETERS__SEED:
				return getSeed();
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_FORMAT:
				return getTraceFormat();
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_OUTPUT:
				return isTraceOutput();
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
			case Bpsim2Package.SCENARIO_PARAMETERS__START:
				setStart((Parameter)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__DURATION:
				setDuration((Parameter)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__WARMUP:
				setWarmup((Parameter)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS:
				setPropertyParameters((PropertyParameters)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT:
				setBaseCurrencyUnit((String)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY:
				setBaseResultFrequency((Duration)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL:
				setBaseResultFrequencyCumul((Boolean)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_TIME_UNIT:
				setBaseTimeUnit((TimeUnit)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__REPLICATION:
				setReplication((Integer)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__SEED:
				setSeed((Long)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_FORMAT:
				setTraceFormat((String)newValue);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_OUTPUT:
				setTraceOutput((Boolean)newValue);
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
			case Bpsim2Package.SCENARIO_PARAMETERS__START:
				setStart((Parameter)null);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__DURATION:
				setDuration((Parameter)null);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__WARMUP:
				setWarmup((Parameter)null);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS:
				setPropertyParameters((PropertyParameters)null);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT:
				unsetBaseCurrencyUnit();
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY:
				setBaseResultFrequency(BASE_RESULT_FREQUENCY_EDEFAULT);
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL:
				unsetBaseResultFrequencyCumul();
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_TIME_UNIT:
				unsetBaseTimeUnit();
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__REPLICATION:
				unsetReplication();
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__SEED:
				unsetSeed();
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_FORMAT:
				unsetTraceFormat();
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_OUTPUT:
				unsetTraceOutput();
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
			case Bpsim2Package.SCENARIO_PARAMETERS__START:
				return start != null;
			case Bpsim2Package.SCENARIO_PARAMETERS__DURATION:
				return duration != null;
			case Bpsim2Package.SCENARIO_PARAMETERS__WARMUP:
				return warmup != null;
			case Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS:
				return propertyParameters != null;
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT:
				return isSetBaseCurrencyUnit();
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY:
				return BASE_RESULT_FREQUENCY_EDEFAULT == null ? baseResultFrequency != null : !BASE_RESULT_FREQUENCY_EDEFAULT.equals(baseResultFrequency);
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL:
				return isSetBaseResultFrequencyCumul();
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_TIME_UNIT:
				return isSetBaseTimeUnit();
			case Bpsim2Package.SCENARIO_PARAMETERS__REPLICATION:
				return isSetReplication();
			case Bpsim2Package.SCENARIO_PARAMETERS__SEED:
				return isSetSeed();
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_FORMAT:
				return isSetTraceFormat();
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_OUTPUT:
				return isSetTraceOutput();
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
		result.append(" (baseCurrencyUnit: ");
		if (baseCurrencyUnitESet) result.append(baseCurrencyUnit); else result.append("<unset>");
		result.append(", baseResultFrequency: ");
		result.append(baseResultFrequency);
		result.append(", baseResultFrequencyCumul: ");
		if (baseResultFrequencyCumulESet) result.append(baseResultFrequencyCumul); else result.append("<unset>");
		result.append(", baseTimeUnit: ");
		if (baseTimeUnitESet) result.append(baseTimeUnit); else result.append("<unset>");
		result.append(", replication: ");
		if (replicationESet) result.append(replication); else result.append("<unset>");
		result.append(", seed: ");
		if (seedESet) result.append(seed); else result.append("<unset>");
		result.append(", traceFormat: ");
		if (traceFormatESet) result.append(traceFormat); else result.append("<unset>");
		result.append(", traceOutput: ");
		if (traceOutputESet) result.append(traceOutput); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ScenarioParametersImpl
