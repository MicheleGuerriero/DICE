/**
 */
package _12.impl;

import _12.InputParametersType;
import _12.OutputParametersType;
import _12.TOperation;
import _12._12Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.TOperationImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link _12.impl.TOperationImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link _12.impl.TOperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TOperationImpl extends TExtensibleElementsImpl implements TOperation {
	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected InputParametersType inputParameters;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected OutputParametersType outputParameters;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.TOPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParametersType getInputParameters() {
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputParameters(InputParametersType newInputParameters, NotificationChain msgs) {
		InputParametersType oldInputParameters = inputParameters;
		inputParameters = newInputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TOPERATION__INPUT_PARAMETERS, oldInputParameters, newInputParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputParameters(InputParametersType newInputParameters) {
		if (newInputParameters != inputParameters) {
			NotificationChain msgs = null;
			if (inputParameters != null)
				msgs = ((InternalEObject)inputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TOPERATION__INPUT_PARAMETERS, null, msgs);
			if (newInputParameters != null)
				msgs = ((InternalEObject)newInputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TOPERATION__INPUT_PARAMETERS, null, msgs);
			msgs = basicSetInputParameters(newInputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TOPERATION__INPUT_PARAMETERS, newInputParameters, newInputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParametersType getOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputParameters(OutputParametersType newOutputParameters, NotificationChain msgs) {
		OutputParametersType oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _12Package.TOPERATION__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameters(OutputParametersType newOutputParameters) {
		if (newOutputParameters != outputParameters) {
			NotificationChain msgs = null;
			if (outputParameters != null)
				msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _12Package.TOPERATION__OUTPUT_PARAMETERS, null, msgs);
			if (newOutputParameters != null)
				msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _12Package.TOPERATION__OUTPUT_PARAMETERS, null, msgs);
			msgs = basicSetOutputParameters(newOutputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TOPERATION__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _12Package.TOPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.TOPERATION__INPUT_PARAMETERS:
				return basicSetInputParameters(null, msgs);
			case _12Package.TOPERATION__OUTPUT_PARAMETERS:
				return basicSetOutputParameters(null, msgs);
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
			case _12Package.TOPERATION__INPUT_PARAMETERS:
				return getInputParameters();
			case _12Package.TOPERATION__OUTPUT_PARAMETERS:
				return getOutputParameters();
			case _12Package.TOPERATION__NAME:
				return getName();
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
			case _12Package.TOPERATION__INPUT_PARAMETERS:
				setInputParameters((InputParametersType)newValue);
				return;
			case _12Package.TOPERATION__OUTPUT_PARAMETERS:
				setOutputParameters((OutputParametersType)newValue);
				return;
			case _12Package.TOPERATION__NAME:
				setName((String)newValue);
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
			case _12Package.TOPERATION__INPUT_PARAMETERS:
				setInputParameters((InputParametersType)null);
				return;
			case _12Package.TOPERATION__OUTPUT_PARAMETERS:
				setOutputParameters((OutputParametersType)null);
				return;
			case _12Package.TOPERATION__NAME:
				setName(NAME_EDEFAULT);
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
			case _12Package.TOPERATION__INPUT_PARAMETERS:
				return inputParameters != null;
			case _12Package.TOPERATION__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case _12Package.TOPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TOperationImpl
