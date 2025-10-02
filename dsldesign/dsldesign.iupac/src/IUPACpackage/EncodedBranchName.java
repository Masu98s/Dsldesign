/**
 */
package IUPACpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Encoded Branch Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IUPACpackage.IUPACpackagePackage#getEncodedBranchName()
 * @model
 * @generated
 */
public enum EncodedBranchName implements Enumerator {
	/**
	 * The '<em><b>Methyl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHYL_VALUE
	 * @generated
	 * @ordered
	 */
	METHYL(1, "Methyl", "Methyl"),

	/**
	 * The '<em><b>Ethyl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHYL_VALUE
	 * @generated
	 * @ordered
	 */
	ETHYL(2, "Ethyl", "Ethyl"),

	/**
	 * The '<em><b>Propyl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPYL_VALUE
	 * @generated
	 * @ordered
	 */
	PROPYL(3, "Propyl", "Propyl"),

	/**
	 * The '<em><b>Butyl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTYL_VALUE
	 * @generated
	 * @ordered
	 */
	BUTYL(4, "Butyl", "Butyl");

	/**
	 * The '<em><b>Methyl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHYL
	 * @model name="Methyl"
	 * @generated
	 * @ordered
	 */
	public static final int METHYL_VALUE = 1;

	/**
	 * The '<em><b>Ethyl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHYL
	 * @model name="Ethyl"
	 * @generated
	 * @ordered
	 */
	public static final int ETHYL_VALUE = 2;

	/**
	 * The '<em><b>Propyl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPYL
	 * @model name="Propyl"
	 * @generated
	 * @ordered
	 */
	public static final int PROPYL_VALUE = 3;

	/**
	 * The '<em><b>Butyl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTYL
	 * @model name="Butyl"
	 * @generated
	 * @ordered
	 */
	public static final int BUTYL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Encoded Branch Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncodedBranchName[] VALUES_ARRAY =
		new EncodedBranchName[] {
			METHYL,
			ETHYL,
			PROPYL,
			BUTYL,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoded Branch Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncodedBranchName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoded Branch Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodedBranchName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodedBranchName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoded Branch Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodedBranchName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodedBranchName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoded Branch Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodedBranchName get(int value) {
		switch (value) {
			case METHYL_VALUE: return METHYL;
			case ETHYL_VALUE: return ETHYL;
			case PROPYL_VALUE: return PROPYL;
			case BUTYL_VALUE: return BUTYL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EncodedBranchName(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EncodedBranchName
