/**
 */
package IUPACpackage.impl;

import IUPACpackage.Branch;
import IUPACpackage.Chain;
import IUPACpackage.IUPAC;
import IUPACpackage.IUPACpackagePackage;
import IUPACpackage.Position;
import IUPACpackage.SummaryPrefix;

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
 * An implementation of the model object '<em><b>IUPAC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.impl.IUPACImpl#getChain <em>Chain</em>}</li>
 *   <li>{@link IUPACpackage.impl.IUPACImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link IUPACpackage.impl.IUPACImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link IUPACpackage.impl.IUPACImpl#getSummaryprefix <em>Summaryprefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IUPACImpl extends MinimalEObjectImpl.Container implements IUPAC {
	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected EList<Chain> chain;

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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> position;

	/**
	 * The cached value of the '{@link #getSummaryprefix() <em>Summaryprefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummaryprefix()
	 * @generated
	 * @ordered
	 */
	protected EList<SummaryPrefix> summaryprefix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IUPACImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IUPACpackagePackage.Literals.IUPAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Chain> getChain() {
		if (chain == null) {
			chain = new EObjectContainmentEList<Chain>(Chain.class, this, IUPACpackagePackage.IUPAC__CHAIN);
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Branch> getBranch() {
		if (branch == null) {
			branch = new EObjectContainmentEList<Branch>(Branch.class, this, IUPACpackagePackage.IUPAC__BRANCH);
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Position> getPosition() {
		if (position == null) {
			position = new EObjectContainmentEList<Position>(Position.class, this, IUPACpackagePackage.IUPAC__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SummaryPrefix> getSummaryprefix() {
		if (summaryprefix == null) {
			summaryprefix = new EObjectContainmentEList<SummaryPrefix>(SummaryPrefix.class, this, IUPACpackagePackage.IUPAC__SUMMARYPREFIX);
		}
		return summaryprefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IUPACpackagePackage.IUPAC__CHAIN:
				return ((InternalEList<?>)getChain()).basicRemove(otherEnd, msgs);
			case IUPACpackagePackage.IUPAC__BRANCH:
				return ((InternalEList<?>)getBranch()).basicRemove(otherEnd, msgs);
			case IUPACpackagePackage.IUPAC__POSITION:
				return ((InternalEList<?>)getPosition()).basicRemove(otherEnd, msgs);
			case IUPACpackagePackage.IUPAC__SUMMARYPREFIX:
				return ((InternalEList<?>)getSummaryprefix()).basicRemove(otherEnd, msgs);
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
			case IUPACpackagePackage.IUPAC__CHAIN:
				return getChain();
			case IUPACpackagePackage.IUPAC__BRANCH:
				return getBranch();
			case IUPACpackagePackage.IUPAC__POSITION:
				return getPosition();
			case IUPACpackagePackage.IUPAC__SUMMARYPREFIX:
				return getSummaryprefix();
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
			case IUPACpackagePackage.IUPAC__CHAIN:
				getChain().clear();
				getChain().addAll((Collection<? extends Chain>)newValue);
				return;
			case IUPACpackagePackage.IUPAC__BRANCH:
				getBranch().clear();
				getBranch().addAll((Collection<? extends Branch>)newValue);
				return;
			case IUPACpackagePackage.IUPAC__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Position>)newValue);
				return;
			case IUPACpackagePackage.IUPAC__SUMMARYPREFIX:
				getSummaryprefix().clear();
				getSummaryprefix().addAll((Collection<? extends SummaryPrefix>)newValue);
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
			case IUPACpackagePackage.IUPAC__CHAIN:
				getChain().clear();
				return;
			case IUPACpackagePackage.IUPAC__BRANCH:
				getBranch().clear();
				return;
			case IUPACpackagePackage.IUPAC__POSITION:
				getPosition().clear();
				return;
			case IUPACpackagePackage.IUPAC__SUMMARYPREFIX:
				getSummaryprefix().clear();
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
			case IUPACpackagePackage.IUPAC__CHAIN:
				return chain != null && !chain.isEmpty();
			case IUPACpackagePackage.IUPAC__BRANCH:
				return branch != null && !branch.isEmpty();
			case IUPACpackagePackage.IUPAC__POSITION:
				return position != null && !position.isEmpty();
			case IUPACpackagePackage.IUPAC__SUMMARYPREFIX:
				return summaryprefix != null && !summaryprefix.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IUPACImpl
