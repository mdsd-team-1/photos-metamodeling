/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manejo Perfil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.ManejoPerfil#getAccion <em>Accion</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getManejoPerfil()
 * @model
 * @generated
 */
public interface ManejoPerfil extends EObject {
	/**
	 * Returns the value of the '<em><b>Accion</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Accion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getManejoPerfil_Accion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Accion> getAccion();

} // ManejoPerfil
