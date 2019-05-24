/**
 */
package SystemMetamodel.tests;

import SystemMetamodel.MediaFile;
import SystemMetamodel.SystemMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Media File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediaFileTest extends FileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MediaFileTest.class);
	}

	/**
	 * Constructs a new Media File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaFileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Media File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MediaFile getFixture() {
		return (MediaFile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemMetamodelFactory.eINSTANCE.createMediaFile());
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

} //MediaFileTest
