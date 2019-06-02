/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Capas#getConexiones <em>Conexiones</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getCapas()
 * @model
 * @generated
 */
public interface Capas extends EObject {
	/**
	 * Returns the value of the '<em><b>Conexiones</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Conexiones}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexiones</em>' containment reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getCapas_Conexiones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conexiones> getConexiones();

} // Capas
