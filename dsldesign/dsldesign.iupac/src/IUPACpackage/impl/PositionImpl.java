/**
 */
package IUPACpackage.impl;

import IUPACpackage.IUPACpackagePackage;
import IUPACpackage.Position;
import IUPACpackage.PositionInformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.impl.PositionImpl#getDigit <em>Digit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The default value of the '{@link #getDigit() <em>Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigit()
	 * @generated
	 * @ordered
	 */
	protected static final PositionInformation DIGIT_EDEFAULT = PositionInformation.TWO;

	/**
	 * The cached value of the '{@link #getDigit() <em>Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigit()
	 * @generated
	 * @ordered
	 */
	protected PositionInformation digit = DIGIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IUPACpackagePackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionInformation getDigit() {
		return digit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigit(PositionInformation newDigit) {
		PositionInformation oldDigit = digit;
		digit = newDigit == null ? DIGIT_EDEFAULT : newDigit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.POSITION__DIGIT, oldDigit, digit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IUPACpackagePackage.POSITION__DIGIT:
				return getDigit();
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
			case IUPACpackagePackage.POSITION__DIGIT:
				setDigit((PositionInformation)newValue);
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
			case IUPACpackagePackage.POSITION__DIGIT:
				setDigit(DIGIT_EDEFAULT);
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
			case IUPACpackagePackage.POSITION__DIGIT:
				return digit != DIGIT_EDEFAULT;
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
		result.append(" (digit: ");
		result.append(digit);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
