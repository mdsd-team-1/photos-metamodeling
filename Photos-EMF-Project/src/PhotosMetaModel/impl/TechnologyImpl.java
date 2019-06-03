/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AmazonWebServices;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.PostgreSQL;
import PhotosMetaModel.React;
import PhotosMetaModel.Spring;
import PhotosMetaModel.Technology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getSpring <em>Spring</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getReact <em>React</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getPostgresql <em>Postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getAmazons3 <em>Amazons3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologyImpl extends MinimalEObjectImpl.Container implements Technology {
	/**
	 * The cached value of the '{@link #getSpring() <em>Spring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpring()
	 * @generated
	 * @ordered
	 */
	protected Spring spring;

	/**
	 * The cached value of the '{@link #getReact() <em>React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReact()
	 * @generated
	 * @ordered
	 */
	protected React react;

	/**
	 * The cached value of the '{@link #getPostgresql() <em>Postgresql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostgresql()
	 * @generated
	 * @ordered
	 */
	protected PostgreSQL postgresql;

	/**
	 * The cached value of the '{@link #getAmazons3() <em>Amazons3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazons3()
	 * @generated
	 * @ordered
	 */
	protected AmazonWebServices amazons3;

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
	public Spring getSpring() {
		if (spring != null && spring.eIsProxy()) {
			InternalEObject oldSpring = (InternalEObject)spring;
			spring = (Spring)eResolveProxy(oldSpring);
			if (spring != oldSpring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.TECHNOLOGY__SPRING, oldSpring, spring));
			}
		}
		return spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spring basicGetSpring() {
		return spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpring(Spring newSpring) {
		Spring oldSpring = spring;
		spring = newSpring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__SPRING, oldSpring, spring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public React getReact() {
		if (react != null && react.eIsProxy()) {
			InternalEObject oldReact = (InternalEObject)react;
			react = (React)eResolveProxy(oldReact);
			if (react != oldReact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.TECHNOLOGY__REACT, oldReact, react));
			}
		}
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public React basicGetReact() {
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReact(React newReact) {
		React oldReact = react;
		react = newReact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__REACT, oldReact, react));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostgreSQL getPostgresql() {
		if (postgresql != null && postgresql.eIsProxy()) {
			InternalEObject oldPostgresql = (InternalEObject)postgresql;
			postgresql = (PostgreSQL)eResolveProxy(oldPostgresql);
			if (postgresql != oldPostgresql) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL, oldPostgresql, postgresql));
			}
		}
		return postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostgreSQL basicGetPostgresql() {
		return postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostgresql(PostgreSQL newPostgresql) {
		PostgreSQL oldPostgresql = postgresql;
		postgresql = newPostgresql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL, oldPostgresql, postgresql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonWebServices getAmazons3() {
		if (amazons3 != null && amazons3.eIsProxy()) {
			InternalEObject oldAmazons3 = (InternalEObject)amazons3;
			amazons3 = (AmazonWebServices)eResolveProxy(oldAmazons3);
			if (amazons3 != oldAmazons3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.TECHNOLOGY__AMAZONS3, oldAmazons3, amazons3));
			}
		}
		return amazons3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonWebServices basicGetAmazons3() {
		return amazons3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazons3(AmazonWebServices newAmazons3) {
		AmazonWebServices oldAmazons3 = amazons3;
		amazons3 = newAmazons3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__AMAZONS3, oldAmazons3, amazons3));
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
				if (resolve) return getSpring();
				return basicGetSpring();
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				if (resolve) return getReact();
				return basicGetReact();
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				if (resolve) return getPostgresql();
				return basicGetPostgresql();
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONS3:
				if (resolve) return getAmazons3();
				return basicGetAmazons3();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.TECHNOLOGY__SPRING:
				setSpring((Spring)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				setReact((React)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				setPostgresql((PostgreSQL)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONS3:
				setAmazons3((AmazonWebServices)newValue);
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
				setSpring((Spring)null);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				setReact((React)null);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				setPostgresql((PostgreSQL)null);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONS3:
				setAmazons3((AmazonWebServices)null);
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
				return spring != null;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				return react != null;
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				return postgresql != null;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONS3:
				return amazons3 != null;
		}
		return super.eIsSet(featureID);
	}

} //TechnologyImpl
