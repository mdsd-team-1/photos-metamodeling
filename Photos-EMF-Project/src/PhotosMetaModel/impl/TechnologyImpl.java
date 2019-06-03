/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AmazonWebServices;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.PostgreSQL;
import PhotosMetaModel.React;
import PhotosMetaModel.Spring;
import PhotosMetaModel.Technology;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getSpring <em>Spring</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getPostgresql <em>Postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getReact <em>React</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getAmazonwebservices <em>Amazonwebservices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologyImpl extends MinimalEObjectImpl.Container implements Technology {
	/**
	 * The cached value of the '{@link #getSpring() <em>Spring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpring()
	 * @generated
	 * @ordered
	 */
	protected EList<Spring> spring;

	/**
	 * The cached value of the '{@link #getPostgresql() <em>Postgresql</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostgresql()
	 * @generated
	 * @ordered
	 */
	protected EList<PostgreSQL> postgresql;

	/**
	 * The cached value of the '{@link #getReact() <em>React</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReact()
	 * @generated
	 * @ordered
	 */
	protected EList<React> react;

	/**
	 * The cached value of the '{@link #getAmazonwebservices() <em>Amazonwebservices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonwebservices()
	 * @generated
	 * @ordered
	 */
	protected EList<AmazonWebServices> amazonwebservices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.TECHNOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Spring> getSpring() {
		if (spring == null) {
			spring = new EObjectContainmentEList<Spring>(Spring.class, this, PhotosMetaModelPackage.TECHNOLOGY__SPRING);
		}
		return spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostgreSQL> getPostgresql() {
		if (postgresql == null) {
			postgresql = new EObjectContainmentEList<PostgreSQL>(PostgreSQL.class, this, PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL);
		}
		return postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<React> getReact() {
		if (react == null) {
			react = new EObjectContainmentEList<React>(React.class, this, PhotosMetaModelPackage.TECHNOLOGY__REACT);
		}
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AmazonWebServices> getAmazonwebservices() {
		if (amazonwebservices == null) {
			amazonwebservices = new EObjectContainmentEList<AmazonWebServices>(AmazonWebServices.class, this, PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES);
		}
		return amazonwebservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.TECHNOLOGY__SPRING:
				return ((InternalEList<?>)getSpring()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				return ((InternalEList<?>)getPostgresql()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				return ((InternalEList<?>)getReact()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				return ((InternalEList<?>)getAmazonwebservices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.TECHNOLOGY__SPRING:
				return getSpring();
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				return getPostgresql();
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				return getReact();
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				return getAmazonwebservices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.TECHNOLOGY__SPRING:
				getSpring().clear();
				getSpring().addAll((Collection<? extends Spring>)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				getPostgresql().clear();
				getPostgresql().addAll((Collection<? extends PostgreSQL>)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				getReact().clear();
				getReact().addAll((Collection<? extends React>)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				getAmazonwebservices().clear();
				getAmazonwebservices().addAll((Collection<? extends AmazonWebServices>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PhotosMetaModelPackage.TECHNOLOGY__SPRING:
				getSpring().clear();
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				getPostgresql().clear();
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				getReact().clear();
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				getAmazonwebservices().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PhotosMetaModelPackage.TECHNOLOGY__SPRING:
				return spring != null && !spring.isEmpty();
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				return postgresql != null && !postgresql.isEmpty();
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				return react != null && !react.isEmpty();
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				return amazonwebservices != null && !amazonwebservices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TechnologyImpl
