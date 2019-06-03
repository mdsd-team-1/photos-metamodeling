/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Entity#getTable <em>Table</em>}</li>
 *   <li>{@link PhotosMetaModel.Entity#getNamednativequery <em>Namednativequery</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Table_s}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getEntity_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table_s> getTable();

	/**
	 * Returns the value of the '<em><b>Namednativequery</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.NamedNativeQuery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namednativequery</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getEntity_Namednativequery()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedNativeQuery> getNamednativequery();

} // Entity
