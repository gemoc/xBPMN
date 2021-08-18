package org.gemoc.xbpmn.k3dsa.bpsim2.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.gemoc.bpsim2.BetaDistributionType
import org.gemoc.bpsim2.BinomialDistributionType
import org.gemoc.bpsim2.BooleanParameterType
import org.gemoc.bpsim2.BPSimDataType
import org.gemoc.bpsim2.Calendar
import org.gemoc.bpsim2.ConstantParameter
import org.gemoc.bpsim2.ControlParameters
import org.gemoc.bpsim2.CostParameters
import org.gemoc.bpsim2.DateTimeParameterType
import org.gemoc.bpsim2.DistributionParameter
import org.gemoc.bpsim2.DocumentRoot
import org.gemoc.bpsim2.DurationParameterType
import org.gemoc.bpsim2.ElementParameters
import org.gemoc.bpsim2.ElementParametersType
import org.gemoc.bpsim2.EnumParameterType
import org.gemoc.bpsim2.ErlangDistributionType
import org.gemoc.bpsim2.ExpressionParameterType
import org.gemoc.bpsim2.FloatingParameterType
import org.gemoc.bpsim2.GammaDistributionType
import org.gemoc.bpsim2.LogNormalDistributionType
import org.gemoc.bpsim2.NegativeExponentialDistributionType
import org.gemoc.bpsim2.NormalDistributionType
import org.gemoc.bpsim2.NumericParameterType
import org.gemoc.bpsim2.Parameter
import org.gemoc.bpsim2.ParameterValue
import org.gemoc.bpsim2.PoissonDistributionType
import org.gemoc.bpsim2.PriorityParameters
import org.gemoc.bpsim2.PropertyParameters
import org.gemoc.bpsim2.PropertyType1
import org.gemoc.bpsim2.ResourceParameters
import org.gemoc.bpsim2.Scenario
import org.gemoc.bpsim2.ScenarioParameters
import org.gemoc.bpsim2.ScenarioParametersType
import org.gemoc.bpsim2.StringParameterType
import org.gemoc.bpsim2.TimeParameters
import org.gemoc.bpsim2.TriangularDistributionType
import org.gemoc.bpsim2.TruncatedNormalDistributionType
import org.gemoc.bpsim2.UniformDistributionType
import org.gemoc.bpsim2.UserDistributionDataPointType
import org.gemoc.bpsim2.UserDistributionType
import org.gemoc.bpsim2.VendorExtension
import org.gemoc.bpsim2.WeibullDistributionType

import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.BetaDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.BinomialDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.BooleanParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.BPSimDataTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.CalendarAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ConstantParameterAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ControlParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.CostParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.DateTimeParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.DistributionParameterAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.DocumentRootAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.DurationParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ElementParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ElementParametersTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.EnumParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ErlangDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ExpressionParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.FloatingParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.GammaDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.LogNormalDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.NegativeExponentialDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.NormalDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.NumericParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ParameterAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ParameterValueAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.PoissonDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.PriorityParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.PropertyParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.PropertyType1Aspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ResourceParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ScenarioAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ScenarioParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.ScenarioParametersTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.StringParameterTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.TimeParametersAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.TriangularDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.TruncatedNormalDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.UniformDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.UserDistributionDataPointTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.UserDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.VendorExtensionAspect.*
import static extension org.gemoc.xbpmn.k3dsa.bpsim2.aspects.WeibullDistributionTypeAspect.*
import static extension org.gemoc.xbpmn.k3dsa.ecore.aspects.EObjectAspect.*

@Aspect(className=DocumentRoot)
class DocumentRootAspect {}

@Aspect(className=BPSimDataType)
class BPSimDataTypeAspect {

}

@Aspect(className=Scenario)
class ScenarioAspect {

}

@Aspect(className=ElementParameters)
class ElementParametersAspect {

}

@Aspect(className=ElementParametersType)
class ElementParametersTypeAspect extends ElementParametersAspect {

}

@Aspect(className=ControlParameters)
class ControlParametersAspect {
	
