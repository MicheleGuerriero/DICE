/**
 */
package _12.impl;

import _12.PropertiesDefinitionType;
import _12.PropertiesType;
import _12._12Package;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.PropertiesDefinitionTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link _12.impl.PropertiesDefinitionTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link _12.impl.PropertiesDefinitionTypeImpl#getHasSomProperties <em>Has Som Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesDefinitionTypeImpl extends MinimalEObjectImpl.Container implements PropertiesDefinitionType {
	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final QName ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected QName element = ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QName TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QName type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSomProperties() <em>Has Som Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSomProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType hasSomProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.PROPERTIES_DEFINITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(QName newElement) {
		QName oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.PROPERTIES_DEFINITION_TYPE__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QName newType) {
		QName oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.PROPERTIES_DEFINITION_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getHasSomProperties() {
		return hasSomProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSomProperties(PropertiesType newHasSomProperties, NotificationChain msgs) {
		PropertiesType oldHasSomProperties = hasSomProperties;
		hasSomProperties = newHasSomProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES, oldHasSomProperties, newHasSomProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSomProperties(PropertiesType newHasSomProperties) {
		if (newHasSomProperties != hasSomProperties) {
			NotificationChain msgs = null;
			if (hasSomProperties != null)
				msgs = ((InternalEObject)hasSomProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES, null, msgs);
			if (newHasSomProperties != null)
				msgs = ((InternalEObject)newHasSomProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES, null, msgs);
			msgs = basicSetHasSomProperties(newHasSomProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES, newHasSomProperties, newHasSomProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES:
				return basicSetHasSomProperties(null, msgs);
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
			case _12Package.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				return getElement();
			case _12Package.PROPERTIES_DEFINITION_TYPE__TYPE:
				return getType();
			case _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES:
				return getHasSomProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _12Package.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				setElement((QName)newValue);
				return;
			case _12Package.PROPERTIES_DEFINITION_TYPE__TYPE:
				setType((QName)newValue);
				return;
			case _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES:
				setHasSomProperties((PropertiesType)newValue);
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
			case _12Package.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case _12Package.PROPERTIES_DEFINITION_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES:
				setHasSomProperties((PropertiesType)null);
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
			case _12Package.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
			case _12Package.PROPERTIES_DEFINITION_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case _12Package.PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES:
				return hasSomProperties != null;
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
		result.append(" (element: ");
		result.append(element);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PropertiesDefinitionTypeImpl
