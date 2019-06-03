/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File a</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.File_a#getOnwer <em>Onwer</em>}</li>
 *   <li>{@link PhotosMetaModel.File_a#getSize <em>Size</em>}</li>
 *   <li>{@link PhotosMetaModel.File_a#getObjectURL <em>Object URL</em>}</li>
 *   <li>{@link PhotosMetaModel.File_a#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getFile_a()
 * @model
 * @generated
 */
public interface File_a extends EObject {
	/**
	 * Returns the value of the '<em><b>Onwer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onwer</em>' attribute.
	 * @see #setOnwer(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFile_a_Onwer()
	 * @model
	 * @generated
	 */
	String getOnwer();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.File_a#getOnwer <em>Onwer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onwer</em>' attribute.
	 * @see #getOnwer()
	 * @generated
	 */
	void setOnwer(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFile_a_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.File_a#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Object URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object URL</em>' attribute.
	 * @see #setObjectURL(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFile_a_ObjectURL()
	 * @model
	 * @generated
	 */
	String getObjectURL();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.File_a#getObjectURL <em>Object URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object URL</em>' attribute.
	 * @see #getObjectURL()
	 * @generated
	 */
	void setObjectURL(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.MetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFile_a_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaData> getMetadata();

} // File_a
