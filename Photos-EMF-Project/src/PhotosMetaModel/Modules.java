/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Modules#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.Modules#getReactconfiguration <em>Reactconfiguration</em>}</li>
 *   <li>{@link PhotosMetaModel.Modules#getComponents <em>Components</em>}</li>
 *   <li>{@link PhotosMetaModel.Modules#getActions <em>Actions</em>}</li>
 *   <li>{@link PhotosMetaModel.Modules#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link PhotosMetaModel.Modules#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getModules()
 * @model
 * @generated
 */
public interface Modules extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getModules_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Modules#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reactconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.ReactConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactconfiguration</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getModules_Reactconfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReactConfiguration> getReactconfiguration();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Components}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getModules_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Components> getComponents();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Actions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getModules_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actions> getActions();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Libraries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getModules_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Libraries> getLibraries();

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getModules_Information()
	 * @model containment="true"
	 * @generated
	 */
	EList<Information> getInformation();

} // Modules
