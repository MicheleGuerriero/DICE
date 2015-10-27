/**
 */
package _12.impl;

import _12.TBoundaryDefinitions;
import _12.TNodeType;
import _12.TPlans;
import _12.TRelationshipType;
import _12.TServiceTemplate;
import _12.TTags;
import _12.TTopologyTemplate;
import _12.TimportTemplate;
import _12._12Package;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TService Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getBoundaryDefinitions <em>Boundary Definitions</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getTopologyTemplate <em>Topology Template</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getSubstitutableNodeType <em>Substitutable Node Type</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getHasNodeType <em>Has Node Type</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getHasRelationship <em>Has Relationship</em>}</li>
 *   <li>{@link _12.impl.TServiceTemplateImpl#getHasImports <em>Has Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TServiceTemplateImpl extends TExtensibleElementsImpl implements TServiceTemplate {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected TTags tags;

	/**
	 * The cached value of the '{@link #getBoundaryDefinitions() <em>Boundary Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryDefinitions()
	 * @generated
	 * @ordered
	 */
	protected TBoundaryDefinitions boundaryDefinitions;

	/**
	 * The cached value of the '{@link #getTopologyTemplate() <em>Topology Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyTemplate()
	 * @generated
	 * @ordered
	 */
	protected TTopologyTemplate topologyTemplate;

	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected TPlans plans;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubstitutableNodeType() <em>Substitutable Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutableNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final QName SUBSTITUTABLE_NODE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubstitutableNodeType() <em>Substitutable Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutableNodeType()
	 * @generated
	 * @ordered
	 */
	protected QName substitutableNodeType = SUBSTITUTABLE_NODE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasNodeType() <em>Has Node Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNodeType()
	 * @generated
	 * @ordered
	 */
	protected EList<TNodeType> hasNodeType;

	/**
	 * The cached value of the '{@link #getHasRelationship() <em>Has Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<TRelationshipType> hasRelationship;

	/**
	 * The cached value of the '{@link #getHasImports() <em>Has Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasImports()
	 * @generated
	 * @ordered
	 */
	protected TimportTemplate hasImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TServiceTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.TSERVICE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTags getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(TTags newTags, NotificationChain msgs) {
		TTags oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__TAGS, oldTags, newTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTags(TTags newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoundaryDefinitions getBoundaryDefinitions() {
		return boundaryDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryDefinitions(TBoundaryDefinitions newBoundaryDefinitions, NotificationChain msgs) {
		TBoundaryDefinitions oldBoundaryDefinitions = boundaryDefinitions;
		boundaryDefinitions = newBoundaryDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS, oldBoundaryDefinitions, newBoundaryDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundaryDefinitions(TBoundaryDefinitions newBoundaryDefinitions) {
		if (newBoundaryDefinitions != boundaryDefinitions) {
			NotificationChain msgs = null;
			if (boundaryDefinitions != null)
				msgs = ((InternalEObject)boundaryDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS, null, msgs);
			if (newBoundaryDefinitions != null)
				msgs = ((InternalEObject)newBoundaryDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS, null, msgs);
			msgs = basicSetBoundaryDefinitions(newBoundaryDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS, newBoundaryDefinitions, newBoundaryDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyTemplate getTopologyTemplate() {
		return topologyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyTemplate(TTopologyTemplate newTopologyTemplate, NotificationChain msgs) {
		TTopologyTemplate oldTopologyTemplate = topologyTemplate;
		topologyTemplate = newTopologyTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE, oldTopologyTemplate, newTopologyTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyTemplate(TTopologyTemplate newTopologyTemplate) {
		if (newTopologyTemplate != topologyTemplate) {
			NotificationChain msgs = null;
			if (topologyTemplate != null)
				msgs = ((InternalEObject)topologyTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE, null, msgs);
			if (newTopologyTemplate != null)
				msgs = ((InternalEObject)newTopologyTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE, null, msgs);
			msgs = basicSetTopologyTemplate(newTopologyTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE, newTopologyTemplate, newTopologyTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlans getPlans() {
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlans(TPlans newPlans, NotificationChain msgs) {
		TPlans oldPlans = plans;
		plans = newPlans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__PLANS, oldPlans, newPlans);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlans(TPlans newPlans) {
		if (newPlans != plans) {
			NotificationChain msgs = null;
			if (plans != null)
				msgs = ((InternalEObject)plans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__PLANS, null, msgs);
			if (newPlans != null)
				msgs = ((InternalEObject)newPlans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__PLANS, null, msgs);
			msgs = basicSetPlans(newPlans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__PLANS, newPlans, newPlans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getSubstitutableNodeType() {
		return substitutableNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutableNodeType(QName newSubstitutableNodeType) {
		QName oldSubstitutableNodeType = substitutableNodeType;
		substitutableNodeType = newSubstitutableNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE, oldSubstitutableNodeType, substitutableNodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TNodeType> getHasNodeType() {
		if (hasNodeType == null) {
			hasNodeType = new EObjectContainmentEList<TNodeType>(TNodeType.class, this, _12Package.TSERVICE_TEMPLATE__HAS_NODE_TYPE);
		}
		return hasNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRelationshipType> getHasRelationship() {
		if (hasRelationship == null) {
			hasRelationship = new EObjectContainmentEList<TRelationshipType>(TRelationshipType.class, this, _12Package.TSERVICE_TEMPLATE__HAS_RELATIONSHIP);
		}
		return hasRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimportTemplate getHasImports() {
		return hasImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasImports(TimportTemplate newHasImports, NotificationChain msgs) {
		TimportTemplate oldHasImports = hasImports;
		hasImports = newHasImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS, oldHasImports, newHasImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasImports(TimportTemplate newHasImports) {
		if (newHasImports != hasImports) {
			NotificationChain msgs = null;
			if (hasImports != null)
				msgs = ((InternalEObject)hasImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS, null, msgs);
			if (newHasImports != null)
				msgs = ((InternalEObject)newHasImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS, null, msgs);
			msgs = basicSetHasImports(newHasImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS, newHasImports, newHasImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.TSERVICE_TEMPLATE__TAGS:
				return basicSetTags(null, msgs);
			case _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS:
				return basicSetBoundaryDefinitions(null, msgs);
			case _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE:
				return basicSetTopologyTemplate(null, msgs);
			case _12Package.TSERVICE_TEMPLATE__PLANS:
				return basicSetPlans(null, msgs);
			case _12Package.TSERVICE_TEMPLATE__HAS_NODE_TYPE:
				return ((InternalEList<?>)getHasNodeType()).basicRemove(otherEnd, msgs);
			case _12Package.TSERVICE_TEMPLATE__HAS_RELATIONSHIP:
				return ((InternalEList<?>)getHasRelationship()).basicRemove(otherEnd, msgs);
			case _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS:
				return basicSetHasImports(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _12Package.TSERVICE_TEMPLATE__TAGS:
				return getTags();
			case _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS:
				return getBoundaryDefinitions();
			case _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE:
				return getTopologyTemplate();
			case _12Package.TSERVICE_TEMPLATE__PLANS:
				return getPlans();
			case _12Package.TSERVICE_TEMPLATE__ID:
				return getId();
			case _12Package.TSERVICE_TEMPLATE__NAME:
				return getName();
			case _12Package.TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE:
				return getSubstitutableNodeType();
			case _12Package.TSERVICE_TEMPLATE__TARGET_NAMESPACE:
				return getTargetNamespace();
			case _12Package.TSERVICE_TEMPLATE__HAS_NODE_TYPE:
				return getHasNodeType();
			case _12Package.TSERVICE_TEMPLATE__HAS_RELATIONSHIP:
				return getHasRelationship();
			case _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS:
				return getHasImports();
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
			case _12Package.TSERVICE_TEMPLATE__TAGS:
				setTags((TTags)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS:
				setBoundaryDefinitions((TBoundaryDefinitions)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE:
				setTopologyTemplate((TTopologyTemplate)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__PLANS:
				setPlans((TPlans)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE:
				setSubstitutableNodeType((QName)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__HAS_NODE_TYPE:
				getHasNodeType().clear();
				getHasNodeType().addAll((Collection<? extends TNodeType>)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__HAS_RELATIONSHIP:
				getHasRelationship().clear();
				getHasRelationship().addAll((Collection<? extends TRelationshipType>)newValue);
				return;
			case _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS:
				setHasImports((TimportTemplate)newValue);
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
			case _12Package.TSERVICE_TEMPLATE__TAGS:
				setTags((TTags)null);
				return;
			case _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS:
				setBoundaryDefinitions((TBoundaryDefinitions)null);
				return;
			case _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE:
				setTopologyTemplate((TTopologyTemplate)null);
				return;
			case _12Package.TSERVICE_TEMPLATE__PLANS:
				setPlans((TPlans)null);
				return;
			case _12Package.TSERVICE_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case _12Package.TSERVICE_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _12Package.TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE:
				setSubstitutableNodeType(SUBSTITUTABLE_NODE_TYPE_EDEFAULT);
				return;
			case _12Package.TSERVICE_TEMPLATE__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case _12Package.TSERVICE_TEMPLATE__HAS_NODE_TYPE:
				getHasNodeType().clear();
				return;
			case _12Package.TSERVICE_TEMPLATE__HAS_RELATIONSHIP:
				getHasRelationship().clear();
				return;
			case _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS:
				setHasImports((TimportTemplate)null);
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
			case _12Package.TSERVICE_TEMPLATE__TAGS:
				return tags != null;
			case _12Package.TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS:
				return boundaryDefinitions != null;
			case _12Package.TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE:
				return topologyTemplate != null;
			case _12Package.TSERVICE_TEMPLATE__PLANS:
				return plans != null;
			case _12Package.TSERVICE_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _12Package.TSERVICE_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _12Package.TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE:
				return SUBSTITUTABLE_NODE_TYPE_EDEFAULT == null ? substitutableNodeType != null : !SUBSTITUTABLE_NODE_TYPE_EDEFAULT.equals(substitutableNodeType);
			case _12Package.TSERVICE_TEMPLATE__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case _12Package.TSERVICE_TEMPLATE__HAS_NODE_TYPE:
				return hasNodeType != null && !hasNodeType.isEmpty();
			case _12Package.TSERVICE_TEMPLATE__HAS_RELATIONSHIP:
				return hasRelationship != null && !hasRelationship.isEmpty();
			case _12Package.TSERVICE_TEMPLATE__HAS_IMPORTS:
				return hasImports != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", substitutableNodeType: ");
		result.append(substitutableNodeType);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //TServiceTemplateImpl
