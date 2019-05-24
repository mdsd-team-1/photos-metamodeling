/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Database#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link SystemMetamodel.Database#getName <em>Name</em>}</li>
 *   <li>{@link SystemMetamodel.Database#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getDatabase_Schemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SystemMetamodel.SystemMetamodelPackage#getDatabase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Database#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see SystemMetamodel.SystemMetamodelPackage#getDatabase_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Database#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // Database
