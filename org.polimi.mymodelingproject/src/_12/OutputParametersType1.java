/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Parameters Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.OutputParametersType1#getOutputParameter <em>Output Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getOutputParametersType1()
 * @model extendedMetaData="name='OutputParameters_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface OutputParametersType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter</em>' containment reference list.
	 * @see _12._12Package#getOutputParametersType1_OutputParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OutputParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParameter> getOutputParameter();

} // OutputParametersType1
