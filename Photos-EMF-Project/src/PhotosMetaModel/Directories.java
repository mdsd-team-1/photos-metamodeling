/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Directories#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getDirectories()
 * @model
 * @generated
 */
public interface Directories extends EObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference.
	 * @see #setFiles(Files)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDirectories_Files()
	 * @model
	 * @generated
	 */
	Files getFiles();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Directories#getFiles <em>Files</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files</em>' reference.
	 * @see #getFiles()
	 * @generated
	 */
	void setFiles(Files value);

} // Directories
