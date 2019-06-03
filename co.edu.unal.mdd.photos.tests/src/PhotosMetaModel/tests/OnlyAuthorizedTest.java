/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.OnlyAuthorized;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Only Authorized</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnlyAuthorizedTest extends AccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnlyAuthorizedTest.class);
	}

	/**
	 * Constructs a new Only Authorized test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlyAuthorizedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Only Authorized test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OnlyAuthorized getFixture() {
		return (OnlyAuthorized)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createOnlyAuthorized());
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

} //OnlyAuthorizedTest
