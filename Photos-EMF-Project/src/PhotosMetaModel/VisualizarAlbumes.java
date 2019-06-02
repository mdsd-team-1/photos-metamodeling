/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualizar Albumes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.VisualizarAlbumes#getVisualizarCategoria <em>Visualizar Categoria</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getVisualizarAlbumes()
 * @model
 * @generated
 */
public interface VisualizarAlbumes extends Acciones {
	/**
	 * Returns the value of the '<em><b>Visualizar Categoria</b></em>' reference list.
	 * The list contents are of type {@link PhotosMetaModel.Categoria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualizar Categoria</em>' reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getVisualizarAlbumes_VisualizarCategoria()
	 * @model required="true"
	 * @generated
	 */
	EList<Categoria> getVisualizarCategoria();

} // VisualizarAlbumes
