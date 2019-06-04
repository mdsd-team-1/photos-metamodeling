/**
 */
package PhotosMetaModel;

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
 * @see PhotosMetaModel.PhotosMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface PhotosMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PhotosMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co/edu/unal/mdd/photos/PhotosMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.unal.mdd.photos.PhotosMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhotosMetaModelPackage eINSTANCE = PhotosMetaModel.impl.PhotosMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SoftGalleryImpl <em>Soft Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SoftGalleryImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSoftGallery()
	 * @generated
	 */
	int SOFT_GALLERY = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__TECHNOLOGY = 2;

	/**
	 * The number of structural features of the '<em>Soft Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Soft Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DomainImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ArchitectureImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 2;

	/**
	 * The feature id for the '<em><b>Ntier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NTIER = 0;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.TechnologyImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Spring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__SPRING = 0;

	/**
	 * The feature id for the '<em><b>Postgresql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__POSTGRESQL = 1;

	/**
	 * The feature id for the '<em><b>React</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__REACT = 2;

	/**
	 * The feature id for the '<em><b>Amazonwebservices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__AMAZONWEBSERVICES = 3;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SpringImpl <em>Spring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SpringImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSpring()
	 * @generated
	 */
	int SPRING = 4;

	/**
	 * The feature id for the '<em><b>Springbootapplication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING__SPRINGBOOTAPPLICATION = 0;

	/**
	 * The number of structural features of the '<em>Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ReactImpl <em>React</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ReactImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReact()
	 * @generated
	 */
	int REACT = 5;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__MODULES = 0;

	/**
	 * The number of structural features of the '<em>React</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>React</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RepositoryImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RestControllerImpl <em>Rest Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RestControllerImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRestController()
	 * @generated
	 */
	int REST_CONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Requestmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__REQUESTMAPPING = 0;

	/**
	 * The feature id for the '<em><b>Exceptionhandler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__EXCEPTIONHANDLER = 1;

	/**
	 * The feature id for the '<em><b>Autowired</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__AUTOWIRED = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__NAME = 4;

	/**
	 * The number of structural features of the '<em>Rest Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rest Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SpringBootApplicationImpl <em>Spring Boot Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SpringBootApplicationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSpringBootApplication()
	 * @generated
	 */
	int SPRING_BOOT_APPLICATION = 8;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Restcontroller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION__RESTCONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION__ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION__COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION__CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION__NAME = 5;

	/**
	 * The number of structural features of the '<em>Spring Boot Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Spring Boot Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RequestMappingImpl <em>Request Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RequestMappingImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRequestMapping()
	 * @generated
	 */
	int REQUEST_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Requestpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING__REQUESTPART = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING__PRODUCES = 3;

	/**
	 * The feature id for the '<em><b>Path Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING__PATH_VARIABLE = 4;

	/**
	 * The number of structural features of the '<em>Request Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Request Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PostMappingImpl <em>Post Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PostMappingImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostMapping()
	 * @generated
	 */
	int POST_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Requestpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__REQUESTPART = REQUEST_MAPPING__REQUESTPART;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__VALUE = REQUEST_MAPPING__VALUE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__METHOD = REQUEST_MAPPING__METHOD;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__PRODUCES = REQUEST_MAPPING__PRODUCES;

	/**
	 * The feature id for the '<em><b>Path Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__PATH_VARIABLE = REQUEST_MAPPING__PATH_VARIABLE;

	/**
	 * The number of structural features of the '<em>Post Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING_FEATURE_COUNT = REQUEST_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Post Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING_OPERATION_COUNT = REQUEST_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.GetMappingImpl <em>Get Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.GetMappingImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getGetMapping()
	 * @generated
	 */
	int GET_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Requestpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__REQUESTPART = REQUEST_MAPPING__REQUESTPART;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__VALUE = REQUEST_MAPPING__VALUE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__METHOD = REQUEST_MAPPING__METHOD;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__PRODUCES = REQUEST_MAPPING__PRODUCES;

	/**
	 * The feature id for the '<em><b>Path Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__PATH_VARIABLE = REQUEST_MAPPING__PATH_VARIABLE;

	/**
	 * The number of structural features of the '<em>Get Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING_FEATURE_COUNT = REQUEST_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING_OPERATION_COUNT = REQUEST_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PutMappingImpl <em>Put Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PutMappingImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPutMapping()
	 * @generated
	 */
	int PUT_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Requestpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_MAPPING__REQUESTPART = REQUEST_MAPPING__REQUESTPART;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_MAPPING__VALUE = REQUEST_MAPPING__VALUE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_MAPPING__METHOD = REQUEST_MAPPING__METHOD;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_MAPPING__PRODUCES = REQUEST_MAPPING__PRODUCES;

	/**
	 * The feature id for the '<em><b>Path Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_MAPPING__PATH_VARIABLE = REQUEST_MAPPING__PATH_VARIABLE;

	/**
	 * The number of structural features of the '<em>Put Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_MAPPING_FEATURE_COUNT = REQUEST_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Put Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_MAPPING_OPERATION_COUNT = REQUEST_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ExceptionHandlerImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getExceptionHandler()
	 * @generated
	 */
	int EXCEPTION_HANDLER = 13;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DeleteMappingImpl <em>Delete Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DeleteMappingImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDeleteMapping()
	 * @generated
	 */
	int DELETE_MAPPING = 14;

	/**
	 * The feature id for the '<em><b>Requestpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_MAPPING__REQUESTPART = REQUEST_MAPPING__REQUESTPART;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_MAPPING__VALUE = REQUEST_MAPPING__VALUE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_MAPPING__METHOD = REQUEST_MAPPING__METHOD;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_MAPPING__PRODUCES = REQUEST_MAPPING__PRODUCES;

	/**
	 * The feature id for the '<em><b>Path Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_MAPPING__PATH_VARIABLE = REQUEST_MAPPING__PATH_VARIABLE;

	/**
	 * The number of structural features of the '<em>Delete Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_MAPPING_FEATURE_COUNT = REQUEST_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_MAPPING_OPERATION_COUNT = REQUEST_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RequestPartImpl <em>Request Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RequestPartImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRequestPart()
	 * @generated
	 */
	int REQUEST_PART = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PART__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PART__REQUIRED = 1;

	/**
	 * The number of structural features of the '<em>Request Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AutowiredImpl <em>Autowired</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AutowiredImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAutowired()
	 * @generated
	 */
	int AUTOWIRED = 16;

	/**
	 * The number of structural features of the '<em>Autowired</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOWIRED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Autowired</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOWIRED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ExceptionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EntityImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 18;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Namednativequery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMEDNATIVEQUERY = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Table_sImpl <em>Table s</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Table_sImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTable_s()
	 * @generated
	 */
	int TABLE_S = 19;

	/**
	 * The feature id for the '<em><b>Column s</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S__COLUMN_S = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S__ID = 2;

	/**
	 * The number of structural features of the '<em>Table s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.IdImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getId()
	 * @generated
	 */
	int ID = 20;

	/**
	 * The feature id for the '<em><b>Generatedvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__GENERATEDVALUE = 0;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Column_pImpl <em>Column p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Column_pImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getColumn_p()
	 * @generated
	 */
	int COLUMN_P = 21;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_P__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_P__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_P__NAME = 2;

	/**
	 * The number of structural features of the '<em>Column p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_P_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Column p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.GeneratedValueImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getGeneratedValue()
	 * @generated
	 */
	int GENERATED_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.NamedNativeQueryImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getNamedNativeQuery()
	 * @generated
	 */
	int NAMED_NATIVE_QUERY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SpecificationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 24;

	/**
	 * The feature id for the '<em><b>Searchcriteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SEARCHCRITERIA = 0;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SearchCriteriaImpl <em>Search Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SearchCriteriaImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSearchCriteria()
	 * @generated
	 */
	int SEARCH_CRITERIA = 25;

	/**
	 * The number of structural features of the '<em>Search Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CRITERIA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Search Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PredicateImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 26;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConfigurationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 27;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BEAN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Enablewebsecurity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLEWEBSECURITY = 2;

	/**
	 * The feature id for the '<em><b>Enableresourceserver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLERESOURCESERVER = 3;

	/**
	 * The feature id for the '<em><b>Enableauthorizationserver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLEAUTHORIZATIONSERVER = 4;

	/**
	 * The feature id for the '<em><b>Enableglobalmethodsecurity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLEGLOBALMETHODSECURITY = 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ComponentImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 28;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Order_sImpl <em>Order s</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Order_sImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOrder_s()
	 * @generated
	 */
	int ORDER_S = 29;

	/**
	 * The number of structural features of the '<em>Order s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_S_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Order s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.EnableAuthorizationServerImpl <em>Enable Authorization Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EnableAuthorizationServerImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableAuthorizationServer()
	 * @generated
	 */
	int ENABLE_AUTHORIZATION_SERVER = 30;

	/**
	 * The number of structural features of the '<em>Enable Authorization Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_AUTHORIZATION_SERVER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enable Authorization Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_AUTHORIZATION_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.EnableResourceServerImpl <em>Enable Resource Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EnableResourceServerImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableResourceServer()
	 * @generated
	 */
	int ENABLE_RESOURCE_SERVER = 31;

	/**
	 * The number of structural features of the '<em>Enable Resource Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_RESOURCE_SERVER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enable Resource Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_RESOURCE_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.EnableWebSecurityImpl <em>Enable Web Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EnableWebSecurityImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableWebSecurity()
	 * @generated
	 */
	int ENABLE_WEB_SECURITY = 32;

	/**
	 * The number of structural features of the '<em>Enable Web Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_WEB_SECURITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enable Web Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_WEB_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.EnableGlobalMethodSecurityImpl <em>Enable Global Method Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EnableGlobalMethodSecurityImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableGlobalMethodSecurity()
	 * @generated
	 */
	int ENABLE_GLOBAL_METHOD_SECURITY = 33;

	/**
	 * The feature id for the '<em><b>Pre Post Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_GLOBAL_METHOD_SECURITY__PRE_POST_ENABLED = 0;

	/**
	 * The number of structural features of the '<em>Enable Global Method Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_GLOBAL_METHOD_SECURITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enable Global Method Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_GLOBAL_METHOD_SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.BeanImpl <em>Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.BeanImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBean()
	 * @generated
	 */
	int BEAN = 34;

	/**
	 * The number of structural features of the '<em>Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PostgreSQLImpl <em>Postgre SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PostgreSQLImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostgreSQL()
	 * @generated
	 */
	int POSTGRE_SQL = 35;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL__CLUSTER = 0;

	/**
	 * The number of structural features of the '<em>Postgre SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Postgre SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.QueryImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 36;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CLAUSE = 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ForeignKeyImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 37;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERENCE = 1;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.TriggerImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ViewImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Index_pImpl <em>Index p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Index_pImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getIndex_p()
	 * @generated
	 */
	int INDEX_P = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_P__NAME = 0;

	/**
	 * The number of structural features of the '<em>Index p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_P_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Index p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Table_pImpl <em>Table p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Table_pImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTable_p()
	 * @generated
	 */
	int TABLE_P = 41;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P__ROW = 1;

	/**
	 * The feature id for the '<em><b>Foreignkey</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P__FOREIGNKEY = 2;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P__PRIMARY_KEY = 3;

	/**
	 * The feature id for the '<em><b>Inherit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P__INHERIT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P__NAME = 5;

	/**
	 * The number of structural features of the '<em>Table p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Table p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Function_pImpl <em>Function p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Function_pImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFunction_p()
	 * @generated
	 */
	int FUNCTION_P = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_P__NAME = 0;

	/**
	 * The number of structural features of the '<em>Function p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_P_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DatabaseImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 43;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SchemeImpl <em>Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SchemeImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getScheme()
	 * @generated
	 */
	int SCHEME = 44;

	/**
	 * The feature id for the '<em><b>Table postgresql</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__TABLE_POSTGRESQL = 0;

	/**
	 * The feature id for the '<em><b>View postgresql</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__VIEW_POSTGRESQL = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Storedprocedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__STOREDPROCEDURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__NAME = 5;

	/**
	 * The number of structural features of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.User_pImpl <em>User p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.User_pImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUser_p()
	 * @generated
	 */
	int USER_P = 45;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_P__EXECUTE = 0;

	/**
	 * The feature id for the '<em><b>Privilege</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_P__PRIVILEGE = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_P__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_P__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>User p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_P_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ClusterImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 46;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__DATABASE = 0;

	/**
	 * The feature id for the '<em><b>User p</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__USER_P = 1;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RowImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__POLICY = 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ColumnImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 48;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONSTRAINT = 1;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DataTypeImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConstraintImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 50;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PrivilegeImpl <em>Privilege</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PrivilegeImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPrivilege()
	 * @generated
	 */
	int PRIVILEGE = 51;

	/**
	 * The number of structural features of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PolicyImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 52;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ClauseImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 53;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__KEYWORD = 0;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.IndexImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 54;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Column_sImpl <em>Column s</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Column_sImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getColumn_s()
	 * @generated
	 */
	int COLUMN_S = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_S__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_S__NULLABLE = 1;

	/**
	 * The number of structural features of the '<em>Column s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_S_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.EntitiesImpl <em>Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EntitiesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEntities()
	 * @generated
	 */
	int ENTITIES = 122;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES__ID = 0;

	/**
	 * The number of structural features of the '<em>Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.User_dImpl <em>User d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.User_dImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUser_d()
	 * @generated
	 */
	int USER_D = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__ID = ENTITIES__ID;

	/**
	 * The feature id for the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__FIRST_NAME = ENTITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__LAST_NAME = ENTITIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Profile description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__PROFILE_DESCRIPTION = ENTITIES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__USERNAME = ENTITIES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__PASSWORD = ENTITIES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__EMAIL = ENTITIES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Functionalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D__FUNCTIONALITIES = ENTITIES_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>User d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D_FEATURE_COUNT = ENTITIES_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>User d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_D_OPERATION_COUNT = ENTITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.FunctionalitiesImpl <em>Functionalities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.FunctionalitiesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFunctionalities()
	 * @generated
	 */
	int FUNCTIONALITIES = 123;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITIES__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITIES__NAME = 1;

	/**
	 * The number of structural features of the '<em>Functionalities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Functionalities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AppAccessImpl <em>App Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AppAccessImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAppAccess()
	 * @generated
	 */
	int APP_ACCESS = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS__ID = FUNCTIONALITIES__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS__NAME = FUNCTIONALITIES__NAME;

	/**
	 * The number of structural features of the '<em>App Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_FEATURE_COUNT = FUNCTIONALITIES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>App Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_OPERATION_COUNT = FUNCTIONALITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ProfileManagementImpl <em>Profile Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ProfileManagementImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getProfileManagement()
	 * @generated
	 */
	int PROFILE_MANAGEMENT = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_MANAGEMENT__ID = FUNCTIONALITIES__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_MANAGEMENT__NAME = FUNCTIONALITIES__NAME;

	/**
	 * The number of structural features of the '<em>Profile Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_MANAGEMENT_FEATURE_COUNT = FUNCTIONALITIES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profile Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_MANAGEMENT_OPERATION_COUNT = FUNCTIONALITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AlbumManagementImpl <em>Album Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AlbumManagementImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAlbumManagement()
	 * @generated
	 */
	int ALBUM_MANAGEMENT = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_MANAGEMENT__ID = FUNCTIONALITIES__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_MANAGEMENT__NAME = FUNCTIONALITIES__NAME;

	/**
	 * The number of structural features of the '<em>Album Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_MANAGEMENT_FEATURE_COUNT = FUNCTIONALITIES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Album Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_MANAGEMENT_OPERATION_COUNT = FUNCTIONALITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PhotoActionsImpl <em>Photo Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PhotoActionsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPhotoActions()
	 * @generated
	 */
	int PHOTO_ACTIONS = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_ACTIONS__ID = FUNCTIONALITIES__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_ACTIONS__NAME = FUNCTIONALITIES__NAME;

	/**
	 * The feature id for the '<em><b>Albummanagement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_ACTIONS__ALBUMMANAGEMENT = FUNCTIONALITIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Photo Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_ACTIONS_FEATURE_COUNT = FUNCTIONALITIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Photo Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_ACTIONS_OPERATION_COUNT = FUNCTIONALITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PhotoImpl <em>Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PhotoImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPhoto()
	 * @generated
	 */
	int PHOTO = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__ID = ENTITIES__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__NAME = ENTITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Photoactions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__PHOTOACTIONS = ENTITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FEATURE_COUNT = ENTITIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OPERATION_COUNT = ENTITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AlbumImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ID = ENTITIES__ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__URL = ENTITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = ENTITIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Albummanagement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ALBUMMANAGEMENT = ENTITIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = ENTITIES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = ENTITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonWebServicesImpl <em>Amazon Web Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonWebServicesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonWebServices()
	 * @generated
	 */
	int AMAZON_WEB_SERVICES = 63;

	/**
	 * The feature id for the '<em><b>Amazonsimplestorageservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE = 0;

	/**
	 * The feature id for the '<em><b>Amazonelasticcomputecloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD = 1;

	/**
	 * The number of structural features of the '<em>Amazon Web Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Amazon Web Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.NTierImpl <em>NTier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.NTierImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getNTier()
	 * @generated
	 */
	int NTIER = 64;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__LAYER = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__RELATION = 2;

	/**
	 * The number of structural features of the '<em>NTier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>NTier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.LayerImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 65;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConnectionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 66;

	/**
	 * The feature id for the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET_LAYER = 1;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RelationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 67;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.RESTImpl <em>REST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RESTImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getREST()
	 * @generated
	 */
	int REST = 68;

	/**
	 * The feature id for the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__SOURCE_LAYER = CONNECTION__SOURCE_LAYER;

	/**
	 * The feature id for the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__TARGET_LAYER = CONNECTION__TARGET_LAYER;

	/**
	 * The number of structural features of the '<em>REST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>REST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PostgreSQLConnectionImpl <em>Postgre SQL Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PostgreSQLConnectionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostgreSQLConnection()
	 * @generated
	 */
	int POSTGRE_SQL_CONNECTION = 69;

	/**
	 * The feature id for the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION__SOURCE_LAYER = CONNECTION__SOURCE_LAYER;

	/**
	 * The feature id for the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION__TARGET_LAYER = CONNECTION__TARGET_LAYER;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION__URL = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION__PORT = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION__USERNAME = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION__PASSWORD = CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Postgre SQL Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Postgre SQL Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonS3APIImpl <em>Amazon S3API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonS3APIImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonS3API()
	 * @generated
	 */
	int AMAZON_S3API = 70;

	/**
	 * The feature id for the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__SOURCE_LAYER = CONNECTION__SOURCE_LAYER;

	/**
	 * The feature id for the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__TARGET_LAYER = CONNECTION__TARGET_LAYER;

	/**
	 * The feature id for the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__ENDPOINT_URL = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__ACCESS_KEY = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__SECRET_KEY = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bucket Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__BUCKET_NAME = CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Amazon S3API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Amazon S3API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PresentationImpl <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PresentationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPresentation()
	 * @generated
	 */
	int PRESENTATION = 71;

	/**
	 * The feature id for the '<em><b>Presentation Layer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PRESENTATION_LAYER = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_FEATURE_COUNT = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.BusinessLogicImpl <em>Business Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.BusinessLogicImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBusinessLogic()
	 * @generated
	 */
	int BUSINESS_LOGIC = 72;

	/**
	 * The feature id for the '<em><b>Business Logic Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LOGIC_FEATURE_COUNT = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LOGIC_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DataImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getData()
	 * @generated
	 */
	int DATA = 73;

	/**
	 * The feature id for the '<em><b>Data Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_SEGMENT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AllowedToUseImpl <em>Allowed To Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AllowedToUseImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAllowedToUse()
	 * @generated
	 */
	int ALLOWED_TO_USE = 74;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.PresentationSegmentImpl <em>Presentation Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PresentationSegmentImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPresentationSegment()
	 * @generated
	 */
	int PRESENTATION_SEGMENT = 75;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_SEGMENT__SEGMENTSTRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Presentation Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_SEGMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Presentation Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.BusinessLogicSegmentImpl <em>Business Logic Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.BusinessLogicSegmentImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBusinessLogicSegment()
	 * @generated
	 */
	int BUSINESS_LOGIC_SEGMENT = 76;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LOGIC_SEGMENT__SEGMENTSTRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Business Logic Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LOGIC_SEGMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Business Logic Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LOGIC_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DataSegmentImpl <em>Data Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DataSegmentImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDataSegment()
	 * @generated
	 */
	int DATA_SEGMENT = 77;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__SEGMENTSTRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Data Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.View_aImpl <em>View a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.View_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getView_a()
	 * @generated
	 */
	int VIEW_A = 78;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_A__SEGMENTSTRUCTURE = PRESENTATION_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>View a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_A_FEATURE_COUNT = PRESENTATION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_A_OPERATION_COUNT = PRESENTATION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Component_aImpl <em>Component a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Component_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponent_a()
	 * @generated
	 */
	int COMPONENT_A = 79;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_A__SEGMENTSTRUCTURE = PRESENTATION_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Component a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_A_FEATURE_COUNT = PRESENTATION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_A_OPERATION_COUNT = PRESENTATION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Action_aImpl <em>Action a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Action_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAction_a()
	 * @generated
	 */
	int ACTION_A = 80;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_A__SEGMENTSTRUCTURE = PRESENTATION_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Action a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_A_FEATURE_COUNT = PRESENTATION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_A_OPERATION_COUNT = PRESENTATION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Controller_aImpl <em>Controller a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Controller_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getController_a()
	 * @generated
	 */
	int CONTROLLER_A = 81;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_A__SEGMENTSTRUCTURE = BUSINESS_LOGIC_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Controller a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_A_FEATURE_COUNT = BUSINESS_LOGIC_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Controller a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_A_OPERATION_COUNT = BUSINESS_LOGIC_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Model_aImpl <em>Model a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Model_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getModel_a()
	 * @generated
	 */
	int MODEL_A = 82;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_A__SEGMENTSTRUCTURE = BUSINESS_LOGIC_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Model a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_A_FEATURE_COUNT = BUSINESS_LOGIC_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_A_OPERATION_COUNT = BUSINESS_LOGIC_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Repository_aImpl <em>Repository a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Repository_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRepository_a()
	 * @generated
	 */
	int REPOSITORY_A = 83;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_A__SEGMENTSTRUCTURE = BUSINESS_LOGIC_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Repository a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_A_FEATURE_COUNT = BUSINESS_LOGIC_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repository a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_A_OPERATION_COUNT = BUSINESS_LOGIC_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Security_aImpl <em>Security a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Security_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSecurity_a()
	 * @generated
	 */
	int SECURITY_A = 84;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_A__SEGMENTSTRUCTURE = BUSINESS_LOGIC_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Security a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_A_FEATURE_COUNT = BUSINESS_LOGIC_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_A_OPERATION_COUNT = BUSINESS_LOGIC_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PostgreSQL_aImpl <em>Postgre SQL a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PostgreSQL_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostgreSQL_a()
	 * @generated
	 */
	int POSTGRE_SQL_A = 85;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_A__SEGMENTSTRUCTURE = DATA_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Postgre SQL a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_A_FEATURE_COUNT = DATA_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Postgre SQL a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_A_OPERATION_COUNT = DATA_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonS3StorageImpl <em>Amazon S3 Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonS3StorageImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonS3Storage()
	 * @generated
	 */
	int AMAZON_S3_STORAGE = 86;

	/**
	 * The feature id for the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3_STORAGE__SEGMENTSTRUCTURE = DATA_SEGMENT__SEGMENTSTRUCTURE;

	/**
	 * The number of structural features of the '<em>Amazon S3 Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3_STORAGE_FEATURE_COUNT = DATA_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Amazon S3 Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3_STORAGE_OPERATION_COUNT = DATA_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ModulesImpl <em>Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ModulesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getModules()
	 * @generated
	 */
	int MODULES = 87;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reactconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__REACTCONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__LIBRARIES = 4;

	/**
	 * The feature id for the '<em><b>Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__INFORMATION = 5;

	/**
	 * The number of structural features of the '<em>Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ComponentsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponents()
	 * @generated
	 */
	int COMPONENTS = 88;

	/**
	 * The feature id for the '<em><b>Reactclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__REACTCLASSES = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__MODULES = 1;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ReactFunctionsImpl <em>React Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ReactFunctionsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactFunctions()
	 * @generated
	 */
	int REACT_FUNCTIONS = 89;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FUNCTIONS__NAME = 0;

	/**
	 * The number of structural features of the '<em>React Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FUNCTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>React Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FUNCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RenderImpl <em>Render</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RenderImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRender()
	 * @generated
	 */
	int RENDER = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER__NAME = REACT_FUNCTIONS__NAME;

	/**
	 * The number of structural features of the '<em>Render</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER_FEATURE_COUNT = REACT_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Render</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER_OPERATION_COUNT = REACT_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConstructorImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = REACT_FUNCTIONS__NAME;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = REACT_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = REACT_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.LifeCycleImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLifeCycle()
	 * @generated
	 */
	int LIFE_CYCLE = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE__NAME = REACT_FUNCTIONS__NAME;

	/**
	 * The number of structural features of the '<em>Life Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_FEATURE_COUNT = REACT_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Life Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_OPERATION_COUNT = REACT_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl <em>Amazon Simple Storage Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonSimpleStorageService()
	 * @generated
	 */
	int AMAZON_SIMPLE_STORAGE_SERVICE = 93;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET = 0;

	/**
	 * The feature id for the '<em><b>Batchoperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION = 1;

	/**
	 * The number of structural features of the '<em>Amazon Simple Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_SIMPLE_STORAGE_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Amazon Simple Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_SIMPLE_STORAGE_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.BucketImpl <em>Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.BucketImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBucket()
	 * @generated
	 */
	int BUCKET = 94;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>File a</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__FILE_A = 2;

	/**
	 * The feature id for the '<em><b>Folder a</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__FOLDER_A = 3;

	/**
	 * The number of structural features of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.BatchOperationImpl <em>Batch Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.BatchOperationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBatchOperation()
	 * @generated
	 */
	int BATCH_OPERATION = 95;

	/**
	 * The number of structural features of the '<em>Batch Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Batch Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AccessImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 96;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PublicImpl <em>Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PublicImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPublic()
	 * @generated
	 */
	int PUBLIC = 97;

	/**
	 * The number of structural features of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_COUNT = ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ObjectsPublicImpl <em>Objects Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ObjectsPublicImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getObjectsPublic()
	 * @generated
	 */
	int OBJECTS_PUBLIC = 98;

	/**
	 * The number of structural features of the '<em>Objects Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_PUBLIC_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Objects Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_PUBLIC_OPERATION_COUNT = ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.BucketObjectsNotPublicImpl <em>Bucket Objects Not Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.BucketObjectsNotPublicImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBucketObjectsNotPublic()
	 * @generated
	 */
	int BUCKET_OBJECTS_NOT_PUBLIC = 99;

	/**
	 * The number of structural features of the '<em>Bucket Objects Not Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_OBJECTS_NOT_PUBLIC_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bucket Objects Not Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_OBJECTS_NOT_PUBLIC_OPERATION_COUNT = ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.OnlyAuthorizedImpl <em>Only Authorized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.OnlyAuthorizedImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOnlyAuthorized()
	 * @generated
	 */
	int ONLY_AUTHORIZED = 100;

	/**
	 * The number of structural features of the '<em>Only Authorized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_AUTHORIZED_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Only Authorized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_AUTHORIZED_OPERATION_COUNT = ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.File_aImpl <em>File a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.File_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFile_a()
	 * @generated
	 */
	int FILE_A = 101;

	/**
	 * The feature id for the '<em><b>Onwer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_A__ONWER = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_A__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Object URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_A__OBJECT_URL = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_A__METADATA = 3;

	/**
	 * The number of structural features of the '<em>File a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_A_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>File a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Folder_aImpl <em>Folder a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Folder_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFolder_a()
	 * @generated
	 */
	int FOLDER_A = 102;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_A__NAME = 0;

	/**
	 * The feature id for the '<em><b>File a</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_A__FILE_A = 1;

	/**
	 * The number of structural features of the '<em>Folder a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_A_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Folder a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.MetaDataImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 103;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ReactConfigurationImpl <em>React Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ReactConfigurationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactConfiguration()
	 * @generated
	 */
	int REACT_CONFIGURATION = 104;

	/**
	 * The number of structural features of the '<em>React Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>React Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ReactDOMImpl <em>React DOM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ReactDOMImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactDOM()
	 * @generated
	 */
	int REACT_DOM = 105;

	/**
	 * The feature id for the '<em><b>Is Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM__IS_ROUTE = REACT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM__IS_CONSTANT = REACT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM__IS_STRUCT = REACT_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>React DOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM_FEATURE_COUNT = REACT_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>React DOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM_OPERATION_COUNT = REACT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DependenciesImpl <em>Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DependenciesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDependencies()
	 * @generated
	 */
	int DEPENDENCIES = 106;

	/**
	 * The number of structural features of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_FEATURE_COUNT = REACT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_OPERATION_COUNT = REACT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.LogicImpl <em>Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.LogicImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLogic()
	 * @generated
	 */
	int LOGIC = 107;

	/**
	 * The feature id for the '<em><b>Reactclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC__REACTCLASSES = COMPONENTS__REACTCLASSES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC__MODULES = COMPONENTS__MODULES;

	/**
	 * The number of structural features of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.UIImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUI()
	 * @generated
	 */
	int UI = 108;

	/**
	 * The feature id for the '<em><b>Reactclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__REACTCLASSES = COMPONENTS__REACTCLASSES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__MODULES = COMPONENTS__MODULES;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ReactClassesImpl <em>React Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ReactClassesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactClasses()
	 * @generated
	 */
	int REACT_CLASSES = 109;

	/**
	 * The feature id for the '<em><b>Reactfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_CLASSES__REACTFUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_CLASSES__PROPS = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_CLASSES__STATE = 2;

	/**
	 * The number of structural features of the '<em>React Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_CLASSES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>React Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_CLASSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.CoreFunctionsImpl <em>Core Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CoreFunctionsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCoreFunctions()
	 * @generated
	 */
	int CORE_FUNCTIONS = 110;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FUNCTIONS__NAME = REACT_FUNCTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Corefunctions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FUNCTIONS__COREFUNCTIONS = REACT_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Core Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FUNCTIONS_FEATURE_COUNT = REACT_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Core Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FUNCTIONS_OPERATION_COUNT = REACT_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RouterImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 111;

	/**
	 * The feature id for the '<em><b>Reactclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__REACTCLASSES = LOGIC__REACTCLASSES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MODULES = LOGIC__MODULES;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = LOGIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = LOGIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.StructureImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 112;

	/**
	 * The feature id for the '<em><b>Reactclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__REACTCLASSES = LOGIC__REACTCLASSES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__MODULES = LOGIC__MODULES;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = LOGIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = LOGIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ViewComponentsImpl <em>View Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ViewComponentsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getViewComponents()
	 * @generated
	 */
	int VIEW_COMPONENTS = 113;

	/**
	 * The feature id for the '<em><b>Reactclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENTS__REACTCLASSES = UI__REACTCLASSES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENTS__MODULES = UI__MODULES;

	/**
	 * The number of structural features of the '<em>View Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENTS_FEATURE_COUNT = UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENTS_OPERATION_COUNT = UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SubcomponentsImpl <em>Subcomponents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SubcomponentsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSubcomponents()
	 * @generated
	 */
	int SUBCOMPONENTS = 114;

	/**
	 * The feature id for the '<em><b>Reactclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENTS__REACTCLASSES = UI__REACTCLASSES;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENTS__MODULES = UI__MODULES;

	/**
	 * The number of structural features of the '<em>Subcomponents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENTS_FEATURE_COUNT = UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subcomponents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENTS_OPERATION_COUNT = UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ActionsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 115;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RequestImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 116;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ServicesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 117;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__REQUEST = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.LibrariesImpl <em>Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.LibrariesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLibraries()
	 * @generated
	 */
	int LIBRARIES = 118;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PropsImpl <em>Props</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PropsImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getProps()
	 * @generated
	 */
	int PROPS = 119;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS__DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.StateImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getState()
	 * @generated
	 */
	int STATE = 120;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVE = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.InformationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 121;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__FILE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SegmentStructureImpl <em>Segment Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SegmentStructureImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentStructure()
	 * @generated
	 */
	int SEGMENT_STRUCTURE = 124;

	/**
	 * The feature id for the '<em><b>Directories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_STRUCTURE__DIRECTORIES = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_STRUCTURE__FILES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_STRUCTURE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Segment Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Segment Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DirectoriesImpl <em>Directories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DirectoriesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDirectories()
	 * @generated
	 */
	int DIRECTORIES = 125;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIES__FILES = 0;

	/**
	 * The number of structural features of the '<em>Directories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Directories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.FilesImpl <em>Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.FilesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 126;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__EXTENSION = 1;

	/**
	 * The number of structural features of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonElasticComputeCloudImpl <em>Amazon Elastic Compute Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonElasticComputeCloudImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonElasticComputeCloud()
	 * @generated
	 */
	int AMAZON_ELASTIC_COMPUTE_CLOUD = 127;

	/**
	 * The number of structural features of the '<em>Amazon Elastic Compute Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_ELASTIC_COMPUTE_CLOUD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Amazon Elastic Compute Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_ELASTIC_COMPUTE_CLOUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AssociationImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 128;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PathVariableImpl <em>Path Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PathVariableImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPathVariable()
	 * @generated
	 */
	int PATH_VARIABLE = 129;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Path Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Path Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.SoftGallery <em>Soft Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Gallery</em>'.
	 * @see PhotosMetaModel.SoftGallery
	 * @generated
	 */
	EClass getSoftGallery();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.SoftGallery#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see PhotosMetaModel.SoftGallery#getDomain()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.SoftGallery#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Architecture</em>'.
	 * @see PhotosMetaModel.SoftGallery#getArchitecture()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Architecture();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.SoftGallery#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology</em>'.
	 * @see PhotosMetaModel.SoftGallery#getTechnology()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Technology();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see PhotosMetaModel.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Domain#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see PhotosMetaModel.Domain#getEntities()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Entities();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see PhotosMetaModel.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Architecture#getNtier <em>Ntier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ntier</em>'.
	 * @see PhotosMetaModel.Architecture#getNtier()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Ntier();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see PhotosMetaModel.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Technology#getSpring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spring</em>'.
	 * @see PhotosMetaModel.Technology#getSpring()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Spring();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Technology#getPostgresql <em>Postgresql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postgresql</em>'.
	 * @see PhotosMetaModel.Technology#getPostgresql()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Postgresql();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Technology#getReact <em>React</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>React</em>'.
	 * @see PhotosMetaModel.Technology#getReact()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_React();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Technology#getAmazonwebservices <em>Amazonwebservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amazonwebservices</em>'.
	 * @see PhotosMetaModel.Technology#getAmazonwebservices()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Amazonwebservices();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Spring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring</em>'.
	 * @see PhotosMetaModel.Spring
	 * @generated
	 */
	EClass getSpring();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Spring#getSpringbootapplication <em>Springbootapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Springbootapplication</em>'.
	 * @see PhotosMetaModel.Spring#getSpringbootapplication()
	 * @see #getSpring()
	 * @generated
	 */
	EReference getSpring_Springbootapplication();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.React <em>React</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React</em>'.
	 * @see PhotosMetaModel.React
	 * @generated
	 */
	EClass getReact();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.React#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see PhotosMetaModel.React#getModules()
	 * @see #getReact()
	 * @generated
	 */
	EReference getReact_Modules();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see PhotosMetaModel.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.RestController <em>Rest Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Controller</em>'.
	 * @see PhotosMetaModel.RestController
	 * @generated
	 */
	EClass getRestController();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.RestController#getRequestmapping <em>Requestmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requestmapping</em>'.
	 * @see PhotosMetaModel.RestController#getRequestmapping()
	 * @see #getRestController()
	 * @generated
	 */
	EReference getRestController_Requestmapping();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.RestController#getExceptionhandler <em>Exceptionhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptionhandler</em>'.
	 * @see PhotosMetaModel.RestController#getExceptionhandler()
	 * @see #getRestController()
	 * @generated
	 */
	EReference getRestController_Exceptionhandler();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.RestController#getAutowired <em>Autowired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Autowired</em>'.
	 * @see PhotosMetaModel.RestController#getAutowired()
	 * @see #getRestController()
	 * @generated
	 */
	EReference getRestController_Autowired();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.RestController#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification</em>'.
	 * @see PhotosMetaModel.RestController#getSpecification()
	 * @see #getRestController()
	 * @generated
	 */
	EReference getRestController_Specification();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.RestController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.RestController#getName()
	 * @see #getRestController()
	 * @generated
	 */
	EAttribute getRestController_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.SpringBootApplication <em>Spring Boot Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Boot Application</em>'.
	 * @see PhotosMetaModel.SpringBootApplication
	 * @generated
	 */
	EClass getSpringBootApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.SpringBootApplication#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository</em>'.
	 * @see PhotosMetaModel.SpringBootApplication#getRepository()
	 * @see #getSpringBootApplication()
	 * @generated
	 */
	EReference getSpringBootApplication_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.SpringBootApplication#getRestcontroller <em>Restcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restcontroller</em>'.
	 * @see PhotosMetaModel.SpringBootApplication#getRestcontroller()
	 * @see #getSpringBootApplication()
	 * @generated
	 */
	EReference getSpringBootApplication_Restcontroller();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.SpringBootApplication#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see PhotosMetaModel.SpringBootApplication#getEntity()
	 * @see #getSpringBootApplication()
	 * @generated
	 */
	EReference getSpringBootApplication_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.SpringBootApplication#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see PhotosMetaModel.SpringBootApplication#getComponent()
	 * @see #getSpringBootApplication()
	 * @generated
	 */
	EReference getSpringBootApplication_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.SpringBootApplication#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see PhotosMetaModel.SpringBootApplication#getConfiguration()
	 * @see #getSpringBootApplication()
	 * @generated
	 */
	EReference getSpringBootApplication_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.SpringBootApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.SpringBootApplication#getName()
	 * @see #getSpringBootApplication()
	 * @generated
	 */
	EAttribute getSpringBootApplication_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.RequestMapping <em>Request Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Mapping</em>'.
	 * @see PhotosMetaModel.RequestMapping
	 * @generated
	 */
	EClass getRequestMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.RequestMapping#getRequestpart <em>Requestpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requestpart</em>'.
	 * @see PhotosMetaModel.RequestMapping#getRequestpart()
	 * @see #getRequestMapping()
	 * @generated
	 */
	EReference getRequestMapping_Requestpart();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.RequestMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PhotosMetaModel.RequestMapping#getValue()
	 * @see #getRequestMapping()
	 * @generated
	 */
	EAttribute getRequestMapping_Value();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.RequestMapping#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see PhotosMetaModel.RequestMapping#getMethod()
	 * @see #getRequestMapping()
	 * @generated
	 */
	EAttribute getRequestMapping_Method();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.RequestMapping#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produces</em>'.
	 * @see PhotosMetaModel.RequestMapping#getProduces()
	 * @see #getRequestMapping()
	 * @generated
	 */
	EAttribute getRequestMapping_Produces();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.RequestMapping#getPathVariable <em>Path Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Variable</em>'.
	 * @see PhotosMetaModel.RequestMapping#getPathVariable()
	 * @see #getRequestMapping()
	 * @generated
	 */
	EReference getRequestMapping_PathVariable();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PostMapping <em>Post Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Mapping</em>'.
	 * @see PhotosMetaModel.PostMapping
	 * @generated
	 */
	EClass getPostMapping();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.GetMapping <em>Get Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Mapping</em>'.
	 * @see PhotosMetaModel.GetMapping
	 * @generated
	 */
	EClass getGetMapping();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PutMapping <em>Put Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Put Mapping</em>'.
	 * @see PhotosMetaModel.PutMapping
	 * @generated
	 */
	EClass getPutMapping();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler</em>'.
	 * @see PhotosMetaModel.ExceptionHandler
	 * @generated
	 */
	EClass getExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.ExceptionHandler#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception</em>'.
	 * @see PhotosMetaModel.ExceptionHandler#getException()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_Exception();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ExceptionHandler#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PhotosMetaModel.ExceptionHandler#getValue()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EAttribute getExceptionHandler_Value();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.DeleteMapping <em>Delete Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Mapping</em>'.
	 * @see PhotosMetaModel.DeleteMapping
	 * @generated
	 */
	EClass getDeleteMapping();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.RequestPart <em>Request Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Part</em>'.
	 * @see PhotosMetaModel.RequestPart
	 * @generated
	 */
	EClass getRequestPart();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.RequestPart#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PhotosMetaModel.RequestPart#getValue()
	 * @see #getRequestPart()
	 * @generated
	 */
	EAttribute getRequestPart_Value();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.RequestPart#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see PhotosMetaModel.RequestPart#isRequired()
	 * @see #getRequestPart()
	 * @generated
	 */
	EAttribute getRequestPart_Required();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Autowired <em>Autowired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autowired</em>'.
	 * @see PhotosMetaModel.Autowired
	 * @generated
	 */
	EClass getAutowired();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see PhotosMetaModel.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Exception#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Exception#getName()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see PhotosMetaModel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Entity#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see PhotosMetaModel.Entity#getTable()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Entity#getNamednativequery <em>Namednativequery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namednativequery</em>'.
	 * @see PhotosMetaModel.Entity#getNamednativequery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Namednativequery();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Table_s <em>Table s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table s</em>'.
	 * @see PhotosMetaModel.Table_s
	 * @generated
	 */
	EClass getTable_s();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Table_s#getColumn_s <em>Column s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column s</em>'.
	 * @see PhotosMetaModel.Table_s#getColumn_s()
	 * @see #getTable_s()
	 * @generated
	 */
	EReference getTable_s_Column_s();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Table_s#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Table_s#getName()
	 * @see #getTable_s()
	 * @generated
	 */
	EAttribute getTable_s_Name();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Table_s#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see PhotosMetaModel.Table_s#getId()
	 * @see #getTable_s()
	 * @generated
	 */
	EReference getTable_s_Id();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see PhotosMetaModel.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Id#getGeneratedvalue <em>Generatedvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generatedvalue</em>'.
	 * @see PhotosMetaModel.Id#getGeneratedvalue()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Generatedvalue();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Column_p <em>Column p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column p</em>'.
	 * @see PhotosMetaModel.Column_p
	 * @generated
	 */
	EClass getColumn_p();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Column_p#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see PhotosMetaModel.Column_p#getConstraint()
	 * @see #getColumn_p()
	 * @generated
	 */
	EReference getColumn_p_Constraint();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Column_p#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see PhotosMetaModel.Column_p#getDatatype()
	 * @see #getColumn_p()
	 * @generated
	 */
	EReference getColumn_p_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Column_p#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Column_p#getName()
	 * @see #getColumn_p()
	 * @generated
	 */
	EAttribute getColumn_p_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.GeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Value</em>'.
	 * @see PhotosMetaModel.GeneratedValue
	 * @generated
	 */
	EClass getGeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.GeneratedValue#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see PhotosMetaModel.GeneratedValue#getStrategy()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Strategy();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.NamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Query</em>'.
	 * @see PhotosMetaModel.NamedNativeQuery
	 * @generated
	 */
	EClass getNamedNativeQuery();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.NamedNativeQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.NamedNativeQuery#getName()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.NamedNativeQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see PhotosMetaModel.NamedNativeQuery#getQuery()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Query();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.NamedNativeQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see PhotosMetaModel.NamedNativeQuery#getResultClass()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultClass();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see PhotosMetaModel.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Specification#getSearchcriteria <em>Searchcriteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searchcriteria</em>'.
	 * @see PhotosMetaModel.Specification#getSearchcriteria()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Searchcriteria();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.SearchCriteria <em>Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Criteria</em>'.
	 * @see PhotosMetaModel.SearchCriteria
	 * @generated
	 */
	EClass getSearchCriteria();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see PhotosMetaModel.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Predicate#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see PhotosMetaModel.Predicate#getSpecification()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Specification();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see PhotosMetaModel.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Configuration#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean</em>'.
	 * @see PhotosMetaModel.Configuration#getBean()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Bean();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Configuration#getEnablewebsecurity <em>Enablewebsecurity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enablewebsecurity</em>'.
	 * @see PhotosMetaModel.Configuration#getEnablewebsecurity()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enablewebsecurity();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Configuration#getEnableresourceserver <em>Enableresourceserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enableresourceserver</em>'.
	 * @see PhotosMetaModel.Configuration#getEnableresourceserver()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enableresourceserver();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Configuration#getEnableauthorizationserver <em>Enableauthorizationserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enableauthorizationserver</em>'.
	 * @see PhotosMetaModel.Configuration#getEnableauthorizationserver()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enableauthorizationserver();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Configuration#getEnableglobalmethodsecurity <em>Enableglobalmethodsecurity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enableglobalmethodsecurity</em>'.
	 * @see PhotosMetaModel.Configuration#getEnableglobalmethodsecurity()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enableglobalmethodsecurity();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see PhotosMetaModel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Component#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see PhotosMetaModel.Component#getOrder()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Order();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Order_s <em>Order s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order s</em>'.
	 * @see PhotosMetaModel.Order_s
	 * @generated
	 */
	EClass getOrder_s();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.EnableAuthorizationServer <em>Enable Authorization Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Authorization Server</em>'.
	 * @see PhotosMetaModel.EnableAuthorizationServer
	 * @generated
	 */
	EClass getEnableAuthorizationServer();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.EnableResourceServer <em>Enable Resource Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Resource Server</em>'.
	 * @see PhotosMetaModel.EnableResourceServer
	 * @generated
	 */
	EClass getEnableResourceServer();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.EnableWebSecurity <em>Enable Web Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Web Security</em>'.
	 * @see PhotosMetaModel.EnableWebSecurity
	 * @generated
	 */
	EClass getEnableWebSecurity();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.EnableGlobalMethodSecurity <em>Enable Global Method Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Global Method Security</em>'.
	 * @see PhotosMetaModel.EnableGlobalMethodSecurity
	 * @generated
	 */
	EClass getEnableGlobalMethodSecurity();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.EnableGlobalMethodSecurity#isPrePostEnabled <em>Pre Post Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Post Enabled</em>'.
	 * @see PhotosMetaModel.EnableGlobalMethodSecurity#isPrePostEnabled()
	 * @see #getEnableGlobalMethodSecurity()
	 * @generated
	 */
	EAttribute getEnableGlobalMethodSecurity_PrePostEnabled();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean</em>'.
	 * @see PhotosMetaModel.Bean
	 * @generated
	 */
	EClass getBean();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PostgreSQL <em>Postgre SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postgre SQL</em>'.
	 * @see PhotosMetaModel.PostgreSQL
	 * @generated
	 */
	EClass getPostgreSQL();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.PostgreSQL#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cluster</em>'.
	 * @see PhotosMetaModel.PostgreSQL#getCluster()
	 * @see #getPostgreSQL()
	 * @generated
	 */
	EReference getPostgreSQL_Cluster();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see PhotosMetaModel.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Query#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see PhotosMetaModel.Query#getClause()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Clause();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see PhotosMetaModel.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.ForeignKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see PhotosMetaModel.ForeignKey#getColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Column();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.ForeignKey#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see PhotosMetaModel.ForeignKey#getReference()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Reference();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see PhotosMetaModel.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see PhotosMetaModel.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Index_p <em>Index p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index p</em>'.
	 * @see PhotosMetaModel.Index_p
	 * @generated
	 */
	EClass getIndex_p();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Index_p#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Index_p#getName()
	 * @see #getIndex_p()
	 * @generated
	 */
	EAttribute getIndex_p_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Table_p <em>Table p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table p</em>'.
	 * @see PhotosMetaModel.Table_p
	 * @generated
	 */
	EClass getTable_p();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Table_p#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see PhotosMetaModel.Table_p#getColumn()
	 * @see #getTable_p()
	 * @generated
	 */
	EReference getTable_p_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Table_p#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see PhotosMetaModel.Table_p#getRow()
	 * @see #getTable_p()
	 * @generated
	 */
	EReference getTable_p_Row();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Table_p#getForeignkey <em>Foreignkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreignkey</em>'.
	 * @see PhotosMetaModel.Table_p#getForeignkey()
	 * @see #getTable_p()
	 * @generated
	 */
	EReference getTable_p_Foreignkey();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Table_p#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key</em>'.
	 * @see PhotosMetaModel.Table_p#getPrimaryKey()
	 * @see #getTable_p()
	 * @generated
	 */
	EReference getTable_p_PrimaryKey();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Table_p#getInherit <em>Inherit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inherit</em>'.
	 * @see PhotosMetaModel.Table_p#getInherit()
	 * @see #getTable_p()
	 * @generated
	 */
	EReference getTable_p_Inherit();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Table_p#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Table_p#getName()
	 * @see #getTable_p()
	 * @generated
	 */
	EAttribute getTable_p_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Function_p <em>Function p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function p</em>'.
	 * @see PhotosMetaModel.Function_p
	 * @generated
	 */
	EClass getFunction_p();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Function_p#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Function_p#getName()
	 * @see #getFunction_p()
	 * @generated
	 */
	EAttribute getFunction_p_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see PhotosMetaModel.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Database#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheme</em>'.
	 * @see PhotosMetaModel.Database#getScheme()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Scheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheme</em>'.
	 * @see PhotosMetaModel.Scheme
	 * @generated
	 */
	EClass getScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Scheme#getTable_postgresql <em>Table postgresql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table postgresql</em>'.
	 * @see PhotosMetaModel.Scheme#getTable_postgresql()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_Table_postgresql();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Scheme#getView_postgresql <em>View postgresql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View postgresql</em>'.
	 * @see PhotosMetaModel.Scheme#getView_postgresql()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_View_postgresql();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Scheme#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see PhotosMetaModel.Scheme#getIndex()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Scheme#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see PhotosMetaModel.Scheme#getTrigger()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Scheme#getStoredprocedure <em>Storedprocedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storedprocedure</em>'.
	 * @see PhotosMetaModel.Scheme#getStoredprocedure()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_Storedprocedure();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Scheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Scheme#getName()
	 * @see #getScheme()
	 * @generated
	 */
	EAttribute getScheme_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.User_p <em>User p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User p</em>'.
	 * @see PhotosMetaModel.User_p
	 * @generated
	 */
	EClass getUser_p();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.User_p#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execute</em>'.
	 * @see PhotosMetaModel.User_p#getExecute()
	 * @see #getUser_p()
	 * @generated
	 */
	EReference getUser_p_Execute();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.User_p#getPrivilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Privilege</em>'.
	 * @see PhotosMetaModel.User_p#getPrivilege()
	 * @see #getUser_p()
	 * @generated
	 */
	EReference getUser_p_Privilege();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_p#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see PhotosMetaModel.User_p#getUsername()
	 * @see #getUser_p()
	 * @generated
	 */
	EAttribute getUser_p_Username();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_p#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see PhotosMetaModel.User_p#getPassword()
	 * @see #getUser_p()
	 * @generated
	 */
	EAttribute getUser_p_Password();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see PhotosMetaModel.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Cluster#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see PhotosMetaModel.Cluster#getDatabase()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Database();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Cluster#getUser_p <em>User p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User p</em>'.
	 * @see PhotosMetaModel.Cluster#getUser_p()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_User_p();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see PhotosMetaModel.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Row#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Row#getName()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Row#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see PhotosMetaModel.Row#getPolicy()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Policy();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see PhotosMetaModel.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Column#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see PhotosMetaModel.Column#getDatatype()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Column#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see PhotosMetaModel.Column#getConstraint()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Constraint();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see PhotosMetaModel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see PhotosMetaModel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Privilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privilege</em>'.
	 * @see PhotosMetaModel.Privilege
	 * @generated
	 */
	EClass getPrivilege();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see PhotosMetaModel.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see PhotosMetaModel.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Clause#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see PhotosMetaModel.Clause#getKeyword()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Keyword();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see PhotosMetaModel.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Column_s <em>Column s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column s</em>'.
	 * @see PhotosMetaModel.Column_s
	 * @generated
	 */
	EClass getColumn_s();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Column_s#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Column_s#getName()
	 * @see #getColumn_s()
	 * @generated
	 */
	EAttribute getColumn_s_Name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Column_s#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see PhotosMetaModel.Column_s#isNullable()
	 * @see #getColumn_s()
	 * @generated
	 */
	EAttribute getColumn_s_Nullable();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.User_d <em>User d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User d</em>'.
	 * @see PhotosMetaModel.User_d
	 * @generated
	 */
	EClass getUser_d();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_d#getFirst_name <em>First name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First name</em>'.
	 * @see PhotosMetaModel.User_d#getFirst_name()
	 * @see #getUser_d()
	 * @generated
	 */
	EAttribute getUser_d_First_name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_d#getLast_name <em>Last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last name</em>'.
	 * @see PhotosMetaModel.User_d#getLast_name()
	 * @see #getUser_d()
	 * @generated
	 */
	EAttribute getUser_d_Last_name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_d#getProfile_description <em>Profile description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile description</em>'.
	 * @see PhotosMetaModel.User_d#getProfile_description()
	 * @see #getUser_d()
	 * @generated
	 */
	EAttribute getUser_d_Profile_description();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_d#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see PhotosMetaModel.User_d#getUsername()
	 * @see #getUser_d()
	 * @generated
	 */
	EAttribute getUser_d_Username();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_d#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see PhotosMetaModel.User_d#getPassword()
	 * @see #getUser_d()
	 * @generated
	 */
	EAttribute getUser_d_Password();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.User_d#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see PhotosMetaModel.User_d#getEmail()
	 * @see #getUser_d()
	 * @generated
	 */
	EAttribute getUser_d_Email();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.User_d#getFunctionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalities</em>'.
	 * @see PhotosMetaModel.User_d#getFunctionalities()
	 * @see #getUser_d()
	 * @generated
	 */
	EReference getUser_d_Functionalities();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AppAccess <em>App Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Access</em>'.
	 * @see PhotosMetaModel.AppAccess
	 * @generated
	 */
	EClass getAppAccess();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ProfileManagement <em>Profile Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Management</em>'.
	 * @see PhotosMetaModel.ProfileManagement
	 * @generated
	 */
	EClass getProfileManagement();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AlbumManagement <em>Album Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album Management</em>'.
	 * @see PhotosMetaModel.AlbumManagement
	 * @generated
	 */
	EClass getAlbumManagement();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PhotoActions <em>Photo Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Actions</em>'.
	 * @see PhotosMetaModel.PhotoActions
	 * @generated
	 */
	EClass getPhotoActions();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.PhotoActions#getAlbummanagement <em>Albummanagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Albummanagement</em>'.
	 * @see PhotosMetaModel.PhotoActions#getAlbummanagement()
	 * @see #getPhotoActions()
	 * @generated
	 */
	EReference getPhotoActions_Albummanagement();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo</em>'.
	 * @see PhotosMetaModel.Photo
	 * @generated
	 */
	EClass getPhoto();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Photo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Photo#getName()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Name();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Photo#getPhotoactions <em>Photoactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Photoactions</em>'.
	 * @see PhotosMetaModel.Photo#getPhotoactions()
	 * @see #getPhoto()
	 * @generated
	 */
	EReference getPhoto_Photoactions();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see PhotosMetaModel.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Album#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see PhotosMetaModel.Album#getUrl()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Url();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Album#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Album#getName()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Name();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Album#getAlbummanagement <em>Albummanagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Albummanagement</em>'.
	 * @see PhotosMetaModel.Album#getAlbummanagement()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Albummanagement();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonWebServices <em>Amazon Web Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Web Services</em>'.
	 * @see PhotosMetaModel.AmazonWebServices
	 * @generated
	 */
	EClass getAmazonWebServices();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.AmazonWebServices#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amazonsimplestorageservice</em>'.
	 * @see PhotosMetaModel.AmazonWebServices#getAmazonsimplestorageservice()
	 * @see #getAmazonWebServices()
	 * @generated
	 */
	EReference getAmazonWebServices_Amazonsimplestorageservice();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.AmazonWebServices#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amazonelasticcomputecloud</em>'.
	 * @see PhotosMetaModel.AmazonWebServices#getAmazonelasticcomputecloud()
	 * @see #getAmazonWebServices()
	 * @generated
	 */
	EReference getAmazonWebServices_Amazonelasticcomputecloud();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.NTier <em>NTier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NTier</em>'.
	 * @see PhotosMetaModel.NTier
	 * @generated
	 */
	EClass getNTier();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.NTier#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see PhotosMetaModel.NTier#getConnection()
	 * @see #getNTier()
	 * @generated
	 */
	EReference getNTier_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.NTier#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer</em>'.
	 * @see PhotosMetaModel.NTier#getLayer()
	 * @see #getNTier()
	 * @generated
	 */
	EReference getNTier_Layer();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.NTier#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see PhotosMetaModel.NTier#getRelation()
	 * @see #getNTier()
	 * @generated
	 */
	EReference getNTier_Relation();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see PhotosMetaModel.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see PhotosMetaModel.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Connection#getSourceLayer <em>Source Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Layer</em>'.
	 * @see PhotosMetaModel.Connection#getSourceLayer()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_SourceLayer();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Connection#getTargetLayer <em>Target Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Layer</em>'.
	 * @see PhotosMetaModel.Connection#getTargetLayer()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TargetLayer();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see PhotosMetaModel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Relation#getSourceLayer <em>Source Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Layer</em>'.
	 * @see PhotosMetaModel.Relation#getSourceLayer()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_SourceLayer();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Relation#getTargetLayer <em>Target Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Layer</em>'.
	 * @see PhotosMetaModel.Relation#getTargetLayer()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TargetLayer();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.REST <em>REST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST</em>'.
	 * @see PhotosMetaModel.REST
	 * @generated
	 */
	EClass getREST();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PostgreSQLConnection <em>Postgre SQL Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postgre SQL Connection</em>'.
	 * @see PhotosMetaModel.PostgreSQLConnection
	 * @generated
	 */
	EClass getPostgreSQLConnection();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.PostgreSQLConnection#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see PhotosMetaModel.PostgreSQLConnection#getUrl()
	 * @see #getPostgreSQLConnection()
	 * @generated
	 */
	EAttribute getPostgreSQLConnection_Url();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.PostgreSQLConnection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see PhotosMetaModel.PostgreSQLConnection#getPort()
	 * @see #getPostgreSQLConnection()
	 * @generated
	 */
	EAttribute getPostgreSQLConnection_Port();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.PostgreSQLConnection#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see PhotosMetaModel.PostgreSQLConnection#getUsername()
	 * @see #getPostgreSQLConnection()
	 * @generated
	 */
	EAttribute getPostgreSQLConnection_Username();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.PostgreSQLConnection#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see PhotosMetaModel.PostgreSQLConnection#getPassword()
	 * @see #getPostgreSQLConnection()
	 * @generated
	 */
	EAttribute getPostgreSQLConnection_Password();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonS3API <em>Amazon S3API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon S3API</em>'.
	 * @see PhotosMetaModel.AmazonS3API
	 * @generated
	 */
	EClass getAmazonS3API();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.AmazonS3API#getEndpointUrl <em>Endpoint Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Url</em>'.
	 * @see PhotosMetaModel.AmazonS3API#getEndpointUrl()
	 * @see #getAmazonS3API()
	 * @generated
	 */
	EAttribute getAmazonS3API_EndpointUrl();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.AmazonS3API#getAccessKey <em>Access Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Key</em>'.
	 * @see PhotosMetaModel.AmazonS3API#getAccessKey()
	 * @see #getAmazonS3API()
	 * @generated
	 */
	EAttribute getAmazonS3API_AccessKey();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.AmazonS3API#getSecretKey <em>Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Key</em>'.
	 * @see PhotosMetaModel.AmazonS3API#getSecretKey()
	 * @see #getAmazonS3API()
	 * @generated
	 */
	EAttribute getAmazonS3API_SecretKey();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.AmazonS3API#getBucketName <em>Bucket Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Name</em>'.
	 * @see PhotosMetaModel.AmazonS3API#getBucketName()
	 * @see #getAmazonS3API()
	 * @generated
	 */
	EAttribute getAmazonS3API_BucketName();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation</em>'.
	 * @see PhotosMetaModel.Presentation
	 * @generated
	 */
	EClass getPresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Presentation#getPresentationLayer <em>Presentation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation Layer</em>'.
	 * @see PhotosMetaModel.Presentation#getPresentationLayer()
	 * @see #getPresentation()
	 * @generated
	 */
	EReference getPresentation_PresentationLayer();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.BusinessLogic <em>Business Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Logic</em>'.
	 * @see PhotosMetaModel.BusinessLogic
	 * @generated
	 */
	EClass getBusinessLogic();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.BusinessLogic#getBusinessLogicSegment <em>Business Logic Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Logic Segment</em>'.
	 * @see PhotosMetaModel.BusinessLogic#getBusinessLogicSegment()
	 * @see #getBusinessLogic()
	 * @generated
	 */
	EReference getBusinessLogic_BusinessLogicSegment();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see PhotosMetaModel.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Data#getDataSegment <em>Data Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Segment</em>'.
	 * @see PhotosMetaModel.Data#getDataSegment()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataSegment();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AllowedToUse <em>Allowed To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed To Use</em>'.
	 * @see PhotosMetaModel.AllowedToUse
	 * @generated
	 */
	EClass getAllowedToUse();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PresentationSegment <em>Presentation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Segment</em>'.
	 * @see PhotosMetaModel.PresentationSegment
	 * @generated
	 */
	EClass getPresentationSegment();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.PresentationSegment#getSegmentstructure <em>Segmentstructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segmentstructure</em>'.
	 * @see PhotosMetaModel.PresentationSegment#getSegmentstructure()
	 * @see #getPresentationSegment()
	 * @generated
	 */
	EReference getPresentationSegment_Segmentstructure();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.BusinessLogicSegment <em>Business Logic Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Logic Segment</em>'.
	 * @see PhotosMetaModel.BusinessLogicSegment
	 * @generated
	 */
	EClass getBusinessLogicSegment();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.BusinessLogicSegment#getSegmentstructure <em>Segmentstructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segmentstructure</em>'.
	 * @see PhotosMetaModel.BusinessLogicSegment#getSegmentstructure()
	 * @see #getBusinessLogicSegment()
	 * @generated
	 */
	EReference getBusinessLogicSegment_Segmentstructure();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.DataSegment <em>Data Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Segment</em>'.
	 * @see PhotosMetaModel.DataSegment
	 * @generated
	 */
	EClass getDataSegment();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.DataSegment#getSegmentstructure <em>Segmentstructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segmentstructure</em>'.
	 * @see PhotosMetaModel.DataSegment#getSegmentstructure()
	 * @see #getDataSegment()
	 * @generated
	 */
	EReference getDataSegment_Segmentstructure();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.View_a <em>View a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View a</em>'.
	 * @see PhotosMetaModel.View_a
	 * @generated
	 */
	EClass getView_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Component_a <em>Component a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component a</em>'.
	 * @see PhotosMetaModel.Component_a
	 * @generated
	 */
	EClass getComponent_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Action_a <em>Action a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action a</em>'.
	 * @see PhotosMetaModel.Action_a
	 * @generated
	 */
	EClass getAction_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Controller_a <em>Controller a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller a</em>'.
	 * @see PhotosMetaModel.Controller_a
	 * @generated
	 */
	EClass getController_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Model_a <em>Model a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model a</em>'.
	 * @see PhotosMetaModel.Model_a
	 * @generated
	 */
	EClass getModel_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Repository_a <em>Repository a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository a</em>'.
	 * @see PhotosMetaModel.Repository_a
	 * @generated
	 */
	EClass getRepository_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Security_a <em>Security a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security a</em>'.
	 * @see PhotosMetaModel.Security_a
	 * @generated
	 */
	EClass getSecurity_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PostgreSQL_a <em>Postgre SQL a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postgre SQL a</em>'.
	 * @see PhotosMetaModel.PostgreSQL_a
	 * @generated
	 */
	EClass getPostgreSQL_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonS3Storage <em>Amazon S3 Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon S3 Storage</em>'.
	 * @see PhotosMetaModel.AmazonS3Storage
	 * @generated
	 */
	EClass getAmazonS3Storage();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Modules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modules</em>'.
	 * @see PhotosMetaModel.Modules
	 * @generated
	 */
	EClass getModules();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Modules#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Modules#getName()
	 * @see #getModules()
	 * @generated
	 */
	EAttribute getModules_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Modules#getReactconfiguration <em>Reactconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactconfiguration</em>'.
	 * @see PhotosMetaModel.Modules#getReactconfiguration()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Reactconfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Modules#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see PhotosMetaModel.Modules#getComponents()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Modules#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see PhotosMetaModel.Modules#getActions()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Modules#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see PhotosMetaModel.Modules#getLibraries()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Modules#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information</em>'.
	 * @see PhotosMetaModel.Modules#getInformation()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Information();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see PhotosMetaModel.Components
	 * @generated
	 */
	EClass getComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Components#getReactclasses <em>Reactclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactclasses</em>'.
	 * @see PhotosMetaModel.Components#getReactclasses()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Reactclasses();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Components#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modules</em>'.
	 * @see PhotosMetaModel.Components#getModules()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Modules();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ReactFunctions <em>React Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React Functions</em>'.
	 * @see PhotosMetaModel.ReactFunctions
	 * @generated
	 */
	EClass getReactFunctions();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ReactFunctions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.ReactFunctions#getName()
	 * @see #getReactFunctions()
	 * @generated
	 */
	EAttribute getReactFunctions_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Render <em>Render</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Render</em>'.
	 * @see PhotosMetaModel.Render
	 * @generated
	 */
	EClass getRender();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see PhotosMetaModel.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle</em>'.
	 * @see PhotosMetaModel.LifeCycle
	 * @generated
	 */
	EClass getLifeCycle();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonSimpleStorageService <em>Amazon Simple Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Simple Storage Service</em>'.
	 * @see PhotosMetaModel.AmazonSimpleStorageService
	 * @generated
	 */
	EClass getAmazonSimpleStorageService();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.AmazonSimpleStorageService#getBucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bucket</em>'.
	 * @see PhotosMetaModel.AmazonSimpleStorageService#getBucket()
	 * @see #getAmazonSimpleStorageService()
	 * @generated
	 */
	EReference getAmazonSimpleStorageService_Bucket();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.AmazonSimpleStorageService#getBatchoperation <em>Batchoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batchoperation</em>'.
	 * @see PhotosMetaModel.AmazonSimpleStorageService#getBatchoperation()
	 * @see #getAmazonSimpleStorageService()
	 * @generated
	 */
	EReference getAmazonSimpleStorageService_Batchoperation();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Bucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bucket</em>'.
	 * @see PhotosMetaModel.Bucket
	 * @generated
	 */
	EClass getBucket();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Bucket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Bucket#getName()
	 * @see #getBucket()
	 * @generated
	 */
	EAttribute getBucket_Name();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Bucket#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access</em>'.
	 * @see PhotosMetaModel.Bucket#getAccess()
	 * @see #getBucket()
	 * @generated
	 */
	EReference getBucket_Access();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Bucket#getFile_a <em>File a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File a</em>'.
	 * @see PhotosMetaModel.Bucket#getFile_a()
	 * @see #getBucket()
	 * @generated
	 */
	EReference getBucket_File_a();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Bucket#getFolder_a <em>Folder a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folder a</em>'.
	 * @see PhotosMetaModel.Bucket#getFolder_a()
	 * @see #getBucket()
	 * @generated
	 */
	EReference getBucket_Folder_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.BatchOperation <em>Batch Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batch Operation</em>'.
	 * @see PhotosMetaModel.BatchOperation
	 * @generated
	 */
	EClass getBatchOperation();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see PhotosMetaModel.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public</em>'.
	 * @see PhotosMetaModel.Public
	 * @generated
	 */
	EClass getPublic();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ObjectsPublic <em>Objects Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objects Public</em>'.
	 * @see PhotosMetaModel.ObjectsPublic
	 * @generated
	 */
	EClass getObjectsPublic();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.BucketObjectsNotPublic <em>Bucket Objects Not Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bucket Objects Not Public</em>'.
	 * @see PhotosMetaModel.BucketObjectsNotPublic
	 * @generated
	 */
	EClass getBucketObjectsNotPublic();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.OnlyAuthorized <em>Only Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Only Authorized</em>'.
	 * @see PhotosMetaModel.OnlyAuthorized
	 * @generated
	 */
	EClass getOnlyAuthorized();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.File_a <em>File a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File a</em>'.
	 * @see PhotosMetaModel.File_a
	 * @generated
	 */
	EClass getFile_a();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.File_a#getOnwer <em>Onwer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onwer</em>'.
	 * @see PhotosMetaModel.File_a#getOnwer()
	 * @see #getFile_a()
	 * @generated
	 */
	EAttribute getFile_a_Onwer();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.File_a#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see PhotosMetaModel.File_a#getSize()
	 * @see #getFile_a()
	 * @generated
	 */
	EAttribute getFile_a_Size();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.File_a#getObjectURL <em>Object URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object URL</em>'.
	 * @see PhotosMetaModel.File_a#getObjectURL()
	 * @see #getFile_a()
	 * @generated
	 */
	EAttribute getFile_a_ObjectURL();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.File_a#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see PhotosMetaModel.File_a#getMetadata()
	 * @see #getFile_a()
	 * @generated
	 */
	EReference getFile_a_Metadata();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Folder_a <em>Folder a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder a</em>'.
	 * @see PhotosMetaModel.Folder_a
	 * @generated
	 */
	EClass getFolder_a();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Folder_a#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Folder_a#getName()
	 * @see #getFolder_a()
	 * @generated
	 */
	EAttribute getFolder_a_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Folder_a#getFile_a <em>File a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File a</em>'.
	 * @see PhotosMetaModel.Folder_a#getFile_a()
	 * @see #getFolder_a()
	 * @generated
	 */
	EReference getFolder_a_File_a();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see PhotosMetaModel.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ReactConfiguration <em>React Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React Configuration</em>'.
	 * @see PhotosMetaModel.ReactConfiguration
	 * @generated
	 */
	EClass getReactConfiguration();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ReactDOM <em>React DOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React DOM</em>'.
	 * @see PhotosMetaModel.ReactDOM
	 * @generated
	 */
	EClass getReactDOM();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ReactDOM#getIsRoute <em>Is Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Route</em>'.
	 * @see PhotosMetaModel.ReactDOM#getIsRoute()
	 * @see #getReactDOM()
	 * @generated
	 */
	EAttribute getReactDOM_IsRoute();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ReactDOM#getIsConstant <em>Is Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constant</em>'.
	 * @see PhotosMetaModel.ReactDOM#getIsConstant()
	 * @see #getReactDOM()
	 * @generated
	 */
	EAttribute getReactDOM_IsConstant();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ReactDOM#getIsStruct <em>Is Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Struct</em>'.
	 * @see PhotosMetaModel.ReactDOM#getIsStruct()
	 * @see #getReactDOM()
	 * @generated
	 */
	EAttribute getReactDOM_IsStruct();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies</em>'.
	 * @see PhotosMetaModel.Dependencies
	 * @generated
	 */
	EClass getDependencies();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Logic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic</em>'.
	 * @see PhotosMetaModel.Logic
	 * @generated
	 */
	EClass getLogic();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see PhotosMetaModel.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ReactClasses <em>React Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React Classes</em>'.
	 * @see PhotosMetaModel.ReactClasses
	 * @generated
	 */
	EClass getReactClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.ReactClasses#getReactfunctions <em>Reactfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactfunctions</em>'.
	 * @see PhotosMetaModel.ReactClasses#getReactfunctions()
	 * @see #getReactClasses()
	 * @generated
	 */
	EReference getReactClasses_Reactfunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.ReactClasses#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see PhotosMetaModel.ReactClasses#getProps()
	 * @see #getReactClasses()
	 * @generated
	 */
	EReference getReactClasses_Props();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.ReactClasses#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see PhotosMetaModel.ReactClasses#getState()
	 * @see #getReactClasses()
	 * @generated
	 */
	EReference getReactClasses_State();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.CoreFunctions <em>Core Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Functions</em>'.
	 * @see PhotosMetaModel.CoreFunctions
	 * @generated
	 */
	EClass getCoreFunctions();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.CoreFunctions#getCorefunctions <em>Corefunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corefunctions</em>'.
	 * @see PhotosMetaModel.CoreFunctions#getCorefunctions()
	 * @see #getCoreFunctions()
	 * @generated
	 */
	EReference getCoreFunctions_Corefunctions();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see PhotosMetaModel.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see PhotosMetaModel.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ViewComponents <em>View Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Components</em>'.
	 * @see PhotosMetaModel.ViewComponents
	 * @generated
	 */
	EClass getViewComponents();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Subcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcomponents</em>'.
	 * @see PhotosMetaModel.Subcomponents
	 * @generated
	 */
	EClass getSubcomponents();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see PhotosMetaModel.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see PhotosMetaModel.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see PhotosMetaModel.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Services#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see PhotosMetaModel.Services#getRequest()
	 * @see #getServices()
	 * @generated
	 */
	EReference getServices_Request();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Libraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libraries</em>'.
	 * @see PhotosMetaModel.Libraries
	 * @generated
	 */
	EClass getLibraries();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Libraries#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PhotosMetaModel.Libraries#getType()
	 * @see #getLibraries()
	 * @generated
	 */
	EAttribute getLibraries_Type();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Props <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Props</em>'.
	 * @see PhotosMetaModel.Props
	 * @generated
	 */
	EClass getProps();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Props#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PhotosMetaModel.Props#getType()
	 * @see #getProps()
	 * @generated
	 */
	EAttribute getProps_Type();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Props#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see PhotosMetaModel.Props#getDataType()
	 * @see #getProps()
	 * @generated
	 */
	EAttribute getProps_DataType();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see PhotosMetaModel.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.State#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see PhotosMetaModel.State#getActive()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Active();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see PhotosMetaModel.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Information#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see PhotosMetaModel.Information#getFileType()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_FileType();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Entities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entities</em>'.
	 * @see PhotosMetaModel.Entities
	 * @generated
	 */
	EClass getEntities();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Entities#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Entities#getId()
	 * @see #getEntities()
	 * @generated
	 */
	EAttribute getEntities_Id();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Functionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionalities</em>'.
	 * @see PhotosMetaModel.Functionalities
	 * @generated
	 */
	EClass getFunctionalities();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Functionalities#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Functionalities#getId()
	 * @see #getFunctionalities()
	 * @generated
	 */
	EAttribute getFunctionalities_Id();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Functionalities#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Functionalities#getName()
	 * @see #getFunctionalities()
	 * @generated
	 */
	EAttribute getFunctionalities_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.SegmentStructure <em>Segment Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Structure</em>'.
	 * @see PhotosMetaModel.SegmentStructure
	 * @generated
	 */
	EClass getSegmentStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.SegmentStructure#getDirectories <em>Directories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directories</em>'.
	 * @see PhotosMetaModel.SegmentStructure#getDirectories()
	 * @see #getSegmentStructure()
	 * @generated
	 */
	EReference getSegmentStructure_Directories();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.SegmentStructure#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see PhotosMetaModel.SegmentStructure#getFiles()
	 * @see #getSegmentStructure()
	 * @generated
	 */
	EReference getSegmentStructure_Files();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.SegmentStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.SegmentStructure#getName()
	 * @see #getSegmentStructure()
	 * @generated
	 */
	EAttribute getSegmentStructure_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Directories <em>Directories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directories</em>'.
	 * @see PhotosMetaModel.Directories
	 * @generated
	 */
	EClass getDirectories();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Directories#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Files</em>'.
	 * @see PhotosMetaModel.Directories#getFiles()
	 * @see #getDirectories()
	 * @generated
	 */
	EReference getDirectories_Files();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files</em>'.
	 * @see PhotosMetaModel.Files
	 * @generated
	 */
	EClass getFiles();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Files#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PhotosMetaModel.Files#getType()
	 * @see #getFiles()
	 * @generated
	 */
	EAttribute getFiles_Type();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Files#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see PhotosMetaModel.Files#getExtension()
	 * @see #getFiles()
	 * @generated
	 */
	EAttribute getFiles_Extension();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonElasticComputeCloud <em>Amazon Elastic Compute Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Elastic Compute Cloud</em>'.
	 * @see PhotosMetaModel.AmazonElasticComputeCloud
	 * @generated
	 */
	EClass getAmazonElasticComputeCloud();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see PhotosMetaModel.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see PhotosMetaModel.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PhotosMetaModel.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.PathVariable <em>Path Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Variable</em>'.
	 * @see PhotosMetaModel.PathVariable
	 * @generated
	 */
	EClass getPathVariable();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.PathVariable#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see PhotosMetaModel.PathVariable#getDataType()
	 * @see #getPathVariable()
	 * @generated
	 */
	EAttribute getPathVariable_DataType();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.PathVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PhotosMetaModel.PathVariable#getValue()
	 * @see #getPathVariable()
	 * @generated
	 */
	EAttribute getPathVariable_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhotosMetaModelFactory getPhotosMetaModelFactory();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SoftGalleryImpl <em>Soft Gallery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SoftGalleryImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSoftGallery()
		 * @generated
		 */
		EClass SOFT_GALLERY = eINSTANCE.getSoftGallery();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__DOMAIN = eINSTANCE.getSoftGallery_Domain();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__ARCHITECTURE = eINSTANCE.getSoftGallery_Architecture();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__TECHNOLOGY = eINSTANCE.getSoftGallery_Technology();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DomainImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ENTITIES = eINSTANCE.getDomain_Entities();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ArchitectureImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Ntier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__NTIER = eINSTANCE.getArchitecture_Ntier();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.TechnologyImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Spring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__SPRING = eINSTANCE.getTechnology_Spring();

		/**
		 * The meta object literal for the '<em><b>Postgresql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__POSTGRESQL = eINSTANCE.getTechnology_Postgresql();

		/**
		 * The meta object literal for the '<em><b>React</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__REACT = eINSTANCE.getTechnology_React();

		/**
		 * The meta object literal for the '<em><b>Amazonwebservices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__AMAZONWEBSERVICES = eINSTANCE.getTechnology_Amazonwebservices();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SpringImpl <em>Spring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SpringImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSpring()
		 * @generated
		 */
		EClass SPRING = eINSTANCE.getSpring();

		/**
		 * The meta object literal for the '<em><b>Springbootapplication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING__SPRINGBOOTAPPLICATION = eINSTANCE.getSpring_Springbootapplication();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ReactImpl <em>React</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ReactImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReact()
		 * @generated
		 */
		EClass REACT = eINSTANCE.getReact();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT__MODULES = eINSTANCE.getReact_Modules();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RepositoryImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RestControllerImpl <em>Rest Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RestControllerImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRestController()
		 * @generated
		 */
		EClass REST_CONTROLLER = eINSTANCE.getRestController();

		/**
		 * The meta object literal for the '<em><b>Requestmapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CONTROLLER__REQUESTMAPPING = eINSTANCE.getRestController_Requestmapping();

		/**
		 * The meta object literal for the '<em><b>Exceptionhandler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CONTROLLER__EXCEPTIONHANDLER = eINSTANCE.getRestController_Exceptionhandler();

		/**
		 * The meta object literal for the '<em><b>Autowired</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CONTROLLER__AUTOWIRED = eINSTANCE.getRestController_Autowired();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CONTROLLER__SPECIFICATION = eINSTANCE.getRestController_Specification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_CONTROLLER__NAME = eINSTANCE.getRestController_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SpringBootApplicationImpl <em>Spring Boot Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SpringBootApplicationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSpringBootApplication()
		 * @generated
		 */
		EClass SPRING_BOOT_APPLICATION = eINSTANCE.getSpringBootApplication();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_BOOT_APPLICATION__REPOSITORY = eINSTANCE.getSpringBootApplication_Repository();

		/**
		 * The meta object literal for the '<em><b>Restcontroller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_BOOT_APPLICATION__RESTCONTROLLER = eINSTANCE.getSpringBootApplication_Restcontroller();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_BOOT_APPLICATION__ENTITY = eINSTANCE.getSpringBootApplication_Entity();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_BOOT_APPLICATION__COMPONENT = eINSTANCE.getSpringBootApplication_Component();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_BOOT_APPLICATION__CONFIGURATION = eINSTANCE.getSpringBootApplication_Configuration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_BOOT_APPLICATION__NAME = eINSTANCE.getSpringBootApplication_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RequestMappingImpl <em>Request Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RequestMappingImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRequestMapping()
		 * @generated
		 */
		EClass REQUEST_MAPPING = eINSTANCE.getRequestMapping();

		/**
		 * The meta object literal for the '<em><b>Requestpart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_MAPPING__REQUESTPART = eINSTANCE.getRequestMapping_Requestpart();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_MAPPING__VALUE = eINSTANCE.getRequestMapping_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_MAPPING__METHOD = eINSTANCE.getRequestMapping_Method();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_MAPPING__PRODUCES = eINSTANCE.getRequestMapping_Produces();

		/**
		 * The meta object literal for the '<em><b>Path Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_MAPPING__PATH_VARIABLE = eINSTANCE.getRequestMapping_PathVariable();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PostMappingImpl <em>Post Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PostMappingImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostMapping()
		 * @generated
		 */
		EClass POST_MAPPING = eINSTANCE.getPostMapping();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.GetMappingImpl <em>Get Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.GetMappingImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getGetMapping()
		 * @generated
		 */
		EClass GET_MAPPING = eINSTANCE.getGetMapping();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PutMappingImpl <em>Put Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PutMappingImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPutMapping()
		 * @generated
		 */
		EClass PUT_MAPPING = eINSTANCE.getPutMapping();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ExceptionHandlerImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getExceptionHandler()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER = eINSTANCE.getExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__EXCEPTION = eINSTANCE.getExceptionHandler_Exception();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_HANDLER__VALUE = eINSTANCE.getExceptionHandler_Value();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DeleteMappingImpl <em>Delete Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DeleteMappingImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDeleteMapping()
		 * @generated
		 */
		EClass DELETE_MAPPING = eINSTANCE.getDeleteMapping();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RequestPartImpl <em>Request Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RequestPartImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRequestPart()
		 * @generated
		 */
		EClass REQUEST_PART = eINSTANCE.getRequestPart();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_PART__VALUE = eINSTANCE.getRequestPart_Value();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_PART__REQUIRED = eINSTANCE.getRequestPart_Required();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AutowiredImpl <em>Autowired</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AutowiredImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAutowired()
		 * @generated
		 */
		EClass AUTOWIRED = eINSTANCE.getAutowired();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ExceptionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__NAME = eINSTANCE.getException_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EntityImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__TABLE = eINSTANCE.getEntity_Table();

		/**
		 * The meta object literal for the '<em><b>Namednativequery</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__NAMEDNATIVEQUERY = eINSTANCE.getEntity_Namednativequery();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Table_sImpl <em>Table s</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Table_sImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTable_s()
		 * @generated
		 */
		EClass TABLE_S = eINSTANCE.getTable_s();

		/**
		 * The meta object literal for the '<em><b>Column s</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_S__COLUMN_S = eINSTANCE.getTable_s_Column_s();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_S__NAME = eINSTANCE.getTable_s_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_S__ID = eINSTANCE.getTable_s_Id();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.IdImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '<em><b>Generatedvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID__GENERATEDVALUE = eINSTANCE.getId_Generatedvalue();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Column_pImpl <em>Column p</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Column_pImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getColumn_p()
		 * @generated
		 */
		EClass COLUMN_P = eINSTANCE.getColumn_p();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_P__CONSTRAINT = eINSTANCE.getColumn_p_Constraint();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_P__DATATYPE = eINSTANCE.getColumn_p_Datatype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_P__NAME = eINSTANCE.getColumn_p_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.GeneratedValueImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getGeneratedValue()
		 * @generated
		 */
		EClass GENERATED_VALUE = eINSTANCE.getGeneratedValue();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED_VALUE__STRATEGY = eINSTANCE.getGeneratedValue_Strategy();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.NamedNativeQueryImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getNamedNativeQuery()
		 * @generated
		 */
		EClass NAMED_NATIVE_QUERY = eINSTANCE.getNamedNativeQuery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY__NAME = eINSTANCE.getNamedNativeQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY__QUERY = eINSTANCE.getNamedNativeQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Result Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY__RESULT_CLASS = eINSTANCE.getNamedNativeQuery_ResultClass();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SpecificationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Searchcriteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SEARCHCRITERIA = eINSTANCE.getSpecification_Searchcriteria();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SearchCriteriaImpl <em>Search Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SearchCriteriaImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSearchCriteria()
		 * @generated
		 */
		EClass SEARCH_CRITERIA = eINSTANCE.getSearchCriteria();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PredicateImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__SPECIFICATION = eINSTANCE.getPredicate_Specification();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ConfigurationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BEAN = eINSTANCE.getConfiguration_Bean();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Enablewebsecurity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLEWEBSECURITY = eINSTANCE.getConfiguration_Enablewebsecurity();

		/**
		 * The meta object literal for the '<em><b>Enableresourceserver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLERESOURCESERVER = eINSTANCE.getConfiguration_Enableresourceserver();

		/**
		 * The meta object literal for the '<em><b>Enableauthorizationserver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLEAUTHORIZATIONSERVER = eINSTANCE.getConfiguration_Enableauthorizationserver();

		/**
		 * The meta object literal for the '<em><b>Enableglobalmethodsecurity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLEGLOBALMETHODSECURITY = eINSTANCE.getConfiguration_Enableglobalmethodsecurity();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ComponentImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ORDER = eINSTANCE.getComponent_Order();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Order_sImpl <em>Order s</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Order_sImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOrder_s()
		 * @generated
		 */
		EClass ORDER_S = eINSTANCE.getOrder_s();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EnableAuthorizationServerImpl <em>Enable Authorization Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EnableAuthorizationServerImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableAuthorizationServer()
		 * @generated
		 */
		EClass ENABLE_AUTHORIZATION_SERVER = eINSTANCE.getEnableAuthorizationServer();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EnableResourceServerImpl <em>Enable Resource Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EnableResourceServerImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableResourceServer()
		 * @generated
		 */
		EClass ENABLE_RESOURCE_SERVER = eINSTANCE.getEnableResourceServer();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EnableWebSecurityImpl <em>Enable Web Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EnableWebSecurityImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableWebSecurity()
		 * @generated
		 */
		EClass ENABLE_WEB_SECURITY = eINSTANCE.getEnableWebSecurity();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EnableGlobalMethodSecurityImpl <em>Enable Global Method Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EnableGlobalMethodSecurityImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEnableGlobalMethodSecurity()
		 * @generated
		 */
		EClass ENABLE_GLOBAL_METHOD_SECURITY = eINSTANCE.getEnableGlobalMethodSecurity();

		/**
		 * The meta object literal for the '<em><b>Pre Post Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_GLOBAL_METHOD_SECURITY__PRE_POST_ENABLED = eINSTANCE.getEnableGlobalMethodSecurity_PrePostEnabled();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.BeanImpl <em>Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.BeanImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBean()
		 * @generated
		 */
		EClass BEAN = eINSTANCE.getBean();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PostgreSQLImpl <em>Postgre SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PostgreSQLImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostgreSQL()
		 * @generated
		 */
		EClass POSTGRE_SQL = eINSTANCE.getPostgreSQL();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTGRE_SQL__CLUSTER = eINSTANCE.getPostgreSQL_Cluster();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.QueryImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CLAUSE = eINSTANCE.getQuery_Clause();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ForeignKeyImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__COLUMN = eINSTANCE.getForeignKey_Column();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERENCE = eINSTANCE.getForeignKey_Reference();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.TriggerImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ViewImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Index_pImpl <em>Index p</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Index_pImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getIndex_p()
		 * @generated
		 */
		EClass INDEX_P = eINSTANCE.getIndex_p();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_P__NAME = eINSTANCE.getIndex_p_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Table_pImpl <em>Table p</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Table_pImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getTable_p()
		 * @generated
		 */
		EClass TABLE_P = eINSTANCE.getTable_p();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_P__COLUMN = eINSTANCE.getTable_p_Column();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_P__ROW = eINSTANCE.getTable_p_Row();

		/**
		 * The meta object literal for the '<em><b>Foreignkey</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_P__FOREIGNKEY = eINSTANCE.getTable_p_Foreignkey();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_P__PRIMARY_KEY = eINSTANCE.getTable_p_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Inherit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_P__INHERIT = eINSTANCE.getTable_p_Inherit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_P__NAME = eINSTANCE.getTable_p_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Function_pImpl <em>Function p</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Function_pImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFunction_p()
		 * @generated
		 */
		EClass FUNCTION_P = eINSTANCE.getFunction_p();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_P__NAME = eINSTANCE.getFunction_p_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DatabaseImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__SCHEME = eINSTANCE.getDatabase_Scheme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SchemeImpl <em>Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SchemeImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getScheme()
		 * @generated
		 */
		EClass SCHEME = eINSTANCE.getScheme();

		/**
		 * The meta object literal for the '<em><b>Table postgresql</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__TABLE_POSTGRESQL = eINSTANCE.getScheme_Table_postgresql();

		/**
		 * The meta object literal for the '<em><b>View postgresql</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__VIEW_POSTGRESQL = eINSTANCE.getScheme_View_postgresql();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__INDEX = eINSTANCE.getScheme_Index();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__TRIGGER = eINSTANCE.getScheme_Trigger();

		/**
		 * The meta object literal for the '<em><b>Storedprocedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__STOREDPROCEDURE = eINSTANCE.getScheme_Storedprocedure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEME__NAME = eINSTANCE.getScheme_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.User_pImpl <em>User p</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.User_pImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUser_p()
		 * @generated
		 */
		EClass USER_P = eINSTANCE.getUser_p();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_P__EXECUTE = eINSTANCE.getUser_p_Execute();

		/**
		 * The meta object literal for the '<em><b>Privilege</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_P__PRIVILEGE = eINSTANCE.getUser_p_Privilege();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_P__USERNAME = eINSTANCE.getUser_p_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_P__PASSWORD = eINSTANCE.getUser_p_Password();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ClusterImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__DATABASE = eINSTANCE.getCluster_Database();

		/**
		 * The meta object literal for the '<em><b>User p</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__USER_P = eINSTANCE.getCluster_User_p();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RowImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__NAME = eINSTANCE.getRow_Name();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__POLICY = eINSTANCE.getRow_Policy();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ColumnImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__DATATYPE = eINSTANCE.getColumn_Datatype();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CONSTRAINT = eINSTANCE.getColumn_Constraint();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DataTypeImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ConstraintImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PrivilegeImpl <em>Privilege</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PrivilegeImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPrivilege()
		 * @generated
		 */
		EClass PRIVILEGE = eINSTANCE.getPrivilege();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PolicyImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ClauseImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__KEYWORD = eINSTANCE.getClause_Keyword();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.IndexImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Column_sImpl <em>Column s</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Column_sImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getColumn_s()
		 * @generated
		 */
		EClass COLUMN_S = eINSTANCE.getColumn_s();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_S__NAME = eINSTANCE.getColumn_s_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_S__NULLABLE = eINSTANCE.getColumn_s_Nullable();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.User_dImpl <em>User d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.User_dImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUser_d()
		 * @generated
		 */
		EClass USER_D = eINSTANCE.getUser_d();

		/**
		 * The meta object literal for the '<em><b>First name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_D__FIRST_NAME = eINSTANCE.getUser_d_First_name();

		/**
		 * The meta object literal for the '<em><b>Last name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_D__LAST_NAME = eINSTANCE.getUser_d_Last_name();

		/**
		 * The meta object literal for the '<em><b>Profile description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_D__PROFILE_DESCRIPTION = eINSTANCE.getUser_d_Profile_description();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_D__USERNAME = eINSTANCE.getUser_d_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_D__PASSWORD = eINSTANCE.getUser_d_Password();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_D__EMAIL = eINSTANCE.getUser_d_Email();

		/**
		 * The meta object literal for the '<em><b>Functionalities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_D__FUNCTIONALITIES = eINSTANCE.getUser_d_Functionalities();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AppAccessImpl <em>App Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AppAccessImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAppAccess()
		 * @generated
		 */
		EClass APP_ACCESS = eINSTANCE.getAppAccess();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ProfileManagementImpl <em>Profile Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ProfileManagementImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getProfileManagement()
		 * @generated
		 */
		EClass PROFILE_MANAGEMENT = eINSTANCE.getProfileManagement();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AlbumManagementImpl <em>Album Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AlbumManagementImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAlbumManagement()
		 * @generated
		 */
		EClass ALBUM_MANAGEMENT = eINSTANCE.getAlbumManagement();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PhotoActionsImpl <em>Photo Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PhotoActionsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPhotoActions()
		 * @generated
		 */
		EClass PHOTO_ACTIONS = eINSTANCE.getPhotoActions();

		/**
		 * The meta object literal for the '<em><b>Albummanagement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO_ACTIONS__ALBUMMANAGEMENT = eINSTANCE.getPhotoActions_Albummanagement();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PhotoImpl <em>Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PhotoImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPhoto()
		 * @generated
		 */
		EClass PHOTO = eINSTANCE.getPhoto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__NAME = eINSTANCE.getPhoto_Name();

		/**
		 * The meta object literal for the '<em><b>Photoactions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO__PHOTOACTIONS = eINSTANCE.getPhoto_Photoactions();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AlbumImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__URL = eINSTANCE.getAlbum_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__NAME = eINSTANCE.getAlbum_Name();

		/**
		 * The meta object literal for the '<em><b>Albummanagement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__ALBUMMANAGEMENT = eINSTANCE.getAlbum_Albummanagement();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonWebServicesImpl <em>Amazon Web Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonWebServicesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonWebServices()
		 * @generated
		 */
		EClass AMAZON_WEB_SERVICES = eINSTANCE.getAmazonWebServices();

		/**
		 * The meta object literal for the '<em><b>Amazonsimplestorageservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE = eINSTANCE.getAmazonWebServices_Amazonsimplestorageservice();

		/**
		 * The meta object literal for the '<em><b>Amazonelasticcomputecloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD = eINSTANCE.getAmazonWebServices_Amazonelasticcomputecloud();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.NTierImpl <em>NTier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.NTierImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getNTier()
		 * @generated
		 */
		EClass NTIER = eINSTANCE.getNTier();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__CONNECTION = eINSTANCE.getNTier_Connection();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__LAYER = eINSTANCE.getNTier_Layer();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__RELATION = eINSTANCE.getNTier_Relation();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.LayerImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ConnectionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE_LAYER = eINSTANCE.getConnection_SourceLayer();

		/**
		 * The meta object literal for the '<em><b>Target Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET_LAYER = eINSTANCE.getConnection_TargetLayer();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RelationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRelation()
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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RESTImpl <em>REST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RESTImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getREST()
		 * @generated
		 */
		EClass REST = eINSTANCE.getREST();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PostgreSQLConnectionImpl <em>Postgre SQL Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PostgreSQLConnectionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostgreSQLConnection()
		 * @generated
		 */
		EClass POSTGRE_SQL_CONNECTION = eINSTANCE.getPostgreSQLConnection();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_CONNECTION__URL = eINSTANCE.getPostgreSQLConnection_Url();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_CONNECTION__PORT = eINSTANCE.getPostgreSQLConnection_Port();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_CONNECTION__USERNAME = eINSTANCE.getPostgreSQLConnection_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_CONNECTION__PASSWORD = eINSTANCE.getPostgreSQLConnection_Password();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonS3APIImpl <em>Amazon S3API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonS3APIImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonS3API()
		 * @generated
		 */
		EClass AMAZON_S3API = eINSTANCE.getAmazonS3API();

		/**
		 * The meta object literal for the '<em><b>Endpoint Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_S3API__ENDPOINT_URL = eINSTANCE.getAmazonS3API_EndpointUrl();

		/**
		 * The meta object literal for the '<em><b>Access Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_S3API__ACCESS_KEY = eINSTANCE.getAmazonS3API_AccessKey();

		/**
		 * The meta object literal for the '<em><b>Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_S3API__SECRET_KEY = eINSTANCE.getAmazonS3API_SecretKey();

		/**
		 * The meta object literal for the '<em><b>Bucket Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_S3API__BUCKET_NAME = eINSTANCE.getAmazonS3API_BucketName();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PresentationImpl <em>Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PresentationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPresentation()
		 * @generated
		 */
		EClass PRESENTATION = eINSTANCE.getPresentation();

		/**
		 * The meta object literal for the '<em><b>Presentation Layer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION__PRESENTATION_LAYER = eINSTANCE.getPresentation_PresentationLayer();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.BusinessLogicImpl <em>Business Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.BusinessLogicImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBusinessLogic()
		 * @generated
		 */
		EClass BUSINESS_LOGIC = eINSTANCE.getBusinessLogic();

		/**
		 * The meta object literal for the '<em><b>Business Logic Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT = eINSTANCE.getBusinessLogic_BusinessLogicSegment();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DataImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Data Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA_SEGMENT = eINSTANCE.getData_DataSegment();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AllowedToUseImpl <em>Allowed To Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AllowedToUseImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAllowedToUse()
		 * @generated
		 */
		EClass ALLOWED_TO_USE = eINSTANCE.getAllowedToUse();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PresentationSegmentImpl <em>Presentation Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PresentationSegmentImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPresentationSegment()
		 * @generated
		 */
		EClass PRESENTATION_SEGMENT = eINSTANCE.getPresentationSegment();

		/**
		 * The meta object literal for the '<em><b>Segmentstructure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_SEGMENT__SEGMENTSTRUCTURE = eINSTANCE.getPresentationSegment_Segmentstructure();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.BusinessLogicSegmentImpl <em>Business Logic Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.BusinessLogicSegmentImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBusinessLogicSegment()
		 * @generated
		 */
		EClass BUSINESS_LOGIC_SEGMENT = eINSTANCE.getBusinessLogicSegment();

		/**
		 * The meta object literal for the '<em><b>Segmentstructure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_LOGIC_SEGMENT__SEGMENTSTRUCTURE = eINSTANCE.getBusinessLogicSegment_Segmentstructure();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DataSegmentImpl <em>Data Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DataSegmentImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDataSegment()
		 * @generated
		 */
		EClass DATA_SEGMENT = eINSTANCE.getDataSegment();

		/**
		 * The meta object literal for the '<em><b>Segmentstructure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SEGMENT__SEGMENTSTRUCTURE = eINSTANCE.getDataSegment_Segmentstructure();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.View_aImpl <em>View a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.View_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getView_a()
		 * @generated
		 */
		EClass VIEW_A = eINSTANCE.getView_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Component_aImpl <em>Component a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Component_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponent_a()
		 * @generated
		 */
		EClass COMPONENT_A = eINSTANCE.getComponent_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Action_aImpl <em>Action a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Action_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAction_a()
		 * @generated
		 */
		EClass ACTION_A = eINSTANCE.getAction_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Controller_aImpl <em>Controller a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Controller_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getController_a()
		 * @generated
		 */
		EClass CONTROLLER_A = eINSTANCE.getController_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Model_aImpl <em>Model a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Model_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getModel_a()
		 * @generated
		 */
		EClass MODEL_A = eINSTANCE.getModel_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Repository_aImpl <em>Repository a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Repository_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRepository_a()
		 * @generated
		 */
		EClass REPOSITORY_A = eINSTANCE.getRepository_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Security_aImpl <em>Security a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Security_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSecurity_a()
		 * @generated
		 */
		EClass SECURITY_A = eINSTANCE.getSecurity_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PostgreSQL_aImpl <em>Postgre SQL a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PostgreSQL_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostgreSQL_a()
		 * @generated
		 */
		EClass POSTGRE_SQL_A = eINSTANCE.getPostgreSQL_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonS3StorageImpl <em>Amazon S3 Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonS3StorageImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonS3Storage()
		 * @generated
		 */
		EClass AMAZON_S3_STORAGE = eINSTANCE.getAmazonS3Storage();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ModulesImpl <em>Modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ModulesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getModules()
		 * @generated
		 */
		EClass MODULES = eINSTANCE.getModules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULES__NAME = eINSTANCE.getModules_Name();

		/**
		 * The meta object literal for the '<em><b>Reactconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__REACTCONFIGURATION = eINSTANCE.getModules_Reactconfiguration();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__COMPONENTS = eINSTANCE.getModules_Components();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__ACTIONS = eINSTANCE.getModules_Actions();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__LIBRARIES = eINSTANCE.getModules_Libraries();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__INFORMATION = eINSTANCE.getModules_Information();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ComponentsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponents()
		 * @generated
		 */
		EClass COMPONENTS = eINSTANCE.getComponents();

		/**
		 * The meta object literal for the '<em><b>Reactclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__REACTCLASSES = eINSTANCE.getComponents_Reactclasses();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__MODULES = eINSTANCE.getComponents_Modules();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ReactFunctionsImpl <em>React Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ReactFunctionsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactFunctions()
		 * @generated
		 */
		EClass REACT_FUNCTIONS = eINSTANCE.getReactFunctions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FUNCTIONS__NAME = eINSTANCE.getReactFunctions_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RenderImpl <em>Render</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RenderImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRender()
		 * @generated
		 */
		EClass RENDER = eINSTANCE.getRender();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ConstructorImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.LifeCycleImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLifeCycle()
		 * @generated
		 */
		EClass LIFE_CYCLE = eINSTANCE.getLifeCycle();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl <em>Amazon Simple Storage Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonSimpleStorageService()
		 * @generated
		 */
		EClass AMAZON_SIMPLE_STORAGE_SERVICE = eINSTANCE.getAmazonSimpleStorageService();

		/**
		 * The meta object literal for the '<em><b>Bucket</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET = eINSTANCE.getAmazonSimpleStorageService_Bucket();

		/**
		 * The meta object literal for the '<em><b>Batchoperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION = eINSTANCE.getAmazonSimpleStorageService_Batchoperation();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.BucketImpl <em>Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.BucketImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBucket()
		 * @generated
		 */
		EClass BUCKET = eINSTANCE.getBucket();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUCKET__NAME = eINSTANCE.getBucket_Name();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUCKET__ACCESS = eINSTANCE.getBucket_Access();

		/**
		 * The meta object literal for the '<em><b>File a</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUCKET__FILE_A = eINSTANCE.getBucket_File_a();

		/**
		 * The meta object literal for the '<em><b>Folder a</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUCKET__FOLDER_A = eINSTANCE.getBucket_Folder_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.BatchOperationImpl <em>Batch Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.BatchOperationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBatchOperation()
		 * @generated
		 */
		EClass BATCH_OPERATION = eINSTANCE.getBatchOperation();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AccessImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PublicImpl <em>Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PublicImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPublic()
		 * @generated
		 */
		EClass PUBLIC = eINSTANCE.getPublic();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ObjectsPublicImpl <em>Objects Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ObjectsPublicImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getObjectsPublic()
		 * @generated
		 */
		EClass OBJECTS_PUBLIC = eINSTANCE.getObjectsPublic();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.BucketObjectsNotPublicImpl <em>Bucket Objects Not Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.BucketObjectsNotPublicImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBucketObjectsNotPublic()
		 * @generated
		 */
		EClass BUCKET_OBJECTS_NOT_PUBLIC = eINSTANCE.getBucketObjectsNotPublic();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.OnlyAuthorizedImpl <em>Only Authorized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.OnlyAuthorizedImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOnlyAuthorized()
		 * @generated
		 */
		EClass ONLY_AUTHORIZED = eINSTANCE.getOnlyAuthorized();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.File_aImpl <em>File a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.File_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFile_a()
		 * @generated
		 */
		EClass FILE_A = eINSTANCE.getFile_a();

		/**
		 * The meta object literal for the '<em><b>Onwer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_A__ONWER = eINSTANCE.getFile_a_Onwer();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_A__SIZE = eINSTANCE.getFile_a_Size();

		/**
		 * The meta object literal for the '<em><b>Object URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_A__OBJECT_URL = eINSTANCE.getFile_a_ObjectURL();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_A__METADATA = eINSTANCE.getFile_a_Metadata();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Folder_aImpl <em>Folder a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Folder_aImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFolder_a()
		 * @generated
		 */
		EClass FOLDER_A = eINSTANCE.getFolder_a();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER_A__NAME = eINSTANCE.getFolder_a_Name();

		/**
		 * The meta object literal for the '<em><b>File a</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_A__FILE_A = eINSTANCE.getFolder_a_File_a();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.MetaDataImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ReactConfigurationImpl <em>React Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ReactConfigurationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactConfiguration()
		 * @generated
		 */
		EClass REACT_CONFIGURATION = eINSTANCE.getReactConfiguration();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ReactDOMImpl <em>React DOM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ReactDOMImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactDOM()
		 * @generated
		 */
		EClass REACT_DOM = eINSTANCE.getReactDOM();

		/**
		 * The meta object literal for the '<em><b>Is Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_DOM__IS_ROUTE = eINSTANCE.getReactDOM_IsRoute();

		/**
		 * The meta object literal for the '<em><b>Is Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_DOM__IS_CONSTANT = eINSTANCE.getReactDOM_IsConstant();

		/**
		 * The meta object literal for the '<em><b>Is Struct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_DOM__IS_STRUCT = eINSTANCE.getReactDOM_IsStruct();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DependenciesImpl <em>Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DependenciesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDependencies()
		 * @generated
		 */
		EClass DEPENDENCIES = eINSTANCE.getDependencies();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.LogicImpl <em>Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.LogicImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLogic()
		 * @generated
		 */
		EClass LOGIC = eINSTANCE.getLogic();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.UIImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ReactClassesImpl <em>React Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ReactClassesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactClasses()
		 * @generated
		 */
		EClass REACT_CLASSES = eINSTANCE.getReactClasses();

		/**
		 * The meta object literal for the '<em><b>Reactfunctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_CLASSES__REACTFUNCTIONS = eINSTANCE.getReactClasses_Reactfunctions();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_CLASSES__PROPS = eINSTANCE.getReactClasses_Props();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_CLASSES__STATE = eINSTANCE.getReactClasses_State();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CoreFunctionsImpl <em>Core Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CoreFunctionsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCoreFunctions()
		 * @generated
		 */
		EClass CORE_FUNCTIONS = eINSTANCE.getCoreFunctions();

		/**
		 * The meta object literal for the '<em><b>Corefunctions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_FUNCTIONS__COREFUNCTIONS = eINSTANCE.getCoreFunctions_Corefunctions();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RouterImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.StructureImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ViewComponentsImpl <em>View Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ViewComponentsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getViewComponents()
		 * @generated
		 */
		EClass VIEW_COMPONENTS = eINSTANCE.getViewComponents();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SubcomponentsImpl <em>Subcomponents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SubcomponentsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSubcomponents()
		 * @generated
		 */
		EClass SUBCOMPONENTS = eINSTANCE.getSubcomponents();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ActionsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RequestImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ServicesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES__REQUEST = eINSTANCE.getServices_Request();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.LibrariesImpl <em>Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.LibrariesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLibraries()
		 * @generated
		 */
		EClass LIBRARIES = eINSTANCE.getLibraries();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARIES__TYPE = eINSTANCE.getLibraries_Type();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PropsImpl <em>Props</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PropsImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getProps()
		 * @generated
		 */
		EClass PROPS = eINSTANCE.getProps();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPS__TYPE = eINSTANCE.getProps_Type();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPS__DATA_TYPE = eINSTANCE.getProps_DataType();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.StateImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ACTIVE = eINSTANCE.getState_Active();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.InformationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__FILE_TYPE = eINSTANCE.getInformation_FileType();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EntitiesImpl <em>Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EntitiesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEntities()
		 * @generated
		 */
		EClass ENTITIES = eINSTANCE.getEntities();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITIES__ID = eINSTANCE.getEntities_Id();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.FunctionalitiesImpl <em>Functionalities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.FunctionalitiesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFunctionalities()
		 * @generated
		 */
		EClass FUNCTIONALITIES = eINSTANCE.getFunctionalities();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITIES__ID = eINSTANCE.getFunctionalities_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITIES__NAME = eINSTANCE.getFunctionalities_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SegmentStructureImpl <em>Segment Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SegmentStructureImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentStructure()
		 * @generated
		 */
		EClass SEGMENT_STRUCTURE = eINSTANCE.getSegmentStructure();

		/**
		 * The meta object literal for the '<em><b>Directories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_STRUCTURE__DIRECTORIES = eINSTANCE.getSegmentStructure_Directories();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_STRUCTURE__FILES = eINSTANCE.getSegmentStructure_Files();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_STRUCTURE__NAME = eINSTANCE.getSegmentStructure_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DirectoriesImpl <em>Directories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DirectoriesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDirectories()
		 * @generated
		 */
		EClass DIRECTORIES = eINSTANCE.getDirectories();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORIES__FILES = eINSTANCE.getDirectories_Files();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.FilesImpl <em>Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.FilesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFiles()
		 * @generated
		 */
		EClass FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILES__TYPE = eINSTANCE.getFiles_Type();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILES__EXTENSION = eINSTANCE.getFiles_Extension();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonElasticComputeCloudImpl <em>Amazon Elastic Compute Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonElasticComputeCloudImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonElasticComputeCloud()
		 * @generated
		 */
		EClass AMAZON_ELASTIC_COMPUTE_CLOUD = eINSTANCE.getAmazonElasticComputeCloud();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AssociationImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PathVariableImpl <em>Path Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PathVariableImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPathVariable()
		 * @generated
		 */
		EClass PATH_VARIABLE = eINSTANCE.getPathVariable();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_VARIABLE__DATA_TYPE = eINSTANCE.getPathVariable_DataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_VARIABLE__VALUE = eINSTANCE.getPathVariable_Value();

	}

} //PhotosMetaModelPackage
