/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.DataSegment#getSegmentstructure <em>Segmentstructure</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getDataSegment()
 * @model
 * @generated
 */
public interface DataSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentstructure</em>' reference.
	 * @see #setSegmentstructure(SegmentStructure)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDataSegment_Segmentstructure()
	 * @model
	 * @generated
	 */
	SegmentStructure getSegmentstructure();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.DataSegment#getSegmentstructure <em>Segmentstructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segmentstructure</em>' reference.
	 * @see #getSegmentstructure()
	 * @generated
	 */
	void setSegmentstructure(SegmentStructure value);

} // DataSegment
