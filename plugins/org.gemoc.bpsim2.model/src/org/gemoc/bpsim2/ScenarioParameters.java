/**
 */
package org.gemoc.bpsim2;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getStart <em>Start</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getWarmup <em>Warmup</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getPropertyParameters <em>Property Parameters</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getBaseCurrencyUnit <em>Base Currency Unit</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getBaseResultFrequency <em>Base Result Frequency</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#isBaseResultFrequencyCumul <em>Base Result Frequency Cumul</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getBaseTimeUnit <em>Base Time Unit</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#getTraceFormat <em>Trace Format</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ScenarioParameters#isTraceOutput <em>Trace Output</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters()
 * @model extendedMetaData="name='ScenarioParameters' kind='elementOnly'"
 * @generated
 */
public interface ScenarioParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getStart();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Parameter value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getDuration();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Parameter value);

	/**
	 * Returns the value of the '<em><b>Warmup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warmup</em>' containment reference.
	 * @see #setWarmup(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_Warmup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Warmup' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getWarmup();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getWarmup <em>Warmup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warmup</em>' containment reference.
	 * @see #getWarmup()
	 * @generated
	 */
	void setWarmup(Parameter value);

	/**
	 * Returns the value of the '<em><b>Property Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Parameters</em>' containment reference.
	 * @see #setPropertyParameters(PropertyParameters)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_PropertyParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyParameters getPropertyParameters();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getPropertyParameters <em>Property Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Parameters</em>' containment reference.
	 * @see #getPropertyParameters()
	 * @generated
	 */
	void setPropertyParameters(PropertyParameters value);

	/**
	 * Returns the value of the '<em><b>Base Currency Unit</b></em>' attribute.
	 * The default value is <code>"USD"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Currency Unit</em>' attribute.
	 * @see #isSetBaseCurrencyUnit()
	 * @see #unsetBaseCurrencyUnit()
	 * @see #setBaseCurrencyUnit(String)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_BaseCurrencyUnit()
	 * @model default="USD" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='baseCurrencyUnit'"
	 * @generated
	 */
	String getBaseCurrencyUnit();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseCurrencyUnit <em>Base Currency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Currency Unit</em>' attribute.
	 * @see #isSetBaseCurrencyUnit()
	 * @see #unsetBaseCurrencyUnit()
	 * @see #getBaseCurrencyUnit()
	 * @generated
	 */
	void setBaseCurrencyUnit(String value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseCurrencyUnit <em>Base Currency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseCurrencyUnit()
	 * @see #getBaseCurrencyUnit()
	 * @see #setBaseCurrencyUnit(String)
	 * @generated
	 */
	void unsetBaseCurrencyUnit();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseCurrencyUnit <em>Base Currency Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Currency Unit</em>' attribute is set.
	 * @see #unsetBaseCurrencyUnit()
	 * @see #getBaseCurrencyUnit()
	 * @see #setBaseCurrencyUnit(String)
	 * @generated
	 */
	boolean isSetBaseCurrencyUnit();

	/**
	 * Returns the value of the '<em><b>Base Result Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Result Frequency</em>' attribute.
	 * @see #setBaseResultFrequency(Duration)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_BaseResultFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='baseResultFrequency'"
	 * @generated
	 */
	Duration getBaseResultFrequency();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseResultFrequency <em>Base Result Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Result Frequency</em>' attribute.
	 * @see #getBaseResultFrequency()
	 * @generated
	 */
	void setBaseResultFrequency(Duration value);

	/**
	 * Returns the value of the '<em><b>Base Result Frequency Cumul</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Result Frequency Cumul</em>' attribute.
	 * @see #isSetBaseResultFrequencyCumul()
	 * @see #unsetBaseResultFrequencyCumul()
	 * @see #setBaseResultFrequencyCumul(boolean)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_BaseResultFrequencyCumul()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='baseResultFrequencyCumul'"
	 * @generated
	 */
	boolean isBaseResultFrequencyCumul();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#isBaseResultFrequencyCumul <em>Base Result Frequency Cumul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Result Frequency Cumul</em>' attribute.
	 * @see #isSetBaseResultFrequencyCumul()
	 * @see #unsetBaseResultFrequencyCumul()
	 * @see #isBaseResultFrequencyCumul()
	 * @generated
	 */
	void setBaseResultFrequencyCumul(boolean value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#isBaseResultFrequencyCumul <em>Base Result Frequency Cumul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseResultFrequencyCumul()
	 * @see #isBaseResultFrequencyCumul()
	 * @see #setBaseResultFrequencyCumul(boolean)
	 * @generated
	 */
	void unsetBaseResultFrequencyCumul();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#isBaseResultFrequencyCumul <em>Base Result Frequency Cumul</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Result Frequency Cumul</em>' attribute is set.
	 * @see #unsetBaseResultFrequencyCumul()
	 * @see #isBaseResultFrequencyCumul()
	 * @see #setBaseResultFrequencyCumul(boolean)
	 * @generated
	 */
	boolean isSetBaseResultFrequencyCumul();

	/**
	 * Returns the value of the '<em><b>Base Time Unit</b></em>' attribute.
	 * The default value is <code>"min"</code>.
	 * The literals are from the enumeration {@link org.gemoc.bpsim2.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Time Unit</em>' attribute.
	 * @see org.gemoc.bpsim2.TimeUnit
	 * @see #isSetBaseTimeUnit()
	 * @see #unsetBaseTimeUnit()
	 * @see #setBaseTimeUnit(TimeUnit)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_BaseTimeUnit()
	 * @model default="min" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='baseTimeUnit'"
	 * @generated
	 */
	TimeUnit getBaseTimeUnit();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseTimeUnit <em>Base Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Time Unit</em>' attribute.
	 * @see org.gemoc.bpsim2.TimeUnit
	 * @see #isSetBaseTimeUnit()
	 * @see #unsetBaseTimeUnit()
	 * @see #getBaseTimeUnit()
	 * @generated
	 */
	void setBaseTimeUnit(TimeUnit value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseTimeUnit <em>Base Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseTimeUnit()
	 * @see #getBaseTimeUnit()
	 * @see #setBaseTimeUnit(TimeUnit)
	 * @generated
	 */
	void unsetBaseTimeUnit();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseTimeUnit <em>Base Time Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Time Unit</em>' attribute is set.
	 * @see #unsetBaseTimeUnit()
	 * @see #getBaseTimeUnit()
	 * @see #setBaseTimeUnit(TimeUnit)
	 * @generated
	 */
	boolean isSetBaseTimeUnit();

	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication</em>' attribute.
	 * @see #isSetReplication()
	 * @see #unsetReplication()
	 * @see #setReplication(int)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_Replication()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='replication'"
	 * @generated
	 */
	int getReplication();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see #isSetReplication()
	 * @see #unsetReplication()
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(int value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplication()
	 * @see #getReplication()
	 * @see #setReplication(int)
	 * @generated
	 */
	void unsetReplication();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getReplication <em>Replication</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replication</em>' attribute is set.
	 * @see #unsetReplication()
	 * @see #getReplication()
	 * @see #setReplication(int)
	 * @generated
	 */
	boolean isSetReplication();

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #isSetSeed()
	 * @see #unsetSeed()
	 * @see #setSeed(long)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_Seed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='seed'"
	 * @generated
	 */
	long getSeed();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #isSetSeed()
	 * @see #unsetSeed()
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(long value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeed()
	 * @see #getSeed()
	 * @see #setSeed(long)
	 * @generated
	 */
	void unsetSeed();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getSeed <em>Seed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seed</em>' attribute is set.
	 * @see #unsetSeed()
	 * @see #getSeed()
	 * @see #setSeed(long)
	 * @generated
	 */
	boolean isSetSeed();

	/**
	 * Returns the value of the '<em><b>Trace Format</b></em>' attribute.
	 * The default value is <code>"XES"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Format</em>' attribute.
	 * @see #isSetTraceFormat()
	 * @see #unsetTraceFormat()
	 * @see #setTraceFormat(String)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_TraceFormat()
	 * @model default="XES" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='traceFormat'"
	 * @generated
	 */
	String getTraceFormat();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getTraceFormat <em>Trace Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Format</em>' attribute.
	 * @see #isSetTraceFormat()
	 * @see #unsetTraceFormat()
	 * @see #getTraceFormat()
	 * @generated
	 */
	void setTraceFormat(String value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getTraceFormat <em>Trace Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTraceFormat()
	 * @see #getTraceFormat()
	 * @see #setTraceFormat(String)
	 * @generated
	 */
	void unsetTraceFormat();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#getTraceFormat <em>Trace Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trace Format</em>' attribute is set.
	 * @see #unsetTraceFormat()
	 * @see #getTraceFormat()
	 * @see #setTraceFormat(String)
	 * @generated
	 */
	boolean isSetTraceFormat();

	/**
	 * Returns the value of the '<em><b>Trace Output</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Output</em>' attribute.
	 * @see #isSetTraceOutput()
	 * @see #unsetTraceOutput()
	 * @see #setTraceOutput(boolean)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getScenarioParameters_TraceOutput()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='traceOutput'"
	 * @generated
	 */
	boolean isTraceOutput();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#isTraceOutput <em>Trace Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Output</em>' attribute.
	 * @see #isSetTraceOutput()
	 * @see #unsetTraceOutput()
	 * @see #isTraceOutput()
	 * @generated
	 */
	void setTraceOutput(boolean value);

	/**
	 * Unsets the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#isTraceOutput <em>Trace Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTraceOutput()
	 * @see #isTraceOutput()
	 * @see #setTraceOutput(boolean)
	 * @generated
	 */
	void unsetTraceOutput();

	/**
	 * Returns whether the value of the '{@link org.gemoc.bpsim2.ScenarioParameters#isTraceOutput <em>Trace Output</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trace Output</em>' attribute is set.
	 * @see #unsetTraceOutput()
	 * @see #isTraceOutput()
	 * @see #setTraceOutput(boolean)
	 * @generated
	 */
	boolean isSetTraceOutput();

} // ScenarioParameters
