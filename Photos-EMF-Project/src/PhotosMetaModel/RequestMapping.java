/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.RequestMapping#getRequestpart <em>Requestpart</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping()
 * @model
 * @generated
 */
public interface RequestMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Requestpart</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.RequestPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestpart</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping_Requestpart()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestPart> getRequestpart();

} // RequestMapping
