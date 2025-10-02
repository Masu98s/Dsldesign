/**
 */
package IUPACpackage.util;

import IUPACpackage.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see IUPACpackage.IUPACpackagePackage
 * @generated
 */
public class IUPACpackageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IUPACpackageValidator INSTANCE = new IUPACpackageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "IUPACpackage";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint 1' of 'Branch'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BRANCH__CONSTRAINT_1 = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUPACpackageValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return IUPACpackagePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case IUPACpackagePackage.IUPAC:
				return validateIUPAC((IUPAC)value, diagnostics, context);
			case IUPACpackagePackage.CHAIN:
				return validateChain((Chain)value, diagnostics, context);
			case IUPACpackagePackage.POSITION:
				return validatePosition((Position)value, diagnostics, context);
			case IUPACpackagePackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case IUPACpackagePackage.SUMMARY_PREFIX:
				return validateSummaryPrefix((SummaryPrefix)value, diagnostics, context);
			case IUPACpackagePackage.ENCODED_NAME:
				return validateEncodedName((EncodedName)value, diagnostics, context);
			case IUPACpackagePackage.ENCODED_BRANCH_NAME:
				return validateEncodedBranchName((EncodedBranchName)value, diagnostics, context);
			case IUPACpackagePackage.PREFIX:
				return validatePrefix((Prefix)value, diagnostics, context);
			case IUPACpackagePackage.POSITION_INFORMATION:
				return validatePositionInformation((PositionInformation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIUPAC(IUPAC iupac, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iupac, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChain(Chain chain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(branch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranch_constraint_1(branch, diagnostics, context);
		return result;
	}

	/**
	 * Validates the constraint_1 constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch_constraint_1(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return branch.constraint_1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryPrefix(SummaryPrefix summaryPrefix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(summaryPrefix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodedName(EncodedName encodedName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodedBranchName(EncodedBranchName encodedBranchName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefix(Prefix prefix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionInformation(PositionInformation positionInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //IUPACpackageValidator
