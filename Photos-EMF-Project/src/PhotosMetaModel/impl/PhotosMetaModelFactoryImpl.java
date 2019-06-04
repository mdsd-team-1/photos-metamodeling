/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Access;
import PhotosMetaModel.Action_a;
import PhotosMetaModel.Actions;
import PhotosMetaModel.Album;
import PhotosMetaModel.AlbumManagement;
import PhotosMetaModel.AllowedToUse;
import PhotosMetaModel.AmazonElasticComputeCloud;
import PhotosMetaModel.AmazonS3API;
import PhotosMetaModel.AmazonS3Storage;
import PhotosMetaModel.AmazonSimpleStorageService;
import PhotosMetaModel.AmazonWebServices;
import PhotosMetaModel.AppAccess;
import PhotosMetaModel.Architecture;
import PhotosMetaModel.Association;
import PhotosMetaModel.Autowired;
import PhotosMetaModel.BatchOperation;
import PhotosMetaModel.Bean;
import PhotosMetaModel.Bucket;
import PhotosMetaModel.BucketObjectsNotPublic;
import PhotosMetaModel.BusinessLogic;
import PhotosMetaModel.BusinessLogicSegment;
import PhotosMetaModel.Clause;
import PhotosMetaModel.Cluster;
import PhotosMetaModel.Column;
import PhotosMetaModel.Column_p;
import PhotosMetaModel.Column_s;
import PhotosMetaModel.Component;
import PhotosMetaModel.Component_a;
import PhotosMetaModel.Components;
import PhotosMetaModel.Configuration;
import PhotosMetaModel.Connection;
import PhotosMetaModel.Constraint;
import PhotosMetaModel.Constructor;
import PhotosMetaModel.Controller_a;
import PhotosMetaModel.CoreFunctions;
import PhotosMetaModel.Data;
import PhotosMetaModel.DataSegment;
import PhotosMetaModel.DataType;
import PhotosMetaModel.Database;
import PhotosMetaModel.DeleteMapping;
import PhotosMetaModel.Dependencies;
import PhotosMetaModel.Directories;
import PhotosMetaModel.Domain;
import PhotosMetaModel.EnableAuthorizationServer;
import PhotosMetaModel.EnableGlobalMethodSecurity;
import PhotosMetaModel.EnableResourceServer;
import PhotosMetaModel.EnableWebSecurity;
import PhotosMetaModel.Entities;
import PhotosMetaModel.Entity;
import PhotosMetaModel.ExceptionHandler;
import PhotosMetaModel.File_a;
import PhotosMetaModel.Files;
import PhotosMetaModel.Folder_a;
import PhotosMetaModel.ForeignKey;
import PhotosMetaModel.Function_p;
import PhotosMetaModel.Functionalities;
import PhotosMetaModel.GeneratedValue;
import PhotosMetaModel.GetMapping;
import PhotosMetaModel.Id;
import PhotosMetaModel.Index;
import PhotosMetaModel.Index_p;
import PhotosMetaModel.Information;
import PhotosMetaModel.Layer;
import PhotosMetaModel.Libraries;
import PhotosMetaModel.LifeCycle;
import PhotosMetaModel.Logic;
import PhotosMetaModel.MetaData;
import PhotosMetaModel.Model_a;
import PhotosMetaModel.Modules;
import PhotosMetaModel.NTier;
import PhotosMetaModel.NamedNativeQuery;
import PhotosMetaModel.ObjectsPublic;
import PhotosMetaModel.OnlyAuthorized;
import PhotosMetaModel.Order_s;
import PhotosMetaModel.PathVariable;
import PhotosMetaModel.Photo;
import PhotosMetaModel.PhotoActions;
import PhotosMetaModel.PhotosMetaModelFactory;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Policy;
import PhotosMetaModel.PostMapping;
import PhotosMetaModel.PostgreSQL;
import PhotosMetaModel.PostgreSQLConnection;
import PhotosMetaModel.PostgreSQL_a;
import PhotosMetaModel.Predicate;
import PhotosMetaModel.Presentation;
import PhotosMetaModel.PresentationSegment;
import PhotosMetaModel.Privilege;
import PhotosMetaModel.ProfileManagement;
import PhotosMetaModel.Props;
import PhotosMetaModel.Public;
import PhotosMetaModel.PutMapping;
import PhotosMetaModel.Query;
import PhotosMetaModel.REST;
import PhotosMetaModel.React;
import PhotosMetaModel.ReactClasses;
import PhotosMetaModel.ReactConfiguration;
import PhotosMetaModel.ReactDOM;
import PhotosMetaModel.ReactFunctions;
import PhotosMetaModel.Relation;
import PhotosMetaModel.Render;
import PhotosMetaModel.Repository;
import PhotosMetaModel.Repository_a;
import PhotosMetaModel.Request;
import PhotosMetaModel.RequestMapping;
import PhotosMetaModel.RequestPart;
import PhotosMetaModel.RestController;
import PhotosMetaModel.Router;
import PhotosMetaModel.Row;
import PhotosMetaModel.Scheme;
import PhotosMetaModel.SearchCriteria;
import PhotosMetaModel.Security_a;
import PhotosMetaModel.SegmentStructure;
import PhotosMetaModel.Services;
import PhotosMetaModel.SoftGallery;
import PhotosMetaModel.Specification;
import PhotosMetaModel.Spring;
import PhotosMetaModel.SpringBootApplication;
import PhotosMetaModel.State;
import PhotosMetaModel.Structure;
import PhotosMetaModel.Subcomponents;
import PhotosMetaModel.Table_p;
import PhotosMetaModel.Table_s;
import PhotosMetaModel.Technology;
import PhotosMetaModel.Trigger;
import PhotosMetaModel.UI;
import PhotosMetaModel.User_d;
import PhotosMetaModel.User_p;
import PhotosMetaModel.View;
import PhotosMetaModel.ViewComponents;
import PhotosMetaModel.View_a;

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
			case PhotosMetaModelPackage.INDEX: return createIndex();
			case PhotosMetaModelPackage.COLUMN_S: return createColumn_s();
			case PhotosMetaModelPackage.USER_D: return createUser_d();
			case PhotosMetaModelPackage.APP_ACCESS: return createAppAccess();
			case PhotosMetaModelPackage.PROFILE_MANAGEMENT: return createProfileManagement();
			case PhotosMetaModelPackage.ALBUM_MANAGEMENT: return createAlbumManagement();
			case PhotosMetaModelPackage.PHOTO_ACTIONS: return createPhotoActions();
			case PhotosMetaModelPackage.PHOTO: return createPhoto();
			case PhotosMetaModelPackage.ALBUM: return createAlbum();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES: return createAmazonWebServices();
			case PhotosMetaModelPackage.NTIER: return createNTier();
			case PhotosMetaModelPackage.LAYER: return createLayer();
			case PhotosMetaModelPackage.CONNECTION: return createConnection();
			case PhotosMetaModelPackage.RELATION: return createRelation();
			case PhotosMetaModelPackage.REST: return createREST();
			case PhotosMetaModelPackage.POSTGRE_SQL_CONNECTION: return createPostgreSQLConnection();
			case PhotosMetaModelPackage.AMAZON_S3API: return createAmazonS3API();
			case PhotosMetaModelPackage.PRESENTATION: return createPresentation();
			case PhotosMetaModelPackage.BUSINESS_LOGIC: return createBusinessLogic();
			case PhotosMetaModelPackage.DATA: return createData();
			case PhotosMetaModelPackage.ALLOWED_TO_USE: return createAllowedToUse();
			case PhotosMetaModelPackage.PRESENTATION_SEGMENT: return createPresentationSegment();
			case PhotosMetaModelPackage.BUSINESS_LOGIC_SEGMENT: return createBusinessLogicSegment();
			case PhotosMetaModelPackage.DATA_SEGMENT: return createDataSegment();
			case PhotosMetaModelPackage.VIEW_A: return createView_a();
			case PhotosMetaModelPackage.COMPONENT_A: return createComponent_a();
			case PhotosMetaModelPackage.ACTION_A: return createAction_a();
			case PhotosMetaModelPackage.CONTROLLER_A: return createController_a();
			case PhotosMetaModelPackage.MODEL_A: return createModel_a();
			case PhotosMetaModelPackage.REPOSITORY_A: return createRepository_a();
			case PhotosMetaModelPackage.SECURITY_A: return createSecurity_a();
			case PhotosMetaModelPackage.POSTGRE_SQL_A: return createPostgreSQL_a();
			case PhotosMetaModelPackage.AMAZON_S3_STORAGE: return createAmazonS3Storage();
			case PhotosMetaModelPackage.MODULES: return createModules();
			case PhotosMetaModelPackage.COMPONENTS: return createComponents();
			case PhotosMetaModelPackage.REACT_FUNCTIONS: return createReactFunctions();
			case PhotosMetaModelPackage.RENDER: return createRender();
			case PhotosMetaModelPackage.CONSTRUCTOR: return createConstructor();
			case PhotosMetaModelPackage.LIFE_CYCLE: return createLifeCycle();
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE: return createAmazonSimpleStorageService();
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
			case PhotosMetaModelPackage.REACT_CONFIGURATION: return createReactConfiguration();
			case PhotosMetaModelPackage.REACT_DOM: return createReactDOM();
			case PhotosMetaModelPackage.DEPENDENCIES: return createDependencies();
			case PhotosMetaModelPackage.LOGIC: return createLogic();
			case PhotosMetaModelPackage.UI: return createUI();
			case PhotosMetaModelPackage.REACT_CLASSES: return createReactClasses();
			case PhotosMetaModelPackage.CORE_FUNCTIONS: return createCoreFunctions();
			case PhotosMetaModelPackage.ROUTER: return createRouter();
			case PhotosMetaModelPackage.STRUCTURE: return createStructure();
			case PhotosMetaModelPackage.VIEW_COMPONENTS: return createViewComponents();
			case PhotosMetaModelPackage.SUBCOMPONENTS: return createSubcomponents();
			case PhotosMetaModelPackage.ACTIONS: return createActions();
			case PhotosMetaModelPackage.REQUEST: return createRequest();
			case PhotosMetaModelPackage.SERVICES: return createServices();
			case PhotosMetaModelPackage.LIBRARIES: return createLibraries();
			case PhotosMetaModelPackage.PROPS: return createProps();
			case PhotosMetaModelPackage.STATE: return createState();
			case PhotosMetaModelPackage.INFORMATION: return createInformation();
			case PhotosMetaModelPackage.ENTITIES: return createEntities();
			case PhotosMetaModelPackage.FUNCTIONALITIES: return createFunctionalities();
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE: return createSegmentStructure();
			case PhotosMetaModelPackage.DIRECTORIES: return createDirectories();
			case PhotosMetaModelPackage.FILES: return createFiles();
			case PhotosMetaModelPackage.AMAZON_ELASTIC_COMPUTE_CLOUD: return createAmazonElasticComputeCloud();
			case PhotosMetaModelPackage.ASSOCIATION: return createAssociation();
			case PhotosMetaModelPackage.PATH_VARIABLE: return createPathVariable();
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
	public User_d createUser_d() {
		User_dImpl user_d = new User_dImpl();
		return user_d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppAccess createAppAccess() {
		AppAccessImpl appAccess = new AppAccessImpl();
		return appAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileManagement createProfileManagement() {
		ProfileManagementImpl profileManagement = new ProfileManagementImpl();
		return profileManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlbumManagement createAlbumManagement() {
		AlbumManagementImpl albumManagement = new AlbumManagementImpl();
		return albumManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotoActions createPhotoActions() {
		PhotoActionsImpl photoActions = new PhotoActionsImpl();
		return photoActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Photo createPhoto() {
		PhotoImpl photo = new PhotoImpl();
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Album createAlbum() {
		AlbumImpl album = new AlbumImpl();
		return album;
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
	public PostgreSQLConnection createPostgreSQLConnection() {
		PostgreSQLConnectionImpl postgreSQLConnection = new PostgreSQLConnectionImpl();
		return postgreSQLConnection;
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
	public Presentation createPresentation() {
		PresentationImpl presentation = new PresentationImpl();
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessLogic createBusinessLogic() {
		BusinessLogicImpl businessLogic = new BusinessLogicImpl();
		return businessLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
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
	public PresentationSegment createPresentationSegment() {
		PresentationSegmentImpl presentationSegment = new PresentationSegmentImpl();
		return presentationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessLogicSegment createBusinessLogicSegment() {
		BusinessLogicSegmentImpl businessLogicSegment = new BusinessLogicSegmentImpl();
		return businessLogicSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSegment createDataSegment() {
		DataSegmentImpl dataSegment = new DataSegmentImpl();
		return dataSegment;
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
	public Modules createModules() {
		ModulesImpl modules = new ModulesImpl();
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Components createComponents() {
		ComponentsImpl components = new ComponentsImpl();
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactFunctions createReactFunctions() {
		ReactFunctionsImpl reactFunctions = new ReactFunctionsImpl();
		return reactFunctions;
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
	public LifeCycle createLifeCycle() {
		LifeCycleImpl lifeCycle = new LifeCycleImpl();
		return lifeCycle;
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
	public ReactConfiguration createReactConfiguration() {
		ReactConfigurationImpl reactConfiguration = new ReactConfigurationImpl();
		return reactConfiguration;
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
	public Dependencies createDependencies() {
		DependenciesImpl dependencies = new DependenciesImpl();
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Logic createLogic() {
		LogicImpl logic = new LogicImpl();
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UI createUI() {
		UIImpl ui = new UIImpl();
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactClasses createReactClasses() {
		ReactClassesImpl reactClasses = new ReactClassesImpl();
		return reactClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFunctions createCoreFunctions() {
		CoreFunctionsImpl coreFunctions = new CoreFunctionsImpl();
		return coreFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewComponents createViewComponents() {
		ViewComponentsImpl viewComponents = new ViewComponentsImpl();
		return viewComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subcomponents createSubcomponents() {
		SubcomponentsImpl subcomponents = new SubcomponentsImpl();
		return subcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actions createActions() {
		ActionsImpl actions = new ActionsImpl();
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Libraries createLibraries() {
		LibrariesImpl libraries = new LibrariesImpl();
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Props createProps() {
		PropsImpl props = new PropsImpl();
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entities createEntities() {
		EntitiesImpl entities = new EntitiesImpl();
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Functionalities createFunctionalities() {
		FunctionalitiesImpl functionalities = new FunctionalitiesImpl();
		return functionalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentStructure createSegmentStructure() {
		SegmentStructureImpl segmentStructure = new SegmentStructureImpl();
		return segmentStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directories createDirectories() {
		DirectoriesImpl directories = new DirectoriesImpl();
		return directories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Files createFiles() {
		FilesImpl files = new FilesImpl();
		return files;
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
	public PathVariable createPathVariable() {
		PathVariableImpl pathVariable = new PathVariableImpl();
		return pathVariable;
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
