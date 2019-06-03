/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.ForeignKey#getColumn <em>Column</em>}</li>
 *   <li>{@link PhotosMetaModel.ForeignKey#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column_p)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getForeignKey_Column()
	 * @model
	 * @generated
	 */
	Column_p getColumn();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.ForeignKey#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column_p value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Table_p)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getForeignKey_Reference()
	 * @model
	 * @generated
	 */
	Table_p getReference();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.ForeignKey#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Table_p value);

} // ForeignKey
