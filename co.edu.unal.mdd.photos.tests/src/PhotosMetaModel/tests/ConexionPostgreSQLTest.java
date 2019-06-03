/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.ConexionPostgreSQL;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conexion Postgre SQL</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConexionPostgreSQLTest extends ConexionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConexionPostgreSQLTest.class);
	}

	/**
	 * Constructs a new Conexion Postgre SQL test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConexionPostgreSQLTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conexion Postgre SQL test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConexionPostgreSQL getFixture() {
		return (ConexionPostgreSQL)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createConexionPostgreSQL());
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

} //ConexionPostgreSQLTest
