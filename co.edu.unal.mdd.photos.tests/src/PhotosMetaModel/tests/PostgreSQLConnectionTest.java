/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.PhotosMetaModelFactory;
import PhotosMetaModel.PostgreSQLConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Postgre SQL Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PostgreSQLConnectionTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PostgreSQLConnectionTest.class);
	}

	/**
	 * Constructs a new Postgre SQL Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostgreSQLConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Postgre SQL Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PostgreSQLConnection getFixture() {
		return (PostgreSQLConnection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createPostgreSQLConnection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PostgreSQLConnectionTest
