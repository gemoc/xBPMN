package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.di;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.di.Node;

@SuppressWarnings("all")
public class NodeAdapter extends EObjectAdapter<Node> implements org.obeonetwork.dsl.dd.di.Node {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public NodeAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.Diagram getOwningDiagram() {
    return () adaptersFactory.createAdapter(adaptee.getOwningDiagram(), eResource);
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.DiagramElement getOwningElement() {
    return () adaptersFactory.createAdapter(adaptee.getOwningElement(), eResource);
  }
  
  private /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object ownedElement_;
  
  @Override
  public /* EList<org.obeonetwork.dsl.dd.di.DiagramElement> */Object getOwnedElement() {
    if (ownedElement_ == null)
    	ownedElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedElement(), adaptersFactory, eResource);
    return ownedElement_;
  }
  
  @Override
  public EObject getModelElement() {
    return adaptee.getModelElement();
  }
  
  @Override
  public org.obeonetwork.dsl.dd.di.Style getStyle() {
    return () adaptersFactory.createAdapter(adaptee.getStyle(), eResource);
  }
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.dd.di.DiPackage.eINSTANCE.getNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__OWNING_DIAGRAM:
    		return getOwningDiagram();
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__OWNING_ELEMENT:
    		return getOwningElement();
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__OWNED_ELEMENT:
    		return getOwnedElement();
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__MODEL_ELEMENT:
    		return getModelElement();
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__STYLE:
    		return getStyle();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__OWNING_DIAGRAM:
    		return getOwningDiagram() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__OWNING_ELEMENT:
    		return getOwningElement() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__OWNED_ELEMENT:
    		return getOwnedElement() != null && !getOwnedElement().isEmpty();
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__MODEL_ELEMENT:
    		return getModelElement() != null;
    	case org.obeonetwork.dsl.dd.di.DiPackage.NODE__STYLE:
    		return getStyle() != null;
    }
    
    return super.eIsSet(featureID);
  }
}
