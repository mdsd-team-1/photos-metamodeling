/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postgre SQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.PostgreSQL#getCluster <em>Cluster</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getPostgreSQL()
 * @model
 * @generated
 */
public interface PostgreSQL extends EObject {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' containment reference.
	 * @see #setCluster(Cluster)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPostgreSQL_Cluster()
	 * @model containment="true"
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.PostgreSQL#getCluster <em>Cluster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' containment reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

} // PostgreSQL