	def String prettyLabel() {
		val StringBuffer sb = new StringBuffer()
		sb.append('ControlParameters '+_self.qualifiedName)
		if(_self.condition !== null) {
			sb.append('[condition='+_self.condition.prettyLabel+']')
		}
		if(_self.triggerCount !== null) {
			sb.append('[triggerCount='+_self.triggerCount.prettyLabel+']')
		}
		if(_self.interTriggerTimer !== null) {
			sb.append('[interTriggerTimer='+_self.condition.prettyLabel+']')
		}
		return sb.toString
	}

}

@Aspect(className=ResourceParameters)
class ResourceParametersAspect {

}

@Aspect(className=BetaDistributionType)
class BetaDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=BinomialDistributionType)
class BinomialDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=BooleanParameterType)
class BooleanParameterTypeAspect extends ConstantParameterAspect {

}



@Aspect(className=Calendar)
class CalendarAspect {

}

@Aspect(className=ConstantParameter)
class ConstantParameterAspect extends ParameterValueAspect {
	def String prettyLabel() {
		return 'ConstantParameter '+_self.qualifiedName
	}
}


@Aspect(className=CostParameters)
class CostParametersAspect {

}

@Aspect(className=DateTimeParameterType)
class DateTimeParameterTypeAspect extends ConstantParameterAspect {

}

@Aspect(className=DistributionParameter)
class DistributionParameterAspect extends ParameterValueAspect {

}


@Aspect(className=DurationParameterType)
class DurationParameterTypeAspect extends ConstantParameterAspect {

}



@Aspect(className=EnumParameterType)
class EnumParameterTypeAspect extends ParameterValueAspect {

}

@Aspect(className=ErlangDistributionType)
class ErlangDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=ExpressionParameterType)
class ExpressionParameterTypeAspect extends ParameterValueAspect {

}

@Aspect(className=FloatingParameterType)
class FloatingParameterTypeAspect extends ConstantParameterAspect {

}

@Aspect(className=GammaDistributionType)
class GammaDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=LogNormalDistributionType)
class LogNormalDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=NegativeExponentialDistributionType)
class NegativeExponentialDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=NormalDistributionType)
class NormalDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=NumericParameterType)
class NumericParameterTypeAspect extends ConstantParameterAspect {

	def String prettyLabel() {
		return ''+_self.value
	}
}

@Aspect(className=Parameter)
class ParameterAspect {
	def String prettyLabel() {
		return _self.eContainer.eClass.name+ '.'+_self.eContainingFeature.name
		 	+' : '+ _self.parameterValue.map[pv | pv.prettyLabel].join(', ')
	}
}

@Aspect(className=ParameterValue)
class ParameterValueAspect {
	def String prettyLabel() {
		return 'ParameterValue '+_self.qualifiedName
	}
}

@Aspect(className=PoissonDistributionType)
class PoissonDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=PriorityParameters)
class PriorityParametersAspect {

}

@Aspect(className=PropertyParameters)
class PropertyParametersAspect {

}

@Aspect(className=PropertyType1)
class PropertyType1Aspect extends ParameterAspect {

}



@Aspect(className=ScenarioParameters)
class ScenarioParametersAspect {

}

@Aspect(className=ScenarioParametersType)
class ScenarioParametersTypeAspect extends ScenarioParametersAspect {

}

@Aspect(className=StringParameterType)
class StringParameterTypeAspect extends ConstantParameterAspect {
	def String prettyLabel() {
		return _self.value
	}
}

@Aspect(className=TimeParameters)
class TimeParametersAspect {

}

@Aspect(className=TriangularDistributionType)
class TriangularDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=TruncatedNormalDistributionType)
class TruncatedNormalDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=UniformDistributionType)
class UniformDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=UserDistributionDataPointType)
class UserDistributionDataPointTypeAspect {

}

@Aspect(className=UserDistributionType)
class UserDistributionTypeAspect extends DistributionParameterAspect {

}

@Aspect(className=VendorExtension)
class VendorExtensionAspect {

}

@Aspect(className=WeibullDistributionType)
class WeibullDistributionTypeAspect extends DistributionParameterAspect {

}



