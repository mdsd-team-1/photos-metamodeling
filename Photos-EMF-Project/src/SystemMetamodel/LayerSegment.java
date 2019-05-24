/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.LayerSegment#getFolders <em>Folders</em>}</li>
 *   <li>{@link SystemMetamodel.LayerSegment#getFiles <em>Files</em>}</li>
 *   <li>{@link SystemMetamodel.LayerSegment#getDatabases <em>Databases</em>}</li>
 *   <li>{@link SystemMetamodel.LayerSegment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getLayerSegment()
 * @model
 * @generated
 */
public interface LayerSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Folder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayerSegment_Folders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getFolders();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayerSegment_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Databases</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databases</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayerSegment_Databases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Database> getDatabases();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayerSegment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SystemMetamodel.LayerSegment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LayerSegment
