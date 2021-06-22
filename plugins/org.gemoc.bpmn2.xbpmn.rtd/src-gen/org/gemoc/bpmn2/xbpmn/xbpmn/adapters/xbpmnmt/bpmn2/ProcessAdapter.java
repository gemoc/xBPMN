package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;

@SuppressWarnings("all")
public class ProcessAdapter extends EObjectAdapter<org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public ProcessAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
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
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ProcessType getProcessType() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ProcessType.get(adaptee.getProcessType().getValue());
  }
  
  @Override
  public void setProcessType(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ProcessType o) {
    adaptee.setProcessType(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ProcessType.get(o.getValue()));
  }
  
  @Override
  public boolean isIsClosed() {
    return adaptee.isIsClosed();
  }
  
  @Override
  public void setIsClosed(final boolean o) {
    adaptee.setIsClosed(o);
  }
  
  @Override
  public boolean isIsExecutable() {
    return adaptee.isIsExecutable();
  }
  
  @Override
  public void setIsExecutable(final boolean o) {
    adaptee.setIsExecutable(o);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition> */Object extensionDefinitions_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionDefinition> */Object getExtensionDefinitions() {
    if (extensionDefinitions_ == null)
    	extensionDefinitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionDefinitions(), adaptersFactory, eResource);
    return extensionDefinitions_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue> */Object extensionValues_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ExtensionAttributeValue> */Object getExtensionValues() {
    if (extensionValues_ == null)
    	extensionValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensionValues(), adaptersFactory, eResource);
    return extensionValues_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation> */Object documentation_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Documentation> */Object getDocumentation() {
    if (documentation_ == null)
    	documentation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDocumentation(), adaptersFactory, eResource);
    return documentation_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification getIoSpecification() {
    return () adaptersFactory.createAdapter(adaptee.getIoSpecification(), eResource);
  }
  
  @Override
  public void setIoSpecification(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification o) {
    if (o != null)
    	adaptee.setIoSpecification(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.InputOutputSpecificationAdapter) o).getAdaptee());
    else adaptee.setIoSpecification(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Interface> */Object supportedInterfaceRefs_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Interface> */Object getSupportedInterfaceRefs() {
    if (supportedInterfaceRefs_ == null)
    	supportedInterfaceRefs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSupportedInterfaceRefs(), adaptersFactory, eResource);
    return supportedInterfaceRefs_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputBinding> */Object ioBinding_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputBinding> */Object getIoBinding() {
    if (ioBinding_ == null)
    	ioBinding_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIoBinding(), adaptersFactory, eResource);
    return ioBinding_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElement> */Object flowElements_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElement> */Object getFlowElements() {
    if (flowElements_ == null)
    	flowElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFlowElements(), adaptersFactory, eResource);
    return flowElements_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LaneSet> */Object laneSets_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.LaneSet> */Object getLaneSets() {
    if (laneSets_ == null)
    	laneSets_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLaneSets(), adaptersFactory, eResource);
    return laneSets_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing getAuditing() {
    return () adaptersFactory.createAdapter(adaptee.getAuditing(), eResource);
  }
  
  @Override
  public void setAuditing(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing o) {
    if (o != null)
    	adaptee.setAuditing(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.AuditingAdapter) o).getAdaptee());
    else adaptee.setAuditing(null);
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring getMonitoring() {
    return () adaptersFactory.createAdapter(adaptee.getMonitoring(), eResource);
  }
  
  @Override
  public void setMonitoring(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring o) {
    if (o != null)
    	adaptee.setMonitoring(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.MonitoringAdapter) o).getAdaptee());
    else adaptee.setMonitoring(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property> */Object properties_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Property> */Object getProperties() {
    if (properties_ == null)
    	properties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProperties(), adaptersFactory, eResource);
    return properties_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process> */Object supports_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process> */Object getSupports() {
    if (supports_ == null)
    	supports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSupports(), adaptersFactory, eResource);
    return supports_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Collaboration getDefinitionalCollaborationRef() {
    return () adaptersFactory.createAdapter(adaptee.getDefinitionalCollaborationRef(), eResource);
  }
  
  @Override
  public void setDefinitionalCollaborationRef(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Collaboration o) {
    if (o != null)
    	adaptee.setDefinitionalCollaborationRef(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.CollaborationAdapter) o).getAdaptee());
    else adaptee.setDefinitionalCollaborationRef(null);
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceRole> */Object resources_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceRole> */Object getResources() {
    if (resources_ == null)
    	resources_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getResources(), adaptersFactory, eResource);
    return resources_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Artifact> */Object artifacts_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Artifact> */Object getArtifacts() {
    if (artifacts_ == null)
    	artifacts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArtifacts(), adaptersFactory, eResource);
    return artifacts_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationSubscription> */Object correlationSubscriptions_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationSubscription> */Object getCorrelationSubscriptions() {
    if (correlationSubscriptions_ == null)
    	correlationSubscriptions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCorrelationSubscriptions(), adaptersFactory, eResource);
    return correlationSubscriptions_;
  }
  
  private /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process> */Object decomposedBy_;
  
  @Override
  public /* EList<org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process> */Object getDecomposedBy() {
    if (decomposedBy_ == null)
    	decomposedBy_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDecomposedBy(), adaptersFactory, eResource);
    return decomposedBy_;
  }
  
  @Override
  public org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process getDecomposes() {
    return () adaptersFactory.createAdapter(adaptee.getDecomposes(), eResource);
  }
  
  @Override
  public void setDecomposes(final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process o) {
    if (o != null)
    	adaptee.setDecomposes(((org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.bpmn2.ProcessAdapter) o).getAdaptee());
    else adaptee.setDecomposes(null);
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ProcessType PROCESS_TYPE_EDEFAULT = org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ProcessType.NONE;
  
  protected static final boolean IS_CLOSED_EDEFAULT = false;
  
  protected static final boolean IS_EXECUTABLE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.eINSTANCE.getProcess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__ID:
    		return getId();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DOCUMENTATION:
    		return getDocumentation();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IO_SPECIFICATION:
    		return getIoSpecification();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__SUPPORTED_INTERFACE_REFS:
    		return getSupportedInterfaceRefs();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IO_BINDING:
    		return getIoBinding();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__FLOW_ELEMENTS:
    		return getFlowElements();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__LANE_SETS:
    		return getLaneSets();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__PROCESS_TYPE:
    		return getProcessType();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IS_CLOSED:
    		return isIsClosed() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__AUDITING:
    		return getAuditing();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__MONITORING:
    		return getMonitoring();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__PROPERTIES:
    		return getProperties();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__SUPPORTS:
    		return getSupports();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
    		return getDefinitionalCollaborationRef();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IS_EXECUTABLE:
    		return isIsExecutable() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__RESOURCES:
    		return getResources();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__ARTIFACTS:
    		return getArtifacts();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
    		return getCorrelationSubscriptions();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DECOMPOSED_BY:
    		return getDecomposedBy();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DECOMPOSES:
    		return getDecomposes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IO_SPECIFICATION:
    		return getIoSpecification() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__SUPPORTED_INTERFACE_REFS:
    		return getSupportedInterfaceRefs() != null && !getSupportedInterfaceRefs().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IO_BINDING:
    		return getIoBinding() != null && !getIoBinding().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__FLOW_ELEMENTS:
    		return getFlowElements() != null && !getFlowElements().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__LANE_SETS:
    		return getLaneSets() != null && !getLaneSets().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__PROCESS_TYPE:
    		return getProcessType() != PROCESS_TYPE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IS_CLOSED:
    		return isIsClosed() != IS_CLOSED_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__AUDITING:
    		return getAuditing() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__MONITORING:
    		return getMonitoring() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__SUPPORTS:
    		return getSupports() != null && !getSupports().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
    		return getDefinitionalCollaborationRef() != null;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IS_EXECUTABLE:
    		return isIsExecutable() != IS_EXECUTABLE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__RESOURCES:
    		return getResources() != null && !getResources().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__ARTIFACTS:
    		return getArtifacts() != null && !getArtifacts().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
    		return getCorrelationSubscriptions() != null && !getCorrelationSubscriptions().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DECOMPOSED_BY:
    		return getDecomposedBy() != null && !getDecomposedBy().isEmpty();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DECOMPOSES:
    		return getDecomposes() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IO_SPECIFICATION:
    		setIoSpecification(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__SUPPORTED_INTERFACE_REFS:
    		getSupportedInterfaceRefs().clear();
    		getSupportedInterfaceRefs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IO_BINDING:
    		getIoBinding().clear();
    		getIoBinding().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__FLOW_ELEMENTS:
    		getFlowElements().clear();
    		getFlowElements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__LANE_SETS:
    		getLaneSets().clear();
    		getLaneSets().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__PROCESS_TYPE:
    		setProcessType(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ProcessType)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IS_CLOSED:
    		setIsClosed(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__AUDITING:
    		setAuditing(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Auditing)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__MONITORING:
    		setMonitoring(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Monitoring)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__SUPPORTS:
    		getSupports().clear();
    		getSupports().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
    		setDefinitionalCollaborationRef(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Collaboration)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__IS_EXECUTABLE:
    		setIsExecutable(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__RESOURCES:
    		getResources().clear();
    		getResources().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__ARTIFACTS:
    		getArtifacts().clear();
    		getArtifacts().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
    		getCorrelationSubscriptions().clear();
    		getCorrelationSubscriptions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DECOMPOSED_BY:
    		getDecomposedBy().clear();
    		getDecomposedBy().addAll((Collection) newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__DECOMPOSES:
    		setDecomposes(
    		(org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Process)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElementsContainer.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__FLOW_ELEMENTS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__LANE_SETS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.FlowElementsContainer.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__FLOW_ELEMENTS;
    		case org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
    			return org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package.PROCESS__LANE_SETS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
