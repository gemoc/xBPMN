package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.HumanPerformer;

@SuppressWarnings("all")
public class HumanPerformerAdapter extends EObjectAdapter<HumanPerformer> implements org.obeonetwork.dsl.bpmn2.HumanPerformer {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public HumanPerformerAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  @Override
  public String getDescription() {
    return adaptee.getDescription();
  }
  
  @Override
  public void setDescription(final String o) {
    adaptee.setDescription(o);
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ExtensionDefinition> */Object extensionDefinitions_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ExtensionDefinition> */Object getExtensionDefinitions() {
    if (extensionDefinitions_ == null)
    	extensionDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionDefinitions(), adaptersFactory, eResource);
    return extensionDefinitions_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue> */Object extensionValues_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue> */Object getExtensionValues() {
    if (extensionValues_ == null)
    	extensionValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionValues(), adaptersFactory, eResource);
    return extensionValues_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Documentation> */Object documentation_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Documentation> */Object getDocumentation() {
    if (documentation_ == null)
    	documentation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDocumentation(), adaptersFactory, eResource);
    return documentation_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.Resource getResourceRef() {
    return () adaptersFactory.createAdapter(adaptee.getResourceRef(), eResource);
  }
  
  @Override
  public void setResourceRef(final org.obeonetwork.dsl.bpmn2.Resource o) {
    if (o != null)
    	adaptee.setResourceRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAdapter) o).getAdaptee());
    else adaptee.setResourceRef(null);
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.ResourceParameterBinding> */Object resourceParameterBindings_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.ResourceParameterBinding> */Object getResourceParameterBindings() {
    if (resourceParameterBindings_ == null)
    	resourceParameterBindings_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getResourceParameterBindings(), adaptersFactory, eResource);
    return resourceParameterBindings_;
  }
  
  @Override
  public org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression getResourceAssignmentExpression() {
    return () adaptersFactory.createAdapter(adaptee.getResourceAssignmentExpression(), eResource);
  }
  
  @Override
  public void setResourceAssignmentExpression(final org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression o) {
    if (o != null)
    	adaptee.setResourceAssignmentExpression(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2.ResourceAssignmentExpressionAdapter) o).getAdaptee());
    else adaptee.setResourceAssignmentExpression(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getHumanPerformer();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_REF:
    		return getResourceRef();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDINGS:
    		return getResourceParameterBindings();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION:
    		return getResourceAssignmentExpression();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_REF:
    		return getResourceRef() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDINGS:
    		return getResourceParameterBindings() != null && !getResourceParameterBindings().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION:
    		return getResourceAssignmentExpression() != null;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_REF:
    		setResourceRef(
    		(org.obeonetwork.dsl.bpmn2.Resource)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDINGS:
    		getResourceParameterBindings().clear();
    		getResourceParameterBindings().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION:
    		setResourceAssignmentExpression(
    		(org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.HUMAN_PERFORMER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
