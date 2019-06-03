/**
 */
package PhotosMetaModel.util;

import PhotosMetaModel.Access;
import PhotosMetaModel.Accion;
import PhotosMetaModel.Action_a;
import PhotosMetaModel.AllowedToUse;
import PhotosMetaModel.Alter;
import PhotosMetaModel.AmazonAurora;
import PhotosMetaModel.AmazonDynamoDB;
import PhotosMetaModel.AmazonElasticComputeCloud;
import PhotosMetaModel.AmazonS3API;
import PhotosMetaModel.AmazonS3Storage;
import PhotosMetaModel.AmazonSageMaker;
import PhotosMetaModel.AmazonSimpleStorageService;
import PhotosMetaModel.AmazonWebServices;
import PhotosMetaModel.Architecture;
import PhotosMetaModel.Array;
import PhotosMetaModel.Autenticacion;
import PhotosMetaModel.Autowired;
import PhotosMetaModel.BatchOperation;
import PhotosMetaModel.Bean;
import PhotosMetaModel.Bucket;
import PhotosMetaModel.BucketObjectsNotPublic;
import PhotosMetaModel.Capa;
import PhotosMetaModel.CargarFoto;
import PhotosMetaModel.Categoria;
import PhotosMetaModel.Class_r;
import PhotosMetaModel.Clause;
import PhotosMetaModel.Cluster;
import PhotosMetaModel.Column;
import PhotosMetaModel.Column_p;
import PhotosMetaModel.Column_s;
import PhotosMetaModel.Component;
import PhotosMetaModel.ComponentDidMount;
import PhotosMetaModel.ComponentWillUnmount;
import PhotosMetaModel.Component_a;
import PhotosMetaModel.Component_r;
import PhotosMetaModel.Conexion;
import PhotosMetaModel.ConexionPostgreSQL;
import PhotosMetaModel.Configuration;
import PhotosMetaModel.Constraint;
import PhotosMetaModel.Constructor;
import PhotosMetaModel.Controller_a;
import PhotosMetaModel.CrearAlbum;
import PhotosMetaModel.Create;
import PhotosMetaModel.DataType;
import PhotosMetaModel.Database;
import PhotosMetaModel.Datos;
import PhotosMetaModel.Delete;
import PhotosMetaModel.DeleteMapping;
import PhotosMetaModel.Distnct;
import PhotosMetaModel.Domain;
import PhotosMetaModel.Drop;
import PhotosMetaModel.EditarPerfil;
import PhotosMetaModel.Element_r;
import PhotosMetaModel.EnableAuthorizationServer;
import PhotosMetaModel.EnableGlobalMethodSecurity;
import PhotosMetaModel.EnableResourceServer;
import PhotosMetaModel.EnableWebSecurity;
import PhotosMetaModel.Entity;
import PhotosMetaModel.ExceptionHandler;
import PhotosMetaModel.File_a;
import PhotosMetaModel.Folder_a;
import PhotosMetaModel.ForeignKey;
import PhotosMetaModel.Foto;
import PhotosMetaModel.From;
import PhotosMetaModel.Function_p;
import PhotosMetaModel.Function_r;
import PhotosMetaModel.GeneratedValue;
import PhotosMetaModel.GetMapping;
import PhotosMetaModel.GroupBy;
import PhotosMetaModel.Having;
import PhotosMetaModel.Id;
import PhotosMetaModel.Imagen;
import PhotosMetaModel.Index;
import PhotosMetaModel.Index_p;
import PhotosMetaModel.Insert;
import PhotosMetaModel.Into;
import PhotosMetaModel.Join;
import PhotosMetaModel.Lateral;
import PhotosMetaModel.Limit;
import PhotosMetaModel.LogicaDeNegocio;
import PhotosMetaModel.ManejoPerfil;
import PhotosMetaModel.MetaData;
import PhotosMetaModel.Model_a;
import PhotosMetaModel.NTier;
import PhotosMetaModel.NamedNativeQuery;
import PhotosMetaModel.ObjectsPublic;
import PhotosMetaModel.Offset;
import PhotosMetaModel.OnlyAuthorized;
import PhotosMetaModel.Order_p;
import PhotosMetaModel.Order_s;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Policy;
import PhotosMetaModel.PostMapping;
import PhotosMetaModel.PostgreSQL;
import PhotosMetaModel.PostgreSQL_a;
import PhotosMetaModel.Predicate;
import PhotosMetaModel.Presentacion;
import PhotosMetaModel.Privilege;
import PhotosMetaModel.Prop;
import PhotosMetaModel.Public;
import PhotosMetaModel.PutMapping;
import PhotosMetaModel.Query;
import PhotosMetaModel.REST;
import PhotosMetaModel.React;
import PhotosMetaModel.ReactDOM;
import PhotosMetaModel.Registro;
import PhotosMetaModel.Relacion;
import PhotosMetaModel.Render;
import PhotosMetaModel.Repository;
import PhotosMetaModel.Repository_a;
import PhotosMetaModel.RequestMapping;
import PhotosMetaModel.RequestPart;
import PhotosMetaModel.RestController;
import PhotosMetaModel.Row;
import PhotosMetaModel.Scheme;
import PhotosMetaModel.SearchCriteria;
import PhotosMetaModel.Security_a;
import PhotosMetaModel.SegmentoDatos;
import PhotosMetaModel.SegmentoLogica;
import PhotosMetaModel.SegmentoPresentacion;
import PhotosMetaModel.Select;
import PhotosMetaModel.SoftGallery;
import PhotosMetaModel.Specification;
import PhotosMetaModel.Spring;
import PhotosMetaModel.SpringBootApplication;
import PhotosMetaModel.Table_p;
import PhotosMetaModel.Table_s;
import PhotosMetaModel.Technology;
import PhotosMetaModel.Trigger;
import PhotosMetaModel.Update;
import PhotosMetaModel.User_p;
import PhotosMetaModel.Using;
import PhotosMetaModel.Usuario;
import PhotosMetaModel.Values;
import PhotosMetaModel.VerAlbum;
import PhotosMetaModel.VerTodasLasFotos;
import PhotosMetaModel.View;
import PhotosMetaModel.View_a;
import PhotosMetaModel.Where;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PhotosMetaModel.PhotosMetaModelPackage
 * @generated
 */
