/**
 */
package _12.impl;

import _12.TInputTemplate;
import _12.TNodeTemplate;
import _12.TOutputTemplate;
import _12.TRelationshipTemplate;
import _12.TTopologyTemplate;
import _12._12Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTopology Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link _12.impl.TTopologyTemplateImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link _12.impl.TTopologyTemplateImpl#getNodeTemplate <em>Node Template</em>}</li>
 *   <li>{@link _12.impl.TTopologyTemplateImpl#getRelationshipTemplate <em>Relationship Template</em>}</li>
 *   <li>{@link _12.impl.TTopologyTemplateImpl#getHasInputs <em>Has Inputs</em>}</li>
 *   <li>{@link _12.impl.TTopologyTemplateImpl#getHasoutPuts <em>Hasout Puts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TTopologyTemplateImpl extends TExtensibleElementsImpl implements TTopologyTemplate {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getNodeTemplate() <em>Node Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TNodeTemplate> nodeTemplate;

	/**
	 * The cached value of the '{@link #getRelationshipTemplate() <em>Relationship Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TRelationshipTemplate> relationshipTemplate;

	/**
	 * The cached value of the '{@link #getHasInputs() <em>Has Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TInputTemplate> hasInputs;

	/**
	 * The cached value of the '{@link #getHasoutPuts() <em>Hasout Puts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasoutPuts()
	 * @generated
	 * @ordered
	 */
	protected EList<TOutputTemplate> hasoutPuts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTopologyTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _12Package.Literals.TTOPOLOGY_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _12Package.TTOPOLOGY_TEMPLATE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TNodeTemplate> getNodeTemplate() {
		if (nodeTemplate == null) {
			nodeTemplate = new EObjectContainmentEList<TNodeTemplate>(TNodeTemplate.class, this, _12Package.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE);
		}
		return nodeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRelationshipTemplate> getRelationshipTemplate() {
		if (relationshipTemplate == null) {
			relationshipTemplate = new EObjectContainmentEList<TRelationshipTemplate>(TRelationshipTemplate.class, this, _12Package.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE);
		}
		return relationshipTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TInputTemplate> getHasInputs() {
		if (hasInputs == null) {
			hasInputs = new EObjectContainmentEList<TInputTemplate>(TInputTemplate.class, this, _12Package.TTOPOLOGY_TEMPLATE__HAS_INPUTS);
		}
		return hasInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TOutputTemplate> getHasoutPuts() {
		if (hasoutPuts == null) {
			hasoutPuts = new EObjectContainmentEList<TOutputTemplate>(TOutputTemplate.class, this, _12Package.TTOPOLOGY_TEMPLATE__HASOUT_PUTS);
		}
		return hasoutPuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _12Package.TTOPOLOGY_TEMPLATE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _12Package.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE:
				return ((InternalEList<?>)getNodeTemplate()).basicRemove(otherEnd, msgs);
			case _12Package.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE:
				return ((InternalEList<?>)getRelationshipTemplate()).basicRemove(otherEnd, msgs);
			case _12Package.TTOPOLOGY_TEMPLATE__HAS_INPUTS:
				return ((InternalEList<?>)getHasInputs()).basicRemove(otherEnd, msgs);
			case _12Package.TTOPOLOGY_TEMPLATE__HASOUT_PUTS:
				return ((InternalEList<?>)getHasoutPuts()).basicRemove(otherEnd, msgs);
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
			case _12Package.TTOPOLOGY_TEMPLATE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _12Package.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE:
				return getNodeTemplate();
			case _12Package.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE:
				return getRelationshipTemplate();
			case _12Package.TTOPOLOGY_TEMPLATE__HAS_INPUTS:
				return getHasInputs();
			case _12Package.TTOPOLOGY_TEMPLATE__HASOUT_PUTS:
				return getHasoutPuts();
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
			case _12Package.TTOPOLOGY_TEMPLATE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE:
				getNodeTemplate().clear();
				getNodeTemplate().addAll((Collection<? extends TNodeTemplate>)newValue);
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE:
				getRelationshipTemplate().clear();
				getRelationshipTemplate().addAll((Collection<? extends TRelationshipTemplate>)newValue);
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__HAS_INPUTS:
				getHasInputs().clear();
				getHasInputs().addAll((Collection<? extends TInputTemplate>)newValue);
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__HASOUT_PUTS:
				getHasoutPuts().clear();
				getHasoutPuts().addAll((Collection<? extends TOutputTemplate>)newValue);
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
			case _12Package.TTOPOLOGY_TEMPLATE__GROUP:
				getGroup().clear();
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE:
				getNodeTemplate().clear();
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE:
				getRelationshipTemplate().clear();
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__HAS_INPUTS:
				getHasInputs().clear();
				return;
			case _12Package.TTOPOLOGY_TEMPLATE__HASOUT_PUTS:
				getHasoutPuts().clear();
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
			case _12Package.TTOPOLOGY_TEMPLATE__GROUP:
				return group != null && !group.isEmpty();
			case _12Package.TTOPOLOGY_TEMPLATE__NODE_TEMPLATE:
				return nodeTemplate != null && !nodeTemplate.isEmpty();
			case _12Package.TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE:
				return relationshipTemplate != null && !relationshipTemplate.isEmpty();
			case _12Package.TTOPOLOGY_TEMPLATE__HAS_INPUTS:
				return hasInputs != null && !hasInputs.isEmpty();
			case _12Package.TTOPOLOGY_TEMPLATE__HASOUT_PUTS:
				return hasoutPuts != null && !hasoutPuts.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //TTopologyTemplateImpl
