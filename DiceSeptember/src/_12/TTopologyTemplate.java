/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTopology Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TTopologyTemplate#getGroup <em>Group</em>}</li>
 *   <li>{@link _12.TTopologyTemplate#getNodeTemplate <em>Node Template</em>}</li>
 *   <li>{@link _12.TTopologyTemplate#getRelationshipTemplate <em>Relationship Template</em>}</li>
 *   <li>{@link _12.TTopologyTemplate#getHasInputs <em>Has Inputs</em>}</li>
 *   <li>{@link _12.TTopologyTemplate#getHasoutPuts <em>Hasout Puts</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTTopologyTemplate()
 * @model extendedMetaData="name='tTopologyTemplate' kind='elementOnly'"
 * @generated
 */
public interface TTopologyTemplate extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see _12._12Package#getTTopologyTemplate_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Node Template</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TNodeTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Template</em>' containment reference list.
	 * @see _12._12Package#getTTopologyTemplate_NodeTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<TNodeTemplate> getNodeTemplate();

	/**
	 * Returns the value of the '<em><b>Relationship Template</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TRelationshipTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Template</em>' containment reference list.
	 * @see _12._12Package#getTTopologyTemplate_RelationshipTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRelationshipTemplate> getRelationshipTemplate();

	/**
	 * Returns the value of the '<em><b>Has Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TInputTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Inputs</em>' containment reference list.
	 * @see _12._12Package#getTTopologyTemplate_HasInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TInputTemplate> getHasInputs();

	/**
	 * Returns the value of the '<em><b>Hasout Puts</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TOutputTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasout Puts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasout Puts</em>' containment reference list.
	 * @see _12._12Package#getTTopologyTemplate_HasoutPuts()
	 * @model containment="true"
	 * @generated
	 */
	EList<TOutputTemplate> getHasoutPuts();

} // TTopologyTemplate
