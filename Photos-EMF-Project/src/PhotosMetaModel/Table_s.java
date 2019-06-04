/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table s</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Table_s#getColumn_s <em>Column s</em>}</li>
 *   <li>{@link PhotosMetaModel.Table_s#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.Table_s#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_s()
 * @model
 * @generated
 */
public interface Table_s extends EObject {
	/**
	 * Returns the value of the '<em><b>Column s</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Column_s}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column s</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_s_Column_s()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column_s> getColumn_s();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_s_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Table_s#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Id)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_s_Id()
	 * @model containment="true"
	 * @generated
	 */
	Id getId();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Table_s#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Id value);

} // Table_s
