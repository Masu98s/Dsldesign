/**
 */
package IUPACpackage.impl;

import IUPACpackage.Branch;
import IUPACpackage.EncodedBranchName;
import IUPACpackage.IUPACpackagePackage;
import IUPACpackage.IUPACpackageTables;
import IUPACpackage.Position;
import IUPACpackage.Prefix;
import IUPACpackage.SummaryPrefix;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getBranchName <em>Branch Name</em>}</li>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getMono <em>Mono</em>}</li>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getDi <em>Di</em>}</li>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getTri <em>Tri</em>}</li>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getTetra <em>Tetra</em>}</li>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getSummaryprefix <em>Summaryprefix</em>}</li>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link IUPACpackage.impl.BranchImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchImpl extends MinimalEObjectImpl.Container implements Branch {
	/**
	 * The default value of the '{@link #getBranchName() <em>Branch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchName()
	 * @generated
	 * @ordered
	 */
	protected static final EncodedBranchName BRANCH_NAME_EDEFAULT = EncodedBranchName.METHYL;

	/**
	 * The cached value of the '{@link #getBranchName() <em>Branch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchName()
	 * @generated
	 * @ordered
	 */
	protected EncodedBranchName branchName = BRANCH_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMono() <em>Mono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMono()
	 * @generated
	 * @ordered
	 */
	protected static final Prefix MONO_EDEFAULT = Prefix.MONO;

	/**
	 * The cached value of the '{@link #getMono() <em>Mono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMono()
	 * @generated
	 * @ordered
	 */
	protected Prefix mono = MONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDi() <em>Di</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDi()
	 * @generated
	 * @ordered
	 */
	protected static final Prefix DI_EDEFAULT = Prefix.DI;

	/**
	 * The cached value of the '{@link #getDi() <em>Di</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDi()
	 * @generated
	 * @ordered
	 */
	protected Prefix di = DI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTri() <em>Tri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTri()
	 * @generated
	 * @ordered
	 */
	protected static final Prefix TRI_EDEFAULT = Prefix.TRI;

	/**
	 * The cached value of the '{@link #getTri() <em>Tri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTri()
	 * @generated
	 * @ordered
	 */
	protected Prefix tri = TRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTetra() <em>Tetra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTetra()
	 * @generated
	 * @ordered
	 */
	protected static final Prefix TETRA_EDEFAULT = Prefix.TETRA;

	/**
	 * The cached value of the '{@link #getTetra() <em>Tetra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTetra()
	 * @generated
	 * @ordered
	 */
	protected Prefix tetra = TETRA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSummaryprefix() <em>Summaryprefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummaryprefix()
	 * @generated
	 * @ordered
	 */
	protected SummaryPrefix summaryprefix;

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
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected Branch branch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IUPACpackagePackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncodedBranchName getBranchName() {
		return branchName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchName(EncodedBranchName newBranchName) {
		EncodedBranchName oldBranchName = branchName;
		branchName = newBranchName == null ? BRANCH_NAME_EDEFAULT : newBranchName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__BRANCH_NAME, oldBranchName, branchName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prefix getMono() {
		return mono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMono(Prefix newMono) {
		Prefix oldMono = mono;
		mono = newMono == null ? MONO_EDEFAULT : newMono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__MONO, oldMono, mono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prefix getDi() {
		return di;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDi(Prefix newDi) {
		Prefix oldDi = di;
		di = newDi == null ? DI_EDEFAULT : newDi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__DI, oldDi, di));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prefix getTri() {
		return tri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTri(Prefix newTri) {
		Prefix oldTri = tri;
		tri = newTri == null ? TRI_EDEFAULT : newTri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__TRI, oldTri, tri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prefix getTetra() {
		return tetra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTetra(Prefix newTetra) {
		Prefix oldTetra = tetra;
		tetra = newTetra == null ? TETRA_EDEFAULT : newTetra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__TETRA, oldTetra, tetra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SummaryPrefix getSummaryprefix() {
		return summaryprefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSummaryprefix(SummaryPrefix newSummaryprefix, NotificationChain msgs) {
		SummaryPrefix oldSummaryprefix = summaryprefix;
		summaryprefix = newSummaryprefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__SUMMARYPREFIX, oldSummaryprefix, newSummaryprefix);
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
	public void setSummaryprefix(SummaryPrefix newSummaryprefix) {
		if (newSummaryprefix != summaryprefix) {
			NotificationChain msgs = null;
			if (summaryprefix != null)
				msgs = ((InternalEObject)summaryprefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IUPACpackagePackage.BRANCH__SUMMARYPREFIX, null, msgs);
			if (newSummaryprefix != null)
				msgs = ((InternalEObject)newSummaryprefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IUPACpackagePackage.BRANCH__SUMMARYPREFIX, null, msgs);
			msgs = basicSetSummaryprefix(newSummaryprefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__SUMMARYPREFIX, newSummaryprefix, newSummaryprefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Position> getPosition() {
		if (position == null) {
			position = new EObjectContainmentEList<Position>(Position.class, this, IUPACpackagePackage.BRANCH__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranch(Branch newBranch, NotificationChain msgs) {
		Branch oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__BRANCH, oldBranch, newBranch);
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
	public void setBranch(Branch newBranch) {
		if (newBranch != branch) {
			NotificationChain msgs = null;
			if (branch != null)
				msgs = ((InternalEObject)branch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IUPACpackagePackage.BRANCH__BRANCH, null, msgs);
			if (newBranch != null)
				msgs = ((InternalEObject)newBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IUPACpackagePackage.BRANCH__BRANCH, null, msgs);
			msgs = basicSetBranch(newBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IUPACpackagePackage.BRANCH__BRANCH, newBranch, newBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint_1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Branch::constraint_1";
		try {
			/**
			 *
			 * inv constraint_1:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[?] = self.summaryprefix.prefix = mono and
			 *           self.position->size() = 1 or self.summaryprefix.prefix = di and
			 *           self.position->size() = 2 or self.summaryprefix.prefix = tri and
			 *           self.position->size() = 3 or self.summaryprefix.prefix = tetra and
			 *           self.position->size() = 4
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Summary prefix must be consistent with the number of positions of branches with the same length.', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, IUPACpackagePackage.Literals.BRANCH___CONSTRAINT_1__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, IUPACpackageTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_IF_eq_7;
				try {
					final /*@NonInvalid*/ List<Position> position_2 = this.getPosition();
					final /*@NonInvalid*/ SummaryPrefix summaryprefix_2 = this.getSummaryprefix();
					final /*@NonInvalid*/ OrderedSetValue BOXED_position_2 = idResolver.createOrderedSetOfAll(IUPACpackageTables.ORD_CLSSid_Position_0, position_2);
					final /*@NonInvalid*/ Prefix prefix_2 = summaryprefix_2.getPrefix();
					final /*@NonInvalid*/ IntegerValue size_2 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_position_2);
					/*@Caught*/ Object CAUGHT_or_0;
					try {
						/*@Caught*/ Object CAUGHT_or;
						try {
							final /*@NonInvalid*/ Prefix mono = this.getMono();
							final /*@NonInvalid*/ boolean eq = (prefix_2 != null) ? prefix_2.equals(mono) : (mono == null);
							final /*@NonInvalid*/ Boolean and;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_0 = size_2.equals(IUPACpackageTables.INT_1);
								if (!eq_0) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean or;
							if (and == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ Prefix di = this.getDi();
								final /*@NonInvalid*/ boolean eq_1 = (prefix_2 != null) ? prefix_2.equals(di) : (di == null);
								final /*@NonInvalid*/ Boolean and_0;
								if (!eq_1) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean eq_2 = size_2.equals(IUPACpackageTables.INT_2);
									if (!eq_2) {
										and_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
								if (and_0 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									if ((and == null) || (and_0 == null)) {
										or = null;
									}
									else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or = or;
						}
						catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_0;
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ Prefix tri = this.getTri();
							final /*@NonInvalid*/ boolean eq_3 = (prefix_2 != null) ? prefix_2.equals(tri) : (tri == null);
							final /*@NonInvalid*/ Boolean and_1;
							if (!eq_3) {
								and_1 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_4 = size_2.equals(IUPACpackageTables.INT_3);
								if (!eq_4) {
									and_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									and_1 = ValueUtil.TRUE_VALUE;
								}
							}
							if (and_1 == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_or instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_or;
								}
								if ((CAUGHT_or == null) || (and_1 == null)) {
									or_0 = null;
								}
								else {
									or_0 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_0 = or_0;
					}
					catch (Exception e) {
						CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ Prefix tetra = this.getTetra();
						final /*@NonInvalid*/ boolean eq_5 = (prefix_2 != null) ? prefix_2.equals(tetra) : (tetra == null);
						final /*@NonInvalid*/ Boolean and_2;
						if (!eq_5) {
							and_2 = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_6 = size_2.equals(IUPACpackageTables.INT_4);
							if (!eq_6) {
								and_2 = ValueUtil.FALSE_VALUE;
							}
							else {
								and_2 = ValueUtil.TRUE_VALUE;
							}
						}
						if (and_2 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or_0;
							}
							if ((CAUGHT_or_0 == null) || (and_2 == null)) {
								status = null;
							}
							else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_7 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_7;
					if (eq_7) {
						IF_eq_7 = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(IUPACpackageTables.TUPLid_, IUPACpackageTables.STR_Summary_32_prefix_32_must_32_be_32_consistent_32_with_32_the_32_number_32_of_32_positions_32_o, status);
						IF_eq_7 = TUP_;
					}
					CAUGHT_IF_eq_7 = IF_eq_7;
				}
				catch (Exception e) {
					CAUGHT_IF_eq_7 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_IF_eq_7, IUPACpackageTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IUPACpackagePackage.BRANCH__SUMMARYPREFIX:
				return basicSetSummaryprefix(null, msgs);
			case IUPACpackagePackage.BRANCH__POSITION:
				return ((InternalEList<?>)getPosition()).basicRemove(otherEnd, msgs);
			case IUPACpackagePackage.BRANCH__BRANCH:
				return basicSetBranch(null, msgs);
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
			case IUPACpackagePackage.BRANCH__BRANCH_NAME:
				return getBranchName();
			case IUPACpackagePackage.BRANCH__MONO:
				return getMono();
			case IUPACpackagePackage.BRANCH__DI:
				return getDi();
			case IUPACpackagePackage.BRANCH__TRI:
				return getTri();
			case IUPACpackagePackage.BRANCH__TETRA:
				return getTetra();
			case IUPACpackagePackage.BRANCH__SUMMARYPREFIX:
				return getSummaryprefix();
			case IUPACpackagePackage.BRANCH__POSITION:
				return getPosition();
			case IUPACpackagePackage.BRANCH__BRANCH:
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
			case IUPACpackagePackage.BRANCH__BRANCH_NAME:
				setBranchName((EncodedBranchName)newValue);
				return;
			case IUPACpackagePackage.BRANCH__MONO:
				setMono((Prefix)newValue);
				return;
			case IUPACpackagePackage.BRANCH__DI:
				setDi((Prefix)newValue);
				return;
			case IUPACpackagePackage.BRANCH__TRI:
				setTri((Prefix)newValue);
				return;
			case IUPACpackagePackage.BRANCH__TETRA:
				setTetra((Prefix)newValue);
				return;
			case IUPACpackagePackage.BRANCH__SUMMARYPREFIX:
				setSummaryprefix((SummaryPrefix)newValue);
				return;
			case IUPACpackagePackage.BRANCH__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Position>)newValue);
				return;
			case IUPACpackagePackage.BRANCH__BRANCH:
				setBranch((Branch)newValue);
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
			case IUPACpackagePackage.BRANCH__BRANCH_NAME:
				setBranchName(BRANCH_NAME_EDEFAULT);
				return;
			case IUPACpackagePackage.BRANCH__MONO:
				setMono(MONO_EDEFAULT);
				return;
			case IUPACpackagePackage.BRANCH__DI:
				setDi(DI_EDEFAULT);
				return;
			case IUPACpackagePackage.BRANCH__TRI:
				setTri(TRI_EDEFAULT);
				return;
			case IUPACpackagePackage.BRANCH__TETRA:
				setTetra(TETRA_EDEFAULT);
				return;
			case IUPACpackagePackage.BRANCH__SUMMARYPREFIX:
				setSummaryprefix((SummaryPrefix)null);
				return;
			case IUPACpackagePackage.BRANCH__POSITION:
				getPosition().clear();
				return;
			case IUPACpackagePackage.BRANCH__BRANCH:
				setBranch((Branch)null);
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
			case IUPACpackagePackage.BRANCH__BRANCH_NAME:
				return branchName != BRANCH_NAME_EDEFAULT;
			case IUPACpackagePackage.BRANCH__MONO:
				return mono != MONO_EDEFAULT;
			case IUPACpackagePackage.BRANCH__DI:
				return di != DI_EDEFAULT;
			case IUPACpackagePackage.BRANCH__TRI:
				return tri != TRI_EDEFAULT;
			case IUPACpackagePackage.BRANCH__TETRA:
				return tetra != TETRA_EDEFAULT;
			case IUPACpackagePackage.BRANCH__SUMMARYPREFIX:
				return summaryprefix != null;
			case IUPACpackagePackage.BRANCH__POSITION:
				return position != null && !position.isEmpty();
			case IUPACpackagePackage.BRANCH__BRANCH:
				return branch != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IUPACpackagePackage.BRANCH___CONSTRAINT_1__DIAGNOSTICCHAIN_MAP:
				return constraint_1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (branchName: ");
		result.append(branchName);
		result.append(", mono: ");
		result.append(mono);
		result.append(", di: ");
		result.append(di);
		result.append(", tri: ");
		result.append(tri);
		result.append(", tetra: ");
		result.append(tetra);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
