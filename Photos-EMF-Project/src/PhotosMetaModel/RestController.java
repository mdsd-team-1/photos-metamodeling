/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.RestController#getRequestmapping <em>Requestmapping</em>}</li>
 *   <li>{@link PhotosMetaModel.RestController#getExceptionhandler <em>Exceptionhandler</em>}</li>
 *   <li>{@link PhotosMetaModel.RestController#getAutowired <em>Autowired</em>}</li>
 *   <li>{@link PhotosMetaModel.RestController#getSpecification <em>Specification</em>}</li>
 *   <li>{@link PhotosMetaModel.RestController#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getRestController()
 * @model
 * @generated
 */
public interface RestController extends EObject {
	/**
	 * Returns the value of the '<em><b>Requestmapping</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.RequestMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestmapping</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRestController_Requestmapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestMapping> getRequestmapping();

	/**
	 * Returns the value of the '<em><b>Exceptionhandler</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.ExceptionHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptionhandler</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRestController_Exceptionhandler()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExceptionHandler> getExceptionhandler();

	/**
	 * Returns the value of the '<em><b>Autowired</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Autowired}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autowired</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRestController_Autowired()
	 * @model containment="true"
	 * @generated
	 */
	EList<Autowired> getAutowired();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Specification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRestController_Specification()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specification> getSpecification();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRestController_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.RestController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RestController
