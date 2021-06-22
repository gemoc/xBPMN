/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Artifact;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Auditing;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Collaboration;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowElement;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowElementsContainer;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.LaneSet;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Monitoring;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ProcessType;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Property;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ResourceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#isIsExecutable <em>Is Executable</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getCorrelationSubscriptions <em>Correlation Subscriptions</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getDecomposedBy <em>Decomposed By</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ProcessImpl#getDecomposes <em>Decomposes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends CallableElementImpl implements org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process {
	/**
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowElement> flowElements;

	/**
	 * The cached value of the '{@link #getLaneSets() <em>Lane Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaneSets()
	 * @generated
	 * @ordered
	 */
	protected EList<LaneSet> laneSets;

	/**
	 * The default value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessType PROCESS_TYPE_EDEFAULT = ProcessType.NONE;

	/**
	 * The cached value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessType()
	 * @generated
	 * @ordered
	 */
	protected ProcessType processType = PROCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean isClosed = IS_CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditing()
	 * @generated
	 * @ordered
	 */
	protected Auditing auditing;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring()
	 * @generated
	 * @ordered
	 */
	protected Monitoring monitoring;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process> supports;

	/**
	 * The cached value of the '{@link #getDefinitionalCollaborationRef() <em>Definitional Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionalCollaborationRef()
	 * @generated
	 * @ordered
	 */
	protected Collaboration definitionalCollaborationRef;

	/**
	 * The default value of the '{@link #isIsExecutable() <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXECUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExecutable() <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExecutable()
	 * @generated
	 * @ordered
	 */
	protected boolean isExecutable = IS_EXECUTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRole> resources;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getCorrelationSubscriptions() <em>Correlation Subscriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrelationSubscription> correlationSubscriptions;

	/**
	 * The cached value of the '{@link #getDecomposedBy() <em>Decomposed By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process> decomposedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowElement> getFlowElements() {
		if (flowElements == null) {
			flowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, Bpmn2Package.PROCESS__FLOW_ELEMENTS);
		}
		return flowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LaneSet> getLaneSets() {
		if (laneSets == null) {
			laneSets = new EObjectContainmentEList<LaneSet>(LaneSet.class, this, Bpmn2Package.PROCESS__LANE_SETS);
		}
		return laneSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessType getProcessType() {
		return processType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessType(ProcessType newProcessType) {
		ProcessType oldProcessType = processType;
		processType = newProcessType == null ? PROCESS_TYPE_EDEFAULT : newProcessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__PROCESS_TYPE, oldProcessType, processType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsClosed() {
		return isClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsClosed(boolean newIsClosed) {
		boolean oldIsClosed = isClosed;
		isClosed = newIsClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__IS_CLOSED, oldIsClosed, isClosed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auditing getAuditing() {
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditing(Auditing newAuditing, NotificationChain msgs) {
		Auditing oldAuditing = auditing;
		auditing = newAuditing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__AUDITING, oldAuditing, newAuditing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditing(Auditing newAuditing) {
		if (newAuditing != auditing) {
			NotificationChain msgs = null;
			if (auditing != null)
				msgs = ((InternalEObject)auditing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.PROCESS__AUDITING, null, msgs);
			if (newAuditing != null)
				msgs = ((InternalEObject)newAuditing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.PROCESS__AUDITING, null, msgs);
			msgs = basicSetAuditing(newAuditing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__AUDITING, newAuditing, newAuditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Monitoring getMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoring(Monitoring newMonitoring, NotificationChain msgs) {
		Monitoring oldMonitoring = monitoring;
		monitoring = newMonitoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__MONITORING, oldMonitoring, newMonitoring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoring(Monitoring newMonitoring) {
		if (newMonitoring != monitoring) {
			NotificationChain msgs = null;
			if (monitoring != null)
				msgs = ((InternalEObject)monitoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.PROCESS__MONITORING, null, msgs);
			if (newMonitoring != null)
				msgs = ((InternalEObject)newMonitoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.PROCESS__MONITORING, null, msgs);
			msgs = basicSetMonitoring(newMonitoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__MONITORING, newMonitoring, newMonitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, Bpmn2Package.PROCESS__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process> getSupports() {
		if (supports == null) {
			supports = new EObjectResolvingEList<org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process>(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process.class, this, Bpmn2Package.PROCESS__SUPPORTS);
		}
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collaboration getDefinitionalCollaborationRef() {
		if (definitionalCollaborationRef != null && definitionalCollaborationRef.eIsProxy()) {
			InternalEObject oldDefinitionalCollaborationRef = (InternalEObject)definitionalCollaborationRef;
			definitionalCollaborationRef = (Collaboration)eResolveProxy(oldDefinitionalCollaborationRef);
			if (definitionalCollaborationRef != oldDefinitionalCollaborationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF, oldDefinitionalCollaborationRef, definitionalCollaborationRef));
			}
		}
		return definitionalCollaborationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetDefinitionalCollaborationRef() {
		return definitionalCollaborationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionalCollaborationRef(Collaboration newDefinitionalCollaborationRef) {
		Collaboration oldDefinitionalCollaborationRef = definitionalCollaborationRef;
		definitionalCollaborationRef = newDefinitionalCollaborationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF, oldDefinitionalCollaborationRef, definitionalCollaborationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsExecutable() {
		return isExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExecutable(boolean newIsExecutable) {
		boolean oldIsExecutable = isExecutable;
		isExecutable = newIsExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__IS_EXECUTABLE, oldIsExecutable, isExecutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceRole> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ResourceRole>(ResourceRole.class, this, Bpmn2Package.PROCESS__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, Bpmn2Package.PROCESS__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorrelationSubscription> getCorrelationSubscriptions() {
		if (correlationSubscriptions == null) {
			correlationSubscriptions = new EObjectContainmentEList<CorrelationSubscription>(CorrelationSubscription.class, this, Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS);
		}
		return correlationSubscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process> getDecomposedBy() {
		if (decomposedBy == null) {
			decomposedBy = new EObjectContainmentWithInverseEList<org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process>(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process.class, this, Bpmn2Package.PROCESS__DECOMPOSED_BY, Bpmn2Package.PROCESS__DECOMPOSES);
		}
		return decomposedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process getDecomposes() {
		if (eContainerFeatureID() != Bpmn2Package.PROCESS__DECOMPOSES) return null;
		return (org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposes(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process newDecomposes, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDecomposes, Bpmn2Package.PROCESS__DECOMPOSES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecomposes(org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process newDecomposes) {
		if (newDecomposes != eInternalContainer() || (eContainerFeatureID() != Bpmn2Package.PROCESS__DECOMPOSES && newDecomposes != null)) {
			if (EcoreUtil.isAncestor(this, newDecomposes))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDecomposes != null)
				msgs = ((InternalEObject)newDecomposes).eInverseAdd(this, Bpmn2Package.PROCESS__DECOMPOSED_BY, org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process.class, msgs);
			msgs = basicSetDecomposes(newDecomposes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.PROCESS__DECOMPOSES, newDecomposes, newDecomposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpmn2Package.PROCESS__DECOMPOSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecomposedBy()).basicAdd(otherEnd, msgs);
			case Bpmn2Package.PROCESS__DECOMPOSES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDecomposes((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
				return ((InternalEList<?>)getFlowElements()).basicRemove(otherEnd, msgs);
			case Bpmn2Package.PROCESS__LANE_SETS:
				return ((InternalEList<?>)getLaneSets()).basicRemove(otherEnd, msgs);
			case Bpmn2Package.PROCESS__AUDITING:
				return basicSetAuditing(null, msgs);
			case Bpmn2Package.PROCESS__MONITORING:
				return basicSetMonitoring(null, msgs);
			case Bpmn2Package.PROCESS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case Bpmn2Package.PROCESS__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case Bpmn2Package.PROCESS__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
				return ((InternalEList<?>)getCorrelationSubscriptions()).basicRemove(otherEnd, msgs);
			case Bpmn2Package.PROCESS__DECOMPOSED_BY:
				return ((InternalEList<?>)getDecomposedBy()).basicRemove(otherEnd, msgs);
			case Bpmn2Package.PROCESS__DECOMPOSES:
				return basicSetDecomposes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Bpmn2Package.PROCESS__DECOMPOSES:
				return eInternalContainer().eInverseRemove(this, Bpmn2Package.PROCESS__DECOMPOSED_BY, org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
				return getFlowElements();
			case Bpmn2Package.PROCESS__LANE_SETS:
				return getLaneSets();
			case Bpmn2Package.PROCESS__PROCESS_TYPE:
				return getProcessType();
			case Bpmn2Package.PROCESS__IS_CLOSED:
				return isIsClosed();
			case Bpmn2Package.PROCESS__AUDITING:
				return getAuditing();
			case Bpmn2Package.PROCESS__MONITORING:
				return getMonitoring();
			case Bpmn2Package.PROCESS__PROPERTIES:
				return getProperties();
			case Bpmn2Package.PROCESS__SUPPORTS:
				return getSupports();
			case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
				if (resolve) return getDefinitionalCollaborationRef();
				return basicGetDefinitionalCollaborationRef();
			case Bpmn2Package.PROCESS__IS_EXECUTABLE:
				return isIsExecutable();
			case Bpmn2Package.PROCESS__RESOURCES:
				return getResources();
			case Bpmn2Package.PROCESS__ARTIFACTS:
				return getArtifacts();
			case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
				return getCorrelationSubscriptions();
			case Bpmn2Package.PROCESS__DECOMPOSED_BY:
				return getDecomposedBy();
			case Bpmn2Package.PROCESS__DECOMPOSES:
				return getDecomposes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case Bpmn2Package.PROCESS__LANE_SETS:
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>)newValue);
				return;
			case Bpmn2Package.PROCESS__PROCESS_TYPE:
				setProcessType((ProcessType)newValue);
				return;
			case Bpmn2Package.PROCESS__IS_CLOSED:
				setIsClosed((Boolean)newValue);
				return;
			case Bpmn2Package.PROCESS__AUDITING:
				setAuditing((Auditing)newValue);
				return;
			case Bpmn2Package.PROCESS__MONITORING:
				setMonitoring((Monitoring)newValue);
				return;
			case Bpmn2Package.PROCESS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case Bpmn2Package.PROCESS__SUPPORTS:
				getSupports().clear();
				getSupports().addAll((Collection<? extends org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process>)newValue);
				return;
			case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
				setDefinitionalCollaborationRef((Collaboration)newValue);
				return;
			case Bpmn2Package.PROCESS__IS_EXECUTABLE:
				setIsExecutable((Boolean)newValue);
				return;
			case Bpmn2Package.PROCESS__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceRole>)newValue);
				return;
			case Bpmn2Package.PROCESS__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
				getCorrelationSubscriptions().clear();
				getCorrelationSubscriptions().addAll((Collection<? extends CorrelationSubscription>)newValue);
				return;
			case Bpmn2Package.PROCESS__DECOMPOSED_BY:
				getDecomposedBy().clear();
				getDecomposedBy().addAll((Collection<? extends org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process>)newValue);
				return;
			case Bpmn2Package.PROCESS__DECOMPOSES:
				setDecomposes((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process)newValue);
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
			case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				return;
			case Bpmn2Package.PROCESS__LANE_SETS:
				getLaneSets().clear();
				return;
			case Bpmn2Package.PROCESS__PROCESS_TYPE:
				setProcessType(PROCESS_TYPE_EDEFAULT);
				return;
			case Bpmn2Package.PROCESS__IS_CLOSED:
				setIsClosed(IS_CLOSED_EDEFAULT);
				return;
			case Bpmn2Package.PROCESS__AUDITING:
				setAuditing((Auditing)null);
				return;
			case Bpmn2Package.PROCESS__MONITORING:
				setMonitoring((Monitoring)null);
				return;
			case Bpmn2Package.PROCESS__PROPERTIES:
				getProperties().clear();
				return;
			case Bpmn2Package.PROCESS__SUPPORTS:
				getSupports().clear();
				return;
			case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
				setDefinitionalCollaborationRef((Collaboration)null);
				return;
			case Bpmn2Package.PROCESS__IS_EXECUTABLE:
				setIsExecutable(IS_EXECUTABLE_EDEFAULT);
				return;
			case Bpmn2Package.PROCESS__RESOURCES:
				getResources().clear();
				return;
			case Bpmn2Package.PROCESS__ARTIFACTS:
				getArtifacts().clear();
				return;
			case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
				getCorrelationSubscriptions().clear();
				return;
			case Bpmn2Package.PROCESS__DECOMPOSED_BY:
				getDecomposedBy().clear();
				return;
			case Bpmn2Package.PROCESS__DECOMPOSES:
				setDecomposes((org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Process)null);
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
			case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
				return flowElements != null && !flowElements.isEmpty();
			case Bpmn2Package.PROCESS__LANE_SETS:
				return laneSets != null && !laneSets.isEmpty();
			case Bpmn2Package.PROCESS__PROCESS_TYPE:
				return processType != PROCESS_TYPE_EDEFAULT;
			case Bpmn2Package.PROCESS__IS_CLOSED:
				return isClosed != IS_CLOSED_EDEFAULT;
			case Bpmn2Package.PROCESS__AUDITING:
				return auditing != null;
			case Bpmn2Package.PROCESS__MONITORING:
				return monitoring != null;
			case Bpmn2Package.PROCESS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case Bpmn2Package.PROCESS__SUPPORTS:
				return supports != null && !supports.isEmpty();
			case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
				return definitionalCollaborationRef != null;
			case Bpmn2Package.PROCESS__IS_EXECUTABLE:
				return isExecutable != IS_EXECUTABLE_EDEFAULT;
			case Bpmn2Package.PROCESS__RESOURCES:
				return resources != null && !resources.isEmpty();
			case Bpmn2Package.PROCESS__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
				return correlationSubscriptions != null && !correlationSubscriptions.isEmpty();
			case Bpmn2Package.PROCESS__DECOMPOSED_BY:
				return decomposedBy != null && !decomposedBy.isEmpty();
			case Bpmn2Package.PROCESS__DECOMPOSES:
				return getDecomposes() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (derivedFeatureID) {
				case Bpmn2Package.PROCESS__FLOW_ELEMENTS: return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
				case Bpmn2Package.PROCESS__LANE_SETS: return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS: return Bpmn2Package.PROCESS__FLOW_ELEMENTS;
				case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS: return Bpmn2Package.PROCESS__LANE_SETS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (processType: ");
		result.append(processType);
		result.append(", isClosed: ");
		result.append(isClosed);
		result.append(", isExecutable: ");
		result.append(isExecutable);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl