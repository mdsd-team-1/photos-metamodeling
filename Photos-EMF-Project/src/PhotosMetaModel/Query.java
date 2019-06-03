/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Query#getClause <em>Clause</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getQuery_Clause()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clause> getClause();

} // Query
