/**
 */
package SystemMetamodel.util;

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
import SystemMetamodel.SystemMetamodelPackage;
import SystemMetamodel.Table;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SystemMetamodel.SystemMetamodelPackage
 * @generated
 */
public class SystemMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SystemMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemMetamodelSwitch<Adapter> modelSwitch =
		new SystemMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseLayeredStyle(LayeredStyle object) {
				return createLayeredStyleAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseLayerSegment(LayerSegment object) {
				return createLayerSegmentAdapter();
			}
			@Override
			public Adapter caseAllowedToUse(AllowedToUse object) {
				return createAllowedToUseAdapter();
			}
			@Override
			public Adapter caseAllowedToUseBelow(AllowedToUseBelow object) {
				return createAllowedToUseBelowAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseForeignKey(ForeignKey object) {
				return createForeignKeyAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter casePrimitiveDataType(PrimitiveDataType object) {
				return createPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseClass(SystemMetamodel.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseMember(Member object) {
				return createMemberAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.LayeredStyle <em>Layered Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.LayeredStyle
	 * @generated
	 */
	public Adapter createLayeredStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.LayerSegment <em>Layer Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.LayerSegment
	 * @generated
	 */
	public Adapter createLayerSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.AllowedToUse <em>Allowed To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.AllowedToUse
	 * @generated
	 */
	public Adapter createAllowedToUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.AllowedToUseBelow <em>Allowed To Use Below</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.AllowedToUseBelow
	 * @generated
	 */
	public Adapter createAllowedToUseBelowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.ForeignKey
	 * @generated
	 */
	public Adapter createForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.PrimitiveDataType
	 * @generated
	 */
	public Adapter createPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SystemMetamodelAdapterFactory
