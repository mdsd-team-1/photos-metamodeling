/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table p</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Table_p#getColumn <em>Column</em>}</li>
 *   <li>{@link PhotosMetaModel.Table_p#getRow <em>Row</em>}</li>
 *   <li>{@link PhotosMetaModel.Table_p#getForeignkey <em>Foreignkey</em>}</li>
 *   <li>{@link PhotosMetaModel.Table_p#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link PhotosMetaModel.Table_p#getInherit <em>Inherit</em>}</li>
 *   <li>{@link PhotosMetaModel.Table_p#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_p()
 * @model
 * @generated
 */
public interface Table_p extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Column_p}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_p_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column_p> getColumn();

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_p_Row()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRow();

	/**
	 * Returns the value of the '<em><b>Foreignkey</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreignkey</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_p_Foreignkey()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignkey();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Column_p}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_p_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column_p> getPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Inherit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit</em>' reference.
	 * @see #setInherit(Table_p)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_p_Inherit()
	 * @model
	 * @generated
	 */
	Table_p getInherit();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Table_p#getInherit <em>Inherit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit</em>' reference.
	 * @see #getInherit()
	 * @generated
	 */
	void setInherit(Table_p value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTable_p_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Table_p#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Table_p
