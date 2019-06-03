/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.PhotosMetaModelFactory;
import PhotosMetaModel.ReactConfiguration;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>React Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactConfigurationTest extends ModulesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReactConfigurationTest.class);
	}

	/**
	 * Constructs a new React Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this React Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReactConfiguration getFixture() {
		return (ReactConfiguration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createReactConfiguration());
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

} //ReactConfigurationTest
