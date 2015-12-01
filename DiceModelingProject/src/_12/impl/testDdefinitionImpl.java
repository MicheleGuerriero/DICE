/**
 */
package _12.impl;

import _12.TServiceTemplate;
import _12._12Package;
import _12.testDdefinition;

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
 * An implementation of the model object '<em><b>test Ddefinition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.testDdefinitionImpl#getTestrelation <em>Testrelation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class testDdefinitionImpl extends MinimalEObjectImpl.Container implements testDdefinition {
	/**
	 * The cached value of the '{@link #getTestrelation() <em>Testrelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<TServiceTemplate> testrelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected testDdefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.TEST_DDEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TServiceTemplate> getTestrelation() {
		if (testrelation == null) {
			testrelation = new EObjectContainmentEList<TServiceTemplate>(TServiceTemplate.class, this, _12Package.TEST_DDEFINITION__TESTRELATION);
		}
		return testrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.TEST_DDEFINITION__TESTRELATION:
				return ((InternalEList<?>)getTestrelation()).basicRemove(otherEnd, msgs);
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
			case _12Package.TEST_DDEFINITION__TESTRELATION:
				return getTestrelation();
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
			case _12Package.TEST_DDEFINITION__TESTRELATION:
				getTestrelation().clear();
				getTestrelation().addAll((Collection<? extends TServiceTemplate>)newValue);
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
			case _12Package.TEST_DDEFINITION__TESTRELATION:
				getTestrelation().clear();
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
			case _12Package.TEST_DDEFINITION__TESTRELATION:
				return testrelation != null && !testrelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //testDdefinitionImpl
