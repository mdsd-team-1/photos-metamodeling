/**
 */
package PhotosMetaModel.util;

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
import PhotosMetaModel.Photo;
import PhotosMetaModel.PhotoActions;
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
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseColumn_s(Column_s object) {
				return createColumn_sAdapter();
			}
			@Override
			public Adapter caseUser_d(User_d object) {
				return createUser_dAdapter();
			}
			@Override
			public Adapter caseAppAccess(AppAccess object) {
				return createAppAccessAdapter();
			}
			@Override
			public Adapter caseProfileManagement(ProfileManagement object) {
				return createProfileManagementAdapter();
			}
			@Override
			public Adapter caseAlbumManagement(AlbumManagement object) {
				return createAlbumManagementAdapter();
			}
			@Override
			public Adapter casePhotoActions(PhotoActions object) {
				return createPhotoActionsAdapter();
			}
			@Override
			public Adapter casePhoto(Photo object) {
				return createPhotoAdapter();
			}
			@Override
			public Adapter caseAlbum(Album object) {
				return createAlbumAdapter();
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
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseREST(REST object) {
				return createRESTAdapter();
			}
			@Override
			public Adapter casePostgreSQLConnection(PostgreSQLConnection object) {
				return createPostgreSQLConnectionAdapter();
			}
			@Override
			public Adapter caseAmazonS3API(AmazonS3API object) {
				return createAmazonS3APIAdapter();
			}
			@Override
			public Adapter casePresentation(Presentation object) {
				return createPresentationAdapter();
			}
			@Override
			public Adapter caseBusinessLogic(BusinessLogic object) {
				return createBusinessLogicAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseAllowedToUse(AllowedToUse object) {
				return createAllowedToUseAdapter();
			}
			@Override
			public Adapter casePresentationSegment(PresentationSegment object) {
				return createPresentationSegmentAdapter();
			}
			@Override
			public Adapter caseBusinessLogicSegment(BusinessLogicSegment object) {
				return createBusinessLogicSegmentAdapter();
			}
			@Override
			public Adapter caseDataSegment(DataSegment object) {
				return createDataSegmentAdapter();
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
			public Adapter caseModules(Modules object) {
				return createModulesAdapter();
			}
			@Override
			public Adapter caseComponents(Components object) {
				return createComponentsAdapter();
			}
			@Override
			public Adapter caseReactFunctions(ReactFunctions object) {
				return createReactFunctionsAdapter();
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
			public Adapter caseLifeCycle(LifeCycle object) {
				return createLifeCycleAdapter();
			}
			@Override
			public Adapter caseAmazonSimpleStorageService(AmazonSimpleStorageService object) {
				return createAmazonSimpleStorageServiceAdapter();
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
			public Adapter caseReactConfiguration(ReactConfiguration object) {
				return createReactConfigurationAdapter();
			}
			@Override
			public Adapter caseReactDOM(ReactDOM object) {
				return createReactDOMAdapter();
			}
			@Override
			public Adapter caseDependencies(Dependencies object) {
				return createDependenciesAdapter();
			}
			@Override
			public Adapter caseLogic(Logic object) {
				return createLogicAdapter();
			}
			@Override
			public Adapter caseUI(UI object) {
				return createUIAdapter();
			}
			@Override
			public Adapter caseReactClasses(ReactClasses object) {
				return createReactClassesAdapter();
			}
			@Override
			public Adapter caseCoreFunctions(CoreFunctions object) {
				return createCoreFunctionsAdapter();
			}
			@Override
			public Adapter caseRouter(Router object) {
				return createRouterAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseViewComponents(ViewComponents object) {
				return createViewComponentsAdapter();
			}
			@Override
			public Adapter caseSubcomponents(Subcomponents object) {
				return createSubcomponentsAdapter();
			}
			@Override
			public Adapter caseActions(Actions object) {
				return createActionsAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseServices(Services object) {
				return createServicesAdapter();
			}
			@Override
			public Adapter caseLibraries(Libraries object) {
				return createLibrariesAdapter();
			}
			@Override
			public Adapter caseProps(Props object) {
				return createPropsAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseInformation(Information object) {
				return createInformationAdapter();
			}
			@Override
			public Adapter caseEntities(Entities object) {
				return createEntitiesAdapter();
			}
			@Override
			public Adapter caseFunctionalities(Functionalities object) {
				return createFunctionalitiesAdapter();
			}
			@Override
			public Adapter caseSegmentStructure(SegmentStructure object) {
				return createSegmentStructureAdapter();
			}
			@Override
			public Adapter caseDirectories(Directories object) {
				return createDirectoriesAdapter();
			}
			@Override
			public Adapter caseFiles(Files object) {
				return createFilesAdapter();
			}
			@Override
			public Adapter caseAmazonElasticComputeCloud(AmazonElasticComputeCloud object) {
				return createAmazonElasticComputeCloudAdapter();
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.User_d <em>User d</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.User_d
	 * @generated
	 */
	public Adapter createUser_dAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AppAccess <em>App Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AppAccess
	 * @generated
	 */
	public Adapter createAppAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ProfileManagement <em>Profile Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ProfileManagement
	 * @generated
	 */
	public Adapter createProfileManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.AlbumManagement <em>Album Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.AlbumManagement
	 * @generated
	 */
	public Adapter createAlbumManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.PhotoActions <em>Photo Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.PhotoActions
	 * @generated
	 */
	public Adapter createPhotoActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Photo
	 * @generated
	 */
	public Adapter createPhotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Album
	 * @generated
	 */
	public Adapter createAlbumAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.PostgreSQLConnection <em>Postgre SQL Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.PostgreSQLConnection
	 * @generated
	 */
	public Adapter createPostgreSQLConnectionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Presentation
	 * @generated
	 */
	public Adapter createPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.BusinessLogic <em>Business Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.BusinessLogic
	 * @generated
	 */
	public Adapter createBusinessLogicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.PresentationSegment <em>Presentation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.PresentationSegment
	 * @generated
	 */
	public Adapter createPresentationSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.BusinessLogicSegment <em>Business Logic Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.BusinessLogicSegment
	 * @generated
	 */
	public Adapter createBusinessLogicSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.DataSegment <em>Data Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.DataSegment
	 * @generated
	 */
	public Adapter createDataSegmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Modules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Modules
	 * @generated
	 */
	public Adapter createModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Components
	 * @generated
	 */
	public Adapter createComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ReactFunctions <em>React Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ReactFunctions
	 * @generated
	 */
	public Adapter createReactFunctionsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.LifeCycle
	 * @generated
	 */
	public Adapter createLifeCycleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ReactConfiguration <em>React Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ReactConfiguration
	 * @generated
	 */
	public Adapter createReactConfigurationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Dependencies
	 * @generated
	 */
	public Adapter createDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Logic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Logic
	 * @generated
	 */
	public Adapter createLogicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.UI
	 * @generated
	 */
	public Adapter createUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ReactClasses <em>React Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ReactClasses
	 * @generated
	 */
	public Adapter createReactClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.CoreFunctions <em>Core Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.CoreFunctions
	 * @generated
	 */
	public Adapter createCoreFunctionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Router
	 * @generated
	 */
	public Adapter createRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.ViewComponents <em>View Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.ViewComponents
	 * @generated
	 */
	public Adapter createViewComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Subcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Subcomponents
	 * @generated
	 */
	public Adapter createSubcomponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Services
	 * @generated
	 */
	public Adapter createServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Libraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Libraries
	 * @generated
	 */
	public Adapter createLibrariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Props <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Props
	 * @generated
	 */
	public Adapter createPropsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Entities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Entities
	 * @generated
	 */
	public Adapter createEntitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Functionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Functionalities
	 * @generated
	 */
	public Adapter createFunctionalitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SegmentStructure <em>Segment Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SegmentStructure
	 * @generated
	 */
	public Adapter createSegmentStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Directories <em>Directories</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Directories
	 * @generated
	 */
	public Adapter createDirectoriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Files
	 * @generated
	 */
	public Adapter createFilesAdapter() {
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
