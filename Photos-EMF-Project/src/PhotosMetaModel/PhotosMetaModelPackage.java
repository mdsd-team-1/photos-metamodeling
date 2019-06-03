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
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__DOMAIN = 2;

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
	 * The feature id for the '<em><b>Usuario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Foto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__FOTO = 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Spring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__SPRING = 0;

	/**
	 * The feature id for the '<em><b>React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__REACT = 1;

	/**
	 * The feature id for the '<em><b>Postgresql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__POSTGRESQL = 2;

	/**
	 * The feature id for the '<em><b>Amazons3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__AMAZONS3 = 3;

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
	 * The feature id for the '<em><b>Springbootapplication</b></em>' reference.
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
	 * The feature id for the '<em><b>Reactdom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__REACTDOM = 0;

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
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Spring Boot Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BOOT_APPLICATION_FEATURE_COUNT = 5;

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
	 * The number of structural features of the '<em>Request Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MAPPING_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Request Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PART_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S__ID = 0;

	/**
	 * The feature id for the '<em><b>Column s</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S__COLUMN_S = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_S__NAME = 2;

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
	 * The feature id for the '<em><b>Generatedvalue</b></em>' reference.
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
	 * The number of structural features of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Enablewebsecurity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLEWEBSECURITY = 1;

	/**
	 * The feature id for the '<em><b>Enableresourceserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLERESOURCESERVER = 2;

	/**
	 * The feature id for the '<em><b>Enableauthorizationserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLEAUTHORIZATIONSERVER = 3;

	/**
	 * The feature id for the '<em><b>Enableglobalmethodsecurity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLEGLOBALMETHODSECURITY = 4;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 5;

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
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Enable Global Method Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_GLOBAL_METHOD_SECURITY_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
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
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Index p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_P_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Function p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_P_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>User postgresql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__USER_POSTGRESQL = 1;

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
	 * The feature id for the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__POLICY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = 1;

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
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.InsertImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 54;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.FromImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 55;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.JoinImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 56;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.LateralImpl <em>Lateral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.LateralImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLateral()
	 * @generated
	 */
	int LATERAL = 57;

	/**
	 * The number of structural features of the '<em>Lateral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lateral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.WhereImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 58;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.GroupByImpl <em>Group By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.GroupByImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getGroupBy()
	 * @generated
	 */
	int GROUP_BY = 59;

	/**
	 * The number of structural features of the '<em>Group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.HavingImpl <em>Having</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.HavingImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getHaving()
	 * @generated
	 */
	int HAVING = 60;

	/**
	 * The number of structural features of the '<em>Having</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVING_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Having</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVING_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SelectImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 61;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DistnctImpl <em>Distnct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DistnctImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDistnct()
	 * @generated
	 */
	int DISTNCT = 62;

	/**
	 * The number of structural features of the '<em>Distnct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTNCT_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distnct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTNCT_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.LimitImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 63;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.OffsetImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 64;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ValuesImpl <em>Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ValuesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getValues()
	 * @generated
	 */
	int VALUES = 65;

	/**
	 * The number of structural features of the '<em>Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AlterImpl <em>Alter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AlterImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAlter()
	 * @generated
	 */
	int ALTER = 66;

	/**
	 * The number of structural features of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DeleteImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 67;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CreateImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 68;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DropImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 69;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.UsingImpl <em>Using</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.UsingImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUsing()
	 * @generated
	 */
	int USING = 70;

	/**
	 * The number of structural features of the '<em>Using</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Using</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.IndexImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 71;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.UpdateImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 72;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ArrayImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 73;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.IntoImpl <em>Into</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.IntoImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getInto()
	 * @generated
	 */
	int INTO = 74;

	/**
	 * The number of structural features of the '<em>Into</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Into</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Column_sImpl <em>Column s</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Column_sImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getColumn_s()
	 * @generated
	 */
	int COLUMN_S = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_S__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_S_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Order_pImpl <em>Order p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Order_pImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOrder_p()
	 * @generated
	 */
	int ORDER_P = 76;

	/**
	 * The number of structural features of the '<em>Order p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_P_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Order p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_P_OPERATION_COUNT = CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.UsuarioImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 77;

	/**
	 * The feature id for the '<em><b>Autenticacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__AUTENTICACION = 0;

	/**
	 * The feature id for the '<em><b>Manejoperfil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__MANEJOPERFIL = 1;

	/**
	 * The feature id for the '<em><b>Foto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__FOTO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID = 3;

	/**
	 * The feature id for the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__LAST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Profile description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PROFILE_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__USERNAME = 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PASSWORD = 8;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__REGISTRO = 10;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AutenticacionImpl <em>Autenticacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AutenticacionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAutenticacion()
	 * @generated
	 */
	int AUTENTICACION = 78;

	/**
	 * The number of structural features of the '<em>Autenticacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Autenticacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RegistroImpl <em>Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RegistroImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRegistro()
	 * @generated
	 */
	int REGISTRO = 79;

	/**
	 * The number of structural features of the '<em>Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ManejoPerfilImpl <em>Manejo Perfil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ManejoPerfilImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getManejoPerfil()
	 * @generated
	 */
	int MANEJO_PERFIL = 80;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANEJO_PERFIL__ACCION = 0;

	/**
	 * The number of structural features of the '<em>Manejo Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANEJO_PERFIL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Manejo Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANEJO_PERFIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AccionImpl <em>Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AccionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAccion()
	 * @generated
	 */
	int ACCION = 81;

	/**
	 * The number of structural features of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.CrearAlbumImpl <em>Crear Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CrearAlbumImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCrearAlbum()
	 * @generated
	 */
	int CREAR_ALBUM = 82;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUM__CATEGORIA = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crear Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUM_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Crear Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUM_OPERATION_COUNT = ACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.VerAlbumImpl <em>Ver Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.VerAlbumImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getVerAlbum()
	 * @generated
	 */
	int VER_ALBUM = 83;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VER_ALBUM__CATEGORIA = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ver Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VER_ALBUM_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ver Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VER_ALBUM_OPERATION_COUNT = ACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.CargarFotoImpl <em>Cargar Foto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CargarFotoImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCargarFoto()
	 * @generated
	 */
	int CARGAR_FOTO = 84;

	/**
	 * The feature id for the '<em><b>Imagen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTO__IMAGEN = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cargar Foto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTO_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cargar Foto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTO_OPERATION_COUNT = ACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.VerTodasLasFotosImpl <em>Ver Todas Las Fotos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.VerTodasLasFotosImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getVerTodasLasFotos()
	 * @generated
	 */
	int VER_TODAS_LAS_FOTOS = 85;

	/**
	 * The number of structural features of the '<em>Ver Todas Las Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VER_TODAS_LAS_FOTOS_FEATURE_COUNT = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ver Todas Las Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VER_TODAS_LAS_FOTOS_OPERATION_COUNT = ACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.EditarPerfilImpl <em>Editar Perfil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EditarPerfilImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEditarPerfil()
	 * @generated
	 */
	int EDITAR_PERFIL = 86;

	/**
	 * The feature id for the '<em><b>Foto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERFIL__FOTO = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Editar Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERFIL_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Editar Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERFIL_OPERATION_COUNT = ACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.FotoImpl <em>Foto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.FotoImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFoto()
	 * @generated
	 */
	int FOTO = 87;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTO__CATEGORIA = 0;

	/**
	 * The feature id for the '<em><b>Imagen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTO__IMAGEN = 1;

	/**
	 * The number of structural features of the '<em>Foto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Foto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.CategoriaImpl <em>Categoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CategoriaImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCategoria()
	 * @generated
	 */
	int CATEGORIA = 88;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__URL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__NAME = 2;

	/**
	 * The number of structural features of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ImagenImpl <em>Imagen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ImagenImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getImagen()
	 * @generated
	 */
	int IMAGEN = 89;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__CATEGORIA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__NAME = 2;

	/**
	 * The number of structural features of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonWebServicesImpl <em>Amazon Web Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonWebServicesImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonWebServices()
	 * @generated
	 */
	int AMAZON_WEB_SERVICES = 90;

	/**
	 * The feature id for the '<em><b>Amazonelasticcomputecloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD = 0;

	/**
	 * The feature id for the '<em><b>Amazonaurora</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES__AMAZONAURORA = 1;

	/**
	 * The feature id for the '<em><b>Amazonsimplestorageservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE = 2;

	/**
	 * The feature id for the '<em><b>Amazondynamodb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES__AMAZONDYNAMODB = 3;

	/**
	 * The feature id for the '<em><b>Amazonsagemaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES__AMAZONSAGEMAKER = 4;

	/**
	 * The number of structural features of the '<em>Amazon Web Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_WEB_SERVICES_FEATURE_COUNT = 5;

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
	int NTIER = 91;

	/**
	 * The feature id for the '<em><b>Conexion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__CONEXION = 0;

	/**
	 * The feature id for the '<em><b>Capa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__CAPA = 1;

	/**
	 * The feature id for the '<em><b>Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__RELACION = 2;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.CapaImpl <em>Capa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CapaImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCapa()
	 * @generated
	 */
	int CAPA = 92;

	/**
	 * The number of structural features of the '<em>Capa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Capa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConexionImpl <em>Conexion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConexionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConexion()
	 * @generated
	 */
	int CONEXION = 93;

	/**
	 * The feature id for the '<em><b>Conexion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION__CONEXION_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Conexion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION__CONEXION_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Conexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RelacionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 94;

	/**
	 * The feature id for the '<em><b>Relacion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__RELACION_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Relacion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__RELACION_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RESTImpl <em>REST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RESTImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getREST()
	 * @generated
	 */
	int REST = 95;

	/**
	 * The feature id for the '<em><b>Conexion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__CONEXION_SOURCE = CONEXION__CONEXION_SOURCE;

	/**
	 * The feature id for the '<em><b>Conexion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__CONEXION_TARGET = CONEXION__CONEXION_TARGET;

	/**
	 * The number of structural features of the '<em>REST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_FEATURE_COUNT = CONEXION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>REST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_COUNT = CONEXION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConexionPostgreSQLImpl <em>Conexion Postgre SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConexionPostgreSQLImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConexionPostgreSQL()
	 * @generated
	 */
	int CONEXION_POSTGRE_SQL = 96;

	/**
	 * The feature id for the '<em><b>Conexion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL__CONEXION_SOURCE = CONEXION__CONEXION_SOURCE;

	/**
	 * The feature id for the '<em><b>Conexion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL__CONEXION_TARGET = CONEXION__CONEXION_TARGET;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL__URL = CONEXION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL__PORT = CONEXION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL__USERNAME = CONEXION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL__PASSWORD = CONEXION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conexion Postgre SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL_FEATURE_COUNT = CONEXION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Conexion Postgre SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_POSTGRE_SQL_OPERATION_COUNT = CONEXION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonS3APIImpl <em>Amazon S3API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonS3APIImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonS3API()
	 * @generated
	 */
	int AMAZON_S3API = 97;

	/**
	 * The feature id for the '<em><b>Conexion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__CONEXION_SOURCE = CONEXION__CONEXION_SOURCE;

	/**
	 * The feature id for the '<em><b>Conexion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__CONEXION_TARGET = CONEXION__CONEXION_TARGET;

	/**
	 * The feature id for the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__ENDPOINT_URL = CONEXION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__ACCESS_KEY = CONEXION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__SECRET_KEY = CONEXION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bucket Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API__BUCKET_NAME = CONEXION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Amazon S3API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API_FEATURE_COUNT = CONEXION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Amazon S3API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3API_OPERATION_COUNT = CONEXION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PresentacionImpl <em>Presentacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PresentacionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPresentacion()
	 * @generated
	 */
	int PRESENTACION = 98;

	/**
	 * The feature id for the '<em><b>Segmentopresentacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTACION__SEGMENTOPRESENTACION = CAPA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTACION_FEATURE_COUNT = CAPA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTACION_OPERATION_COUNT = CAPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.LogicaDeNegocioImpl <em>Logica De Negocio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.LogicaDeNegocioImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLogicaDeNegocio()
	 * @generated
	 */
	int LOGICA_DE_NEGOCIO = 99;

	/**
	 * The feature id for the '<em><b>Segmentologica</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICA_DE_NEGOCIO__SEGMENTOLOGICA = CAPA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logica De Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICA_DE_NEGOCIO_FEATURE_COUNT = CAPA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logica De Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICA_DE_NEGOCIO_OPERATION_COUNT = CAPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.DatosImpl <em>Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DatosImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDatos()
	 * @generated
	 */
	int DATOS = 100;

	/**
	 * The feature id for the '<em><b>Segmentodatos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATOS__SEGMENTODATOS = CAPA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATOS_FEATURE_COUNT = CAPA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATOS_OPERATION_COUNT = CAPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AllowedToUseImpl <em>Allowed To Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AllowedToUseImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAllowedToUse()
	 * @generated
	 */
	int ALLOWED_TO_USE = 101;

	/**
	 * The feature id for the '<em><b>Relacion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE__RELACION_SOURCE = RELACION__RELACION_SOURCE;

	/**
	 * The feature id for the '<em><b>Relacion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE__RELACION_TARGET = RELACION__RELACION_TARGET;

	/**
	 * The number of structural features of the '<em>Allowed To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_FEATURE_COUNT = RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allowed To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TO_USE_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SegmentoPresentacionImpl <em>Segmento Presentacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SegmentoPresentacionImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentoPresentacion()
	 * @generated
	 */
	int SEGMENTO_PRESENTACION = 102;

	/**
	 * The number of structural features of the '<em>Segmento Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTO_PRESENTACION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Segmento Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTO_PRESENTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SegmentoLogicaImpl <em>Segmento Logica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SegmentoLogicaImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentoLogica()
	 * @generated
	 */
	int SEGMENTO_LOGICA = 103;

	/**
	 * The number of structural features of the '<em>Segmento Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTO_LOGICA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Segmento Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTO_LOGICA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SegmentoDatosImpl <em>Segmento Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SegmentoDatosImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentoDatos()
	 * @generated
	 */
	int SEGMENTO_DATOS = 104;

	/**
	 * The number of structural features of the '<em>Segmento Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTO_DATOS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Segmento Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTO_DATOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.View_aImpl <em>View a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.View_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getView_a()
	 * @generated
	 */
	int VIEW_A = 105;

	/**
	 * The number of structural features of the '<em>View a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_A_FEATURE_COUNT = SEGMENTO_PRESENTACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_A_OPERATION_COUNT = SEGMENTO_PRESENTACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Component_aImpl <em>Component a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Component_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponent_a()
	 * @generated
	 */
	int COMPONENT_A = 106;

	/**
	 * The number of structural features of the '<em>Component a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_A_FEATURE_COUNT = SEGMENTO_PRESENTACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_A_OPERATION_COUNT = SEGMENTO_PRESENTACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Action_aImpl <em>Action a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Action_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAction_a()
	 * @generated
	 */
	int ACTION_A = 107;

	/**
	 * The number of structural features of the '<em>Action a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_A_FEATURE_COUNT = SEGMENTO_PRESENTACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_A_OPERATION_COUNT = SEGMENTO_PRESENTACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Controller_aImpl <em>Controller a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Controller_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getController_a()
	 * @generated
	 */
	int CONTROLLER_A = 108;

	/**
	 * The number of structural features of the '<em>Controller a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_A_FEATURE_COUNT = SEGMENTO_LOGICA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Controller a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_A_OPERATION_COUNT = SEGMENTO_LOGICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Model_aImpl <em>Model a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Model_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getModel_a()
	 * @generated
	 */
	int MODEL_A = 109;

	/**
	 * The number of structural features of the '<em>Model a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_A_FEATURE_COUNT = SEGMENTO_LOGICA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_A_OPERATION_COUNT = SEGMENTO_LOGICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Repository_aImpl <em>Repository a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Repository_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRepository_a()
	 * @generated
	 */
	int REPOSITORY_A = 110;

	/**
	 * The number of structural features of the '<em>Repository a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_A_FEATURE_COUNT = SEGMENTO_LOGICA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repository a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_A_OPERATION_COUNT = SEGMENTO_LOGICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Security_aImpl <em>Security a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Security_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSecurity_a()
	 * @generated
	 */
	int SECURITY_A = 111;

	/**
	 * The number of structural features of the '<em>Security a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_A_FEATURE_COUNT = SEGMENTO_LOGICA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_A_OPERATION_COUNT = SEGMENTO_LOGICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PostgreSQL_aImpl <em>Postgre SQL a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PostgreSQL_aImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPostgreSQL_a()
	 * @generated
	 */
	int POSTGRE_SQL_A = 112;

	/**
	 * The number of structural features of the '<em>Postgre SQL a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_A_FEATURE_COUNT = SEGMENTO_DATOS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Postgre SQL a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_A_OPERATION_COUNT = SEGMENTO_DATOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonS3StorageImpl <em>Amazon S3 Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonS3StorageImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonS3Storage()
	 * @generated
	 */
	int AMAZON_S3_STORAGE = 113;

	/**
	 * The number of structural features of the '<em>Amazon S3 Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3_STORAGE_FEATURE_COUNT = SEGMENTO_DATOS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Amazon S3 Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_S3_STORAGE_OPERATION_COUNT = SEGMENTO_DATOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ReactDOMImpl <em>React DOM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ReactDOMImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactDOM()
	 * @generated
	 */
	int REACT_DOM = 114;

	/**
	 * The feature id for the '<em><b>Element r</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM__ELEMENT_R = 0;

	/**
	 * The feature id for the '<em><b>Componet r</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM__COMPONET_R = 1;

	/**
	 * The number of structural features of the '<em>React DOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>React DOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_DOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Element_rImpl <em>Element r</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Element_rImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getElement_r()
	 * @generated
	 */
	int ELEMENT_R = 115;

	/**
	 * The number of structural features of the '<em>Element r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_R_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_R_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Component_rImpl <em>Component r</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Component_rImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponent_r()
	 * @generated
	 */
	int COMPONENT_R = 116;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_R__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_R__PROP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_R__NAME = 2;

	/**
	 * The number of structural features of the '<em>Component r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_R_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_R_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.PropImpl <em>Prop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.PropImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getProp()
	 * @generated
	 */
	int PROP = 117;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Prop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Class_rImpl <em>Class r</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Class_rImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getClass_r()
	 * @generated
	 */
	int CLASS_R = 118;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_R__CHILDREN = COMPONENT_R__CHILDREN;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_R__PROP = COMPONENT_R__PROP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_R__NAME = COMPONENT_R__NAME;

	/**
	 * The feature id for the '<em><b>Function r</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_R__FUNCTION_R = COMPONENT_R_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_R_FEATURE_COUNT = COMPONENT_R_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_R_OPERATION_COUNT = COMPONENT_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.Function_rImpl <em>Function r</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.Function_rImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFunction_r()
	 * @generated
	 */
	int FUNCTION_R = 119;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_R__NAME = 0;

	/**
	 * The number of structural features of the '<em>Function r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_R_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function r</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_R_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RenderImpl <em>Render</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RenderImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRender()
	 * @generated
	 */
	int RENDER = 120;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER__NAME = FUNCTION_R__NAME;

	/**
	 * The number of structural features of the '<em>Render</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER_FEATURE_COUNT = FUNCTION_R_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Render</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER_OPERATION_COUNT = FUNCTION_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConstructorImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 121;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = FUNCTION_R__NAME;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = FUNCTION_R_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = FUNCTION_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ComponentDidMountImpl <em>Component Did Mount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ComponentDidMountImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponentDidMount()
	 * @generated
	 */
	int COMPONENT_DID_MOUNT = 122;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DID_MOUNT__NAME = FUNCTION_R__NAME;

	/**
	 * The number of structural features of the '<em>Component Did Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DID_MOUNT_FEATURE_COUNT = FUNCTION_R_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Did Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DID_MOUNT_OPERATION_COUNT = FUNCTION_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ComponentWillUnmountImpl <em>Component Will Unmount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ComponentWillUnmountImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponentWillUnmount()
	 * @generated
	 */
	int COMPONENT_WILL_UNMOUNT = 123;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_WILL_UNMOUNT__NAME = FUNCTION_R__NAME;

	/**
	 * The number of structural features of the '<em>Component Will Unmount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_WILL_UNMOUNT_FEATURE_COUNT = FUNCTION_R_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Will Unmount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_WILL_UNMOUNT_OPERATION_COUNT = FUNCTION_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonElasticComputeCloudImpl <em>Amazon Elastic Compute Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonElasticComputeCloudImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonElasticComputeCloud()
	 * @generated
	 */
	int AMAZON_ELASTIC_COMPUTE_CLOUD = 124;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl <em>Amazon Simple Storage Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonSimpleStorageService()
	 * @generated
	 */
	int AMAZON_SIMPLE_STORAGE_SERVICE = 125;

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
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonAuroraImpl <em>Amazon Aurora</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonAuroraImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonAurora()
	 * @generated
	 */
	int AMAZON_AURORA = 126;

	/**
	 * The number of structural features of the '<em>Amazon Aurora</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_AURORA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Amazon Aurora</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_AURORA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonDynamoDBImpl <em>Amazon Dynamo DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonDynamoDBImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonDynamoDB()
	 * @generated
	 */
	int AMAZON_DYNAMO_DB = 127;

	/**
	 * The number of structural features of the '<em>Amazon Dynamo DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_DYNAMO_DB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Amazon Dynamo DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_DYNAMO_DB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AmazonSageMakerImpl <em>Amazon Sage Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AmazonSageMakerImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonSageMaker()
	 * @generated
	 */
	int AMAZON_SAGE_MAKER = 128;

	/**
	 * The number of structural features of the '<em>Amazon Sage Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_SAGE_MAKER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Amazon Sage Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_SAGE_MAKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.BucketImpl <em>Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.BucketImpl
	 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getBucket()
	 * @generated
	 */
	int BUCKET = 129;

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
	int BATCH_OPERATION = 130;

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
	int ACCESS = 131;

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
	int PUBLIC = 132;

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
	int OBJECTS_PUBLIC = 133;

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
	int BUCKET_OBJECTS_NOT_PUBLIC = 134;

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
	int ONLY_AUTHORIZED = 135;

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
	int FILE_A = 136;

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
	int FOLDER_A = 137;

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
	int META_DATA = 138;

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
	 * Returns the meta object for class '{@link PhotosMetaModel.SoftGallery <em>Soft Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Gallery</em>'.
	 * @see PhotosMetaModel.SoftGallery
	 * @generated
	 */
	EClass getSoftGallery();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.SoftGallery#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see PhotosMetaModel.SoftGallery#getArchitecture()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Architecture();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.SoftGallery#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Technology</em>'.
	 * @see PhotosMetaModel.SoftGallery#getTechnology()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Technology();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.SoftGallery#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see PhotosMetaModel.SoftGallery#getDomain()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Domain();

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
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Domain#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usuario</em>'.
	 * @see PhotosMetaModel.Domain#getUsuario()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Usuario();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Domain#getFoto <em>Foto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foto</em>'.
	 * @see PhotosMetaModel.Domain#getFoto()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Foto();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Technology#getSpring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spring</em>'.
	 * @see PhotosMetaModel.Technology#getSpring()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Spring();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Technology#getReact <em>React</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>React</em>'.
	 * @see PhotosMetaModel.Technology#getReact()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_React();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Technology#getPostgresql <em>Postgresql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postgresql</em>'.
	 * @see PhotosMetaModel.Technology#getPostgresql()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Postgresql();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Technology#getAmazons3 <em>Amazons3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amazons3</em>'.
	 * @see PhotosMetaModel.Technology#getAmazons3()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Amazons3();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Spring#getSpringbootapplication <em>Springbootapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Springbootapplication</em>'.
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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.React#getReactdom <em>Reactdom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reactdom</em>'.
	 * @see PhotosMetaModel.React#getReactdom()
	 * @see #getReact()
	 * @generated
	 */
	EReference getReact_Reactdom();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Table_s#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see PhotosMetaModel.Table_s#getId()
	 * @see #getTable_s()
	 * @generated
	 */
	EReference getTable_s_Id();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see PhotosMetaModel.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Id#getGeneratedvalue <em>Generatedvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generatedvalue</em>'.
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
	 * Returns the meta object for class '{@link PhotosMetaModel.NamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Query</em>'.
	 * @see PhotosMetaModel.NamedNativeQuery
	 * @generated
	 */
	EClass getNamedNativeQuery();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Configuration#getEnablewebsecurity <em>Enablewebsecurity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enablewebsecurity</em>'.
	 * @see PhotosMetaModel.Configuration#getEnablewebsecurity()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enablewebsecurity();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Configuration#getEnableresourceserver <em>Enableresourceserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enableresourceserver</em>'.
	 * @see PhotosMetaModel.Configuration#getEnableresourceserver()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enableresourceserver();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Configuration#getEnableauthorizationserver <em>Enableauthorizationserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enableauthorizationserver</em>'.
	 * @see PhotosMetaModel.Configuration#getEnableauthorizationserver()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Enableauthorizationserver();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Configuration#getEnableglobalmethodsecurity <em>Enableglobalmethodsecurity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enableglobalmethodsecurity</em>'.
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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.PostgreSQL#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
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
	 * Returns the meta object for class '{@link PhotosMetaModel.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see PhotosMetaModel.View
	 * @generated
	 */
	EClass getView();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Cluster#getUser_postgresql <em>User postgresql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User postgresql</em>'.
	 * @see PhotosMetaModel.Cluster#getUser_postgresql()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_User_postgresql();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Row#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Policy</em>'.
	 * @see PhotosMetaModel.Row#getPolicy()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Policy();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see PhotosMetaModel.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see PhotosMetaModel.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see PhotosMetaModel.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Lateral <em>Lateral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lateral</em>'.
	 * @see PhotosMetaModel.Lateral
	 * @generated
	 */
	EClass getLateral();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see PhotosMetaModel.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.GroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group By</em>'.
	 * @see PhotosMetaModel.GroupBy
	 * @generated
	 */
	EClass getGroupBy();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Having <em>Having</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Having</em>'.
	 * @see PhotosMetaModel.Having
	 * @generated
	 */
	EClass getHaving();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see PhotosMetaModel.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Distnct <em>Distnct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distnct</em>'.
	 * @see PhotosMetaModel.Distnct
	 * @generated
	 */
	EClass getDistnct();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see PhotosMetaModel.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see PhotosMetaModel.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values</em>'.
	 * @see PhotosMetaModel.Values
	 * @generated
	 */
	EClass getValues();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alter</em>'.
	 * @see PhotosMetaModel.Alter
	 * @generated
	 */
	EClass getAlter();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see PhotosMetaModel.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see PhotosMetaModel.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see PhotosMetaModel.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Using <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using</em>'.
	 * @see PhotosMetaModel.Using
	 * @generated
	 */
	EClass getUsing();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see PhotosMetaModel.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see PhotosMetaModel.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Into <em>Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Into</em>'.
	 * @see PhotosMetaModel.Into
	 * @generated
	 */
	EClass getInto();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.Order_p <em>Order p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order p</em>'.
	 * @see PhotosMetaModel.Order_p
	 * @generated
	 */
	EClass getOrder_p();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see PhotosMetaModel.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Usuario#getAutenticacion <em>Autenticacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Autenticacion</em>'.
	 * @see PhotosMetaModel.Usuario#getAutenticacion()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Autenticacion();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Usuario#getManejoperfil <em>Manejoperfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manejoperfil</em>'.
	 * @see PhotosMetaModel.Usuario#getManejoperfil()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Manejoperfil();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Usuario#getFoto <em>Foto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foto</em>'.
	 * @see PhotosMetaModel.Usuario#getFoto()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Foto();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Usuario#getId()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Id();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getFirst_name <em>First name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First name</em>'.
	 * @see PhotosMetaModel.Usuario#getFirst_name()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_First_name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getLast_name <em>Last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last name</em>'.
	 * @see PhotosMetaModel.Usuario#getLast_name()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Last_name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getProfile_description <em>Profile description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile description</em>'.
	 * @see PhotosMetaModel.Usuario#getProfile_description()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Profile_description();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see PhotosMetaModel.Usuario#getUsername()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Username();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see PhotosMetaModel.Usuario#getPassword()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Password();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see PhotosMetaModel.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Usuario#getRegistro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registro</em>'.
	 * @see PhotosMetaModel.Usuario#getRegistro()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Registro();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Autenticacion <em>Autenticacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autenticacion</em>'.
	 * @see PhotosMetaModel.Autenticacion
	 * @generated
	 */
	EClass getAutenticacion();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registro</em>'.
	 * @see PhotosMetaModel.Registro
	 * @generated
	 */
	EClass getRegistro();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ManejoPerfil <em>Manejo Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manejo Perfil</em>'.
	 * @see PhotosMetaModel.ManejoPerfil
	 * @generated
	 */
	EClass getManejoPerfil();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.ManejoPerfil#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accion</em>'.
	 * @see PhotosMetaModel.ManejoPerfil#getAccion()
	 * @see #getManejoPerfil()
	 * @generated
	 */
	EReference getManejoPerfil_Accion();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accion</em>'.
	 * @see PhotosMetaModel.Accion
	 * @generated
	 */
	EClass getAccion();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.CrearAlbum <em>Crear Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crear Album</em>'.
	 * @see PhotosMetaModel.CrearAlbum
	 * @generated
	 */
	EClass getCrearAlbum();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.CrearAlbum#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categoria</em>'.
	 * @see PhotosMetaModel.CrearAlbum#getCategoria()
	 * @see #getCrearAlbum()
	 * @generated
	 */
	EReference getCrearAlbum_Categoria();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.VerAlbum <em>Ver Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ver Album</em>'.
	 * @see PhotosMetaModel.VerAlbum
	 * @generated
	 */
	EClass getVerAlbum();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.VerAlbum#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categoria</em>'.
	 * @see PhotosMetaModel.VerAlbum#getCategoria()
	 * @see #getVerAlbum()
	 * @generated
	 */
	EReference getVerAlbum_Categoria();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.CargarFoto <em>Cargar Foto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cargar Foto</em>'.
	 * @see PhotosMetaModel.CargarFoto
	 * @generated
	 */
	EClass getCargarFoto();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.CargarFoto#getImagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imagen</em>'.
	 * @see PhotosMetaModel.CargarFoto#getImagen()
	 * @see #getCargarFoto()
	 * @generated
	 */
	EReference getCargarFoto_Imagen();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.VerTodasLasFotos <em>Ver Todas Las Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ver Todas Las Fotos</em>'.
	 * @see PhotosMetaModel.VerTodasLasFotos
	 * @generated
	 */
	EClass getVerTodasLasFotos();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.EditarPerfil <em>Editar Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editar Perfil</em>'.
	 * @see PhotosMetaModel.EditarPerfil
	 * @generated
	 */
	EClass getEditarPerfil();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.EditarPerfil#getFoto <em>Foto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foto</em>'.
	 * @see PhotosMetaModel.EditarPerfil#getFoto()
	 * @see #getEditarPerfil()
	 * @generated
	 */
	EReference getEditarPerfil_Foto();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Foto <em>Foto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foto</em>'.
	 * @see PhotosMetaModel.Foto
	 * @generated
	 */
	EClass getFoto();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Foto#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categoria</em>'.
	 * @see PhotosMetaModel.Foto#getCategoria()
	 * @see #getFoto()
	 * @generated
	 */
	EReference getFoto_Categoria();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Foto#getImagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imagen</em>'.
	 * @see PhotosMetaModel.Foto#getImagen()
	 * @see #getFoto()
	 * @generated
	 */
	EReference getFoto_Imagen();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria</em>'.
	 * @see PhotosMetaModel.Categoria
	 * @generated
	 */
	EClass getCategoria();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Categoria#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Categoria#getId()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Id();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Categoria#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see PhotosMetaModel.Categoria#getUrl()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Url();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Categoria#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Categoria#getName()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imagen</em>'.
	 * @see PhotosMetaModel.Imagen
	 * @generated
	 */
	EClass getImagen();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Imagen#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categoria</em>'.
	 * @see PhotosMetaModel.Imagen#getCategoria()
	 * @see #getImagen()
	 * @generated
	 */
	EReference getImagen_Categoria();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Imagen#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Imagen#getId()
	 * @see #getImagen()
	 * @generated
	 */
	EAttribute getImagen_Id();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Imagen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Imagen#getName()
	 * @see #getImagen()
	 * @generated
	 */
	EAttribute getImagen_Name();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.AmazonWebServices#getAmazonaurora <em>Amazonaurora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amazonaurora</em>'.
	 * @see PhotosMetaModel.AmazonWebServices#getAmazonaurora()
	 * @see #getAmazonWebServices()
	 * @generated
	 */
	EReference getAmazonWebServices_Amazonaurora();

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
	 * Returns the meta object for the reference '{@link PhotosMetaModel.AmazonWebServices#getAmazondynamodb <em>Amazondynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amazondynamodb</em>'.
	 * @see PhotosMetaModel.AmazonWebServices#getAmazondynamodb()
	 * @see #getAmazonWebServices()
	 * @generated
	 */
	EReference getAmazonWebServices_Amazondynamodb();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.AmazonWebServices#getAmazonsagemaker <em>Amazonsagemaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amazonsagemaker</em>'.
	 * @see PhotosMetaModel.AmazonWebServices#getAmazonsagemaker()
	 * @see #getAmazonWebServices()
	 * @generated
	 */
	EReference getAmazonWebServices_Amazonsagemaker();

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
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.NTier#getConexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conexion</em>'.
	 * @see PhotosMetaModel.NTier#getConexion()
	 * @see #getNTier()
	 * @generated
	 */
	EReference getNTier_Conexion();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.NTier#getCapa <em>Capa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capa</em>'.
	 * @see PhotosMetaModel.NTier#getCapa()
	 * @see #getNTier()
	 * @generated
	 */
	EReference getNTier_Capa();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.NTier#getRelacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relacion</em>'.
	 * @see PhotosMetaModel.NTier#getRelacion()
	 * @see #getNTier()
	 * @generated
	 */
	EReference getNTier_Relacion();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Capa <em>Capa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capa</em>'.
	 * @see PhotosMetaModel.Capa
	 * @generated
	 */
	EClass getCapa();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Conexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conexion</em>'.
	 * @see PhotosMetaModel.Conexion
	 * @generated
	 */
	EClass getConexion();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Conexion#getConexionSource <em>Conexion Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conexion Source</em>'.
	 * @see PhotosMetaModel.Conexion#getConexionSource()
	 * @see #getConexion()
	 * @generated
	 */
	EReference getConexion_ConexionSource();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Conexion#getConexionTarget <em>Conexion Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conexion Target</em>'.
	 * @see PhotosMetaModel.Conexion#getConexionTarget()
	 * @see #getConexion()
	 * @generated
	 */
	EReference getConexion_ConexionTarget();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see PhotosMetaModel.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Relacion#getRelacionSource <em>Relacion Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion Source</em>'.
	 * @see PhotosMetaModel.Relacion#getRelacionSource()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_RelacionSource();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Relacion#getRelacionTarget <em>Relacion Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion Target</em>'.
	 * @see PhotosMetaModel.Relacion#getRelacionTarget()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_RelacionTarget();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.ConexionPostgreSQL <em>Conexion Postgre SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conexion Postgre SQL</em>'.
	 * @see PhotosMetaModel.ConexionPostgreSQL
	 * @generated
	 */
	EClass getConexionPostgreSQL();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ConexionPostgreSQL#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see PhotosMetaModel.ConexionPostgreSQL#getUrl()
	 * @see #getConexionPostgreSQL()
	 * @generated
	 */
	EAttribute getConexionPostgreSQL_Url();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ConexionPostgreSQL#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see PhotosMetaModel.ConexionPostgreSQL#getPort()
	 * @see #getConexionPostgreSQL()
	 * @generated
	 */
	EAttribute getConexionPostgreSQL_Port();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ConexionPostgreSQL#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see PhotosMetaModel.ConexionPostgreSQL#getUsername()
	 * @see #getConexionPostgreSQL()
	 * @generated
	 */
	EAttribute getConexionPostgreSQL_Username();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.ConexionPostgreSQL#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see PhotosMetaModel.ConexionPostgreSQL#getPassword()
	 * @see #getConexionPostgreSQL()
	 * @generated
	 */
	EAttribute getConexionPostgreSQL_Password();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.Presentacion <em>Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentacion</em>'.
	 * @see PhotosMetaModel.Presentacion
	 * @generated
	 */
	EClass getPresentacion();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Presentacion#getSegmentopresentacion <em>Segmentopresentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segmentopresentacion</em>'.
	 * @see PhotosMetaModel.Presentacion#getSegmentopresentacion()
	 * @see #getPresentacion()
	 * @generated
	 */
	EReference getPresentacion_Segmentopresentacion();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.LogicaDeNegocio <em>Logica De Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logica De Negocio</em>'.
	 * @see PhotosMetaModel.LogicaDeNegocio
	 * @generated
	 */
	EClass getLogicaDeNegocio();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.LogicaDeNegocio#getSegmentologica <em>Segmentologica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segmentologica</em>'.
	 * @see PhotosMetaModel.LogicaDeNegocio#getSegmentologica()
	 * @see #getLogicaDeNegocio()
	 * @generated
	 */
	EReference getLogicaDeNegocio_Segmentologica();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Datos <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datos</em>'.
	 * @see PhotosMetaModel.Datos
	 * @generated
	 */
	EClass getDatos();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Datos#getSegmentodatos <em>Segmentodatos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segmentodatos</em>'.
	 * @see PhotosMetaModel.Datos#getSegmentodatos()
	 * @see #getDatos()
	 * @generated
	 */
	EReference getDatos_Segmentodatos();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.SegmentoPresentacion <em>Segmento Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segmento Presentacion</em>'.
	 * @see PhotosMetaModel.SegmentoPresentacion
	 * @generated
	 */
	EClass getSegmentoPresentacion();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.SegmentoLogica <em>Segmento Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segmento Logica</em>'.
	 * @see PhotosMetaModel.SegmentoLogica
	 * @generated
	 */
	EClass getSegmentoLogica();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.SegmentoDatos <em>Segmento Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segmento Datos</em>'.
	 * @see PhotosMetaModel.SegmentoDatos
	 * @generated
	 */
	EClass getSegmentoDatos();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.ReactDOM <em>React DOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React DOM</em>'.
	 * @see PhotosMetaModel.ReactDOM
	 * @generated
	 */
	EClass getReactDOM();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.ReactDOM#getElement_r <em>Element r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element r</em>'.
	 * @see PhotosMetaModel.ReactDOM#getElement_r()
	 * @see #getReactDOM()
	 * @generated
	 */
	EReference getReactDOM_Element_r();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.ReactDOM#getComponet_r <em>Componet r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componet r</em>'.
	 * @see PhotosMetaModel.ReactDOM#getComponet_r()
	 * @see #getReactDOM()
	 * @generated
	 */
	EReference getReactDOM_Componet_r();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Element_r <em>Element r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element r</em>'.
	 * @see PhotosMetaModel.Element_r
	 * @generated
	 */
	EClass getElement_r();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Component_r <em>Component r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component r</em>'.
	 * @see PhotosMetaModel.Component_r
	 * @generated
	 */
	EClass getComponent_r();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Component_r#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see PhotosMetaModel.Component_r#getChildren()
	 * @see #getComponent_r()
	 * @generated
	 */
	EReference getComponent_r_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Component_r#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see PhotosMetaModel.Component_r#getProp()
	 * @see #getComponent_r()
	 * @generated
	 */
	EReference getComponent_r_Prop();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Component_r#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Component_r#getName()
	 * @see #getComponent_r()
	 * @generated
	 */
	EAttribute getComponent_r_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Prop <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prop</em>'.
	 * @see PhotosMetaModel.Prop
	 * @generated
	 */
	EClass getProp();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Prop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Prop#getName()
	 * @see #getProp()
	 * @generated
	 */
	EAttribute getProp_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Class_r <em>Class r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class r</em>'.
	 * @see PhotosMetaModel.Class_r
	 * @generated
	 */
	EClass getClass_r();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Class_r#getFunction_r <em>Function r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function r</em>'.
	 * @see PhotosMetaModel.Class_r#getFunction_r()
	 * @see #getClass_r()
	 * @generated
	 */
	EReference getClass_r_Function_r();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Function_r <em>Function r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function r</em>'.
	 * @see PhotosMetaModel.Function_r
	 * @generated
	 */
	EClass getFunction_r();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Function_r#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Function_r#getName()
	 * @see #getFunction_r()
	 * @generated
	 */
	EAttribute getFunction_r_Name();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.ComponentDidMount <em>Component Did Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Did Mount</em>'.
	 * @see PhotosMetaModel.ComponentDidMount
	 * @generated
	 */
	EClass getComponentDidMount();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.ComponentWillUnmount <em>Component Will Unmount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Will Unmount</em>'.
	 * @see PhotosMetaModel.ComponentWillUnmount
	 * @generated
	 */
	EClass getComponentWillUnmount();

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
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonAurora <em>Amazon Aurora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Aurora</em>'.
	 * @see PhotosMetaModel.AmazonAurora
	 * @generated
	 */
	EClass getAmazonAurora();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonDynamoDB <em>Amazon Dynamo DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Dynamo DB</em>'.
	 * @see PhotosMetaModel.AmazonDynamoDB
	 * @generated
	 */
	EClass getAmazonDynamoDB();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.AmazonSageMaker <em>Amazon Sage Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Sage Maker</em>'.
	 * @see PhotosMetaModel.AmazonSageMaker
	 * @generated
	 */
	EClass getAmazonSageMaker();

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
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__ARCHITECTURE = eINSTANCE.getSoftGallery_Architecture();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__TECHNOLOGY = eINSTANCE.getSoftGallery_Technology();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__DOMAIN = eINSTANCE.getSoftGallery_Domain();

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
		 * The meta object literal for the '<em><b>Usuario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__USUARIO = eINSTANCE.getDomain_Usuario();

		/**
		 * The meta object literal for the '<em><b>Foto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__FOTO = eINSTANCE.getDomain_Foto();

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
		 * The meta object literal for the '<em><b>Spring</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__SPRING = eINSTANCE.getTechnology_Spring();

		/**
		 * The meta object literal for the '<em><b>React</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__REACT = eINSTANCE.getTechnology_React();

		/**
		 * The meta object literal for the '<em><b>Postgresql</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__POSTGRESQL = eINSTANCE.getTechnology_Postgresql();

		/**
		 * The meta object literal for the '<em><b>Amazons3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__AMAZONS3 = eINSTANCE.getTechnology_Amazons3();

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
		 * The meta object literal for the '<em><b>Springbootapplication</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Reactdom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT__REACTDOM = eINSTANCE.getReact_Reactdom();

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
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_S__ID = eINSTANCE.getTable_s_Id();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.IdImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '<em><b>Generatedvalue</b></em>' reference feature.
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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.NamedNativeQueryImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getNamedNativeQuery()
		 * @generated
		 */
		EClass NAMED_NATIVE_QUERY = eINSTANCE.getNamedNativeQuery();

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
		 * The meta object literal for the '<em><b>Enablewebsecurity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLEWEBSECURITY = eINSTANCE.getConfiguration_Enablewebsecurity();

		/**
		 * The meta object literal for the '<em><b>Enableresourceserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLERESOURCESERVER = eINSTANCE.getConfiguration_Enableresourceserver();

		/**
		 * The meta object literal for the '<em><b>Enableauthorizationserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENABLEAUTHORIZATIONSERVER = eINSTANCE.getConfiguration_Enableauthorizationserver();

		/**
		 * The meta object literal for the '<em><b>Enableglobalmethodsecurity</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ViewImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

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
		 * The meta object literal for the '<em><b>User postgresql</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__USER_POSTGRESQL = eINSTANCE.getCluster_User_postgresql();

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
		 * The meta object literal for the '<em><b>Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__POLICY = eINSTANCE.getRow_Policy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__NAME = eINSTANCE.getRow_Name();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.InsertImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.FromImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.JoinImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.LateralImpl <em>Lateral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.LateralImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLateral()
		 * @generated
		 */
		EClass LATERAL = eINSTANCE.getLateral();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.WhereImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.GroupByImpl <em>Group By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.GroupByImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getGroupBy()
		 * @generated
		 */
		EClass GROUP_BY = eINSTANCE.getGroupBy();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.HavingImpl <em>Having</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.HavingImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getHaving()
		 * @generated
		 */
		EClass HAVING = eINSTANCE.getHaving();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SelectImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DistnctImpl <em>Distnct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DistnctImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDistnct()
		 * @generated
		 */
		EClass DISTNCT = eINSTANCE.getDistnct();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.LimitImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.OffsetImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ValuesImpl <em>Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ValuesImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getValues()
		 * @generated
		 */
		EClass VALUES = eINSTANCE.getValues();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AlterImpl <em>Alter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AlterImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAlter()
		 * @generated
		 */
		EClass ALTER = eINSTANCE.getAlter();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DeleteImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CreateImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DropImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.UsingImpl <em>Using</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.UsingImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUsing()
		 * @generated
		 */
		EClass USING = eINSTANCE.getUsing();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.UpdateImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ArrayImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.IntoImpl <em>Into</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.IntoImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getInto()
		 * @generated
		 */
		EClass INTO = eINSTANCE.getInto();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Order_pImpl <em>Order p</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Order_pImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getOrder_p()
		 * @generated
		 */
		EClass ORDER_P = eINSTANCE.getOrder_p();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.UsuarioImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Autenticacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__AUTENTICACION = eINSTANCE.getUsuario_Autenticacion();

		/**
		 * The meta object literal for the '<em><b>Manejoperfil</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__MANEJOPERFIL = eINSTANCE.getUsuario_Manejoperfil();

		/**
		 * The meta object literal for the '<em><b>Foto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__FOTO = eINSTANCE.getUsuario_Foto();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ID = eINSTANCE.getUsuario_Id();

		/**
		 * The meta object literal for the '<em><b>First name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__FIRST_NAME = eINSTANCE.getUsuario_First_name();

		/**
		 * The meta object literal for the '<em><b>Last name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__LAST_NAME = eINSTANCE.getUsuario_Last_name();

		/**
		 * The meta object literal for the '<em><b>Profile description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PROFILE_DESCRIPTION = eINSTANCE.getUsuario_Profile_description();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__USERNAME = eINSTANCE.getUsuario_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PASSWORD = eINSTANCE.getUsuario_Password();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>Registro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__REGISTRO = eINSTANCE.getUsuario_Registro();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AutenticacionImpl <em>Autenticacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AutenticacionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAutenticacion()
		 * @generated
		 */
		EClass AUTENTICACION = eINSTANCE.getAutenticacion();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RegistroImpl <em>Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RegistroImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRegistro()
		 * @generated
		 */
		EClass REGISTRO = eINSTANCE.getRegistro();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ManejoPerfilImpl <em>Manejo Perfil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ManejoPerfilImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getManejoPerfil()
		 * @generated
		 */
		EClass MANEJO_PERFIL = eINSTANCE.getManejoPerfil();

		/**
		 * The meta object literal for the '<em><b>Accion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANEJO_PERFIL__ACCION = eINSTANCE.getManejoPerfil_Accion();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AccionImpl <em>Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AccionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAccion()
		 * @generated
		 */
		EClass ACCION = eINSTANCE.getAccion();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CrearAlbumImpl <em>Crear Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CrearAlbumImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCrearAlbum()
		 * @generated
		 */
		EClass CREAR_ALBUM = eINSTANCE.getCrearAlbum();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREAR_ALBUM__CATEGORIA = eINSTANCE.getCrearAlbum_Categoria();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.VerAlbumImpl <em>Ver Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.VerAlbumImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getVerAlbum()
		 * @generated
		 */
		EClass VER_ALBUM = eINSTANCE.getVerAlbum();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VER_ALBUM__CATEGORIA = eINSTANCE.getVerAlbum_Categoria();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CargarFotoImpl <em>Cargar Foto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CargarFotoImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCargarFoto()
		 * @generated
		 */
		EClass CARGAR_FOTO = eINSTANCE.getCargarFoto();

		/**
		 * The meta object literal for the '<em><b>Imagen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARGAR_FOTO__IMAGEN = eINSTANCE.getCargarFoto_Imagen();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.VerTodasLasFotosImpl <em>Ver Todas Las Fotos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.VerTodasLasFotosImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getVerTodasLasFotos()
		 * @generated
		 */
		EClass VER_TODAS_LAS_FOTOS = eINSTANCE.getVerTodasLasFotos();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EditarPerfilImpl <em>Editar Perfil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EditarPerfilImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getEditarPerfil()
		 * @generated
		 */
		EClass EDITAR_PERFIL = eINSTANCE.getEditarPerfil();

		/**
		 * The meta object literal for the '<em><b>Foto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITAR_PERFIL__FOTO = eINSTANCE.getEditarPerfil_Foto();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.FotoImpl <em>Foto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.FotoImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFoto()
		 * @generated
		 */
		EClass FOTO = eINSTANCE.getFoto();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOTO__CATEGORIA = eINSTANCE.getFoto_Categoria();

		/**
		 * The meta object literal for the '<em><b>Imagen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOTO__IMAGEN = eINSTANCE.getFoto_Imagen();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CategoriaImpl <em>Categoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CategoriaImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCategoria()
		 * @generated
		 */
		EClass CATEGORIA = eINSTANCE.getCategoria();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__ID = eINSTANCE.getCategoria_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__URL = eINSTANCE.getCategoria_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__NAME = eINSTANCE.getCategoria_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ImagenImpl <em>Imagen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ImagenImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getImagen()
		 * @generated
		 */
		EClass IMAGEN = eINSTANCE.getImagen();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGEN__CATEGORIA = eINSTANCE.getImagen_Categoria();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEN__ID = eINSTANCE.getImagen_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEN__NAME = eINSTANCE.getImagen_Name();

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
		 * The meta object literal for the '<em><b>Amazonelasticcomputecloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD = eINSTANCE.getAmazonWebServices_Amazonelasticcomputecloud();

		/**
		 * The meta object literal for the '<em><b>Amazonaurora</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_WEB_SERVICES__AMAZONAURORA = eINSTANCE.getAmazonWebServices_Amazonaurora();

		/**
		 * The meta object literal for the '<em><b>Amazonsimplestorageservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE = eINSTANCE.getAmazonWebServices_Amazonsimplestorageservice();

		/**
		 * The meta object literal for the '<em><b>Amazondynamodb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_WEB_SERVICES__AMAZONDYNAMODB = eINSTANCE.getAmazonWebServices_Amazondynamodb();

		/**
		 * The meta object literal for the '<em><b>Amazonsagemaker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMAZON_WEB_SERVICES__AMAZONSAGEMAKER = eINSTANCE.getAmazonWebServices_Amazonsagemaker();

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
		 * The meta object literal for the '<em><b>Conexion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__CONEXION = eINSTANCE.getNTier_Conexion();

		/**
		 * The meta object literal for the '<em><b>Capa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__CAPA = eINSTANCE.getNTier_Capa();

		/**
		 * The meta object literal for the '<em><b>Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__RELACION = eINSTANCE.getNTier_Relacion();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CapaImpl <em>Capa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CapaImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getCapa()
		 * @generated
		 */
		EClass CAPA = eINSTANCE.getCapa();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ConexionImpl <em>Conexion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ConexionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConexion()
		 * @generated
		 */
		EClass CONEXION = eINSTANCE.getConexion();

		/**
		 * The meta object literal for the '<em><b>Conexion Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONEXION__CONEXION_SOURCE = eINSTANCE.getConexion_ConexionSource();

		/**
		 * The meta object literal for the '<em><b>Conexion Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONEXION__CONEXION_TARGET = eINSTANCE.getConexion_ConexionTarget();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RelacionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Relacion Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__RELACION_SOURCE = eINSTANCE.getRelacion_RelacionSource();

		/**
		 * The meta object literal for the '<em><b>Relacion Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__RELACION_TARGET = eINSTANCE.getRelacion_RelacionTarget();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ConexionPostgreSQLImpl <em>Conexion Postgre SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ConexionPostgreSQLImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getConexionPostgreSQL()
		 * @generated
		 */
		EClass CONEXION_POSTGRE_SQL = eINSTANCE.getConexionPostgreSQL();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONEXION_POSTGRE_SQL__URL = eINSTANCE.getConexionPostgreSQL_Url();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONEXION_POSTGRE_SQL__PORT = eINSTANCE.getConexionPostgreSQL_Port();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONEXION_POSTGRE_SQL__USERNAME = eINSTANCE.getConexionPostgreSQL_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONEXION_POSTGRE_SQL__PASSWORD = eINSTANCE.getConexionPostgreSQL_Password();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PresentacionImpl <em>Presentacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PresentacionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getPresentacion()
		 * @generated
		 */
		EClass PRESENTACION = eINSTANCE.getPresentacion();

		/**
		 * The meta object literal for the '<em><b>Segmentopresentacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTACION__SEGMENTOPRESENTACION = eINSTANCE.getPresentacion_Segmentopresentacion();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.LogicaDeNegocioImpl <em>Logica De Negocio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.LogicaDeNegocioImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getLogicaDeNegocio()
		 * @generated
		 */
		EClass LOGICA_DE_NEGOCIO = eINSTANCE.getLogicaDeNegocio();

		/**
		 * The meta object literal for the '<em><b>Segmentologica</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICA_DE_NEGOCIO__SEGMENTOLOGICA = eINSTANCE.getLogicaDeNegocio_Segmentologica();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DatosImpl <em>Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DatosImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getDatos()
		 * @generated
		 */
		EClass DATOS = eINSTANCE.getDatos();

		/**
		 * The meta object literal for the '<em><b>Segmentodatos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATOS__SEGMENTODATOS = eINSTANCE.getDatos_Segmentodatos();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SegmentoPresentacionImpl <em>Segmento Presentacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SegmentoPresentacionImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentoPresentacion()
		 * @generated
		 */
		EClass SEGMENTO_PRESENTACION = eINSTANCE.getSegmentoPresentacion();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SegmentoLogicaImpl <em>Segmento Logica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SegmentoLogicaImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentoLogica()
		 * @generated
		 */
		EClass SEGMENTO_LOGICA = eINSTANCE.getSegmentoLogica();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SegmentoDatosImpl <em>Segmento Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SegmentoDatosImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getSegmentoDatos()
		 * @generated
		 */
		EClass SEGMENTO_DATOS = eINSTANCE.getSegmentoDatos();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ReactDOMImpl <em>React DOM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ReactDOMImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getReactDOM()
		 * @generated
		 */
		EClass REACT_DOM = eINSTANCE.getReactDOM();

		/**
		 * The meta object literal for the '<em><b>Element r</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_DOM__ELEMENT_R = eINSTANCE.getReactDOM_Element_r();

		/**
		 * The meta object literal for the '<em><b>Componet r</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_DOM__COMPONET_R = eINSTANCE.getReactDOM_Componet_r();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Element_rImpl <em>Element r</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Element_rImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getElement_r()
		 * @generated
		 */
		EClass ELEMENT_R = eINSTANCE.getElement_r();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Component_rImpl <em>Component r</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Component_rImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponent_r()
		 * @generated
		 */
		EClass COMPONENT_R = eINSTANCE.getComponent_r();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_R__CHILDREN = eINSTANCE.getComponent_r_Children();

		/**
		 * The meta object literal for the '<em><b>Prop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_R__PROP = eINSTANCE.getComponent_r_Prop();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_R__NAME = eINSTANCE.getComponent_r_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.PropImpl <em>Prop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.PropImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getProp()
		 * @generated
		 */
		EClass PROP = eINSTANCE.getProp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROP__NAME = eINSTANCE.getProp_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Class_rImpl <em>Class r</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Class_rImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getClass_r()
		 * @generated
		 */
		EClass CLASS_R = eINSTANCE.getClass_r();

		/**
		 * The meta object literal for the '<em><b>Function r</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_R__FUNCTION_R = eINSTANCE.getClass_r_Function_r();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.Function_rImpl <em>Function r</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.Function_rImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getFunction_r()
		 * @generated
		 */
		EClass FUNCTION_R = eINSTANCE.getFunction_r();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_R__NAME = eINSTANCE.getFunction_r_Name();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ComponentDidMountImpl <em>Component Did Mount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ComponentDidMountImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponentDidMount()
		 * @generated
		 */
		EClass COMPONENT_DID_MOUNT = eINSTANCE.getComponentDidMount();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ComponentWillUnmountImpl <em>Component Will Unmount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ComponentWillUnmountImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getComponentWillUnmount()
		 * @generated
		 */
		EClass COMPONENT_WILL_UNMOUNT = eINSTANCE.getComponentWillUnmount();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonAuroraImpl <em>Amazon Aurora</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonAuroraImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonAurora()
		 * @generated
		 */
		EClass AMAZON_AURORA = eINSTANCE.getAmazonAurora();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonDynamoDBImpl <em>Amazon Dynamo DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonDynamoDBImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonDynamoDB()
		 * @generated
		 */
		EClass AMAZON_DYNAMO_DB = eINSTANCE.getAmazonDynamoDB();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AmazonSageMakerImpl <em>Amazon Sage Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AmazonSageMakerImpl
		 * @see PhotosMetaModel.impl.PhotosMetaModelPackageImpl#getAmazonSageMaker()
		 * @generated
		 */
		EClass AMAZON_SAGE_MAKER = eINSTANCE.getAmazonSageMaker();

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

	}

} //PhotosMetaModelPackage
