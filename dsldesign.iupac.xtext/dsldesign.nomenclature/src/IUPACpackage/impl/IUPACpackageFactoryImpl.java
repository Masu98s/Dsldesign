/**
 */
package IUPACpackage.impl;

import IUPACpackage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IUPACpackageFactoryImpl extends EFactoryImpl implements IUPACpackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IUPACpackageFactory init() {
		try {
			IUPACpackageFactory theIUPACpackageFactory = (IUPACpackageFactory)EPackage.Registry.INSTANCE.getEFactory(IUPACpackagePackage.eNS_URI);
			if (theIUPACpackageFactory != null) {
				return theIUPACpackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IUPACpackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUPACpackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IUPACpackagePackage.IUPAC: return createIUPAC();
			case IUPACpackagePackage.CHAIN: return createChain();
			case IUPACpackagePackage.POSITION: return createPosition();
			case IUPACpackagePackage.BRANCH: return createBranch();
			case IUPACpackagePackage.SUMMARY_PREFIX: return createSummaryPrefix();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IUPACpackagePackage.ENCODED_NAME:
				return createEncodedNameFromString(eDataType, initialValue);
			case IUPACpackagePackage.ENCODED_BRANCH_NAME:
				return createEncodedBranchNameFromString(eDataType, initialValue);
			case IUPACpackagePackage.PREFIX:
				return createPrefixFromString(eDataType, initialValue);
			case IUPACpackagePackage.POSITION_INFORMATION:
				return createPositionInformationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IUPACpackagePackage.ENCODED_NAME:
				return convertEncodedNameToString(eDataType, instanceValue);
			case IUPACpackagePackage.ENCODED_BRANCH_NAME:
				return convertEncodedBranchNameToString(eDataType, instanceValue);
			case IUPACpackagePackage.PREFIX:
				return convertPrefixToString(eDataType, instanceValue);
			case IUPACpackagePackage.POSITION_INFORMATION:
				return convertPositionInformationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IUPAC createIUPAC() {
		IUPACImpl iupac = new IUPACImpl();
		return iupac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chain createChain() {
		ChainImpl chain = new ChainImpl();
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SummaryPrefix createSummaryPrefix() {
		SummaryPrefixImpl summaryPrefix = new SummaryPrefixImpl();
		return summaryPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodedName createEncodedNameFromString(EDataType eDataType, String initialValue) {
		EncodedName result = EncodedName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodedNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodedBranchName createEncodedBranchNameFromString(EDataType eDataType, String initialValue) {
		EncodedBranchName result = EncodedBranchName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodedBranchNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prefix createPrefixFromString(EDataType eDataType, String initialValue) {
		Prefix result = Prefix.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrefixToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionInformation createPositionInformationFromString(EDataType eDataType, String initialValue) {
		PositionInformation result = PositionInformation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionInformationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IUPACpackagePackage getIUPACpackagePackage() {
		return (IUPACpackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IUPACpackagePackage getPackage() {
		return IUPACpackagePackage.eINSTANCE;
	}

} //IUPACpackageFactoryImpl
