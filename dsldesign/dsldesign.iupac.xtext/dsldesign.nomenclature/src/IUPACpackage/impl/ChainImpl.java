/**
 */
package IUPACpackage.impl;

import IUPACpackage.Branch;
import IUPACpackage.Chain;
import IUPACpackage.EncodedName;
import IUPACpackage.IUPACpackagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.impl.ChainImpl#getEncodedName <em>Encoded Name</em>}</li>
 *   <li>{@link IUPACpackage.impl.ChainImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChainImpl extends MinimalEObjectImpl.Container implements Chain {
	/**
	 * The default value of the '{@link #getEncodedName() <em>Encoded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedName()
	 * @generated
	 * @ordered
	 */
	protected static final EncodedName ENCODED_NAME_EDEFAULT = EncodedName.HEPTAN;

	/**
	 * The cached value of the '{@link #getEncodedName() <em>Encoded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedName()
	 * @generated
	 * @ordered
	 */
	protected EncodedName encodedName = ENCODED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IUPACpackagePackage.Literals.CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncodedName getEncodedName() {
		return encodedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncodedName(EncodedName newEncodedName) {
		EncodedName oldEncodedName = encodedName;
		encodedName = newEncodedName == null ? ENCODED_NAME_EDEFAULT : newEncodedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.CHAIN__ENCODED_NAME, oldEncodedName, encodedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Branch> getBranch() {
		if (branch == null) {
			branch = new EObjectContainmentEList<Branch>(Branch.class, this, IUPACpackagePackage.CHAIN__BRANCH);
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IUPACpackagePackage.CHAIN__BRANCH:
				return ((InternalEList<?>)getBranch()).basicRemove(otherEnd, msgs);
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
			case IUPACpackagePackage.CHAIN__ENCODED_NAME:
				return getEncodedName();
			case IUPACpackagePackage.CHAIN__BRANCH:
				return getBranch();
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
			case IUPACpackagePackage.CHAIN__ENCODED_NAME:
				setEncodedName((EncodedName)newValue);
				return;
			case IUPACpackagePackage.CHAIN__BRANCH:
				getBranch().clear();
				getBranch().addAll((Collection<? extends Branch>)newValue);
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
			case IUPACpackagePackage.CHAIN__ENCODED_NAME:
				setEncodedName(ENCODED_NAME_EDEFAULT);
				return;
			case IUPACpackagePackage.CHAIN__BRANCH:
				getBranch().clear();
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
			case IUPACpackagePackage.CHAIN__ENCODED_NAME:
				return encodedName != ENCODED_NAME_EDEFAULT;
			case IUPACpackagePackage.CHAIN__BRANCH:
				return branch != null && !branch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (encodedName: ");
		result.append(encodedName);
		result.append(')');
		return result.toString();
	}

} //ChainImpl
