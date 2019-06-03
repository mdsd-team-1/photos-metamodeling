/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editar Perfil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.EditarPerfil#getFoto <em>Foto</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getEditarPerfil()
 * @model
 * @generated
 */
public interface EditarPerfil extends Accion {
	/**
	 * Returns the value of the '<em><b>Foto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foto</em>' reference.
	 * @see #setFoto(Foto)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getEditarPerfil_Foto()
	 * @model
	 * @generated
	 */
	Foto getFoto();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.EditarPerfil#getFoto <em>Foto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foto</em>' reference.
	 * @see #getFoto()
	 * @generated
	 */
	void setFoto(Foto value);

} // EditarPerfil
