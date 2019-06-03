/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Presentacion#getSegmentopresentacion <em>Segmentopresentacion</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getPresentacion()
 * @model
 * @generated
 */
public interface Presentacion extends Capa {
	/**
	 * Returns the value of the '<em><b>Segmentopresentacion</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.SegmentoPresentacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentopresentacion</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPresentacion_Segmentopresentacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<SegmentoPresentacion> getSegmentopresentacion();

} // Presentacion
