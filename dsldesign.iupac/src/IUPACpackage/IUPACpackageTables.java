/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /iupac.nomenclature/model/IUPAC.ecore
 * using:
 *   /iupac.nomenclature/model/IUPAC.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package IUPACpackage;

// import IUPACpackage.IUPACpackagePackage;
// import IUPACpackage.IUPACpackageTables;
import java.lang.String;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * IUPACpackageTables provides the dispatch tables for the IUPACpackage for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class IUPACpackageTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(IUPACpackagePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_IUPAC_ecore = IdManager.getNsURIPackageId("http://IUPAC.ecore", null, IUPACpackagePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Branch = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getClassId("Branch", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Chain = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getClassId("Chain", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IUPAC = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getClassId("IUPAC", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Position = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getClassId("Position", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SummaryPrefix = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getClassId("SummaryPrefix", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EncodedBranchName = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getEnumerationId("EncodedBranchName");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EncodedName = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getEnumerationId("EncodedName");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PositionInformation = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getEnumerationId("PositionInformation");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Prefix = IUPACpackageTables.PACKid_http_c_s_s_IUPAC_ecore.getEnumerationId("Prefix");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ IntegerValue INT_3 = ValueUtil.integerValueOf("3");
	public static final /*@NonInvalid*/ IntegerValue INT_4 = ValueUtil.integerValueOf("4");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR_Summary_32_prefix_32_must_32_be_32_consistent_32_with_32_the_32_number_32_of_32_positions_32_o = "Summary prefix must be consistent with the number of positions of branches with the same length.";
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Branch = TypeId.ORDERED_SET.getSpecializedId(IUPACpackageTables.CLSSid_Branch, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Branch_0 = TypeId.ORDERED_SET.getSpecializedId(IUPACpackageTables.CLSSid_Branch, true, ValueUtil.ZERO_VALUE, ValueUtil.integerValueOf(2));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Chain = TypeId.ORDERED_SET.getSpecializedId(IUPACpackageTables.CLSSid_Chain, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Position = TypeId.ORDERED_SET.getSpecializedId(IUPACpackageTables.CLSSid_Position, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Position_0 = TypeId.ORDERED_SET.getSpecializedId(IUPACpackageTables.CLSSid_Position, true, ValueUtil.ONE_VALUE, ValueUtil.integerValueOf(4));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SummaryPrefix = TypeId.ORDERED_SET.getSpecializedId(IUPACpackageTables.CLSSid_SummaryPrefix, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", IUPACpackageTables.PARTid_, IUPACpackageTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			IUPACpackageTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Branch = new EcoreExecutorType(IUPACpackagePackage.Literals.BRANCH, PACKAGE, 0);
		public static final EcoreExecutorType _Chain = new EcoreExecutorType(IUPACpackagePackage.Literals.CHAIN, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EncodedBranchName = new EcoreExecutorEnumeration(IUPACpackagePackage.Literals.ENCODED_BRANCH_NAME, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EncodedName = new EcoreExecutorEnumeration(IUPACpackagePackage.Literals.ENCODED_NAME, PACKAGE, 0);
		public static final EcoreExecutorType _IUPAC = new EcoreExecutorType(IUPACpackagePackage.Literals.IUPAC, PACKAGE, 0);
		public static final EcoreExecutorType _Position = new EcoreExecutorType(IUPACpackagePackage.Literals.POSITION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PositionInformation = new EcoreExecutorEnumeration(IUPACpackagePackage.Literals.POSITION_INFORMATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Prefix = new EcoreExecutorEnumeration(IUPACpackagePackage.Literals.PREFIX, PACKAGE, 0);
		public static final EcoreExecutorType _SummaryPrefix = new EcoreExecutorType(IUPACpackagePackage.Literals.SUMMARY_PREFIX, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Branch,
			_Chain,
			_EncodedBranchName,
			_EncodedName,
			_IUPAC,
			_Position,
			_PositionInformation,
			_Prefix,
			_SummaryPrefix
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Branch__Branch = new ExecutorFragment(Types._Branch, IUPACpackageTables.Types._Branch);
		private static final ExecutorFragment _Branch__OclAny = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Branch__OclElement = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Chain__Chain = new ExecutorFragment(Types._Chain, IUPACpackageTables.Types._Chain);
		private static final ExecutorFragment _Chain__OclAny = new ExecutorFragment(Types._Chain, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Chain__OclElement = new ExecutorFragment(Types._Chain, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EncodedBranchName__EncodedBranchName = new ExecutorFragment(Types._EncodedBranchName, IUPACpackageTables.Types._EncodedBranchName);
		private static final ExecutorFragment _EncodedBranchName__OclAny = new ExecutorFragment(Types._EncodedBranchName, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EncodedBranchName__OclElement = new ExecutorFragment(Types._EncodedBranchName, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EncodedBranchName__OclEnumeration = new ExecutorFragment(Types._EncodedBranchName, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EncodedBranchName__OclType = new ExecutorFragment(Types._EncodedBranchName, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EncodedName__EncodedName = new ExecutorFragment(Types._EncodedName, IUPACpackageTables.Types._EncodedName);
		private static final ExecutorFragment _EncodedName__OclAny = new ExecutorFragment(Types._EncodedName, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EncodedName__OclElement = new ExecutorFragment(Types._EncodedName, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EncodedName__OclEnumeration = new ExecutorFragment(Types._EncodedName, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EncodedName__OclType = new ExecutorFragment(Types._EncodedName, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _IUPAC__IUPAC = new ExecutorFragment(Types._IUPAC, IUPACpackageTables.Types._IUPAC);
		private static final ExecutorFragment _IUPAC__OclAny = new ExecutorFragment(Types._IUPAC, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IUPAC__OclElement = new ExecutorFragment(Types._IUPAC, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Position__OclAny = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Position__OclElement = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Position__Position = new ExecutorFragment(Types._Position, IUPACpackageTables.Types._Position);

		private static final ExecutorFragment _PositionInformation__OclAny = new ExecutorFragment(Types._PositionInformation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PositionInformation__OclElement = new ExecutorFragment(Types._PositionInformation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PositionInformation__OclEnumeration = new ExecutorFragment(Types._PositionInformation, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PositionInformation__OclType = new ExecutorFragment(Types._PositionInformation, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PositionInformation__PositionInformation = new ExecutorFragment(Types._PositionInformation, IUPACpackageTables.Types._PositionInformation);

		private static final ExecutorFragment _Prefix__OclAny = new ExecutorFragment(Types._Prefix, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Prefix__OclElement = new ExecutorFragment(Types._Prefix, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Prefix__OclEnumeration = new ExecutorFragment(Types._Prefix, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Prefix__OclType = new ExecutorFragment(Types._Prefix, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Prefix__Prefix = new ExecutorFragment(Types._Prefix, IUPACpackageTables.Types._Prefix);

		private static final ExecutorFragment _SummaryPrefix__OclAny = new ExecutorFragment(Types._SummaryPrefix, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SummaryPrefix__OclElement = new ExecutorFragment(Types._SummaryPrefix, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SummaryPrefix__SummaryPrefix = new ExecutorFragment(Types._SummaryPrefix, IUPACpackageTables.Types._SummaryPrefix);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Branch__branch = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__BRANCH, Types._Branch, 0);
		public static final ExecutorProperty _Branch__branchName = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__BRANCH_NAME, Types._Branch, 1);
		public static final ExecutorProperty _Branch__di = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__DI, Types._Branch, 2);
		public static final ExecutorProperty _Branch__mono = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__MONO, Types._Branch, 3);
		public static final ExecutorProperty _Branch__position = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__POSITION, Types._Branch, 4);
		public static final ExecutorProperty _Branch__summaryprefix = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__SUMMARYPREFIX, Types._Branch, 5);
		public static final ExecutorProperty _Branch__tetra = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__TETRA, Types._Branch, 6);
		public static final ExecutorProperty _Branch__tri = new EcoreExecutorProperty(IUPACpackagePackage.Literals.BRANCH__TRI, Types._Branch, 7);
		public static final ExecutorProperty _Branch__Branch__branch = new ExecutorPropertyWithImplementation("Branch", Types._Branch, 8, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.BRANCH__BRANCH));
		public static final ExecutorProperty _Branch__Chain__branch = new ExecutorPropertyWithImplementation("Chain", Types._Branch, 9, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.CHAIN__BRANCH));
		public static final ExecutorProperty _Branch__IUPAC__branch = new ExecutorPropertyWithImplementation("IUPAC", Types._Branch, 10, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.IUPAC__BRANCH));

		public static final ExecutorProperty _Chain__branch = new EcoreExecutorProperty(IUPACpackagePackage.Literals.CHAIN__BRANCH, Types._Chain, 0);
		public static final ExecutorProperty _Chain__encodedName = new EcoreExecutorProperty(IUPACpackagePackage.Literals.CHAIN__ENCODED_NAME, Types._Chain, 1);
		public static final ExecutorProperty _Chain__IUPAC__chain = new ExecutorPropertyWithImplementation("IUPAC", Types._Chain, 2, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.IUPAC__CHAIN));

		public static final ExecutorProperty _IUPAC__branch = new EcoreExecutorProperty(IUPACpackagePackage.Literals.IUPAC__BRANCH, Types._IUPAC, 0);
		public static final ExecutorProperty _IUPAC__chain = new EcoreExecutorProperty(IUPACpackagePackage.Literals.IUPAC__CHAIN, Types._IUPAC, 1);
		public static final ExecutorProperty _IUPAC__position = new EcoreExecutorProperty(IUPACpackagePackage.Literals.IUPAC__POSITION, Types._IUPAC, 2);
		public static final ExecutorProperty _IUPAC__summaryprefix = new EcoreExecutorProperty(IUPACpackagePackage.Literals.IUPAC__SUMMARYPREFIX, Types._IUPAC, 3);

		public static final ExecutorProperty _Position__digit = new EcoreExecutorProperty(IUPACpackagePackage.Literals.POSITION__DIGIT, Types._Position, 0);
		public static final ExecutorProperty _Position__Branch__position = new ExecutorPropertyWithImplementation("Branch", Types._Position, 1, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.BRANCH__POSITION));
		public static final ExecutorProperty _Position__IUPAC__position = new ExecutorPropertyWithImplementation("IUPAC", Types._Position, 2, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.IUPAC__POSITION));

		public static final ExecutorProperty _SummaryPrefix__prefix = new EcoreExecutorProperty(IUPACpackagePackage.Literals.SUMMARY_PREFIX__PREFIX, Types._SummaryPrefix, 0);
		public static final ExecutorProperty _SummaryPrefix__Branch__summaryprefix = new ExecutorPropertyWithImplementation("Branch", Types._SummaryPrefix, 1, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.BRANCH__SUMMARYPREFIX));
		public static final ExecutorProperty _SummaryPrefix__IUPAC__summaryprefix = new ExecutorPropertyWithImplementation("IUPAC", Types._SummaryPrefix, 2, new EcoreLibraryOppositeProperty(IUPACpackagePackage.Literals.IUPAC__SUMMARYPREFIX));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Branch =
			{
				Fragments._Branch__OclAny /* 0 */,
				Fragments._Branch__OclElement /* 1 */,
				Fragments._Branch__Branch /* 2 */
			};
		private static final int /*@NonNull*/ [] __Branch = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Chain =
			{
				Fragments._Chain__OclAny /* 0 */,
				Fragments._Chain__OclElement /* 1 */,
				Fragments._Chain__Chain /* 2 */
			};
		private static final int /*@NonNull*/ [] __Chain = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EncodedBranchName =
			{
				Fragments._EncodedBranchName__OclAny /* 0 */,
				Fragments._EncodedBranchName__OclElement /* 1 */,
				Fragments._EncodedBranchName__OclType /* 2 */,
				Fragments._EncodedBranchName__OclEnumeration /* 3 */,
				Fragments._EncodedBranchName__EncodedBranchName /* 4 */
			};
		private static final int /*@NonNull*/ [] __EncodedBranchName = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EncodedName =
			{
				Fragments._EncodedName__OclAny /* 0 */,
				Fragments._EncodedName__OclElement /* 1 */,
				Fragments._EncodedName__OclType /* 2 */,
				Fragments._EncodedName__OclEnumeration /* 3 */,
				Fragments._EncodedName__EncodedName /* 4 */
			};
		private static final int /*@NonNull*/ [] __EncodedName = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IUPAC =
			{
				Fragments._IUPAC__OclAny /* 0 */,
				Fragments._IUPAC__OclElement /* 1 */,
				Fragments._IUPAC__IUPAC /* 2 */
			};
		private static final int /*@NonNull*/ [] __IUPAC = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Position =
			{
				Fragments._Position__OclAny /* 0 */,
				Fragments._Position__OclElement /* 1 */,
				Fragments._Position__Position /* 2 */
			};
		private static final int /*@NonNull*/ [] __Position = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PositionInformation =
			{
				Fragments._PositionInformation__OclAny /* 0 */,
				Fragments._PositionInformation__OclElement /* 1 */,
				Fragments._PositionInformation__OclType /* 2 */,
				Fragments._PositionInformation__OclEnumeration /* 3 */,
				Fragments._PositionInformation__PositionInformation /* 4 */
			};
		private static final int /*@NonNull*/ [] __PositionInformation = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Prefix =
			{
				Fragments._Prefix__OclAny /* 0 */,
				Fragments._Prefix__OclElement /* 1 */,
				Fragments._Prefix__OclType /* 2 */,
				Fragments._Prefix__OclEnumeration /* 3 */,
				Fragments._Prefix__Prefix /* 4 */
			};
		private static final int /*@NonNull*/ [] __Prefix = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SummaryPrefix =
			{
				Fragments._SummaryPrefix__OclAny /* 0 */,
				Fragments._SummaryPrefix__OclElement /* 1 */,
				Fragments._SummaryPrefix__SummaryPrefix /* 2 */
			};
		private static final int /*@NonNull*/ [] __SummaryPrefix = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Branch.initFragments(_Branch, __Branch);
			Types._Chain.initFragments(_Chain, __Chain);
			Types._EncodedBranchName.initFragments(_EncodedBranchName, __EncodedBranchName);
			Types._EncodedName.initFragments(_EncodedName, __EncodedName);
			Types._IUPAC.initFragments(_IUPAC, __IUPAC);
			Types._Position.initFragments(_Position, __Position);
			Types._PositionInformation.initFragments(_PositionInformation, __PositionInformation);
			Types._Prefix.initFragments(_Prefix, __Prefix);
			Types._SummaryPrefix.initFragments(_SummaryPrefix, __SummaryPrefix);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Branch__Branch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Chain__Chain = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Chain__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Chain__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EncodedBranchName__EncodedBranchName = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedBranchName__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedBranchName__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedBranchName__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedBranchName__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EncodedName__EncodedName = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedName__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedName__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedName__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncodedName__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IUPAC__IUPAC = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IUPAC__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IUPAC__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Position__Position = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Position__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Position__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PositionInformation__PositionInformation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PositionInformation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PositionInformation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PositionInformation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PositionInformation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Prefix__Prefix = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Prefix__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Prefix__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Prefix__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Prefix__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SummaryPrefix__SummaryPrefix = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SummaryPrefix__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SummaryPrefix__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Branch__Branch.initOperations(_Branch__Branch);
			Fragments._Branch__OclAny.initOperations(_Branch__OclAny);
			Fragments._Branch__OclElement.initOperations(_Branch__OclElement);

			Fragments._Chain__Chain.initOperations(_Chain__Chain);
			Fragments._Chain__OclAny.initOperations(_Chain__OclAny);
			Fragments._Chain__OclElement.initOperations(_Chain__OclElement);

			Fragments._EncodedBranchName__EncodedBranchName.initOperations(_EncodedBranchName__EncodedBranchName);
			Fragments._EncodedBranchName__OclAny.initOperations(_EncodedBranchName__OclAny);
			Fragments._EncodedBranchName__OclElement.initOperations(_EncodedBranchName__OclElement);
			Fragments._EncodedBranchName__OclEnumeration.initOperations(_EncodedBranchName__OclEnumeration);
			Fragments._EncodedBranchName__OclType.initOperations(_EncodedBranchName__OclType);

			Fragments._EncodedName__EncodedName.initOperations(_EncodedName__EncodedName);
			Fragments._EncodedName__OclAny.initOperations(_EncodedName__OclAny);
			Fragments._EncodedName__OclElement.initOperations(_EncodedName__OclElement);
			Fragments._EncodedName__OclEnumeration.initOperations(_EncodedName__OclEnumeration);
			Fragments._EncodedName__OclType.initOperations(_EncodedName__OclType);

			Fragments._IUPAC__IUPAC.initOperations(_IUPAC__IUPAC);
			Fragments._IUPAC__OclAny.initOperations(_IUPAC__OclAny);
			Fragments._IUPAC__OclElement.initOperations(_IUPAC__OclElement);

			Fragments._Position__OclAny.initOperations(_Position__OclAny);
			Fragments._Position__OclElement.initOperations(_Position__OclElement);
			Fragments._Position__Position.initOperations(_Position__Position);

			Fragments._PositionInformation__OclAny.initOperations(_PositionInformation__OclAny);
			Fragments._PositionInformation__OclElement.initOperations(_PositionInformation__OclElement);
			Fragments._PositionInformation__OclEnumeration.initOperations(_PositionInformation__OclEnumeration);
			Fragments._PositionInformation__OclType.initOperations(_PositionInformation__OclType);
			Fragments._PositionInformation__PositionInformation.initOperations(_PositionInformation__PositionInformation);

			Fragments._Prefix__OclAny.initOperations(_Prefix__OclAny);
			Fragments._Prefix__OclElement.initOperations(_Prefix__OclElement);
			Fragments._Prefix__OclEnumeration.initOperations(_Prefix__OclEnumeration);
			Fragments._Prefix__OclType.initOperations(_Prefix__OclType);
			Fragments._Prefix__Prefix.initOperations(_Prefix__Prefix);

			Fragments._SummaryPrefix__OclAny.initOperations(_SummaryPrefix__OclAny);
			Fragments._SummaryPrefix__OclElement.initOperations(_SummaryPrefix__OclElement);
			Fragments._SummaryPrefix__SummaryPrefix.initOperations(_SummaryPrefix__SummaryPrefix);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Branch = {
			IUPACpackageTables.Properties._Branch__branch,
			IUPACpackageTables.Properties._Branch__branchName,
			IUPACpackageTables.Properties._Branch__di,
			IUPACpackageTables.Properties._Branch__mono,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			IUPACpackageTables.Properties._Branch__position,
			IUPACpackageTables.Properties._Branch__summaryprefix,
			IUPACpackageTables.Properties._Branch__tetra,
			IUPACpackageTables.Properties._Branch__tri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Chain = {
			IUPACpackageTables.Properties._Chain__branch,
			IUPACpackageTables.Properties._Chain__encodedName,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EncodedBranchName = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EncodedName = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IUPAC = {
			IUPACpackageTables.Properties._IUPAC__branch,
			IUPACpackageTables.Properties._IUPAC__chain,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			IUPACpackageTables.Properties._IUPAC__position,
			IUPACpackageTables.Properties._IUPAC__summaryprefix
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Position = {
			IUPACpackageTables.Properties._Position__digit,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PositionInformation = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Prefix = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SummaryPrefix = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			IUPACpackageTables.Properties._SummaryPrefix__prefix
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Branch__Branch.initProperties(_Branch);
			Fragments._Chain__Chain.initProperties(_Chain);
			Fragments._EncodedBranchName__EncodedBranchName.initProperties(_EncodedBranchName);
			Fragments._EncodedName__EncodedName.initProperties(_EncodedName);
			Fragments._IUPAC__IUPAC.initProperties(_IUPAC);
			Fragments._Position__Position.initProperties(_Position);
			Fragments._PositionInformation__PositionInformation.initProperties(_PositionInformation);
			Fragments._Prefix__Prefix.initProperties(_Prefix);
			Fragments._SummaryPrefix__SummaryPrefix.initProperties(_SummaryPrefix);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _EncodedBranchName__Methyl = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_BRANCH_NAME.getEEnumLiteral("Methyl"), Types._EncodedBranchName, 0);
		public static final EcoreExecutorEnumerationLiteral _EncodedBranchName__Ethyl = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_BRANCH_NAME.getEEnumLiteral("Ethyl"), Types._EncodedBranchName, 1);
		public static final EcoreExecutorEnumerationLiteral _EncodedBranchName__Propyl = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_BRANCH_NAME.getEEnumLiteral("Propyl"), Types._EncodedBranchName, 2);
		public static final EcoreExecutorEnumerationLiteral _EncodedBranchName__Butyl = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_BRANCH_NAME.getEEnumLiteral("Butyl"), Types._EncodedBranchName, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EncodedBranchName = {
			_EncodedBranchName__Methyl,
			_EncodedBranchName__Ethyl,
			_EncodedBranchName__Propyl,
			_EncodedBranchName__Butyl
		};

		public static final EcoreExecutorEnumerationLiteral _EncodedName__Methan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Methan"), Types._EncodedName, 0);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Ethan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Ethan"), Types._EncodedName, 1);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Propan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Propan"), Types._EncodedName, 2);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Butan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Butan"), Types._EncodedName, 3);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Pentan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Pentan"), Types._EncodedName, 4);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Hexan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Hexan"), Types._EncodedName, 5);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Heptan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Heptan"), Types._EncodedName, 6);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Octan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Octan"), Types._EncodedName, 7);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Nonan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Nonan"), Types._EncodedName, 8);
		public static final EcoreExecutorEnumerationLiteral _EncodedName__Decan = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.ENCODED_NAME.getEEnumLiteral("Decan"), Types._EncodedName, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EncodedName = {
			_EncodedName__Methan,
			_EncodedName__Ethan,
			_EncodedName__Propan,
			_EncodedName__Butan,
			_EncodedName__Pentan,
			_EncodedName__Hexan,
			_EncodedName__Heptan,
			_EncodedName__Octan,
			_EncodedName__Nonan,
			_EncodedName__Decan
		};

		public static final EcoreExecutorEnumerationLiteral _PositionInformation__One = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("One"), Types._PositionInformation, 0);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Two = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Two"), Types._PositionInformation, 1);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Three = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Three"), Types._PositionInformation, 2);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Four = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Four"), Types._PositionInformation, 3);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Five = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Five"), Types._PositionInformation, 4);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Six = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Six"), Types._PositionInformation, 5);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Seven = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Seven"), Types._PositionInformation, 6);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Eight = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Eight"), Types._PositionInformation, 7);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Nine = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Nine"), Types._PositionInformation, 8);
		public static final EcoreExecutorEnumerationLiteral _PositionInformation__Ten = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.POSITION_INFORMATION.getEEnumLiteral("Ten"), Types._PositionInformation, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PositionInformation = {
			_PositionInformation__One,
			_PositionInformation__Two,
			_PositionInformation__Three,
			_PositionInformation__Four,
			_PositionInformation__Five,
			_PositionInformation__Six,
			_PositionInformation__Seven,
			_PositionInformation__Eight,
			_PositionInformation__Nine,
			_PositionInformation__Ten
		};

		public static final EcoreExecutorEnumerationLiteral _Prefix__Mono = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.PREFIX.getEEnumLiteral("Mono"), Types._Prefix, 0);
		public static final EcoreExecutorEnumerationLiteral _Prefix__Di = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.PREFIX.getEEnumLiteral("Di"), Types._Prefix, 1);
		public static final EcoreExecutorEnumerationLiteral _Prefix__Tri = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.PREFIX.getEEnumLiteral("Tri"), Types._Prefix, 2);
		public static final EcoreExecutorEnumerationLiteral _Prefix__Tetra = new EcoreExecutorEnumerationLiteral(IUPACpackagePackage.Literals.PREFIX.getEEnumLiteral("Tetra"), Types._Prefix, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Prefix = {
			_Prefix__Mono,
			_Prefix__Di,
			_Prefix__Tri,
			_Prefix__Tetra
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EncodedBranchName.initLiterals(_EncodedBranchName);
			Types._EncodedName.initLiterals(_EncodedName);
			Types._PositionInformation.initLiterals(_PositionInformation);
			Types._Prefix.initLiterals(_Prefix);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of IUPACpackageTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new IUPACpackageTables();
	}

	private IUPACpackageTables() {
		super(IUPACpackagePackage.eNS_URI);
	}
}
