/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logica De Negocio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.LogicaDeNegocio#getSegmentologica <em>Segmentologica</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getLogicaDeNegocio()
 * @model
 * @generated
 */
public interface LogicaDeNegocio extends Capa {
	/**
	 * Returns the value of the '<em><b>Segmentologica</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.SegmentoLogica}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentologica</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getLogicaDeNegocio_Segmentologica()
	 * @model containment="true"
	 * @generated
	 */
	EList<SegmentoLogica> getSegmentologica();

} // LogicaDeNegocio
