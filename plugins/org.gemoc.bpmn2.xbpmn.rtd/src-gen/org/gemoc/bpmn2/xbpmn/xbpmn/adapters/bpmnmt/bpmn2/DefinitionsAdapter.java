package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.bpmn2;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Definitions;

@SuppressWarnings("all")
public class DefinitionsAdapter extends EObjectAdapter<Definitions> implements org.obeonetwork.dsl.bpmn2.Definitions {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public DefinitionsAdapter() {
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
  
  @Override
  public String getTargetNamespace() {
    return adaptee.getTargetNamespace();
  }
  
  @Override
  public void setTargetNamespace(final String o) {
    adaptee.setTargetNamespace(o);
  }
  
  @Override
  public String getExpressionLanguage() {
    return adaptee.getExpressionLanguage();
  }
  
  @Override
  public void setExpressionLanguage(final String o) {
    adaptee.setExpressionLanguage(o);
  }
  
  @Override
  public String getTypeLanguage() {
    return adaptee.getTypeLanguage();
  }
  
  @Override
  public void setTypeLanguage(final String o) {
    adaptee.setTypeLanguage(o);
  }
  
  @Override
  public String getExporter() {
    return adaptee.getExporter();
  }
  
  @Override
  public void setExporter(final String o) {
    adaptee.setExporter(o);
  }
  
  @Override
  public String getExporterVersion() {
    return adaptee.getExporterVersion();
  }
  
  @Override
  public void setExporterVersion(final String o) {
    adaptee.setExporterVersion(o);
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
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Import> */Object imports_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Import> */Object getImports() {
    if (imports_ == null)
    	imports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImports(), adaptersFactory, eResource);
    return imports_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Extension> */Object extensions_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Extension> */Object getExtensions() {
    if (extensions_ == null)
    	extensions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtensions(), adaptersFactory, eResource);
    return extensions_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.Relationship> */Object relationships_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.Relationship> */Object getRelationships() {
    if (relationships_ == null)
    	relationships_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRelationships(), adaptersFactory, eResource);
    return relationships_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.RootElement> */Object rootElements_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.RootElement> */Object getRootElements() {
    if (rootElements_ == null)
    	rootElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRootElements(), adaptersFactory, eResource);
    return rootElements_;
  }
  
  private /* EList<org.obeonetwork.dsl.bpmn2.bpmdi.BPMNDiagram> */Object diagrams_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.bpmn2.bpmdi.BPMNDiagram> */Object getDiagrams() {
    if (diagrams_ == null)
    	diagrams_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDiagrams(), adaptersFactory, eResource);
    return diagrams_;
  }
  
  protected static final String ID_EDEFAULT = null;
  
  protected static final String DESCRIPTION_EDEFAULT = null;
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final String TARGET_NAMESPACE_EDEFAULT = null;
  
  protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "http://www.w3.org/1999/XPath";
  
  protected static final String TYPE_LANGUAGE_EDEFAULT = "http://www.w3.org/2001/XMLSchema";
  
  protected static final String EXPORTER_EDEFAULT = null;
  
  protected static final String EXPORTER_VERSION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.bpmn2.Bpmn2Package.eINSTANCE.getDefinitions();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__ID:
    		return getId();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSION_VALUES:
    		return getExtensionValues();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DOCUMENTATION:
    		return getDocumentation();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DESCRIPTION:
    		return getDescription();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__NAME:
    		return getName();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
    		return getTargetNamespace();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
    		return getExpressionLanguage();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
    		return getTypeLanguage();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__IMPORTS:
    		return getImports();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSIONS:
    		return getExtensions();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
    		return getRelationships();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
    		return getRootElements();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DIAGRAMS:
    		return getDiagrams();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPORTER:
    		return getExporter();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
    		return getExporterVersion();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__ID:
    		return getId() != ID_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSION_DEFINITIONS:
    		return getExtensionDefinitions() != null && !getExtensionDefinitions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSION_VALUES:
    		return getExtensionValues() != null && !getExtensionValues().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DOCUMENTATION:
    		return getDocumentation() != null && !getDocumentation().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
    		return getTargetNamespace() != TARGET_NAMESPACE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
    		return getExpressionLanguage() != EXPRESSION_LANGUAGE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
    		return getTypeLanguage() != TYPE_LANGUAGE_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__IMPORTS:
    		return getImports() != null && !getImports().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSIONS:
    		return getExtensions() != null && !getExtensions().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
    		return getRelationships() != null && !getRelationships().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
    		return getRootElements() != null && !getRootElements().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DIAGRAMS:
    		return getDiagrams() != null && !getDiagrams().isEmpty();
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPORTER:
    		return getExporter() != EXPORTER_EDEFAULT;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
    		return getExporterVersion() != EXPORTER_VERSION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSION_DEFINITIONS:
    		getExtensionDefinitions().clear();
    		getExtensionDefinitions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSION_VALUES:
    		getExtensionValues().clear();
    		getExtensionValues().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DOCUMENTATION:
    		getDocumentation().clear();
    		getDocumentation().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
    		setTargetNamespace(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
    		setExpressionLanguage(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
    		setTypeLanguage(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__IMPORTS:
    		getImports().clear();
    		getImports().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXTENSIONS:
    		getExtensions().clear();
    		getExtensions().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
    		getRelationships().clear();
    		getRelationships().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
    		getRootElements().clear();
    		getRootElements().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__DIAGRAMS:
    		getDiagrams().clear();
    		getDiagrams().addAll((Collection) newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPORTER:
    		setExporter(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.obeonetwork.dsl.bpmn2.Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
    		setExporterVersion(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