public class PhotosMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhotosMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotosMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PhotosMetaModelPackage.eINSTANCE;
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
	protected PhotosMetaModelSwitch<Adapter> modelSwitch =
		new PhotosMetaModelSwitch<Adapter>() {
			@Override
			public Adapter caseSoftGallery(SoftGallery object) {
				return createSoftGalleryAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseArchitecture(Architecture object) {
				return createArchitectureAdapter();
			}
			@Override
			public Adapter caseTechnology(Technology object) {
				return createTechnologyAdapter();
			}
			@Override
			public Adapter caseSpring(Spring object) {
				return createSpringAdapter();
			}
			@Override
			public Adapter caseReact(React object) {
				return createReactAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseRestController(RestController object) {
				return createRestControllerAdapter();
			}
			@Override
			public Adapter caseSpringBootApplication(SpringBootApplication object) {
				return createSpringBootApplicationAdapter();
			}
			@Override
			public Adapter caseRequestMapping(RequestMapping object) {
				return createRequestMappingAdapter();
			}
			@Override
			public Adapter casePostMapping(PostMapping object) {
				return createPostMappingAdapter();
			}
			@Override
			public Adapter caseGetMapping(GetMapping object) {
				return createGetMappingAdapter();
			}
			@Override
			public Adapter casePutMapping(PutMapping object) {
				return createPutMappingAdapter();
			}
			@Override
			public Adapter caseExceptionHandler(ExceptionHandler object) {
				return createExceptionHandlerAdapter();
			}
			@Override
			public Adapter caseDeleteMapping(DeleteMapping object) {
				return createDeleteMappingAdapter();
			}
			@Override
			public Adapter caseRequestPart(RequestPart object) {
				return createRequestPartAdapter();
			}
			@Override
			public Adapter caseAutowired(Autowired object) {
				return createAutowiredAdapter();
			}
			@Override
			public Adapter caseException(PhotosMetaModel.Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseTable_s(Table_s object) {
				return createTable_sAdapter();
			}
			@Override
			public Adapter caseId(Id object) {
				return createIdAdapter();
			}
			@Override
			public Adapter caseColumn_p(Column_p object) {
				return createColumn_pAdapter();
			}
			@Override
			public Adapter caseGeneratedValue(GeneratedValue object) {
				return createGeneratedValueAdapter();
			}
			@Override
			public Adapter caseNamedNativeQuery(NamedNativeQuery object) {
				return createNamedNativeQueryAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseSearchCriteria(SearchCriteria object) {
				return createSearchCriteriaAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseOrder_s(Order_s object) {
				return createOrder_sAdapter();
			}
			@Override
			public Adapter caseEnableAuthorizationServer(EnableAuthorizationServer object) {
				return createEnableAuthorizationServerAdapter();
			}
			@Override
			public Adapter caseEnableResourceServer(EnableResourceServer object) {
				return createEnableResourceServerAdapter();
			}
			@Override
			public Adapter caseEnableWebSecurity(EnableWebSecurity object) {
				return createEnableWebSecurityAdapter();
			}
			@Override
			public Adapter caseEnableGlobalMethodSecurity(EnableGlobalMethodSecurity object) {
				return createEnableGlobalMethodSecurityAdapter();
			}
			@Override
			public Adapter caseBean(Bean object) {
				return createBeanAdapter();
			}
			@Override
			public Adapter casePostgreSQL(PostgreSQL object) {
				return createPostgreSQLAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseForeignKey(ForeignKey object) {
				return createForeignKeyAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseIndex_p(Index_p object) {
				return createIndex_pAdapter();
			}
			@Override
			public Adapter caseTable_p(Table_p object) {
				return createTable_pAdapter();
			}
			@Override
			public Adapter caseFunction_p(Function_p object) {
				return createFunction_pAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseScheme(Scheme object) {
				return createSchemeAdapter();
			}
			@Override
			public Adapter caseUser_p(User_p object) {
				return createUser_pAdapter();
			}
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter casePrivilege(Privilege object) {
				return createPrivilegeAdapter();
			}
			@Override
			public Adapter casePolicy(Policy object) {
				return createPolicyAdapter();
			}
			@Override
			public Adapter caseClause(Clause object) {
				return createClauseAdapter();
			}
			@Override
			public Adapter caseInsert(Insert object) {
				return createInsertAdapter();
			}
			@Override
			public Adapter caseFrom(From object) {
				return createFromAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseLateral(Lateral object) {
				return createLateralAdapter();
			}
			@Override
			public Adapter caseWhere(Where object) {
				return createWhereAdapter();
			}
			@Override
			public Adapter caseGroupBy(GroupBy object) {
				return createGroupByAdapter();
			}
			@Override
			public Adapter caseHaving(Having object) {
				return createHavingAdapter();
			}
			@Override
			public Adapter caseSelect(Select object) {
				return createSelectAdapter();
			}
			@Override
			public Adapter caseDistnct(Distnct object) {
				return createDistnctAdapter();
			}
			@Override
			public Adapter caseLimit(Limit object) {
				return createLimitAdapter();
			}
			@Override
			public Adapter caseOffset(Offset object) {
				return createOffsetAdapter();
			}
			@Override
			public Adapter caseValues(Values object) {
				return createValuesAdapter();
			}
			@Override
			public Adapter caseAlter(Alter object) {
				return createAlterAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseDrop(Drop object) {
				return createDropAdapter();
			}
			@Override
			public Adapter caseUsing(Using object) {
				return createUsingAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseInto(Into object) {
				return createIntoAdapter();
			}
			@Override
			public Adapter caseColumn_s(Column_s object) {
				return createColumn_sAdapter();
			}
			@Override
			public Adapter caseOrder_p(Order_p object) {
				return createOrder_pAdapter();
			}
			@Override
			public Adapter caseUsuario(Usuario object) {
				return createUsuarioAdapter();
			}
			@Override
			public Adapter caseAutenticacion(Autenticacion object) {
				return createAutenticacionAdapter();
			}
			@Override
			public Adapter caseRegistro(Registro object) {
				return createRegistroAdapter();
			}
			@Override
			public Adapter caseManejoPerfil(ManejoPerfil object) {
				return createManejoPerfilAdapter();
			}
			@Override
			public Adapter caseAccion(Accion object) {
				return createAccionAdapter();
			}
			@Override
			public Adapter caseCrearAlbum(CrearAlbum object) {
				return createCrearAlbumAdapter();
			}
			@Override
			public Adapter caseVerAlbum(VerAlbum object) {
				return createVerAlbumAdapter();
			}
			@Override
			public Adapter caseCargarFoto(CargarFoto object) {
				return createCargarFotoAdapter();
			}
			@Override
			public Adapter caseVerTodasLasFotos(VerTodasLasFotos object) {
				return createVerTodasLasFotosAdapter();
			}
			@Override
			public Adapter caseEditarPerfil(EditarPerfil object) {
				return createEditarPerfilAdapter();
			}
			@Override
			public Adapter caseFoto(Foto object) {
				return createFotoAdapter();
			}
			@Override
			public Adapter caseCategoria(Categoria object) {
				return createCategoriaAdapter();
			}
			@Override
			public Adapter caseImagen(Imagen object) {
				return createImagenAdapter();
			}
			@Override
			public Adapter caseAmazonWebServices(AmazonWebServices object) {
				return createAmazonWebServicesAdapter();
			}
			@Override
			public Adapter caseNTier(NTier object) {
				return createNTierAdapter();
			}
			@Override
			public Adapter caseCapa(Capa object) {
				return createCapaAdapter();
			}
			@Override
			public Adapter caseConexion(Conexion object) {
				return createConexionAdapter();
			}
			@Override
			public Adapter caseRelacion(Relacion object) {
				return createRelacionAdapter();
			}
			@Override
			public Adapter caseREST(REST object) {
				return createRESTAdapter();
			}
			@Override
			public Adapter caseConexionPostgreSQL(ConexionPostgreSQL object) {
				return createConexionPostgreSQLAdapter();
			}
			@Override
			public Adapter caseAmazonS3API(AmazonS3API object) {
				return createAmazonS3APIAdapter();
			}
			@Override
			public Adapter casePresentacion(Presentacion object) {
				return createPresentacionAdapter();
			}
			@Override
			public Adapter caseLogicaDeNegocio(LogicaDeNegocio object) {
				return createLogicaDeNegocioAdapter();
			}
			@Override
			public Adapter caseDatos(Datos object) {
				return createDatosAdapter();
			}
			@Override
			public Adapter caseAllowedToUse(AllowedToUse object) {
				return createAllowedToUseAdapter();
			}
			@Override
			public Adapter caseSegmentoPresentacion(SegmentoPresentacion object) {
				return createSegmentoPresentacionAdapter();
			}
			@Override
			public Adapter caseSegmentoLogica(SegmentoLogica object) {
				return createSegmentoLogicaAdapter();
			}
			@Override
			public Adapter caseSegmentoDatos(SegmentoDatos object) {
				return createSegmentoDatosAdapter();
			}
			@Override
			public Adapter caseView_a(View_a object) {
				return createView_aAdapter();
			}
			@Override
			public Adapter caseComponent_a(Component_a object) {
				return createComponent_aAdapter();
			}
			@Override
			public Adapter caseAction_a(Action_a object) {
				return createAction_aAdapter();
			}
			@Override
			public Adapter caseController_a(Controller_a object) {
				return createController_aAdapter();
			}
			@Override
			public Adapter caseModel_a(Model_a object) {
				return createModel_aAdapter();
			}
			@Override
			public Adapter caseRepository_a(Repository_a object) {
				return createRepository_aAdapter();
			}
			@Override
			public Adapter caseSecurity_a(Security_a object) {
				return createSecurity_aAdapter();
			}
			@Override
			public Adapter casePostgreSQL_a(PostgreSQL_a object) {
				return createPostgreSQL_aAdapter();
			}
			@Override
			public Adapter caseAmazonS3Storage(AmazonS3Storage object) {
				return createAmazonS3StorageAdapter();
			}
			@Override
			public Adapter caseReactDOM(ReactDOM object) {
				return createReactDOMAdapter();
			}
			@Override
			public Adapter caseElement_r(Element_r object) {
				return createElement_rAdapter();
			}
			@Override
			public Adapter caseComponent_r(Component_r object) {
				return createComponent_rAdapter();
			}
			@Override
			public Adapter caseProp(Prop object) {
				return createPropAdapter();
			}
			@Override
			public Adapter caseClass_r(Class_r object) {
				return createClass_rAdapter();
			}
			@Override
			public Adapter caseFunction_r(Function_r object) {
				return createFunction_rAdapter();
			}
			@Override
			public Adapter caseRender(Render object) {
				return createRenderAdapter();
			}
			@Override
			public Adapter caseConstructor(Constructor object) {
				return createConstructorAdapter();
			}
			@Override
			public Adapter caseComponentDidMount(ComponentDidMount object) {
				return createComponentDidMountAdapter();
			}
			@Override
			public Adapter caseComponentWillUnmount(ComponentWillUnmount object) {
				return createComponentWillUnmountAdapter();
			}
			@Override
			public Adapter caseAmazonElasticComputeCloud(AmazonElasticComputeCloud object) {
				return createAmazonElasticComputeCloudAdapter();
			}
			@Override
			public Adapter caseAmazonSimpleStorageService(AmazonSimpleStorageService object) {
				return createAmazonSimpleStorageServiceAdapter();
			}
			@Override
			public Adapter caseAmazonAurora(AmazonAurora object) {
				return createAmazonAuroraAdapter();
			}
			@Override
			public Adapter caseAmazonDynamoDB(AmazonDynamoDB object) {
				return createAmazonDynamoDBAdapter();
			}
			@Override
			public Adapter caseAmazonSageMaker(AmazonSageMaker object) {
				return createAmazonSageMakerAdapter();
			}
			@Override
			public Adapter caseBucket(Bucket object) {
				return createBucketAdapter();
			}
			@Override
			public Adapter caseBatchOperation(BatchOperation object) {
				return createBatchOperationAdapter();
			}
			@Override
			public Adapter caseAccess(Access object) {
				return createAccessAdapter();
			}
			@Override
			public Adapter casePublic(Public object) {
				return createPublicAdapter();
			}
			@Override
			public Adapter caseObjectsPublic(ObjectsPublic object) {
				return createObjectsPublicAdapter();
			}
			@Override
			public Adapter caseBucketObjectsNotPublic(BucketObjectsNotPublic object) {
				return createBucketObjectsNotPublicAdapter();
			}
			@Override
			public Adapter caseOnlyAuthorized(OnlyAuthorized object) {
				return createOnlyAuthorizedAdapter();
			}
			@Override
			public Adapter caseFile_a(File_a object) {
				return createFile_aAdapter();
			}
			@Override
			public Adapter caseFolder_a(Folder_a object) {
				return createFolder_aAdapter();
			}
			@Override
			public Adapter caseMetaData(MetaData object) {
				return createMetaDataAdapter();
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SoftGallery <em>Soft Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SoftGallery
	 * @generated
	 */
	public Adapter createSoftGalleryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Architecture
	 * @generated
	 */
	public Adapter createArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Technology
	 * @generated
	 */
	public Adapter createTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Spring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Spring
	 * @generated
	 */
	public Adapter createSpringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.React <em>React</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.React
	 * @generated
	 */
	public Adapter createReactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.RestController <em>Rest Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.RestController
	 * @generated
	 */
	public Adapter createRestControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SpringBootApplication <em>Spring Boot Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SpringBootApplication
	 * @generated
	 */
	public Adapter createSpringBootApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.RequestMapping <em>Request Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.RequestMapping
	 * @generated
	 */
	public Adapter createRequestMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.PostMapping <em>Post Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.PostMapping
	 * @generated
	 */
	public Adapter createPostMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.GetMapping <em>Get Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.GetMapping
	 * @generated
	 */
	public Adapter createGetMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.PutMapping <em>Put Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.PutMapping
	 * @generated
	 */
	public Adapter createPutMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ExceptionHandler
	 * @generated
	 */
	public Adapter createExceptionHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.DeleteMapping <em>Delete Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.DeleteMapping
	 * @generated
	 */
	public Adapter createDeleteMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.RequestPart <em>Request Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.RequestPart
	 * @generated
	 */
	public Adapter createRequestPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Autowired <em>Autowired</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Autowired
	 * @generated
	 */
	public Adapter createAutowiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Table_s <em>Table s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Table_s
	 * @generated
	 */
	public Adapter createTable_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Id
	 * @generated
	 */
	public Adapter createIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Column_p <em>Column p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Column_p
	 * @generated
	 */
	public Adapter createColumn_pAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.GeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.GeneratedValue
	 * @generated
	 */
	public Adapter createGeneratedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.NamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.NamedNativeQuery
	 * @generated
	 */
	public Adapter createNamedNativeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SearchCriteria <em>Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SearchCriteria
	 * @generated
	 */
	public Adapter createSearchCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Order_s <em>Order s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Order_s
	 * @generated
	 */
	public Adapter createOrder_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.EnableAuthorizationServer <em>Enable Authorization Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.EnableAuthorizationServer
	 * @generated
	 */
	public Adapter createEnableAuthorizationServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.EnableResourceServer <em>Enable Resource Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.EnableResourceServer
	 * @generated
	 */
	public Adapter createEnableResourceServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.EnableWebSecurity <em>Enable Web Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.EnableWebSecurity
	 * @generated
	 */
	public Adapter createEnableWebSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.EnableGlobalMethodSecurity <em>Enable Global Method Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.EnableGlobalMethodSecurity
	 * @generated
	 */
	public Adapter createEnableGlobalMethodSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Bean
	 * @generated
	 */
	public Adapter createBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.PostgreSQL <em>Postgre SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.PostgreSQL
	 * @generated
	 */
	public Adapter createPostgreSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ForeignKey
	 * @generated
	 */
	public Adapter createForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Index_p <em>Index p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Index_p
	 * @generated
	 */
	public Adapter createIndex_pAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Table_p <em>Table p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Table_p
	 * @generated
	 */
	public Adapter createTable_pAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Function_p <em>Function p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Function_p
	 * @generated
	 */
	public Adapter createFunction_pAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Scheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Scheme
	 * @generated
	 */
	public Adapter createSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.User_p <em>User p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.User_p
	 * @generated
	 */
	public Adapter createUser_pAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Privilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Privilege
	 * @generated
	 */
	public Adapter createPrivilegeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Insert
	 * @generated
	 */
	public Adapter createInsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.From
	 * @generated
	 */
	public Adapter createFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Lateral <em>Lateral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Lateral
	 * @generated
	 */
	public Adapter createLateralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Where
	 * @generated
	 */
	public Adapter createWhereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.GroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.GroupBy
	 * @generated
	 */
	public Adapter createGroupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Having <em>Having</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Having
	 * @generated
	 */
	public Adapter createHavingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Distnct <em>Distnct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Distnct
	 * @generated
	 */
	public Adapter createDistnctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Limit
	 * @generated
	 */
	public Adapter createLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Offset
	 * @generated
	 */
	public Adapter createOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Values
	 * @generated
	 */
	public Adapter createValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Alter
	 * @generated
	 */
	public Adapter createAlterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Using <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Using
	 * @generated
	 */
	public Adapter createUsingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Into <em>Into</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Into
	 * @generated
	 */
	public Adapter createIntoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Column_s <em>Column s</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Column_s
	 * @generated
	 */
	public Adapter createColumn_sAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Order_p <em>Order p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Order_p
	 * @generated
	 */
	public Adapter createOrder_pAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Autenticacion <em>Autenticacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Autenticacion
	 * @generated
	 */
	public Adapter createAutenticacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Registro
	 * @generated
	 */
	public Adapter createRegistroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ManejoPerfil <em>Manejo Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ManejoPerfil
	 * @generated
	 */
	public Adapter createManejoPerfilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Accion
	 * @generated
	 */
	public Adapter createAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.CrearAlbum <em>Crear Album</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.CrearAlbum
	 * @generated
	 */
	public Adapter createCrearAlbumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.VerAlbum <em>Ver Album</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.VerAlbum
	 * @generated
	 */
	public Adapter createVerAlbumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.CargarFoto <em>Cargar Foto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.CargarFoto
	 * @generated
	 */
	public Adapter createCargarFotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.VerTodasLasFotos <em>Ver Todas Las Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.VerTodasLasFotos
	 * @generated
	 */
	public Adapter createVerTodasLasFotosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.EditarPerfil <em>Editar Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.EditarPerfil
	 * @generated
	 */
	public Adapter createEditarPerfilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Foto <em>Foto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Foto
	 * @generated
	 */
	public Adapter createFotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Categoria
	 * @generated
	 */
	public Adapter createCategoriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Imagen
	 * @generated
	 */
	public Adapter createImagenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonWebServices <em>Amazon Web Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonWebServices
	 * @generated
	 */
	public Adapter createAmazonWebServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.NTier <em>NTier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.NTier
	 * @generated
	 */
	public Adapter createNTierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Capa <em>Capa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Capa
	 * @generated
	 */
	public Adapter createCapaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Conexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Conexion
	 * @generated
	 */
	public Adapter createConexionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Relacion
	 * @generated
	 */
	public Adapter createRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.REST <em>REST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.REST
	 * @generated
	 */
	public Adapter createRESTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ConexionPostgreSQL <em>Conexion Postgre SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ConexionPostgreSQL
	 * @generated
	 */
	public Adapter createConexionPostgreSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonS3API <em>Amazon S3API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonS3API
	 * @generated
	 */
	public Adapter createAmazonS3APIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Presentacion <em>Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Presentacion
	 * @generated
	 */
	public Adapter createPresentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.LogicaDeNegocio <em>Logica De Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.LogicaDeNegocio
	 * @generated
	 */
	public Adapter createLogicaDeNegocioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Datos <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Datos
	 * @generated
	 */
	public Adapter createDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AllowedToUse <em>Allowed To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AllowedToUse
	 * @generated
	 */
	public Adapter createAllowedToUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SegmentoPresentacion <em>Segmento Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SegmentoPresentacion
	 * @generated
	 */
	public Adapter createSegmentoPresentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SegmentoLogica <em>Segmento Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SegmentoLogica
	 * @generated
	 */
	public Adapter createSegmentoLogicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SegmentoDatos <em>Segmento Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SegmentoDatos
	 * @generated
	 */
	public Adapter createSegmentoDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.View_a <em>View a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.View_a
	 * @generated
	 */
	public Adapter createView_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Component_a <em>Component a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Component_a
	 * @generated
	 */
	public Adapter createComponent_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Action_a <em>Action a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Action_a
	 * @generated
	 */
	public Adapter createAction_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Controller_a <em>Controller a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Controller_a
	 * @generated
	 */
	public Adapter createController_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Model_a <em>Model a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Model_a
	 * @generated
	 */
	public Adapter createModel_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Repository_a <em>Repository a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Repository_a
	 * @generated
	 */
	public Adapter createRepository_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Security_a <em>Security a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Security_a
	 * @generated
	 */
	public Adapter createSecurity_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.PostgreSQL_a <em>Postgre SQL a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.PostgreSQL_a
	 * @generated
	 */
	public Adapter createPostgreSQL_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonS3Storage <em>Amazon S3 Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonS3Storage
	 * @generated
	 */
	public Adapter createAmazonS3StorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ReactDOM <em>React DOM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ReactDOM
	 * @generated
	 */
	public Adapter createReactDOMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Element_r <em>Element r</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Element_r
	 * @generated
	 */
	public Adapter createElement_rAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Component_r <em>Component r</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Component_r
	 * @generated
	 */
	public Adapter createComponent_rAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Prop <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Prop
	 * @generated
	 */
	public Adapter createPropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Class_r <em>Class r</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Class_r
	 * @generated
	 */
	public Adapter createClass_rAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Function_r <em>Function r</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Function_r
	 * @generated
	 */
	public Adapter createFunction_rAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Render <em>Render</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Render
	 * @generated
	 */
	public Adapter createRenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ComponentDidMount <em>Component Did Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ComponentDidMount
	 * @generated
	 */
	public Adapter createComponentDidMountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ComponentWillUnmount <em>Component Will Unmount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ComponentWillUnmount
	 * @generated
	 */
	public Adapter createComponentWillUnmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonElasticComputeCloud <em>Amazon Elastic Compute Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonElasticComputeCloud
	 * @generated
	 */
	public Adapter createAmazonElasticComputeCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonSimpleStorageService <em>Amazon Simple Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonSimpleStorageService
	 * @generated
	 */
	public Adapter createAmazonSimpleStorageServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonAurora <em>Amazon Aurora</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonAurora
	 * @generated
	 */
	public Adapter createAmazonAuroraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonDynamoDB <em>Amazon Dynamo DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonDynamoDB
	 * @generated
	 */
	public Adapter createAmazonDynamoDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AmazonSageMaker <em>Amazon Sage Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AmazonSageMaker
	 * @generated
	 */
	public Adapter createAmazonSageMakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Bucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Bucket
	 * @generated
	 */
	public Adapter createBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.BatchOperation <em>Batch Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.BatchOperation
	 * @generated
	 */
	public Adapter createBatchOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Public
	 * @generated
	 */
	public Adapter createPublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ObjectsPublic <em>Objects Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ObjectsPublic
	 * @generated
	 */
	public Adapter createObjectsPublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.BucketObjectsNotPublic <em>Bucket Objects Not Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.BucketObjectsNotPublic
	 * @generated
	 */
	public Adapter createBucketObjectsNotPublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.OnlyAuthorized <em>Only Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.OnlyAuthorized
	 * @generated
	 */
	public Adapter createOnlyAuthorizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.File_a <em>File a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.File_a
	 * @generated
	 */
	public Adapter createFile_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Folder_a <em>Folder a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Folder_a
	 * @generated
	 */
	public Adapter createFolder_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.MetaData
	 * @generated
	 */
	public Adapter createMetaDataAdapter() {
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

} //PhotosMetaModelAdapterFactory
