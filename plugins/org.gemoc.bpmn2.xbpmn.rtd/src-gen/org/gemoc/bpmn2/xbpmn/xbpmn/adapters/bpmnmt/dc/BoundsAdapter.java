package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.dc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.Bounds;

@SuppressWarnings("all")
public class BoundsAdapter extends EObjectAdapter<Bounds> implements org.obeonetwork.dsl.dd.dc.Bounds {
  private BPMNMTAdaptersFactory adaptersFactory;
  
  public BoundsAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.bpmnmt.BPMNMTAdaptersFactory.getInstance();
  }
  
  @Override
  public float getX() {
    return adaptee.getX();
  }
  
  @Override
  public void setX(final float o) {
    adaptee.setX(o);
  }
  
  @Override
  public float getY() {
    return adaptee.getY();
  }
  
  @Override
  public void setY(final float o) {
    adaptee.setY(o);
  }
  
  @Override
  public float getWidth() {
    return adaptee.getWidth();
  }
  
  @Override
  public void setWidth(final float o) {
    adaptee.setWidth(o);
  }
  
  @Override
  public float getHeight() {
    return adaptee.getHeight();
  }
  
  @Override
  public void setHeight(final float o) {
    adaptee.setHeight(o);
  }
  
  protected static final float X_EDEFAULT = 0.0F;
  
  protected static final float Y_EDEFAULT = 0.0F;
  
  protected static final float WIDTH_EDEFAULT = 0.0F;
  
  protected static final float HEIGHT_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return org.obeonetwork.dsl.dd.dc.DcPackage.eINSTANCE.getBounds();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__X:
    		return new java.lang.Float(getX());
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__Y:
    		return new java.lang.Float(getY());
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__WIDTH:
    		return new java.lang.Float(getWidth());
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__HEIGHT:
    		return new java.lang.Float(getHeight());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__X:
    		return getX() != X_EDEFAULT;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__Y:
    		return getY() != Y_EDEFAULT;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__WIDTH:
    		return getWidth() != WIDTH_EDEFAULT;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__HEIGHT:
    		return getHeight() != HEIGHT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__X:
    		setX(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__Y:
    		setY(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__WIDTH:
    		setWidth(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.obeonetwork.dsl.dd.dc.DcPackage.BOUNDS__HEIGHT:
    		setHeight(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
