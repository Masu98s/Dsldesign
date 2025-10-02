/**
 */
package IUPACpackage.impl;

import IUPACpackage.Branch;
import IUPACpackage.Chain;
import IUPACpackage.EncodedBranchName;
import IUPACpackage.EncodedName;
import IUPACpackage.IUPACpackageFactory;
import IUPACpackage.IUPACpackagePackage;
import IUPACpackage.Position;
import IUPACpackage.PositionInformation;
import IUPACpackage.Prefix;
import IUPACpackage.SummaryPrefix;

import IUPACpackage.util.IUPACpackageValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IUPACpackagePackageImpl extends EPackageImpl implements IUPACpackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iupacEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summaryPrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodedNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodedBranchNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prefixEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionInformationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see IUPACpackage.IUPACpackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IUPACpackagePackageImpl() {
		super(eNS_URI, IUPACpackageFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IUPACpackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IUPACpackagePackage init() {
		if (isInited) return (IUPACpackagePackage)EPackage.Registry.INSTANCE.getEPackage(IUPACpackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIUPACpackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IUPACpackagePackageImpl theIUPACpackagePackage = registeredIUPACpackagePackage instanceof IUPACpackagePackageImpl ? (IUPACpackagePackageImpl)registeredIUPACpackagePackage : new IUPACpackagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIUPACpackagePackage.createPackageContents();

		// Initialize created meta-data
		theIUPACpackagePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIUPACpackagePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return IUPACpackageValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIUPACpackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IUPACpackagePackage.eNS_URI, theIUPACpackagePackage);
		return theIUPACpackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIUPAC() {
		return iupacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIUPAC_Chain() {
		return (EReference)iupacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIUPAC_Branch() {
		return (EReference)iupacEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIUPAC_Position() {
		return (EReference)iupacEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIUPAC_Summaryprefix() {
		return (EReference)iupacEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChain() {
		return chainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChain_EncodedName() {
		return (EAttribute)chainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChain_Branch() {
		return (EReference)chainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Digit() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_BranchName() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Mono() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Di() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Tri() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Tetra() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_Summaryprefix() {
		return (EReference)branchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_Position() {
		return (EReference)branchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_Branch() {
		return (EReference)branchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBranch__Constraint_1__DiagnosticChain_Map() {
		return branchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSummaryPrefix() {
		return summaryPrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSummaryPrefix_Prefix() {
		return (EAttribute)summaryPrefixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEncodedName() {
		return encodedNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEncodedBranchName() {
		return encodedBranchNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrefix() {
		return prefixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPositionInformation() {
		return positionInformationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IUPACpackageFactory getIUPACpackageFactory() {
		return (IUPACpackageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iupacEClass = createEClass(IUPAC);
		createEReference(iupacEClass, IUPAC__CHAIN);
		createEReference(iupacEClass, IUPAC__BRANCH);
		createEReference(iupacEClass, IUPAC__POSITION);
		createEReference(iupacEClass, IUPAC__SUMMARYPREFIX);

		chainEClass = createEClass(CHAIN);
		createEAttribute(chainEClass, CHAIN__ENCODED_NAME);
		createEReference(chainEClass, CHAIN__BRANCH);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__DIGIT);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__BRANCH_NAME);
		createEAttribute(branchEClass, BRANCH__MONO);
		createEAttribute(branchEClass, BRANCH__DI);
		createEAttribute(branchEClass, BRANCH__TRI);
		createEAttribute(branchEClass, BRANCH__TETRA);
		createEReference(branchEClass, BRANCH__SUMMARYPREFIX);
		createEReference(branchEClass, BRANCH__POSITION);
		createEReference(branchEClass, BRANCH__BRANCH);
		createEOperation(branchEClass, BRANCH___CONSTRAINT_1__DIAGNOSTICCHAIN_MAP);

		summaryPrefixEClass = createEClass(SUMMARY_PREFIX);
		createEAttribute(summaryPrefixEClass, SUMMARY_PREFIX__PREFIX);

		// Create enums
		encodedNameEEnum = createEEnum(ENCODED_NAME);
		encodedBranchNameEEnum = createEEnum(ENCODED_BRANCH_NAME);
		prefixEEnum = createEEnum(PREFIX);
		positionInformationEEnum = createEEnum(POSITION_INFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(iupacEClass, IUPACpackage.IUPAC.class, "IUPAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIUPAC_Chain(), this.getChain(), null, "chain", null, 0, -1, IUPACpackage.IUPAC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIUPAC_Branch(), this.getBranch(), null, "branch", null, 0, -1, IUPACpackage.IUPAC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIUPAC_Position(), this.getPosition(), null, "position", null, 0, -1, IUPACpackage.IUPAC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIUPAC_Summaryprefix(), this.getSummaryPrefix(), null, "summaryprefix", null, 0, -1, IUPACpackage.IUPAC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainEClass, Chain.class, "Chain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChain_EncodedName(), this.getEncodedName(), "encodedName", "Heptan", 0, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChain_Branch(), this.getBranch(), null, "branch", null, 0, 2, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Digit(), this.getPositionInformation(), "digit", "Two", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_BranchName(), this.getEncodedBranchName(), "branchName", "Methyl", 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Mono(), this.getPrefix(), "mono", "Mono", 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Di(), this.getPrefix(), "di", "Di", 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Tri(), this.getPrefix(), "tri", "Tri", 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Tetra(), this.getPrefix(), "tetra", "Tetra", 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Summaryprefix(), this.getSummaryPrefix(), null, "summaryprefix", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Position(), this.getPosition(), null, "position", null, 1, 4, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Branch(), this.getBranch(), null, "branch", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBranch__Constraint_1__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "constraint_1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(summaryPrefixEClass, SummaryPrefix.class, "SummaryPrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSummaryPrefix_Prefix(), this.getPrefix(), "prefix", "Mono", 0, 1, SummaryPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(encodedNameEEnum, EncodedName.class, "EncodedName");
		addEEnumLiteral(encodedNameEEnum, EncodedName.METHAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.ETHAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.PROPAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.BUTAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.PENTAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.HEXAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.HEPTAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.OCTAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.NONAN);
		addEEnumLiteral(encodedNameEEnum, EncodedName.DECAN);

		initEEnum(encodedBranchNameEEnum, EncodedBranchName.class, "EncodedBranchName");
		addEEnumLiteral(encodedBranchNameEEnum, EncodedBranchName.METHYL);
		addEEnumLiteral(encodedBranchNameEEnum, EncodedBranchName.ETHYL);
		addEEnumLiteral(encodedBranchNameEEnum, EncodedBranchName.PROPYL);
		addEEnumLiteral(encodedBranchNameEEnum, EncodedBranchName.BUTYL);

		initEEnum(prefixEEnum, Prefix.class, "Prefix");
		addEEnumLiteral(prefixEEnum, Prefix.MONO);
		addEEnumLiteral(prefixEEnum, Prefix.DI);
		addEEnumLiteral(prefixEEnum, Prefix.TRI);
		addEEnumLiteral(prefixEEnum, Prefix.TETRA);

		initEEnum(positionInformationEEnum, PositionInformation.class, "PositionInformation");
		addEEnumLiteral(positionInformationEEnum, PositionInformation.ONE);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.TWO);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.THREE);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.FOUR);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.FIVE);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.SIX);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.SEVEN);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.EIGHT);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.NINE);
		addEEnumLiteral(positionInformationEEnum, PositionInformation.TEN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (branchEClass,
		   source,
		   new String[] {
			   "constraints", "constraint_1"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getBranch__Constraint_1__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Summary prefix must be consistent with the number of positions of branches with the same length.\',\n\tstatus : Boolean = \n\t\t\t(self.summaryprefix.prefix = mono and self.position -> size() = 1)\n\t\t\tor (self.summaryprefix.prefix = di and self.position -> size() = 2)\n\t\t\tor (self.summaryprefix.prefix = tri and self.position -> size() = 3)\n\t\t\tor (self.summaryprefix.prefix = tetra and self.position -> size() = 4)\n}.status"
		   });
	}

} //IUPACpackagePackageImpl
