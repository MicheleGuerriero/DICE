/**
 */
package _12.impl;

import _12.AttributesType;
import _12.PropertiesType;
import _12.PropertyConstraintsType;
import _12.TEntityTemplate;
import _12.TInterface;
import _12.TRelationshipType;
import _12._12Package;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>TEntity Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.TEntityTemplateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link _12.impl.TEntityTemplateImpl#getPropertyConstraints <em>Property Constraints</em>}</li>
 *   <li>{@link _12.impl.TEntityTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link _12.impl.TEntityTemplateImpl#getType <em>Type</em>}</li>
 *   <li>{@link _12.impl.TEntityTemplateImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link _12.impl.TEntityTemplateImpl#getNodeHasInterface <em>Node Has Interface</em>}</li>
 *   <li>{@link _12.impl.TEntityTemplateImpl#getNodeHasRelations <em>Node Has Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TEntityTemplateImpl extends TExtensibleElementsImpl implements TEntityTemplate {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getPropertyConstraints() <em>Property Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyConstraints()
	 * @generated
	 * @ordered
	 */
	protected PropertyConstraintsType propertyConstraints;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributesType attributes;

	/**
	 * The cached value of the '{@link #getNodeHasInterface() <em>Node Has Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeHasInterface()
	 * @generated
	 * @ordered
	 */
	protected TInterface nodeHasInterface;

	/**
	 * The cached value of the '{@link #getNodeHasRelations() <em>Node Has Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeHasRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<TRelationshipType> nodeHasRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEntityTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.TENTITY_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType getPropertyConstraints() {
		return propertyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyConstraints(PropertyConstraintsType newPropertyConstraints, NotificationChain msgs) {
		PropertyConstraintsType oldPropertyConstraints = propertyConstraints;
		propertyConstraints = newPropertyConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, oldPropertyConstraints, newPropertyConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyConstraints(PropertyConstraintsType newPropertyConstraints) {
		if (newPropertyConstraints != propertyConstraints) {
			NotificationChain msgs = null;
			if (propertyConstraints != null)
				msgs = ((InternalEObject)propertyConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, null, msgs);
			if (newPropertyConstraints != null)
				msgs = ((InternalEObject)newPropertyConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, null, msgs);
			msgs = basicSetPropertyConstraints(newPropertyConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, newPropertyConstraints, newPropertyConstraints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributesType newAttributes, NotificationChain msgs) {
		AttributesType oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributesType newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface getNodeHasInterface() {
		return nodeHasInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeHasInterface(TInterface newNodeHasInterface, NotificationChain msgs) {
		TInterface oldNodeHasInterface = nodeHasInterface;
		nodeHasInterface = newNodeHasInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE, oldNodeHasInterface, newNodeHasInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeHasInterface(TInterface newNodeHasInterface) {
		if (newNodeHasInterface != nodeHasInterface) {
			NotificationChain msgs = null;
			if (nodeHasInterface != null)
				msgs = ((InternalEObject)nodeHasInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE, null, msgs);
			if (newNodeHasInterface != null)
				msgs = ((InternalEObject)newNodeHasInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE, null, msgs);
			msgs = basicSetNodeHasInterface(newNodeHasInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE, newNodeHasInterface, newNodeHasInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRelationshipType> getNodeHasRelations() {
		if (nodeHasRelations == null) {
			nodeHasRelations = new EObjectContainmentEList<TRelationshipType>(TRelationshipType.class, this, _12Package.TENTITY_TEMPLATE__NODE_HAS_RELATIONS);
		}
		return nodeHasRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.TENTITY_TEMPLATE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return basicSetPropertyConstraints(null, msgs);
			case _12Package.TENTITY_TEMPLATE__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE:
				return basicSetNodeHasInterface(null, msgs);
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_RELATIONS:
				return ((InternalEList<?>)getNodeHasRelations()).basicRemove(otherEnd, msgs);
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
			case _12Package.TENTITY_TEMPLATE__PROPERTIES:
				return getProperties();
			case _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return getPropertyConstraints();
			case _12Package.TENTITY_TEMPLATE__ID:
				return getId();
			case _12Package.TENTITY_TEMPLATE__TYPE:
				return getType();
			case _12Package.TENTITY_TEMPLATE__ATTRIBUTES:
				return getAttributes();
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE:
				return getNodeHasInterface();
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_RELATIONS:
				return getNodeHasRelations();
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
			case _12Package.TENTITY_TEMPLATE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				setPropertyConstraints((PropertyConstraintsType)newValue);
				return;
			case _12Package.TENTITY_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case _12Package.TENTITY_TEMPLATE__TYPE:
				setType((String)newValue);
				return;
			case _12Package.TENTITY_TEMPLATE__ATTRIBUTES:
				setAttributes((AttributesType)newValue);
				return;
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE:
				setNodeHasInterface((TInterface)newValue);
				return;
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_RELATIONS:
				getNodeHasRelations().clear();
				getNodeHasRelations().addAll((Collection<? extends TRelationshipType>)newValue);
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
			case _12Package.TENTITY_TEMPLATE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				setPropertyConstraints((PropertyConstraintsType)null);
				return;
			case _12Package.TENTITY_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case _12Package.TENTITY_TEMPLATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case _12Package.TENTITY_TEMPLATE__ATTRIBUTES:
				setAttributes((AttributesType)null);
				return;
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE:
				setNodeHasInterface((TInterface)null);
				return;
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_RELATIONS:
				getNodeHasRelations().clear();
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
			case _12Package.TENTITY_TEMPLATE__PROPERTIES:
				return properties != null;
			case _12Package.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return propertyConstraints != null;
			case _12Package.TENTITY_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _12Package.TENTITY_TEMPLATE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case _12Package.TENTITY_TEMPLATE__ATTRIBUTES:
				return attributes != null;
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_INTERFACE:
				return nodeHasInterface != null;
			case _12Package.TENTITY_TEMPLATE__NODE_HAS_RELATIONS:
				return nodeHasRelations != null && !nodeHasRelations.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TEntityTemplateImpl
