/**
 */
package SystemMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see SystemMetamodel.SystemMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface SystemMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SystemMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co/edu/unal/mdd/photos/SystemMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.unal.mdd.photos.SystemMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemMetamodelPackage eINSTANCE = SystemMetamodel.impl.SystemMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.LayeredStyleImpl <em>Layered Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.LayeredStyleImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getLayeredStyle()
	 * @generated
	 */
	int LAYERED_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERED_STYLE__RELATIONS = 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERED_STYLE__LAYER = 1;

	/**
	 * The number of structural features of the '<em>Layered Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERED_STYLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layered Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERED_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.LayerImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 1;

	/**
	 * The feature id for the '<em><b>Layer Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__LAYER_SEGMENTS = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.RelationImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET_LAYER = 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.LayerSegmentImpl <em>Layer Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.LayerSegmentImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getLayerSegment()
	 * @generated
	 */
	int LAYER_SEGMENT = 3;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT__FOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT__FILES = 1;

	/**
	 * The feature id for the '<em><b>Databases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT__DATABASES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Layer Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Layer Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.AllowedToUseImpl <em>Allowed To Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.AllowedToUseImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAllowedToUse()
	 * @generated
	 */
	int ALLOWED_TO_USE = 4;

	/**
	 * The feature id for the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE__SOURCE_LAYER = RELATION__SOURCE_LAYER;

	/**
	 * The feature id for the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE__TARGET_LAYER = RELATION__TARGET_LAYER;

	/**
	 * The number of structural features of the '<em>Allowed To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allowed To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.AllowedToUseBelowImpl <em>Allowed To Use Below</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.AllowedToUseBelowImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAllowedToUseBelow()
	 * @generated
	 */
	int ALLOWED_TO_USE_BELOW = 5;

	/**
	 * The feature id for the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_BELOW__SOURCE_LAYER = RELATION__SOURCE_LAYER;

	/**
	 * The feature id for the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_BELOW__TARGET_LAYER = RELATION__TARGET_LAYER;

	/**
	 * The number of structural features of the '<em>Allowed To Use Below</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_BELOW_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allowed To Use Below</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_BELOW_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.TableImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 6;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ColumnImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ForeignKeyImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 8;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERS_TO = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ClassifierImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.PrimitiveDataTypeImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__ANNOTATIONS = CLASSIFIER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ClassImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = CLASSIFIER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBERS = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PARENT = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.AssociationImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 12;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_COMPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Is Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_AGGREGATION = 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.MemberImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.FunctionImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANNOTATIONS = CLASSIFIER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_TYPE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ParameterImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.FolderImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 16;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FILES = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.FileImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTENSION = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ConnectionImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Source Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE_SEGMENT = 0;

	/**
	 * The feature id for the '<em><b>Target Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET_SEGMENT = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.DatabaseImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 19;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SCHEMAS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORT = 2;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.MediaImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__EXTENSION = FILE__EXTENSION;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.CodeImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EXTENSION = FILE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CONTAINS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.SchemaImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 22;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.AnnotationImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 23;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ElementImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link SystemMetamodel.LayeredStyle <em>Layered Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layered Style</em>'.
	 * @see SystemMetamodel.LayeredStyle
	 * @generated
	 */
	EClass getLayeredStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.LayeredStyle#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see SystemMetamodel.LayeredStyle#getRelations()
	 * @see #getLayeredStyle()
	 * @generated
	 */
	EReference getLayeredStyle_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.LayeredStyle#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer</em>'.
	 * @see SystemMetamodel.LayeredStyle#getLayer()
	 * @see #getLayeredStyle()
	 * @generated
	 */
	EReference getLayeredStyle_Layer();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see SystemMetamodel.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Layer#getLayerSegments <em>Layer Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer Segments</em>'.
	 * @see SystemMetamodel.Layer#getLayerSegments()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_LayerSegments();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Layer#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see SystemMetamodel.Layer#getConnections()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Connections();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see SystemMetamodel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Relation#getSourceLayer <em>Source Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Layer</em>'.
	 * @see SystemMetamodel.Relation#getSourceLayer()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_SourceLayer();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Relation#getTargetLayer <em>Target Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Layer</em>'.
	 * @see SystemMetamodel.Relation#getTargetLayer()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TargetLayer();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.LayerSegment <em>Layer Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Segment</em>'.
	 * @see SystemMetamodel.LayerSegment
	 * @generated
	 */
	EClass getLayerSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.LayerSegment#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see SystemMetamodel.LayerSegment#getFolders()
	 * @see #getLayerSegment()
	 * @generated
	 */
	EReference getLayerSegment_Folders();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.LayerSegment#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see SystemMetamodel.LayerSegment#getFiles()
	 * @see #getLayerSegment()
	 * @generated
	 */
	EReference getLayerSegment_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.LayerSegment#getDatabases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Databases</em>'.
	 * @see SystemMetamodel.LayerSegment#getDatabases()
	 * @see #getLayerSegment()
	 * @generated
	 */
	EReference getLayerSegment_Databases();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.LayerSegment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.LayerSegment#getName()
	 * @see #getLayerSegment()
	 * @generated
	 */
	EAttribute getLayerSegment_Name();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.AllowedToUse <em>Allowed To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed To Use</em>'.
	 * @see SystemMetamodel.AllowedToUse
	 * @generated
	 */
	EClass getAllowedToUse();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.AllowedToUseBelow <em>Allowed To Use Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed To Use Below</em>'.
	 * @see SystemMetamodel.AllowedToUseBelow
	 * @generated
	 */
	EClass getAllowedToUseBelow();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see SystemMetamodel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see SystemMetamodel.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see SystemMetamodel.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Table#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see SystemMetamodel.Table#getForeignKeys()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ForeignKeys();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see SystemMetamodel.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SystemMetamodel.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see SystemMetamodel.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.ForeignKey#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see SystemMetamodel.ForeignKey#getRefersTo()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_RefersTo();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.ForeignKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see SystemMetamodel.ForeignKey#getColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Column();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see SystemMetamodel.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Classifier#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see SystemMetamodel.Classifier#getAnnotations()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Classifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Classifier#getName()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Name();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see SystemMetamodel.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see SystemMetamodel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see SystemMetamodel.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Class#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see SystemMetamodel.Class#getMembers()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see SystemMetamodel.Class#getMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Methods();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Class#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see SystemMetamodel.Class#getParent()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Parent();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see SystemMetamodel.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see SystemMetamodel.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see SystemMetamodel.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Association#isIsComposition <em>Is Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composition</em>'.
	 * @see SystemMetamodel.Association#isIsComposition()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsComposition();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Association#isIsAggregation <em>Is Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Aggregation</em>'.
	 * @see SystemMetamodel.Association#isIsAggregation()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsAggregation();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see SystemMetamodel.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Member#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Member#getName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Name();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Member#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SystemMetamodel.Member#getType()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Type();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see SystemMetamodel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see SystemMetamodel.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Function#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see SystemMetamodel.Function#getReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ReturnType();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see SystemMetamodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SystemMetamodel.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see SystemMetamodel.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Folder#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see SystemMetamodel.Folder#getFiles()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Folder#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see SystemMetamodel.Folder#getContains()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Contains();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see SystemMetamodel.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.File#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see SystemMetamodel.File#getExtension()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Extension();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see SystemMetamodel.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Connection#getSourceSegment <em>Source Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Segment</em>'.
	 * @see SystemMetamodel.Connection#getSourceSegment()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_SourceSegment();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Connection#getTargetSegment <em>Target Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Segment</em>'.
	 * @see SystemMetamodel.Connection#getTargetSegment()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TargetSegment();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see SystemMetamodel.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Database#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see SystemMetamodel.Database#getSchemas()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Schemas();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Database#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see SystemMetamodel.Database#getPort()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Port();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see SystemMetamodel.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see SystemMetamodel.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Code#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see SystemMetamodel.Code#getContains()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Contains();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see SystemMetamodel.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see SystemMetamodel.Schema#getTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Tables();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see SystemMetamodel.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Annotation#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see SystemMetamodel.Annotation#getElement()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Element();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see SystemMetamodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SystemMetamodel.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link SystemMetamodel.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SystemMetamodel.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemMetamodelFactory getSystemMetamodelFactory();

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
		 * The meta object literal for the '{@link SystemMetamodel.impl.LayeredStyleImpl <em>Layered Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.LayeredStyleImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getLayeredStyle()
		 * @generated
		 */
		EClass LAYERED_STYLE = eINSTANCE.getLayeredStyle();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYERED_STYLE__RELATIONS = eINSTANCE.getLayeredStyle_Relations();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYERED_STYLE__LAYER = eINSTANCE.getLayeredStyle_Layer();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.LayerImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Layer Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__LAYER_SEGMENTS = eINSTANCE.getLayer_LayerSegments();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__CONNECTIONS = eINSTANCE.getLayer_Connections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.RelationImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Source Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE_LAYER = eINSTANCE.getRelation_SourceLayer();

		/**
		 * The meta object literal for the '<em><b>Target Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET_LAYER = eINSTANCE.getRelation_TargetLayer();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.LayerSegmentImpl <em>Layer Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.LayerSegmentImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getLayerSegment()
		 * @generated
		 */
		EClass LAYER_SEGMENT = eINSTANCE.getLayerSegment();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SEGMENT__FOLDERS = eINSTANCE.getLayerSegment_Folders();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SEGMENT__FILES = eINSTANCE.getLayerSegment_Files();

		/**
		 * The meta object literal for the '<em><b>Databases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SEGMENT__DATABASES = eINSTANCE.getLayerSegment_Databases();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_SEGMENT__NAME = eINSTANCE.getLayerSegment_Name();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.AllowedToUseImpl <em>Allowed To Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.AllowedToUseImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAllowedToUse()
		 * @generated
		 */
		EClass ALLOWED_TO_USE = eINSTANCE.getAllowedToUse();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.AllowedToUseBelowImpl <em>Allowed To Use Below</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.AllowedToUseBelowImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAllowedToUseBelow()
		 * @generated
		 */
		EClass ALLOWED_TO_USE_BELOW = eINSTANCE.getAllowedToUseBelow();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.TableImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FOREIGN_KEYS = eINSTANCE.getTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ColumnImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ForeignKeyImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERS_TO = eINSTANCE.getForeignKey_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__COLUMN = eINSTANCE.getForeignKey_Column();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ClassifierImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__ANNOTATIONS = eINSTANCE.getClassifier_Annotations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__NAME = eINSTANCE.getClassifier_Name();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.PrimitiveDataTypeImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ClassImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__MEMBERS = eINSTANCE.getClass_Members();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PARENT = eINSTANCE.getClass_Parent();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.AssociationImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Is Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_COMPOSITION = eINSTANCE.getAssociation_IsComposition();

		/**
		 * The meta object literal for the '<em><b>Is Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_AGGREGATION = eINSTANCE.getAssociation_IsAggregation();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.MemberImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.FunctionImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ParameterImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.FolderImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__FILES = eINSTANCE.getFolder_Files();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CONTAINS = eINSTANCE.getFolder_Contains();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.FileImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__EXTENSION = eINSTANCE.getFile_Extension();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ConnectionImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE_SEGMENT = eINSTANCE.getConnection_SourceSegment();

		/**
		 * The meta object literal for the '<em><b>Target Segment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET_SEGMENT = eINSTANCE.getConnection_TargetSegment();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.DatabaseImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__SCHEMAS = eINSTANCE.getDatabase_Schemas();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PORT = eINSTANCE.getDatabase_Port();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.MediaImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.CodeImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__CONTAINS = eINSTANCE.getCode_Contains();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.SchemaImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.AnnotationImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ELEMENT = eINSTANCE.getAnnotation_Element();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ElementImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

	}

} //SystemMetamodelPackage
