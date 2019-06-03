/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargar Foto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.CargarFoto#getImagen <em>Imagen</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getCargarFoto()
 * @model
 * @generated
 */
public interface CargarFoto extends Accion {
	/**
	 * Returns the value of the '<em><b>Imagen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagen</em>' reference.
	 * @see #setImagen(Imagen)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getCargarFoto_Imagen()
	 * @model
	 * @generated
	 */
	Imagen getImagen();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.CargarFoto#getImagen <em>Imagen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagen</em>' reference.
	 * @see #getImagen()
	 * @generated
	 */
	void setImagen(Imagen value);

} // CargarFoto
