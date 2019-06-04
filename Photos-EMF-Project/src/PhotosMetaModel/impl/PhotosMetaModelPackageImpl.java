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
import PhotosMetaModel.User_d;
import PhotosMetaModel.User_p;
import PhotosMetaModel.View;
import PhotosMetaModel.ViewComponents;
import PhotosMetaModel.View_a;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhotosMetaModelPackageImpl extends EPackageImpl implements PhotosMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softGalleryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass springEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass springBootApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass putMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autowiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass table_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass column_pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedNativeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass order_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableAuthorizationServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableResourceServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableWebSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableGlobalMethodSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postgreSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass index_pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass table_pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass function_pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass user_pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privilegeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass column_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass user_dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass albumManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass albumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonWebServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nTierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postgreSQLConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonS3APIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessLogicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowedToUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessLogicSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass view_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass action_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controller_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repository_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass security_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postgreSQL_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonS3StorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactFunctionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonSimpleStorageServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectsPublicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bucketObjectsNotPublicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlyAuthorizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass file_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folder_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactDOMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreFunctionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcomponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass librariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonElasticComputeCloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see PhotosMetaModel.PhotosMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhotosMetaModelPackageImpl() {
		super(eNS_URI, PhotosMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PhotosMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhotosMetaModelPackage init() {
		if (isInited) return (PhotosMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(PhotosMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPhotosMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PhotosMetaModelPackageImpl thePhotosMetaModelPackage = registeredPhotosMetaModelPackage instanceof PhotosMetaModelPackageImpl ? (PhotosMetaModelPackageImpl)registeredPhotosMetaModelPackage : new PhotosMetaModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePhotosMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		thePhotosMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhotosMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhotosMetaModelPackage.eNS_URI, thePhotosMetaModelPackage);
		return thePhotosMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftGallery() {
		return softGalleryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftGallery_Domain() {
		return (EReference)softGalleryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftGallery_Architecture() {
		return (EReference)softGalleryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftGallery_Technology() {
		return (EReference)softGalleryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomain_Entities() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitecture_Ntier() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnology() {
		return technologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnology_Spring() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnology_Postgresql() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnology_React() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnology_Amazonwebservices() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpring() {
		return springEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpring_Springbootapplication() {
		return (EReference)springEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReact() {
		return reactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReact_Modules() {
		return (EReference)reactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestController() {
		return restControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestController_Requestmapping() {
		return (EReference)restControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestController_Exceptionhandler() {
		return (EReference)restControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestController_Autowired() {
		return (EReference)restControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestController_Specification() {
		return (EReference)restControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestController_Name() {
		return (EAttribute)restControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpringBootApplication() {
		return springBootApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpringBootApplication_Repository() {
		return (EReference)springBootApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpringBootApplication_Restcontroller() {
		return (EReference)springBootApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpringBootApplication_Entity() {
		return (EReference)springBootApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpringBootApplication_Component() {
		return (EReference)springBootApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpringBootApplication_Configuration() {
		return (EReference)springBootApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestMapping() {
		return requestMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestMapping_Requestpart() {
		return (EReference)requestMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostMapping() {
		return postMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetMapping() {
		return getMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPutMapping() {
		return putMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExceptionHandler_Exception() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeleteMapping() {
		return deleteMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestPart() {
		return requestPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutowired() {
		return autowiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Table() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Namednativequery() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable_s() {
		return table_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_s_Column_s() {
		return (EReference)table_sEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_s_Name() {
		return (EAttribute)table_sEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_s_Id() {
		return (EReference)table_sEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getId() {
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getId_Generatedvalue() {
		return (EReference)idEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumn_p() {
		return column_pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_p_Constraint() {
		return (EReference)column_pEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_p_Datatype() {
		return (EReference)column_pEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_p_Name() {
		return (EAttribute)column_pEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneratedValue() {
		return generatedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedNativeQuery() {
		return namedNativeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecification_Searchcriteria() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSearchCriteria() {
		return searchCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicate_Specification() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Bean() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Enablewebsecurity() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Enableresourceserver() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Enableauthorizationserver() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Enableglobalmethodsecurity() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Order() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrder_s() {
		return order_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnableAuthorizationServer() {
		return enableAuthorizationServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnableResourceServer() {
		return enableResourceServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnableWebSecurity() {
		return enableWebSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnableGlobalMethodSecurity() {
		return enableGlobalMethodSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBean() {
		return beanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostgreSQL() {
		return postgreSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostgreSQL_Cluster() {
		return (EReference)postgreSQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuery_Clause() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForeignKey() {
		return foreignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForeignKey_Column() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForeignKey_Reference() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndex_p() {
		return index_pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable_p() {
		return table_pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_p_Column() {
		return (EReference)table_pEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_p_Row() {
		return (EReference)table_pEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_p_Foreignkey() {
		return (EReference)table_pEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_p_PrimaryKey() {
		return (EReference)table_pEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_p_Inherit() {
		return (EReference)table_pEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_p_Name() {
		return (EAttribute)table_pEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction_p() {
		return function_pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Scheme() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabase_Name() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheme() {
		return schemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheme_Table_postgresql() {
		return (EReference)schemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheme_View_postgresql() {
		return (EReference)schemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheme_Index() {
		return (EReference)schemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheme_Trigger() {
		return (EReference)schemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheme_Storedprocedure() {
		return (EReference)schemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheme_Name() {
		return (EAttribute)schemeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser_p() {
		return user_pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_p_Execute() {
		return (EReference)user_pEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_p_Privilege() {
		return (EReference)user_pEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_p_Username() {
		return (EAttribute)user_pEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_p_Password() {
		return (EAttribute)user_pEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_Database() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_User_p() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRow_Name() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRow_Policy() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_Datatype() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_Constraint() {
		return (EReference)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Name() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivilege() {
		return privilegeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumn_s() {
		return column_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_s_Name() {
		return (EAttribute)column_sEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser_d() {
		return user_dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_d_First_name() {
		return (EAttribute)user_dEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_d_Last_name() {
		return (EAttribute)user_dEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_d_Profile_description() {
		return (EAttribute)user_dEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_d_Username() {
		return (EAttribute)user_dEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_d_Password() {
		return (EAttribute)user_dEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_d_Email() {
		return (EAttribute)user_dEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_d_Functionalities() {
		return (EReference)user_dEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppAccess() {
		return appAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfileManagement() {
		return profileManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlbumManagement() {
		return albumManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhotoActions() {
		return photoActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhotoActions_Albummanagement() {
		return (EReference)photoActionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhoto() {
		return photoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhoto_Name() {
		return (EAttribute)photoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhoto_Photoactions() {
		return (EReference)photoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlbum() {
		return albumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlbum_Url() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlbum_Name() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlbum_Albummanagement() {
		return (EReference)albumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmazonWebServices() {
		return amazonWebServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmazonWebServices_Amazonsimplestorageservice() {
		return (EReference)amazonWebServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmazonWebServices_Amazonelasticcomputecloud() {
		return (EReference)amazonWebServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNTier() {
		return nTierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNTier_Connection() {
		return (EReference)nTierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNTier_Layer() {
		return (EReference)nTierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNTier_Relation() {
		return (EReference)nTierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_SourceLayer() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_TargetLayer() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_SourceLayer() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_TargetLayer() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getREST() {
		return restEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostgreSQLConnection() {
		return postgreSQLConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLConnection_Url() {
		return (EAttribute)postgreSQLConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLConnection_Port() {
		return (EAttribute)postgreSQLConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLConnection_Username() {
		return (EAttribute)postgreSQLConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLConnection_Password() {
		return (EAttribute)postgreSQLConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmazonS3API() {
		return amazonS3APIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonS3API_EndpointUrl() {
		return (EAttribute)amazonS3APIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonS3API_AccessKey() {
		return (EAttribute)amazonS3APIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonS3API_SecretKey() {
		return (EAttribute)amazonS3APIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonS3API_BucketName() {
		return (EAttribute)amazonS3APIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentation() {
		return presentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentation_PresentationLayer() {
		return (EReference)presentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessLogic() {
		return businessLogicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessLogic_BusinessLogicSegment() {
		return (EReference)businessLogicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_DataSegment() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllowedToUse() {
		return allowedToUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationSegment() {
		return presentationSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationSegment_Segmentstructure() {
		return (EReference)presentationSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessLogicSegment() {
		return businessLogicSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessLogicSegment_Segmentstructure() {
		return (EReference)businessLogicSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSegment() {
		return dataSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSegment_Segmentstructure() {
		return (EReference)dataSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView_a() {
		return view_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent_a() {
		return component_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction_a() {
		return action_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getController_a() {
		return controller_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_a() {
		return model_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository_a() {
		return repository_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurity_a() {
		return security_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostgreSQL_a() {
		return postgreSQL_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmazonS3Storage() {
		return amazonS3StorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModules() {
		return modulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModules_Name() {
		return (EAttribute)modulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModules_Reactconfiguration() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModules_Components() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModules_Actions() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModules_Libraries() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModules_Information() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponents() {
		return componentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_Reactclasses() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_Modules() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactFunctions() {
		return reactFunctionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReactFunctions_Name() {
		return (EAttribute)reactFunctionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRender() {
		return renderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifeCycle() {
		return lifeCycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmazonSimpleStorageService() {
		return amazonSimpleStorageServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmazonSimpleStorageService_Bucket() {
		return (EReference)amazonSimpleStorageServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmazonSimpleStorageService_Batchoperation() {
		return (EReference)amazonSimpleStorageServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBucket() {
		return bucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBucket_Name() {
		return (EAttribute)bucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBucket_Access() {
		return (EReference)bucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBucket_File_a() {
		return (EReference)bucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBucket_Folder_a() {
		return (EReference)bucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBatchOperation() {
		return batchOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublic() {
		return publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectsPublic() {
		return objectsPublicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBucketObjectsNotPublic() {
		return bucketObjectsNotPublicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnlyAuthorized() {
		return onlyAuthorizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile_a() {
		return file_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_a_Onwer() {
		return (EAttribute)file_aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_a_Size() {
		return (EAttribute)file_aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_a_ObjectURL() {
		return (EAttribute)file_aEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFile_a_Metadata() {
		return (EReference)file_aEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFolder_a() {
		return folder_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFolder_a_Name() {
		return (EAttribute)folder_aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolder_a_File_a() {
		return (EReference)folder_aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactConfiguration() {
		return reactConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactDOM() {
		return reactDOMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReactDOM_IsRoute() {
		return (EAttribute)reactDOMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReactDOM_IsConstant() {
		return (EAttribute)reactDOMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReactDOM_IsStruct() {
		return (EAttribute)reactDOMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencies() {
		return dependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogic() {
		return logicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactClasses() {
		return reactClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReactClasses_Reactfunctions() {
		return (EReference)reactClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReactClasses_Props() {
		return (EReference)reactClassesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReactClasses_State() {
		return (EReference)reactClassesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoreFunctions() {
		return coreFunctionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoreFunctions_Corefunctions() {
		return (EReference)coreFunctionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewComponents() {
		return viewComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubcomponents() {
		return subcomponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActions() {
		return actionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServices() {
		return servicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServices_Request() {
		return (EReference)servicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibraries() {
		return librariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibraries_Type() {
		return (EAttribute)librariesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProps() {
		return propsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProps_Type() {
		return (EAttribute)propsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProps_DataType() {
		return (EAttribute)propsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Active() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformation_FileType() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntities() {
		return entitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntities_Id() {
		return (EAttribute)entitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalities() {
		return functionalitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionalities_Id() {
		return (EAttribute)functionalitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionalities_Name() {
		return (EAttribute)functionalitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSegmentStructure() {
		return segmentStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSegmentStructure_Directories() {
		return (EReference)segmentStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSegmentStructure_Files() {
		return (EReference)segmentStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSegmentStructure_Name() {
		return (EAttribute)segmentStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectories() {
		return directoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectories_Files() {
		return (EReference)directoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiles() {
		return filesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiles_Type() {
		return (EAttribute)filesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiles_Extension() {
		return (EAttribute)filesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmazonElasticComputeCloud() {
		return amazonElasticComputeCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Source() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Target() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotosMetaModelFactory getPhotosMetaModelFactory() {
		return (PhotosMetaModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		softGalleryEClass = createEClass(SOFT_GALLERY);
		createEReference(softGalleryEClass, SOFT_GALLERY__DOMAIN);
		createEReference(softGalleryEClass, SOFT_GALLERY__ARCHITECTURE);
		createEReference(softGalleryEClass, SOFT_GALLERY__TECHNOLOGY);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__ENTITIES);

		architectureEClass = createEClass(ARCHITECTURE);
		createEReference(architectureEClass, ARCHITECTURE__NTIER);

		technologyEClass = createEClass(TECHNOLOGY);
		createEReference(technologyEClass, TECHNOLOGY__SPRING);
		createEReference(technologyEClass, TECHNOLOGY__POSTGRESQL);
		createEReference(technologyEClass, TECHNOLOGY__REACT);
		createEReference(technologyEClass, TECHNOLOGY__AMAZONWEBSERVICES);

		springEClass = createEClass(SPRING);
		createEReference(springEClass, SPRING__SPRINGBOOTAPPLICATION);

		reactEClass = createEClass(REACT);
		createEReference(reactEClass, REACT__MODULES);

		repositoryEClass = createEClass(REPOSITORY);

		restControllerEClass = createEClass(REST_CONTROLLER);
		createEReference(restControllerEClass, REST_CONTROLLER__REQUESTMAPPING);
		createEReference(restControllerEClass, REST_CONTROLLER__EXCEPTIONHANDLER);
		createEReference(restControllerEClass, REST_CONTROLLER__AUTOWIRED);
		createEReference(restControllerEClass, REST_CONTROLLER__SPECIFICATION);
		createEAttribute(restControllerEClass, REST_CONTROLLER__NAME);

		springBootApplicationEClass = createEClass(SPRING_BOOT_APPLICATION);
		createEReference(springBootApplicationEClass, SPRING_BOOT_APPLICATION__REPOSITORY);
		createEReference(springBootApplicationEClass, SPRING_BOOT_APPLICATION__RESTCONTROLLER);
		createEReference(springBootApplicationEClass, SPRING_BOOT_APPLICATION__ENTITY);
		createEReference(springBootApplicationEClass, SPRING_BOOT_APPLICATION__COMPONENT);
		createEReference(springBootApplicationEClass, SPRING_BOOT_APPLICATION__CONFIGURATION);

		requestMappingEClass = createEClass(REQUEST_MAPPING);
		createEReference(requestMappingEClass, REQUEST_MAPPING__REQUESTPART);

		postMappingEClass = createEClass(POST_MAPPING);

		getMappingEClass = createEClass(GET_MAPPING);

		putMappingEClass = createEClass(PUT_MAPPING);

		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION);

		deleteMappingEClass = createEClass(DELETE_MAPPING);

		requestPartEClass = createEClass(REQUEST_PART);

		autowiredEClass = createEClass(AUTOWIRED);

		exceptionEClass = createEClass(EXCEPTION);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__TABLE);
		createEReference(entityEClass, ENTITY__NAMEDNATIVEQUERY);

		table_sEClass = createEClass(TABLE_S);
		createEReference(table_sEClass, TABLE_S__COLUMN_S);
		createEAttribute(table_sEClass, TABLE_S__NAME);
		createEReference(table_sEClass, TABLE_S__ID);

		idEClass = createEClass(ID);
		createEReference(idEClass, ID__GENERATEDVALUE);

		column_pEClass = createEClass(COLUMN_P);
		createEReference(column_pEClass, COLUMN_P__CONSTRAINT);
		createEReference(column_pEClass, COLUMN_P__DATATYPE);
		createEAttribute(column_pEClass, COLUMN_P__NAME);

		generatedValueEClass = createEClass(GENERATED_VALUE);

		namedNativeQueryEClass = createEClass(NAMED_NATIVE_QUERY);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__SEARCHCRITERIA);

		searchCriteriaEClass = createEClass(SEARCH_CRITERIA);

		predicateEClass = createEClass(PREDICATE);
		createEReference(predicateEClass, PREDICATE__SPECIFICATION);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__BEAN);
		createEReference(configurationEClass, CONFIGURATION__ENABLEWEBSECURITY);
		createEReference(configurationEClass, CONFIGURATION__ENABLERESOURCESERVER);
		createEReference(configurationEClass, CONFIGURATION__ENABLEAUTHORIZATIONSERVER);
		createEReference(configurationEClass, CONFIGURATION__ENABLEGLOBALMETHODSECURITY);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__ORDER);

		order_sEClass = createEClass(ORDER_S);

		enableAuthorizationServerEClass = createEClass(ENABLE_AUTHORIZATION_SERVER);

		enableResourceServerEClass = createEClass(ENABLE_RESOURCE_SERVER);

		enableWebSecurityEClass = createEClass(ENABLE_WEB_SECURITY);

		enableGlobalMethodSecurityEClass = createEClass(ENABLE_GLOBAL_METHOD_SECURITY);

		beanEClass = createEClass(BEAN);

		postgreSQLEClass = createEClass(POSTGRE_SQL);
		createEReference(postgreSQLEClass, POSTGRE_SQL__CLUSTER);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__CLAUSE);

		foreignKeyEClass = createEClass(FOREIGN_KEY);
		createEReference(foreignKeyEClass, FOREIGN_KEY__COLUMN);
		createEReference(foreignKeyEClass, FOREIGN_KEY__REFERENCE);

		triggerEClass = createEClass(TRIGGER);

		viewEClass = createEClass(VIEW);

		index_pEClass = createEClass(INDEX_P);

		table_pEClass = createEClass(TABLE_P);
		createEReference(table_pEClass, TABLE_P__COLUMN);
		createEReference(table_pEClass, TABLE_P__ROW);
		createEReference(table_pEClass, TABLE_P__FOREIGNKEY);
		createEReference(table_pEClass, TABLE_P__PRIMARY_KEY);
		createEReference(table_pEClass, TABLE_P__INHERIT);
		createEAttribute(table_pEClass, TABLE_P__NAME);

		function_pEClass = createEClass(FUNCTION_P);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__SCHEME);
		createEAttribute(databaseEClass, DATABASE__NAME);

		schemeEClass = createEClass(SCHEME);
		createEReference(schemeEClass, SCHEME__TABLE_POSTGRESQL);
		createEReference(schemeEClass, SCHEME__VIEW_POSTGRESQL);
		createEReference(schemeEClass, SCHEME__INDEX);
		createEReference(schemeEClass, SCHEME__TRIGGER);
		createEReference(schemeEClass, SCHEME__STOREDPROCEDURE);
		createEAttribute(schemeEClass, SCHEME__NAME);

		user_pEClass = createEClass(USER_P);
		createEReference(user_pEClass, USER_P__EXECUTE);
		createEReference(user_pEClass, USER_P__PRIVILEGE);
		createEAttribute(user_pEClass, USER_P__USERNAME);
		createEAttribute(user_pEClass, USER_P__PASSWORD);

		clusterEClass = createEClass(CLUSTER);
		createEReference(clusterEClass, CLUSTER__DATABASE);
		createEReference(clusterEClass, CLUSTER__USER_P);

		rowEClass = createEClass(ROW);
		createEAttribute(rowEClass, ROW__NAME);
		createEReference(rowEClass, ROW__POLICY);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__DATATYPE);
		createEReference(columnEClass, COLUMN__CONSTRAINT);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__NAME);

		constraintEClass = createEClass(CONSTRAINT);

		privilegeEClass = createEClass(PRIVILEGE);

		policyEClass = createEClass(POLICY);

		clauseEClass = createEClass(CLAUSE);

		indexEClass = createEClass(INDEX);

		column_sEClass = createEClass(COLUMN_S);
		createEAttribute(column_sEClass, COLUMN_S__NAME);

		user_dEClass = createEClass(USER_D);
		createEAttribute(user_dEClass, USER_D__FIRST_NAME);
		createEAttribute(user_dEClass, USER_D__LAST_NAME);
		createEAttribute(user_dEClass, USER_D__PROFILE_DESCRIPTION);
		createEAttribute(user_dEClass, USER_D__USERNAME);
		createEAttribute(user_dEClass, USER_D__PASSWORD);
		createEAttribute(user_dEClass, USER_D__EMAIL);
		createEReference(user_dEClass, USER_D__FUNCTIONALITIES);

		appAccessEClass = createEClass(APP_ACCESS);

		profileManagementEClass = createEClass(PROFILE_MANAGEMENT);

		albumManagementEClass = createEClass(ALBUM_MANAGEMENT);

		photoActionsEClass = createEClass(PHOTO_ACTIONS);
		createEReference(photoActionsEClass, PHOTO_ACTIONS__ALBUMMANAGEMENT);

		photoEClass = createEClass(PHOTO);
		createEAttribute(photoEClass, PHOTO__NAME);
		createEReference(photoEClass, PHOTO__PHOTOACTIONS);

		albumEClass = createEClass(ALBUM);
		createEAttribute(albumEClass, ALBUM__URL);
		createEAttribute(albumEClass, ALBUM__NAME);
		createEReference(albumEClass, ALBUM__ALBUMMANAGEMENT);

		amazonWebServicesEClass = createEClass(AMAZON_WEB_SERVICES);
		createEReference(amazonWebServicesEClass, AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE);
		createEReference(amazonWebServicesEClass, AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD);

		nTierEClass = createEClass(NTIER);
		createEReference(nTierEClass, NTIER__CONNECTION);
		createEReference(nTierEClass, NTIER__LAYER);
		createEReference(nTierEClass, NTIER__RELATION);

		layerEClass = createEClass(LAYER);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__SOURCE_LAYER);
		createEReference(connectionEClass, CONNECTION__TARGET_LAYER);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__SOURCE_LAYER);
		createEReference(relationEClass, RELATION__TARGET_LAYER);

		restEClass = createEClass(REST);

		postgreSQLConnectionEClass = createEClass(POSTGRE_SQL_CONNECTION);
		createEAttribute(postgreSQLConnectionEClass, POSTGRE_SQL_CONNECTION__URL);
		createEAttribute(postgreSQLConnectionEClass, POSTGRE_SQL_CONNECTION__PORT);
		createEAttribute(postgreSQLConnectionEClass, POSTGRE_SQL_CONNECTION__USERNAME);
		createEAttribute(postgreSQLConnectionEClass, POSTGRE_SQL_CONNECTION__PASSWORD);

		amazonS3APIEClass = createEClass(AMAZON_S3API);
		createEAttribute(amazonS3APIEClass, AMAZON_S3API__ENDPOINT_URL);
		createEAttribute(amazonS3APIEClass, AMAZON_S3API__ACCESS_KEY);
		createEAttribute(amazonS3APIEClass, AMAZON_S3API__SECRET_KEY);
		createEAttribute(amazonS3APIEClass, AMAZON_S3API__BUCKET_NAME);

		presentationEClass = createEClass(PRESENTATION);
		createEReference(presentationEClass, PRESENTATION__PRESENTATION_LAYER);

		businessLogicEClass = createEClass(BUSINESS_LOGIC);
		createEReference(businessLogicEClass, BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__DATA_SEGMENT);

		allowedToUseEClass = createEClass(ALLOWED_TO_USE);

		presentationSegmentEClass = createEClass(PRESENTATION_SEGMENT);
		createEReference(presentationSegmentEClass, PRESENTATION_SEGMENT__SEGMENTSTRUCTURE);

		businessLogicSegmentEClass = createEClass(BUSINESS_LOGIC_SEGMENT);
		createEReference(businessLogicSegmentEClass, BUSINESS_LOGIC_SEGMENT__SEGMENTSTRUCTURE);

		dataSegmentEClass = createEClass(DATA_SEGMENT);
		createEReference(dataSegmentEClass, DATA_SEGMENT__SEGMENTSTRUCTURE);

		view_aEClass = createEClass(VIEW_A);

		component_aEClass = createEClass(COMPONENT_A);

		action_aEClass = createEClass(ACTION_A);

		controller_aEClass = createEClass(CONTROLLER_A);

		model_aEClass = createEClass(MODEL_A);

		repository_aEClass = createEClass(REPOSITORY_A);

		security_aEClass = createEClass(SECURITY_A);

		postgreSQL_aEClass = createEClass(POSTGRE_SQL_A);

		amazonS3StorageEClass = createEClass(AMAZON_S3_STORAGE);

		modulesEClass = createEClass(MODULES);
		createEAttribute(modulesEClass, MODULES__NAME);
		createEReference(modulesEClass, MODULES__REACTCONFIGURATION);
		createEReference(modulesEClass, MODULES__COMPONENTS);
		createEReference(modulesEClass, MODULES__ACTIONS);
		createEReference(modulesEClass, MODULES__LIBRARIES);
		createEReference(modulesEClass, MODULES__INFORMATION);

		componentsEClass = createEClass(COMPONENTS);
		createEReference(componentsEClass, COMPONENTS__REACTCLASSES);
		createEReference(componentsEClass, COMPONENTS__MODULES);

		reactFunctionsEClass = createEClass(REACT_FUNCTIONS);
		createEAttribute(reactFunctionsEClass, REACT_FUNCTIONS__NAME);

		renderEClass = createEClass(RENDER);

		constructorEClass = createEClass(CONSTRUCTOR);

		lifeCycleEClass = createEClass(LIFE_CYCLE);

		amazonSimpleStorageServiceEClass = createEClass(AMAZON_SIMPLE_STORAGE_SERVICE);
		createEReference(amazonSimpleStorageServiceEClass, AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET);
		createEReference(amazonSimpleStorageServiceEClass, AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION);

		bucketEClass = createEClass(BUCKET);
		createEAttribute(bucketEClass, BUCKET__NAME);
		createEReference(bucketEClass, BUCKET__ACCESS);
		createEReference(bucketEClass, BUCKET__FILE_A);
		createEReference(bucketEClass, BUCKET__FOLDER_A);

		batchOperationEClass = createEClass(BATCH_OPERATION);

		accessEClass = createEClass(ACCESS);

		publicEClass = createEClass(PUBLIC);

		objectsPublicEClass = createEClass(OBJECTS_PUBLIC);

		bucketObjectsNotPublicEClass = createEClass(BUCKET_OBJECTS_NOT_PUBLIC);

		onlyAuthorizedEClass = createEClass(ONLY_AUTHORIZED);

		file_aEClass = createEClass(FILE_A);
		createEAttribute(file_aEClass, FILE_A__ONWER);
		createEAttribute(file_aEClass, FILE_A__SIZE);
		createEAttribute(file_aEClass, FILE_A__OBJECT_URL);
		createEReference(file_aEClass, FILE_A__METADATA);

		folder_aEClass = createEClass(FOLDER_A);
		createEAttribute(folder_aEClass, FOLDER_A__NAME);
		createEReference(folder_aEClass, FOLDER_A__FILE_A);

		metaDataEClass = createEClass(META_DATA);

		reactConfigurationEClass = createEClass(REACT_CONFIGURATION);

		reactDOMEClass = createEClass(REACT_DOM);
		createEAttribute(reactDOMEClass, REACT_DOM__IS_ROUTE);
		createEAttribute(reactDOMEClass, REACT_DOM__IS_CONSTANT);
		createEAttribute(reactDOMEClass, REACT_DOM__IS_STRUCT);

		dependenciesEClass = createEClass(DEPENDENCIES);

		logicEClass = createEClass(LOGIC);

		uiEClass = createEClass(UI);

		reactClassesEClass = createEClass(REACT_CLASSES);
		createEReference(reactClassesEClass, REACT_CLASSES__REACTFUNCTIONS);
		createEReference(reactClassesEClass, REACT_CLASSES__PROPS);
		createEReference(reactClassesEClass, REACT_CLASSES__STATE);

		coreFunctionsEClass = createEClass(CORE_FUNCTIONS);
		createEReference(coreFunctionsEClass, CORE_FUNCTIONS__COREFUNCTIONS);

		routerEClass = createEClass(ROUTER);

		structureEClass = createEClass(STRUCTURE);

		viewComponentsEClass = createEClass(VIEW_COMPONENTS);

		subcomponentsEClass = createEClass(SUBCOMPONENTS);

		actionsEClass = createEClass(ACTIONS);

		requestEClass = createEClass(REQUEST);

		servicesEClass = createEClass(SERVICES);
		createEReference(servicesEClass, SERVICES__REQUEST);

		librariesEClass = createEClass(LIBRARIES);
		createEAttribute(librariesEClass, LIBRARIES__TYPE);

		propsEClass = createEClass(PROPS);
		createEAttribute(propsEClass, PROPS__TYPE);
		createEAttribute(propsEClass, PROPS__DATA_TYPE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__ACTIVE);

		informationEClass = createEClass(INFORMATION);
		createEAttribute(informationEClass, INFORMATION__FILE_TYPE);

		entitiesEClass = createEClass(ENTITIES);
		createEAttribute(entitiesEClass, ENTITIES__ID);

		functionalitiesEClass = createEClass(FUNCTIONALITIES);
		createEAttribute(functionalitiesEClass, FUNCTIONALITIES__ID);
		createEAttribute(functionalitiesEClass, FUNCTIONALITIES__NAME);

		segmentStructureEClass = createEClass(SEGMENT_STRUCTURE);
		createEReference(segmentStructureEClass, SEGMENT_STRUCTURE__DIRECTORIES);
		createEReference(segmentStructureEClass, SEGMENT_STRUCTURE__FILES);
		createEAttribute(segmentStructureEClass, SEGMENT_STRUCTURE__NAME);

		directoriesEClass = createEClass(DIRECTORIES);
		createEReference(directoriesEClass, DIRECTORIES__FILES);

		filesEClass = createEClass(FILES);
		createEAttribute(filesEClass, FILES__TYPE);
		createEAttribute(filesEClass, FILES__EXTENSION);

		amazonElasticComputeCloudEClass = createEClass(AMAZON_ELASTIC_COMPUTE_CLOUD);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__SOURCE);
		createEReference(associationEClass, ASSOCIATION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		postMappingEClass.getESuperTypes().add(this.getRequestMapping());
		getMappingEClass.getESuperTypes().add(this.getRequestMapping());
		putMappingEClass.getESuperTypes().add(this.getRequestMapping());
		deleteMappingEClass.getESuperTypes().add(this.getRequestMapping());
		user_dEClass.getESuperTypes().add(this.getEntities());
		appAccessEClass.getESuperTypes().add(this.getFunctionalities());
		profileManagementEClass.getESuperTypes().add(this.getFunctionalities());
		albumManagementEClass.getESuperTypes().add(this.getFunctionalities());
		photoActionsEClass.getESuperTypes().add(this.getFunctionalities());
		photoEClass.getESuperTypes().add(this.getEntities());
		albumEClass.getESuperTypes().add(this.getEntities());
		restEClass.getESuperTypes().add(this.getConnection());
		postgreSQLConnectionEClass.getESuperTypes().add(this.getConnection());
		amazonS3APIEClass.getESuperTypes().add(this.getConnection());
		presentationEClass.getESuperTypes().add(this.getLayer());
		businessLogicEClass.getESuperTypes().add(this.getLayer());
		dataEClass.getESuperTypes().add(this.getLayer());
		allowedToUseEClass.getESuperTypes().add(this.getRelation());
		view_aEClass.getESuperTypes().add(this.getPresentationSegment());
		component_aEClass.getESuperTypes().add(this.getPresentationSegment());
		action_aEClass.getESuperTypes().add(this.getPresentationSegment());
		controller_aEClass.getESuperTypes().add(this.getBusinessLogicSegment());
		model_aEClass.getESuperTypes().add(this.getBusinessLogicSegment());
		repository_aEClass.getESuperTypes().add(this.getBusinessLogicSegment());
		security_aEClass.getESuperTypes().add(this.getBusinessLogicSegment());
		postgreSQL_aEClass.getESuperTypes().add(this.getDataSegment());
		amazonS3StorageEClass.getESuperTypes().add(this.getDataSegment());
		renderEClass.getESuperTypes().add(this.getReactFunctions());
		constructorEClass.getESuperTypes().add(this.getReactFunctions());
		lifeCycleEClass.getESuperTypes().add(this.getReactFunctions());
		publicEClass.getESuperTypes().add(this.getAccess());
		objectsPublicEClass.getESuperTypes().add(this.getAccess());
		bucketObjectsNotPublicEClass.getESuperTypes().add(this.getAccess());
		onlyAuthorizedEClass.getESuperTypes().add(this.getAccess());
		reactDOMEClass.getESuperTypes().add(this.getReactConfiguration());
		dependenciesEClass.getESuperTypes().add(this.getReactConfiguration());
		logicEClass.getESuperTypes().add(this.getComponents());
		uiEClass.getESuperTypes().add(this.getComponents());
		coreFunctionsEClass.getESuperTypes().add(this.getReactFunctions());
		routerEClass.getESuperTypes().add(this.getLogic());
		structureEClass.getESuperTypes().add(this.getLogic());
		viewComponentsEClass.getESuperTypes().add(this.getUI());
		subcomponentsEClass.getESuperTypes().add(this.getUI());
		requestEClass.getESuperTypes().add(this.getActions());
		servicesEClass.getESuperTypes().add(this.getActions());

		// Initialize classes, features, and operations; add parameters
		initEClass(softGalleryEClass, SoftGallery.class, "SoftGallery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftGallery_Domain(), this.getDomain(), null, "domain", null, 0, 1, SoftGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGallery_Architecture(), this.getArchitecture(), null, "architecture", null, 0, 1, SoftGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGallery_Technology(), this.getTechnology(), null, "technology", null, 0, 1, SoftGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Entities(), this.getEntities(), null, "entities", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitecture_Ntier(), this.getNTier(), null, "ntier", null, 0, -1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyEClass, Technology.class, "Technology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnology_Spring(), this.getSpring(), null, "spring", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_Postgresql(), this.getPostgreSQL(), null, "postgresql", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_React(), this.getReact(), null, "react", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_Amazonwebservices(), this.getAmazonWebServices(), null, "amazonwebservices", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(springEClass, Spring.class, "Spring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpring_Springbootapplication(), this.getSpringBootApplication(), null, "springbootapplication", null, 0, -1, Spring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactEClass, React.class, "React", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReact_Modules(), this.getModules(), null, "modules", null, 0, -1, React.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restControllerEClass, RestController.class, "RestController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestController_Requestmapping(), this.getRequestMapping(), null, "requestmapping", null, 0, -1, RestController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestController_Exceptionhandler(), this.getExceptionHandler(), null, "exceptionhandler", null, 0, -1, RestController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestController_Autowired(), this.getAutowired(), null, "autowired", null, 0, -1, RestController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestController_Specification(), this.getSpecification(), null, "specification", null, 0, -1, RestController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestController_Name(), ecorePackage.getEString(), "name", null, 0, 1, RestController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(springBootApplicationEClass, SpringBootApplication.class, "SpringBootApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpringBootApplication_Repository(), this.getRepository(), null, "repository", null, 0, -1, SpringBootApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpringBootApplication_Restcontroller(), this.getRestController(), null, "restcontroller", null, 0, -1, SpringBootApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpringBootApplication_Entity(), this.getEntity(), null, "entity", null, 0, -1, SpringBootApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpringBootApplication_Component(), this.getComponent(), null, "component", null, 0, -1, SpringBootApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpringBootApplication_Configuration(), this.getConfiguration(), null, "configuration", null, 0, -1, SpringBootApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestMappingEClass, RequestMapping.class, "RequestMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestMapping_Requestpart(), this.getRequestPart(), null, "requestpart", null, 0, -1, RequestMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postMappingEClass, PostMapping.class, "PostMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getMappingEClass, GetMapping.class, "GetMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(putMappingEClass, PutMapping.class, "PutMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionHandler_Exception(), this.getException(), null, "exception", null, 0, -1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteMappingEClass, DeleteMapping.class, "DeleteMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestPartEClass, RequestPart.class, "RequestPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autowiredEClass, Autowired.class, "Autowired", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionEClass, PhotosMetaModel.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Table(), this.getTable_s(), null, "table", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Namednativequery(), this.getNamedNativeQuery(), null, "namednativequery", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(table_sEClass, Table_s.class, "Table_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_s_Column_s(), this.getColumn_s(), null, "column_s", null, 0, -1, Table_s.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_s_Name(), ecorePackage.getEString(), "name", null, 0, 1, Table_s.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_s_Id(), this.getId(), null, "id", null, 0, 1, Table_s.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idEClass, Id.class, "Id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getId_Generatedvalue(), this.getGeneratedValue(), null, "generatedvalue", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(column_pEClass, Column_p.class, "Column_p", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_p_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, Column_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_p_Datatype(), this.getDataType(), null, "datatype", null, 0, 1, Column_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_p_Name(), ecorePackage.getEString(), "name", null, 0, 1, Column_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatedValueEClass, GeneratedValue.class, "GeneratedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedNativeQueryEClass, NamedNativeQuery.class, "NamedNativeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Searchcriteria(), this.getSearchCriteria(), null, "searchcriteria", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchCriteriaEClass, SearchCriteria.class, "SearchCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicate_Specification(), this.getSpecification(), null, "specification", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Bean(), this.getBean(), null, "bean", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Enablewebsecurity(), this.getEnableWebSecurity(), null, "enablewebsecurity", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Enableresourceserver(), this.getEnableResourceServer(), null, "enableresourceserver", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Enableauthorizationserver(), this.getEnableAuthorizationServer(), null, "enableauthorizationserver", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Enableglobalmethodsecurity(), this.getEnableGlobalMethodSecurity(), null, "enableglobalmethodsecurity", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Order(), this.getOrder_s(), null, "order", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(order_sEClass, Order_s.class, "Order_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enableAuthorizationServerEClass, EnableAuthorizationServer.class, "EnableAuthorizationServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enableResourceServerEClass, EnableResourceServer.class, "EnableResourceServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enableWebSecurityEClass, EnableWebSecurity.class, "EnableWebSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enableGlobalMethodSecurityEClass, EnableGlobalMethodSecurity.class, "EnableGlobalMethodSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beanEClass, Bean.class, "Bean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postgreSQLEClass, PostgreSQL.class, "PostgreSQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostgreSQL_Cluster(), this.getCluster(), null, "cluster", null, 0, 1, PostgreSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Clause(), this.getClause(), null, "clause", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeignKey_Column(), this.getColumn_p(), null, "column", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_Reference(), this.getTable_p(), null, "reference", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(index_pEClass, Index_p.class, "Index_p", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(table_pEClass, Table_p.class, "Table_p", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_p_Column(), this.getColumn_p(), null, "column", null, 0, -1, Table_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_p_Row(), this.getRow(), null, "row", null, 0, -1, Table_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_p_Foreignkey(), this.getForeignKey(), null, "foreignkey", null, 0, -1, Table_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_p_PrimaryKey(), this.getColumn_p(), null, "primaryKey", null, 0, -1, Table_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_p_Inherit(), this.getTable_p(), null, "inherit", null, 0, 1, Table_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_p_Name(), ecorePackage.getEString(), "name", null, 0, 1, Table_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(function_pEClass, Function_p.class, "Function_p", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Scheme(), this.getScheme(), null, "scheme", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemeEClass, Scheme.class, "Scheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheme_Table_postgresql(), this.getTable_p(), null, "table_postgresql", null, 0, -1, Scheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheme_View_postgresql(), this.getView(), null, "view_postgresql", null, 0, -1, Scheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheme_Index(), this.getIndex_p(), null, "index", null, 0, -1, Scheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheme_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, Scheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheme_Storedprocedure(), this.getFunction_p(), null, "storedprocedure", null, 0, -1, Scheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(user_pEClass, User_p.class, "User_p", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_p_Execute(), this.getQuery(), null, "execute", null, 0, -1, User_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_p_Privilege(), this.getPrivilege(), null, "privilege", null, 0, -1, User_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_p_Username(), ecorePackage.getEString(), "username", null, 0, 1, User_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_p_Password(), ecorePackage.getEString(), "password", null, 0, 1, User_p.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Database(), this.getDatabase(), null, "database", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_User_p(), this.getUser_p(), null, "user_p", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRow_Policy(), this.getPolicy(), null, "policy", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Datatype(), this.getDataType(), null, "datatype", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(privilegeEClass, Privilege.class, "Privilege", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(column_sEClass, Column_s.class, "Column_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_s_Name(), ecorePackage.getEString(), "name", null, 0, 1, Column_s.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(user_dEClass, User_d.class, "User_d", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_d_First_name(), ecorePackage.getEString(), "first_name", null, 0, 1, User_d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_d_Last_name(), ecorePackage.getEString(), "last_name", null, 0, 1, User_d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_d_Profile_description(), ecorePackage.getEString(), "profile_description", null, 0, 1, User_d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_d_Username(), ecorePackage.getEString(), "username", null, 0, 1, User_d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_d_Password(), ecorePackage.getEString(), "password", null, 0, 1, User_d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_d_Email(), ecorePackage.getEString(), "email", null, 0, 1, User_d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_d_Functionalities(), this.getFunctionalities(), null, "functionalities", null, 0, -1, User_d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appAccessEClass, AppAccess.class, "AppAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(profileManagementEClass, ProfileManagement.class, "ProfileManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(albumManagementEClass, AlbumManagement.class, "AlbumManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(photoActionsEClass, PhotoActions.class, "PhotoActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhotoActions_Albummanagement(), this.getAlbumManagement(), null, "albummanagement", null, 0, 1, PhotoActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoEClass, Photo.class, "Photo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhoto_Name(), ecorePackage.getEString(), "name", null, 0, 1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhoto_Photoactions(), this.getPhotoActions(), null, "photoactions", null, 0, 1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(albumEClass, Album.class, "Album", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlbum_Url(), ecorePackage.getEString(), "url", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Name(), ecorePackage.getEString(), "name", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlbum_Albummanagement(), this.getAlbumManagement(), null, "albummanagement", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amazonWebServicesEClass, AmazonWebServices.class, "AmazonWebServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAmazonWebServices_Amazonsimplestorageservice(), this.getAmazonSimpleStorageService(), null, "amazonsimplestorageservice", null, 0, 1, AmazonWebServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmazonWebServices_Amazonelasticcomputecloud(), this.getAmazonElasticComputeCloud(), null, "amazonelasticcomputecloud", null, 0, 1, AmazonWebServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nTierEClass, NTier.class, "NTier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNTier_Connection(), this.getConnection(), null, "connection", null, 0, -1, NTier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNTier_Layer(), this.getLayer(), null, "layer", null, 0, -1, NTier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNTier_Relation(), this.getRelation(), null, "relation", null, 0, -1, NTier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_SourceLayer(), this.getLayer(), null, "sourceLayer", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_TargetLayer(), this.getLayer(), null, "targetLayer", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_SourceLayer(), this.getLayer(), null, "sourceLayer", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_TargetLayer(), this.getLayer(), null, "targetLayer", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restEClass, PhotosMetaModel.REST.class, "REST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postgreSQLConnectionEClass, PostgreSQLConnection.class, "PostgreSQLConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostgreSQLConnection_Url(), ecorePackage.getEString(), "url", null, 0, 1, PostgreSQLConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLConnection_Port(), ecorePackage.getEInt(), "port", null, 0, 1, PostgreSQLConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLConnection_Username(), ecorePackage.getEString(), "username", null, 0, 1, PostgreSQLConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLConnection_Password(), ecorePackage.getEString(), "password", null, 0, 1, PostgreSQLConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amazonS3APIEClass, AmazonS3API.class, "AmazonS3API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmazonS3API_EndpointUrl(), ecorePackage.getEString(), "endpointUrl", null, 0, 1, AmazonS3API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonS3API_AccessKey(), ecorePackage.getEString(), "accessKey", null, 0, 1, AmazonS3API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonS3API_SecretKey(), ecorePackage.getEString(), "secretKey", null, 0, 1, AmazonS3API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonS3API_BucketName(), ecorePackage.getEString(), "bucketName", null, 0, 1, AmazonS3API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationEClass, Presentation.class, "Presentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentation_PresentationLayer(), this.getPresentationSegment(), null, "presentationLayer", null, 0, -1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessLogicEClass, BusinessLogic.class, "BusinessLogic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessLogic_BusinessLogicSegment(), this.getBusinessLogicSegment(), null, "BusinessLogicSegment", null, 0, -1, BusinessLogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_DataSegment(), this.getDataSegment(), null, "dataSegment", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allowedToUseEClass, AllowedToUse.class, "AllowedToUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(presentationSegmentEClass, PresentationSegment.class, "PresentationSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationSegment_Segmentstructure(), this.getSegmentStructure(), null, "segmentstructure", null, 0, 1, PresentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessLogicSegmentEClass, BusinessLogicSegment.class, "BusinessLogicSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessLogicSegment_Segmentstructure(), this.getSegmentStructure(), null, "segmentstructure", null, 0, 1, BusinessLogicSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSegmentEClass, DataSegment.class, "DataSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSegment_Segmentstructure(), this.getSegmentStructure(), null, "segmentstructure", null, 0, 1, DataSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(view_aEClass, View_a.class, "View_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(component_aEClass, Component_a.class, "Component_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(action_aEClass, Action_a.class, "Action_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controller_aEClass, Controller_a.class, "Controller_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(model_aEClass, Model_a.class, "Model_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repository_aEClass, Repository_a.class, "Repository_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(security_aEClass, Security_a.class, "Security_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postgreSQL_aEClass, PostgreSQL_a.class, "PostgreSQL_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amazonS3StorageEClass, AmazonS3Storage.class, "AmazonS3Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modulesEClass, Modules.class, "Modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModules_Name(), ecorePackage.getEString(), "name", null, 0, 1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Reactconfiguration(), this.getReactConfiguration(), null, "reactconfiguration", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Components(), this.getComponents(), null, "components", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Actions(), this.getActions(), null, "actions", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Libraries(), this.getLibraries(), null, "libraries", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Information(), this.getInformation(), null, "information", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentsEClass, Components.class, "Components", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponents_Reactclasses(), this.getReactClasses(), null, "reactclasses", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Modules(), this.getModules(), null, "modules", null, 0, 1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactFunctionsEClass, ReactFunctions.class, "ReactFunctions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReactFunctions_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReactFunctions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renderEClass, Render.class, "Render", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifeCycleEClass, LifeCycle.class, "LifeCycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amazonSimpleStorageServiceEClass, AmazonSimpleStorageService.class, "AmazonSimpleStorageService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAmazonSimpleStorageService_Bucket(), this.getBucket(), null, "bucket", null, 0, -1, AmazonSimpleStorageService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmazonSimpleStorageService_Batchoperation(), this.getBatchOperation(), null, "batchoperation", null, 0, -1, AmazonSimpleStorageService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bucketEClass, Bucket.class, "Bucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBucket_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBucket_Access(), this.getAccess(), null, "access", null, 0, 1, Bucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBucket_File_a(), this.getFile_a(), null, "file_a", null, 0, -1, Bucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBucket_Folder_a(), this.getFolder_a(), null, "folder_a", null, 0, -1, Bucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batchOperationEClass, BatchOperation.class, "BatchOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessEClass, Access.class, "Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicEClass, Public.class, "Public", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectsPublicEClass, ObjectsPublic.class, "ObjectsPublic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bucketObjectsNotPublicEClass, BucketObjectsNotPublic.class, "BucketObjectsNotPublic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onlyAuthorizedEClass, OnlyAuthorized.class, "OnlyAuthorized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(file_aEClass, File_a.class, "File_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_a_Onwer(), ecorePackage.getEString(), "Onwer", null, 0, 1, File_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_a_Size(), ecorePackage.getEString(), "size", null, 0, 1, File_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_a_ObjectURL(), ecorePackage.getEString(), "ObjectURL", null, 0, 1, File_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_a_Metadata(), this.getMetaData(), null, "metadata", null, 0, -1, File_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folder_aEClass, Folder_a.class, "Folder_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFolder_a_Name(), ecorePackage.getEString(), "name", null, 0, 1, Folder_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolder_a_File_a(), this.getFile_a(), null, "file_a", null, 0, -1, Folder_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactConfigurationEClass, ReactConfiguration.class, "ReactConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactDOMEClass, ReactDOM.class, "ReactDOM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReactDOM_IsRoute(), ecorePackage.getEBooleanObject(), "isRoute", null, 0, 1, ReactDOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactDOM_IsConstant(), ecorePackage.getEBooleanObject(), "isConstant", null, 0, 1, ReactDOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactDOM_IsStruct(), ecorePackage.getEString(), "isStruct", null, 0, 1, ReactDOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependenciesEClass, Dependencies.class, "Dependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicEClass, Logic.class, "Logic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiEClass, PhotosMetaModel.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactClassesEClass, ReactClasses.class, "ReactClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactClasses_Reactfunctions(), this.getReactFunctions(), null, "reactfunctions", null, 0, -1, ReactClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactClasses_Props(), this.getProps(), null, "props", null, 0, -1, ReactClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactClasses_State(), this.getState(), null, "state", null, 0, -1, ReactClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreFunctionsEClass, CoreFunctions.class, "CoreFunctions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoreFunctions_Corefunctions(), this.getCoreFunctions(), null, "corefunctions", null, 0, 1, CoreFunctions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewComponentsEClass, ViewComponents.class, "ViewComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subcomponentsEClass, Subcomponents.class, "Subcomponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionsEClass, Actions.class, "Actions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicesEClass, Services.class, "Services", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServices_Request(), this.getRequest(), null, "request", null, 0, 1, Services.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(librariesEClass, Libraries.class, "Libraries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibraries_Type(), ecorePackage.getEString(), "type", null, 0, 1, Libraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propsEClass, Props.class, "Props", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProps_Type(), ecorePackage.getEString(), "type", null, 0, 1, Props.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProps_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Props.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Active(), ecorePackage.getEBooleanObject(), "active", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformation_FileType(), ecorePackage.getEString(), "fileType", null, 0, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entitiesEClass, Entities.class, "Entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntities_Id(), ecorePackage.getEString(), "id", null, 0, 1, Entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalitiesEClass, Functionalities.class, "Functionalities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalities_Id(), ecorePackage.getEString(), "id", null, 0, 1, Functionalities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalities_Name(), ecorePackage.getEString(), "name", null, 0, 1, Functionalities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentStructureEClass, SegmentStructure.class, "SegmentStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegmentStructure_Directories(), this.getDirectories(), null, "directories", null, 0, -1, SegmentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegmentStructure_Files(), this.getFiles(), null, "files", null, 0, -1, SegmentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegmentStructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, SegmentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directoriesEClass, Directories.class, "Directories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectories_Files(), this.getFiles(), null, "files", null, 0, 1, Directories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filesEClass, Files.class, "Files", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiles_Type(), ecorePackage.getEString(), "type", null, 0, 1, Files.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiles_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Files.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amazonElasticComputeCloudEClass, AmazonElasticComputeCloud.class, "AmazonElasticComputeCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Source(), this.getFunctionalities(), null, "source", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Target(), this.getFunctionalities(), null, "target", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (reactConfigurationEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
	}

} //PhotosMetaModelPackageImpl
