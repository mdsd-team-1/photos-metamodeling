/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ver Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.VerAlbum#getCategoria <em>Categoria</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getVerAlbum()
 * @model
 * @generated
 */
public interface VerAlbum extends Accion {
	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' reference.
	 * @see #setCategoria(Categoria)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getVerAlbum_Categoria()
	 * @model
	 * @generated
	 */
	Categoria getCategoria();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.VerAlbum#getCategoria <em>Categoria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria</em>' reference.
	 * @see #getCategoria()
	 * @generated
	 */
	void setCategoria(Categoria value);

} // VerAlbum
