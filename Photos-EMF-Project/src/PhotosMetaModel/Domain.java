/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Domain#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link PhotosMetaModel.Domain#getFoto <em>Foto</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Usuario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain_Usuario()
	 * @model containment="true"
	 * @generated
	 */
	EList<Usuario> getUsuario();

	/**
	 * Returns the value of the '<em><b>Foto</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Foto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foto</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain_Foto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Foto> getFoto();

} // Domain
