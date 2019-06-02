/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editar Perfil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.EditarPerfil#getEditarPerfil <em>Editar Perfil</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getEditarPerfil()
 * @model
 * @generated
 */
public interface EditarPerfil extends Acciones {
	/**
	 * Returns the value of the '<em><b>Editar Perfil</b></em>' reference list.
	 * The list contents are of type {@link PhotosMetaModel.Fotos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editar Perfil</em>' reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getEditarPerfil_EditarPerfil()
	 * @model
	 * @generated
	 */
	EList<Fotos> getEditarPerfil();

} // EditarPerfil
