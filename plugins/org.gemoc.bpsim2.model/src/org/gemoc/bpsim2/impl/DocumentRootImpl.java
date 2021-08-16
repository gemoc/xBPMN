/**
 */
package org.gemoc.bpsim2.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.bpsim2.BPSimDataType;
import org.gemoc.bpsim2.BetaDistributionType;
import org.gemoc.bpsim2.BinomialDistributionType;
import org.gemoc.bpsim2.BooleanParameterType;
import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.DateTimeParameterType;
import org.gemoc.bpsim2.DocumentRoot;
import org.gemoc.bpsim2.DurationParameterType;
import org.gemoc.bpsim2.EnumParameterType;
import org.gemoc.bpsim2.ErlangDistributionType;
import org.gemoc.bpsim2.ExpressionParameterType;
import org.gemoc.bpsim2.FloatingParameterType;
import org.gemoc.bpsim2.GammaDistributionType;
import org.gemoc.bpsim2.LogNormalDistributionType;
import org.gemoc.bpsim2.NegativeExponentialDistributionType;
import org.gemoc.bpsim2.NormalDistributionType;
import org.gemoc.bpsim2.NumericParameterType;
import org.gemoc.bpsim2.ParameterValue;
import org.gemoc.bpsim2.PoissonDistributionType;
import org.gemoc.bpsim2.StringParameterType;
import org.gemoc.bpsim2.TriangularDistributionType;
import org.gemoc.bpsim2.TruncatedNormalDistributionType;
import org.gemoc.bpsim2.UniformDistributionType;
import org.gemoc.bpsim2.UserDistributionDataPointType;
import org.gemoc.bpsim2.UserDistributionType;
import org.gemoc.bpsim2.WeibullDistributionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getBetaDistribution <em>Beta Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getBinomialDistribution <em>Binomial Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getBooleanParameter <em>Boolean Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getBPSimData <em>BP Sim Data</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getDateTimeParameter <em>Date Time Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getDurationParameter <em>Duration Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getEnumParameter <em>Enum Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getErlangDistribution <em>Erlang Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getExpressionParameter <em>Expression Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getFloatingParameter <em>Floating Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getGammaDistribution <em>Gamma Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getLogNormalDistribution <em>Log Normal Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getNegativeExponentialDistribution <em>Negative Exponential Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getNormalDistribution <em>Normal Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getNumericParameter <em>Numeric Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getPoissonDistribution <em>Poisson Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getStringParameter <em>String Parameter</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getTriangularDistribution <em>Triangular Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getTruncatedNormalDistribution <em>Truncated Normal Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getUniformDistribution <em>Uniform Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getUserDistribution <em>User Distribution</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getUserDistributionDataPoint <em>User Distribution Data Point</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.DocumentRootImpl#getWeibullDistribution <em>Weibull Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Bpsim2Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Bpsim2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Bpsim2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BetaDistributionType getBetaDistribution() {
		return (BetaDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__BETA_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBetaDistribution(BetaDistributionType newBetaDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__BETA_DISTRIBUTION, newBetaDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBetaDistribution(BetaDistributionType newBetaDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__BETA_DISTRIBUTION, newBetaDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue getParameterValue() {
		return (ParameterValue)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__PARAMETER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValue(ParameterValue newParameterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__PARAMETER_VALUE, newParameterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValue(ParameterValue newParameterValue) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__PARAMETER_VALUE, newParameterValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinomialDistributionType getBinomialDistribution() {
		return (BinomialDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinomialDistribution(BinomialDistributionType newBinomialDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION, newBinomialDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinomialDistribution(BinomialDistributionType newBinomialDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION, newBinomialDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanParameterType getBooleanParameter() {
		return (BooleanParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__BOOLEAN_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanParameter(BooleanParameterType newBooleanParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__BOOLEAN_PARAMETER, newBooleanParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanParameter(BooleanParameterType newBooleanParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__BOOLEAN_PARAMETER, newBooleanParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPSimDataType getBPSimData() {
		return (BPSimDataType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__BP_SIM_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPSimData(BPSimDataType newBPSimData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__BP_SIM_DATA, newBPSimData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPSimData(BPSimDataType newBPSimData) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__BP_SIM_DATA, newBPSimData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeParameterType getDateTimeParameter() {
		return (DateTimeParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__DATE_TIME_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeParameter(DateTimeParameterType newDateTimeParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__DATE_TIME_PARAMETER, newDateTimeParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeParameter(DateTimeParameterType newDateTimeParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__DATE_TIME_PARAMETER, newDateTimeParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationParameterType getDurationParameter() {
		return (DurationParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__DURATION_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationParameter(DurationParameterType newDurationParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__DURATION_PARAMETER, newDurationParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationParameter(DurationParameterType newDurationParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__DURATION_PARAMETER, newDurationParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumParameterType getEnumParameter() {
		return (EnumParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__ENUM_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumParameter(EnumParameterType newEnumParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__ENUM_PARAMETER, newEnumParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumParameter(EnumParameterType newEnumParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__ENUM_PARAMETER, newEnumParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErlangDistributionType getErlangDistribution() {
		return (ErlangDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__ERLANG_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErlangDistribution(ErlangDistributionType newErlangDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__ERLANG_DISTRIBUTION, newErlangDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErlangDistribution(ErlangDistributionType newErlangDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__ERLANG_DISTRIBUTION, newErlangDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionParameterType getExpressionParameter() {
		return (ExpressionParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__EXPRESSION_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionParameter(ExpressionParameterType newExpressionParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__EXPRESSION_PARAMETER, newExpressionParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionParameter(ExpressionParameterType newExpressionParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__EXPRESSION_PARAMETER, newExpressionParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingParameterType getFloatingParameter() {
		return (FloatingParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__FLOATING_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatingParameter(FloatingParameterType newFloatingParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__FLOATING_PARAMETER, newFloatingParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingParameter(FloatingParameterType newFloatingParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__FLOATING_PARAMETER, newFloatingParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GammaDistributionType getGammaDistribution() {
		return (GammaDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__GAMMA_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGammaDistribution(GammaDistributionType newGammaDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__GAMMA_DISTRIBUTION, newGammaDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGammaDistribution(GammaDistributionType newGammaDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__GAMMA_DISTRIBUTION, newGammaDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogNormalDistributionType getLogNormalDistribution() {
		return (LogNormalDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogNormalDistribution(LogNormalDistributionType newLogNormalDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION, newLogNormalDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogNormalDistribution(LogNormalDistributionType newLogNormalDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION, newLogNormalDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeExponentialDistributionType getNegativeExponentialDistribution() {
		return (NegativeExponentialDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegativeExponentialDistribution(NegativeExponentialDistributionType newNegativeExponentialDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION, newNegativeExponentialDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeExponentialDistribution(NegativeExponentialDistributionType newNegativeExponentialDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION, newNegativeExponentialDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDistributionType getNormalDistribution() {
		return (NormalDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__NORMAL_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalDistribution(NormalDistributionType newNormalDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__NORMAL_DISTRIBUTION, newNormalDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalDistribution(NormalDistributionType newNormalDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__NORMAL_DISTRIBUTION, newNormalDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericParameterType getNumericParameter() {
		return (NumericParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__NUMERIC_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumericParameter(NumericParameterType newNumericParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__NUMERIC_PARAMETER, newNumericParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericParameter(NumericParameterType newNumericParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__NUMERIC_PARAMETER, newNumericParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoissonDistributionType getPoissonDistribution() {
		return (PoissonDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__POISSON_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoissonDistribution(PoissonDistributionType newPoissonDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__POISSON_DISTRIBUTION, newPoissonDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoissonDistribution(PoissonDistributionType newPoissonDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__POISSON_DISTRIBUTION, newPoissonDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParameterType getStringParameter() {
		return (StringParameterType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__STRING_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringParameter(StringParameterType newStringParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__STRING_PARAMETER, newStringParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringParameter(StringParameterType newStringParameter) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__STRING_PARAMETER, newStringParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangularDistributionType getTriangularDistribution() {
		return (TriangularDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriangularDistribution(TriangularDistributionType newTriangularDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION, newTriangularDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriangularDistribution(TriangularDistributionType newTriangularDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION, newTriangularDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruncatedNormalDistributionType getTruncatedNormalDistribution() {
		return (TruncatedNormalDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruncatedNormalDistribution(TruncatedNormalDistributionType newTruncatedNormalDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION, newTruncatedNormalDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruncatedNormalDistribution(TruncatedNormalDistributionType newTruncatedNormalDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION, newTruncatedNormalDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformDistributionType getUniformDistribution() {
		return (UniformDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniformDistribution(UniformDistributionType newUniformDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION, newUniformDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniformDistribution(UniformDistributionType newUniformDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION, newUniformDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDistributionType getUserDistribution() {
		return (UserDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDistribution(UserDistributionType newUserDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION, newUserDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDistribution(UserDistributionType newUserDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION, newUserDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDistributionDataPointType getUserDistributionDataPoint() {
		return (UserDistributionDataPointType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDistributionDataPoint(UserDistributionDataPointType newUserDistributionDataPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT, newUserDistributionDataPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDistributionDataPoint(UserDistributionDataPointType newUserDistributionDataPoint) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT, newUserDistributionDataPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeibullDistributionType getWeibullDistribution() {
		return (WeibullDistributionType)getMixed().get(Bpsim2Package.Literals.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeibullDistribution(WeibullDistributionType newWeibullDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpsim2Package.Literals.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION, newWeibullDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeibullDistribution(WeibullDistributionType newWeibullDistribution) {
		((FeatureMap.Internal)getMixed()).set(Bpsim2Package.Literals.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION, newWeibullDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpsim2Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__BETA_DISTRIBUTION:
				return basicSetBetaDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__PARAMETER_VALUE:
				return basicSetParameterValue(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION:
				return basicSetBinomialDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__BOOLEAN_PARAMETER:
				return basicSetBooleanParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__BP_SIM_DATA:
				return basicSetBPSimData(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__DATE_TIME_PARAMETER:
				return basicSetDateTimeParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__DURATION_PARAMETER:
				return basicSetDurationParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__ENUM_PARAMETER:
				return basicSetEnumParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__ERLANG_DISTRIBUTION:
				return basicSetErlangDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__EXPRESSION_PARAMETER:
				return basicSetExpressionParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__FLOATING_PARAMETER:
				return basicSetFloatingParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__GAMMA_DISTRIBUTION:
				return basicSetGammaDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION:
				return basicSetLogNormalDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION:
				return basicSetNegativeExponentialDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__NORMAL_DISTRIBUTION:
				return basicSetNormalDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__NUMERIC_PARAMETER:
				return basicSetNumericParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__POISSON_DISTRIBUTION:
				return basicSetPoissonDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__STRING_PARAMETER:
				return basicSetStringParameter(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION:
				return basicSetTriangularDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION:
				return basicSetTruncatedNormalDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION:
				return basicSetUniformDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION:
				return basicSetUserDistribution(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT:
				return basicSetUserDistributionDataPoint(null, msgs);
			case Bpsim2Package.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION:
				return basicSetWeibullDistribution(null, msgs);
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
			case Bpsim2Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Bpsim2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Bpsim2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Bpsim2Package.DOCUMENT_ROOT__BETA_DISTRIBUTION:
				return getBetaDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__PARAMETER_VALUE:
				return getParameterValue();
			case Bpsim2Package.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION:
				return getBinomialDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__BOOLEAN_PARAMETER:
				return getBooleanParameter();
			case Bpsim2Package.DOCUMENT_ROOT__BP_SIM_DATA:
				return getBPSimData();
			case Bpsim2Package.DOCUMENT_ROOT__DATE_TIME_PARAMETER:
				return getDateTimeParameter();
			case Bpsim2Package.DOCUMENT_ROOT__DURATION_PARAMETER:
				return getDurationParameter();
			case Bpsim2Package.DOCUMENT_ROOT__ENUM_PARAMETER:
				return getEnumParameter();
			case Bpsim2Package.DOCUMENT_ROOT__ERLANG_DISTRIBUTION:
				return getErlangDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__EXPRESSION_PARAMETER:
				return getExpressionParameter();
			case Bpsim2Package.DOCUMENT_ROOT__FLOATING_PARAMETER:
				return getFloatingParameter();
			case Bpsim2Package.DOCUMENT_ROOT__GAMMA_DISTRIBUTION:
				return getGammaDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION:
				return getLogNormalDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION:
				return getNegativeExponentialDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__NORMAL_DISTRIBUTION:
				return getNormalDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__NUMERIC_PARAMETER:
				return getNumericParameter();
			case Bpsim2Package.DOCUMENT_ROOT__POISSON_DISTRIBUTION:
				return getPoissonDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__STRING_PARAMETER:
				return getStringParameter();
			case Bpsim2Package.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION:
				return getTriangularDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION:
				return getTruncatedNormalDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION:
				return getUniformDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION:
				return getUserDistribution();
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT:
				return getUserDistributionDataPoint();
			case Bpsim2Package.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION:
				return getWeibullDistribution();
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
			case Bpsim2Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BETA_DISTRIBUTION:
				setBetaDistribution((BetaDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__PARAMETER_VALUE:
				setParameterValue((ParameterValue)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION:
				setBinomialDistribution((BinomialDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BOOLEAN_PARAMETER:
				setBooleanParameter((BooleanParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BP_SIM_DATA:
				setBPSimData((BPSimDataType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__DATE_TIME_PARAMETER:
				setDateTimeParameter((DateTimeParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__DURATION_PARAMETER:
				setDurationParameter((DurationParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__ENUM_PARAMETER:
				setEnumParameter((EnumParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__ERLANG_DISTRIBUTION:
				setErlangDistribution((ErlangDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__EXPRESSION_PARAMETER:
				setExpressionParameter((ExpressionParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__FLOATING_PARAMETER:
				setFloatingParameter((FloatingParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__GAMMA_DISTRIBUTION:
				setGammaDistribution((GammaDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION:
				setLogNormalDistribution((LogNormalDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION:
				setNegativeExponentialDistribution((NegativeExponentialDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__NORMAL_DISTRIBUTION:
				setNormalDistribution((NormalDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__NUMERIC_PARAMETER:
				setNumericParameter((NumericParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__POISSON_DISTRIBUTION:
				setPoissonDistribution((PoissonDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__STRING_PARAMETER:
				setStringParameter((StringParameterType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION:
				setTriangularDistribution((TriangularDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION:
				setTruncatedNormalDistribution((TruncatedNormalDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION:
				setUniformDistribution((UniformDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION:
				setUserDistribution((UserDistributionType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT:
				setUserDistributionDataPoint((UserDistributionDataPointType)newValue);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION:
				setWeibullDistribution((WeibullDistributionType)newValue);
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
			case Bpsim2Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Bpsim2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Bpsim2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BETA_DISTRIBUTION:
				setBetaDistribution((BetaDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__PARAMETER_VALUE:
				setParameterValue((ParameterValue)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION:
				setBinomialDistribution((BinomialDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BOOLEAN_PARAMETER:
				setBooleanParameter((BooleanParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__BP_SIM_DATA:
				setBPSimData((BPSimDataType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__DATE_TIME_PARAMETER:
				setDateTimeParameter((DateTimeParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__DURATION_PARAMETER:
				setDurationParameter((DurationParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__ENUM_PARAMETER:
				setEnumParameter((EnumParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__ERLANG_DISTRIBUTION:
				setErlangDistribution((ErlangDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__EXPRESSION_PARAMETER:
				setExpressionParameter((ExpressionParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__FLOATING_PARAMETER:
				setFloatingParameter((FloatingParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__GAMMA_DISTRIBUTION:
				setGammaDistribution((GammaDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION:
				setLogNormalDistribution((LogNormalDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION:
				setNegativeExponentialDistribution((NegativeExponentialDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__NORMAL_DISTRIBUTION:
				setNormalDistribution((NormalDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__NUMERIC_PARAMETER:
				setNumericParameter((NumericParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__POISSON_DISTRIBUTION:
				setPoissonDistribution((PoissonDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__STRING_PARAMETER:
				setStringParameter((StringParameterType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION:
				setTriangularDistribution((TriangularDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION:
				setTruncatedNormalDistribution((TruncatedNormalDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION:
				setUniformDistribution((UniformDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION:
				setUserDistribution((UserDistributionType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT:
				setUserDistributionDataPoint((UserDistributionDataPointType)null);
				return;
			case Bpsim2Package.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION:
				setWeibullDistribution((WeibullDistributionType)null);
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
			case Bpsim2Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Bpsim2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Bpsim2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Bpsim2Package.DOCUMENT_ROOT__BETA_DISTRIBUTION:
				return getBetaDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__PARAMETER_VALUE:
				return getParameterValue() != null;
			case Bpsim2Package.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION:
				return getBinomialDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__BOOLEAN_PARAMETER:
				return getBooleanParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__BP_SIM_DATA:
				return getBPSimData() != null;
			case Bpsim2Package.DOCUMENT_ROOT__DATE_TIME_PARAMETER:
				return getDateTimeParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__DURATION_PARAMETER:
				return getDurationParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__ENUM_PARAMETER:
				return getEnumParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__ERLANG_DISTRIBUTION:
				return getErlangDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__EXPRESSION_PARAMETER:
				return getExpressionParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__FLOATING_PARAMETER:
				return getFloatingParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__GAMMA_DISTRIBUTION:
				return getGammaDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION:
				return getLogNormalDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION:
				return getNegativeExponentialDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__NORMAL_DISTRIBUTION:
				return getNormalDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__NUMERIC_PARAMETER:
				return getNumericParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__POISSON_DISTRIBUTION:
				return getPoissonDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__STRING_PARAMETER:
				return getStringParameter() != null;
			case Bpsim2Package.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION:
				return getTriangularDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION:
				return getTruncatedNormalDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION:
				return getUniformDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION:
				return getUserDistribution() != null;
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT:
				return getUserDistributionDataPoint() != null;
			case Bpsim2Package.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION:
				return getWeibullDistribution() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
