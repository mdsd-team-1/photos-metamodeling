/**
 */
package PhotosMetaModel.impl;

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
import PhotosMetaModel.PhotosMetaModelFactory;
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
public class PhotosMetaModelFactoryImpl extends EFactoryImpl implements PhotosMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhotosMetaModelFactory init() {
		try {
			PhotosMetaModelFactory thePhotosMetaModelFactory = (PhotosMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(PhotosMetaModelPackage.eNS_URI);
			if (thePhotosMetaModelFactory != null) {
				return thePhotosMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhotosMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotosMetaModelFactoryImpl() {
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
			case PhotosMetaModelPackage.SOFT_GALLERY: return createSoftGallery();
			case PhotosMetaModelPackage.DOMAIN: return createDomain();
			case PhotosMetaModelPackage.ARCHITECTURE: return createArchitecture();
			case PhotosMetaModelPackage.TECHNOLOGY: return createTechnology();
			case PhotosMetaModelPackage.SPRING: return createSpring();
			case PhotosMetaModelPackage.REACT: return createReact();
			case PhotosMetaModelPackage.REPOSITORY: return createRepository();
			case PhotosMetaModelPackage.REST_CONTROLLER: return createRestController();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION: return createSpringBootApplication();
			case PhotosMetaModelPackage.REQUEST_MAPPING: return createRequestMapping();
			case PhotosMetaModelPackage.POST_MAPPING: return createPostMapping();
			case PhotosMetaModelPackage.GET_MAPPING: return createGetMapping();
			case PhotosMetaModelPackage.PUT_MAPPING: return createPutMapping();
			case PhotosMetaModelPackage.EXCEPTION_HANDLER: return createExceptionHandler();
			case PhotosMetaModelPackage.DELETE_MAPPING: return createDeleteMapping();
			case PhotosMetaModelPackage.REQUEST_PART: return createRequestPart();
			case PhotosMetaModelPackage.AUTOWIRED: return createAutowired();
			case PhotosMetaModelPackage.EXCEPTION: return createException();
			case PhotosMetaModelPackage.ENTITY: return createEntity();
			case PhotosMetaModelPackage.TABLE_S: return createTable_s();
			case PhotosMetaModelPackage.ID: return createId();
			case PhotosMetaModelPackage.COLUMN_P: return createColumn_p();
			case PhotosMetaModelPackage.GENERATED_VALUE: return createGeneratedValue();
			case PhotosMetaModelPackage.NAMED_NATIVE_QUERY: return createNamedNativeQuery();
			case PhotosMetaModelPackage.SPECIFICATION: return createSpecification();
			case PhotosMetaModelPackage.SEARCH_CRITERIA: return createSearchCriteria();
			case PhotosMetaModelPackage.PREDICATE: return createPredicate();
			case PhotosMetaModelPackage.CONFIGURATION: return createConfiguration();
			case PhotosMetaModelPackage.COMPONENT: return createComponent();
			case PhotosMetaModelPackage.ORDER_S: return createOrder_s();
			case PhotosMetaModelPackage.ENABLE_AUTHORIZATION_SERVER: return createEnableAuthorizationServer();
			case PhotosMetaModelPackage.ENABLE_RESOURCE_SERVER: return createEnableResourceServer();
			case PhotosMetaModelPackage.ENABLE_WEB_SECURITY: return createEnableWebSecurity();
			case PhotosMetaModelPackage.ENABLE_GLOBAL_METHOD_SECURITY: return createEnableGlobalMethodSecurity();
			case PhotosMetaModelPackage.BEAN: return createBean();
			case PhotosMetaModelPackage.POSTGRE_SQL: return createPostgreSQL();
			case PhotosMetaModelPackage.QUERY: return createQuery();
			case PhotosMetaModelPackage.FOREIGN_KEY: return createForeignKey();
			case PhotosMetaModelPackage.TRIGGER: return createTrigger();
			case PhotosMetaModelPackage.VIEW: return createView();
			case PhotosMetaModelPackage.INDEX_P: return createIndex_p();
			case PhotosMetaModelPackage.TABLE_P: return createTable_p();
			case PhotosMetaModelPackage.FUNCTION_P: return createFunction_p();
			case PhotosMetaModelPackage.DATABASE: return createDatabase();
			case PhotosMetaModelPackage.SCHEME: return createScheme();
			case PhotosMetaModelPackage.USER_P: return createUser_p();
			case PhotosMetaModelPackage.CLUSTER: return createCluster();
			case PhotosMetaModelPackage.ROW: return createRow();
			case PhotosMetaModelPackage.COLUMN: return createColumn();
			case PhotosMetaModelPackage.DATA_TYPE: return createDataType();
			case PhotosMetaModelPackage.CONSTRAINT: return createConstraint();
			case PhotosMetaModelPackage.PRIVILEGE: return createPrivilege();
			case PhotosMetaModelPackage.POLICY: return createPolicy();
			case PhotosMetaModelPackage.CLAUSE: return createClause();
			case PhotosMetaModelPackage.INSERT: return createInsert();
			case PhotosMetaModelPackage.FROM: return createFrom();
			case PhotosMetaModelPackage.JOIN: return createJoin();
			case PhotosMetaModelPackage.LATERAL: return createLateral();
			case PhotosMetaModelPackage.WHERE: return createWhere();
			case PhotosMetaModelPackage.GROUP_BY: return createGroupBy();
			case PhotosMetaModelPackage.HAVING: return createHaving();
			case PhotosMetaModelPackage.SELECT: return createSelect();
			case PhotosMetaModelPackage.DISTNCT: return createDistnct();
			case PhotosMetaModelPackage.LIMIT: return createLimit();
			case PhotosMetaModelPackage.OFFSET: return createOffset();
			case PhotosMetaModelPackage.VALUES: return createValues();
			case PhotosMetaModelPackage.ALTER: return createAlter();
			case PhotosMetaModelPackage.DELETE: return createDelete();
			case PhotosMetaModelPackage.CREATE: return createCreate();
			case PhotosMetaModelPackage.DROP: return createDrop();
			case PhotosMetaModelPackage.USING: return createUsing();
			case PhotosMetaModelPackage.INDEX: return createIndex();
			case PhotosMetaModelPackage.UPDATE: return createUpdate();
			case PhotosMetaModelPackage.ARRAY: return createArray();
			case PhotosMetaModelPackage.INTO: return createInto();
			case PhotosMetaModelPackage.COLUMN_S: return createColumn_s();
			case PhotosMetaModelPackage.ORDER_P: return createOrder_p();
			case PhotosMetaModelPackage.USUARIO: return createUsuario();
			case PhotosMetaModelPackage.AUTENTICACION: return createAutenticacion();
			case PhotosMetaModelPackage.REGISTRO: return createRegistro();
			case PhotosMetaModelPackage.MANEJO_PERFIL: return createManejoPerfil();
			case PhotosMetaModelPackage.ACCION: return createAccion();
			case PhotosMetaModelPackage.CREAR_ALBUM: return createCrearAlbum();
			case PhotosMetaModelPackage.VER_ALBUM: return createVerAlbum();
			case PhotosMetaModelPackage.CARGAR_FOTO: return createCargarFoto();
			case PhotosMetaModelPackage.VER_TODAS_LAS_FOTOS: return createVerTodasLasFotos();
			case PhotosMetaModelPackage.EDITAR_PERFIL: return createEditarPerfil();
			case PhotosMetaModelPackage.FOTO: return createFoto();
			case PhotosMetaModelPackage.CATEGORIA: return createCategoria();
			case PhotosMetaModelPackage.IMAGEN: return createImagen();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES: return createAmazonWebServices();
			case PhotosMetaModelPackage.NTIER: return createNTier();
			case PhotosMetaModelPackage.CAPA: return createCapa();
			case PhotosMetaModelPackage.CONEXION: return createConexion();
			case PhotosMetaModelPackage.RELACION: return createRelacion();
			case PhotosMetaModelPackage.REST: return createREST();
			case PhotosMetaModelPackage.CONEXION_POSTGRE_SQL: return createConexionPostgreSQL();
			case PhotosMetaModelPackage.AMAZON_S3API: return createAmazonS3API();
			case PhotosMetaModelPackage.PRESENTACION: return createPresentacion();
			case PhotosMetaModelPackage.LOGICA_DE_NEGOCIO: return createLogicaDeNegocio();
			case PhotosMetaModelPackage.DATOS: return createDatos();
			case PhotosMetaModelPackage.ALLOWED_TO_USE: return createAllowedToUse();
			case PhotosMetaModelPackage.SEGMENTO_PRESENTACION: return createSegmentoPresentacion();
			case PhotosMetaModelPackage.SEGMENTO_LOGICA: return createSegmentoLogica();
			case PhotosMetaModelPackage.SEGMENTO_DATOS: return createSegmentoDatos();
			case PhotosMetaModelPackage.VIEW_A: return createView_a();
			case PhotosMetaModelPackage.COMPONENT_A: return createComponent_a();
			case PhotosMetaModelPackage.ACTION_A: return createAction_a();
			case PhotosMetaModelPackage.CONTROLLER_A: return createController_a();
			case PhotosMetaModelPackage.MODEL_A: return createModel_a();
			case PhotosMetaModelPackage.REPOSITORY_A: return createRepository_a();
			case PhotosMetaModelPackage.SECURITY_A: return createSecurity_a();
			case PhotosMetaModelPackage.POSTGRE_SQL_A: return createPostgreSQL_a();
			case PhotosMetaModelPackage.AMAZON_S3_STORAGE: return createAmazonS3Storage();
			case PhotosMetaModelPackage.REACT_DOM: return createReactDOM();
			case PhotosMetaModelPackage.ELEMENT_R: return createElement_r();
			case PhotosMetaModelPackage.COMPONENT_R: return createComponent_r();
			case PhotosMetaModelPackage.PROP: return createProp();
			case PhotosMetaModelPackage.CLASS_R: return createClass_r();
			case PhotosMetaModelPackage.FUNCTION_R: return createFunction_r();
			case PhotosMetaModelPackage.RENDER: return createRender();
			case PhotosMetaModelPackage.CONSTRUCTOR: return createConstructor();
			case PhotosMetaModelPackage.COMPONENT_DID_MOUNT: return createComponentDidMount();
			case PhotosMetaModelPackage.COMPONENT_WILL_UNMOUNT: return createComponentWillUnmount();
			case PhotosMetaModelPackage.AMAZON_ELASTIC_COMPUTE_CLOUD: return createAmazonElasticComputeCloud();
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE: return createAmazonSimpleStorageService();
			case PhotosMetaModelPackage.AMAZON_AURORA: return createAmazonAurora();
			case PhotosMetaModelPackage.AMAZON_DYNAMO_DB: return createAmazonDynamoDB();
			case PhotosMetaModelPackage.AMAZON_SAGE_MAKER: return createAmazonSageMaker();
			case PhotosMetaModelPackage.BUCKET: return createBucket();
			case PhotosMetaModelPackage.BATCH_OPERATION: return createBatchOperation();
			case PhotosMetaModelPackage.ACCESS: return createAccess();
			case PhotosMetaModelPackage.PUBLIC: return createPublic();
			case PhotosMetaModelPackage.OBJECTS_PUBLIC: return createObjectsPublic();
			case PhotosMetaModelPackage.BUCKET_OBJECTS_NOT_PUBLIC: return createBucketObjectsNotPublic();
			case PhotosMetaModelPackage.ONLY_AUTHORIZED: return createOnlyAuthorized();
			case PhotosMetaModelPackage.FILE_A: return createFile_a();
			case PhotosMetaModelPackage.FOLDER_A: return createFolder_a();
			case PhotosMetaModelPackage.META_DATA: return createMetaData();
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
	public SoftGallery createSoftGallery() {
		SoftGalleryImpl softGallery = new SoftGalleryImpl();
		return softGallery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spring createSpring() {
		SpringImpl spring = new SpringImpl();
		return spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public React createReact() {
		ReactImpl react = new ReactImpl();
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestController createRestController() {
		RestControllerImpl restController = new RestControllerImpl();
		return restController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpringBootApplication createSpringBootApplication() {
		SpringBootApplicationImpl springBootApplication = new SpringBootApplicationImpl();
		return springBootApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestMapping createRequestMapping() {
		RequestMappingImpl requestMapping = new RequestMappingImpl();
		return requestMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostMapping createPostMapping() {
		PostMappingImpl postMapping = new PostMappingImpl();
		return postMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetMapping createGetMapping() {
		GetMappingImpl getMapping = new GetMappingImpl();
		return getMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PutMapping createPutMapping() {
		PutMappingImpl putMapping = new PutMappingImpl();
		return putMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionHandler createExceptionHandler() {
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteMapping createDeleteMapping() {
		DeleteMappingImpl deleteMapping = new DeleteMappingImpl();
		return deleteMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPart createRequestPart() {
		RequestPartImpl requestPart = new RequestPartImpl();
		return requestPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Autowired createAutowired() {
		AutowiredImpl autowired = new AutowiredImpl();
		return autowired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotosMetaModel.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table_s createTable_s() {
		Table_sImpl table_s = new Table_sImpl();
		return table_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column_p createColumn_p() {
		Column_pImpl column_p = new Column_pImpl();
		return column_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneratedValue createGeneratedValue() {
		GeneratedValueImpl generatedValue = new GeneratedValueImpl();
		return generatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedNativeQuery createNamedNativeQuery() {
		NamedNativeQueryImpl namedNativeQuery = new NamedNativeQueryImpl();
		return namedNativeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchCriteria createSearchCriteria() {
		SearchCriteriaImpl searchCriteria = new SearchCriteriaImpl();
		return searchCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order_s createOrder_s() {
		Order_sImpl order_s = new Order_sImpl();
		return order_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableAuthorizationServer createEnableAuthorizationServer() {
		EnableAuthorizationServerImpl enableAuthorizationServer = new EnableAuthorizationServerImpl();
		return enableAuthorizationServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableResourceServer createEnableResourceServer() {
		EnableResourceServerImpl enableResourceServer = new EnableResourceServerImpl();
		return enableResourceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableWebSecurity createEnableWebSecurity() {
		EnableWebSecurityImpl enableWebSecurity = new EnableWebSecurityImpl();
		return enableWebSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableGlobalMethodSecurity createEnableGlobalMethodSecurity() {
		EnableGlobalMethodSecurityImpl enableGlobalMethodSecurity = new EnableGlobalMethodSecurityImpl();
		return enableGlobalMethodSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bean createBean() {
		BeanImpl bean = new BeanImpl();
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostgreSQL createPostgreSQL() {
		PostgreSQLImpl postgreSQL = new PostgreSQLImpl();
		return postgreSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
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
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index_p createIndex_p() {
		Index_pImpl index_p = new Index_pImpl();
		return index_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table_p createTable_p() {
		Table_pImpl table_p = new Table_pImpl();
		return table_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function_p createFunction_p() {
		Function_pImpl function_p = new Function_pImpl();
		return function_p;
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
	public Scheme createScheme() {
		SchemeImpl scheme = new SchemeImpl();
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User_p createUser_p() {
		User_pImpl user_p = new User_pImpl();
		return user_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
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
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Privilege createPrivilege() {
		PrivilegeImpl privilege = new PrivilegeImpl();
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public From createFrom() {
		FromImpl from = new FromImpl();
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lateral createLateral() {
		LateralImpl lateral = new LateralImpl();
		return lateral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupBy createGroupBy() {
		GroupByImpl groupBy = new GroupByImpl();
		return groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Having createHaving() {
		HavingImpl having = new HavingImpl();
		return having;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distnct createDistnct() {
		DistnctImpl distnct = new DistnctImpl();
		return distnct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offset createOffset() {
		OffsetImpl offset = new OffsetImpl();
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Values createValues() {
		ValuesImpl values = new ValuesImpl();
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alter createAlter() {
		AlterImpl alter = new AlterImpl();
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Using createUsing() {
		UsingImpl using = new UsingImpl();
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Into createInto() {
		IntoImpl into = new IntoImpl();
		return into;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column_s createColumn_s() {
		Column_sImpl column_s = new Column_sImpl();
		return column_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order_p createOrder_p() {
		Order_pImpl order_p = new Order_pImpl();
		return order_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Autenticacion createAutenticacion() {
		AutenticacionImpl autenticacion = new AutenticacionImpl();
		return autenticacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Registro createRegistro() {
		RegistroImpl registro = new RegistroImpl();
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManejoPerfil createManejoPerfil() {
		ManejoPerfilImpl manejoPerfil = new ManejoPerfilImpl();
		return manejoPerfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accion createAccion() {
		AccionImpl accion = new AccionImpl();
		return accion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrearAlbum createCrearAlbum() {
		CrearAlbumImpl crearAlbum = new CrearAlbumImpl();
		return crearAlbum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerAlbum createVerAlbum() {
		VerAlbumImpl verAlbum = new VerAlbumImpl();
		return verAlbum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargarFoto createCargarFoto() {
		CargarFotoImpl cargarFoto = new CargarFotoImpl();
		return cargarFoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerTodasLasFotos createVerTodasLasFotos() {
		VerTodasLasFotosImpl verTodasLasFotos = new VerTodasLasFotosImpl();
		return verTodasLasFotos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditarPerfil createEditarPerfil() {
		EditarPerfilImpl editarPerfil = new EditarPerfilImpl();
		return editarPerfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foto createFoto() {
		FotoImpl foto = new FotoImpl();
		return foto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categoria createCategoria() {
		CategoriaImpl categoria = new CategoriaImpl();
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imagen createImagen() {
		ImagenImpl imagen = new ImagenImpl();
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonWebServices createAmazonWebServices() {
		AmazonWebServicesImpl amazonWebServices = new AmazonWebServicesImpl();
		return amazonWebServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NTier createNTier() {
		NTierImpl nTier = new NTierImpl();
		return nTier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capa createCapa() {
		CapaImpl capa = new CapaImpl();
		return capa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conexion createConexion() {
		ConexionImpl conexion = new ConexionImpl();
		return conexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relacion createRelacion() {
		RelacionImpl relacion = new RelacionImpl();
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public REST createREST() {
		RESTImpl rest = new RESTImpl();
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConexionPostgreSQL createConexionPostgreSQL() {
		ConexionPostgreSQLImpl conexionPostgreSQL = new ConexionPostgreSQLImpl();
		return conexionPostgreSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonS3API createAmazonS3API() {
		AmazonS3APIImpl amazonS3API = new AmazonS3APIImpl();
		return amazonS3API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Presentacion createPresentacion() {
		PresentacionImpl presentacion = new PresentacionImpl();
		return presentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicaDeNegocio createLogicaDeNegocio() {
		LogicaDeNegocioImpl logicaDeNegocio = new LogicaDeNegocioImpl();
		return logicaDeNegocio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datos createDatos() {
		DatosImpl datos = new DatosImpl();
		return datos;
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
	public SegmentoPresentacion createSegmentoPresentacion() {
		SegmentoPresentacionImpl segmentoPresentacion = new SegmentoPresentacionImpl();
		return segmentoPresentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentoLogica createSegmentoLogica() {
		SegmentoLogicaImpl segmentoLogica = new SegmentoLogicaImpl();
		return segmentoLogica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentoDatos createSegmentoDatos() {
		SegmentoDatosImpl segmentoDatos = new SegmentoDatosImpl();
		return segmentoDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View_a createView_a() {
		View_aImpl view_a = new View_aImpl();
		return view_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component_a createComponent_a() {
		Component_aImpl component_a = new Component_aImpl();
		return component_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action_a createAction_a() {
		Action_aImpl action_a = new Action_aImpl();
		return action_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller_a createController_a() {
		Controller_aImpl controller_a = new Controller_aImpl();
		return controller_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_a createModel_a() {
		Model_aImpl model_a = new Model_aImpl();
		return model_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository_a createRepository_a() {
		Repository_aImpl repository_a = new Repository_aImpl();
		return repository_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security_a createSecurity_a() {
		Security_aImpl security_a = new Security_aImpl();
		return security_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostgreSQL_a createPostgreSQL_a() {
		PostgreSQL_aImpl postgreSQL_a = new PostgreSQL_aImpl();
		return postgreSQL_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonS3Storage createAmazonS3Storage() {
		AmazonS3StorageImpl amazonS3Storage = new AmazonS3StorageImpl();
		return amazonS3Storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactDOM createReactDOM() {
		ReactDOMImpl reactDOM = new ReactDOMImpl();
		return reactDOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_r createElement_r() {
		Element_rImpl element_r = new Element_rImpl();
		return element_r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component_r createComponent_r() {
		Component_rImpl component_r = new Component_rImpl();
		return component_r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prop createProp() {
		PropImpl prop = new PropImpl();
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class_r createClass_r() {
		Class_rImpl class_r = new Class_rImpl();
		return class_r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function_r createFunction_r() {
		Function_rImpl function_r = new Function_rImpl();
		return function_r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Render createRender() {
		RenderImpl render = new RenderImpl();
		return render;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDidMount createComponentDidMount() {
		ComponentDidMountImpl componentDidMount = new ComponentDidMountImpl();
		return componentDidMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentWillUnmount createComponentWillUnmount() {
		ComponentWillUnmountImpl componentWillUnmount = new ComponentWillUnmountImpl();
		return componentWillUnmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonElasticComputeCloud createAmazonElasticComputeCloud() {
		AmazonElasticComputeCloudImpl amazonElasticComputeCloud = new AmazonElasticComputeCloudImpl();
		return amazonElasticComputeCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonSimpleStorageService createAmazonSimpleStorageService() {
		AmazonSimpleStorageServiceImpl amazonSimpleStorageService = new AmazonSimpleStorageServiceImpl();
		return amazonSimpleStorageService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonAurora createAmazonAurora() {
		AmazonAuroraImpl amazonAurora = new AmazonAuroraImpl();
		return amazonAurora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonDynamoDB createAmazonDynamoDB() {
		AmazonDynamoDBImpl amazonDynamoDB = new AmazonDynamoDBImpl();
		return amazonDynamoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonSageMaker createAmazonSageMaker() {
		AmazonSageMakerImpl amazonSageMaker = new AmazonSageMakerImpl();
		return amazonSageMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bucket createBucket() {
		BucketImpl bucket = new BucketImpl();
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatchOperation createBatchOperation() {
		BatchOperationImpl batchOperation = new BatchOperationImpl();
		return batchOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Access createAccess() {
		AccessImpl access = new AccessImpl();
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Public createPublic() {
		PublicImpl public_ = new PublicImpl();
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectsPublic createObjectsPublic() {
		ObjectsPublicImpl objectsPublic = new ObjectsPublicImpl();
		return objectsPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BucketObjectsNotPublic createBucketObjectsNotPublic() {
		BucketObjectsNotPublicImpl bucketObjectsNotPublic = new BucketObjectsNotPublicImpl();
		return bucketObjectsNotPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlyAuthorized createOnlyAuthorized() {
		OnlyAuthorizedImpl onlyAuthorized = new OnlyAuthorizedImpl();
		return onlyAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File_a createFile_a() {
		File_aImpl file_a = new File_aImpl();
		return file_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder_a createFolder_a() {
		Folder_aImpl folder_a = new Folder_aImpl();
		return folder_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotosMetaModelPackage getPhotosMetaModelPackage() {
		return (PhotosMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhotosMetaModelPackage getPackage() {
		return PhotosMetaModelPackage.eINSTANCE;
	}

} //PhotosMetaModelFactoryImpl
