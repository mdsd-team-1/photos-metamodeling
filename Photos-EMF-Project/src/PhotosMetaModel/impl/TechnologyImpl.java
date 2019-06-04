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
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getPostgresql <em>Postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getReact <em>React</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.TechnologyImpl#getAmazonwebservices <em>Amazonwebservices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologyImpl extends MinimalEObjectImpl.Container implements Technology {
	/**
	 * The cached value of the '{@link #getSpring() <em>Spring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpring()
	 * @generated
	 * @ordered
	 */
	protected Spring spring;

	/**
	 * The cached value of the '{@link #getPostgresql() <em>Postgresql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostgresql()
	 * @generated
	 * @ordered
	 */
	protected PostgreSQL postgresql;

	/**
	 * The cached value of the '{@link #getReact() <em>React</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReact()
	 * @generated
	 * @ordered
	 */
	protected React react;

	/**
	 * The cached value of the '{@link #getAmazonwebservices() <em>Amazonwebservices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonwebservices()
	 * @generated
	 * @ordered
	 */
	protected AmazonWebServices amazonwebservices;

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
		return spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpring(Spring newSpring, NotificationChain msgs) {
		Spring oldSpring = spring;
		spring = newSpring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__SPRING, oldSpring, newSpring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpring(Spring newSpring) {
		if (newSpring != spring) {
			NotificationChain msgs = null;
			if (spring != null)
				msgs = ((InternalEObject)spring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__SPRING, null, msgs);
			if (newSpring != null)
				msgs = ((InternalEObject)newSpring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__SPRING, null, msgs);
			msgs = basicSetSpring(newSpring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__SPRING, newSpring, newSpring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostgreSQL getPostgresql() {
		return postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostgresql(PostgreSQL newPostgresql, NotificationChain msgs) {
		PostgreSQL oldPostgresql = postgresql;
		postgresql = newPostgresql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL, oldPostgresql, newPostgresql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostgresql(PostgreSQL newPostgresql) {
		if (newPostgresql != postgresql) {
			NotificationChain msgs = null;
			if (postgresql != null)
				msgs = ((InternalEObject)postgresql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL, null, msgs);
			if (newPostgresql != null)
				msgs = ((InternalEObject)newPostgresql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL, null, msgs);
			msgs = basicSetPostgresql(newPostgresql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL, newPostgresql, newPostgresql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public React getReact() {
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReact(React newReact, NotificationChain msgs) {
		React oldReact = react;
		react = newReact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__REACT, oldReact, newReact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReact(React newReact) {
		if (newReact != react) {
			NotificationChain msgs = null;
			if (react != null)
				msgs = ((InternalEObject)react).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__REACT, null, msgs);
			if (newReact != null)
				msgs = ((InternalEObject)newReact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__REACT, null, msgs);
			msgs = basicSetReact(newReact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__REACT, newReact, newReact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonWebServices getAmazonwebservices() {
		return amazonwebservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmazonwebservices(AmazonWebServices newAmazonwebservices, NotificationChain msgs) {
		AmazonWebServices oldAmazonwebservices = amazonwebservices;
		amazonwebservices = newAmazonwebservices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES, oldAmazonwebservices, newAmazonwebservices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazonwebservices(AmazonWebServices newAmazonwebservices) {
		if (newAmazonwebservices != amazonwebservices) {
			NotificationChain msgs = null;
			if (amazonwebservices != null)
				msgs = ((InternalEObject)amazonwebservices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES, null, msgs);
			if (newAmazonwebservices != null)
				msgs = ((InternalEObject)newAmazonwebservices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES, null, msgs);
			msgs = basicSetAmazonwebservices(newAmazonwebservices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES, newAmazonwebservices, newAmazonwebservices));
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
				return basicSetSpring(null, msgs);
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				return basicSetPostgresql(null, msgs);
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				return basicSetReact(null, msgs);
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				return basicSetAmazonwebservices(null, msgs);
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.TECHNOLOGY__SPRING:
				setSpring((Spring)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				setPostgresql((PostgreSQL)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				setReact((React)newValue);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				setAmazonwebservices((AmazonWebServices)newValue);
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
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				setPostgresql((PostgreSQL)null);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				setReact((React)null);
				return;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				setAmazonwebservices((AmazonWebServices)null);
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
			case PhotosMetaModelPackage.TECHNOLOGY__POSTGRESQL:
				return postgresql != null;
			case PhotosMetaModelPackage.TECHNOLOGY__REACT:
				return react != null;
			case PhotosMetaModelPackage.TECHNOLOGY__AMAZONWEBSERVICES:
				return amazonwebservices != null;
		}
		return super.eIsSet(featureID);
	}

} //TechnologyImpl
