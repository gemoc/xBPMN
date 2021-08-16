/**
 */
package org.gemoc.bpsim2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.bpsim2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bpsim2FactoryImpl extends EFactoryImpl implements Bpsim2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bpsim2Factory init() {
		try {
			Bpsim2Factory theBpsim2Factory = (Bpsim2Factory)EPackage.Registry.INSTANCE.getEFactory(Bpsim2Package.eNS_URI);
			if (theBpsim2Factory != null) {
				return theBpsim2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bpsim2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpsim2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bpsim2Package.BETA_DISTRIBUTION_TYPE: return createBetaDistributionType();
			case Bpsim2Package.BINOMIAL_DISTRIBUTION_TYPE: return createBinomialDistributionType();
			case Bpsim2Package.BOOLEAN_PARAMETER_TYPE: return createBooleanParameterType();
			case Bpsim2Package.BP_SIM_DATA_TYPE: return createBPSimDataType();
			case Bpsim2Package.CALENDAR: return createCalendar();
			case Bpsim2Package.CONSTANT_PARAMETER: return createConstantParameter();
			case Bpsim2Package.CONTROL_PARAMETERS: return createControlParameters();
			case Bpsim2Package.COST_PARAMETERS: return createCostParameters();
			case Bpsim2Package.DATE_TIME_PARAMETER_TYPE: return createDateTimeParameterType();
			case Bpsim2Package.DISTRIBUTION_PARAMETER: return createDistributionParameter();
			case Bpsim2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Bpsim2Package.DURATION_PARAMETER_TYPE: return createDurationParameterType();
			case Bpsim2Package.ELEMENT_PARAMETERS: return createElementParameters();
			case Bpsim2Package.ELEMENT_PARAMETERS_TYPE: return createElementParametersType();
			case Bpsim2Package.ENUM_PARAMETER_TYPE: return createEnumParameterType();
			case Bpsim2Package.ERLANG_DISTRIBUTION_TYPE: return createErlangDistributionType();
			case Bpsim2Package.EXPRESSION_PARAMETER_TYPE: return createExpressionParameterType();
			case Bpsim2Package.FLOATING_PARAMETER_TYPE: return createFloatingParameterType();
			case Bpsim2Package.GAMMA_DISTRIBUTION_TYPE: return createGammaDistributionType();
			case Bpsim2Package.LOG_NORMAL_DISTRIBUTION_TYPE: return createLogNormalDistributionType();
			case Bpsim2Package.NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE: return createNegativeExponentialDistributionType();
			case Bpsim2Package.NORMAL_DISTRIBUTION_TYPE: return createNormalDistributionType();
			case Bpsim2Package.NUMERIC_PARAMETER_TYPE: return createNumericParameterType();
			case Bpsim2Package.PARAMETER: return createParameter();
			case Bpsim2Package.PARAMETER_VALUE: return createParameterValue();
			case Bpsim2Package.POISSON_DISTRIBUTION_TYPE: return createPoissonDistributionType();
			case Bpsim2Package.PRIORITY_PARAMETERS: return createPriorityParameters();
			case Bpsim2Package.PROPERTY_PARAMETERS: return createPropertyParameters();
			case Bpsim2Package.PROPERTY_TYPE1: return createPropertyType1();
			case Bpsim2Package.RESOURCE_PARAMETERS: return createResourceParameters();
			case Bpsim2Package.SCENARIO: return createScenario();
			case Bpsim2Package.SCENARIO_PARAMETERS: return createScenarioParameters();
			case Bpsim2Package.SCENARIO_PARAMETERS_TYPE: return createScenarioParametersType();
			case Bpsim2Package.STRING_PARAMETER_TYPE: return createStringParameterType();
			case Bpsim2Package.TIME_PARAMETERS: return createTimeParameters();
			case Bpsim2Package.TRIANGULAR_DISTRIBUTION_TYPE: return createTriangularDistributionType();
			case Bpsim2Package.TRUNCATED_NORMAL_DISTRIBUTION_TYPE: return createTruncatedNormalDistributionType();
			case Bpsim2Package.UNIFORM_DISTRIBUTION_TYPE: return createUniformDistributionType();
			case Bpsim2Package.USER_DISTRIBUTION_DATA_POINT_TYPE: return createUserDistributionDataPointType();
			case Bpsim2Package.USER_DISTRIBUTION_TYPE: return createUserDistributionType();
			case Bpsim2Package.VENDOR_EXTENSION: return createVendorExtension();
			case Bpsim2Package.WEIBULL_DISTRIBUTION_TYPE: return createWeibullDistributionType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Bpsim2Package.PROPERTY_TYPE:
				return createPropertyTypeFromString(eDataType, initialValue);
			case Bpsim2Package.RESULT_TYPE:
				return createResultTypeFromString(eDataType, initialValue);
			case Bpsim2Package.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case Bpsim2Package.PROPERTY_TYPE_OBJECT:
				return createPropertyTypeObjectFromString(eDataType, initialValue);
			case Bpsim2Package.RESULT_TYPE_OBJECT:
				return createResultTypeObjectFromString(eDataType, initialValue);
			case Bpsim2Package.TIME_UNIT_OBJECT:
				return createTimeUnitObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Bpsim2Package.PROPERTY_TYPE:
				return convertPropertyTypeToString(eDataType, instanceValue);
			case Bpsim2Package.RESULT_TYPE:
				return convertResultTypeToString(eDataType, instanceValue);
			case Bpsim2Package.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case Bpsim2Package.PROPERTY_TYPE_OBJECT:
				return convertPropertyTypeObjectToString(eDataType, instanceValue);
			case Bpsim2Package.RESULT_TYPE_OBJECT:
				return convertResultTypeObjectToString(eDataType, instanceValue);
			case Bpsim2Package.TIME_UNIT_OBJECT:
				return convertTimeUnitObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BetaDistributionType createBetaDistributionType() {
		BetaDistributionTypeImpl betaDistributionType = new BetaDistributionTypeImpl();
		return betaDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinomialDistributionType createBinomialDistributionType() {
		BinomialDistributionTypeImpl binomialDistributionType = new BinomialDistributionTypeImpl();
		return binomialDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanParameterType createBooleanParameterType() {
		BooleanParameterTypeImpl booleanParameterType = new BooleanParameterTypeImpl();
		return booleanParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPSimDataType createBPSimDataType() {
		BPSimDataTypeImpl bpSimDataType = new BPSimDataTypeImpl();
		return bpSimDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantParameter createConstantParameter() {
		ConstantParameterImpl constantParameter = new ConstantParameterImpl();
		return constantParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParameters createControlParameters() {
		ControlParametersImpl controlParameters = new ControlParametersImpl();
		return controlParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostParameters createCostParameters() {
		CostParametersImpl costParameters = new CostParametersImpl();
		return costParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeParameterType createDateTimeParameterType() {
		DateTimeParameterTypeImpl dateTimeParameterType = new DateTimeParameterTypeImpl();
		return dateTimeParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionParameter createDistributionParameter() {
		DistributionParameterImpl distributionParameter = new DistributionParameterImpl();
		return distributionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationParameterType createDurationParameterType() {
		DurationParameterTypeImpl durationParameterType = new DurationParameterTypeImpl();
		return durationParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementParameters createElementParameters() {
		ElementParametersImpl elementParameters = new ElementParametersImpl();
		return elementParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementParametersType createElementParametersType() {
		ElementParametersTypeImpl elementParametersType = new ElementParametersTypeImpl();
		return elementParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumParameterType createEnumParameterType() {
		EnumParameterTypeImpl enumParameterType = new EnumParameterTypeImpl();
		return enumParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErlangDistributionType createErlangDistributionType() {
		ErlangDistributionTypeImpl erlangDistributionType = new ErlangDistributionTypeImpl();
		return erlangDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionParameterType createExpressionParameterType() {
		ExpressionParameterTypeImpl expressionParameterType = new ExpressionParameterTypeImpl();
		return expressionParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingParameterType createFloatingParameterType() {
		FloatingParameterTypeImpl floatingParameterType = new FloatingParameterTypeImpl();
		return floatingParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GammaDistributionType createGammaDistributionType() {
		GammaDistributionTypeImpl gammaDistributionType = new GammaDistributionTypeImpl();
		return gammaDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogNormalDistributionType createLogNormalDistributionType() {
		LogNormalDistributionTypeImpl logNormalDistributionType = new LogNormalDistributionTypeImpl();
		return logNormalDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeExponentialDistributionType createNegativeExponentialDistributionType() {
		NegativeExponentialDistributionTypeImpl negativeExponentialDistributionType = new NegativeExponentialDistributionTypeImpl();
		return negativeExponentialDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDistributionType createNormalDistributionType() {
		NormalDistributionTypeImpl normalDistributionType = new NormalDistributionTypeImpl();
		return normalDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericParameterType createNumericParameterType() {
		NumericParameterTypeImpl numericParameterType = new NumericParameterTypeImpl();
		return numericParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoissonDistributionType createPoissonDistributionType() {
		PoissonDistributionTypeImpl poissonDistributionType = new PoissonDistributionTypeImpl();
		return poissonDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityParameters createPriorityParameters() {
		PriorityParametersImpl priorityParameters = new PriorityParametersImpl();
		return priorityParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyParameters createPropertyParameters() {
		PropertyParametersImpl propertyParameters = new PropertyParametersImpl();
		return propertyParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType1 createPropertyType1() {
		PropertyType1Impl propertyType1 = new PropertyType1Impl();
		return propertyType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameters createResourceParameters() {
		ResourceParametersImpl resourceParameters = new ResourceParametersImpl();
		return resourceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioParameters createScenarioParameters() {
		ScenarioParametersImpl scenarioParameters = new ScenarioParametersImpl();
		return scenarioParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioParametersType createScenarioParametersType() {
		ScenarioParametersTypeImpl scenarioParametersType = new ScenarioParametersTypeImpl();
		return scenarioParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParameterType createStringParameterType() {
		StringParameterTypeImpl stringParameterType = new StringParameterTypeImpl();
		return stringParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParameters createTimeParameters() {
		TimeParametersImpl timeParameters = new TimeParametersImpl();
		return timeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangularDistributionType createTriangularDistributionType() {
		TriangularDistributionTypeImpl triangularDistributionType = new TriangularDistributionTypeImpl();
		return triangularDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruncatedNormalDistributionType createTruncatedNormalDistributionType() {
		TruncatedNormalDistributionTypeImpl truncatedNormalDistributionType = new TruncatedNormalDistributionTypeImpl();
		return truncatedNormalDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformDistributionType createUniformDistributionType() {
		UniformDistributionTypeImpl uniformDistributionType = new UniformDistributionTypeImpl();
		return uniformDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDistributionDataPointType createUserDistributionDataPointType() {
		UserDistributionDataPointTypeImpl userDistributionDataPointType = new UserDistributionDataPointTypeImpl();
		return userDistributionDataPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDistributionType createUserDistributionType() {
		UserDistributionTypeImpl userDistributionType = new UserDistributionTypeImpl();
		return userDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtension createVendorExtension() {
		VendorExtensionImpl vendorExtension = new VendorExtensionImpl();
		return vendorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeibullDistributionType createWeibullDistributionType() {
		WeibullDistributionTypeImpl weibullDistributionType = new WeibullDistributionTypeImpl();
		return weibullDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultTypeFromString(EDataType eDataType, String initialValue) {
		ResultType result = ResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeFromString(Bpsim2Package.Literals.PROPERTY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeToString(Bpsim2Package.Literals.PROPERTY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResultTypeFromString(Bpsim2Package.Literals.RESULT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResultTypeToString(Bpsim2Package.Literals.RESULT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeUnitFromString(Bpsim2Package.Literals.TIME_UNIT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeUnitToString(Bpsim2Package.Literals.TIME_UNIT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpsim2Package getBpsim2Package() {
		return (Bpsim2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bpsim2Package getPackage() {
		return Bpsim2Package.eINSTANCE;
	}

} //Bpsim2FactoryImpl
