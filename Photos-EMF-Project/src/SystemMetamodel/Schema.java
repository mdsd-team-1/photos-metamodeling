/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Schema#getTables <em>Tables</em>}</li>
 *   <li>{@link SystemMetamodel.Schema#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getSchema_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SystemMetamodel.SystemMetamodelPackage#getSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Schema
