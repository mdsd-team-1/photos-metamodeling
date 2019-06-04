/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Bucket#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.Bucket#getFile_a <em>File a</em>}</li>
 *   <li>{@link PhotosMetaModel.Bucket#getFolder_a <em>Folder a</em>}</li>
 *   <li>{@link PhotosMetaModel.Bucket#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getBucket()
 * @model
 * @generated
 */
public interface Bucket extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getBucket_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Bucket#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File a</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.File_a}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File a</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getBucket_File_a()
	 * @model containment="true"
	 * @generated
	 */
	EList<File_a> getFile_a();

	/**
	 * Returns the value of the '<em><b>Folder a</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Folder_a}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder a</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getBucket_Folder_a()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder_a> getFolder_a();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(Access)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getBucket_Access()
	 * @model containment="true"
	 * @generated
	 */
	Access getAccess();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Bucket#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(Access value);

} // Bucket
