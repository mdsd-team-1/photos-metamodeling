/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arquitectura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Arquitectura#getNtier <em>Ntier</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getArquitectura()
 * @model
 * @generated
 */
public interface Arquitectura extends EObject {
	/**
	 * Returns the value of the '<em><b>Ntier</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Ntier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ntier</em>' containment reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getArquitectura_Ntier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ntier> getNtier();

} // Arquitectura
