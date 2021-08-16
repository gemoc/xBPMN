/**
 */
package org.gemoc.bpsim2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.bpsim2.Bpsim2Factory
 * @model kind="package"
 * @generated
 */
public interface Bpsim2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpsim2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bpsim.org/schemas/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpsim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bpsim2Package eINSTANCE = org.gemoc.bpsim2.impl.Bpsim2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ParameterValueImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__RESULT_TIME_STAMP = 2;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALID_FOR = 3;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.DistributionParameterImpl <em>Distribution Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.DistributionParameterImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDistributionParameter()
	 * @generated
	 */
	int DISTRIBUTION_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_PARAMETER__INSTANCE = PARAMETER_VALUE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_PARAMETER__RESULT = PARAMETER_VALUE__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP = PARAMETER_VALUE__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_PARAMETER__VALID_FOR = PARAMETER_VALUE__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_PARAMETER__TIME_UNIT = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distribution Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_PARAMETER_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distribution Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_PARAMETER_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.BetaDistributionTypeImpl <em>Beta Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.BetaDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBetaDistributionType()
	 * @generated
	 */
	int BETA_DISTRIBUTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE__SCALE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE__SHAPE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Beta Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Beta Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.BinomialDistributionTypeImpl <em>Binomial Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.BinomialDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBinomialDistributionType()
	 * @generated
	 */
	int BINOMIAL_DISTRIBUTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE__TRIALS = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binomial Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binomial Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ConstantParameterImpl <em>Constant Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ConstantParameterImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getConstantParameter()
	 * @generated
	 */
	int CONSTANT_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_PARAMETER__INSTANCE = PARAMETER_VALUE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_PARAMETER__RESULT = PARAMETER_VALUE__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_PARAMETER__RESULT_TIME_STAMP = PARAMETER_VALUE__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_PARAMETER__VALID_FOR = PARAMETER_VALUE__VALID_FOR;

	/**
	 * The number of structural features of the '<em>Constant Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_PARAMETER_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_PARAMETER_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.BooleanParameterTypeImpl <em>Boolean Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.BooleanParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBooleanParameterType()
	 * @generated
	 */
	int BOOLEAN_PARAMETER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__INSTANCE = CONSTANT_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__RESULT = CONSTANT_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__RESULT_TIME_STAMP = CONSTANT_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__VALID_FOR = CONSTANT_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__VALUE = CONSTANT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE_FEATURE_COUNT = CONSTANT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE_OPERATION_COUNT = CONSTANT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.BPSimDataTypeImpl <em>BP Sim Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.BPSimDataTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBPSimDataType()
	 * @generated
	 */
	int BP_SIM_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SIM_DATA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SIM_DATA_TYPE__SCENARIO = 1;

	/**
	 * The number of structural features of the '<em>BP Sim Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SIM_DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BP Sim Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SIM_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.CalendarImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ControlParametersImpl <em>Control Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ControlParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getControlParameters()
	 * @generated
	 */
	int CONTROL_PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETERS__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETERS__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Inter Trigger Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETERS__INTER_TRIGGER_TIMER = 2;

	/**
	 * The feature id for the '<em><b>Trigger Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETERS__TRIGGER_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Control Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETERS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Control Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.CostParametersImpl <em>Cost Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.CostParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getCostParameters()
	 * @generated
	 */
	int COST_PARAMETERS = 7;

	/**
	 * The feature id for the '<em><b>Fixed Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PARAMETERS__FIXED_COST = 0;

	/**
	 * The feature id for the '<em><b>Unit Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PARAMETERS__UNIT_COST = 1;

	/**
	 * The number of structural features of the '<em>Cost Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cost Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.DateTimeParameterTypeImpl <em>Date Time Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.DateTimeParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDateTimeParameterType()
	 * @generated
	 */
	int DATE_TIME_PARAMETER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__INSTANCE = CONSTANT_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__RESULT = CONSTANT_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__RESULT_TIME_STAMP = CONSTANT_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__VALID_FOR = CONSTANT_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__VALUE = CONSTANT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE_FEATURE_COUNT = CONSTANT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE_OPERATION_COUNT = CONSTANT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.DocumentRootImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Beta Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BETA_DISTRIBUTION = 3;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAMETER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION = 5;

	/**
	 * The feature id for the '<em><b>Boolean Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>BP Sim Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BP_SIM_DATA = 7;

	/**
	 * The feature id for the '<em><b>Date Time Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_TIME_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Duration Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DURATION_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Enum Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENUM_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Erlang Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERLANG_DISTRIBUTION = 11;

	/**
	 * The feature id for the '<em><b>Expression Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Floating Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOATING_PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Gamma Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GAMMA_DISTRIBUTION = 14;

	/**
	 * The feature id for the '<em><b>Log Normal Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION = 15;

	/**
	 * The feature id for the '<em><b>Negative Exponential Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION = 16;

	/**
	 * The feature id for the '<em><b>Normal Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NORMAL_DISTRIBUTION = 17;

	/**
	 * The feature id for the '<em><b>Numeric Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMERIC_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Poisson Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POISSON_DISTRIBUTION = 19;

	/**
	 * The feature id for the '<em><b>String Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Triangular Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION = 21;

	/**
	 * The feature id for the '<em><b>Truncated Normal Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION = 22;

	/**
	 * The feature id for the '<em><b>Uniform Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIFORM_DISTRIBUTION = 23;

	/**
	 * The feature id for the '<em><b>User Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_DISTRIBUTION = 24;

	/**
	 * The feature id for the '<em><b>User Distribution Data Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT = 25;

	/**
	 * The feature id for the '<em><b>Weibull Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEIBULL_DISTRIBUTION = 26;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 27;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.DurationParameterTypeImpl <em>Duration Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.DurationParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDurationParameterType()
	 * @generated
	 */
	int DURATION_PARAMETER_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PARAMETER_TYPE__INSTANCE = CONSTANT_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PARAMETER_TYPE__RESULT = CONSTANT_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PARAMETER_TYPE__RESULT_TIME_STAMP = CONSTANT_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PARAMETER_TYPE__VALID_FOR = CONSTANT_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PARAMETER_TYPE__VALUE = CONSTANT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PARAMETER_TYPE_FEATURE_COUNT = CONSTANT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Duration Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PARAMETER_TYPE_OPERATION_COUNT = CONSTANT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ElementParametersImpl <em>Element Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ElementParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getElementParameters()
	 * @generated
	 */
	int ELEMENT_PARAMETERS = 12;

	/**
	 * The feature id for the '<em><b>Time Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__TIME_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__CONTROL_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Resource Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__RESOURCE_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Priority Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__PRIORITY_PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Cost Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__COST_PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Property Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__PROPERTY_PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__VENDOR_EXTENSION = 6;

	/**
	 * The feature id for the '<em><b>Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__ELEMENT_REF = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__ID = 8;

	/**
	 * The feature id for the '<em><b>Bpmn Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS__BPMN_ELEMENT_REF = 9;

	/**
	 * The number of structural features of the '<em>Element Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Element Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ElementParametersTypeImpl <em>Element Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ElementParametersTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getElementParametersType()
	 * @generated
	 */
	int ELEMENT_PARAMETERS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Time Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__TIME_PARAMETERS = ELEMENT_PARAMETERS__TIME_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__CONTROL_PARAMETERS = ELEMENT_PARAMETERS__CONTROL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Resource Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__RESOURCE_PARAMETERS = ELEMENT_PARAMETERS__RESOURCE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Priority Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__PRIORITY_PARAMETERS = ELEMENT_PARAMETERS__PRIORITY_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Cost Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__COST_PARAMETERS = ELEMENT_PARAMETERS__COST_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Property Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__PROPERTY_PARAMETERS = ELEMENT_PARAMETERS__PROPERTY_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__VENDOR_EXTENSION = ELEMENT_PARAMETERS__VENDOR_EXTENSION;

	/**
	 * The feature id for the '<em><b>Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__ELEMENT_REF = ELEMENT_PARAMETERS__ELEMENT_REF;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__ID = ELEMENT_PARAMETERS__ID;

	/**
	 * The feature id for the '<em><b>Bpmn Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE__BPMN_ELEMENT_REF = ELEMENT_PARAMETERS__BPMN_ELEMENT_REF;

	/**
	 * The number of structural features of the '<em>Element Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE_FEATURE_COUNT = ELEMENT_PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETERS_TYPE_OPERATION_COUNT = ELEMENT_PARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.EnumParameterTypeImpl <em>Enum Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.EnumParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getEnumParameterType()
	 * @generated
	 */
	int ENUM_PARAMETER_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE__INSTANCE = PARAMETER_VALUE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE__RESULT = PARAMETER_VALUE__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE__RESULT_TIME_STAMP = PARAMETER_VALUE__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE__VALID_FOR = PARAMETER_VALUE__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE__GROUP = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE__PARAMETER_VALUE_GROUP = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE__PARAMETER_VALUE = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enum Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Enum Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAMETER_TYPE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ErlangDistributionTypeImpl <em>Erlang Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ErlangDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getErlangDistributionType()
	 * @generated
	 */
	int ERLANG_DISTRIBUTION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE__K = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE__MEAN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erlang Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erlang Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ExpressionParameterTypeImpl <em>Expression Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ExpressionParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getExpressionParameterType()
	 * @generated
	 */
	int EXPRESSION_PARAMETER_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARAMETER_TYPE__INSTANCE = PARAMETER_VALUE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARAMETER_TYPE__RESULT = PARAMETER_VALUE__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARAMETER_TYPE__RESULT_TIME_STAMP = PARAMETER_VALUE__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARAMETER_TYPE__VALID_FOR = PARAMETER_VALUE__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARAMETER_TYPE__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARAMETER_TYPE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARAMETER_TYPE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.FloatingParameterTypeImpl <em>Floating Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.FloatingParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getFloatingParameterType()
	 * @generated
	 */
	int FLOATING_PARAMETER_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE__INSTANCE = CONSTANT_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE__RESULT = CONSTANT_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE__RESULT_TIME_STAMP = CONSTANT_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE__VALID_FOR = CONSTANT_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE__TIME_UNIT = CONSTANT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE__VALUE = CONSTANT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floating Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE_FEATURE_COUNT = CONSTANT_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Floating Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_PARAMETER_TYPE_OPERATION_COUNT = CONSTANT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.GammaDistributionTypeImpl <em>Gamma Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.GammaDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getGammaDistributionType()
	 * @generated
	 */
	int GAMMA_DISTRIBUTION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE__SCALE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE__SHAPE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gamma Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gamma Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.LogNormalDistributionTypeImpl <em>Log Normal Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.LogNormalDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getLogNormalDistributionType()
	 * @generated
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE__MEAN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE__STANDARD_DEVIATION = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Log Normal Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Log Normal Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_NORMAL_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.NegativeExponentialDistributionTypeImpl <em>Negative Exponential Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.NegativeExponentialDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getNegativeExponentialDistributionType()
	 * @generated
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE__MEAN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negative Exponential Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negative Exponential Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.NormalDistributionTypeImpl <em>Normal Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.NormalDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getNormalDistributionType()
	 * @generated
	 */
	int NORMAL_DISTRIBUTION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE__MEAN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE__STANDARD_DEVIATION = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.NumericParameterTypeImpl <em>Numeric Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.NumericParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getNumericParameterType()
	 * @generated
	 */
	int NUMERIC_PARAMETER_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE__INSTANCE = CONSTANT_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE__RESULT = CONSTANT_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE__RESULT_TIME_STAMP = CONSTANT_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE__VALID_FOR = CONSTANT_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE__TIME_UNIT = CONSTANT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE__VALUE = CONSTANT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE_FEATURE_COUNT = CONSTANT_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Numeric Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PARAMETER_TYPE_OPERATION_COUNT = CONSTANT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ParameterImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Result Request</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RESULT_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Parameter Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_VALUE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.PoissonDistributionTypeImpl <em>Poisson Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.PoissonDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPoissonDistributionType()
	 * @generated
	 */
	int POISSON_DISTRIBUTION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE__MEAN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Poisson Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Poisson Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.PriorityParametersImpl <em>Priority Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.PriorityParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPriorityParameters()
	 * @generated
	 */
	int PRIORITY_PARAMETERS = 26;

	/**
	 * The feature id for the '<em><b>Interruptible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_PARAMETERS__INTERRUPTIBLE = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_PARAMETERS__PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Priority Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Priority Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.PropertyParametersImpl <em>Property Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.PropertyParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyParameters()
	 * @generated
	 */
	int PROPERTY_PARAMETERS = 27;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PARAMETERS__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PARAMETERS__QUEUE_LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Property Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.PropertyType1Impl <em>Property Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.PropertyType1Impl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyType1()
	 * @generated
	 */
	int PROPERTY_TYPE1 = 28;

	/**
	 * The feature id for the '<em><b>Result Request</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE1__RESULT_REQUEST = PARAMETER__RESULT_REQUEST;

	/**
	 * The feature id for the '<em><b>Parameter Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE1__PARAMETER_VALUE_GROUP = PARAMETER__PARAMETER_VALUE_GROUP;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE1__PARAMETER_VALUE = PARAMETER__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE1__NAME = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE1__TYPE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE1_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE1_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ResourceParametersImpl <em>Resource Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ResourceParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getResourceParameters()
	 * @generated
	 */
	int RESOURCE_PARAMETERS = 29;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETERS__SELECTION = 0;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETERS__AVAILABILITY = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETERS__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETERS__ROLE = 3;

	/**
	 * The number of structural features of the '<em>Resource Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETERS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ScenarioImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 30;

	/**
	 * The feature id for the '<em><b>Scenario Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Element Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ELEMENT_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CALENDAR = 2;

	/**
	 * The feature id for the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VENDOR_EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CREATED = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID = 7;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__INHERITS = 8;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MODIFIED = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 10;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__RESULT = 11;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VENDOR = 12;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VERSION = 13;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl <em>Scenario Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ScenarioParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getScenarioParameters()
	 * @generated
	 */
	int SCENARIO_PARAMETERS = 31;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__START = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Warmup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__WARMUP = 2;

	/**
	 * The feature id for the '<em><b>Property Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__PROPERTY_PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Base Currency Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Base Result Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY = 5;

	/**
	 * The feature id for the '<em><b>Base Result Frequency Cumul</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL = 6;

	/**
	 * The feature id for the '<em><b>Base Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__BASE_TIME_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__REPLICATION = 8;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__SEED = 9;

	/**
	 * The feature id for the '<em><b>Trace Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__TRACE_FORMAT = 10;

	/**
	 * The feature id for the '<em><b>Trace Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS__TRACE_OUTPUT = 11;

	/**
	 * The number of structural features of the '<em>Scenario Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Scenario Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.ScenarioParametersTypeImpl <em>Scenario Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.ScenarioParametersTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getScenarioParametersType()
	 * @generated
	 */
	int SCENARIO_PARAMETERS_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__START = SCENARIO_PARAMETERS__START;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__DURATION = SCENARIO_PARAMETERS__DURATION;

	/**
	 * The feature id for the '<em><b>Warmup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__WARMUP = SCENARIO_PARAMETERS__WARMUP;

	/**
	 * The feature id for the '<em><b>Property Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__PROPERTY_PARAMETERS = SCENARIO_PARAMETERS__PROPERTY_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Base Currency Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__BASE_CURRENCY_UNIT = SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT;

	/**
	 * The feature id for the '<em><b>Base Result Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__BASE_RESULT_FREQUENCY = SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Base Result Frequency Cumul</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__BASE_RESULT_FREQUENCY_CUMUL = SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL;

	/**
	 * The feature id for the '<em><b>Base Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__BASE_TIME_UNIT = SCENARIO_PARAMETERS__BASE_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__REPLICATION = SCENARIO_PARAMETERS__REPLICATION;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__SEED = SCENARIO_PARAMETERS__SEED;

	/**
	 * The feature id for the '<em><b>Trace Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__TRACE_FORMAT = SCENARIO_PARAMETERS__TRACE_FORMAT;

	/**
	 * The feature id for the '<em><b>Trace Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE__TRACE_OUTPUT = SCENARIO_PARAMETERS__TRACE_OUTPUT;

	/**
	 * The number of structural features of the '<em>Scenario Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE_FEATURE_COUNT = SCENARIO_PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scenario Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PARAMETERS_TYPE_OPERATION_COUNT = SCENARIO_PARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.StringParameterTypeImpl <em>String Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.StringParameterTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getStringParameterType()
	 * @generated
	 */
	int STRING_PARAMETER_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_TYPE__INSTANCE = CONSTANT_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_TYPE__RESULT = CONSTANT_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_TYPE__RESULT_TIME_STAMP = CONSTANT_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_TYPE__VALID_FOR = CONSTANT_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_TYPE__VALUE = CONSTANT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_TYPE_FEATURE_COUNT = CONSTANT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_TYPE_OPERATION_COUNT = CONSTANT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.TimeParametersImpl <em>Time Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.TimeParametersImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTimeParameters()
	 * @generated
	 */
	int TIME_PARAMETERS = 34;

	/**
	 * The feature id for the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__TRANSFER_TIME = 0;

	/**
	 * The feature id for the '<em><b>Queue Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__QUEUE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Wait Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__WAIT_TIME = 2;

	/**
	 * The feature id for the '<em><b>Set Up Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__SET_UP_TIME = 3;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__PROCESSING_TIME = 4;

	/**
	 * The feature id for the '<em><b>Validation Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__VALIDATION_TIME = 5;

	/**
	 * The feature id for the '<em><b>Rework Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__REWORK_TIME = 6;

	/**
	 * The feature id for the '<em><b>Lag Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__LAG_TIME = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__DURATION = 8;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS__ELAPSED_TIME = 9;

	/**
	 * The number of structural features of the '<em>Time Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Time Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.TriangularDistributionTypeImpl <em>Triangular Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.TriangularDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTriangularDistributionType()
	 * @generated
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__MAX = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__MIN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE__MODE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Triangular Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Triangular Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.TruncatedNormalDistributionTypeImpl <em>Truncated Normal Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.TruncatedNormalDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTruncatedNormalDistributionType()
	 * @generated
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__MAX = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__MEAN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__MIN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE__STANDARD_DEVIATION = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Truncated Normal Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Truncated Normal Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_NORMAL_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.UniformDistributionTypeImpl <em>Uniform Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.UniformDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getUniformDistributionType()
	 * @generated
	 */
	int UNIFORM_DISTRIBUTION_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE__MAX = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE__MIN = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uniform Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uniform Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.UserDistributionDataPointTypeImpl <em>User Distribution Data Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.UserDistributionDataPointTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getUserDistributionDataPointType()
	 * @generated
	 */
	int USER_DISTRIBUTION_DATA_POINT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Parameter Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_DATA_POINT_TYPE__PROBABILITY = 2;

	/**
	 * The number of structural features of the '<em>User Distribution Data Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_DATA_POINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Distribution Data Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_DATA_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.UserDistributionTypeImpl <em>User Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.UserDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getUserDistributionType()
	 * @generated
	 */
	int USER_DISTRIBUTION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__GROUP = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Distribution Data Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__USER_DISTRIBUTION_DATA_POINT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE__DISCRETE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>User Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.VendorExtensionImpl <em>Vendor Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.VendorExtensionImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getVendorExtension()
	 * @generated
	 */
	int VENDOR_EXTENSION = 40;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION__ANY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Vendor Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vendor Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.impl.WeibullDistributionTypeImpl <em>Weibull Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.impl.WeibullDistributionTypeImpl
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getWeibullDistributionType()
	 * @generated
	 */
	int WEIBULL_DISTRIBUTION_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE__INSTANCE = DISTRIBUTION_PARAMETER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE__RESULT = DISTRIBUTION_PARAMETER__RESULT;

	/**
	 * The feature id for the '<em><b>Result Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE__RESULT_TIME_STAMP = DISTRIBUTION_PARAMETER__RESULT_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE__VALID_FOR = DISTRIBUTION_PARAMETER__VALID_FOR;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE__TIME_UNIT = DISTRIBUTION_PARAMETER__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE__SCALE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE__SHAPE = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weibull Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE_FEATURE_COUNT = DISTRIBUTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weibull Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_TYPE_OPERATION_COUNT = DISTRIBUTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.PropertyType
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 42;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.ResultType <em>Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.ResultType
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.gemoc.bpsim2.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.TimeUnit
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 44;

	/**
	 * The meta object id for the '<em>Property Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.PropertyType
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyTypeObject()
	 * @generated
	 */
	int PROPERTY_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Result Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.ResultType
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getResultTypeObject()
	 * @generated
	 */
	int RESULT_TYPE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Time Unit Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bpsim2.TimeUnit
	 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTimeUnitObject()
	 * @generated
	 */
	int TIME_UNIT_OBJECT = 47;


	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.BetaDistributionType <em>Beta Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beta Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.BetaDistributionType
	 * @generated
	 */
	EClass getBetaDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.BetaDistributionType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.gemoc.bpsim2.BetaDistributionType#getScale()
	 * @see #getBetaDistributionType()
	 * @generated
	 */
	EAttribute getBetaDistributionType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.BetaDistributionType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.gemoc.bpsim2.BetaDistributionType#getShape()
	 * @see #getBetaDistributionType()
	 * @generated
	 */
	EAttribute getBetaDistributionType_Shape();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.BinomialDistributionType <em>Binomial Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binomial Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.BinomialDistributionType
	 * @generated
	 */
	EClass getBinomialDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.BinomialDistributionType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.gemoc.bpsim2.BinomialDistributionType#getProbability()
	 * @see #getBinomialDistributionType()
	 * @generated
	 */
	EAttribute getBinomialDistributionType_Probability();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.BinomialDistributionType#getTrials <em>Trials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trials</em>'.
	 * @see org.gemoc.bpsim2.BinomialDistributionType#getTrials()
	 * @see #getBinomialDistributionType()
	 * @generated
	 */
	EAttribute getBinomialDistributionType_Trials();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.BooleanParameterType <em>Boolean Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.BooleanParameterType
	 * @generated
	 */
	EClass getBooleanParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.BooleanParameterType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.BooleanParameterType#isValue()
	 * @see #getBooleanParameterType()
	 * @generated
	 */
	EAttribute getBooleanParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.BPSimDataType <em>BP Sim Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Sim Data Type</em>'.
	 * @see org.gemoc.bpsim2.BPSimDataType
	 * @generated
	 */
	EClass getBPSimDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.BPSimDataType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.gemoc.bpsim2.BPSimDataType#getGroup()
	 * @see #getBPSimDataType()
	 * @generated
	 */
	EAttribute getBPSimDataType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.BPSimDataType#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see org.gemoc.bpsim2.BPSimDataType#getScenario()
	 * @see #getBPSimDataType()
	 * @generated
	 */
	EReference getBPSimDataType_Scenario();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see org.gemoc.bpsim2.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Calendar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.Calendar#getValue()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Calendar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.gemoc.bpsim2.Calendar#getId()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Calendar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.bpsim2.Calendar#getName()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ConstantParameter <em>Constant Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Parameter</em>'.
	 * @see org.gemoc.bpsim2.ConstantParameter
	 * @generated
	 */
	EClass getConstantParameter();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ControlParameters <em>Control Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Parameters</em>'.
	 * @see org.gemoc.bpsim2.ControlParameters
	 * @generated
	 */
	EClass getControlParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ControlParameters#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probability</em>'.
	 * @see org.gemoc.bpsim2.ControlParameters#getProbability()
	 * @see #getControlParameters()
	 * @generated
	 */
	EReference getControlParameters_Probability();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ControlParameters#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.bpsim2.ControlParameters#getCondition()
	 * @see #getControlParameters()
	 * @generated
	 */
	EReference getControlParameters_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ControlParameters#getInterTriggerTimer <em>Inter Trigger Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Trigger Timer</em>'.
	 * @see org.gemoc.bpsim2.ControlParameters#getInterTriggerTimer()
	 * @see #getControlParameters()
	 * @generated
	 */
	EReference getControlParameters_InterTriggerTimer();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ControlParameters#getTriggerCount <em>Trigger Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Count</em>'.
	 * @see org.gemoc.bpsim2.ControlParameters#getTriggerCount()
	 * @see #getControlParameters()
	 * @generated
	 */
	EReference getControlParameters_TriggerCount();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.CostParameters <em>Cost Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Parameters</em>'.
	 * @see org.gemoc.bpsim2.CostParameters
	 * @generated
	 */
	EClass getCostParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.CostParameters#getFixedCost <em>Fixed Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Cost</em>'.
	 * @see org.gemoc.bpsim2.CostParameters#getFixedCost()
	 * @see #getCostParameters()
	 * @generated
	 */
	EReference getCostParameters_FixedCost();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.CostParameters#getUnitCost <em>Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Cost</em>'.
	 * @see org.gemoc.bpsim2.CostParameters#getUnitCost()
	 * @see #getCostParameters()
	 * @generated
	 */
	EReference getCostParameters_UnitCost();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.DateTimeParameterType <em>Date Time Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.DateTimeParameterType
	 * @generated
	 */
	EClass getDateTimeParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.DateTimeParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.DateTimeParameterType#getValue()
	 * @see #getDateTimeParameterType()
	 * @generated
	 */
	EAttribute getDateTimeParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.DistributionParameter <em>Distribution Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Parameter</em>'.
	 * @see org.gemoc.bpsim2.DistributionParameter
	 * @generated
	 */
	EClass getDistributionParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.DistributionParameter#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see org.gemoc.bpsim2.DistributionParameter#getTimeUnit()
	 * @see #getDistributionParameter()
	 * @generated
	 */
	EAttribute getDistributionParameter_TimeUnit();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.gemoc.bpsim2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.gemoc.bpsim2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getBetaDistribution <em>Beta Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getBetaDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BetaDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Value</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getParameterValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParameterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getBinomialDistribution <em>Binomial Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binomial Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getBinomialDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BinomialDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getBooleanParameter <em>Boolean Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getBooleanParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BooleanParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getBPSimData <em>BP Sim Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BP Sim Data</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getBPSimData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BPSimData();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getDateTimeParameter <em>Date Time Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getDateTimeParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateTimeParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getDurationParameter <em>Duration Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getDurationParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DurationParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getEnumParameter <em>Enum Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getEnumParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnumParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getErlangDistribution <em>Erlang Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erlang Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getErlangDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErlangDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getExpressionParameter <em>Expression Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getExpressionParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExpressionParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getFloatingParameter <em>Floating Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floating Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getFloatingParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FloatingParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getGammaDistribution <em>Gamma Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gamma Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getGammaDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GammaDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getLogNormalDistribution <em>Log Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log Normal Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getLogNormalDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LogNormalDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getNegativeExponentialDistribution <em>Negative Exponential Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negative Exponential Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getNegativeExponentialDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NegativeExponentialDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getNormalDistribution <em>Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normal Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getNormalDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NormalDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getNumericParameter <em>Numeric Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getNumericParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NumericParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getPoissonDistribution <em>Poisson Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poisson Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getPoissonDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PoissonDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getStringParameter <em>String Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Parameter</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getStringParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getTriangularDistribution <em>Triangular Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triangular Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getTriangularDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TriangularDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getTruncatedNormalDistribution <em>Truncated Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Truncated Normal Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getTruncatedNormalDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TruncatedNormalDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getUniformDistribution <em>Uniform Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uniform Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getUniformDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UniformDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getUserDistribution <em>User Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getUserDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getUserDistributionDataPoint <em>User Distribution Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Distribution Data Point</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getUserDistributionDataPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserDistributionDataPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.DocumentRoot#getWeibullDistribution <em>Weibull Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weibull Distribution</em>'.
	 * @see org.gemoc.bpsim2.DocumentRoot#getWeibullDistribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WeibullDistribution();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.DurationParameterType <em>Duration Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.DurationParameterType
	 * @generated
	 */
	EClass getDurationParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.DurationParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.DurationParameterType#getValue()
	 * @see #getDurationParameterType()
	 * @generated
	 */
	EAttribute getDurationParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ElementParameters <em>Element Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Parameters</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters
	 * @generated
	 */
	EClass getElementParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ElementParameters#getTimeParameters <em>Time Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Parameters</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getTimeParameters()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_TimeParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ElementParameters#getControlParameters <em>Control Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Parameters</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getControlParameters()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_ControlParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ElementParameters#getResourceParameters <em>Resource Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Parameters</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getResourceParameters()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_ResourceParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ElementParameters#getPriorityParameters <em>Priority Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority Parameters</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getPriorityParameters()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_PriorityParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ElementParameters#getCostParameters <em>Cost Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost Parameters</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getCostParameters()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_CostParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ElementParameters#getPropertyParameters <em>Property Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Parameters</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getPropertyParameters()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_PropertyParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.ElementParameters#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getVendorExtension()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_VendorExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ElementParameters#getElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Ref</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getElementRef()
	 * @see #getElementParameters()
	 * @generated
	 */
	EAttribute getElementParameters_ElementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ElementParameters#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getId()
	 * @see #getElementParameters()
	 * @generated
	 */
	EAttribute getElementParameters_Id();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bpsim2.ElementParameters#getBpmnElementRef <em>Bpmn Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bpmn Element Ref</em>'.
	 * @see org.gemoc.bpsim2.ElementParameters#getBpmnElementRef()
	 * @see #getElementParameters()
	 * @generated
	 */
	EReference getElementParameters_BpmnElementRef();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ElementParametersType <em>Element Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Parameters Type</em>'.
	 * @see org.gemoc.bpsim2.ElementParametersType
	 * @generated
	 */
	EClass getElementParametersType();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.EnumParameterType <em>Enum Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.EnumParameterType
	 * @generated
	 */
	EClass getEnumParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.EnumParameterType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.gemoc.bpsim2.EnumParameterType#getGroup()
	 * @see #getEnumParameterType()
	 * @generated
	 */
	EAttribute getEnumParameterType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.EnumParameterType#getParameterValueGroup <em>Parameter Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Value Group</em>'.
	 * @see org.gemoc.bpsim2.EnumParameterType#getParameterValueGroup()
	 * @see #getEnumParameterType()
	 * @generated
	 */
	EAttribute getEnumParameterType_ParameterValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.EnumParameterType#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see org.gemoc.bpsim2.EnumParameterType#getParameterValue()
	 * @see #getEnumParameterType()
	 * @generated
	 */
	EReference getEnumParameterType_ParameterValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ErlangDistributionType <em>Erlang Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erlang Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.ErlangDistributionType
	 * @generated
	 */
	EClass getErlangDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ErlangDistributionType#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see org.gemoc.bpsim2.ErlangDistributionType#getK()
	 * @see #getErlangDistributionType()
	 * @generated
	 */
	EAttribute getErlangDistributionType_K();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ErlangDistributionType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.gemoc.bpsim2.ErlangDistributionType#getMean()
	 * @see #getErlangDistributionType()
	 * @generated
	 */
	EAttribute getErlangDistributionType_Mean();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ExpressionParameterType <em>Expression Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.ExpressionParameterType
	 * @generated
	 */
	EClass getExpressionParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ExpressionParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.ExpressionParameterType#getValue()
	 * @see #getExpressionParameterType()
	 * @generated
	 */
	EAttribute getExpressionParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.FloatingParameterType <em>Floating Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.FloatingParameterType
	 * @generated
	 */
	EClass getFloatingParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.FloatingParameterType#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see org.gemoc.bpsim2.FloatingParameterType#getTimeUnit()
	 * @see #getFloatingParameterType()
	 * @generated
	 */
	EAttribute getFloatingParameterType_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.FloatingParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.FloatingParameterType#getValue()
	 * @see #getFloatingParameterType()
	 * @generated
	 */
	EAttribute getFloatingParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.GammaDistributionType <em>Gamma Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamma Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.GammaDistributionType
	 * @generated
	 */
	EClass getGammaDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.GammaDistributionType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.gemoc.bpsim2.GammaDistributionType#getScale()
	 * @see #getGammaDistributionType()
	 * @generated
	 */
	EAttribute getGammaDistributionType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.GammaDistributionType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.gemoc.bpsim2.GammaDistributionType#getShape()
	 * @see #getGammaDistributionType()
	 * @generated
	 */
	EAttribute getGammaDistributionType_Shape();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.LogNormalDistributionType <em>Log Normal Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Normal Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.LogNormalDistributionType
	 * @generated
	 */
	EClass getLogNormalDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.LogNormalDistributionType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.gemoc.bpsim2.LogNormalDistributionType#getMean()
	 * @see #getLogNormalDistributionType()
	 * @generated
	 */
	EAttribute getLogNormalDistributionType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.LogNormalDistributionType#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see org.gemoc.bpsim2.LogNormalDistributionType#getStandardDeviation()
	 * @see #getLogNormalDistributionType()
	 * @generated
	 */
	EAttribute getLogNormalDistributionType_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.NegativeExponentialDistributionType <em>Negative Exponential Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Exponential Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.NegativeExponentialDistributionType
	 * @generated
	 */
	EClass getNegativeExponentialDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.NegativeExponentialDistributionType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.gemoc.bpsim2.NegativeExponentialDistributionType#getMean()
	 * @see #getNegativeExponentialDistributionType()
	 * @generated
	 */
	EAttribute getNegativeExponentialDistributionType_Mean();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.NormalDistributionType <em>Normal Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.NormalDistributionType
	 * @generated
	 */
	EClass getNormalDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.NormalDistributionType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.gemoc.bpsim2.NormalDistributionType#getMean()
	 * @see #getNormalDistributionType()
	 * @generated
	 */
	EAttribute getNormalDistributionType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.NormalDistributionType#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see org.gemoc.bpsim2.NormalDistributionType#getStandardDeviation()
	 * @see #getNormalDistributionType()
	 * @generated
	 */
	EAttribute getNormalDistributionType_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.NumericParameterType <em>Numeric Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.NumericParameterType
	 * @generated
	 */
	EClass getNumericParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.NumericParameterType#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see org.gemoc.bpsim2.NumericParameterType#getTimeUnit()
	 * @see #getNumericParameterType()
	 * @generated
	 */
	EAttribute getNumericParameterType_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.NumericParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.NumericParameterType#getValue()
	 * @see #getNumericParameterType()
	 * @generated
	 */
	EAttribute getNumericParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.gemoc.bpsim2.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.Parameter#getResultRequest <em>Result Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Result Request</em>'.
	 * @see org.gemoc.bpsim2.Parameter#getResultRequest()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ResultRequest();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.Parameter#getParameterValueGroup <em>Parameter Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Value Group</em>'.
	 * @see org.gemoc.bpsim2.Parameter#getParameterValueGroup()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.Parameter#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see org.gemoc.bpsim2.Parameter#getParameterValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see org.gemoc.bpsim2.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ParameterValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see org.gemoc.bpsim2.ParameterValue#getInstance()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Instance();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ParameterValue#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.gemoc.bpsim2.ParameterValue#getResult()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ParameterValue#getResultTimeStamp <em>Result Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Time Stamp</em>'.
	 * @see org.gemoc.bpsim2.ParameterValue#getResultTimeStamp()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_ResultTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ParameterValue#getValidFor <em>Valid For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid For</em>'.
	 * @see org.gemoc.bpsim2.ParameterValue#getValidFor()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_ValidFor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.PoissonDistributionType <em>Poisson Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poisson Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.PoissonDistributionType
	 * @generated
	 */
	EClass getPoissonDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.PoissonDistributionType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.gemoc.bpsim2.PoissonDistributionType#getMean()
	 * @see #getPoissonDistributionType()
	 * @generated
	 */
	EAttribute getPoissonDistributionType_Mean();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.PriorityParameters <em>Priority Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Parameters</em>'.
	 * @see org.gemoc.bpsim2.PriorityParameters
	 * @generated
	 */
	EClass getPriorityParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.PriorityParameters#getInterruptible <em>Interruptible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interruptible</em>'.
	 * @see org.gemoc.bpsim2.PriorityParameters#getInterruptible()
	 * @see #getPriorityParameters()
	 * @generated
	 */
	EReference getPriorityParameters_Interruptible();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.PriorityParameters#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see org.gemoc.bpsim2.PriorityParameters#getPriority()
	 * @see #getPriorityParameters()
	 * @generated
	 */
	EReference getPriorityParameters_Priority();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.PropertyParameters <em>Property Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Parameters</em>'.
	 * @see org.gemoc.bpsim2.PropertyParameters
	 * @generated
	 */
	EClass getPropertyParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.PropertyParameters#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.gemoc.bpsim2.PropertyParameters#getProperty()
	 * @see #getPropertyParameters()
	 * @generated
	 */
	EReference getPropertyParameters_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.PropertyParameters#getQueueLength <em>Queue Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queue Length</em>'.
	 * @see org.gemoc.bpsim2.PropertyParameters#getQueueLength()
	 * @see #getPropertyParameters()
	 * @generated
	 */
	EReference getPropertyParameters_QueueLength();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.PropertyType1 <em>Property Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type1</em>'.
	 * @see org.gemoc.bpsim2.PropertyType1
	 * @generated
	 */
	EClass getPropertyType1();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.PropertyType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.bpsim2.PropertyType1#getName()
	 * @see #getPropertyType1()
	 * @generated
	 */
	EAttribute getPropertyType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.PropertyType1#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.gemoc.bpsim2.PropertyType1#getType()
	 * @see #getPropertyType1()
	 * @generated
	 */
	EAttribute getPropertyType1_Type();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ResourceParameters <em>Resource Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Parameters</em>'.
	 * @see org.gemoc.bpsim2.ResourceParameters
	 * @generated
	 */
	EClass getResourceParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ResourceParameters#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection</em>'.
	 * @see org.gemoc.bpsim2.ResourceParameters#getSelection()
	 * @see #getResourceParameters()
	 * @generated
	 */
	EReference getResourceParameters_Selection();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ResourceParameters#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Availability</em>'.
	 * @see org.gemoc.bpsim2.ResourceParameters#getAvailability()
	 * @see #getResourceParameters()
	 * @generated
	 */
	EReference getResourceParameters_Availability();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ResourceParameters#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see org.gemoc.bpsim2.ResourceParameters#getQuantity()
	 * @see #getResourceParameters()
	 * @generated
	 */
	EReference getResourceParameters_Quantity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.ResourceParameters#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see org.gemoc.bpsim2.ResourceParameters#getRole()
	 * @see #getResourceParameters()
	 * @generated
	 */
	EReference getResourceParameters_Role();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.gemoc.bpsim2.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.Scenario#getScenarioParameters <em>Scenario Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario Parameters</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getScenarioParameters()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ScenarioParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.Scenario#getElementParameters <em>Element Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Parameters</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getElementParameters()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ElementParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.Scenario#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendar</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getCalendar()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Calendar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.Scenario#getVendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Extension</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getVendorExtension()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_VendorExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getAuthor()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getCreated()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getDescription()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getId()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getInherits <em>Inherits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherits</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getInherits()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Inherits();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getModified()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getResult()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getVendor()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.Scenario#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.gemoc.bpsim2.Scenario#getVersion()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Version();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ScenarioParameters <em>Scenario Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Parameters</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters
	 * @generated
	 */
	EClass getScenarioParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ScenarioParameters#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getStart()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EReference getScenarioParameters_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ScenarioParameters#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getDuration()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EReference getScenarioParameters_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ScenarioParameters#getWarmup <em>Warmup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warmup</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getWarmup()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EReference getScenarioParameters_Warmup();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.ScenarioParameters#getPropertyParameters <em>Property Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Parameters</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getPropertyParameters()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EReference getScenarioParameters_PropertyParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseCurrencyUnit <em>Base Currency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Currency Unit</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getBaseCurrencyUnit()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_BaseCurrencyUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseResultFrequency <em>Base Result Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Result Frequency</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getBaseResultFrequency()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_BaseResultFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#isBaseResultFrequencyCumul <em>Base Result Frequency Cumul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Result Frequency Cumul</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#isBaseResultFrequencyCumul()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_BaseResultFrequencyCumul();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#getBaseTimeUnit <em>Base Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Time Unit</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getBaseTimeUnit()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_BaseTimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getReplication()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_Replication();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getSeed()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_Seed();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#getTraceFormat <em>Trace Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Format</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#getTraceFormat()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_TraceFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.ScenarioParameters#isTraceOutput <em>Trace Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Output</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParameters#isTraceOutput()
	 * @see #getScenarioParameters()
	 * @generated
	 */
	EAttribute getScenarioParameters_TraceOutput();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.ScenarioParametersType <em>Scenario Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Parameters Type</em>'.
	 * @see org.gemoc.bpsim2.ScenarioParametersType
	 * @generated
	 */
	EClass getScenarioParametersType();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.StringParameterType <em>String Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Parameter Type</em>'.
	 * @see org.gemoc.bpsim2.StringParameterType
	 * @generated
	 */
	EClass getStringParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.StringParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.bpsim2.StringParameterType#getValue()
	 * @see #getStringParameterType()
	 * @generated
	 */
	EAttribute getStringParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.TimeParameters <em>Time Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Parameters</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters
	 * @generated
	 */
	EClass getTimeParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getTransferTime <em>Transfer Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfer Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getTransferTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_TransferTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getQueueTime <em>Queue Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queue Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getQueueTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_QueueTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getWaitTime <em>Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getWaitTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_WaitTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getSetUpTime <em>Set Up Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Up Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getSetUpTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_SetUpTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getProcessingTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_ProcessingTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getValidationTime <em>Validation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getValidationTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_ValidationTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getReworkTime <em>Rework Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rework Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getReworkTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_ReworkTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getLagTime <em>Lag Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lag Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getLagTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_LagTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getDuration()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.TimeParameters#getElapsedTime <em>Elapsed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elapsed Time</em>'.
	 * @see org.gemoc.bpsim2.TimeParameters#getElapsedTime()
	 * @see #getTimeParameters()
	 * @generated
	 */
	EReference getTimeParameters_ElapsedTime();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.TriangularDistributionType <em>Triangular Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.TriangularDistributionType
	 * @generated
	 */
	EClass getTriangularDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.TriangularDistributionType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.gemoc.bpsim2.TriangularDistributionType#getMax()
	 * @see #getTriangularDistributionType()
	 * @generated
	 */
	EAttribute getTriangularDistributionType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.TriangularDistributionType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.gemoc.bpsim2.TriangularDistributionType#getMin()
	 * @see #getTriangularDistributionType()
	 * @generated
	 */
	EAttribute getTriangularDistributionType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.TriangularDistributionType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.gemoc.bpsim2.TriangularDistributionType#getMode()
	 * @see #getTriangularDistributionType()
	 * @generated
	 */
	EAttribute getTriangularDistributionType_Mode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.TruncatedNormalDistributionType <em>Truncated Normal Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truncated Normal Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.TruncatedNormalDistributionType
	 * @generated
	 */
	EClass getTruncatedNormalDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.TruncatedNormalDistributionType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.gemoc.bpsim2.TruncatedNormalDistributionType#getMax()
	 * @see #getTruncatedNormalDistributionType()
	 * @generated
	 */
	EAttribute getTruncatedNormalDistributionType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.TruncatedNormalDistributionType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.gemoc.bpsim2.TruncatedNormalDistributionType#getMean()
	 * @see #getTruncatedNormalDistributionType()
	 * @generated
	 */
	EAttribute getTruncatedNormalDistributionType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.TruncatedNormalDistributionType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.gemoc.bpsim2.TruncatedNormalDistributionType#getMin()
	 * @see #getTruncatedNormalDistributionType()
	 * @generated
	 */
	EAttribute getTruncatedNormalDistributionType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.TruncatedNormalDistributionType#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see org.gemoc.bpsim2.TruncatedNormalDistributionType#getStandardDeviation()
	 * @see #getTruncatedNormalDistributionType()
	 * @generated
	 */
	EAttribute getTruncatedNormalDistributionType_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.UniformDistributionType <em>Uniform Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.UniformDistributionType
	 * @generated
	 */
	EClass getUniformDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.UniformDistributionType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.gemoc.bpsim2.UniformDistributionType#getMax()
	 * @see #getUniformDistributionType()
	 * @generated
	 */
	EAttribute getUniformDistributionType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.UniformDistributionType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.gemoc.bpsim2.UniformDistributionType#getMin()
	 * @see #getUniformDistributionType()
	 * @generated
	 */
	EAttribute getUniformDistributionType_Min();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.UserDistributionDataPointType <em>User Distribution Data Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Distribution Data Point Type</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionDataPointType
	 * @generated
	 */
	EClass getUserDistributionDataPointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.UserDistributionDataPointType#getParameterValueGroup <em>Parameter Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Value Group</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionDataPointType#getParameterValueGroup()
	 * @see #getUserDistributionDataPointType()
	 * @generated
	 */
	EAttribute getUserDistributionDataPointType_ParameterValueGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bpsim2.UserDistributionDataPointType#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Value</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionDataPointType#getParameterValue()
	 * @see #getUserDistributionDataPointType()
	 * @generated
	 */
	EReference getUserDistributionDataPointType_ParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.UserDistributionDataPointType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionDataPointType#getProbability()
	 * @see #getUserDistributionDataPointType()
	 * @generated
	 */
	EAttribute getUserDistributionDataPointType_Probability();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.UserDistributionType <em>User Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionType
	 * @generated
	 */
	EClass getUserDistributionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.UserDistributionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionType#getGroup()
	 * @see #getUserDistributionType()
	 * @generated
	 */
	EAttribute getUserDistributionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bpsim2.UserDistributionType#getUserDistributionDataPoint <em>User Distribution Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Distribution Data Point</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionType#getUserDistributionDataPoint()
	 * @see #getUserDistributionType()
	 * @generated
	 */
	EReference getUserDistributionType_UserDistributionDataPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.UserDistributionType#isDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discrete</em>'.
	 * @see org.gemoc.bpsim2.UserDistributionType#isDiscrete()
	 * @see #getUserDistributionType()
	 * @generated
	 */
	EAttribute getUserDistributionType_Discrete();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.VendorExtension <em>Vendor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Extension</em>'.
	 * @see org.gemoc.bpsim2.VendorExtension
	 * @generated
	 */
	EClass getVendorExtension();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.VendorExtension#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.gemoc.bpsim2.VendorExtension#getAny()
	 * @see #getVendorExtension()
	 * @generated
	 */
	EAttribute getVendorExtension_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.VendorExtension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.bpsim2.VendorExtension#getName()
	 * @see #getVendorExtension()
	 * @generated
	 */
	EAttribute getVendorExtension_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.bpsim2.VendorExtension#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.gemoc.bpsim2.VendorExtension#getAnyAttribute()
	 * @see #getVendorExtension()
	 * @generated
	 */
	EAttribute getVendorExtension_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bpsim2.WeibullDistributionType <em>Weibull Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull Distribution Type</em>'.
	 * @see org.gemoc.bpsim2.WeibullDistributionType
	 * @generated
	 */
	EClass getWeibullDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.WeibullDistributionType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.gemoc.bpsim2.WeibullDistributionType#getScale()
	 * @see #getWeibullDistributionType()
	 * @generated
	 */
	EAttribute getWeibullDistributionType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bpsim2.WeibullDistributionType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.gemoc.bpsim2.WeibullDistributionType#getShape()
	 * @see #getWeibullDistributionType()
	 * @generated
	 */
	EAttribute getWeibullDistributionType_Shape();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.bpsim2.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see org.gemoc.bpsim2.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.bpsim2.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type</em>'.
	 * @see org.gemoc.bpsim2.ResultType
	 * @generated
	 */
	EEnum getResultType();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.bpsim2.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see org.gemoc.bpsim2.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for data type '{@link org.gemoc.bpsim2.PropertyType <em>Property Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Type Object</em>'.
	 * @see org.gemoc.bpsim2.PropertyType
	 * @model instanceClass="org.gemoc.bpsim2.PropertyType"
	 *        extendedMetaData="name='PropertyType:Object' baseType='PropertyType'"
	 * @generated
	 */
	EDataType getPropertyTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.gemoc.bpsim2.ResultType <em>Result Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Type Object</em>'.
	 * @see org.gemoc.bpsim2.ResultType
	 * @model instanceClass="org.gemoc.bpsim2.ResultType"
	 *        extendedMetaData="name='ResultType:Object' baseType='ResultType'"
	 * @generated
	 */
	EDataType getResultTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.gemoc.bpsim2.TimeUnit <em>Time Unit Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Unit Object</em>'.
	 * @see org.gemoc.bpsim2.TimeUnit
	 * @model instanceClass="org.gemoc.bpsim2.TimeUnit"
	 *        extendedMetaData="name='TimeUnit:Object' baseType='TimeUnit'"
	 * @generated
	 */
	EDataType getTimeUnitObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bpsim2Factory getBpsim2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.BetaDistributionTypeImpl <em>Beta Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.BetaDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBetaDistributionType()
		 * @generated
		 */
		EClass BETA_DISTRIBUTION_TYPE = eINSTANCE.getBetaDistributionType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETA_DISTRIBUTION_TYPE__SCALE = eINSTANCE.getBetaDistributionType_Scale();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETA_DISTRIBUTION_TYPE__SHAPE = eINSTANCE.getBetaDistributionType_Shape();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.BinomialDistributionTypeImpl <em>Binomial Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.BinomialDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBinomialDistributionType()
		 * @generated
		 */
		EClass BINOMIAL_DISTRIBUTION_TYPE = eINSTANCE.getBinomialDistributionType();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY = eINSTANCE.getBinomialDistributionType_Probability();

		/**
		 * The meta object literal for the '<em><b>Trials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINOMIAL_DISTRIBUTION_TYPE__TRIALS = eINSTANCE.getBinomialDistributionType_Trials();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.BooleanParameterTypeImpl <em>Boolean Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.BooleanParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBooleanParameterType()
		 * @generated
		 */
		EClass BOOLEAN_PARAMETER_TYPE = eINSTANCE.getBooleanParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PARAMETER_TYPE__VALUE = eINSTANCE.getBooleanParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.BPSimDataTypeImpl <em>BP Sim Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.BPSimDataTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getBPSimDataType()
		 * @generated
		 */
		EClass BP_SIM_DATA_TYPE = eINSTANCE.getBPSimDataType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_SIM_DATA_TYPE__GROUP = eINSTANCE.getBPSimDataType_Group();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_SIM_DATA_TYPE__SCENARIO = eINSTANCE.getBPSimDataType_Scenario();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.CalendarImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__VALUE = eINSTANCE.getCalendar_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__ID = eINSTANCE.getCalendar_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__NAME = eINSTANCE.getCalendar_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ConstantParameterImpl <em>Constant Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ConstantParameterImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getConstantParameter()
		 * @generated
		 */
		EClass CONSTANT_PARAMETER = eINSTANCE.getConstantParameter();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ControlParametersImpl <em>Control Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ControlParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getControlParameters()
		 * @generated
		 */
		EClass CONTROL_PARAMETERS = eINSTANCE.getControlParameters();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PARAMETERS__PROBABILITY = eINSTANCE.getControlParameters_Probability();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PARAMETERS__CONDITION = eINSTANCE.getControlParameters_Condition();

		/**
		 * The meta object literal for the '<em><b>Inter Trigger Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PARAMETERS__INTER_TRIGGER_TIMER = eINSTANCE.getControlParameters_InterTriggerTimer();

		/**
		 * The meta object literal for the '<em><b>Trigger Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PARAMETERS__TRIGGER_COUNT = eINSTANCE.getControlParameters_TriggerCount();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.CostParametersImpl <em>Cost Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.CostParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getCostParameters()
		 * @generated
		 */
		EClass COST_PARAMETERS = eINSTANCE.getCostParameters();

		/**
		 * The meta object literal for the '<em><b>Fixed Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_PARAMETERS__FIXED_COST = eINSTANCE.getCostParameters_FixedCost();

		/**
		 * The meta object literal for the '<em><b>Unit Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_PARAMETERS__UNIT_COST = eINSTANCE.getCostParameters_UnitCost();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.DateTimeParameterTypeImpl <em>Date Time Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.DateTimeParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDateTimeParameterType()
		 * @generated
		 */
		EClass DATE_TIME_PARAMETER_TYPE = eINSTANCE.getDateTimeParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PARAMETER_TYPE__VALUE = eINSTANCE.getDateTimeParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.DistributionParameterImpl <em>Distribution Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.DistributionParameterImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDistributionParameter()
		 * @generated
		 */
		EClass DISTRIBUTION_PARAMETER = eINSTANCE.getDistributionParameter();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_PARAMETER__TIME_UNIT = eINSTANCE.getDistributionParameter_TimeUnit();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.DocumentRootImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Beta Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BETA_DISTRIBUTION = eINSTANCE.getDocumentRoot_BetaDistribution();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAMETER_VALUE = eINSTANCE.getDocumentRoot_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Binomial Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION = eINSTANCE.getDocumentRoot_BinomialDistribution();

		/**
		 * The meta object literal for the '<em><b>Boolean Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOLEAN_PARAMETER = eINSTANCE.getDocumentRoot_BooleanParameter();

		/**
		 * The meta object literal for the '<em><b>BP Sim Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BP_SIM_DATA = eINSTANCE.getDocumentRoot_BPSimData();

		/**
		 * The meta object literal for the '<em><b>Date Time Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_TIME_PARAMETER = eINSTANCE.getDocumentRoot_DateTimeParameter();

		/**
		 * The meta object literal for the '<em><b>Duration Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DURATION_PARAMETER = eINSTANCE.getDocumentRoot_DurationParameter();

		/**
		 * The meta object literal for the '<em><b>Enum Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENUM_PARAMETER = eINSTANCE.getDocumentRoot_EnumParameter();

		/**
		 * The meta object literal for the '<em><b>Erlang Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ERLANG_DISTRIBUTION = eINSTANCE.getDocumentRoot_ErlangDistribution();

		/**
		 * The meta object literal for the '<em><b>Expression Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXPRESSION_PARAMETER = eINSTANCE.getDocumentRoot_ExpressionParameter();

		/**
		 * The meta object literal for the '<em><b>Floating Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOATING_PARAMETER = eINSTANCE.getDocumentRoot_FloatingParameter();

		/**
		 * The meta object literal for the '<em><b>Gamma Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GAMMA_DISTRIBUTION = eINSTANCE.getDocumentRoot_GammaDistribution();

		/**
		 * The meta object literal for the '<em><b>Log Normal Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION = eINSTANCE.getDocumentRoot_LogNormalDistribution();

		/**
		 * The meta object literal for the '<em><b>Negative Exponential Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION = eINSTANCE.getDocumentRoot_NegativeExponentialDistribution();

		/**
		 * The meta object literal for the '<em><b>Normal Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NORMAL_DISTRIBUTION = eINSTANCE.getDocumentRoot_NormalDistribution();

		/**
		 * The meta object literal for the '<em><b>Numeric Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NUMERIC_PARAMETER = eINSTANCE.getDocumentRoot_NumericParameter();

		/**
		 * The meta object literal for the '<em><b>Poisson Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POISSON_DISTRIBUTION = eINSTANCE.getDocumentRoot_PoissonDistribution();

		/**
		 * The meta object literal for the '<em><b>String Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRING_PARAMETER = eINSTANCE.getDocumentRoot_StringParameter();

		/**
		 * The meta object literal for the '<em><b>Triangular Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION = eINSTANCE.getDocumentRoot_TriangularDistribution();

		/**
		 * The meta object literal for the '<em><b>Truncated Normal Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION = eINSTANCE.getDocumentRoot_TruncatedNormalDistribution();

		/**
		 * The meta object literal for the '<em><b>Uniform Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNIFORM_DISTRIBUTION = eINSTANCE.getDocumentRoot_UniformDistribution();

		/**
		 * The meta object literal for the '<em><b>User Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_DISTRIBUTION = eINSTANCE.getDocumentRoot_UserDistribution();

		/**
		 * The meta object literal for the '<em><b>User Distribution Data Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT = eINSTANCE.getDocumentRoot_UserDistributionDataPoint();

		/**
		 * The meta object literal for the '<em><b>Weibull Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEIBULL_DISTRIBUTION = eINSTANCE.getDocumentRoot_WeibullDistribution();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.DurationParameterTypeImpl <em>Duration Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.DurationParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getDurationParameterType()
		 * @generated
		 */
		EClass DURATION_PARAMETER_TYPE = eINSTANCE.getDurationParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_PARAMETER_TYPE__VALUE = eINSTANCE.getDurationParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ElementParametersImpl <em>Element Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ElementParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getElementParameters()
		 * @generated
		 */
		EClass ELEMENT_PARAMETERS = eINSTANCE.getElementParameters();

		/**
		 * The meta object literal for the '<em><b>Time Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__TIME_PARAMETERS = eINSTANCE.getElementParameters_TimeParameters();

		/**
		 * The meta object literal for the '<em><b>Control Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__CONTROL_PARAMETERS = eINSTANCE.getElementParameters_ControlParameters();

		/**
		 * The meta object literal for the '<em><b>Resource Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__RESOURCE_PARAMETERS = eINSTANCE.getElementParameters_ResourceParameters();

		/**
		 * The meta object literal for the '<em><b>Priority Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__PRIORITY_PARAMETERS = eINSTANCE.getElementParameters_PriorityParameters();

		/**
		 * The meta object literal for the '<em><b>Cost Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__COST_PARAMETERS = eINSTANCE.getElementParameters_CostParameters();

		/**
		 * The meta object literal for the '<em><b>Property Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__PROPERTY_PARAMETERS = eINSTANCE.getElementParameters_PropertyParameters();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__VENDOR_EXTENSION = eINSTANCE.getElementParameters_VendorExtension();

		/**
		 * The meta object literal for the '<em><b>Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PARAMETERS__ELEMENT_REF = eINSTANCE.getElementParameters_ElementRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PARAMETERS__ID = eINSTANCE.getElementParameters_Id();

		/**
		 * The meta object literal for the '<em><b>Bpmn Element Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETERS__BPMN_ELEMENT_REF = eINSTANCE.getElementParameters_BpmnElementRef();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ElementParametersTypeImpl <em>Element Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ElementParametersTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getElementParametersType()
		 * @generated
		 */
		EClass ELEMENT_PARAMETERS_TYPE = eINSTANCE.getElementParametersType();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.EnumParameterTypeImpl <em>Enum Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.EnumParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getEnumParameterType()
		 * @generated
		 */
		EClass ENUM_PARAMETER_TYPE = eINSTANCE.getEnumParameterType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_PARAMETER_TYPE__GROUP = eINSTANCE.getEnumParameterType_Group();

		/**
		 * The meta object literal for the '<em><b>Parameter Value Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_PARAMETER_TYPE__PARAMETER_VALUE_GROUP = eINSTANCE.getEnumParameterType_ParameterValueGroup();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_PARAMETER_TYPE__PARAMETER_VALUE = eINSTANCE.getEnumParameterType_ParameterValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ErlangDistributionTypeImpl <em>Erlang Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ErlangDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getErlangDistributionType()
		 * @generated
		 */
		EClass ERLANG_DISTRIBUTION_TYPE = eINSTANCE.getErlangDistributionType();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERLANG_DISTRIBUTION_TYPE__K = eINSTANCE.getErlangDistributionType_K();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERLANG_DISTRIBUTION_TYPE__MEAN = eINSTANCE.getErlangDistributionType_Mean();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ExpressionParameterTypeImpl <em>Expression Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ExpressionParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getExpressionParameterType()
		 * @generated
		 */
		EClass EXPRESSION_PARAMETER_TYPE = eINSTANCE.getExpressionParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_PARAMETER_TYPE__VALUE = eINSTANCE.getExpressionParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.FloatingParameterTypeImpl <em>Floating Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.FloatingParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getFloatingParameterType()
		 * @generated
		 */
		EClass FLOATING_PARAMETER_TYPE = eINSTANCE.getFloatingParameterType();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_PARAMETER_TYPE__TIME_UNIT = eINSTANCE.getFloatingParameterType_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_PARAMETER_TYPE__VALUE = eINSTANCE.getFloatingParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.GammaDistributionTypeImpl <em>Gamma Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.GammaDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getGammaDistributionType()
		 * @generated
		 */
		EClass GAMMA_DISTRIBUTION_TYPE = eINSTANCE.getGammaDistributionType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMMA_DISTRIBUTION_TYPE__SCALE = eINSTANCE.getGammaDistributionType_Scale();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMMA_DISTRIBUTION_TYPE__SHAPE = eINSTANCE.getGammaDistributionType_Shape();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.LogNormalDistributionTypeImpl <em>Log Normal Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.LogNormalDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getLogNormalDistributionType()
		 * @generated
		 */
		EClass LOG_NORMAL_DISTRIBUTION_TYPE = eINSTANCE.getLogNormalDistributionType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_NORMAL_DISTRIBUTION_TYPE__MEAN = eINSTANCE.getLogNormalDistributionType_Mean();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_NORMAL_DISTRIBUTION_TYPE__STANDARD_DEVIATION = eINSTANCE.getLogNormalDistributionType_StandardDeviation();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.NegativeExponentialDistributionTypeImpl <em>Negative Exponential Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.NegativeExponentialDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getNegativeExponentialDistributionType()
		 * @generated
		 */
		EClass NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE = eINSTANCE.getNegativeExponentialDistributionType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE__MEAN = eINSTANCE.getNegativeExponentialDistributionType_Mean();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.NormalDistributionTypeImpl <em>Normal Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.NormalDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getNormalDistributionType()
		 * @generated
		 */
		EClass NORMAL_DISTRIBUTION_TYPE = eINSTANCE.getNormalDistributionType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_DISTRIBUTION_TYPE__MEAN = eINSTANCE.getNormalDistributionType_Mean();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_DISTRIBUTION_TYPE__STANDARD_DEVIATION = eINSTANCE.getNormalDistributionType_StandardDeviation();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.NumericParameterTypeImpl <em>Numeric Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.NumericParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getNumericParameterType()
		 * @generated
		 */
		EClass NUMERIC_PARAMETER_TYPE = eINSTANCE.getNumericParameterType();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_PARAMETER_TYPE__TIME_UNIT = eINSTANCE.getNumericParameterType_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_PARAMETER_TYPE__VALUE = eINSTANCE.getNumericParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ParameterImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Result Request</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__RESULT_REQUEST = eINSTANCE.getParameter_ResultRequest();

		/**
		 * The meta object literal for the '<em><b>Parameter Value Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_VALUE_GROUP = eINSTANCE.getParameter_ParameterValueGroup();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_VALUE = eINSTANCE.getParameter_ParameterValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ParameterValueImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__INSTANCE = eINSTANCE.getParameterValue_Instance();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__RESULT = eINSTANCE.getParameterValue_Result();

		/**
		 * The meta object literal for the '<em><b>Result Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__RESULT_TIME_STAMP = eINSTANCE.getParameterValue_ResultTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Valid For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__VALID_FOR = eINSTANCE.getParameterValue_ValidFor();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.PoissonDistributionTypeImpl <em>Poisson Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.PoissonDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPoissonDistributionType()
		 * @generated
		 */
		EClass POISSON_DISTRIBUTION_TYPE = eINSTANCE.getPoissonDistributionType();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISSON_DISTRIBUTION_TYPE__MEAN = eINSTANCE.getPoissonDistributionType_Mean();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.PriorityParametersImpl <em>Priority Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.PriorityParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPriorityParameters()
		 * @generated
		 */
		EClass PRIORITY_PARAMETERS = eINSTANCE.getPriorityParameters();

		/**
		 * The meta object literal for the '<em><b>Interruptible</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIORITY_PARAMETERS__INTERRUPTIBLE = eINSTANCE.getPriorityParameters_Interruptible();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIORITY_PARAMETERS__PRIORITY = eINSTANCE.getPriorityParameters_Priority();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.PropertyParametersImpl <em>Property Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.PropertyParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyParameters()
		 * @generated
		 */
		EClass PROPERTY_PARAMETERS = eINSTANCE.getPropertyParameters();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_PARAMETERS__PROPERTY = eINSTANCE.getPropertyParameters_Property();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_PARAMETERS__QUEUE_LENGTH = eINSTANCE.getPropertyParameters_QueueLength();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.PropertyType1Impl <em>Property Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.PropertyType1Impl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyType1()
		 * @generated
		 */
		EClass PROPERTY_TYPE1 = eINSTANCE.getPropertyType1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE1__NAME = eINSTANCE.getPropertyType1_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE1__TYPE = eINSTANCE.getPropertyType1_Type();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ResourceParametersImpl <em>Resource Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ResourceParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getResourceParameters()
		 * @generated
		 */
		EClass RESOURCE_PARAMETERS = eINSTANCE.getResourceParameters();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PARAMETERS__SELECTION = eINSTANCE.getResourceParameters_Selection();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PARAMETERS__AVAILABILITY = eINSTANCE.getResourceParameters_Availability();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PARAMETERS__QUANTITY = eINSTANCE.getResourceParameters_Quantity();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PARAMETERS__ROLE = eINSTANCE.getResourceParameters_Role();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ScenarioImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SCENARIO_PARAMETERS = eINSTANCE.getScenario_ScenarioParameters();

		/**
		 * The meta object literal for the '<em><b>Element Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ELEMENT_PARAMETERS = eINSTANCE.getScenario_ElementParameters();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CALENDAR = eINSTANCE.getScenario_Calendar();

		/**
		 * The meta object literal for the '<em><b>Vendor Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__VENDOR_EXTENSION = eINSTANCE.getScenario_VendorExtension();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__AUTHOR = eINSTANCE.getScenario_Author();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__CREATED = eINSTANCE.getScenario_Created();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__DESCRIPTION = eINSTANCE.getScenario_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__ID = eINSTANCE.getScenario_Id();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__INHERITS = eINSTANCE.getScenario_Inherits();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__MODIFIED = eINSTANCE.getScenario_Modified();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__RESULT = eINSTANCE.getScenario_Result();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__VENDOR = eINSTANCE.getScenario_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__VERSION = eINSTANCE.getScenario_Version();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ScenarioParametersImpl <em>Scenario Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ScenarioParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getScenarioParameters()
		 * @generated
		 */
		EClass SCENARIO_PARAMETERS = eINSTANCE.getScenarioParameters();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_PARAMETERS__START = eINSTANCE.getScenarioParameters_Start();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_PARAMETERS__DURATION = eINSTANCE.getScenarioParameters_Duration();

		/**
		 * The meta object literal for the '<em><b>Warmup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_PARAMETERS__WARMUP = eINSTANCE.getScenarioParameters_Warmup();

		/**
		 * The meta object literal for the '<em><b>Property Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_PARAMETERS__PROPERTY_PARAMETERS = eINSTANCE.getScenarioParameters_PropertyParameters();

		/**
		 * The meta object literal for the '<em><b>Base Currency Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT = eINSTANCE.getScenarioParameters_BaseCurrencyUnit();

		/**
		 * The meta object literal for the '<em><b>Base Result Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY = eINSTANCE.getScenarioParameters_BaseResultFrequency();

		/**
		 * The meta object literal for the '<em><b>Base Result Frequency Cumul</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL = eINSTANCE.getScenarioParameters_BaseResultFrequencyCumul();

		/**
		 * The meta object literal for the '<em><b>Base Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__BASE_TIME_UNIT = eINSTANCE.getScenarioParameters_BaseTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__REPLICATION = eINSTANCE.getScenarioParameters_Replication();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__SEED = eINSTANCE.getScenarioParameters_Seed();

		/**
		 * The meta object literal for the '<em><b>Trace Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__TRACE_FORMAT = eINSTANCE.getScenarioParameters_TraceFormat();

		/**
		 * The meta object literal for the '<em><b>Trace Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PARAMETERS__TRACE_OUTPUT = eINSTANCE.getScenarioParameters_TraceOutput();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.ScenarioParametersTypeImpl <em>Scenario Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.ScenarioParametersTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getScenarioParametersType()
		 * @generated
		 */
		EClass SCENARIO_PARAMETERS_TYPE = eINSTANCE.getScenarioParametersType();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.StringParameterTypeImpl <em>String Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.StringParameterTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getStringParameterType()
		 * @generated
		 */
		EClass STRING_PARAMETER_TYPE = eINSTANCE.getStringParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PARAMETER_TYPE__VALUE = eINSTANCE.getStringParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.TimeParametersImpl <em>Time Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.TimeParametersImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTimeParameters()
		 * @generated
		 */
		EClass TIME_PARAMETERS = eINSTANCE.getTimeParameters();

		/**
		 * The meta object literal for the '<em><b>Transfer Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__TRANSFER_TIME = eINSTANCE.getTimeParameters_TransferTime();

		/**
		 * The meta object literal for the '<em><b>Queue Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__QUEUE_TIME = eINSTANCE.getTimeParameters_QueueTime();

		/**
		 * The meta object literal for the '<em><b>Wait Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__WAIT_TIME = eINSTANCE.getTimeParameters_WaitTime();

		/**
		 * The meta object literal for the '<em><b>Set Up Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__SET_UP_TIME = eINSTANCE.getTimeParameters_SetUpTime();

		/**
		 * The meta object literal for the '<em><b>Processing Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__PROCESSING_TIME = eINSTANCE.getTimeParameters_ProcessingTime();

		/**
		 * The meta object literal for the '<em><b>Validation Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__VALIDATION_TIME = eINSTANCE.getTimeParameters_ValidationTime();

		/**
		 * The meta object literal for the '<em><b>Rework Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__REWORK_TIME = eINSTANCE.getTimeParameters_ReworkTime();

		/**
		 * The meta object literal for the '<em><b>Lag Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__LAG_TIME = eINSTANCE.getTimeParameters_LagTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__DURATION = eINSTANCE.getTimeParameters_Duration();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETERS__ELAPSED_TIME = eINSTANCE.getTimeParameters_ElapsedTime();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.TriangularDistributionTypeImpl <em>Triangular Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.TriangularDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTriangularDistributionType()
		 * @generated
		 */
		EClass TRIANGULAR_DISTRIBUTION_TYPE = eINSTANCE.getTriangularDistributionType();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_DISTRIBUTION_TYPE__MAX = eINSTANCE.getTriangularDistributionType_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_DISTRIBUTION_TYPE__MIN = eINSTANCE.getTriangularDistributionType_Min();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_DISTRIBUTION_TYPE__MODE = eINSTANCE.getTriangularDistributionType_Mode();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.TruncatedNormalDistributionTypeImpl <em>Truncated Normal Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.TruncatedNormalDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTruncatedNormalDistributionType()
		 * @generated
		 */
		EClass TRUNCATED_NORMAL_DISTRIBUTION_TYPE = eINSTANCE.getTruncatedNormalDistributionType();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUNCATED_NORMAL_DISTRIBUTION_TYPE__MAX = eINSTANCE.getTruncatedNormalDistributionType_Max();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUNCATED_NORMAL_DISTRIBUTION_TYPE__MEAN = eINSTANCE.getTruncatedNormalDistributionType_Mean();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUNCATED_NORMAL_DISTRIBUTION_TYPE__MIN = eINSTANCE.getTruncatedNormalDistributionType_Min();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUNCATED_NORMAL_DISTRIBUTION_TYPE__STANDARD_DEVIATION = eINSTANCE.getTruncatedNormalDistributionType_StandardDeviation();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.UniformDistributionTypeImpl <em>Uniform Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.UniformDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getUniformDistributionType()
		 * @generated
		 */
		EClass UNIFORM_DISTRIBUTION_TYPE = eINSTANCE.getUniformDistributionType();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_DISTRIBUTION_TYPE__MAX = eINSTANCE.getUniformDistributionType_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_DISTRIBUTION_TYPE__MIN = eINSTANCE.getUniformDistributionType_Min();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.UserDistributionDataPointTypeImpl <em>User Distribution Data Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.UserDistributionDataPointTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getUserDistributionDataPointType()
		 * @generated
		 */
		EClass USER_DISTRIBUTION_DATA_POINT_TYPE = eINSTANCE.getUserDistributionDataPointType();

		/**
		 * The meta object literal for the '<em><b>Parameter Value Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP = eINSTANCE.getUserDistributionDataPointType_ParameterValueGroup();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE = eINSTANCE.getUserDistributionDataPointType_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DISTRIBUTION_DATA_POINT_TYPE__PROBABILITY = eINSTANCE.getUserDistributionDataPointType_Probability();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.UserDistributionTypeImpl <em>User Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.UserDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getUserDistributionType()
		 * @generated
		 */
		EClass USER_DISTRIBUTION_TYPE = eINSTANCE.getUserDistributionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DISTRIBUTION_TYPE__GROUP = eINSTANCE.getUserDistributionType_Group();

		/**
		 * The meta object literal for the '<em><b>User Distribution Data Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DISTRIBUTION_TYPE__USER_DISTRIBUTION_DATA_POINT = eINSTANCE.getUserDistributionType_UserDistributionDataPoint();

		/**
		 * The meta object literal for the '<em><b>Discrete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DISTRIBUTION_TYPE__DISCRETE = eINSTANCE.getUserDistributionType_Discrete();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.VendorExtensionImpl <em>Vendor Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.VendorExtensionImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getVendorExtension()
		 * @generated
		 */
		EClass VENDOR_EXTENSION = eINSTANCE.getVendorExtension();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_EXTENSION__ANY = eINSTANCE.getVendorExtension_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_EXTENSION__NAME = eINSTANCE.getVendorExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_EXTENSION__ANY_ATTRIBUTE = eINSTANCE.getVendorExtension_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.impl.WeibullDistributionTypeImpl <em>Weibull Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.impl.WeibullDistributionTypeImpl
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getWeibullDistributionType()
		 * @generated
		 */
		EClass WEIBULL_DISTRIBUTION_TYPE = eINSTANCE.getWeibullDistributionType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIBULL_DISTRIBUTION_TYPE__SCALE = eINSTANCE.getWeibullDistributionType_Scale();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIBULL_DISTRIBUTION_TYPE__SHAPE = eINSTANCE.getWeibullDistributionType_Shape();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.PropertyType
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.ResultType <em>Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.ResultType
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getResultType()
		 * @generated
		 */
		EEnum RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '{@link org.gemoc.bpsim2.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.TimeUnit
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '<em>Property Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.PropertyType
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getPropertyTypeObject()
		 * @generated
		 */
		EDataType PROPERTY_TYPE_OBJECT = eINSTANCE.getPropertyTypeObject();

		/**
		 * The meta object literal for the '<em>Result Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.ResultType
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getResultTypeObject()
		 * @generated
		 */
		EDataType RESULT_TYPE_OBJECT = eINSTANCE.getResultTypeObject();

		/**
		 * The meta object literal for the '<em>Time Unit Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bpsim2.TimeUnit
		 * @see org.gemoc.bpsim2.impl.Bpsim2PackageImpl#getTimeUnitObject()
		 * @generated
		 */
		EDataType TIME_UNIT_OBJECT = eINSTANCE.getTimeUnitObject();

	}

} //Bpsim2Package
