/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.PhotosMetaModelFactory;
import PhotosMetaModel.User_d;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User d</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class User_dTest extends EntitiesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(User_dTest.class);
	}

	/**
	 * Constructs a new User d test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User_dTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User d test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected User_d getFixture() {
		return (User_d)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createUser_d());
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

} //User_dTest
