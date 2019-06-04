/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Technology#getSpring <em>Spring</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getPostgresql <em>Postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getReact <em>React</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getAmazonwebservices <em>Amazonwebservices</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology()
 * @model
 * @generated
 */
public interface Technology extends EObject {
	/**
	 * Returns the value of the '<em><b>Spring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring</em>' containment reference.
	 * @see #setSpring(Spring)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Spring()
	 * @model containment="true"
	 * @generated
	 */
	Spring getSpring();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getSpring <em>Spring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring</em>' containment reference.
	 * @see #getSpring()
	 * @generated
	 */
	void setSpring(Spring value);

	/**
	 * Returns the value of the '<em><b>Postgresql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postgresql</em>' containment reference.
	 * @see #setPostgresql(PostgreSQL)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Postgresql()
	 * @model containment="true"
	 * @generated
	 */
	PostgreSQL getPostgresql();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getPostgresql <em>Postgresql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postgresql</em>' containment reference.
	 * @see #getPostgresql()
	 * @generated
	 */
	void setPostgresql(PostgreSQL value);

	/**
	 * Returns the value of the '<em><b>React</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>React</em>' containment reference.
	 * @see #setReact(React)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_React()
	 * @model containment="true"
	 * @generated
	 */
	React getReact();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getReact <em>React</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>React</em>' containment reference.
	 * @see #getReact()
	 * @generated
	 */
	void setReact(React value);

	/**
	 * Returns the value of the '<em><b>Amazonwebservices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonwebservices</em>' containment reference.
	 * @see #setAmazonwebservices(AmazonWebServices)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Amazonwebservices()
	 * @model containment="true"
	 * @generated
	 */
	AmazonWebServices getAmazonwebservices();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getAmazonwebservices <em>Amazonwebservices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amazonwebservices</em>' containment reference.
	 * @see #getAmazonwebservices()
	 * @generated
	 */
	void setAmazonwebservices(AmazonWebServices value);

} // Technology
