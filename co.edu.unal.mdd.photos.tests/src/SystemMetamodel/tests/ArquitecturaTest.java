/**
 */
package SystemMetamodel.tests;

import SystemMetamodel.Arquitectura;
import SystemMetamodel.SystemMetamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arquitectura</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArquitecturaTest extends TestCase {

	/**
	 * The fixture for this Arquitectura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arquitectura fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArquitecturaTest.class);
	}

	/**
	 * Constructs a new Arquitectura test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArquitecturaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Arquitectura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Arquitectura fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Arquitectura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arquitectura getFixture() {
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
		setFixture(SystemMetamodelFactory.eINSTANCE.createArquitectura());
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

} //ArquitecturaTest
