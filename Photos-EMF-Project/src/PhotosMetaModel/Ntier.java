/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ntier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Ntier#getCapas <em>Capas</em>}</li>
 *   <li>{@link PhotosMetaModel.Ntier#getRelaciones <em>Relaciones</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getNtier()
 * @model
 * @generated
 */
public interface Ntier extends EObject {
	/**
	 * Returns the value of the '<em><b>Capas</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Capas}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capas</em>' containment reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getNtier_Capas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capas> getCapas();

	/**
	 * Returns the value of the '<em><b>Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Relaciones}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones</em>' containment reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getNtier_Relaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relaciones> getRelaciones();

} // Ntier
