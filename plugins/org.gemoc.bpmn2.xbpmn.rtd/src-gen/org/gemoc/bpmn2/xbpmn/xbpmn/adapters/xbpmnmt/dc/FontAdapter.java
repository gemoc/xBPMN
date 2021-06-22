package org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.dc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory;
import org.gemoc.bpmn2.xbpmn.xbpmn.dc.Font;

@SuppressWarnings("all")
public class FontAdapter extends EObjectAdapter<Font> implements org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Font {
  private XBPMNMTAdaptersFactory adaptersFactory;
  
  public FontAdapter() {
    super(org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.bpmn2.xbpmn.xbpmn.adapters.xbpmnmt.XBPMNMTAdaptersFactory.getInstance();
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
  public float getSize() {
    return adaptee.getSize();
  }
  
  @Override
  public void setSize(final float o) {
    adaptee.setSize(o);
  }
  
  @Override
  public boolean isIsBold() {
    return adaptee.isIsBold();
  }
  
  @Override
  public void setIsBold(final boolean o) {
    adaptee.setIsBold(o);
  }
  
  @Override
  public boolean isIsItalic() {
    return adaptee.isIsItalic();
  }
  
  @Override
  public void setIsItalic(final boolean o) {
    adaptee.setIsItalic(o);
  }
  
  @Override
  public boolean isIsUnderline() {
    return adaptee.isIsUnderline();
  }
  
  @Override
  public void setIsUnderline(final boolean o) {
    adaptee.setIsUnderline(o);
  }
  
  @Override
  public boolean isIsStrikeThrough() {
    return adaptee.isIsStrikeThrough();
  }
  
  @Override
  public void setIsStrikeThrough(final boolean o) {
    adaptee.setIsStrikeThrough(o);
  }
  
  @Override
  public boolean non_negative_size(final DiagnosticChain diagnostics);
  
  protected static final String NAME_EDEFAULT = null;
  
  protected static final float SIZE_EDEFAULT = 0.0F;
  
  protected static final boolean IS_BOLD_EDEFAULT = false;
  
  protected static final boolean IS_ITALIC_EDEFAULT = false;
  
  protected static final boolean IS_UNDERLINE_EDEFAULT = false;
  
  protected static final boolean IS_STRIKE_THROUGH_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.eINSTANCE.getFont();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__NAME:
    		return getName();
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__SIZE:
    		return new java.lang.Float(getSize());
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_BOLD:
    		return isIsBold() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_ITALIC:
    		return isIsItalic() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_UNDERLINE:
    		return isIsUnderline() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_STRIKE_THROUGH:
    		return isIsStrikeThrough() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__SIZE:
    		return getSize() != SIZE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_BOLD:
    		return isIsBold() != IS_BOLD_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_ITALIC:
    		return isIsItalic() != IS_ITALIC_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_UNDERLINE:
    		return isIsUnderline() != IS_UNDERLINE_EDEFAULT;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_STRIKE_THROUGH:
    		return isIsStrikeThrough() != IS_STRIKE_THROUGH_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__SIZE:
    		setSize(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_BOLD:
    		setIsBold(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_ITALIC:
    		setIsItalic(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_UNDERLINE:
    		setIsUnderline(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.DcPackage.FONT__IS_STRIKE_THROUGH:
    		setIsStrikeThrough(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
