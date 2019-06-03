/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conexion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Conexion#getConexionSource <em>Conexion Source</em>}</li>
 *   <li>{@link PhotosMetaModel.Conexion#getConexionTarget <em>Conexion Target</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getConexion()
 * @model
 * @generated
 */
public interface Conexion extends EObject {
	/**
	 * Returns the value of the '<em><b>Conexion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexion Source</em>' reference.
	 * @see #setConexionSource(Capa)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConexion_ConexionSource()
	 * @model
	 * @generated
	 */
	Capa getConexionSource();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Conexion#getConexionSource <em>Conexion Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conexion Source</em>' reference.
	 * @see #getConexionSource()
	 * @generated
	 */
	void setConexionSource(Capa value);

	/**
	 * Returns the value of the '<em><b>Conexion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexion Target</em>' reference.
	 * @see #setConexionTarget(Capa)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConexion_ConexionTarget()
	 * @model
	 * @generated
	 */
	Capa getConexionTarget();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Conexion#getConexionTarget <em>Conexion Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conexion Target</em>' reference.
	 * @see #getConexionTarget()
	 * @generated
	 */
	void setConexionTarget(Capa value);

} // Conexion
