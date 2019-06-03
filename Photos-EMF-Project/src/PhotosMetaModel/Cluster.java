/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Cluster#getDatabase <em>Database</em>}</li>
 *   <li>{@link PhotosMetaModel.Cluster#getUser_postgresql <em>User postgresql</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends EObject {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getCluster_Database()
	 * @model containment="true"
	 * @generated
	 */
	EList<Database> getDatabase();

	/**
	 * Returns the value of the '<em><b>User postgresql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User postgresql</em>' reference.
	 * @see #setUser_postgresql(User_p)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getCluster_User_postgresql()
	 * @model
	 * @generated
	 */
	User_p getUser_postgresql();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Cluster#getUser_postgresql <em>User postgresql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User postgresql</em>' reference.
	 * @see #getUser_postgresql()
	 * @generated
	 */
	void setUser_postgresql(User_p value);

} // Cluster
