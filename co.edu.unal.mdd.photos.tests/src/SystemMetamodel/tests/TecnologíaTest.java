/**
 */
package SystemMetamodel.tests;

import SystemMetamodel.SystemMetamodelFactory;
import SystemMetamodel.Tecnología;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tecnología</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TecnologíaTest extends TestCase {

	/**
	 * The fixture for this Tecnología test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tecnología fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TecnologíaTest.class);
	}

	/**
	 * Constructs a new Tecnología test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TecnologíaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tecnología test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tecnología fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tecnología test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tecnología getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemMetamodelFactory.eINSTANCE.createTecnología());
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

} //TecnologíaTest
