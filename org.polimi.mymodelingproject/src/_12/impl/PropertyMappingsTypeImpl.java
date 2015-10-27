/**
 */
package _12.impl;

import _12.PropertyMappingsType;
import _12.TPropertyMapping;
import _12._12Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Mappings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.PropertyMappingsTypeImpl#getPropertyMapping <em>Property Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyMappingsTypeImpl extends MinimalEObjectImpl.Container implements PropertyMappingsType {
	/**
	 * The cached value of the '{@link #getPropertyMapping() <em>Property Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<TPropertyMapping> propertyMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyMappingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.PROPERTY_MAPPINGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPropertyMapping> getPropertyMapping() {
		if (propertyMapping == null) {
			propertyMapping = new EObjectContainmentEList<TPropertyMapping>(TPropertyMapping.class, this, _12Package.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING);
		}
		return propertyMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				return ((InternalEList<?>)getPropertyMapping()).basicRemove(otherEnd, msgs);
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
			case _12Package.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				return getPropertyMapping();
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
			case _12Package.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				getPropertyMapping().clear();
				getPropertyMapping().addAll((Collection<? extends TPropertyMapping>)newValue);
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
			case _12Package.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				getPropertyMapping().clear();
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
			case _12Package.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				return propertyMapping != null && !propertyMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyMappingsTypeImpl
