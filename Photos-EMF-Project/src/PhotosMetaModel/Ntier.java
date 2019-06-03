/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.NTier#getConexion <em>Conexion</em>}</li>
 *   <li>{@link PhotosMetaModel.NTier#getCapa <em>Capa</em>}</li>
 *   <li>{@link PhotosMetaModel.NTier#getRelacion <em>Relacion</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier()
 * @model
 * @generated
 */
public interface NTier extends EObject {
	/**
	 * Returns the value of the '<em><b>Conexion</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Conexion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexion</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier_Conexion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conexion> getConexion();

	/**
	 * Returns the value of the '<em><b>Capa</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Capa}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capa</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier_Capa()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capa> getCapa();

	/**
	 * Returns the value of the '<em><b>Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Relacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier_Relacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacion> getRelacion();

} // NTier
