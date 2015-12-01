/**
 */
package _12;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TService Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TServiceTemplate#getTags <em>Tags</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getBoundaryDefinitions <em>Boundary Definitions</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getTopologyTemplate <em>Topology Template</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getPlans <em>Plans</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getId <em>Id</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getName <em>Name</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getSubstitutableNodeType <em>Substitutable Node Type</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getHasNodeType <em>Has Node Type</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getHasRelationship <em>Has Relationship</em>}</li>
 *   <li>{@link _12.TServiceTemplate#getHasImports <em>Has Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTServiceTemplate()
 * @model extendedMetaData="name='tServiceTemplate' kind='elementOnly'"
 * @generated
 */
public interface TServiceTemplate extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(TTags)
	 * @see _12._12Package#getTServiceTemplate_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tags' namespace='##targetNamespace'"
	 * @generated
	 */
	TTags getTags();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TTags value);

	/**
	 * Returns the value of the '<em><b>Boundary Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Definitions</em>' containment reference.
	 * @see #setBoundaryDefinitions(TBoundaryDefinitions)
	 * @see _12._12Package#getTServiceTemplate_BoundaryDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BoundaryDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	TBoundaryDefinitions getBoundaryDefinitions();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getBoundaryDefinitions <em>Boundary Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary Definitions</em>' containment reference.
	 * @see #getBoundaryDefinitions()
	 * @generated
	 */
	void setBoundaryDefinitions(TBoundaryDefinitions value);

	/**
	 * Returns the value of the '<em><b>Topology Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Template</em>' containment reference.
	 * @see #setTopologyTemplate(TTopologyTemplate)
	 * @see _12._12Package#getTServiceTemplate_TopologyTemplate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopologyTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	TTopologyTemplate getTopologyTemplate();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getTopologyTemplate <em>Topology Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Template</em>' containment reference.
	 * @see #getTopologyTemplate()
	 * @generated
	 */
	void setTopologyTemplate(TTopologyTemplate value);

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference.
	 * @see #setPlans(TPlans)
	 * @see _12._12Package#getTServiceTemplate_Plans()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plans' namespace='##targetNamespace'"
	 * @generated
	 */
	TPlans getPlans();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getPlans <em>Plans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plans</em>' containment reference.
	 * @see #getPlans()
	 * @generated
	 */
	void setPlans(TPlans value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see _12._12Package#getTServiceTemplate_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see _12._12Package#getTServiceTemplate_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Substitutable Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutable Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutable Node Type</em>' attribute.
	 * @see #setSubstitutableNodeType(QName)
	 * @see _12._12Package#getTServiceTemplate_SubstitutableNodeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='substitutableNodeType'"
	 * @generated
	 */
	QName getSubstitutableNodeType();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getSubstitutableNodeType <em>Substitutable Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitutable Node Type</em>' attribute.
	 * @see #getSubstitutableNodeType()
	 * @generated
	 */
	void setSubstitutableNodeType(QName value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see _12._12Package#getTServiceTemplate_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='targetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Has Node Type</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Node Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Node Type</em>' containment reference list.
	 * @see _12._12Package#getTServiceTemplate_HasNodeType()
	 * @model containment="true"
	 * @generated
	 */
	EList<TNodeType> getHasNodeType();

	/**
	 * Returns the value of the '<em><b>Has Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relationship</em>' containment reference list.
	 * @see _12._12Package#getTServiceTemplate_HasRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRelationshipType> getHasRelationship();

	/**
	 * Returns the value of the '<em><b>Has Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Imports</em>' containment reference.
	 * @see #setHasImports(TimportTemplate)
	 * @see _12._12Package#getTServiceTemplate_HasImports()
	 * @model containment="true"
	 * @generated
	 */
	TimportTemplate getHasImports();

	/**
	 * Sets the value of the '{@link _12.TServiceTemplate#getHasImports <em>Has Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Imports</em>' containment reference.
	 * @see #getHasImports()
	 * @generated
	 */
	void setHasImports(TimportTemplate value);

} // TServiceTemplate
