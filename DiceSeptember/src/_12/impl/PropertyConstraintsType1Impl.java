/**
 */
package _12.impl;

import _12.PropertyConstraintsType1;
import _12.TPropertyConstraint;
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
 * An implementation of the model object '<em><b>Property Constraints Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.PropertyConstraintsType1Impl#getPropertyConstraint <em>Property Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyConstraintsType1Impl extends MinimalEObjectImpl.Container implements PropertyConstraintsType1 {
	/**
	 * The cached value of the '{@link #getPropertyConstraint() <em>Property Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TPropertyConstraint> propertyConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyConstraintsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.PROPERTY_CONSTRAINTS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPropertyConstraint> getPropertyConstraint() {
		if (propertyConstraint == null) {
			propertyConstraint = new EObjectContainmentEList<TPropertyConstraint>(TPropertyConstraint.class, this, _12Package.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT);
		}
		return propertyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT:
				return ((InternalEList<?>)getPropertyConstraint()).basicRemove(otherEnd, msgs);
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
			case _12Package.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT:
				return getPropertyConstraint();
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
			case _12Package.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT:
				getPropertyConstraint().clear();
				getPropertyConstraint().addAll((Collection<? extends TPropertyConstraint>)newValue);
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
			case _12Package.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT:
				getPropertyConstraint().clear();
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
			case _12Package.PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT:
				return propertyConstraint != null && !propertyConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyConstraintsType1Impl
