/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.NTier#getConnection <em>Connection</em>}</li>
 *   <li>{@link PhotosMetaModel.NTier#getLayer <em>Layer</em>}</li>
 *   <li>{@link PhotosMetaModel.NTier#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier()
 * @model
 * @generated
 */
public interface NTier extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier_Layer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayer();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getNTier_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelation();

} // NTier
