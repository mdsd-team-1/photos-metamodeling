/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.PhotosMetaModelFactory;
import PhotosMetaModel.ReactDOM;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>React DOM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactDOMTest extends ReactConfigurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReactDOMTest.class);
	}

	/**
	 * Constructs a new React DOM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactDOMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this React DOM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReactDOM getFixture() {
		return (ReactDOM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createReactDOM());
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

} //ReactDOMTest
