/**
 */
package _12;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see _12._12Factory
 * @model kind="package"
 * @generated
 */
public interface _12Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_12";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/tosca/ns/2011/12";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_12";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_12Package eINSTANCE = _12.impl._12PackageImpl.init();

	/**
	 * The meta object id for the '{@link _12.impl.ArtifactReferencesTypeImpl <em>Artifact References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ArtifactReferencesTypeImpl
	 * @see _12.impl._12PackageImpl#getArtifactReferencesType()
	 * @generated
	 */
	int ARTIFACT_REFERENCES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Artifact Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Artifact References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artifact References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.CapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.CapabilitiesTypeImpl
	 * @see _12.impl._12PackageImpl#getCapabilitiesType()
	 * @generated
	 */
	int CAPABILITIES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.CapabilitiesType1Impl <em>Capabilities Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.CapabilitiesType1Impl
	 * @see _12.impl._12PackageImpl#getCapabilitiesType1()
	 * @generated
	 */
	int CAPABILITIES_TYPE1 = 2;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE1__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capabilities Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.CapabilityDefinitionsTypeImpl <em>Capability Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.CapabilityDefinitionsTypeImpl
	 * @see _12.impl._12PackageImpl#getCapabilityDefinitionsType()
	 * @generated
	 */
	int CAPABILITY_DEFINITIONS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Capability Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Capability Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ConstraintsTypeImpl
	 * @see _12.impl._12PackageImpl#getConstraintsType()
	 * @generated
	 */
	int CONSTRAINTS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.ConstraintsType1Impl <em>Constraints Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ConstraintsType1Impl
	 * @see _12.impl._12PackageImpl#getConstraintsType1()
	 * @generated
	 */
	int CONSTRAINTS_TYPE1 = 5;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE1__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TExtensibleElementsImpl <em>TExtensible Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TExtensibleElementsImpl
	 * @see _12.impl._12PackageImpl#getTExtensibleElements()
	 * @generated
	 */
	int TEXTENSIBLE_ELEMENTS = 64;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>TExtensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TExtensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TDefinitionsImpl
	 * @see _12.impl._12PackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXTENSIONS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__IMPORT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TYPES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__GROUP = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__SERVICE_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Node Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NODE_TYPE_IMPLEMENTATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__REQUIREMENT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__CAPABILITY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Artifact Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__POLICY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Policy Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__POLICY_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.DefinitionsTypeImpl
	 * @see _12.impl._12PackageImpl#getDefinitionsType()
	 * @generated
	 */
	int DEFINITIONS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__DOCUMENTATION = TDEFINITIONS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ANY = TDEFINITIONS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ANY_ATTRIBUTE = TDEFINITIONS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__EXTENSIONS = TDEFINITIONS__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__IMPORT = TDEFINITIONS__IMPORT;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__TYPES = TDEFINITIONS__TYPES;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__GROUP = TDEFINITIONS__GROUP;

	/**
	 * The feature id for the '<em><b>Service Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__SERVICE_TEMPLATE = TDEFINITIONS__SERVICE_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NODE_TYPE = TDEFINITIONS__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Node Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NODE_TYPE_IMPLEMENTATION = TDEFINITIONS__NODE_TYPE_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__RELATIONSHIP_TYPE = TDEFINITIONS__RELATIONSHIP_TYPE;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__RELATIONSHIP_TYPE_IMPLEMENTATION = TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__REQUIREMENT_TYPE = TDEFINITIONS__REQUIREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__CAPABILITY_TYPE = TDEFINITIONS__CAPABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ARTIFACT_TYPE = TDEFINITIONS__ARTIFACT_TYPE;

	/**
	 * The feature id for the '<em><b>Artifact Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ARTIFACT_TEMPLATE = TDEFINITIONS__ARTIFACT_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__POLICY_TYPE = TDEFINITIONS__POLICY_TYPE;

	/**
	 * The feature id for the '<em><b>Policy Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__POLICY_TEMPLATE = TDEFINITIONS__POLICY_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ID = TDEFINITIONS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NAME = TDEFINITIONS__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__TARGET_NAMESPACE = TDEFINITIONS__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_FEATURE_COUNT = TDEFINITIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_OPERATION_COUNT = TDEFINITIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.DerivedFromTypeImpl <em>Derived From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.DerivedFromTypeImpl
	 * @see _12.impl._12PackageImpl#getDerivedFromType()
	 * @generated
	 */
	int DERIVED_FROM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE__RELATIONSHIP_TYPE_IMPLEMENTATION_REF = 0;

	/**
	 * The number of structural features of the '<em>Derived From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Derived From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.DerivedFromType1Impl <em>Derived From Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.DerivedFromType1Impl
	 * @see _12.impl._12PackageImpl#getDerivedFromType1()
	 * @generated
	 */
	int DERIVED_FROM_TYPE1 = 8;

	/**
	 * The feature id for the '<em><b>Node Type Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE1__NODE_TYPE_IMPLEMENTATION_REF = 0;

	/**
	 * The number of structural features of the '<em>Derived From Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Derived From Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.DerivedFromType2Impl <em>Derived From Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.DerivedFromType2Impl
	 * @see _12.impl._12PackageImpl#getDerivedFromType2()
	 * @generated
	 */
	int DERIVED_FROM_TYPE2 = 9;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE2__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Derived From Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Derived From Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.DocumentRootImpl
	 * @see _12.impl._12PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ExcludeTypeImpl
	 * @see _12.impl._12PackageImpl#getExcludeType()
	 * @generated
	 */
	int EXCLUDE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ExtensionsTypeImpl
	 * @see _12.impl._12PackageImpl#getExtensionsType()
	 * @generated
	 */
	int EXTENSIONS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE__EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TImplementationArtifactImpl <em>TImplementation Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TImplementationArtifactImpl
	 * @see _12.impl._12PackageImpl#getTImplementationArtifact()
	 * @generated
	 */
	int TIMPLEMENTATION_ARTIFACT = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__OPERATION_NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TImplementation Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TImplementation Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.ImplementationArtifactTypeImpl <em>Implementation Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ImplementationArtifactTypeImpl
	 * @see _12.impl._12PackageImpl#getImplementationArtifactType()
	 * @generated
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__DOCUMENTATION = TIMPLEMENTATION_ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ANY = TIMPLEMENTATION_ARTIFACT__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ANY_ATTRIBUTE = TIMPLEMENTATION_ARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ARTIFACT_REF = TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ARTIFACT_TYPE = TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__INTERFACE_NAME = TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__OPERATION_NAME = TIMPLEMENTATION_ARTIFACT__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Implementation Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE_FEATURE_COUNT = TIMPLEMENTATION_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implementation Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE_OPERATION_COUNT = TIMPLEMENTATION_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.IncludeTypeImpl
	 * @see _12.impl._12PackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.InputParametersTypeImpl
	 * @see _12.impl._12PackageImpl#getInputParametersType()
	 * @generated
	 */
	int INPUT_PARAMETERS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE__INPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Input Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.InputParametersType1Impl <em>Input Parameters Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.InputParametersType1Impl
	 * @see _12.impl._12PackageImpl#getInputParametersType1()
	 * @generated
	 */
	int INPUT_PARAMETERS_TYPE1 = 16;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Input Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.InstanceStateTypeImpl <em>Instance State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.InstanceStateTypeImpl
	 * @see _12.impl._12PackageImpl#getInstanceStateType()
	 * @generated
	 */
	int INSTANCE_STATE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE__STATE = 0;

	/**
	 * The number of structural features of the '<em>Instance State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.InterfacesTypeImpl <em>Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.InterfacesTypeImpl
	 * @see _12.impl._12PackageImpl#getInterfacesType()
	 * @generated
	 */
	int INTERFACES_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.InterfacesType1Impl <em>Interfaces Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.InterfacesType1Impl
	 * @see _12.impl._12PackageImpl#getInterfacesType1()
	 * @generated
	 */
	int INTERFACES_TYPE1 = 19;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE1__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.NodeOperationTypeImpl <em>Node Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.NodeOperationTypeImpl
	 * @see _12.impl._12PackageImpl#getNodeOperationType()
	 * @generated
	 */
	int NODE_OPERATION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Node Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__NODE_REF = 1;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__OPERATION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Node Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.NodeTypeReferenceTypeImpl <em>Node Type Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.NodeTypeReferenceTypeImpl
	 * @see _12.impl._12PackageImpl#getNodeTypeReferenceType()
	 * @generated
	 */
	int NODE_TYPE_REFERENCE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Node Type Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Type Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.OutputParametersTypeImpl <em>Output Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.OutputParametersTypeImpl
	 * @see _12.impl._12PackageImpl#getOutputParametersType()
	 * @generated
	 */
	int OUTPUT_PARAMETERS_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Output Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Output Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.OutputParametersType1Impl <em>Output Parameters Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.OutputParametersType1Impl
	 * @see _12.impl._12PackageImpl#getOutputParametersType1()
	 * @generated
	 */
	int OUTPUT_PARAMETERS_TYPE1 = 23;

	/**
	 * The feature id for the '<em><b>Output Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE1__OUTPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Output Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PlanModelReferenceTypeImpl <em>Plan Model Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PlanModelReferenceTypeImpl
	 * @see _12.impl._12PackageImpl#getPlanModelReferenceType()
	 * @generated
	 */
	int PLAN_MODEL_REFERENCE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Plan Model Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Model Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PlanModelTypeImpl <em>Plan Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PlanModelTypeImpl
	 * @see _12.impl._12PackageImpl#getPlanModelType()
	 * @generated
	 */
	int PLAN_MODEL_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Plan Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PlanTypeImpl <em>Plan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PlanTypeImpl
	 * @see _12.impl._12PackageImpl#getPlanType()
	 * @generated
	 */
	int PLAN_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Plan Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE__PLAN_REF = 0;

	/**
	 * The number of structural features of the '<em>Plan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PoliciesTypeImpl <em>Policies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PoliciesTypeImpl
	 * @see _12.impl._12PackageImpl#getPoliciesType()
	 * @generated
	 */
	int POLICIES_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE__POLICY = 0;

	/**
	 * The number of structural features of the '<em>Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PoliciesType1Impl <em>Policies Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PoliciesType1Impl
	 * @see _12.impl._12PackageImpl#getPoliciesType1()
	 * @generated
	 */
	int POLICIES_TYPE1 = 28;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE1__POLICY = 0;

	/**
	 * The number of structural features of the '<em>Policies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PropertiesDefinitionTypeImpl <em>Properties Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PropertiesDefinitionTypeImpl
	 * @see _12.impl._12PackageImpl#getPropertiesDefinitionType()
	 * @generated
	 */
	int PROPERTIES_DEFINITION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Has Som Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Properties Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Properties Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPropertyImpl <em>TProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPropertyImpl
	 * @see _12.impl._12PackageImpl#getTProperty()
	 * @generated
	 */
	int TPROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__DEFAULT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PropertiesType1Impl <em>Properties Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PropertiesType1Impl
	 * @see _12.impl._12PackageImpl#getPropertiesType1()
	 * @generated
	 */
	int PROPERTIES_TYPE1 = 31;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1__ANY = 0;

	/**
	 * The feature id for the '<em><b>Property Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1__PROPERTY_MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>Properties Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Properties Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PropertyConstraintsTypeImpl <em>Property Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PropertyConstraintsTypeImpl
	 * @see _12.impl._12PackageImpl#getPropertyConstraintsType()
	 * @generated
	 */
	int PROPERTY_CONSTRAINTS_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Property Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Property Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PropertyConstraintsType1Impl <em>Property Constraints Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PropertyConstraintsType1Impl
	 * @see _12.impl._12PackageImpl#getPropertyConstraintsType1()
	 * @generated
	 */
	int PROPERTY_CONSTRAINTS_TYPE1 = 33;

	/**
	 * The feature id for the '<em><b>Property Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Property Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PropertyMappingsTypeImpl <em>Property Mappings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PropertyMappingsTypeImpl
	 * @see _12.impl._12PackageImpl#getPropertyMappingsType()
	 * @generated
	 */
	int PROPERTY_MAPPINGS_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Property Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Property Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.RelationshipConstraintsTypeImpl <em>Relationship Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.RelationshipConstraintsTypeImpl
	 * @see _12.impl._12PackageImpl#getRelationshipConstraintsType()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Relationship Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Relationship Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationship Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.RelationshipConstraintTypeImpl <em>Relationship Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.RelationshipConstraintTypeImpl
	 * @see _12.impl._12PackageImpl#getRelationshipConstraintType()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Relationship Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relationship Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.RelationshipOperationTypeImpl <em>Relationship Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.RelationshipOperationTypeImpl
	 * @see _12.impl._12PackageImpl#getRelationshipOperationType()
	 * @generated
	 */
	int RELATIONSHIP_OPERATION_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Relationship Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF = 2;

	/**
	 * The number of structural features of the '<em>Relationship Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.RequirementDefinitionsTypeImpl <em>Requirement Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.RequirementDefinitionsTypeImpl
	 * @see _12.impl._12PackageImpl#getRequirementDefinitionsType()
	 * @generated
	 */
	int REQUIREMENT_DEFINITIONS_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Requirement Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Requirement Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.RequirementsTypeImpl <em>Requirements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.RequirementsTypeImpl
	 * @see _12.impl._12PackageImpl#getRequirementsType()
	 * @generated
	 */
	int REQUIREMENTS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.RequirementsType1Impl <em>Requirements Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.RequirementsType1Impl
	 * @see _12.impl._12PackageImpl#getRequirementsType1()
	 * @generated
	 */
	int REQUIREMENTS_TYPE1 = 40;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.SourceElementTypeImpl <em>Source Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.SourceElementTypeImpl
	 * @see _12.impl._12PackageImpl#getSourceElementType()
	 * @generated
	 */
	int SOURCE_ELEMENT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Source Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.SourceInterfacesTypeImpl <em>Source Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.SourceInterfacesTypeImpl
	 * @see _12.impl._12PackageImpl#getSourceInterfacesType()
	 * @generated
	 */
	int SOURCE_INTERFACES_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Source Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TAppliesToImpl <em>TApplies To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TAppliesToImpl
	 * @see _12.impl._12PackageImpl#getTAppliesTo()
	 * @generated
	 */
	int TAPPLIES_TO = 43;

	/**
	 * The feature id for the '<em><b>Node Type Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO__NODE_TYPE_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>TApplies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TApplies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TargetElementTypeImpl <em>Target Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TargetElementTypeImpl
	 * @see _12.impl._12PackageImpl#getTargetElementType()
	 * @generated
	 */
	int TARGET_ELEMENT_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Target Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TargetInterfacesTypeImpl <em>Target Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TargetInterfacesTypeImpl
	 * @see _12.impl._12PackageImpl#getTargetInterfacesType()
	 * @generated
	 */
	int TARGET_INTERFACES_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Target Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TArtifactReferenceImpl <em>TArtifact Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TArtifactReferenceImpl
	 * @see _12.impl._12PackageImpl#getTArtifactReference()
	 * @generated
	 */
	int TARTIFACT_REFERENCE = 46;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__INCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__EXCLUDE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>TArtifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TArtifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TEntityTemplateImpl <em>TEntity Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TEntityTemplateImpl
	 * @see _12.impl._12PackageImpl#getTEntityTemplate()
	 * @generated
	 */
	int TENTITY_TEMPLATE = 60;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__PROPERTIES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ATTRIBUTES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__NODE_HAS_INTERFACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__NODE_HAS_RELATIONS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TEntity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TEntity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TArtifactTemplateImpl <em>TArtifact Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TArtifactTemplateImpl
	 * @see _12.impl._12PackageImpl#getTArtifactTemplate()
	 * @generated
	 */
	int TARTIFACT_TEMPLATE = 47;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ATTRIBUTES = TENTITY_TEMPLATE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__NODE_HAS_INTERFACE = TENTITY_TEMPLATE__NODE_HAS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__NODE_HAS_RELATIONS = TENTITY_TEMPLATE__NODE_HAS_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TArtifact Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TArtifact Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TEntityTypeImpl <em>TEntity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TEntityTypeImpl
	 * @see _12.impl._12PackageImpl#getTEntityType()
	 * @generated
	 */
	int TENTITY_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__PROPERTIES_DEFINITION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TArtifactTypeImpl <em>TArtifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TArtifactTypeImpl
	 * @see _12.impl._12PackageImpl#getTArtifactType()
	 * @generated
	 */
	int TARTIFACT_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__META_TYPE = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TArtifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TArtifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TBoundaryDefinitionsImpl <em>TBoundary Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TBoundaryDefinitionsImpl
	 * @see _12.impl._12PackageImpl#getTBoundaryDefinitions()
	 * @generated
	 */
	int TBOUNDARY_DEFINITIONS = 49;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__REQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__CAPABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__POLICIES = 4;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__INTERFACES = 5;

	/**
	 * The number of structural features of the '<em>TBoundary Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TBoundary Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TCapabilityImpl <em>TCapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TCapabilityImpl
	 * @see _12.impl._12PackageImpl#getTCapability()
	 * @generated
	 */
	int TCAPABILITY = 50;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ATTRIBUTES = TENTITY_TEMPLATE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__NODE_HAS_INTERFACE = TENTITY_TEMPLATE__NODE_HAS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__NODE_HAS_RELATIONS = TENTITY_TEMPLATE__NODE_HAS_RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TCapabilityDefinitionImpl <em>TCapability Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TCapabilityDefinitionImpl
	 * @see _12.impl._12PackageImpl#getTCapabilityDefinition()
	 * @generated
	 */
	int TCAPABILITY_DEFINITION = 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__CAPABILITY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__LOWER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__UPPER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TCapability Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TCapability Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TCapabilityRefImpl <em>TCapability Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TCapabilityRefImpl
	 * @see _12.impl._12PackageImpl#getTCapabilityRef()
	 * @generated
	 */
	int TCAPABILITY_REF = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF__REF = 1;

	/**
	 * The number of structural features of the '<em>TCapability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCapability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TCapabilityTypeImpl <em>TCapability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TCapabilityTypeImpl
	 * @see _12.impl._12PackageImpl#getTCapabilityType()
	 * @generated
	 */
	int TCAPABILITY_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>TCapability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCapability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TConditionImpl <em>TCondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TConditionImpl
	 * @see _12.impl._12PackageImpl#getTCondition()
	 * @generated
	 */
	int TCONDITION = 54;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__ANY = 0;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__EXPRESSION_LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TConstraintImpl <em>TConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TConstraintImpl
	 * @see _12.impl._12PackageImpl#getTConstraint()
	 * @generated
	 */
	int TCONSTRAINT = 55;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT__ANY = 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT__CONSTRAINT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>TConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TDeploymentArtifactImpl <em>TDeployment Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TDeploymentArtifactImpl
	 * @see _12.impl._12PackageImpl#getTDeploymentArtifact()
	 * @generated
	 */
	int TDEPLOYMENT_ARTIFACT = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ARTIFACT_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TDeployment Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TDeployment Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TDeploymentArtifactsImpl <em>TDeployment Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TDeploymentArtifactsImpl
	 * @see _12.impl._12PackageImpl#getTDeploymentArtifacts()
	 * @generated
	 */
	int TDEPLOYMENT_ARTIFACTS = 58;

	/**
	 * The feature id for the '<em><b>Deployment Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>TDeployment Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDeployment Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TDocumentationImpl
	 * @see _12.impl._12PackageImpl#getTDocumentation()
	 * @generated
	 */
	int TDOCUMENTATION = 59;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__LANG = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TExportedInterfaceImpl <em>TExported Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TExportedInterfaceImpl
	 * @see _12.impl._12PackageImpl#getTExportedInterface()
	 * @generated
	 */
	int TEXPORTED_INTERFACE = 62;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TExportedOperationImpl <em>TExported Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TExportedOperationImpl
	 * @see _12.impl._12PackageImpl#getTExportedOperation()
	 * @generated
	 */
	int TEXPORTED_OPERATION = 63;

	/**
	 * The feature id for the '<em><b>Node Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__NODE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Relationship Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__RELATIONSHIP_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__PLAN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>TExported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TExported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TExtensionImpl <em>TExtension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TExtensionImpl
	 * @see _12.impl._12PackageImpl#getTExtension()
	 * @generated
	 */
	int TEXTENSION = 65;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__MUST_UNDERSTAND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TExtensionsImpl <em>TExtensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TExtensionsImpl
	 * @see _12.impl._12PackageImpl#getTExtensions()
	 * @generated
	 */
	int TEXTENSIONS = 66;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__EXTENSION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExtensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExtensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TImplementationArtifactsImpl <em>TImplementation Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TImplementationArtifactsImpl
	 * @see _12.impl._12PackageImpl#getTImplementationArtifacts()
	 * @generated
	 */
	int TIMPLEMENTATION_ARTIFACTS = 68;

	/**
	 * The feature id for the '<em><b>Implementation Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>TImplementation Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TImplementation Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TImportImpl <em>TImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TImportImpl
	 * @see _12.impl._12PackageImpl#getTImport()
	 * @generated
	 */
	int TIMPORT = 69;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__IMPORT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__LOCATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TInterfaceImpl <em>TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TInterfaceImpl
	 * @see _12.impl._12PackageImpl#getTInterface()
	 * @generated
	 */
	int TINTERFACE = 70;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TNodeTemplateImpl <em>TNode Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TNodeTemplateImpl
	 * @see _12.impl._12PackageImpl#getTNodeTemplate()
	 * @generated
	 */
	int TNODE_TEMPLATE = 71;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ATTRIBUTES = TENTITY_TEMPLATE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__NODE_HAS_INTERFACE = TENTITY_TEMPLATE__NODE_HAS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__NODE_HAS_RELATIONS = TENTITY_TEMPLATE__NODE_HAS_RELATIONS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__REQUIREMENTS = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__CAPABILITIES = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__POLICIES = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS = TENTITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__MAX_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__MIN_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TNode Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TNode Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TNodeTypeImpl <em>TNode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TNodeTypeImpl
	 * @see _12.impl._12PackageImpl#getTNodeType()
	 * @generated
	 */
	int TNODE_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Requirement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__REQUIREMENT_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__CAPABILITY_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__INSTANCE_STATES = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TNode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TNode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TNodeTypeImplementationImpl <em>TNode Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TNodeTypeImplementationImpl
	 * @see _12.impl._12PackageImpl#getTNodeTypeImplementation()
	 * @generated
	 */
	int TNODE_TYPE_IMPLEMENTATION = 73;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>TNode Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>TNode Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TOperationImpl <em>TOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TOperationImpl
	 * @see _12.impl._12PackageImpl#getTOperation()
	 * @generated
	 */
	int TOPERATION = 74;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__INPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__OUTPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TParameterImpl <em>TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TParameterImpl
	 * @see _12.impl._12PackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPlanImpl <em>TPlan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPlanImpl
	 * @see _12.impl._12PackageImpl#getTPlan()
	 * @generated
	 */
	int TPLAN = 76;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PRECONDITION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__INPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__OUTPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plan Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_MODEL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Plan Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_MODEL_REFERENCE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plan Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_LANGUAGE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Plan Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPlansImpl <em>TPlans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPlansImpl
	 * @see _12.impl._12PackageImpl#getTPlans()
	 * @generated
	 */
	int TPLANS = 77;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS__PLAN = 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS__TARGET_NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>TPlans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TPlans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPolicyImpl <em>TPolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPolicyImpl
	 * @see _12.impl._12PackageImpl#getTPolicy()
	 * @generated
	 */
	int TPOLICY = 78;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__POLICY_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__POLICY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPolicyTemplateImpl <em>TPolicy Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPolicyTemplateImpl
	 * @see _12.impl._12PackageImpl#getTPolicyTemplate()
	 * @generated
	 */
	int TPOLICY_TEMPLATE = 79;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ATTRIBUTES = TENTITY_TEMPLATE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__NODE_HAS_INTERFACE = TENTITY_TEMPLATE__NODE_HAS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__NODE_HAS_RELATIONS = TENTITY_TEMPLATE__NODE_HAS_RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TPolicy Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TPolicy Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPolicyTypeImpl <em>TPolicy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPolicyTypeImpl
	 * @see _12.impl._12PackageImpl#getTPolicyType()
	 * @generated
	 */
	int TPOLICY_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__APPLIES_TO = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__POLICY_LANGUAGE = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPolicy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPolicy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPropertyConstraintImpl <em>TProperty Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPropertyConstraintImpl
	 * @see _12.impl._12PackageImpl#getTPropertyConstraint()
	 * @generated
	 */
	int TPROPERTY_CONSTRAINT = 81;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__ANY = TCONSTRAINT__ANY;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__CONSTRAINT_TYPE = TCONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__PROPERTY = TCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TProperty Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT_FEATURE_COUNT = TCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TProperty Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT_OPERATION_COUNT = TCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TPropertyMappingImpl <em>TProperty Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TPropertyMappingImpl
	 * @see _12.impl._12PackageImpl#getTPropertyMapping()
	 * @generated
	 */
	int TPROPERTY_MAPPING = 82;

	/**
	 * The feature id for the '<em><b>Service Template Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF = 0;

	/**
	 * The feature id for the '<em><b>Target Object Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__TARGET_OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Target Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__TARGET_PROPERTY_REF = 2;

	/**
	 * The number of structural features of the '<em>TProperty Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TProperty Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRelationshipTemplateImpl <em>TRelationship Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRelationshipTemplateImpl
	 * @see _12.impl._12PackageImpl#getTRelationshipTemplate()
	 * @generated
	 */
	int TRELATIONSHIP_TEMPLATE = 83;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ATTRIBUTES = TENTITY_TEMPLATE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__NODE_HAS_INTERFACE = TENTITY_TEMPLATE__NODE_HAS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__NODE_HAS_RELATIONS = TENTITY_TEMPLATE__NODE_HAS_RELATIONS;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uses Relation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__USES_RELATION_TYPE = TENTITY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TRelationship Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TRelationship Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRelationshipTypeImpl <em>TRelationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRelationshipTypeImpl
	 * @see _12.impl._12PackageImpl#getTRelationshipType()
	 * @generated
	 */
	int TRELATIONSHIP_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__INSTANCE_STATES = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__SOURCE_INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TARGET_INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__VALID_SOURCE = TENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__VALID_TARGET = TENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TRelationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TRelationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRelationshipTypeImplementationImpl <em>TRelationship Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRelationshipTypeImplementationImpl
	 * @see _12.impl._12PackageImpl#getTRelationshipTypeImplementation()
	 * @generated
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION = 85;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TRelationship Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TRelationship Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRequiredContainerFeatureImpl <em>TRequired Container Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRequiredContainerFeatureImpl
	 * @see _12.impl._12PackageImpl#getTRequiredContainerFeature()
	 * @generated
	 */
	int TREQUIRED_CONTAINER_FEATURE = 86;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>TRequired Container Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRequired Container Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRequiredContainerFeaturesImpl <em>TRequired Container Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRequiredContainerFeaturesImpl
	 * @see _12.impl._12PackageImpl#getTRequiredContainerFeatures()
	 * @generated
	 */
	int TREQUIRED_CONTAINER_FEATURES = 87;

	/**
	 * The feature id for the '<em><b>Required Container Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>TRequired Container Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRequired Container Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRequirementImpl <em>TRequirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRequirementImpl
	 * @see _12.impl._12PackageImpl#getTRequirement()
	 * @generated
	 */
	int TREQUIREMENT = 88;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ATTRIBUTES = TENTITY_TEMPLATE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__NODE_HAS_INTERFACE = TENTITY_TEMPLATE__NODE_HAS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__NODE_HAS_RELATIONS = TENTITY_TEMPLATE__NODE_HAS_RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRequirementDefinitionImpl <em>TRequirement Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRequirementDefinitionImpl
	 * @see _12.impl._12PackageImpl#getTRequirementDefinition()
	 * @generated
	 */
	int TREQUIREMENT_DEFINITION = 89;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__LOWER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__UPPER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TRequirement Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TRequirement Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRequirementRefImpl <em>TRequirement Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRequirementRefImpl
	 * @see _12.impl._12PackageImpl#getTRequirementRef()
	 * @generated
	 */
	int TREQUIREMENT_REF = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF__REF = 1;

	/**
	 * The number of structural features of the '<em>TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TRequirementTypeImpl <em>TRequirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TRequirementTypeImpl
	 * @see _12.impl._12PackageImpl#getTRequirementType()
	 * @generated
	 */
	int TREQUIREMENT_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Required Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRequirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRequirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TServiceTemplateImpl <em>TService Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TServiceTemplateImpl
	 * @see _12.impl._12PackageImpl#getTServiceTemplate()
	 * @generated
	 */
	int TSERVICE_TEMPLATE = 92;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topology Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__PLANS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Substitutable Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Node Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__HAS_NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Has Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__HAS_RELATIONSHIP = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Has Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__HAS_IMPORTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>TService Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>TService Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TTagImpl <em>TTag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TTagImpl
	 * @see _12.impl._12PackageImpl#getTTag()
	 * @generated
	 */
	int TTAG = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>TTag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TTag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TTagsImpl <em>TTags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TTagsImpl
	 * @see _12.impl._12PackageImpl#getTTags()
	 * @generated
	 */
	int TTAGS = 94;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS__TAG = 0;

	/**
	 * The number of structural features of the '<em>TTags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TTags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TTopologyElementInstanceStatesImpl <em>TTopology Element Instance States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TTopologyElementInstanceStatesImpl
	 * @see _12.impl._12PackageImpl#getTTopologyElementInstanceStates()
	 * @generated
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES = 95;

	/**
	 * The feature id for the '<em><b>Instance State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE = 0;

	/**
	 * The number of structural features of the '<em>TTopology Element Instance States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TTopology Element Instance States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TTopologyTemplateImpl <em>TTopology Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TTopologyTemplateImpl
	 * @see _12.impl._12PackageImpl#getTTopologyTemplate()
	 * @generated
	 */
	int TTOPOLOGY_TEMPLATE = 96;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__GROUP = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__NODE_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__HAS_INPUTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hasout Puts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__HASOUT_PUTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TTopology Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TTopology Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link _12.impl.TypesTypeImpl <em>Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TypesTypeImpl
	 * @see _12.impl._12PackageImpl#getTypesType()
	 * @generated
	 */
	int TYPES_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.ValidSourceTypeImpl <em>Valid Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ValidSourceTypeImpl
	 * @see _12.impl._12PackageImpl#getValidSourceType()
	 * @generated
	 */
	int VALID_SOURCE_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Valid Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Valid Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.ValidTargetTypeImpl <em>Valid Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.ValidTargetTypeImpl
	 * @see _12.impl._12PackageImpl#getValidTargetType()
	 * @generated
	 */
	int VALID_TARGET_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Valid Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Valid Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.testDdefinitionImpl <em>test Ddefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.testDdefinitionImpl
	 * @see _12.impl._12PackageImpl#gettestDdefinition()
	 * @generated
	 */
	int TEST_DDEFINITION = 100;

	/**
	 * The feature id for the '<em><b>Testrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DDEFINITION__TESTRELATION = 0;

	/**
	 * The number of structural features of the '<em>test Ddefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DDEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>test Ddefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DDEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TAttributeImpl <em>TAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TAttributeImpl
	 * @see _12.impl._12PackageImpl#getTAttribute()
	 * @generated
	 */
	int TATTRIBUTE = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>TAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.AttributesTypeImpl
	 * @see _12.impl._12PackageImpl#getAttributesType()
	 * @generated
	 */
	int ATTRIBUTES_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.PropertiesTypeImpl
	 * @see _12.impl._12PackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TInputTemplateImpl <em>TInput Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TInputTemplateImpl
	 * @see _12.impl._12PackageImpl#getTInputTemplate()
	 * @generated
	 */
	int TINPUT_TEMPLATE = 104;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_TEMPLATE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_TEMPLATE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>TInput Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TInput Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TOutputTemplateImpl <em>TOutput Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TOutputTemplateImpl
	 * @see _12.impl._12PackageImpl#getTOutputTemplate()
	 * @generated
	 */
	int TOUTPUT_TEMPLATE = 105;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_TEMPLATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>TOutput Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TOutput Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.impl.TimportTemplateImpl <em>Timport Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.impl.TimportTemplateImpl
	 * @see _12.impl._12PackageImpl#getTimportTemplate()
	 * @generated
	 */
	int TIMPORT_TEMPLATE = 106;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_TEMPLATE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Timport Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timport Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link _12.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.MaxInstancesTypeMember1
	 * @see _12.impl._12PackageImpl#getMaxInstancesTypeMember1()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER1 = 107;

	/**
	 * The meta object id for the '{@link _12.TBoolean <em>TBoolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.TBoolean
	 * @see _12.impl._12PackageImpl#getTBoolean()
	 * @generated
	 */
	int TBOOLEAN = 108;

	/**
	 * The meta object id for the '{@link _12.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.UpperBoundTypeMember1
	 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1 = 109;

	/**
	 * The meta object id for the '{@link _12.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.UpperBoundTypeMember11
	 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember11()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER11 = 110;

	/**
	 * The meta object id for the '<em>Imported URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see _12.impl._12PackageImpl#getImportedURI()
	 * @generated
	 */
	int IMPORTED_URI = 111;

	/**
	 * The meta object id for the '<em>Max Instances Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see _12.impl._12PackageImpl#getMaxInstancesType()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE = 112;

	/**
	 * The meta object id for the '<em>Max Instances Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see _12.impl._12PackageImpl#getMaxInstancesTypeMember0()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER0 = 113;

	/**
	 * The meta object id for the '<em>Max Instances Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.MaxInstancesTypeMember1
	 * @see _12.impl._12PackageImpl#getMaxInstancesTypeMember1Object()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER1_OBJECT = 114;

	/**
	 * The meta object id for the '<em>TBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.TBoolean
	 * @see _12.impl._12PackageImpl#getTBooleanObject()
	 * @generated
	 */
	int TBOOLEAN_OBJECT = 115;

	/**
	 * The meta object id for the '<em>Upper Bound Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see _12.impl._12PackageImpl#getUpperBoundType()
	 * @generated
	 */
	int UPPER_BOUND_TYPE = 116;

	/**
	 * The meta object id for the '<em>Upper Bound Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see _12.impl._12PackageImpl#getUpperBoundType1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE1 = 117;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember0()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER0 = 118;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member01</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember01()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER01 = 119;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.UpperBoundTypeMember1
	 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember1Object()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member1 Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see _12.UpperBoundTypeMember11
	 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember1Object1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1_OBJECT1 = 121;


	/**
	 * Returns the meta object for class '{@link _12.ArtifactReferencesType <em>Artifact References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact References Type</em>'.
	 * @see _12.ArtifactReferencesType
	 * @generated
	 */
	EClass getArtifactReferencesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.ArtifactReferencesType#getArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Reference</em>'.
	 * @see _12.ArtifactReferencesType#getArtifactReference()
	 * @see #getArtifactReferencesType()
	 * @generated
	 */
	EReference getArtifactReferencesType_ArtifactReference();

	/**
	 * Returns the meta object for class '{@link _12.CapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type</em>'.
	 * @see _12.CapabilitiesType
	 * @generated
	 */
	EClass getCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.CapabilitiesType#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see _12.CapabilitiesType#getCapability()
	 * @see #getCapabilitiesType()
	 * @generated
	 */
	EReference getCapabilitiesType_Capability();

	/**
	 * Returns the meta object for class '{@link _12.CapabilitiesType1 <em>Capabilities Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type1</em>'.
	 * @see _12.CapabilitiesType1
	 * @generated
	 */
	EClass getCapabilitiesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.CapabilitiesType1#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see _12.CapabilitiesType1#getCapability()
	 * @see #getCapabilitiesType1()
	 * @generated
	 */
	EReference getCapabilitiesType1_Capability();

	/**
	 * Returns the meta object for class '{@link _12.CapabilityDefinitionsType <em>Capability Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Definitions Type</em>'.
	 * @see _12.CapabilityDefinitionsType
	 * @generated
	 */
	EClass getCapabilityDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.CapabilityDefinitionsType#getCapabilityDefinition <em>Capability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Definition</em>'.
	 * @see _12.CapabilityDefinitionsType#getCapabilityDefinition()
	 * @see #getCapabilityDefinitionsType()
	 * @generated
	 */
	EReference getCapabilityDefinitionsType_CapabilityDefinition();

	/**
	 * Returns the meta object for class '{@link _12.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type</em>'.
	 * @see _12.ConstraintsType
	 * @generated
	 */
	EClass getConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.ConstraintsType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see _12.ConstraintsType#getConstraint()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EReference getConstraintsType_Constraint();

	/**
	 * Returns the meta object for class '{@link _12.ConstraintsType1 <em>Constraints Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type1</em>'.
	 * @see _12.ConstraintsType1
	 * @generated
	 */
	EClass getConstraintsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.ConstraintsType1#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see _12.ConstraintsType1#getConstraint()
	 * @see #getConstraintsType1()
	 * @generated
	 */
	EReference getConstraintsType1_Constraint();

	/**
	 * Returns the meta object for class '{@link _12.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions Type</em>'.
	 * @see _12.DefinitionsType
	 * @generated
	 */
	EClass getDefinitionsType();

	/**
	 * Returns the meta object for class '{@link _12.DerivedFromType <em>Derived From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Type</em>'.
	 * @see _12.DerivedFromType
	 * @generated
	 */
	EClass getDerivedFromType();

	/**
	 * Returns the meta object for the attribute '{@link _12.DerivedFromType#getRelationshipTypeImplementationRef <em>Relationship Type Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type Implementation Ref</em>'.
	 * @see _12.DerivedFromType#getRelationshipTypeImplementationRef()
	 * @see #getDerivedFromType()
	 * @generated
	 */
	EAttribute getDerivedFromType_RelationshipTypeImplementationRef();

	/**
	 * Returns the meta object for class '{@link _12.DerivedFromType1 <em>Derived From Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Type1</em>'.
	 * @see _12.DerivedFromType1
	 * @generated
	 */
	EClass getDerivedFromType1();

	/**
	 * Returns the meta object for the attribute '{@link _12.DerivedFromType1#getNodeTypeImplementationRef <em>Node Type Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type Implementation Ref</em>'.
	 * @see _12.DerivedFromType1#getNodeTypeImplementationRef()
	 * @see #getDerivedFromType1()
	 * @generated
	 */
	EAttribute getDerivedFromType1_NodeTypeImplementationRef();

	/**
	 * Returns the meta object for class '{@link _12.DerivedFromType2 <em>Derived From Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Type2</em>'.
	 * @see _12.DerivedFromType2
	 * @generated
	 */
	EClass getDerivedFromType2();

	/**
	 * Returns the meta object for the attribute '{@link _12.DerivedFromType2#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see _12.DerivedFromType2#getTypeRef()
	 * @see #getDerivedFromType2()
	 * @generated
	 */
	EAttribute getDerivedFromType2_TypeRef();

	/**
	 * Returns the meta object for class '{@link _12.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see _12.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link _12.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see _12.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link _12.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see _12.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link _12.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see _12.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link _12.DocumentRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see _12.DocumentRoot#getDefinitions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link _12.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see _12.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for class '{@link _12.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Type</em>'.
	 * @see _12.ExcludeType
	 * @generated
	 */
	EClass getExcludeType();

	/**
	 * Returns the meta object for the attribute '{@link _12.ExcludeType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see _12.ExcludeType#getPattern()
	 * @see #getExcludeType()
	 * @generated
	 */
	EAttribute getExcludeType_Pattern();

	/**
	 * Returns the meta object for class '{@link _12.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions Type</em>'.
	 * @see _12.ExtensionsType
	 * @generated
	 */
	EClass getExtensionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.ExtensionsType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see _12.ExtensionsType#getExtension()
	 * @see #getExtensionsType()
	 * @generated
	 */
	EReference getExtensionsType_Extension();

	/**
	 * Returns the meta object for class '{@link _12.ImplementationArtifactType <em>Implementation Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Artifact Type</em>'.
	 * @see _12.ImplementationArtifactType
	 * @generated
	 */
	EClass getImplementationArtifactType();

	/**
	 * Returns the meta object for class '{@link _12.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see _12.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link _12.IncludeType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see _12.IncludeType#getPattern()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Pattern();

	/**
	 * Returns the meta object for class '{@link _12.InputParametersType <em>Input Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameters Type</em>'.
	 * @see _12.InputParametersType
	 * @generated
	 */
	EClass getInputParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.InputParametersType#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter</em>'.
	 * @see _12.InputParametersType#getInputParameter()
	 * @see #getInputParametersType()
	 * @generated
	 */
	EReference getInputParametersType_InputParameter();

	/**
	 * Returns the meta object for class '{@link _12.InputParametersType1 <em>Input Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameters Type1</em>'.
	 * @see _12.InputParametersType1
	 * @generated
	 */
	EClass getInputParametersType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.InputParametersType1#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter</em>'.
	 * @see _12.InputParametersType1#getInputParameter()
	 * @see #getInputParametersType1()
	 * @generated
	 */
	EReference getInputParametersType1_InputParameter();

	/**
	 * Returns the meta object for class '{@link _12.InstanceStateType <em>Instance State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance State Type</em>'.
	 * @see _12.InstanceStateType
	 * @generated
	 */
	EClass getInstanceStateType();

	/**
	 * Returns the meta object for the attribute '{@link _12.InstanceStateType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see _12.InstanceStateType#getState()
	 * @see #getInstanceStateType()
	 * @generated
	 */
	EAttribute getInstanceStateType_State();

	/**
	 * Returns the meta object for class '{@link _12.InterfacesType <em>Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Type</em>'.
	 * @see _12.InterfacesType
	 * @generated
	 */
	EClass getInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.InterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see _12.InterfacesType#getInterface()
	 * @see #getInterfacesType()
	 * @generated
	 */
	EReference getInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link _12.InterfacesType1 <em>Interfaces Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Type1</em>'.
	 * @see _12.InterfacesType1
	 * @generated
	 */
	EClass getInterfacesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.InterfacesType1#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see _12.InterfacesType1#getInterface()
	 * @see #getInterfacesType1()
	 * @generated
	 */
	EReference getInterfacesType1_Interface();

	/**
	 * Returns the meta object for class '{@link _12.NodeOperationType <em>Node Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Operation Type</em>'.
	 * @see _12.NodeOperationType
	 * @generated
	 */
	EClass getNodeOperationType();

	/**
	 * Returns the meta object for the attribute '{@link _12.NodeOperationType#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see _12.NodeOperationType#getInterfaceName()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link _12.NodeOperationType#getNodeRef <em>Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Ref</em>'.
	 * @see _12.NodeOperationType#getNodeRef()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_NodeRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.NodeOperationType#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see _12.NodeOperationType#getOperationName()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_OperationName();

	/**
	 * Returns the meta object for class '{@link _12.NodeTypeReferenceType <em>Node Type Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type Reference Type</em>'.
	 * @see _12.NodeTypeReferenceType
	 * @generated
	 */
	EClass getNodeTypeReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link _12.NodeTypeReferenceType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see _12.NodeTypeReferenceType#getTypeRef()
	 * @see #getNodeTypeReferenceType()
	 * @generated
	 */
	EAttribute getNodeTypeReferenceType_TypeRef();

	/**
	 * Returns the meta object for class '{@link _12.OutputParametersType <em>Output Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameters Type</em>'.
	 * @see _12.OutputParametersType
	 * @generated
	 */
	EClass getOutputParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.OutputParametersType#getOutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter</em>'.
	 * @see _12.OutputParametersType#getOutputParameter()
	 * @see #getOutputParametersType()
	 * @generated
	 */
	EReference getOutputParametersType_OutputParameter();

	/**
	 * Returns the meta object for class '{@link _12.OutputParametersType1 <em>Output Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameters Type1</em>'.
	 * @see _12.OutputParametersType1
	 * @generated
	 */
	EClass getOutputParametersType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.OutputParametersType1#getOutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter</em>'.
	 * @see _12.OutputParametersType1#getOutputParameter()
	 * @see #getOutputParametersType1()
	 * @generated
	 */
	EReference getOutputParametersType1_OutputParameter();

	/**
	 * Returns the meta object for class '{@link _12.PlanModelReferenceType <em>Plan Model Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Model Reference Type</em>'.
	 * @see _12.PlanModelReferenceType
	 * @generated
	 */
	EClass getPlanModelReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link _12.PlanModelReferenceType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see _12.PlanModelReferenceType#getReference()
	 * @see #getPlanModelReferenceType()
	 * @generated
	 */
	EAttribute getPlanModelReferenceType_Reference();

	/**
	 * Returns the meta object for class '{@link _12.PlanModelType <em>Plan Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Model Type</em>'.
	 * @see _12.PlanModelType
	 * @generated
	 */
	EClass getPlanModelType();

	/**
	 * Returns the meta object for the attribute list '{@link _12.PlanModelType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.PlanModelType#getAny()
	 * @see #getPlanModelType()
	 * @generated
	 */
	EAttribute getPlanModelType_Any();

	/**
	 * Returns the meta object for class '{@link _12.PlanType <em>Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Type</em>'.
	 * @see _12.PlanType
	 * @generated
	 */
	EClass getPlanType();

	/**
	 * Returns the meta object for the attribute '{@link _12.PlanType#getPlanRef <em>Plan Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Ref</em>'.
	 * @see _12.PlanType#getPlanRef()
	 * @see #getPlanType()
	 * @generated
	 */
	EAttribute getPlanType_PlanRef();

	/**
	 * Returns the meta object for class '{@link _12.PoliciesType <em>Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policies Type</em>'.
	 * @see _12.PoliciesType
	 * @generated
	 */
	EClass getPoliciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.PoliciesType#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see _12.PoliciesType#getPolicy()
	 * @see #getPoliciesType()
	 * @generated
	 */
	EReference getPoliciesType_Policy();

	/**
	 * Returns the meta object for class '{@link _12.PoliciesType1 <em>Policies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policies Type1</em>'.
	 * @see _12.PoliciesType1
	 * @generated
	 */
	EClass getPoliciesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.PoliciesType1#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see _12.PoliciesType1#getPolicy()
	 * @see #getPoliciesType1()
	 * @generated
	 */
	EReference getPoliciesType1_Policy();

	/**
	 * Returns the meta object for class '{@link _12.PropertiesDefinitionType <em>Properties Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Definition Type</em>'.
	 * @see _12.PropertiesDefinitionType
	 * @generated
	 */
	EClass getPropertiesDefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link _12.PropertiesDefinitionType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see _12.PropertiesDefinitionType#getElement()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EAttribute getPropertiesDefinitionType_Element();

	/**
	 * Returns the meta object for the attribute '{@link _12.PropertiesDefinitionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see _12.PropertiesDefinitionType#getType()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EAttribute getPropertiesDefinitionType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link _12.PropertiesDefinitionType#getHasSomProperties <em>Has Som Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Som Properties</em>'.
	 * @see _12.PropertiesDefinitionType#getHasSomProperties()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EReference getPropertiesDefinitionType_HasSomProperties();

	/**
	 * Returns the meta object for class '{@link _12.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty</em>'.
	 * @see _12.TProperty
	 * @generated
	 */
	EClass getTProperty();

	/**
	 * Returns the meta object for the attribute '{@link _12.TProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TProperty#getName()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Name();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see _12.TProperty#getValue()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Value();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Value</em>'.
	 * @see _12.TProperty#getDefaultValue()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_DefaultValue();

	/**
	 * Returns the meta object for class '{@link _12.PropertiesType1 <em>Properties Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type1</em>'.
	 * @see _12.PropertiesType1
	 * @generated
	 */
	EClass getPropertiesType1();

	/**
	 * Returns the meta object for the attribute list '{@link _12.PropertiesType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.PropertiesType1#getAny()
	 * @see #getPropertiesType1()
	 * @generated
	 */
	EAttribute getPropertiesType1_Any();

	/**
	 * Returns the meta object for the containment reference '{@link _12.PropertiesType1#getPropertyMappings <em>Property Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Mappings</em>'.
	 * @see _12.PropertiesType1#getPropertyMappings()
	 * @see #getPropertiesType1()
	 * @generated
	 */
	EReference getPropertiesType1_PropertyMappings();

	/**
	 * Returns the meta object for class '{@link _12.PropertyConstraintsType <em>Property Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Constraints Type</em>'.
	 * @see _12.PropertyConstraintsType
	 * @generated
	 */
	EClass getPropertyConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.PropertyConstraintsType#getPropertyConstraint <em>Property Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Constraint</em>'.
	 * @see _12.PropertyConstraintsType#getPropertyConstraint()
	 * @see #getPropertyConstraintsType()
	 * @generated
	 */
	EReference getPropertyConstraintsType_PropertyConstraint();

	/**
	 * Returns the meta object for class '{@link _12.PropertyConstraintsType1 <em>Property Constraints Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Constraints Type1</em>'.
	 * @see _12.PropertyConstraintsType1
	 * @generated
	 */
	EClass getPropertyConstraintsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.PropertyConstraintsType1#getPropertyConstraint <em>Property Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Constraint</em>'.
	 * @see _12.PropertyConstraintsType1#getPropertyConstraint()
	 * @see #getPropertyConstraintsType1()
	 * @generated
	 */
	EReference getPropertyConstraintsType1_PropertyConstraint();

	/**
	 * Returns the meta object for class '{@link _12.PropertyMappingsType <em>Property Mappings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mappings Type</em>'.
	 * @see _12.PropertyMappingsType
	 * @generated
	 */
	EClass getPropertyMappingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.PropertyMappingsType#getPropertyMapping <em>Property Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Mapping</em>'.
	 * @see _12.PropertyMappingsType#getPropertyMapping()
	 * @see #getPropertyMappingsType()
	 * @generated
	 */
	EReference getPropertyMappingsType_PropertyMapping();

	/**
	 * Returns the meta object for class '{@link _12.RelationshipConstraintsType <em>Relationship Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraints Type</em>'.
	 * @see _12.RelationshipConstraintsType
	 * @generated
	 */
	EClass getRelationshipConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.RelationshipConstraintsType#getRelationshipConstraint <em>Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Constraint</em>'.
	 * @see _12.RelationshipConstraintsType#getRelationshipConstraint()
	 * @see #getRelationshipConstraintsType()
	 * @generated
	 */
	EReference getRelationshipConstraintsType_RelationshipConstraint();

	/**
	 * Returns the meta object for class '{@link _12.RelationshipConstraintType <em>Relationship Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraint Type</em>'.
	 * @see _12.RelationshipConstraintType
	 * @generated
	 */
	EClass getRelationshipConstraintType();

	/**
	 * Returns the meta object for the attribute list '{@link _12.RelationshipConstraintType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.RelationshipConstraintType#getAny()
	 * @see #getRelationshipConstraintType()
	 * @generated
	 */
	EAttribute getRelationshipConstraintType_Any();

	/**
	 * Returns the meta object for the attribute '{@link _12.RelationshipConstraintType#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see _12.RelationshipConstraintType#getConstraintType()
	 * @see #getRelationshipConstraintType()
	 * @generated
	 */
	EAttribute getRelationshipConstraintType_ConstraintType();

	/**
	 * Returns the meta object for class '{@link _12.RelationshipOperationType <em>Relationship Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Operation Type</em>'.
	 * @see _12.RelationshipOperationType
	 * @generated
	 */
	EClass getRelationshipOperationType();

	/**
	 * Returns the meta object for the attribute '{@link _12.RelationshipOperationType#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see _12.RelationshipOperationType#getInterfaceName()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link _12.RelationshipOperationType#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see _12.RelationshipOperationType#getOperationName()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_OperationName();

	/**
	 * Returns the meta object for the attribute '{@link _12.RelationshipOperationType#getRelationshipRef <em>Relationship Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Ref</em>'.
	 * @see _12.RelationshipOperationType#getRelationshipRef()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_RelationshipRef();

	/**
	 * Returns the meta object for class '{@link _12.RequirementDefinitionsType <em>Requirement Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Definitions Type</em>'.
	 * @see _12.RequirementDefinitionsType
	 * @generated
	 */
	EClass getRequirementDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.RequirementDefinitionsType#getRequirementDefinition <em>Requirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Definition</em>'.
	 * @see _12.RequirementDefinitionsType#getRequirementDefinition()
	 * @see #getRequirementDefinitionsType()
	 * @generated
	 */
	EReference getRequirementDefinitionsType_RequirementDefinition();

	/**
	 * Returns the meta object for class '{@link _12.RequirementsType <em>Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type</em>'.
	 * @see _12.RequirementsType
	 * @generated
	 */
	EClass getRequirementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.RequirementsType#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see _12.RequirementsType#getRequirement()
	 * @see #getRequirementsType()
	 * @generated
	 */
	EReference getRequirementsType_Requirement();

	/**
	 * Returns the meta object for class '{@link _12.RequirementsType1 <em>Requirements Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type1</em>'.
	 * @see _12.RequirementsType1
	 * @generated
	 */
	EClass getRequirementsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.RequirementsType1#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see _12.RequirementsType1#getRequirement()
	 * @see #getRequirementsType1()
	 * @generated
	 */
	EReference getRequirementsType1_Requirement();

	/**
	 * Returns the meta object for class '{@link _12.SourceElementType <em>Source Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element Type</em>'.
	 * @see _12.SourceElementType
	 * @generated
	 */
	EClass getSourceElementType();

	/**
	 * Returns the meta object for the attribute '{@link _12.SourceElementType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see _12.SourceElementType#getRef()
	 * @see #getSourceElementType()
	 * @generated
	 */
	EAttribute getSourceElementType_Ref();

	/**
	 * Returns the meta object for class '{@link _12.SourceInterfacesType <em>Source Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Interfaces Type</em>'.
	 * @see _12.SourceInterfacesType
	 * @generated
	 */
	EClass getSourceInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.SourceInterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see _12.SourceInterfacesType#getInterface()
	 * @see #getSourceInterfacesType()
	 * @generated
	 */
	EReference getSourceInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link _12.TAppliesTo <em>TApplies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TApplies To</em>'.
	 * @see _12.TAppliesTo
	 * @generated
	 */
	EClass getTAppliesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TAppliesTo#getNodeTypeReference <em>Node Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type Reference</em>'.
	 * @see _12.TAppliesTo#getNodeTypeReference()
	 * @see #getTAppliesTo()
	 * @generated
	 */
	EReference getTAppliesTo_NodeTypeReference();

	/**
	 * Returns the meta object for class '{@link _12.TargetElementType <em>Target Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element Type</em>'.
	 * @see _12.TargetElementType
	 * @generated
	 */
	EClass getTargetElementType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TargetElementType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see _12.TargetElementType#getRef()
	 * @see #getTargetElementType()
	 * @generated
	 */
	EAttribute getTargetElementType_Ref();

	/**
	 * Returns the meta object for class '{@link _12.TargetInterfacesType <em>Target Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Interfaces Type</em>'.
	 * @see _12.TargetInterfacesType
	 * @generated
	 */
	EClass getTargetInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TargetInterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see _12.TargetInterfacesType#getInterface()
	 * @see #getTargetInterfacesType()
	 * @generated
	 */
	EReference getTargetInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link _12.TArtifactReference <em>TArtifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Reference</em>'.
	 * @see _12.TArtifactReference
	 * @generated
	 */
	EClass getTArtifactReference();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TArtifactReference#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see _12.TArtifactReference#getGroup()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EAttribute getTArtifactReference_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TArtifactReference#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see _12.TArtifactReference#getInclude()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EReference getTArtifactReference_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TArtifactReference#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see _12.TArtifactReference#getExclude()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EReference getTArtifactReference_Exclude();

	/**
	 * Returns the meta object for the attribute '{@link _12.TArtifactReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see _12.TArtifactReference#getReference()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EAttribute getTArtifactReference_Reference();

	/**
	 * Returns the meta object for class '{@link _12.TArtifactTemplate <em>TArtifact Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Template</em>'.
	 * @see _12.TArtifactTemplate
	 * @generated
	 */
	EClass getTArtifactTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TArtifactTemplate#getArtifactReferences <em>Artifact References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact References</em>'.
	 * @see _12.TArtifactTemplate#getArtifactReferences()
	 * @see #getTArtifactTemplate()
	 * @generated
	 */
	EReference getTArtifactTemplate_ArtifactReferences();

	/**
	 * Returns the meta object for the attribute '{@link _12.TArtifactTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TArtifactTemplate#getName()
	 * @see #getTArtifactTemplate()
	 * @generated
	 */
	EAttribute getTArtifactTemplate_Name();

	/**
	 * Returns the meta object for class '{@link _12.TArtifactType <em>TArtifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Type</em>'.
	 * @see _12.TArtifactType
	 * @generated
	 */
	EClass getTArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TArtifactType#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see _12.TArtifactType#getMetaType()
	 * @see #getTArtifactType()
	 * @generated
	 */
	EAttribute getTArtifactType_MetaType();

	/**
	 * Returns the meta object for class '{@link _12.TBoundaryDefinitions <em>TBoundary Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBoundary Definitions</em>'.
	 * @see _12.TBoundaryDefinitions
	 * @generated
	 */
	EClass getTBoundaryDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TBoundaryDefinitions#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see _12.TBoundaryDefinitions#getProperties()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TBoundaryDefinitions#getPropertyConstraints <em>Property Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Constraints</em>'.
	 * @see _12.TBoundaryDefinitions#getPropertyConstraints()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_PropertyConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TBoundaryDefinitions#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see _12.TBoundaryDefinitions#getRequirements()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TBoundaryDefinitions#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see _12.TBoundaryDefinitions#getCapabilities()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TBoundaryDefinitions#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see _12.TBoundaryDefinitions#getPolicies()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TBoundaryDefinitions#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see _12.TBoundaryDefinitions#getInterfaces()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Interfaces();

	/**
	 * Returns the meta object for class '{@link _12.TCapability <em>TCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability</em>'.
	 * @see _12.TCapability
	 * @generated
	 */
	EClass getTCapability();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCapability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TCapability#getName()
	 * @see #getTCapability()
	 * @generated
	 */
	EAttribute getTCapability_Name();

	/**
	 * Returns the meta object for class '{@link _12.TCapabilityDefinition <em>TCapability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Definition</em>'.
	 * @see _12.TCapabilityDefinition
	 * @generated
	 */
	EClass getTCapabilityDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TCapabilityDefinition#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see _12.TCapabilityDefinition#getConstraints()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EReference getTCapabilityDefinition_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCapabilityDefinition#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Type</em>'.
	 * @see _12.TCapabilityDefinition#getCapabilityType()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_CapabilityType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCapabilityDefinition#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see _12.TCapabilityDefinition#getLowerBound()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCapabilityDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TCapabilityDefinition#getName()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCapabilityDefinition#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see _12.TCapabilityDefinition#getUpperBound()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_UpperBound();

	/**
	 * Returns the meta object for class '{@link _12.TCapabilityRef <em>TCapability Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Ref</em>'.
	 * @see _12.TCapabilityRef
	 * @generated
	 */
	EClass getTCapabilityRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCapabilityRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TCapabilityRef#getName()
	 * @see #getTCapabilityRef()
	 * @generated
	 */
	EAttribute getTCapabilityRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCapabilityRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see _12.TCapabilityRef#getRef()
	 * @see #getTCapabilityRef()
	 * @generated
	 */
	EAttribute getTCapabilityRef_Ref();

	/**
	 * Returns the meta object for class '{@link _12.TCapabilityType <em>TCapability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Type</em>'.
	 * @see _12.TCapabilityType
	 * @generated
	 */
	EClass getTCapabilityType();

	/**
	 * Returns the meta object for class '{@link _12.TCondition <em>TCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCondition</em>'.
	 * @see _12.TCondition
	 * @generated
	 */
	EClass getTCondition();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TCondition#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.TCondition#getAny()
	 * @see #getTCondition()
	 * @generated
	 */
	EAttribute getTCondition_Any();

	/**
	 * Returns the meta object for the attribute '{@link _12.TCondition#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see _12.TCondition#getExpressionLanguage()
	 * @see #getTCondition()
	 * @generated
	 */
	EAttribute getTCondition_ExpressionLanguage();

	/**
	 * Returns the meta object for class '{@link _12.TConstraint <em>TConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConstraint</em>'.
	 * @see _12.TConstraint
	 * @generated
	 */
	EClass getTConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TConstraint#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.TConstraint#getAny()
	 * @see #getTConstraint()
	 * @generated
	 */
	EAttribute getTConstraint_Any();

	/**
	 * Returns the meta object for the attribute '{@link _12.TConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see _12.TConstraint#getConstraintType()
	 * @see #getTConstraint()
	 * @generated
	 */
	EAttribute getTConstraint_ConstraintType();

	/**
	 * Returns the meta object for class '{@link _12.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see _12.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TDefinitions#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see _12.TDefinitions#getExtensions()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see _12.TDefinitions#getImport()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Import();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TDefinitions#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see _12.TDefinitions#getTypes()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Types();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TDefinitions#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see _12.TDefinitions#getGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getServiceTemplate <em>Service Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Template</em>'.
	 * @see _12.TDefinitions#getServiceTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ServiceTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type</em>'.
	 * @see _12.TDefinitions#getNodeType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_NodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getNodeTypeImplementation <em>Node Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type Implementation</em>'.
	 * @see _12.TDefinitions#getNodeTypeImplementation()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_NodeTypeImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Type</em>'.
	 * @see _12.TDefinitions#getRelationshipType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RelationshipType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getRelationshipTypeImplementation <em>Relationship Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Type Implementation</em>'.
	 * @see _12.TDefinitions#getRelationshipTypeImplementation()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RelationshipTypeImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Type</em>'.
	 * @see _12.TDefinitions#getRequirementType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RequirementType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Type</em>'.
	 * @see _12.TDefinitions#getCapabilityType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_CapabilityType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Type</em>'.
	 * @see _12.TDefinitions#getArtifactType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ArtifactType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getArtifactTemplate <em>Artifact Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Template</em>'.
	 * @see _12.TDefinitions#getArtifactTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ArtifactTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Type</em>'.
	 * @see _12.TDefinitions#getPolicyType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_PolicyType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDefinitions#getPolicyTemplate <em>Policy Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Template</em>'.
	 * @see _12.TDefinitions#getPolicyTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_PolicyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDefinitions#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see _12.TDefinitions#getId()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Id();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDefinitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TDefinitions#getName()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDefinitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see _12.TDefinitions#getTargetNamespace()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link _12.TDeploymentArtifact <em>TDeployment Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDeployment Artifact</em>'.
	 * @see _12.TDeploymentArtifact
	 * @generated
	 */
	EClass getTDeploymentArtifact();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDeploymentArtifact#getArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Ref</em>'.
	 * @see _12.TDeploymentArtifact#getArtifactRef()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_ArtifactRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDeploymentArtifact#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see _12.TDeploymentArtifact#getArtifactType()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_ArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDeploymentArtifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TDeploymentArtifact#getName()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_Name();

	/**
	 * Returns the meta object for class '{@link _12.TDeploymentArtifacts <em>TDeployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDeployment Artifacts</em>'.
	 * @see _12.TDeploymentArtifacts
	 * @generated
	 */
	EClass getTDeploymentArtifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TDeploymentArtifacts#getDeploymentArtifact <em>Deployment Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Artifact</em>'.
	 * @see _12.TDeploymentArtifacts#getDeploymentArtifact()
	 * @see #getTDeploymentArtifacts()
	 * @generated
	 */
	EReference getTDeploymentArtifacts_DeploymentArtifact();

	/**
	 * Returns the meta object for class '{@link _12.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDocumentation</em>'.
	 * @see _12.TDocumentation
	 * @generated
	 */
	EClass getTDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TDocumentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see _12.TDocumentation#getMixed()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TDocumentation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.TDocumentation#getAny()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Any();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDocumentation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see _12.TDocumentation#getLang()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Lang();

	/**
	 * Returns the meta object for the attribute '{@link _12.TDocumentation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see _12.TDocumentation#getSource()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Source();

	/**
	 * Returns the meta object for class '{@link _12.TEntityTemplate <em>TEntity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Template</em>'.
	 * @see _12.TEntityTemplate
	 * @generated
	 */
	EClass getTEntityTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TEntityTemplate#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see _12.TEntityTemplate#getProperties()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TEntityTemplate#getPropertyConstraints <em>Property Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Constraints</em>'.
	 * @see _12.TEntityTemplate#getPropertyConstraints()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_PropertyConstraints();

	/**
	 * Returns the meta object for the attribute '{@link _12.TEntityTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see _12.TEntityTemplate#getId()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EAttribute getTEntityTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link _12.TEntityTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see _12.TEntityTemplate#getType()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EAttribute getTEntityTemplate_Type();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TEntityTemplate#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see _12.TEntityTemplate#getAttributes()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TEntityTemplate#getNodeHasInterface <em>Node Has Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Has Interface</em>'.
	 * @see _12.TEntityTemplate#getNodeHasInterface()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_NodeHasInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TEntityTemplate#getNodeHasRelations <em>Node Has Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Has Relations</em>'.
	 * @see _12.TEntityTemplate#getNodeHasRelations()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_NodeHasRelations();

	/**
	 * Returns the meta object for class '{@link _12.TEntityType <em>TEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Type</em>'.
	 * @see _12.TEntityType
	 * @generated
	 */
	EClass getTEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TEntityType#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see _12.TEntityType#getTags()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TEntityType#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see _12.TEntityType#getDerivedFrom()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TEntityType#getPropertiesDefinition <em>Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties Definition</em>'.
	 * @see _12.TEntityType#getPropertiesDefinition()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_PropertiesDefinition();

	/**
	 * Returns the meta object for the attribute '{@link _12.TEntityType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see _12.TEntityType#getAbstract()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link _12.TEntityType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see _12.TEntityType#getFinal()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Final();

	/**
	 * Returns the meta object for the attribute '{@link _12.TEntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TEntityType#getName()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TEntityType#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see _12.TEntityType#getTargetNamespace()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link _12.TExportedInterface <em>TExported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExported Interface</em>'.
	 * @see _12.TExportedInterface
	 * @generated
	 */
	EClass getTExportedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TExportedInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see _12.TExportedInterface#getOperation()
	 * @see #getTExportedInterface()
	 * @generated
	 */
	EReference getTExportedInterface_Operation();

	/**
	 * Returns the meta object for the attribute '{@link _12.TExportedInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TExportedInterface#getName()
	 * @see #getTExportedInterface()
	 * @generated
	 */
	EAttribute getTExportedInterface_Name();

	/**
	 * Returns the meta object for class '{@link _12.TExportedOperation <em>TExported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExported Operation</em>'.
	 * @see _12.TExportedOperation
	 * @generated
	 */
	EClass getTExportedOperation();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TExportedOperation#getNodeOperation <em>Node Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Operation</em>'.
	 * @see _12.TExportedOperation#getNodeOperation()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_NodeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TExportedOperation#getRelationshipOperation <em>Relationship Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Operation</em>'.
	 * @see _12.TExportedOperation#getRelationshipOperation()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_RelationshipOperation();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TExportedOperation#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see _12.TExportedOperation#getPlan()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_Plan();

	/**
	 * Returns the meta object for the attribute '{@link _12.TExportedOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TExportedOperation#getName()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EAttribute getTExportedOperation_Name();

	/**
	 * Returns the meta object for class '{@link _12.TExtensibleElements <em>TExtensible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtensible Elements</em>'.
	 * @see _12.TExtensibleElements
	 * @generated
	 */
	EClass getTExtensibleElements();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TExtensibleElements#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see _12.TExtensibleElements#getDocumentation()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EReference getTExtensibleElements_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TExtensibleElements#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.TExtensibleElements#getAny()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EAttribute getTExtensibleElements_Any();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TExtensibleElements#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see _12.TExtensibleElements#getAnyAttribute()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EAttribute getTExtensibleElements_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link _12.TExtension <em>TExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtension</em>'.
	 * @see _12.TExtension
	 * @generated
	 */
	EClass getTExtension();

	/**
	 * Returns the meta object for the attribute '{@link _12.TExtension#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see _12.TExtension#getMustUnderstand()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_MustUnderstand();

	/**
	 * Returns the meta object for the attribute '{@link _12.TExtension#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see _12.TExtension#getNamespace()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_Namespace();

	/**
	 * Returns the meta object for class '{@link _12.TExtensions <em>TExtensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtensions</em>'.
	 * @see _12.TExtensions
	 * @generated
	 */
	EClass getTExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TExtensions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see _12.TExtensions#getExtension()
	 * @see #getTExtensions()
	 * @generated
	 */
	EReference getTExtensions_Extension();

	/**
	 * Returns the meta object for class '{@link _12.TImplementationArtifact <em>TImplementation Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImplementation Artifact</em>'.
	 * @see _12.TImplementationArtifact
	 * @generated
	 */
	EClass getTImplementationArtifact();

	/**
	 * Returns the meta object for the attribute '{@link _12.TImplementationArtifact#getArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Ref</em>'.
	 * @see _12.TImplementationArtifact#getArtifactRef()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_ArtifactRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.TImplementationArtifact#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see _12.TImplementationArtifact#getArtifactType()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_ArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TImplementationArtifact#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see _12.TImplementationArtifact#getInterfaceName()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link _12.TImplementationArtifact#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see _12.TImplementationArtifact#getOperationName()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_OperationName();

	/**
	 * Returns the meta object for class '{@link _12.TImplementationArtifacts <em>TImplementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImplementation Artifacts</em>'.
	 * @see _12.TImplementationArtifacts
	 * @generated
	 */
	EClass getTImplementationArtifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TImplementationArtifacts#getImplementationArtifact <em>Implementation Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Artifact</em>'.
	 * @see _12.TImplementationArtifacts#getImplementationArtifact()
	 * @see #getTImplementationArtifacts()
	 * @generated
	 */
	EReference getTImplementationArtifacts_ImplementationArtifact();

	/**
	 * Returns the meta object for class '{@link _12.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImport</em>'.
	 * @see _12.TImport
	 * @generated
	 */
	EClass getTImport();

	/**
	 * Returns the meta object for the attribute '{@link _12.TImport#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see _12.TImport#getImportType()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TImport#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see _12.TImport#getLocation()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link _12.TImport#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see _12.TImport#getNamespace()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Namespace();

	/**
	 * Returns the meta object for class '{@link _12.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInterface</em>'.
	 * @see _12.TInterface
	 * @generated
	 */
	EClass getTInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see _12.TInterface#getOperation()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_Operation();

	/**
	 * Returns the meta object for the attribute '{@link _12.TInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TInterface#getName()
	 * @see #getTInterface()
	 * @generated
	 */
	EAttribute getTInterface_Name();

	/**
	 * Returns the meta object for class '{@link _12.TNodeTemplate <em>TNode Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Template</em>'.
	 * @see _12.TNodeTemplate
	 * @generated
	 */
	EClass getTNodeTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTemplate#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see _12.TNodeTemplate#getRequirements()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTemplate#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see _12.TNodeTemplate#getCapabilities()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTemplate#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see _12.TNodeTemplate#getPolicies()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Artifacts</em>'.
	 * @see _12.TNodeTemplate#getDeploymentArtifacts()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_DeploymentArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTemplate#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see _12.TNodeTemplate#getMaxInstances()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_MaxInstances();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTemplate#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see _12.TNodeTemplate#getMinInstances()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TNodeTemplate#getName()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_Name();

	/**
	 * Returns the meta object for class '{@link _12.TNodeType <em>TNode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Type</em>'.
	 * @see _12.TNodeType
	 * @generated
	 */
	EClass getTNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeType#getRequirementDefinitions <em>Requirement Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement Definitions</em>'.
	 * @see _12.TNodeType#getRequirementDefinitions()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_RequirementDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeType#getCapabilityDefinitions <em>Capability Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Definitions</em>'.
	 * @see _12.TNodeType#getCapabilityDefinitions()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_CapabilityDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeType#getInstanceStates <em>Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance States</em>'.
	 * @see _12.TNodeType#getInstanceStates()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_InstanceStates();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeType#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see _12.TNodeType#getInterfaces()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_Interfaces();

	/**
	 * Returns the meta object for class '{@link _12.TNodeTypeImplementation <em>TNode Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Type Implementation</em>'.
	 * @see _12.TNodeTypeImplementation
	 * @generated
	 */
	EClass getTNodeTypeImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTypeImplementation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see _12.TNodeTypeImplementation#getTags()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTypeImplementation#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see _12.TNodeTypeImplementation#getDerivedFrom()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Container Features</em>'.
	 * @see _12.TNodeTypeImplementation#getRequiredContainerFeatures()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_RequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Artifacts</em>'.
	 * @see _12.TNodeTypeImplementation#getImplementationArtifacts()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_ImplementationArtifacts();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TNodeTypeImplementation#getDeploymentArtifacts <em>Deployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Artifacts</em>'.
	 * @see _12.TNodeTypeImplementation#getDeploymentArtifacts()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_DeploymentArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTypeImplementation#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see _12.TNodeTypeImplementation#getAbstract()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTypeImplementation#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see _12.TNodeTypeImplementation#getFinal()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Final();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTypeImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TNodeTypeImplementation#getName()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTypeImplementation#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see _12.TNodeTypeImplementation#getNodeType()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TNodeTypeImplementation#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see _12.TNodeTypeImplementation#getTargetNamespace()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link _12.TOperation <em>TOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOperation</em>'.
	 * @see _12.TOperation
	 * @generated
	 */
	EClass getTOperation();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TOperation#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Parameters</em>'.
	 * @see _12.TOperation#getInputParameters()
	 * @see #getTOperation()
	 * @generated
	 */
	EReference getTOperation_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TOperation#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Parameters</em>'.
	 * @see _12.TOperation#getOutputParameters()
	 * @see #getTOperation()
	 * @generated
	 */
	EReference getTOperation_OutputParameters();

	/**
	 * Returns the meta object for the attribute '{@link _12.TOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TOperation#getName()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_Name();

	/**
	 * Returns the meta object for class '{@link _12.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see _12.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the attribute '{@link _12.TParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TParameter#getName()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TParameter#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see _12.TParameter#getRequired()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link _12.TParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see _12.TParameter#getType()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Type();

	/**
	 * Returns the meta object for class '{@link _12.TPlan <em>TPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan</em>'.
	 * @see _12.TPlan
	 * @generated
	 */
	EClass getTPlan();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TPlan#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see _12.TPlan#getPrecondition()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TPlan#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Parameters</em>'.
	 * @see _12.TPlan#getInputParameters()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TPlan#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Parameters</em>'.
	 * @see _12.TPlan#getOutputParameters()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_OutputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TPlan#getPlanModel <em>Plan Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Model</em>'.
	 * @see _12.TPlan#getPlanModel()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_PlanModel();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TPlan#getPlanModelReference <em>Plan Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Model Reference</em>'.
	 * @see _12.TPlan#getPlanModelReference()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_PlanModelReference();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPlan#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see _12.TPlan#getId()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_Id();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TPlan#getName()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPlan#getPlanLanguage <em>Plan Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Language</em>'.
	 * @see _12.TPlan#getPlanLanguage()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_PlanLanguage();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPlan#getPlanType <em>Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Type</em>'.
	 * @see _12.TPlan#getPlanType()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_PlanType();

	/**
	 * Returns the meta object for class '{@link _12.TPlans <em>TPlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlans</em>'.
	 * @see _12.TPlans
	 * @generated
	 */
	EClass getTPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TPlans#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan</em>'.
	 * @see _12.TPlans#getPlan()
	 * @see #getTPlans()
	 * @generated
	 */
	EReference getTPlans_Plan();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPlans#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see _12.TPlans#getTargetNamespace()
	 * @see #getTPlans()
	 * @generated
	 */
	EAttribute getTPlans_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link _12.TPolicy <em>TPolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy</em>'.
	 * @see _12.TPolicy
	 * @generated
	 */
	EClass getTPolicy();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TPolicy#getName()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPolicy#getPolicyRef <em>Policy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Ref</em>'.
	 * @see _12.TPolicy#getPolicyRef()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_PolicyRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPolicy#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see _12.TPolicy#getPolicyType()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_PolicyType();

	/**
	 * Returns the meta object for class '{@link _12.TPolicyTemplate <em>TPolicy Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy Template</em>'.
	 * @see _12.TPolicyTemplate
	 * @generated
	 */
	EClass getTPolicyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPolicyTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TPolicyTemplate#getName()
	 * @see #getTPolicyTemplate()
	 * @generated
	 */
	EAttribute getTPolicyTemplate_Name();

	/**
	 * Returns the meta object for class '{@link _12.TPolicyType <em>TPolicy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy Type</em>'.
	 * @see _12.TPolicyType
	 * @generated
	 */
	EClass getTPolicyType();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TPolicyType#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applies To</em>'.
	 * @see _12.TPolicyType#getAppliesTo()
	 * @see #getTPolicyType()
	 * @generated
	 */
	EReference getTPolicyType_AppliesTo();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPolicyType#getPolicyLanguage <em>Policy Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Language</em>'.
	 * @see _12.TPolicyType#getPolicyLanguage()
	 * @see #getTPolicyType()
	 * @generated
	 */
	EAttribute getTPolicyType_PolicyLanguage();

	/**
	 * Returns the meta object for class '{@link _12.TPropertyConstraint <em>TProperty Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Constraint</em>'.
	 * @see _12.TPropertyConstraint
	 * @generated
	 */
	EClass getTPropertyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPropertyConstraint#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see _12.TPropertyConstraint#getProperty()
	 * @see #getTPropertyConstraint()
	 * @generated
	 */
	EAttribute getTPropertyConstraint_Property();

	/**
	 * Returns the meta object for class '{@link _12.TPropertyMapping <em>TProperty Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Mapping</em>'.
	 * @see _12.TPropertyMapping
	 * @generated
	 */
	EClass getTPropertyMapping();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPropertyMapping#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Template Property Ref</em>'.
	 * @see _12.TPropertyMapping#getServiceTemplatePropertyRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_ServiceTemplatePropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPropertyMapping#getTargetObjectRef <em>Target Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Object Ref</em>'.
	 * @see _12.TPropertyMapping#getTargetObjectRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_TargetObjectRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.TPropertyMapping#getTargetPropertyRef <em>Target Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property Ref</em>'.
	 * @see _12.TPropertyMapping#getTargetPropertyRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_TargetPropertyRef();

	/**
	 * Returns the meta object for class '{@link _12.TRelationshipTemplate <em>TRelationship Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Template</em>'.
	 * @see _12.TRelationshipTemplate
	 * @generated
	 */
	EClass getTRelationshipTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTemplate#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Element</em>'.
	 * @see _12.TRelationshipTemplate#getSourceElement()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_SourceElement();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTemplate#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Element</em>'.
	 * @see _12.TRelationshipTemplate#getTargetElement()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_TargetElement();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTemplate#getRelationshipConstraints <em>Relationship Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Constraints</em>'.
	 * @see _12.TRelationshipTemplate#getRelationshipConstraints()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_RelationshipConstraints();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRelationshipTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TRelationshipTemplate#getName()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EAttribute getTRelationshipTemplate_Name();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTemplate#getUsesRelationType <em>Uses Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses Relation Type</em>'.
	 * @see _12.TRelationshipTemplate#getUsesRelationType()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_UsesRelationType();

	/**
	 * Returns the meta object for class '{@link _12.TRelationshipType <em>TRelationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Type</em>'.
	 * @see _12.TRelationshipType
	 * @generated
	 */
	EClass getTRelationshipType();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipType#getInstanceStates <em>Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance States</em>'.
	 * @see _12.TRelationshipType#getInstanceStates()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_InstanceStates();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipType#getSourceInterfaces <em>Source Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Interfaces</em>'.
	 * @see _12.TRelationshipType#getSourceInterfaces()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_SourceInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipType#getTargetInterfaces <em>Target Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Interfaces</em>'.
	 * @see _12.TRelationshipType#getTargetInterfaces()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_TargetInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipType#getValidSource <em>Valid Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Source</em>'.
	 * @see _12.TRelationshipType#getValidSource()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_ValidSource();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipType#getValidTarget <em>Valid Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Target</em>'.
	 * @see _12.TRelationshipType#getValidTarget()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_ValidTarget();

	/**
	 * Returns the meta object for class '{@link _12.TRelationshipTypeImplementation <em>TRelationship Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Type Implementation</em>'.
	 * @see _12.TRelationshipTypeImplementation
	 * @generated
	 */
	EClass getTRelationshipTypeImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTypeImplementation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see _12.TRelationshipTypeImplementation#getTags()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTypeImplementation#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see _12.TRelationshipTypeImplementation#getDerivedFrom()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Container Features</em>'.
	 * @see _12.TRelationshipTypeImplementation#getRequiredContainerFeatures()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_RequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRelationshipTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Artifacts</em>'.
	 * @see _12.TRelationshipTypeImplementation#getImplementationArtifacts()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_ImplementationArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRelationshipTypeImplementation#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see _12.TRelationshipTypeImplementation#getAbstract()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRelationshipTypeImplementation#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see _12.TRelationshipTypeImplementation#getFinal()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Final();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRelationshipTypeImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TRelationshipTypeImplementation#getName()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRelationshipTypeImplementation#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see _12.TRelationshipTypeImplementation#getRelationshipType()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRelationshipTypeImplementation#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see _12.TRelationshipTypeImplementation#getTargetNamespace()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link _12.TRequiredContainerFeature <em>TRequired Container Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequired Container Feature</em>'.
	 * @see _12.TRequiredContainerFeature
	 * @generated
	 */
	EClass getTRequiredContainerFeature();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequiredContainerFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see _12.TRequiredContainerFeature#getFeature()
	 * @see #getTRequiredContainerFeature()
	 * @generated
	 */
	EAttribute getTRequiredContainerFeature_Feature();

	/**
	 * Returns the meta object for class '{@link _12.TRequiredContainerFeatures <em>TRequired Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequired Container Features</em>'.
	 * @see _12.TRequiredContainerFeatures
	 * @generated
	 */
	EClass getTRequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TRequiredContainerFeatures#getRequiredContainerFeature <em>Required Container Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Container Feature</em>'.
	 * @see _12.TRequiredContainerFeatures#getRequiredContainerFeature()
	 * @see #getTRequiredContainerFeatures()
	 * @generated
	 */
	EReference getTRequiredContainerFeatures_RequiredContainerFeature();

	/**
	 * Returns the meta object for class '{@link _12.TRequirement <em>TRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement</em>'.
	 * @see _12.TRequirement
	 * @generated
	 */
	EClass getTRequirement();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TRequirement#getName()
	 * @see #getTRequirement()
	 * @generated
	 */
	EAttribute getTRequirement_Name();

	/**
	 * Returns the meta object for class '{@link _12.TRequirementDefinition <em>TRequirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Definition</em>'.
	 * @see _12.TRequirementDefinition
	 * @generated
	 */
	EClass getTRequirementDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TRequirementDefinition#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see _12.TRequirementDefinition#getConstraints()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EReference getTRequirementDefinition_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirementDefinition#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see _12.TRequirementDefinition#getLowerBound()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TRequirementDefinition#getName()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirementDefinition#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Type</em>'.
	 * @see _12.TRequirementDefinition#getRequirementType()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_RequirementType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirementDefinition#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see _12.TRequirementDefinition#getUpperBound()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_UpperBound();

	/**
	 * Returns the meta object for class '{@link _12.TRequirementRef <em>TRequirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Ref</em>'.
	 * @see _12.TRequirementRef
	 * @generated
	 */
	EClass getTRequirementRef();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirementRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TRequirementRef#getName()
	 * @see #getTRequirementRef()
	 * @generated
	 */
	EAttribute getTRequirementRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirementRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see _12.TRequirementRef#getRef()
	 * @see #getTRequirementRef()
	 * @generated
	 */
	EAttribute getTRequirementRef_Ref();

	/**
	 * Returns the meta object for class '{@link _12.TRequirementType <em>TRequirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Type</em>'.
	 * @see _12.TRequirementType
	 * @generated
	 */
	EClass getTRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Capability Type</em>'.
	 * @see _12.TRequirementType#getRequiredCapabilityType()
	 * @see #getTRequirementType()
	 * @generated
	 */
	EAttribute getTRequirementType_RequiredCapabilityType();

	/**
	 * Returns the meta object for class '{@link _12.TServiceTemplate <em>TService Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService Template</em>'.
	 * @see _12.TServiceTemplate
	 * @generated
	 */
	EClass getTServiceTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TServiceTemplate#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see _12.TServiceTemplate#getTags()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TServiceTemplate#getBoundaryDefinitions <em>Boundary Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Definitions</em>'.
	 * @see _12.TServiceTemplate#getBoundaryDefinitions()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_BoundaryDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TServiceTemplate#getTopologyTemplate <em>Topology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Template</em>'.
	 * @see _12.TServiceTemplate#getTopologyTemplate()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_TopologyTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TServiceTemplate#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plans</em>'.
	 * @see _12.TServiceTemplate#getPlans()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_Plans();

	/**
	 * Returns the meta object for the attribute '{@link _12.TServiceTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see _12.TServiceTemplate#getId()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link _12.TServiceTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TServiceTemplate#getName()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TServiceTemplate#getSubstitutableNodeType <em>Substitutable Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitutable Node Type</em>'.
	 * @see _12.TServiceTemplate#getSubstitutableNodeType()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_SubstitutableNodeType();

	/**
	 * Returns the meta object for the attribute '{@link _12.TServiceTemplate#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see _12.TServiceTemplate#getTargetNamespace()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_TargetNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TServiceTemplate#getHasNodeType <em>Has Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Node Type</em>'.
	 * @see _12.TServiceTemplate#getHasNodeType()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_HasNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TServiceTemplate#getHasRelationship <em>Has Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relationship</em>'.
	 * @see _12.TServiceTemplate#getHasRelationship()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_HasRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link _12.TServiceTemplate#getHasImports <em>Has Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Imports</em>'.
	 * @see _12.TServiceTemplate#getHasImports()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_HasImports();

	/**
	 * Returns the meta object for class '{@link _12.TTag <em>TTag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTag</em>'.
	 * @see _12.TTag
	 * @generated
	 */
	EClass getTTag();

	/**
	 * Returns the meta object for the attribute '{@link _12.TTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TTag#getName()
	 * @see #getTTag()
	 * @generated
	 */
	EAttribute getTTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see _12.TTag#getValue()
	 * @see #getTTag()
	 * @generated
	 */
	EAttribute getTTag_Value();

	/**
	 * Returns the meta object for class '{@link _12.TTags <em>TTags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTags</em>'.
	 * @see _12.TTags
	 * @generated
	 */
	EClass getTTags();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TTags#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see _12.TTags#getTag()
	 * @see #getTTags()
	 * @generated
	 */
	EReference getTTags_Tag();

	/**
	 * Returns the meta object for class '{@link _12.TTopologyElementInstanceStates <em>TTopology Element Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTopology Element Instance States</em>'.
	 * @see _12.TTopologyElementInstanceStates
	 * @generated
	 */
	EClass getTTopologyElementInstanceStates();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TTopologyElementInstanceStates#getInstanceState <em>Instance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance State</em>'.
	 * @see _12.TTopologyElementInstanceStates#getInstanceState()
	 * @see #getTTopologyElementInstanceStates()
	 * @generated
	 */
	EReference getTTopologyElementInstanceStates_InstanceState();

	/**
	 * Returns the meta object for class '{@link _12.TTopologyTemplate <em>TTopology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTopology Template</em>'.
	 * @see _12.TTopologyTemplate
	 * @generated
	 */
	EClass getTTopologyTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TTopologyTemplate#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see _12.TTopologyTemplate#getGroup()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EAttribute getTTopologyTemplate_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TTopologyTemplate#getNodeTemplate <em>Node Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Template</em>'.
	 * @see _12.TTopologyTemplate#getNodeTemplate()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_NodeTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TTopologyTemplate#getRelationshipTemplate <em>Relationship Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Template</em>'.
	 * @see _12.TTopologyTemplate#getRelationshipTemplate()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_RelationshipTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TTopologyTemplate#getHasInputs <em>Has Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Inputs</em>'.
	 * @see _12.TTopologyTemplate#getHasInputs()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_HasInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.TTopologyTemplate#getHasoutPuts <em>Hasout Puts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasout Puts</em>'.
	 * @see _12.TTopologyTemplate#getHasoutPuts()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_HasoutPuts();

	/**
	 * Returns the meta object for class '{@link _12.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Type</em>'.
	 * @see _12.TypesType
	 * @generated
	 */
	EClass getTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TypesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see _12.TypesType#getAny()
	 * @see #getTypesType()
	 * @generated
	 */
	EAttribute getTypesType_Any();

	/**
	 * Returns the meta object for class '{@link _12.ValidSourceType <em>Valid Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Source Type</em>'.
	 * @see _12.ValidSourceType
	 * @generated
	 */
	EClass getValidSourceType();

	/**
	 * Returns the meta object for the attribute '{@link _12.ValidSourceType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see _12.ValidSourceType#getTypeRef()
	 * @see #getValidSourceType()
	 * @generated
	 */
	EAttribute getValidSourceType_TypeRef();

	/**
	 * Returns the meta object for class '{@link _12.ValidTargetType <em>Valid Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Target Type</em>'.
	 * @see _12.ValidTargetType
	 * @generated
	 */
	EClass getValidTargetType();

	/**
	 * Returns the meta object for the attribute '{@link _12.ValidTargetType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see _12.ValidTargetType#getTypeRef()
	 * @see #getValidTargetType()
	 * @generated
	 */
	EAttribute getValidTargetType_TypeRef();

	/**
	 * Returns the meta object for class '{@link _12.testDdefinition <em>test Ddefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>test Ddefinition</em>'.
	 * @see _12.testDdefinition
	 * @generated
	 */
	EClass gettestDdefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.testDdefinition#getTestrelation <em>Testrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testrelation</em>'.
	 * @see _12.testDdefinition#getTestrelation()
	 * @see #gettestDdefinition()
	 * @generated
	 */
	EReference gettestDdefinition_Testrelation();

	/**
	 * Returns the meta object for class '{@link _12.TAttribute <em>TAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAttribute</em>'.
	 * @see _12.TAttribute
	 * @generated
	 */
	EClass getTAttribute();

	/**
	 * Returns the meta object for the attribute '{@link _12.TAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TAttribute#getName()
	 * @see #getTAttribute()
	 * @generated
	 */
	EAttribute getTAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link _12.TAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see _12.TAttribute#getValue()
	 * @see #getTAttribute()
	 * @generated
	 */
	EAttribute getTAttribute_Value();

	/**
	 * Returns the meta object for class '{@link _12.AttributesType <em>Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes Type</em>'.
	 * @see _12.AttributesType
	 * @generated
	 */
	EClass getAttributesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.AttributesType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see _12.AttributesType#getAttribute()
	 * @see #getAttributesType()
	 * @generated
	 */
	EReference getAttributesType_Attribute();

	/**
	 * Returns the meta object for class '{@link _12.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see _12.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link _12.PropertiesType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see _12.PropertiesType#getProperty()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_Property();

	/**
	 * Returns the meta object for class '{@link _12.TInputTemplate <em>TInput Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInput Template</em>'.
	 * @see _12.TInputTemplate
	 * @generated
	 */
	EClass getTInputTemplate();

	/**
	 * Returns the meta object for the attribute '{@link _12.TInputTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TInputTemplate#getName()
	 * @see #getTInputTemplate()
	 * @generated
	 */
	EAttribute getTInputTemplate_Name();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TInputTemplate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see _12.TInputTemplate#getValue()
	 * @see #getTInputTemplate()
	 * @generated
	 */
	EAttribute getTInputTemplate_Value();

	/**
	 * Returns the meta object for the attribute '{@link _12.TInputTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see _12.TInputTemplate#getDescription()
	 * @see #getTInputTemplate()
	 * @generated
	 */
	EAttribute getTInputTemplate_Description();

	/**
	 * Returns the meta object for class '{@link _12.TOutputTemplate <em>TOutput Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOutput Template</em>'.
	 * @see _12.TOutputTemplate
	 * @generated
	 */
	EClass getTOutputTemplate();

	/**
	 * Returns the meta object for the attribute '{@link _12.TOutputTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see _12.TOutputTemplate#getName()
	 * @see #getTOutputTemplate()
	 * @generated
	 */
	EAttribute getTOutputTemplate_Name();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TOutputTemplate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see _12.TOutputTemplate#getValue()
	 * @see #getTOutputTemplate()
	 * @generated
	 */
	EAttribute getTOutputTemplate_Value();

	/**
	 * Returns the meta object for class '{@link _12.TimportTemplate <em>Timport Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timport Template</em>'.
	 * @see _12.TimportTemplate
	 * @generated
	 */
	EClass getTimportTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link _12.TimportTemplate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see _12.TimportTemplate#getValue()
	 * @see #getTimportTemplate()
	 * @generated
	 */
	EAttribute getTimportTemplate_Value();

	/**
	 * Returns the meta object for enum '{@link _12.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Max Instances Type Member1</em>'.
	 * @see _12.MaxInstancesTypeMember1
	 * @generated
	 */
	EEnum getMaxInstancesTypeMember1();

	/**
	 * Returns the meta object for enum '{@link _12.TBoolean <em>TBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TBoolean</em>'.
	 * @see _12.TBoolean
	 * @generated
	 */
	EEnum getTBoolean();

	/**
	 * Returns the meta object for enum '{@link _12.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upper Bound Type Member1</em>'.
	 * @see _12.UpperBoundTypeMember1
	 * @generated
	 */
	EEnum getUpperBoundTypeMember1();

	/**
	 * Returns the meta object for enum '{@link _12.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upper Bound Type Member11</em>'.
	 * @see _12.UpperBoundTypeMember11
	 * @generated
	 */
	EEnum getUpperBoundTypeMember11();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Imported URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Imported URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='importedURI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getImportedURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Max Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='maxInstances_._type' memberTypes='maxInstances_._type_._member_._0 maxInstances_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Max Instances Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='maxInstances_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember0();

	/**
	 * Returns the meta object for data type '{@link _12.MaxInstancesTypeMember1 <em>Max Instances Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member1 Object</em>'.
	 * @see _12.MaxInstancesTypeMember1
	 * @model instanceClass="_12.MaxInstancesTypeMember1"
	 *        extendedMetaData="name='maxInstances_._type_._member_._1:Object' baseType='maxInstances_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link _12.TBoolean <em>TBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TBoolean Object</em>'.
	 * @see _12.TBoolean
	 * @model instanceClass="_12.TBoolean"
	 *        extendedMetaData="name='tBoolean:Object' baseType='tBoolean'"
	 * @generated
	 */
	EDataType getTBooleanObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='upperBound_._type' memberTypes='upperBound_._type_._member_._0 upperBound_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Upper Bound Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type1</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='upperBound_._1_._type' memberTypes='upperBound_._1_._type_._member_._0 upperBound_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Upper Bound Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='upperBound_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember0();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Upper Bound Type Member01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member01</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='upperBound_._1_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember01();

	/**
	 * Returns the meta object for data type '{@link _12.UpperBoundTypeMember1 <em>Upper Bound Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member1 Object</em>'.
	 * @see _12.UpperBoundTypeMember1
	 * @model instanceClass="_12.UpperBoundTypeMember1"
	 *        extendedMetaData="name='upperBound_._type_._member_._1:Object' baseType='upperBound_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link _12.UpperBoundTypeMember11 <em>Upper Bound Type Member1 Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member1 Object1</em>'.
	 * @see _12.UpperBoundTypeMember11
	 * @model instanceClass="_12.UpperBoundTypeMember11"
	 *        extendedMetaData="name='upperBound_._1_._type_._member_._1:Object' baseType='upperBound_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember1Object1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_12Factory get_12Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link _12.impl.ArtifactReferencesTypeImpl <em>Artifact References Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ArtifactReferencesTypeImpl
		 * @see _12.impl._12PackageImpl#getArtifactReferencesType()
		 * @generated
		 */
		EClass ARTIFACT_REFERENCES_TYPE = eINSTANCE.getArtifactReferencesType();

		/**
		 * The meta object literal for the '<em><b>Artifact Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE = eINSTANCE.getArtifactReferencesType_ArtifactReference();

		/**
		 * The meta object literal for the '{@link _12.impl.CapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.CapabilitiesTypeImpl
		 * @see _12.impl._12PackageImpl#getCapabilitiesType()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE = eINSTANCE.getCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE__CAPABILITY = eINSTANCE.getCapabilitiesType_Capability();

		/**
		 * The meta object literal for the '{@link _12.impl.CapabilitiesType1Impl <em>Capabilities Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.CapabilitiesType1Impl
		 * @see _12.impl._12PackageImpl#getCapabilitiesType1()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE1 = eINSTANCE.getCapabilitiesType1();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE1__CAPABILITY = eINSTANCE.getCapabilitiesType1_Capability();

		/**
		 * The meta object literal for the '{@link _12.impl.CapabilityDefinitionsTypeImpl <em>Capability Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.CapabilityDefinitionsTypeImpl
		 * @see _12.impl._12PackageImpl#getCapabilityDefinitionsType()
		 * @generated
		 */
		EClass CAPABILITY_DEFINITIONS_TYPE = eINSTANCE.getCapabilityDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Capability Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION = eINSTANCE.getCapabilityDefinitionsType_CapabilityDefinition();

		/**
		 * The meta object literal for the '{@link _12.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ConstraintsTypeImpl
		 * @see _12.impl._12PackageImpl#getConstraintsType()
		 * @generated
		 */
		EClass CONSTRAINTS_TYPE = eINSTANCE.getConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_TYPE__CONSTRAINT = eINSTANCE.getConstraintsType_Constraint();

		/**
		 * The meta object literal for the '{@link _12.impl.ConstraintsType1Impl <em>Constraints Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ConstraintsType1Impl
		 * @see _12.impl._12PackageImpl#getConstraintsType1()
		 * @generated
		 */
		EClass CONSTRAINTS_TYPE1 = eINSTANCE.getConstraintsType1();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_TYPE1__CONSTRAINT = eINSTANCE.getConstraintsType1_Constraint();

		/**
		 * The meta object literal for the '{@link _12.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.DefinitionsTypeImpl
		 * @see _12.impl._12PackageImpl#getDefinitionsType()
		 * @generated
		 */
		EClass DEFINITIONS_TYPE = eINSTANCE.getDefinitionsType();

		/**
		 * The meta object literal for the '{@link _12.impl.DerivedFromTypeImpl <em>Derived From Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.DerivedFromTypeImpl
		 * @see _12.impl._12PackageImpl#getDerivedFromType()
		 * @generated
		 */
		EClass DERIVED_FROM_TYPE = eINSTANCE.getDerivedFromType();

		/**
		 * The meta object literal for the '<em><b>Relationship Type Implementation Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_FROM_TYPE__RELATIONSHIP_TYPE_IMPLEMENTATION_REF = eINSTANCE.getDerivedFromType_RelationshipTypeImplementationRef();

		/**
		 * The meta object literal for the '{@link _12.impl.DerivedFromType1Impl <em>Derived From Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.DerivedFromType1Impl
		 * @see _12.impl._12PackageImpl#getDerivedFromType1()
		 * @generated
		 */
		EClass DERIVED_FROM_TYPE1 = eINSTANCE.getDerivedFromType1();

		/**
		 * The meta object literal for the '<em><b>Node Type Implementation Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_FROM_TYPE1__NODE_TYPE_IMPLEMENTATION_REF = eINSTANCE.getDerivedFromType1_NodeTypeImplementationRef();

		/**
		 * The meta object literal for the '{@link _12.impl.DerivedFromType2Impl <em>Derived From Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.DerivedFromType2Impl
		 * @see _12.impl._12PackageImpl#getDerivedFromType2()
		 * @generated
		 */
		EClass DERIVED_FROM_TYPE2 = eINSTANCE.getDerivedFromType2();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_FROM_TYPE2__TYPE_REF = eINSTANCE.getDerivedFromType2_TypeRef();

		/**
		 * The meta object literal for the '{@link _12.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.DocumentRootImpl
		 * @see _12.impl._12PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFINITIONS = eINSTANCE.getDocumentRoot_Definitions();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '{@link _12.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ExcludeTypeImpl
		 * @see _12.impl._12PackageImpl#getExcludeType()
		 * @generated
		 */
		EClass EXCLUDE_TYPE = eINSTANCE.getExcludeType();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_TYPE__PATTERN = eINSTANCE.getExcludeType_Pattern();

		/**
		 * The meta object literal for the '{@link _12.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ExtensionsTypeImpl
		 * @see _12.impl._12PackageImpl#getExtensionsType()
		 * @generated
		 */
		EClass EXTENSIONS_TYPE = eINSTANCE.getExtensionsType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS_TYPE__EXTENSION = eINSTANCE.getExtensionsType_Extension();

		/**
		 * The meta object literal for the '{@link _12.impl.ImplementationArtifactTypeImpl <em>Implementation Artifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ImplementationArtifactTypeImpl
		 * @see _12.impl._12PackageImpl#getImplementationArtifactType()
		 * @generated
		 */
		EClass IMPLEMENTATION_ARTIFACT_TYPE = eINSTANCE.getImplementationArtifactType();

		/**
		 * The meta object literal for the '{@link _12.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.IncludeTypeImpl
		 * @see _12.impl._12PackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__PATTERN = eINSTANCE.getIncludeType_Pattern();

		/**
		 * The meta object literal for the '{@link _12.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.InputParametersTypeImpl
		 * @see _12.impl._12PackageImpl#getInputParametersType()
		 * @generated
		 */
		EClass INPUT_PARAMETERS_TYPE = eINSTANCE.getInputParametersType();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETERS_TYPE__INPUT_PARAMETER = eINSTANCE.getInputParametersType_InputParameter();

		/**
		 * The meta object literal for the '{@link _12.impl.InputParametersType1Impl <em>Input Parameters Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.InputParametersType1Impl
		 * @see _12.impl._12PackageImpl#getInputParametersType1()
		 * @generated
		 */
		EClass INPUT_PARAMETERS_TYPE1 = eINSTANCE.getInputParametersType1();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER = eINSTANCE.getInputParametersType1_InputParameter();

		/**
		 * The meta object literal for the '{@link _12.impl.InstanceStateTypeImpl <em>Instance State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.InstanceStateTypeImpl
		 * @see _12.impl._12PackageImpl#getInstanceStateType()
		 * @generated
		 */
		EClass INSTANCE_STATE_TYPE = eINSTANCE.getInstanceStateType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_STATE_TYPE__STATE = eINSTANCE.getInstanceStateType_State();

		/**
		 * The meta object literal for the '{@link _12.impl.InterfacesTypeImpl <em>Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.InterfacesTypeImpl
		 * @see _12.impl._12PackageImpl#getInterfacesType()
		 * @generated
		 */
		EClass INTERFACES_TYPE = eINSTANCE.getInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_TYPE__INTERFACE = eINSTANCE.getInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link _12.impl.InterfacesType1Impl <em>Interfaces Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.InterfacesType1Impl
		 * @see _12.impl._12PackageImpl#getInterfacesType1()
		 * @generated
		 */
		EClass INTERFACES_TYPE1 = eINSTANCE.getInterfacesType1();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_TYPE1__INTERFACE = eINSTANCE.getInterfacesType1_Interface();

		/**
		 * The meta object literal for the '{@link _12.impl.NodeOperationTypeImpl <em>Node Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.NodeOperationTypeImpl
		 * @see _12.impl._12PackageImpl#getNodeOperationType()
		 * @generated
		 */
		EClass NODE_OPERATION_TYPE = eINSTANCE.getNodeOperationType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__INTERFACE_NAME = eINSTANCE.getNodeOperationType_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Node Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__NODE_REF = eINSTANCE.getNodeOperationType_NodeRef();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__OPERATION_NAME = eINSTANCE.getNodeOperationType_OperationName();

		/**
		 * The meta object literal for the '{@link _12.impl.NodeTypeReferenceTypeImpl <em>Node Type Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.NodeTypeReferenceTypeImpl
		 * @see _12.impl._12PackageImpl#getNodeTypeReferenceType()
		 * @generated
		 */
		EClass NODE_TYPE_REFERENCE_TYPE = eINSTANCE.getNodeTypeReferenceType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE_REFERENCE_TYPE__TYPE_REF = eINSTANCE.getNodeTypeReferenceType_TypeRef();

		/**
		 * The meta object literal for the '{@link _12.impl.OutputParametersTypeImpl <em>Output Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.OutputParametersTypeImpl
		 * @see _12.impl._12PackageImpl#getOutputParametersType()
		 * @generated
		 */
		EClass OUTPUT_PARAMETERS_TYPE = eINSTANCE.getOutputParametersType();

		/**
		 * The meta object literal for the '<em><b>Output Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER = eINSTANCE.getOutputParametersType_OutputParameter();

		/**
		 * The meta object literal for the '{@link _12.impl.OutputParametersType1Impl <em>Output Parameters Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.OutputParametersType1Impl
		 * @see _12.impl._12PackageImpl#getOutputParametersType1()
		 * @generated
		 */
		EClass OUTPUT_PARAMETERS_TYPE1 = eINSTANCE.getOutputParametersType1();

		/**
		 * The meta object literal for the '<em><b>Output Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PARAMETERS_TYPE1__OUTPUT_PARAMETER = eINSTANCE.getOutputParametersType1_OutputParameter();

		/**
		 * The meta object literal for the '{@link _12.impl.PlanModelReferenceTypeImpl <em>Plan Model Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PlanModelReferenceTypeImpl
		 * @see _12.impl._12PackageImpl#getPlanModelReferenceType()
		 * @generated
		 */
		EClass PLAN_MODEL_REFERENCE_TYPE = eINSTANCE.getPlanModelReferenceType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_MODEL_REFERENCE_TYPE__REFERENCE = eINSTANCE.getPlanModelReferenceType_Reference();

		/**
		 * The meta object literal for the '{@link _12.impl.PlanModelTypeImpl <em>Plan Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PlanModelTypeImpl
		 * @see _12.impl._12PackageImpl#getPlanModelType()
		 * @generated
		 */
		EClass PLAN_MODEL_TYPE = eINSTANCE.getPlanModelType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_MODEL_TYPE__ANY = eINSTANCE.getPlanModelType_Any();

		/**
		 * The meta object literal for the '{@link _12.impl.PlanTypeImpl <em>Plan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PlanTypeImpl
		 * @see _12.impl._12PackageImpl#getPlanType()
		 * @generated
		 */
		EClass PLAN_TYPE = eINSTANCE.getPlanType();

		/**
		 * The meta object literal for the '<em><b>Plan Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_TYPE__PLAN_REF = eINSTANCE.getPlanType_PlanRef();

		/**
		 * The meta object literal for the '{@link _12.impl.PoliciesTypeImpl <em>Policies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PoliciesTypeImpl
		 * @see _12.impl._12PackageImpl#getPoliciesType()
		 * @generated
		 */
		EClass POLICIES_TYPE = eINSTANCE.getPoliciesType();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICIES_TYPE__POLICY = eINSTANCE.getPoliciesType_Policy();

		/**
		 * The meta object literal for the '{@link _12.impl.PoliciesType1Impl <em>Policies Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PoliciesType1Impl
		 * @see _12.impl._12PackageImpl#getPoliciesType1()
		 * @generated
		 */
		EClass POLICIES_TYPE1 = eINSTANCE.getPoliciesType1();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICIES_TYPE1__POLICY = eINSTANCE.getPoliciesType1_Policy();

		/**
		 * The meta object literal for the '{@link _12.impl.PropertiesDefinitionTypeImpl <em>Properties Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PropertiesDefinitionTypeImpl
		 * @see _12.impl._12PackageImpl#getPropertiesDefinitionType()
		 * @generated
		 */
		EClass PROPERTIES_DEFINITION_TYPE = eINSTANCE.getPropertiesDefinitionType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DEFINITION_TYPE__ELEMENT = eINSTANCE.getPropertiesDefinitionType_Element();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DEFINITION_TYPE__TYPE = eINSTANCE.getPropertiesDefinitionType_Type();

		/**
		 * The meta object literal for the '<em><b>Has Som Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_DEFINITION_TYPE__HAS_SOM_PROPERTIES = eINSTANCE.getPropertiesDefinitionType_HasSomProperties();

		/**
		 * The meta object literal for the '{@link _12.impl.TPropertyImpl <em>TProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPropertyImpl
		 * @see _12.impl._12PackageImpl#getTProperty()
		 * @generated
		 */
		EClass TPROPERTY = eINSTANCE.getTProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY__NAME = eINSTANCE.getTProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY__VALUE = eINSTANCE.getTProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY__DEFAULT_VALUE = eINSTANCE.getTProperty_DefaultValue();

		/**
		 * The meta object literal for the '{@link _12.impl.PropertiesType1Impl <em>Properties Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PropertiesType1Impl
		 * @see _12.impl._12PackageImpl#getPropertiesType1()
		 * @generated
		 */
		EClass PROPERTIES_TYPE1 = eINSTANCE.getPropertiesType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE1__ANY = eINSTANCE.getPropertiesType1_Any();

		/**
		 * The meta object literal for the '<em><b>Property Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE1__PROPERTY_MAPPINGS = eINSTANCE.getPropertiesType1_PropertyMappings();

		/**
		 * The meta object literal for the '{@link _12.impl.PropertyConstraintsTypeImpl <em>Property Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PropertyConstraintsTypeImpl
		 * @see _12.impl._12PackageImpl#getPropertyConstraintsType()
		 * @generated
		 */
		EClass PROPERTY_CONSTRAINTS_TYPE = eINSTANCE.getPropertyConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Property Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT = eINSTANCE.getPropertyConstraintsType_PropertyConstraint();

		/**
		 * The meta object literal for the '{@link _12.impl.PropertyConstraintsType1Impl <em>Property Constraints Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PropertyConstraintsType1Impl
		 * @see _12.impl._12PackageImpl#getPropertyConstraintsType1()
		 * @generated
		 */
		EClass PROPERTY_CONSTRAINTS_TYPE1 = eINSTANCE.getPropertyConstraintsType1();

		/**
		 * The meta object literal for the '<em><b>Property Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT = eINSTANCE.getPropertyConstraintsType1_PropertyConstraint();

		/**
		 * The meta object literal for the '{@link _12.impl.PropertyMappingsTypeImpl <em>Property Mappings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PropertyMappingsTypeImpl
		 * @see _12.impl._12PackageImpl#getPropertyMappingsType()
		 * @generated
		 */
		EClass PROPERTY_MAPPINGS_TYPE = eINSTANCE.getPropertyMappingsType();

		/**
		 * The meta object literal for the '<em><b>Property Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING = eINSTANCE.getPropertyMappingsType_PropertyMapping();

		/**
		 * The meta object literal for the '{@link _12.impl.RelationshipConstraintsTypeImpl <em>Relationship Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.RelationshipConstraintsTypeImpl
		 * @see _12.impl._12PackageImpl#getRelationshipConstraintsType()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINTS_TYPE = eINSTANCE.getRelationshipConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Relationship Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraintsType_RelationshipConstraint();

		/**
		 * The meta object literal for the '{@link _12.impl.RelationshipConstraintTypeImpl <em>Relationship Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.RelationshipConstraintTypeImpl
		 * @see _12.impl._12PackageImpl#getRelationshipConstraintType()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINT_TYPE = eINSTANCE.getRelationshipConstraintType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_CONSTRAINT_TYPE__ANY = eINSTANCE.getRelationshipConstraintType_Any();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE = eINSTANCE.getRelationshipConstraintType_ConstraintType();

		/**
		 * The meta object literal for the '{@link _12.impl.RelationshipOperationTypeImpl <em>Relationship Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.RelationshipOperationTypeImpl
		 * @see _12.impl._12PackageImpl#getRelationshipOperationType()
		 * @generated
		 */
		EClass RELATIONSHIP_OPERATION_TYPE = eINSTANCE.getRelationshipOperationType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME = eINSTANCE.getRelationshipOperationType_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME = eINSTANCE.getRelationshipOperationType_OperationName();

		/**
		 * The meta object literal for the '<em><b>Relationship Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF = eINSTANCE.getRelationshipOperationType_RelationshipRef();

		/**
		 * The meta object literal for the '{@link _12.impl.RequirementDefinitionsTypeImpl <em>Requirement Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.RequirementDefinitionsTypeImpl
		 * @see _12.impl._12PackageImpl#getRequirementDefinitionsType()
		 * @generated
		 */
		EClass REQUIREMENT_DEFINITIONS_TYPE = eINSTANCE.getRequirementDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Requirement Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION = eINSTANCE.getRequirementDefinitionsType_RequirementDefinition();

		/**
		 * The meta object literal for the '{@link _12.impl.RequirementsTypeImpl <em>Requirements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.RequirementsTypeImpl
		 * @see _12.impl._12PackageImpl#getRequirementsType()
		 * @generated
		 */
		EClass REQUIREMENTS_TYPE = eINSTANCE.getRequirementsType();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_TYPE__REQUIREMENT = eINSTANCE.getRequirementsType_Requirement();

		/**
		 * The meta object literal for the '{@link _12.impl.RequirementsType1Impl <em>Requirements Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.RequirementsType1Impl
		 * @see _12.impl._12PackageImpl#getRequirementsType1()
		 * @generated
		 */
		EClass REQUIREMENTS_TYPE1 = eINSTANCE.getRequirementsType1();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_TYPE1__REQUIREMENT = eINSTANCE.getRequirementsType1_Requirement();

		/**
		 * The meta object literal for the '{@link _12.impl.SourceElementTypeImpl <em>Source Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.SourceElementTypeImpl
		 * @see _12.impl._12PackageImpl#getSourceElementType()
		 * @generated
		 */
		EClass SOURCE_ELEMENT_TYPE = eINSTANCE.getSourceElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_ELEMENT_TYPE__REF = eINSTANCE.getSourceElementType_Ref();

		/**
		 * The meta object literal for the '{@link _12.impl.SourceInterfacesTypeImpl <em>Source Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.SourceInterfacesTypeImpl
		 * @see _12.impl._12PackageImpl#getSourceInterfacesType()
		 * @generated
		 */
		EClass SOURCE_INTERFACES_TYPE = eINSTANCE.getSourceInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_INTERFACES_TYPE__INTERFACE = eINSTANCE.getSourceInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link _12.impl.TAppliesToImpl <em>TApplies To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TAppliesToImpl
		 * @see _12.impl._12PackageImpl#getTAppliesTo()
		 * @generated
		 */
		EClass TAPPLIES_TO = eINSTANCE.getTAppliesTo();

		/**
		 * The meta object literal for the '<em><b>Node Type Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAPPLIES_TO__NODE_TYPE_REFERENCE = eINSTANCE.getTAppliesTo_NodeTypeReference();

		/**
		 * The meta object literal for the '{@link _12.impl.TargetElementTypeImpl <em>Target Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TargetElementTypeImpl
		 * @see _12.impl._12PackageImpl#getTargetElementType()
		 * @generated
		 */
		EClass TARGET_ELEMENT_TYPE = eINSTANCE.getTargetElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_ELEMENT_TYPE__REF = eINSTANCE.getTargetElementType_Ref();

		/**
		 * The meta object literal for the '{@link _12.impl.TargetInterfacesTypeImpl <em>Target Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TargetInterfacesTypeImpl
		 * @see _12.impl._12PackageImpl#getTargetInterfacesType()
		 * @generated
		 */
		EClass TARGET_INTERFACES_TYPE = eINSTANCE.getTargetInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_INTERFACES_TYPE__INTERFACE = eINSTANCE.getTargetInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link _12.impl.TArtifactReferenceImpl <em>TArtifact Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TArtifactReferenceImpl
		 * @see _12.impl._12PackageImpl#getTArtifactReference()
		 * @generated
		 */
		EClass TARTIFACT_REFERENCE = eINSTANCE.getTArtifactReference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_REFERENCE__GROUP = eINSTANCE.getTArtifactReference_Group();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_REFERENCE__INCLUDE = eINSTANCE.getTArtifactReference_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_REFERENCE__EXCLUDE = eINSTANCE.getTArtifactReference_Exclude();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_REFERENCE__REFERENCE = eINSTANCE.getTArtifactReference_Reference();

		/**
		 * The meta object literal for the '{@link _12.impl.TArtifactTemplateImpl <em>TArtifact Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TArtifactTemplateImpl
		 * @see _12.impl._12PackageImpl#getTArtifactTemplate()
		 * @generated
		 */
		EClass TARTIFACT_TEMPLATE = eINSTANCE.getTArtifactTemplate();

		/**
		 * The meta object literal for the '<em><b>Artifact References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES = eINSTANCE.getTArtifactTemplate_ArtifactReferences();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_TEMPLATE__NAME = eINSTANCE.getTArtifactTemplate_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TArtifactTypeImpl <em>TArtifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TArtifactTypeImpl
		 * @see _12.impl._12PackageImpl#getTArtifactType()
		 * @generated
		 */
		EClass TARTIFACT_TYPE = eINSTANCE.getTArtifactType();

		/**
		 * The meta object literal for the '<em><b>Meta Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_TYPE__META_TYPE = eINSTANCE.getTArtifactType_MetaType();

		/**
		 * The meta object literal for the '{@link _12.impl.TBoundaryDefinitionsImpl <em>TBoundary Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TBoundaryDefinitionsImpl
		 * @see _12.impl._12PackageImpl#getTBoundaryDefinitions()
		 * @generated
		 */
		EClass TBOUNDARY_DEFINITIONS = eINSTANCE.getTBoundaryDefinitions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__PROPERTIES = eINSTANCE.getTBoundaryDefinitions_Properties();

		/**
		 * The meta object literal for the '<em><b>Property Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS = eINSTANCE.getTBoundaryDefinitions_PropertyConstraints();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__REQUIREMENTS = eINSTANCE.getTBoundaryDefinitions_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__CAPABILITIES = eINSTANCE.getTBoundaryDefinitions_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__POLICIES = eINSTANCE.getTBoundaryDefinitions_Policies();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__INTERFACES = eINSTANCE.getTBoundaryDefinitions_Interfaces();

		/**
		 * The meta object literal for the '{@link _12.impl.TCapabilityImpl <em>TCapability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TCapabilityImpl
		 * @see _12.impl._12PackageImpl#getTCapability()
		 * @generated
		 */
		EClass TCAPABILITY = eINSTANCE.getTCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY__NAME = eINSTANCE.getTCapability_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TCapabilityDefinitionImpl <em>TCapability Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TCapabilityDefinitionImpl
		 * @see _12.impl._12PackageImpl#getTCapabilityDefinition()
		 * @generated
		 */
		EClass TCAPABILITY_DEFINITION = eINSTANCE.getTCapabilityDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCAPABILITY_DEFINITION__CONSTRAINTS = eINSTANCE.getTCapabilityDefinition_Constraints();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__CAPABILITY_TYPE = eINSTANCE.getTCapabilityDefinition_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__LOWER_BOUND = eINSTANCE.getTCapabilityDefinition_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__NAME = eINSTANCE.getTCapabilityDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__UPPER_BOUND = eINSTANCE.getTCapabilityDefinition_UpperBound();

		/**
		 * The meta object literal for the '{@link _12.impl.TCapabilityRefImpl <em>TCapability Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TCapabilityRefImpl
		 * @see _12.impl._12PackageImpl#getTCapabilityRef()
		 * @generated
		 */
		EClass TCAPABILITY_REF = eINSTANCE.getTCapabilityRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_REF__NAME = eINSTANCE.getTCapabilityRef_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_REF__REF = eINSTANCE.getTCapabilityRef_Ref();

		/**
		 * The meta object literal for the '{@link _12.impl.TCapabilityTypeImpl <em>TCapability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TCapabilityTypeImpl
		 * @see _12.impl._12PackageImpl#getTCapabilityType()
		 * @generated
		 */
		EClass TCAPABILITY_TYPE = eINSTANCE.getTCapabilityType();

		/**
		 * The meta object literal for the '{@link _12.impl.TConditionImpl <em>TCondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TConditionImpl
		 * @see _12.impl._12PackageImpl#getTCondition()
		 * @generated
		 */
		EClass TCONDITION = eINSTANCE.getTCondition();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITION__ANY = eINSTANCE.getTCondition_Any();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITION__EXPRESSION_LANGUAGE = eINSTANCE.getTCondition_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link _12.impl.TConstraintImpl <em>TConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TConstraintImpl
		 * @see _12.impl._12PackageImpl#getTConstraint()
		 * @generated
		 */
		EClass TCONSTRAINT = eINSTANCE.getTConstraint();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONSTRAINT__ANY = eINSTANCE.getTConstraint_Any();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getTConstraint_ConstraintType();

		/**
		 * The meta object literal for the '{@link _12.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TDefinitionsImpl
		 * @see _12.impl._12PackageImpl#getTDefinitions()
		 * @generated
		 */
		EClass TDEFINITIONS = eINSTANCE.getTDefinitions();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__EXTENSIONS = eINSTANCE.getTDefinitions_Extensions();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__IMPORT = eINSTANCE.getTDefinitions_Import();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__TYPES = eINSTANCE.getTDefinitions_Types();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__GROUP = eINSTANCE.getTDefinitions_Group();

		/**
		 * The meta object literal for the '<em><b>Service Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__SERVICE_TEMPLATE = eINSTANCE.getTDefinitions_ServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__NODE_TYPE = eINSTANCE.getTDefinitions_NodeType();

		/**
		 * The meta object literal for the '<em><b>Node Type Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__NODE_TYPE_IMPLEMENTATION = eINSTANCE.getTDefinitions_NodeTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__RELATIONSHIP_TYPE = eINSTANCE.getTDefinitions_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Relationship Type Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION = eINSTANCE.getTDefinitions_RelationshipTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__REQUIREMENT_TYPE = eINSTANCE.getTDefinitions_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__CAPABILITY_TYPE = eINSTANCE.getTDefinitions_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ARTIFACT_TYPE = eINSTANCE.getTDefinitions_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Artifact Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ARTIFACT_TEMPLATE = eINSTANCE.getTDefinitions_ArtifactTemplate();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__POLICY_TYPE = eINSTANCE.getTDefinitions_PolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__POLICY_TEMPLATE = eINSTANCE.getTDefinitions_PolicyTemplate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__ID = eINSTANCE.getTDefinitions_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__NAME = eINSTANCE.getTDefinitions_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__TARGET_NAMESPACE = eINSTANCE.getTDefinitions_TargetNamespace();

		/**
		 * The meta object literal for the '{@link _12.impl.TDeploymentArtifactImpl <em>TDeployment Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TDeploymentArtifactImpl
		 * @see _12.impl._12PackageImpl#getTDeploymentArtifact()
		 * @generated
		 */
		EClass TDEPLOYMENT_ARTIFACT = eINSTANCE.getTDeploymentArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__ARTIFACT_REF = eINSTANCE.getTDeploymentArtifact_ArtifactRef();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE = eINSTANCE.getTDeploymentArtifact_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__NAME = eINSTANCE.getTDeploymentArtifact_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TDeploymentArtifactsImpl <em>TDeployment Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TDeploymentArtifactsImpl
		 * @see _12.impl._12PackageImpl#getTDeploymentArtifacts()
		 * @generated
		 */
		EClass TDEPLOYMENT_ARTIFACTS = eINSTANCE.getTDeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT = eINSTANCE.getTDeploymentArtifacts_DeploymentArtifact();

		/**
		 * The meta object literal for the '{@link _12.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TDocumentationImpl
		 * @see _12.impl._12PackageImpl#getTDocumentation()
		 * @generated
		 */
		EClass TDOCUMENTATION = eINSTANCE.getTDocumentation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__MIXED = eINSTANCE.getTDocumentation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__ANY = eINSTANCE.getTDocumentation_Any();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__LANG = eINSTANCE.getTDocumentation_Lang();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__SOURCE = eINSTANCE.getTDocumentation_Source();

		/**
		 * The meta object literal for the '{@link _12.impl.TEntityTemplateImpl <em>TEntity Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TEntityTemplateImpl
		 * @see _12.impl._12PackageImpl#getTEntityTemplate()
		 * @generated
		 */
		EClass TENTITY_TEMPLATE = eINSTANCE.getTEntityTemplate();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__PROPERTIES = eINSTANCE.getTEntityTemplate_Properties();

		/**
		 * The meta object literal for the '<em><b>Property Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS = eINSTANCE.getTEntityTemplate_PropertyConstraints();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TEMPLATE__ID = eINSTANCE.getTEntityTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TEMPLATE__TYPE = eINSTANCE.getTEntityTemplate_Type();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__ATTRIBUTES = eINSTANCE.getTEntityTemplate_Attributes();

		/**
		 * The meta object literal for the '<em><b>Node Has Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__NODE_HAS_INTERFACE = eINSTANCE.getTEntityTemplate_NodeHasInterface();

		/**
		 * The meta object literal for the '<em><b>Node Has Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__NODE_HAS_RELATIONS = eINSTANCE.getTEntityTemplate_NodeHasRelations();

		/**
		 * The meta object literal for the '{@link _12.impl.TEntityTypeImpl <em>TEntity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TEntityTypeImpl
		 * @see _12.impl._12PackageImpl#getTEntityType()
		 * @generated
		 */
		EClass TENTITY_TYPE = eINSTANCE.getTEntityType();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__TAGS = eINSTANCE.getTEntityType_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__DERIVED_FROM = eINSTANCE.getTEntityType_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Properties Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__PROPERTIES_DEFINITION = eINSTANCE.getTEntityType_PropertiesDefinition();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__ABSTRACT = eINSTANCE.getTEntityType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__FINAL = eINSTANCE.getTEntityType_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__NAME = eINSTANCE.getTEntityType_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__TARGET_NAMESPACE = eINSTANCE.getTEntityType_TargetNamespace();

		/**
		 * The meta object literal for the '{@link _12.impl.TExportedInterfaceImpl <em>TExported Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TExportedInterfaceImpl
		 * @see _12.impl._12PackageImpl#getTExportedInterface()
		 * @generated
		 */
		EClass TEXPORTED_INTERFACE = eINSTANCE.getTExportedInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_INTERFACE__OPERATION = eINSTANCE.getTExportedInterface_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPORTED_INTERFACE__NAME = eINSTANCE.getTExportedInterface_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TExportedOperationImpl <em>TExported Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TExportedOperationImpl
		 * @see _12.impl._12PackageImpl#getTExportedOperation()
		 * @generated
		 */
		EClass TEXPORTED_OPERATION = eINSTANCE.getTExportedOperation();

		/**
		 * The meta object literal for the '<em><b>Node Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__NODE_OPERATION = eINSTANCE.getTExportedOperation_NodeOperation();

		/**
		 * The meta object literal for the '<em><b>Relationship Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__RELATIONSHIP_OPERATION = eINSTANCE.getTExportedOperation_RelationshipOperation();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__PLAN = eINSTANCE.getTExportedOperation_Plan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPORTED_OPERATION__NAME = eINSTANCE.getTExportedOperation_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TExtensibleElementsImpl <em>TExtensible Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TExtensibleElementsImpl
		 * @see _12.impl._12PackageImpl#getTExtensibleElements()
		 * @generated
		 */
		EClass TEXTENSIBLE_ELEMENTS = eINSTANCE.getTExtensibleElements();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTENSIBLE_ELEMENTS__DOCUMENTATION = eINSTANCE.getTExtensibleElements_Documentation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSIBLE_ELEMENTS__ANY = eINSTANCE.getTExtensibleElements_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = eINSTANCE.getTExtensibleElements_AnyAttribute();

		/**
		 * The meta object literal for the '{@link _12.impl.TExtensionImpl <em>TExtension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TExtensionImpl
		 * @see _12.impl._12PackageImpl#getTExtension()
		 * @generated
		 */
		EClass TEXTENSION = eINSTANCE.getTExtension();

		/**
		 * The meta object literal for the '<em><b>Must Understand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSION__MUST_UNDERSTAND = eINSTANCE.getTExtension_MustUnderstand();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSION__NAMESPACE = eINSTANCE.getTExtension_Namespace();

		/**
		 * The meta object literal for the '{@link _12.impl.TExtensionsImpl <em>TExtensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TExtensionsImpl
		 * @see _12.impl._12PackageImpl#getTExtensions()
		 * @generated
		 */
		EClass TEXTENSIONS = eINSTANCE.getTExtensions();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTENSIONS__EXTENSION = eINSTANCE.getTExtensions_Extension();

		/**
		 * The meta object literal for the '{@link _12.impl.TImplementationArtifactImpl <em>TImplementation Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TImplementationArtifactImpl
		 * @see _12.impl._12PackageImpl#getTImplementationArtifact()
		 * @generated
		 */
		EClass TIMPLEMENTATION_ARTIFACT = eINSTANCE.getTImplementationArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF = eINSTANCE.getTImplementationArtifact_ArtifactRef();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE = eINSTANCE.getTImplementationArtifact_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME = eINSTANCE.getTImplementationArtifact_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__OPERATION_NAME = eINSTANCE.getTImplementationArtifact_OperationName();

		/**
		 * The meta object literal for the '{@link _12.impl.TImplementationArtifactsImpl <em>TImplementation Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TImplementationArtifactsImpl
		 * @see _12.impl._12PackageImpl#getTImplementationArtifacts()
		 * @generated
		 */
		EClass TIMPLEMENTATION_ARTIFACTS = eINSTANCE.getTImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT = eINSTANCE.getTImplementationArtifacts_ImplementationArtifact();

		/**
		 * The meta object literal for the '{@link _12.impl.TImportImpl <em>TImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TImportImpl
		 * @see _12.impl._12PackageImpl#getTImport()
		 * @generated
		 */
		EClass TIMPORT = eINSTANCE.getTImport();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__IMPORT_TYPE = eINSTANCE.getTImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__LOCATION = eINSTANCE.getTImport_Location();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__NAMESPACE = eINSTANCE.getTImport_Namespace();

		/**
		 * The meta object literal for the '{@link _12.impl.TInterfaceImpl <em>TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TInterfaceImpl
		 * @see _12.impl._12PackageImpl#getTInterface()
		 * @generated
		 */
		EClass TINTERFACE = eINSTANCE.getTInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__OPERATION = eINSTANCE.getTInterface_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINTERFACE__NAME = eINSTANCE.getTInterface_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TNodeTemplateImpl <em>TNode Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TNodeTemplateImpl
		 * @see _12.impl._12PackageImpl#getTNodeTemplate()
		 * @generated
		 */
		EClass TNODE_TEMPLATE = eINSTANCE.getTNodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__REQUIREMENTS = eINSTANCE.getTNodeTemplate_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__CAPABILITIES = eINSTANCE.getTNodeTemplate_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__POLICIES = eINSTANCE.getTNodeTemplate_Policies();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS = eINSTANCE.getTNodeTemplate_DeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__MAX_INSTANCES = eINSTANCE.getTNodeTemplate_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__MIN_INSTANCES = eINSTANCE.getTNodeTemplate_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__NAME = eINSTANCE.getTNodeTemplate_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TNodeTypeImpl <em>TNode Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TNodeTypeImpl
		 * @see _12.impl._12PackageImpl#getTNodeType()
		 * @generated
		 */
		EClass TNODE_TYPE = eINSTANCE.getTNodeType();

		/**
		 * The meta object literal for the '<em><b>Requirement Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__REQUIREMENT_DEFINITIONS = eINSTANCE.getTNodeType_RequirementDefinitions();

		/**
		 * The meta object literal for the '<em><b>Capability Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__CAPABILITY_DEFINITIONS = eINSTANCE.getTNodeType_CapabilityDefinitions();

		/**
		 * The meta object literal for the '<em><b>Instance States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__INSTANCE_STATES = eINSTANCE.getTNodeType_InstanceStates();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__INTERFACES = eINSTANCE.getTNodeType_Interfaces();

		/**
		 * The meta object literal for the '{@link _12.impl.TNodeTypeImplementationImpl <em>TNode Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TNodeTypeImplementationImpl
		 * @see _12.impl._12PackageImpl#getTNodeTypeImplementation()
		 * @generated
		 */
		EClass TNODE_TYPE_IMPLEMENTATION = eINSTANCE.getTNodeTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__TAGS = eINSTANCE.getTNodeTypeImplementation_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM = eINSTANCE.getTNodeTypeImplementation_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Required Container Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = eINSTANCE.getTNodeTypeImplementation_RequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = eINSTANCE.getTNodeTypeImplementation_ImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS = eINSTANCE.getTNodeTypeImplementation_DeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__ABSTRACT = eINSTANCE.getTNodeTypeImplementation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__FINAL = eINSTANCE.getTNodeTypeImplementation_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__NAME = eINSTANCE.getTNodeTypeImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__NODE_TYPE = eINSTANCE.getTNodeTypeImplementation_NodeType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = eINSTANCE.getTNodeTypeImplementation_TargetNamespace();

		/**
		 * The meta object literal for the '{@link _12.impl.TOperationImpl <em>TOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TOperationImpl
		 * @see _12.impl._12PackageImpl#getTOperation()
		 * @generated
		 */
		EClass TOPERATION = eINSTANCE.getTOperation();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPERATION__INPUT_PARAMETERS = eINSTANCE.getTOperation_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPERATION__OUTPUT_PARAMETERS = eINSTANCE.getTOperation_OutputParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPERATION__NAME = eINSTANCE.getTOperation_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TParameterImpl <em>TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TParameterImpl
		 * @see _12.impl._12PackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__NAME = eINSTANCE.getTParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__REQUIRED = eINSTANCE.getTParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__TYPE = eINSTANCE.getTParameter_Type();

		/**
		 * The meta object literal for the '{@link _12.impl.TPlanImpl <em>TPlan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPlanImpl
		 * @see _12.impl._12PackageImpl#getTPlan()
		 * @generated
		 */
		EClass TPLAN = eINSTANCE.getTPlan();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PRECONDITION = eINSTANCE.getTPlan_Precondition();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__INPUT_PARAMETERS = eINSTANCE.getTPlan_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__OUTPUT_PARAMETERS = eINSTANCE.getTPlan_OutputParameters();

		/**
		 * The meta object literal for the '<em><b>Plan Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PLAN_MODEL = eINSTANCE.getTPlan_PlanModel();

		/**
		 * The meta object literal for the '<em><b>Plan Model Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PLAN_MODEL_REFERENCE = eINSTANCE.getTPlan_PlanModelReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__ID = eINSTANCE.getTPlan_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__NAME = eINSTANCE.getTPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Plan Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__PLAN_LANGUAGE = eINSTANCE.getTPlan_PlanLanguage();

		/**
		 * The meta object literal for the '<em><b>Plan Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__PLAN_TYPE = eINSTANCE.getTPlan_PlanType();

		/**
		 * The meta object literal for the '{@link _12.impl.TPlansImpl <em>TPlans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPlansImpl
		 * @see _12.impl._12PackageImpl#getTPlans()
		 * @generated
		 */
		EClass TPLANS = eINSTANCE.getTPlans();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLANS__PLAN = eINSTANCE.getTPlans_Plan();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLANS__TARGET_NAMESPACE = eINSTANCE.getTPlans_TargetNamespace();

		/**
		 * The meta object literal for the '{@link _12.impl.TPolicyImpl <em>TPolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPolicyImpl
		 * @see _12.impl._12PackageImpl#getTPolicy()
		 * @generated
		 */
		EClass TPOLICY = eINSTANCE.getTPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__NAME = eINSTANCE.getTPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Policy Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__POLICY_REF = eINSTANCE.getTPolicy_PolicyRef();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__POLICY_TYPE = eINSTANCE.getTPolicy_PolicyType();

		/**
		 * The meta object literal for the '{@link _12.impl.TPolicyTemplateImpl <em>TPolicy Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPolicyTemplateImpl
		 * @see _12.impl._12PackageImpl#getTPolicyTemplate()
		 * @generated
		 */
		EClass TPOLICY_TEMPLATE = eINSTANCE.getTPolicyTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY_TEMPLATE__NAME = eINSTANCE.getTPolicyTemplate_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TPolicyTypeImpl <em>TPolicy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPolicyTypeImpl
		 * @see _12.impl._12PackageImpl#getTPolicyType()
		 * @generated
		 */
		EClass TPOLICY_TYPE = eINSTANCE.getTPolicyType();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPOLICY_TYPE__APPLIES_TO = eINSTANCE.getTPolicyType_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Policy Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY_TYPE__POLICY_LANGUAGE = eINSTANCE.getTPolicyType_PolicyLanguage();

		/**
		 * The meta object literal for the '{@link _12.impl.TPropertyConstraintImpl <em>TProperty Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPropertyConstraintImpl
		 * @see _12.impl._12PackageImpl#getTPropertyConstraint()
		 * @generated
		 */
		EClass TPROPERTY_CONSTRAINT = eINSTANCE.getTPropertyConstraint();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_CONSTRAINT__PROPERTY = eINSTANCE.getTPropertyConstraint_Property();

		/**
		 * The meta object literal for the '{@link _12.impl.TPropertyMappingImpl <em>TProperty Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TPropertyMappingImpl
		 * @see _12.impl._12PackageImpl#getTPropertyMapping()
		 * @generated
		 */
		EClass TPROPERTY_MAPPING = eINSTANCE.getTPropertyMapping();

		/**
		 * The meta object literal for the '<em><b>Service Template Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF = eINSTANCE.getTPropertyMapping_ServiceTemplatePropertyRef();

		/**
		 * The meta object literal for the '<em><b>Target Object Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__TARGET_OBJECT_REF = eINSTANCE.getTPropertyMapping_TargetObjectRef();

		/**
		 * The meta object literal for the '<em><b>Target Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__TARGET_PROPERTY_REF = eINSTANCE.getTPropertyMapping_TargetPropertyRef();

		/**
		 * The meta object literal for the '{@link _12.impl.TRelationshipTemplateImpl <em>TRelationship Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRelationshipTemplateImpl
		 * @see _12.impl._12PackageImpl#getTRelationshipTemplate()
		 * @generated
		 */
		EClass TRELATIONSHIP_TEMPLATE = eINSTANCE.getTRelationshipTemplate();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT = eINSTANCE.getTRelationshipTemplate_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT = eINSTANCE.getTRelationshipTemplate_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Relationship Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS = eINSTANCE.getTRelationshipTemplate_RelationshipConstraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TEMPLATE__NAME = eINSTANCE.getTRelationshipTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Uses Relation Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__USES_RELATION_TYPE = eINSTANCE.getTRelationshipTemplate_UsesRelationType();

		/**
		 * The meta object literal for the '{@link _12.impl.TRelationshipTypeImpl <em>TRelationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRelationshipTypeImpl
		 * @see _12.impl._12PackageImpl#getTRelationshipType()
		 * @generated
		 */
		EClass TRELATIONSHIP_TYPE = eINSTANCE.getTRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Instance States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__INSTANCE_STATES = eINSTANCE.getTRelationshipType_InstanceStates();

		/**
		 * The meta object literal for the '<em><b>Source Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__SOURCE_INTERFACES = eINSTANCE.getTRelationshipType_SourceInterfaces();

		/**
		 * The meta object literal for the '<em><b>Target Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__TARGET_INTERFACES = eINSTANCE.getTRelationshipType_TargetInterfaces();

		/**
		 * The meta object literal for the '<em><b>Valid Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__VALID_SOURCE = eINSTANCE.getTRelationshipType_ValidSource();

		/**
		 * The meta object literal for the '<em><b>Valid Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__VALID_TARGET = eINSTANCE.getTRelationshipType_ValidTarget();

		/**
		 * The meta object literal for the '{@link _12.impl.TRelationshipTypeImplementationImpl <em>TRelationship Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRelationshipTypeImplementationImpl
		 * @see _12.impl._12PackageImpl#getTRelationshipTypeImplementation()
		 * @generated
		 */
		EClass TRELATIONSHIP_TYPE_IMPLEMENTATION = eINSTANCE.getTRelationshipTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS = eINSTANCE.getTRelationshipTypeImplementation_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM = eINSTANCE.getTRelationshipTypeImplementation_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Required Container Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = eINSTANCE.getTRelationshipTypeImplementation_RequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = eINSTANCE.getTRelationshipTypeImplementation_ImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT = eINSTANCE.getTRelationshipTypeImplementation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL = eINSTANCE.getTRelationshipTypeImplementation_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME = eINSTANCE.getTRelationshipTypeImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE = eINSTANCE.getTRelationshipTypeImplementation_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = eINSTANCE.getTRelationshipTypeImplementation_TargetNamespace();

		/**
		 * The meta object literal for the '{@link _12.impl.TRequiredContainerFeatureImpl <em>TRequired Container Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRequiredContainerFeatureImpl
		 * @see _12.impl._12PackageImpl#getTRequiredContainerFeature()
		 * @generated
		 */
		EClass TREQUIRED_CONTAINER_FEATURE = eINSTANCE.getTRequiredContainerFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIRED_CONTAINER_FEATURE__FEATURE = eINSTANCE.getTRequiredContainerFeature_Feature();

		/**
		 * The meta object literal for the '{@link _12.impl.TRequiredContainerFeaturesImpl <em>TRequired Container Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRequiredContainerFeaturesImpl
		 * @see _12.impl._12PackageImpl#getTRequiredContainerFeatures()
		 * @generated
		 */
		EClass TREQUIRED_CONTAINER_FEATURES = eINSTANCE.getTRequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Required Container Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE = eINSTANCE.getTRequiredContainerFeatures_RequiredContainerFeature();

		/**
		 * The meta object literal for the '{@link _12.impl.TRequirementImpl <em>TRequirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRequirementImpl
		 * @see _12.impl._12PackageImpl#getTRequirement()
		 * @generated
		 */
		EClass TREQUIREMENT = eINSTANCE.getTRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT__NAME = eINSTANCE.getTRequirement_Name();

		/**
		 * The meta object literal for the '{@link _12.impl.TRequirementDefinitionImpl <em>TRequirement Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRequirementDefinitionImpl
		 * @see _12.impl._12PackageImpl#getTRequirementDefinition()
		 * @generated
		 */
		EClass TREQUIREMENT_DEFINITION = eINSTANCE.getTRequirementDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIREMENT_DEFINITION__CONSTRAINTS = eINSTANCE.getTRequirementDefinition_Constraints();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__LOWER_BOUND = eINSTANCE.getTRequirementDefinition_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__NAME = eINSTANCE.getTRequirementDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE = eINSTANCE.getTRequirementDefinition_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__UPPER_BOUND = eINSTANCE.getTRequirementDefinition_UpperBound();

		/**
		 * The meta object literal for the '{@link _12.impl.TRequirementRefImpl <em>TRequirement Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRequirementRefImpl
		 * @see _12.impl._12PackageImpl#getTRequirementRef()
		 * @generated
		 */
		EClass TREQUIREMENT_REF = eINSTANCE.getTRequirementRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_REF__NAME = eINSTANCE.getTRequirementRef_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_REF__REF = eINSTANCE.getTRequirementRef_Ref();

		/**
		 * The meta object literal for the '{@link _12.impl.TRequirementTypeImpl <em>TRequirement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TRequirementTypeImpl
		 * @see _12.impl._12PackageImpl#getTRequirementType()
		 * @generated
		 */
		EClass TREQUIREMENT_TYPE = eINSTANCE.getTRequirementType();

		/**
		 * The meta object literal for the '<em><b>Required Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE = eINSTANCE.getTRequirementType_RequiredCapabilityType();

		/**
		 * The meta object literal for the '{@link _12.impl.TServiceTemplateImpl <em>TService Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TServiceTemplateImpl
		 * @see _12.impl._12PackageImpl#getTServiceTemplate()
		 * @generated
		 */
		EClass TSERVICE_TEMPLATE = eINSTANCE.getTServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__TAGS = eINSTANCE.getTServiceTemplate_Tags();

		/**
		 * The meta object literal for the '<em><b>Boundary Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS = eINSTANCE.getTServiceTemplate_BoundaryDefinitions();

		/**
		 * The meta object literal for the '<em><b>Topology Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE = eINSTANCE.getTServiceTemplate_TopologyTemplate();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__PLANS = eINSTANCE.getTServiceTemplate_Plans();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__ID = eINSTANCE.getTServiceTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__NAME = eINSTANCE.getTServiceTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Substitutable Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE = eINSTANCE.getTServiceTemplate_SubstitutableNodeType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__TARGET_NAMESPACE = eINSTANCE.getTServiceTemplate_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Has Node Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__HAS_NODE_TYPE = eINSTANCE.getTServiceTemplate_HasNodeType();

		/**
		 * The meta object literal for the '<em><b>Has Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__HAS_RELATIONSHIP = eINSTANCE.getTServiceTemplate_HasRelationship();

		/**
		 * The meta object literal for the '<em><b>Has Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__HAS_IMPORTS = eINSTANCE.getTServiceTemplate_HasImports();

		/**
		 * The meta object literal for the '{@link _12.impl.TTagImpl <em>TTag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TTagImpl
		 * @see _12.impl._12PackageImpl#getTTag()
		 * @generated
		 */
		EClass TTAG = eINSTANCE.getTTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTAG__NAME = eINSTANCE.getTTag_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTAG__VALUE = eINSTANCE.getTTag_Value();

		/**
		 * The meta object literal for the '{@link _12.impl.TTagsImpl <em>TTags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TTagsImpl
		 * @see _12.impl._12PackageImpl#getTTags()
		 * @generated
		 */
		EClass TTAGS = eINSTANCE.getTTags();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTAGS__TAG = eINSTANCE.getTTags_Tag();

		/**
		 * The meta object literal for the '{@link _12.impl.TTopologyElementInstanceStatesImpl <em>TTopology Element Instance States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TTopologyElementInstanceStatesImpl
		 * @see _12.impl._12PackageImpl#getTTopologyElementInstanceStates()
		 * @generated
		 */
		EClass TTOPOLOGY_ELEMENT_INSTANCE_STATES = eINSTANCE.getTTopologyElementInstanceStates();

		/**
		 * The meta object literal for the '<em><b>Instance State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE = eINSTANCE.getTTopologyElementInstanceStates_InstanceState();

		/**
		 * The meta object literal for the '{@link _12.impl.TTopologyTemplateImpl <em>TTopology Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TTopologyTemplateImpl
		 * @see _12.impl._12PackageImpl#getTTopologyTemplate()
		 * @generated
		 */
		EClass TTOPOLOGY_TEMPLATE = eINSTANCE.getTTopologyTemplate();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTOPOLOGY_TEMPLATE__GROUP = eINSTANCE.getTTopologyTemplate_Group();

		/**
		 * The meta object literal for the '<em><b>Node Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__NODE_TEMPLATE = eINSTANCE.getTTopologyTemplate_NodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Relationship Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE = eINSTANCE.getTTopologyTemplate_RelationshipTemplate();

		/**
		 * The meta object literal for the '<em><b>Has Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__HAS_INPUTS = eINSTANCE.getTTopologyTemplate_HasInputs();

		/**
		 * The meta object literal for the '<em><b>Hasout Puts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__HASOUT_PUTS = eINSTANCE.getTTopologyTemplate_HasoutPuts();

		/**
		 * The meta object literal for the '{@link _12.impl.TypesTypeImpl <em>Types Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TypesTypeImpl
		 * @see _12.impl._12PackageImpl#getTypesType()
		 * @generated
		 */
		EClass TYPES_TYPE = eINSTANCE.getTypesType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES_TYPE__ANY = eINSTANCE.getTypesType_Any();

		/**
		 * The meta object literal for the '{@link _12.impl.ValidSourceTypeImpl <em>Valid Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ValidSourceTypeImpl
		 * @see _12.impl._12PackageImpl#getValidSourceType()
		 * @generated
		 */
		EClass VALID_SOURCE_TYPE = eINSTANCE.getValidSourceType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_SOURCE_TYPE__TYPE_REF = eINSTANCE.getValidSourceType_TypeRef();

		/**
		 * The meta object literal for the '{@link _12.impl.ValidTargetTypeImpl <em>Valid Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.ValidTargetTypeImpl
		 * @see _12.impl._12PackageImpl#getValidTargetType()
		 * @generated
		 */
		EClass VALID_TARGET_TYPE = eINSTANCE.getValidTargetType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_TARGET_TYPE__TYPE_REF = eINSTANCE.getValidTargetType_TypeRef();

		/**
		 * The meta object literal for the '{@link _12.impl.testDdefinitionImpl <em>test Ddefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.testDdefinitionImpl
		 * @see _12.impl._12PackageImpl#gettestDdefinition()
		 * @generated
		 */
		EClass TEST_DDEFINITION = eINSTANCE.gettestDdefinition();

		/**
		 * The meta object literal for the '<em><b>Testrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_DDEFINITION__TESTRELATION = eINSTANCE.gettestDdefinition_Testrelation();

		/**
		 * The meta object literal for the '{@link _12.impl.TAttributeImpl <em>TAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TAttributeImpl
		 * @see _12.impl._12PackageImpl#getTAttribute()
		 * @generated
		 */
		EClass TATTRIBUTE = eINSTANCE.getTAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATTRIBUTE__NAME = eINSTANCE.getTAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATTRIBUTE__VALUE = eINSTANCE.getTAttribute_Value();

		/**
		 * The meta object literal for the '{@link _12.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.AttributesTypeImpl
		 * @see _12.impl._12PackageImpl#getAttributesType()
		 * @generated
		 */
		EClass ATTRIBUTES_TYPE = eINSTANCE.getAttributesType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES_TYPE__ATTRIBUTE = eINSTANCE.getAttributesType_Attribute();

		/**
		 * The meta object literal for the '{@link _12.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.PropertiesTypeImpl
		 * @see _12.impl._12PackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__PROPERTY = eINSTANCE.getPropertiesType_Property();

		/**
		 * The meta object literal for the '{@link _12.impl.TInputTemplateImpl <em>TInput Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TInputTemplateImpl
		 * @see _12.impl._12PackageImpl#getTInputTemplate()
		 * @generated
		 */
		EClass TINPUT_TEMPLATE = eINSTANCE.getTInputTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINPUT_TEMPLATE__NAME = eINSTANCE.getTInputTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINPUT_TEMPLATE__VALUE = eINSTANCE.getTInputTemplate_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINPUT_TEMPLATE__DESCRIPTION = eINSTANCE.getTInputTemplate_Description();

		/**
		 * The meta object literal for the '{@link _12.impl.TOutputTemplateImpl <em>TOutput Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TOutputTemplateImpl
		 * @see _12.impl._12PackageImpl#getTOutputTemplate()
		 * @generated
		 */
		EClass TOUTPUT_TEMPLATE = eINSTANCE.getTOutputTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUTPUT_TEMPLATE__NAME = eINSTANCE.getTOutputTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUTPUT_TEMPLATE__VALUE = eINSTANCE.getTOutputTemplate_Value();

		/**
		 * The meta object literal for the '{@link _12.impl.TimportTemplateImpl <em>Timport Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.impl.TimportTemplateImpl
		 * @see _12.impl._12PackageImpl#getTimportTemplate()
		 * @generated
		 */
		EClass TIMPORT_TEMPLATE = eINSTANCE.getTimportTemplate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT_TEMPLATE__VALUE = eINSTANCE.getTimportTemplate_Value();

		/**
		 * The meta object literal for the '{@link _12.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.MaxInstancesTypeMember1
		 * @see _12.impl._12PackageImpl#getMaxInstancesTypeMember1()
		 * @generated
		 */
		EEnum MAX_INSTANCES_TYPE_MEMBER1 = eINSTANCE.getMaxInstancesTypeMember1();

		/**
		 * The meta object literal for the '{@link _12.TBoolean <em>TBoolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.TBoolean
		 * @see _12.impl._12PackageImpl#getTBoolean()
		 * @generated
		 */
		EEnum TBOOLEAN = eINSTANCE.getTBoolean();

		/**
		 * The meta object literal for the '{@link _12.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.UpperBoundTypeMember1
		 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember1()
		 * @generated
		 */
		EEnum UPPER_BOUND_TYPE_MEMBER1 = eINSTANCE.getUpperBoundTypeMember1();

		/**
		 * The meta object literal for the '{@link _12.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.UpperBoundTypeMember11
		 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember11()
		 * @generated
		 */
		EEnum UPPER_BOUND_TYPE_MEMBER11 = eINSTANCE.getUpperBoundTypeMember11();

		/**
		 * The meta object literal for the '<em>Imported URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see _12.impl._12PackageImpl#getImportedURI()
		 * @generated
		 */
		EDataType IMPORTED_URI = eINSTANCE.getImportedURI();

		/**
		 * The meta object literal for the '<em>Max Instances Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see _12.impl._12PackageImpl#getMaxInstancesType()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE = eINSTANCE.getMaxInstancesType();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see _12.impl._12PackageImpl#getMaxInstancesTypeMember0()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER0 = eINSTANCE.getMaxInstancesTypeMember0();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.MaxInstancesTypeMember1
		 * @see _12.impl._12PackageImpl#getMaxInstancesTypeMember1Object()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER1_OBJECT = eINSTANCE.getMaxInstancesTypeMember1Object();

		/**
		 * The meta object literal for the '<em>TBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.TBoolean
		 * @see _12.impl._12PackageImpl#getTBooleanObject()
		 * @generated
		 */
		EDataType TBOOLEAN_OBJECT = eINSTANCE.getTBooleanObject();

		/**
		 * The meta object literal for the '<em>Upper Bound Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see _12.impl._12PackageImpl#getUpperBoundType()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE = eINSTANCE.getUpperBoundType();

		/**
		 * The meta object literal for the '<em>Upper Bound Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see _12.impl._12PackageImpl#getUpperBoundType1()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE1 = eINSTANCE.getUpperBoundType1();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember0()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER0 = eINSTANCE.getUpperBoundTypeMember0();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member01</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember01()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER01 = eINSTANCE.getUpperBoundTypeMember01();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.UpperBoundTypeMember1
		 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember1Object()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER1_OBJECT = eINSTANCE.getUpperBoundTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member1 Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see _12.UpperBoundTypeMember11
		 * @see _12.impl._12PackageImpl#getUpperBoundTypeMember1Object1()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER1_OBJECT1 = eINSTANCE.getUpperBoundTypeMember1Object1();

	}

} //_12Package
