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
 *   <li>{@link PhotosMetaModel.Domain#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link PhotosMetaModel.Domain#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Functionalities</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Functionalities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalities</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain_Functionalities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Functionalities> getFunctionalities();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entities> getEntities();

} // Domain
