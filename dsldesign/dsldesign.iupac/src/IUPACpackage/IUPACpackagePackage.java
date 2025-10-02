/**
 */
package IUPACpackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IUPACpackage.IUPACpackageFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface IUPACpackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IUPACpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://IUPAC.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IUPAC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IUPACpackagePackage eINSTANCE = IUPACpackage.impl.IUPACpackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link IUPACpackage.impl.IUPACImpl <em>IUPAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.impl.IUPACImpl
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getIUPAC()
	 * @generated
	 */
	int IUPAC = 0;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUPAC__CHAIN = 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUPAC__BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUPAC__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Summaryprefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUPAC__SUMMARYPREFIX = 3;

	/**
	 * The number of structural features of the '<em>IUPAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUPAC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IUPAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUPAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IUPACpackage.impl.ChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.impl.ChainImpl
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getChain()
	 * @generated
	 */
	int CHAIN = 1;

	/**
	 * The feature id for the '<em><b>Encoded Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__ENCODED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__BRANCH = 1;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IUPACpackage.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.impl.PositionImpl
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;

	/**
	 * The feature id for the '<em><b>Digit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__DIGIT = 0;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IUPACpackage.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.impl.BranchImpl
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 3;

	/**
	 * The feature id for the '<em><b>Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_NAME = 0;

	/**
	 * The feature id for the '<em><b>Mono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__MONO = 1;

	/**
	 * The feature id for the '<em><b>Di</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DI = 2;

	/**
	 * The feature id for the '<em><b>Tri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__TRI = 3;

	/**
	 * The feature id for the '<em><b>Tetra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__TETRA = 4;

	/**
	 * The feature id for the '<em><b>Summaryprefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__SUMMARYPREFIX = 5;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__POSITION = 6;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH = 7;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Constraint 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH___CONSTRAINT_1__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link IUPACpackage.impl.SummaryPrefixImpl <em>Summary Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.impl.SummaryPrefixImpl
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getSummaryPrefix()
	 * @generated
	 */
	int SUMMARY_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_PREFIX__PREFIX = 0;

	/**
	 * The number of structural features of the '<em>Summary Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_PREFIX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Summary Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_PREFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IUPACpackage.EncodedName <em>Encoded Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.EncodedName
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getEncodedName()
	 * @generated
	 */
	int ENCODED_NAME = 5;

	/**
	 * The meta object id for the '{@link IUPACpackage.EncodedBranchName <em>Encoded Branch Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.EncodedBranchName
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getEncodedBranchName()
	 * @generated
	 */
	int ENCODED_BRANCH_NAME = 6;

	/**
	 * The meta object id for the '{@link IUPACpackage.Prefix <em>Prefix</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.Prefix
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getPrefix()
	 * @generated
	 */
	int PREFIX = 7;

	/**
	 * The meta object id for the '{@link IUPACpackage.PositionInformation <em>Position Information</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IUPACpackage.PositionInformation
	 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getPositionInformation()
	 * @generated
	 */
	int POSITION_INFORMATION = 8;


	/**
	 * Returns the meta object for class '{@link IUPACpackage.IUPAC <em>IUPAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IUPAC</em>'.
	 * @see IUPACpackage.IUPAC
	 * @generated
	 */
	EClass getIUPAC();

	/**
	 * Returns the meta object for the containment reference list '{@link IUPACpackage.IUPAC#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chain</em>'.
	 * @see IUPACpackage.IUPAC#getChain()
	 * @see #getIUPAC()
	 * @generated
	 */
	EReference getIUPAC_Chain();

	/**
	 * Returns the meta object for the containment reference list '{@link IUPACpackage.IUPAC#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see IUPACpackage.IUPAC#getBranch()
	 * @see #getIUPAC()
	 * @generated
	 */
	EReference getIUPAC_Branch();

	/**
	 * Returns the meta object for the containment reference list '{@link IUPACpackage.IUPAC#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position</em>'.
	 * @see IUPACpackage.IUPAC#getPosition()
	 * @see #getIUPAC()
	 * @generated
	 */
	EReference getIUPAC_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link IUPACpackage.IUPAC#getSummaryprefix <em>Summaryprefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Summaryprefix</em>'.
	 * @see IUPACpackage.IUPAC#getSummaryprefix()
	 * @see #getIUPAC()
	 * @generated
	 */
	EReference getIUPAC_Summaryprefix();

	/**
	 * Returns the meta object for class '{@link IUPACpackage.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see IUPACpackage.Chain
	 * @generated
	 */
	EClass getChain();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.Chain#getEncodedName <em>Encoded Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoded Name</em>'.
	 * @see IUPACpackage.Chain#getEncodedName()
	 * @see #getChain()
	 * @generated
	 */
	EAttribute getChain_EncodedName();

	/**
	 * Returns the meta object for the containment reference list '{@link IUPACpackage.Chain#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see IUPACpackage.Chain#getBranch()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_Branch();

	/**
	 * Returns the meta object for class '{@link IUPACpackage.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see IUPACpackage.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.Position#getDigit <em>Digit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digit</em>'.
	 * @see IUPACpackage.Position#getDigit()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Digit();

	/**
	 * Returns the meta object for class '{@link IUPACpackage.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see IUPACpackage.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.Branch#getBranchName <em>Branch Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Name</em>'.
	 * @see IUPACpackage.Branch#getBranchName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_BranchName();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.Branch#getMono <em>Mono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mono</em>'.
	 * @see IUPACpackage.Branch#getMono()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Mono();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.Branch#getDi <em>Di</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Di</em>'.
	 * @see IUPACpackage.Branch#getDi()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Di();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.Branch#getTri <em>Tri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tri</em>'.
	 * @see IUPACpackage.Branch#getTri()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Tri();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.Branch#getTetra <em>Tetra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tetra</em>'.
	 * @see IUPACpackage.Branch#getTetra()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Tetra();

	/**
	 * Returns the meta object for the containment reference '{@link IUPACpackage.Branch#getSummaryprefix <em>Summaryprefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Summaryprefix</em>'.
	 * @see IUPACpackage.Branch#getSummaryprefix()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Summaryprefix();

	/**
	 * Returns the meta object for the containment reference list '{@link IUPACpackage.Branch#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position</em>'.
	 * @see IUPACpackage.Branch#getPosition()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Position();

	/**
	 * Returns the meta object for the containment reference '{@link IUPACpackage.Branch#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch</em>'.
	 * @see IUPACpackage.Branch#getBranch()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Branch();

	/**
	 * Returns the meta object for the '{@link IUPACpackage.Branch#constraint_1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint 1</em>' operation.
	 * @see IUPACpackage.Branch#constraint_1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBranch__Constraint_1__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link IUPACpackage.SummaryPrefix <em>Summary Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary Prefix</em>'.
	 * @see IUPACpackage.SummaryPrefix
	 * @generated
	 */
	EClass getSummaryPrefix();

	/**
	 * Returns the meta object for the attribute '{@link IUPACpackage.SummaryPrefix#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see IUPACpackage.SummaryPrefix#getPrefix()
	 * @see #getSummaryPrefix()
	 * @generated
	 */
	EAttribute getSummaryPrefix_Prefix();

	/**
	 * Returns the meta object for enum '{@link IUPACpackage.EncodedName <em>Encoded Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoded Name</em>'.
	 * @see IUPACpackage.EncodedName
	 * @generated
	 */
	EEnum getEncodedName();

	/**
	 * Returns the meta object for enum '{@link IUPACpackage.EncodedBranchName <em>Encoded Branch Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoded Branch Name</em>'.
	 * @see IUPACpackage.EncodedBranchName
	 * @generated
	 */
	EEnum getEncodedBranchName();

	/**
	 * Returns the meta object for enum '{@link IUPACpackage.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prefix</em>'.
	 * @see IUPACpackage.Prefix
	 * @generated
	 */
	EEnum getPrefix();

	/**
	 * Returns the meta object for enum '{@link IUPACpackage.PositionInformation <em>Position Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Information</em>'.
	 * @see IUPACpackage.PositionInformation
	 * @generated
	 */
	EEnum getPositionInformation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IUPACpackageFactory getIUPACpackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IUPACpackage.impl.IUPACImpl <em>IUPAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.impl.IUPACImpl
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getIUPAC()
		 * @generated
		 */
		EClass IUPAC = eINSTANCE.getIUPAC();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IUPAC__CHAIN = eINSTANCE.getIUPAC_Chain();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IUPAC__BRANCH = eINSTANCE.getIUPAC_Branch();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IUPAC__POSITION = eINSTANCE.getIUPAC_Position();

		/**
		 * The meta object literal for the '<em><b>Summaryprefix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IUPAC__SUMMARYPREFIX = eINSTANCE.getIUPAC_Summaryprefix();

		/**
		 * The meta object literal for the '{@link IUPACpackage.impl.ChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.impl.ChainImpl
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getChain()
		 * @generated
		 */
		EClass CHAIN = eINSTANCE.getChain();

		/**
		 * The meta object literal for the '<em><b>Encoded Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN__ENCODED_NAME = eINSTANCE.getChain_EncodedName();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__BRANCH = eINSTANCE.getChain_Branch();

		/**
		 * The meta object literal for the '{@link IUPACpackage.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.impl.PositionImpl
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Digit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__DIGIT = eINSTANCE.getPosition_Digit();

		/**
		 * The meta object literal for the '{@link IUPACpackage.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.impl.BranchImpl
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Branch Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_NAME = eINSTANCE.getBranch_BranchName();

		/**
		 * The meta object literal for the '<em><b>Mono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__MONO = eINSTANCE.getBranch_Mono();

		/**
		 * The meta object literal for the '<em><b>Di</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DI = eINSTANCE.getBranch_Di();

		/**
		 * The meta object literal for the '<em><b>Tri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__TRI = eINSTANCE.getBranch_Tri();

		/**
		 * The meta object literal for the '<em><b>Tetra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__TETRA = eINSTANCE.getBranch_Tetra();

		/**
		 * The meta object literal for the '<em><b>Summaryprefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__SUMMARYPREFIX = eINSTANCE.getBranch_Summaryprefix();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__POSITION = eINSTANCE.getBranch_Position();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__BRANCH = eINSTANCE.getBranch_Branch();

		/**
		 * The meta object literal for the '<em><b>Constraint 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BRANCH___CONSTRAINT_1__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBranch__Constraint_1__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link IUPACpackage.impl.SummaryPrefixImpl <em>Summary Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.impl.SummaryPrefixImpl
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getSummaryPrefix()
		 * @generated
		 */
		EClass SUMMARY_PREFIX = eINSTANCE.getSummaryPrefix();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_PREFIX__PREFIX = eINSTANCE.getSummaryPrefix_Prefix();

		/**
		 * The meta object literal for the '{@link IUPACpackage.EncodedName <em>Encoded Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.EncodedName
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getEncodedName()
		 * @generated
		 */
		EEnum ENCODED_NAME = eINSTANCE.getEncodedName();

		/**
		 * The meta object literal for the '{@link IUPACpackage.EncodedBranchName <em>Encoded Branch Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.EncodedBranchName
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getEncodedBranchName()
		 * @generated
		 */
		EEnum ENCODED_BRANCH_NAME = eINSTANCE.getEncodedBranchName();

		/**
		 * The meta object literal for the '{@link IUPACpackage.Prefix <em>Prefix</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.Prefix
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getPrefix()
		 * @generated
		 */
		EEnum PREFIX = eINSTANCE.getPrefix();

		/**
		 * The meta object literal for the '{@link IUPACpackage.PositionInformation <em>Position Information</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IUPACpackage.PositionInformation
		 * @see IUPACpackage.impl.IUPACpackagePackageImpl#getPositionInformation()
		 * @generated
		 */
		EEnum POSITION_INFORMATION = eINSTANCE.getPositionInformation();

	}

} //IUPACpackagePackage
