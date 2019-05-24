/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Folder#getFiles <em>Files</em>}</li>
 *   <li>{@link SystemMetamodel.Folder#getContains <em>Contains</em>}</li>
 *   <li>{@link SystemMetamodel.Folder#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends EObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getFolder_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Folder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getFolder_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getContains();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SystemMetamodel.SystemMetamodelPackage#getFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Folder
