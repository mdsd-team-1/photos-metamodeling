/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crear Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.CrearAlbum#getCategoria <em>Categoria</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getCrearAlbum()
 * @model
 * @generated
 */
public interface CrearAlbum extends Accion {
	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' reference.
	 * @see #setCategoria(Categoria)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getCrearAlbum_Categoria()
	 * @model
	 * @generated
	 */
	Categoria getCategoria();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.CrearAlbum#getCategoria <em>Categoria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria</em>' reference.
	 * @see #getCategoria()
	 * @generated
	 */
	void setCategoria(Categoria value);

} // CrearAlbum
