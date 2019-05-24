/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.AllowedToUse;
import SystemMetamodel.AllowedToUseBelow;
import SystemMetamodel.Annotation;
import SystemMetamodel.Association;
import SystemMetamodel.Classifier;
import SystemMetamodel.Code;
import SystemMetamodel.Column;
import SystemMetamodel.Connection;
import SystemMetamodel.Database;
import SystemMetamodel.Element;
import SystemMetamodel.File;
import SystemMetamodel.Folder;
import SystemMetamodel.ForeignKey;
import SystemMetamodel.Function;
import SystemMetamodel.Layer;
import SystemMetamodel.LayerSegment;
import SystemMetamodel.LayeredStyle;
import SystemMetamodel.Media;
import SystemMetamodel.Member;
import SystemMetamodel.Parameter;
import SystemMetamodel.PrimitiveDataType;
import SystemMetamodel.Relation;
import SystemMetamodel.Schema;
import SystemMetamodel.SystemMetamodelFactory;
import SystemMetamodel.SystemMetamodelPackage;
import SystemMetamodel.Table;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemMetamodelFactoryImpl extends EFactoryImpl implements SystemMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemMetamodelFactory init() {
		try {
			SystemMetamodelFactory theSystemMetamodelFactory = (SystemMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(SystemMetamodelPackage.eNS_URI);
			if (theSystemMetamodelFactory != null) {
				return theSystemMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodelFactoryImpl() {
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
			case SystemMetamodelPackage.LAYERED_STYLE: return createLayeredStyle();
			case SystemMetamodelPackage.LAYER: return createLayer();
			case SystemMetamodelPackage.RELATION: return createRelation();
			case SystemMetamodelPackage.LAYER_SEGMENT: return createLayerSegment();
			case SystemMetamodelPackage.ALLOWED_TO_USE: return createAllowedToUse();
			case SystemMetamodelPackage.ALLOWED_TO_USE_BELOW: return createAllowedToUseBelow();
			case SystemMetamodelPackage.TABLE: return createTable();
			case SystemMetamodelPackage.COLUMN: return createColumn();
			case SystemMetamodelPackage.FOREIGN_KEY: return createForeignKey();
			case SystemMetamodelPackage.CLASSIFIER: return createClassifier();
			case SystemMetamodelPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case SystemMetamodelPackage.CLASS: return createClass();
			case SystemMetamodelPackage.ASSOCIATION: return createAssociation();
			case SystemMetamodelPackage.MEMBER: return createMember();
			case SystemMetamodelPackage.FUNCTION: return createFunction();
			case SystemMetamodelPackage.PARAMETER: return createParameter();
			case SystemMetamodelPackage.FOLDER: return createFolder();
			case SystemMetamodelPackage.FILE: return createFile();
			case SystemMetamodelPackage.CONNECTION: return createConnection();
			case SystemMetamodelPackage.DATABASE: return createDatabase();
			case SystemMetamodelPackage.MEDIA: return createMedia();
			case SystemMetamodelPackage.CODE: return createCode();
			case SystemMetamodelPackage.SCHEMA: return createSchema();
			case SystemMetamodelPackage.ANNOTATION: return createAnnotation();
			case SystemMetamodelPackage.ELEMENT: return createElement();
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
	public LayeredStyle createLayeredStyle() {
		LayeredStyleImpl layeredStyle = new LayeredStyleImpl();
		return layeredStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerSegment createLayerSegment() {
		LayerSegmentImpl layerSegment = new LayerSegmentImpl();
		return layerSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowedToUse createAllowedToUse() {
		AllowedToUseImpl allowedToUse = new AllowedToUseImpl();
		return allowedToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowedToUseBelow createAllowedToUseBelow() {
		AllowedToUseBelowImpl allowedToUseBelow = new AllowedToUseBelowImpl();
		return allowedToUseBelow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignKey createForeignKey() {
		ForeignKeyImpl foreignKey = new ForeignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemMetamodel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemMetamodelPackage getSystemMetamodelPackage() {
		return (SystemMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemMetamodelPackage getPackage() {
		return SystemMetamodelPackage.eINSTANCE;
	}

} //SystemMetamodelFactoryImpl
