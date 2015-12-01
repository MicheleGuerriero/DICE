/**
 */
package _12;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.PropertiesDefinitionType#getElement <em>Element</em>}</li>
 *   <li>{@link _12.PropertiesDefinitionType#getType <em>Type</em>}</li>
 *   <li>{@link _12.PropertiesDefinitionType#getHasSomProperties <em>Has Som Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getPropertiesDefinitionType()
 * @model extendedMetaData="name='PropertiesDefinition_._type' kind='empty'"
 * @generated
 */
public interface PropertiesDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(QName)
	 * @see _12._12Package#getPropertiesDefinitionType_Element()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='element'"
	 * @generated
	 */
	QName getElement();

	/**
	 * Sets the value of the '{@link _12.PropertiesDefinitionType#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(QName value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(QName)
	 * @see _12._12Package#getPropertiesDefinitionType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	QName getType();

	/**
	 * Sets the value of the '{@link _12.PropertiesDefinitionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(QName value);

	/**
	 * Returns the value of the '<em><b>Has Som Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Som Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Som Properties</em>' containment reference.
	 * @see #setHasSomProperties(PropertiesType)
	 * @see _12._12Package#getPropertiesDefinitionType_HasSomProperties()
	 * @model containment="true"
	 * @generated
	 */
	PropertiesType getHasSomProperties();

	/**
	 * Sets the value of the '{@link _12.PropertiesDefinitionType#getHasSomProperties <em>Has Som Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Som Properties</em>' containment reference.
	 * @see #getHasSomProperties()
	 * @generated
	 */
	void setHasSomProperties(PropertiesType value);

} // PropertiesDefinitionType
