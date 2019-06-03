/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder a</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Folder_a#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.Folder_a#getFile_a <em>File a</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getFolder_a()
 * @model
 * @generated
 */
public interface Folder_a extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFolder_a_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Folder_a#getName <em>Name</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFolder_a_File_a()
	 * @model containment="true"
	 * @generated
	 */
	EList<File_a> getFile_a();

} // Folder_a
