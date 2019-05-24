/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link SystemMetamodel.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link SystemMetamodel.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link SystemMetamodel.Table#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(Column)
	 * @see SystemMetamodel.SystemMetamodelPackage#getTable_PrimaryKey()
	 * @model
	 * @generated
	 */
	Column getPrimaryKey();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Table#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(Column value);

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getTable_ForeignKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignKeys();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SystemMetamodel.SystemMetamodelPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Table
