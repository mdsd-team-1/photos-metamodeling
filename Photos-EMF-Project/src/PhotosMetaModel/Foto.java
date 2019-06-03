/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Foto#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link PhotosMetaModel.Foto#getImagen <em>Imagen</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getFoto()
 * @model
 * @generated
 */
public interface Foto extends EObject {
	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Categoria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFoto_Categoria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Categoria> getCategoria();

	/**
	 * Returns the value of the '<em><b>Imagen</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Imagen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagen</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getFoto_Imagen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Imagen> getImagen();

} // Foto
