/**
 */
package _12.impl;

import _12.*;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _12FactoryImpl extends EFactoryImpl implements _12Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _12Factory init() {
		try {
			_12Factory the_12Factory = (_12Factory)EPackage.Registry.INSTANCE.getEFactory(_12Package.eNS_URI);
			if (the_12Factory != null) {
				return the_12Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _12FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _12FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _12Package.ARTIFACT_REFERENCES_TYPE: return createArtifactReferencesType();
			case _12Package.CAPABILITIES_TYPE: return createCapabilitiesType();
			case _12Package.CAPABILITIES_TYPE1: return createCapabilitiesType1();
			case _12Package.CAPABILITY_DEFINITIONS_TYPE: return createCapabilityDefinitionsType();
			case _12Package.CONSTRAINTS_TYPE: return createConstraintsType();
			case _12Package.CONSTRAINTS_TYPE1: return createConstraintsType1();
			case _12Package.DEFINITIONS_TYPE: return createDefinitionsType();
			case _12Package.DERIVED_FROM_TYPE: return createDerivedFromType();
			case _12Package.DERIVED_FROM_TYPE1: return createDerivedFromType1();
			case _12Package.DERIVED_FROM_TYPE2: return createDerivedFromType2();
			case _12Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _12Package.EXCLUDE_TYPE: return createExcludeType();
			case _12Package.EXTENSIONS_TYPE: return createExtensionsType();
			case _12Package.IMPLEMENTATION_ARTIFACT_TYPE: return createImplementationArtifactType();
			case _12Package.INCLUDE_TYPE: return createIncludeType();
			case _12Package.INPUT_PARAMETERS_TYPE: return createInputParametersType();
			case _12Package.INPUT_PARAMETERS_TYPE1: return createInputParametersType1();
			case _12Package.INSTANCE_STATE_TYPE: return createInstanceStateType();
			case _12Package.INTERFACES_TYPE: return createInterfacesType();
			case _12Package.INTERFACES_TYPE1: return createInterfacesType1();
			case _12Package.NODE_OPERATION_TYPE: return createNodeOperationType();
			case _12Package.NODE_TYPE_REFERENCE_TYPE: return createNodeTypeReferenceType();
			case _12Package.OUTPUT_PARAMETERS_TYPE: return createOutputParametersType();
			case _12Package.OUTPUT_PARAMETERS_TYPE1: return createOutputParametersType1();
			case _12Package.PLAN_MODEL_REFERENCE_TYPE: return createPlanModelReferenceType();
			case _12Package.PLAN_MODEL_TYPE: return createPlanModelType();
			case _12Package.PLAN_TYPE: return createPlanType();
			case _12Package.POLICIES_TYPE: return createPoliciesType();
			case _12Package.POLICIES_TYPE1: return createPoliciesType1();
			case _12Package.PROPERTIES_DEFINITION_TYPE: return createPropertiesDefinitionType();
			case _12Package.TPROPERTY: return createTProperty();
			case _12Package.PROPERTIES_TYPE1: return createPropertiesType1();
			case _12Package.PROPERTY_CONSTRAINTS_TYPE: return createPropertyConstraintsType();
			case _12Package.PROPERTY_CONSTRAINTS_TYPE1: return createPropertyConstraintsType1();
			case _12Package.PROPERTY_MAPPINGS_TYPE: return createPropertyMappingsType();
			case _12Package.RELATIONSHIP_CONSTRAINTS_TYPE: return createRelationshipConstraintsType();
			case _12Package.RELATIONSHIP_CONSTRAINT_TYPE: return createRelationshipConstraintType();
			case _12Package.RELATIONSHIP_OPERATION_TYPE: return createRelationshipOperationType();
			case _12Package.REQUIREMENT_DEFINITIONS_TYPE: return createRequirementDefinitionsType();
			case _12Package.REQUIREMENTS_TYPE: return createRequirementsType();
			case _12Package.REQUIREMENTS_TYPE1: return createRequirementsType1();
			case _12Package.SOURCE_ELEMENT_TYPE: return createSourceElementType();
			case _12Package.SOURCE_INTERFACES_TYPE: return createSourceInterfacesType();
			case _12Package.TAPPLIES_TO: return createTAppliesTo();
			case _12Package.TARGET_ELEMENT_TYPE: return createTargetElementType();
			case _12Package.TARGET_INTERFACES_TYPE: return createTargetInterfacesType();
			case _12Package.TARTIFACT_REFERENCE: return createTArtifactReference();
			case _12Package.TARTIFACT_TEMPLATE: return createTArtifactTemplate();
			case _12Package.TARTIFACT_TYPE: return createTArtifactType();
			case _12Package.TBOUNDARY_DEFINITIONS: return createTBoundaryDefinitions();
			case _12Package.TCAPABILITY: return createTCapability();
			case _12Package.TCAPABILITY_DEFINITION: return createTCapabilityDefinition();
			case _12Package.TCAPABILITY_REF: return createTCapabilityRef();
			case _12Package.TCAPABILITY_TYPE: return createTCapabilityType();
			case _12Package.TCONDITION: return createTCondition();
			case _12Package.TCONSTRAINT: return createTConstraint();
			case _12Package.TDEFINITIONS: return createTDefinitions();
			case _12Package.TDEPLOYMENT_ARTIFACT: return createTDeploymentArtifact();
			case _12Package.TDEPLOYMENT_ARTIFACTS: return createTDeploymentArtifacts();
			case _12Package.TDOCUMENTATION: return createTDocumentation();
			case _12Package.TEXPORTED_INTERFACE: return createTExportedInterface();
			case _12Package.TEXPORTED_OPERATION: return createTExportedOperation();
			case _12Package.TEXTENSIBLE_ELEMENTS: return createTExtensibleElements();
			case _12Package.TEXTENSION: return createTExtension();
			case _12Package.TEXTENSIONS: return createTExtensions();
			case _12Package.TIMPLEMENTATION_ARTIFACT: return createTImplementationArtifact();
			case _12Package.TIMPLEMENTATION_ARTIFACTS: return createTImplementationArtifacts();
			case _12Package.TIMPORT: return createTImport();
			case _12Package.TINTERFACE: return createTInterface();
			case _12Package.TNODE_TEMPLATE: return createTNodeTemplate();
			case _12Package.TNODE_TYPE: return createTNodeType();
			case _12Package.TNODE_TYPE_IMPLEMENTATION: return createTNodeTypeImplementation();
			case _12Package.TOPERATION: return createTOperation();
			case _12Package.TPARAMETER: return createTParameter();
			case _12Package.TPLAN: return createTPlan();
			case _12Package.TPLANS: return createTPlans();
			case _12Package.TPOLICY: return createTPolicy();
			case _12Package.TPOLICY_TEMPLATE: return createTPolicyTemplate();
			case _12Package.TPOLICY_TYPE: return createTPolicyType();
			case _12Package.TPROPERTY_CONSTRAINT: return createTPropertyConstraint();
			case _12Package.TPROPERTY_MAPPING: return createTPropertyMapping();
			case _12Package.TRELATIONSHIP_TEMPLATE: return createTRelationshipTemplate();
			case _12Package.TRELATIONSHIP_TYPE: return createTRelationshipType();
			case _12Package.TRELATIONSHIP_TYPE_IMPLEMENTATION: return createTRelationshipTypeImplementation();
			case _12Package.TREQUIRED_CONTAINER_FEATURE: return createTRequiredContainerFeature();
			case _12Package.TREQUIRED_CONTAINER_FEATURES: return createTRequiredContainerFeatures();
			case _12Package.TREQUIREMENT: return createTRequirement();
			case _12Package.TREQUIREMENT_DEFINITION: return createTRequirementDefinition();
			case _12Package.TREQUIREMENT_REF: return createTRequirementRef();
			case _12Package.TREQUIREMENT_TYPE: return createTRequirementType();
			case _12Package.TSERVICE_TEMPLATE: return createTServiceTemplate();
			case _12Package.TTAG: return createTTag();
			case _12Package.TTAGS: return createTTags();
			case _12Package.TTOPOLOGY_ELEMENT_INSTANCE_STATES: return createTTopologyElementInstanceStates();
			case _12Package.TTOPOLOGY_TEMPLATE: return createTTopologyTemplate();
			case _12Package.TYPES_TYPE: return createTypesType();
			case _12Package.VALID_SOURCE_TYPE: return createValidSourceType();
			case _12Package.VALID_TARGET_TYPE: return createValidTargetType();
			case _12Package.TEST_DDEFINITION: return createtestDdefinition();
			case _12Package.TATTRIBUTE: return createTAttribute();
			case _12Package.ATTRIBUTES_TYPE: return createAttributesType();
			case _12Package.PROPERTIES_TYPE: return createPropertiesType();
			case _12Package.TINPUT_TEMPLATE: return createTInputTemplate();
			case _12Package.TOUTPUT_TEMPLATE: return createTOutputTemplate();
			case _12Package.TIMPORT_TEMPLATE: return createTimportTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _12Package.MAX_INSTANCES_TYPE_MEMBER1:
				return createMaxInstancesTypeMember1FromString(eDataType, initialValue);
			case _12Package.TBOOLEAN:
				return createTBooleanFromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER1:
				return createUpperBoundTypeMember1FromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER11:
				return createUpperBoundTypeMember11FromString(eDataType, initialValue);
			case _12Package.IMPORTED_URI:
				return createImportedURIFromString(eDataType, initialValue);
			case _12Package.MAX_INSTANCES_TYPE:
				return createMaxInstancesTypeFromString(eDataType, initialValue);
			case _12Package.MAX_INSTANCES_TYPE_MEMBER0:
				return createMaxInstancesTypeMember0FromString(eDataType, initialValue);
			case _12Package.MAX_INSTANCES_TYPE_MEMBER1_OBJECT:
				return createMaxInstancesTypeMember1ObjectFromString(eDataType, initialValue);
			case _12Package.TBOOLEAN_OBJECT:
				return createTBooleanObjectFromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE:
				return createUpperBoundTypeFromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE1:
				return createUpperBoundType1FromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER0:
				return createUpperBoundTypeMember0FromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER01:
				return createUpperBoundTypeMember01FromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER1_OBJECT:
				return createUpperBoundTypeMember1ObjectFromString(eDataType, initialValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER1_OBJECT1:
				return createUpperBoundTypeMember1Object1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _12Package.MAX_INSTANCES_TYPE_MEMBER1:
				return convertMaxInstancesTypeMember1ToString(eDataType, instanceValue);
			case _12Package.TBOOLEAN:
				return convertTBooleanToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER1:
				return convertUpperBoundTypeMember1ToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER11:
				return convertUpperBoundTypeMember11ToString(eDataType, instanceValue);
			case _12Package.IMPORTED_URI:
				return convertImportedURIToString(eDataType, instanceValue);
			case _12Package.MAX_INSTANCES_TYPE:
				return convertMaxInstancesTypeToString(eDataType, instanceValue);
			case _12Package.MAX_INSTANCES_TYPE_MEMBER0:
				return convertMaxInstancesTypeMember0ToString(eDataType, instanceValue);
			case _12Package.MAX_INSTANCES_TYPE_MEMBER1_OBJECT:
				return convertMaxInstancesTypeMember1ObjectToString(eDataType, instanceValue);
			case _12Package.TBOOLEAN_OBJECT:
				return convertTBooleanObjectToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE:
				return convertUpperBoundTypeToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE1:
				return convertUpperBoundType1ToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER0:
				return convertUpperBoundTypeMember0ToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER01:
				return convertUpperBoundTypeMember01ToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER1_OBJECT:
				return convertUpperBoundTypeMember1ObjectToString(eDataType, instanceValue);
			case _12Package.UPPER_BOUND_TYPE_MEMBER1_OBJECT1:
				return convertUpperBoundTypeMember1Object1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactReferencesType createArtifactReferencesType() {
		ArtifactReferencesTypeImpl artifactReferencesType = new ArtifactReferencesTypeImpl();
		return artifactReferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType createCapabilitiesType() {
		CapabilitiesTypeImpl capabilitiesType = new CapabilitiesTypeImpl();
		return capabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType1 createCapabilitiesType1() {
		CapabilitiesType1Impl capabilitiesType1 = new CapabilitiesType1Impl();
		return capabilitiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinitionsType createCapabilityDefinitionsType() {
		CapabilityDefinitionsTypeImpl capabilityDefinitionsType = new CapabilityDefinitionsTypeImpl();
		return capabilityDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType createConstraintsType() {
		ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType1 createConstraintsType1() {
		ConstraintsType1Impl constraintsType1 = new ConstraintsType1Impl();
		return constraintsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsType createDefinitionsType() {
		DefinitionsTypeImpl definitionsType = new DefinitionsTypeImpl();
		return definitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType createDerivedFromType() {
		DerivedFromTypeImpl derivedFromType = new DerivedFromTypeImpl();
		return derivedFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType1 createDerivedFromType1() {
		DerivedFromType1Impl derivedFromType1 = new DerivedFromType1Impl();
		return derivedFromType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType2 createDerivedFromType2() {
		DerivedFromType2Impl derivedFromType2 = new DerivedFromType2Impl();
		return derivedFromType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeType createExcludeType() {
		ExcludeTypeImpl excludeType = new ExcludeTypeImpl();
		return excludeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType createExtensionsType() {
		ExtensionsTypeImpl extensionsType = new ExtensionsTypeImpl();
		return extensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationArtifactType createImplementationArtifactType() {
		ImplementationArtifactTypeImpl implementationArtifactType = new ImplementationArtifactTypeImpl();
		return implementationArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParametersType createInputParametersType() {
		InputParametersTypeImpl inputParametersType = new InputParametersTypeImpl();
		return inputParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParametersType1 createInputParametersType1() {
		InputParametersType1Impl inputParametersType1 = new InputParametersType1Impl();
		return inputParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceStateType createInstanceStateType() {
		InstanceStateTypeImpl instanceStateType = new InstanceStateTypeImpl();
		return instanceStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesType createInterfacesType() {
		InterfacesTypeImpl interfacesType = new InterfacesTypeImpl();
		return interfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesType1 createInterfacesType1() {
		InterfacesType1Impl interfacesType1 = new InterfacesType1Impl();
		return interfacesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeOperationType createNodeOperationType() {
		NodeOperationTypeImpl nodeOperationType = new NodeOperationTypeImpl();
		return nodeOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeReferenceType createNodeTypeReferenceType() {
		NodeTypeReferenceTypeImpl nodeTypeReferenceType = new NodeTypeReferenceTypeImpl();
		return nodeTypeReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParametersType createOutputParametersType() {
		OutputParametersTypeImpl outputParametersType = new OutputParametersTypeImpl();
		return outputParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParametersType1 createOutputParametersType1() {
		OutputParametersType1Impl outputParametersType1 = new OutputParametersType1Impl();
		return outputParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelReferenceType createPlanModelReferenceType() {
		PlanModelReferenceTypeImpl planModelReferenceType = new PlanModelReferenceTypeImpl();
		return planModelReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelType createPlanModelType() {
		PlanModelTypeImpl planModelType = new PlanModelTypeImpl();
		return planModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanType createPlanType() {
		PlanTypeImpl planType = new PlanTypeImpl();
		return planType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliciesType createPoliciesType() {
		PoliciesTypeImpl policiesType = new PoliciesTypeImpl();
		return policiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliciesType1 createPoliciesType1() {
		PoliciesType1Impl policiesType1 = new PoliciesType1Impl();
		return policiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDefinitionType createPropertiesDefinitionType() {
		PropertiesDefinitionTypeImpl propertiesDefinitionType = new PropertiesDefinitionTypeImpl();
		return propertiesDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProperty createTProperty() {
		TPropertyImpl tProperty = new TPropertyImpl();
		return tProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType1 createPropertiesType1() {
		PropertiesType1Impl propertiesType1 = new PropertiesType1Impl();
		return propertiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType createPropertyConstraintsType() {
		PropertyConstraintsTypeImpl propertyConstraintsType = new PropertyConstraintsTypeImpl();
		return propertyConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType1 createPropertyConstraintsType1() {
		PropertyConstraintsType1Impl propertyConstraintsType1 = new PropertyConstraintsType1Impl();
		return propertyConstraintsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMappingsType createPropertyMappingsType() {
		PropertyMappingsTypeImpl propertyMappingsType = new PropertyMappingsTypeImpl();
		return propertyMappingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraintsType createRelationshipConstraintsType() {
		RelationshipConstraintsTypeImpl relationshipConstraintsType = new RelationshipConstraintsTypeImpl();
		return relationshipConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraintType createRelationshipConstraintType() {
		RelationshipConstraintTypeImpl relationshipConstraintType = new RelationshipConstraintTypeImpl();
		return relationshipConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipOperationType createRelationshipOperationType() {
		RelationshipOperationTypeImpl relationshipOperationType = new RelationshipOperationTypeImpl();
		return relationshipOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinitionsType createRequirementDefinitionsType() {
		RequirementDefinitionsTypeImpl requirementDefinitionsType = new RequirementDefinitionsTypeImpl();
		return requirementDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType createRequirementsType() {
		RequirementsTypeImpl requirementsType = new RequirementsTypeImpl();
		return requirementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType1 createRequirementsType1() {
		RequirementsType1Impl requirementsType1 = new RequirementsType1Impl();
		return requirementsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElementType createSourceElementType() {
		SourceElementTypeImpl sourceElementType = new SourceElementTypeImpl();
		return sourceElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceInterfacesType createSourceInterfacesType() {
		SourceInterfacesTypeImpl sourceInterfacesType = new SourceInterfacesTypeImpl();
		return sourceInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAppliesTo createTAppliesTo() {
		TAppliesToImpl tAppliesTo = new TAppliesToImpl();
		return tAppliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElementType createTargetElementType() {
		TargetElementTypeImpl targetElementType = new TargetElementTypeImpl();
		return targetElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetInterfacesType createTargetInterfacesType() {
		TargetInterfacesTypeImpl targetInterfacesType = new TargetInterfacesTypeImpl();
		return targetInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactReference createTArtifactReference() {
		TArtifactReferenceImpl tArtifactReference = new TArtifactReferenceImpl();
		return tArtifactReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactTemplate createTArtifactTemplate() {
		TArtifactTemplateImpl tArtifactTemplate = new TArtifactTemplateImpl();
		return tArtifactTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactType createTArtifactType() {
		TArtifactTypeImpl tArtifactType = new TArtifactTypeImpl();
		return tArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoundaryDefinitions createTBoundaryDefinitions() {
		TBoundaryDefinitionsImpl tBoundaryDefinitions = new TBoundaryDefinitionsImpl();
		return tBoundaryDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapability createTCapability() {
		TCapabilityImpl tCapability = new TCapabilityImpl();
		return tCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityDefinition createTCapabilityDefinition() {
		TCapabilityDefinitionImpl tCapabilityDefinition = new TCapabilityDefinitionImpl();
		return tCapabilityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityRef createTCapabilityRef() {
		TCapabilityRefImpl tCapabilityRef = new TCapabilityRefImpl();
		return tCapabilityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityType createTCapabilityType() {
		TCapabilityTypeImpl tCapabilityType = new TCapabilityTypeImpl();
		return tCapabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCondition createTCondition() {
		TConditionImpl tCondition = new TConditionImpl();
		return tCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConstraint createTConstraint() {
		TConstraintImpl tConstraint = new TConstraintImpl();
		return tConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitions createTDefinitions() {
		TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
		return tDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifact createTDeploymentArtifact() {
		TDeploymentArtifactImpl tDeploymentArtifact = new TDeploymentArtifactImpl();
		return tDeploymentArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifacts createTDeploymentArtifacts() {
		TDeploymentArtifactsImpl tDeploymentArtifacts = new TDeploymentArtifactsImpl();
		return tDeploymentArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDocumentation createTDocumentation() {
		TDocumentationImpl tDocumentation = new TDocumentationImpl();
		return tDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExportedInterface createTExportedInterface() {
		TExportedInterfaceImpl tExportedInterface = new TExportedInterfaceImpl();
		return tExportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExportedOperation createTExportedOperation() {
		TExportedOperationImpl tExportedOperation = new TExportedOperationImpl();
		return tExportedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtensibleElements createTExtensibleElements() {
		TExtensibleElementsImpl tExtensibleElements = new TExtensibleElementsImpl();
		return tExtensibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtension createTExtension() {
		TExtensionImpl tExtension = new TExtensionImpl();
		return tExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtensions createTExtensions() {
		TExtensionsImpl tExtensions = new TExtensionsImpl();
		return tExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationArtifact createTImplementationArtifact() {
		TImplementationArtifactImpl tImplementationArtifact = new TImplementationArtifactImpl();
		return tImplementationArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationArtifacts createTImplementationArtifacts() {
		TImplementationArtifactsImpl tImplementationArtifacts = new TImplementationArtifactsImpl();
		return tImplementationArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImport createTImport() {
		TImportImpl tImport = new TImportImpl();
		return tImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface createTInterface() {
		TInterfaceImpl tInterface = new TInterfaceImpl();
		return tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTemplate createTNodeTemplate() {
		TNodeTemplateImpl tNodeTemplate = new TNodeTemplateImpl();
		return tNodeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeType createTNodeType() {
		TNodeTypeImpl tNodeType = new TNodeTypeImpl();
		return tNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTypeImplementation createTNodeTypeImplementation() {
		TNodeTypeImplementationImpl tNodeTypeImplementation = new TNodeTypeImplementationImpl();
		return tNodeTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOperation createTOperation() {
		TOperationImpl tOperation = new TOperationImpl();
		return tOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter createTParameter() {
		TParameterImpl tParameter = new TParameterImpl();
		return tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlan createTPlan() {
		TPlanImpl tPlan = new TPlanImpl();
		return tPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlans createTPlans() {
		TPlansImpl tPlans = new TPlansImpl();
		return tPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicy createTPolicy() {
		TPolicyImpl tPolicy = new TPolicyImpl();
		return tPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicyTemplate createTPolicyTemplate() {
		TPolicyTemplateImpl tPolicyTemplate = new TPolicyTemplateImpl();
		return tPolicyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicyType createTPolicyType() {
		TPolicyTypeImpl tPolicyType = new TPolicyTypeImpl();
		return tPolicyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyConstraint createTPropertyConstraint() {
		TPropertyConstraintImpl tPropertyConstraint = new TPropertyConstraintImpl();
		return tPropertyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyMapping createTPropertyMapping() {
		TPropertyMappingImpl tPropertyMapping = new TPropertyMappingImpl();
		return tPropertyMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTemplate createTRelationshipTemplate() {
		TRelationshipTemplateImpl tRelationshipTemplate = new TRelationshipTemplateImpl();
		return tRelationshipTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipType createTRelationshipType() {
		TRelationshipTypeImpl tRelationshipType = new TRelationshipTypeImpl();
		return tRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTypeImplementation createTRelationshipTypeImplementation() {
		TRelationshipTypeImplementationImpl tRelationshipTypeImplementation = new TRelationshipTypeImplementationImpl();
		return tRelationshipTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeature createTRequiredContainerFeature() {
		TRequiredContainerFeatureImpl tRequiredContainerFeature = new TRequiredContainerFeatureImpl();
		return tRequiredContainerFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeatures createTRequiredContainerFeatures() {
		TRequiredContainerFeaturesImpl tRequiredContainerFeatures = new TRequiredContainerFeaturesImpl();
		return tRequiredContainerFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirement createTRequirement() {
		TRequirementImpl tRequirement = new TRequirementImpl();
		return tRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementDefinition createTRequirementDefinition() {
		TRequirementDefinitionImpl tRequirementDefinition = new TRequirementDefinitionImpl();
		return tRequirementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementRef createTRequirementRef() {
		TRequirementRefImpl tRequirementRef = new TRequirementRefImpl();
		return tRequirementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementType createTRequirementType() {
		TRequirementTypeImpl tRequirementType = new TRequirementTypeImpl();
		return tRequirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceTemplate createTServiceTemplate() {
		TServiceTemplateImpl tServiceTemplate = new TServiceTemplateImpl();
		return tServiceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTag createTTag() {
		TTagImpl tTag = new TTagImpl();
		return tTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTags createTTags() {
		TTagsImpl tTags = new TTagsImpl();
		return tTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyElementInstanceStates createTTopologyElementInstanceStates() {
		TTopologyElementInstanceStatesImpl tTopologyElementInstanceStates = new TTopologyElementInstanceStatesImpl();
		return tTopologyElementInstanceStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyTemplate createTTopologyTemplate() {
		TTopologyTemplateImpl tTopologyTemplate = new TTopologyTemplateImpl();
		return tTopologyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType createTypesType() {
		TypesTypeImpl typesType = new TypesTypeImpl();
		return typesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidSourceType createValidSourceType() {
		ValidSourceTypeImpl validSourceType = new ValidSourceTypeImpl();
		return validSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidTargetType createValidTargetType() {
		ValidTargetTypeImpl validTargetType = new ValidTargetTypeImpl();
		return validTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testDdefinition createtestDdefinition() {
		testDdefinitionImpl testDdefinition = new testDdefinitionImpl();
		return testDdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAttribute createTAttribute() {
		TAttributeImpl tAttribute = new TAttributeImpl();
		return tAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType createAttributesType() {
		AttributesTypeImpl attributesType = new AttributesTypeImpl();
		return attributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInputTemplate createTInputTemplate() {
		TInputTemplateImpl tInputTemplate = new TInputTemplateImpl();
		return tInputTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOutputTemplate createTOutputTemplate() {
		TOutputTemplateImpl tOutputTemplate = new TOutputTemplateImpl();
		return tOutputTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimportTemplate createTimportTemplate() {
		TimportTemplateImpl timportTemplate = new TimportTemplateImpl();
		return timportTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInstancesTypeMember1 createMaxInstancesTypeMember1FromString(EDataType eDataType, String initialValue) {
		MaxInstancesTypeMember1 result = MaxInstancesTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean createTBooleanFromString(EDataType eDataType, String initialValue) {
		TBoolean result = TBoolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember1 createUpperBoundTypeMember1FromString(EDataType eDataType, String initialValue) {
		UpperBoundTypeMember1 result = UpperBoundTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember11 createUpperBoundTypeMember11FromString(EDataType eDataType, String initialValue) {
		UpperBoundTypeMember11 result = UpperBoundTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createImportedURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImportedURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMaxInstancesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createMaxInstancesTypeMember0FromString(_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMaxInstancesTypeMember1FromString(_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertMaxInstancesTypeMember0ToString(_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertMaxInstancesTypeMember1ToString(_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createMaxInstancesTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInstancesTypeMember1 createMaxInstancesTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMaxInstancesTypeMember1FromString(_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMaxInstancesTypeMember1ToString(_12Package.Literals.MAX_INSTANCES_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean createTBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createTBooleanFromString(_12Package.Literals.TBOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTBooleanToString(_12Package.Literals.TBOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUpperBoundTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createUpperBoundTypeMember0FromString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUpperBoundTypeMember1FromString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_12Package.Literals.UPPER_BOUND_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember0ToString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_12Package.Literals.UPPER_BOUND_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember1ToString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUpperBoundType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createUpperBoundTypeMember01FromString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER01, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUpperBoundTypeMember11FromString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER11, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_12Package.Literals.UPPER_BOUND_TYPE_MEMBER01.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember01ToString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER01, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_12Package.Literals.UPPER_BOUND_TYPE_MEMBER11.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember11ToString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER11, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUpperBoundTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUpperBoundTypeMember01FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember01ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember1 createUpperBoundTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createUpperBoundTypeMember1FromString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpperBoundTypeMember1ToString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember11 createUpperBoundTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createUpperBoundTypeMember11FromString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER11, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertUpperBoundTypeMember11ToString(_12Package.Literals.UPPER_BOUND_TYPE_MEMBER11, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _12Package get_12Package() {
		return (_12Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _12Package getPackage() {
		return _12Package.eINSTANCE;
	}

} //_12FactoryImpl
