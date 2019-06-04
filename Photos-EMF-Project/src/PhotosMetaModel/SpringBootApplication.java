/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Boot Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.SpringBootApplication#getRepository <em>Repository</em>}</li>
 *   <li>{@link PhotosMetaModel.SpringBootApplication#getRestcontroller <em>Restcontroller</em>}</li>
 *   <li>{@link PhotosMetaModel.SpringBootApplication#getEntity <em>Entity</em>}</li>
 *   <li>{@link PhotosMetaModel.SpringBootApplication#getComponent <em>Component</em>}</li>
 *   <li>{@link PhotosMetaModel.SpringBootApplication#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link PhotosMetaModel.SpringBootApplication#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpringBootApplication()
 * @model
 * @generated
 */
public interface SpringBootApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpringBootApplication_Repository()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepository();

	/**
	 * Returns the value of the '<em><b>Restcontroller</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.RestController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restcontroller</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpringBootApplication_Restcontroller()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestController> getRestcontroller();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpringBootApplication_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpringBootApplication_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpringBootApplication_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpringBootApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.SpringBootApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SpringBootApplication
