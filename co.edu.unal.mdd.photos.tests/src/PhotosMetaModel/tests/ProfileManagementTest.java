/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.PhotosMetaModelFactory;
import PhotosMetaModel.ProfileManagement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Profile Management</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileManagementTest extends FunctionalitiesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfileManagementTest.class);
	}

	/**
	 * Constructs a new Profile Management test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileManagementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Profile Management test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProfileManagement getFixture() {
		return (ProfileManagement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createProfileManagement());
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

} //ProfileManagementTest
