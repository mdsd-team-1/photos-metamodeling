/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Data#getDataSegment <em>Data Segment</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Layer {
	/**
	 * Returns the value of the '<em><b>Data Segment</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.DataSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Segment</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getData_DataSegment()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSegment> getDataSegment();

} // Data
