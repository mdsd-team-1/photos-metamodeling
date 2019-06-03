/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Logic Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.BusinessLogicSegment#getSegmentstructure <em>Segmentstructure</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getBusinessLogicSegment()
 * @model
 * @generated
 */
public interface BusinessLogicSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Segmentstructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentstructure</em>' reference.
	 * @see #setSegmentstructure(SegmentStructure)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getBusinessLogicSegment_Segmentstructure()
	 * @model
	 * @generated
	 */
	SegmentStructure getSegmentstructure();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.BusinessLogicSegment#getSegmentstructure <em>Segmentstructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segmentstructure</em>' reference.
	 * @see #getSegmentstructure()
	 * @generated
	 */
	void setSegmentstructure(SegmentStructure value);

} // BusinessLogicSegment
