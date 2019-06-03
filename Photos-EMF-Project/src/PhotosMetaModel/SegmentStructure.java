/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.SegmentStructure#getDirectories <em>Directories</em>}</li>
 *   <li>{@link PhotosMetaModel.SegmentStructure#getFiles <em>Files</em>}</li>
 *   <li>{@link PhotosMetaModel.SegmentStructure#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getSegmentStructure()
 * @model
 * @generated
 */
public interface SegmentStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Directories</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Directories}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directories</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSegmentStructure_Directories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Directories> getDirectories();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Files}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSegmentStructure_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<Files> getFiles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSegmentStructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.SegmentStructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SegmentStructure
