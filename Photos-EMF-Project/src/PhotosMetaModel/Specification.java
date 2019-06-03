/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Specification#getSearchcriteria <em>Searchcriteria</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Searchcriteria</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.SearchCriteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchcriteria</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpecification_Searchcriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<SearchCriteria> getSearchcriteria();

} // Specification
