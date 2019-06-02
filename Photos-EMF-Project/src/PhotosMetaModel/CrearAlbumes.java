/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crear Albumes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.CrearAlbumes#getCrearCategoria <em>Crear Categoria</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getCrearAlbumes()
 * @model
 * @generated
 */
public interface CrearAlbumes extends Acciones {
	/**
	 * Returns the value of the '<em><b>Crear Categoria</b></em>' reference list.
	 * The list contents are of type {@link PhotosMetaModel.Categoria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crear Categoria</em>' reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getCrearAlbumes_CrearCategoria()
	 * @model
	 * @generated
	 */
	EList<Categoria> getCrearCategoria();

} // CrearAlbumes
