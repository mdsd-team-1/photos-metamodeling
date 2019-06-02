/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargar Fotos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.CargarFotos#getCargarImagen <em>Cargar Imagen</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getCargarFotos()
 * @model
 * @generated
 */
public interface CargarFotos extends Acciones {
	/**
	 * Returns the value of the '<em><b>Cargar Imagen</b></em>' reference list.
	 * The list contents are of type {@link PhotosMetaModel.Imagen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargar Imagen</em>' reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getCargarFotos_CargarImagen()
	 * @model
	 * @generated
	 */
	EList<Imagen> getCargarImagen();

} // CargarFotos
