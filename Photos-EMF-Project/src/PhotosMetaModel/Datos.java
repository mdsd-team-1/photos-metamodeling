/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Datos#getSegmentodatos <em>Segmentodatos</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getDatos()
 * @model
 * @generated
 */
public interface Datos extends Capa {
	/**
	 * Returns the value of the '<em><b>Segmentodatos</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.SegmentoDatos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentodatos</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDatos_Segmentodatos()
	 * @model containment="true"
	 * @generated
	 */
	EList<SegmentoDatos> getSegmentodatos();

} // Datos
