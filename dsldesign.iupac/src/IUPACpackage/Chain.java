/**
 */
package IUPACpackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.Chain#getEncodedName <em>Encoded Name</em>}</li>
 *   <li>{@link IUPACpackage.Chain#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see IUPACpackage.IUPACpackagePackage#getChain()
 * @model
 * @generated
 */
public interface Chain extends EObject {
	/**
	 * Returns the value of the '<em><b>Encoded Name</b></em>' attribute.
	 * The default value is <code>"Heptan"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.EncodedName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoded Name</em>' attribute.
	 * @see IUPACpackage.EncodedName
	 * @see #setEncodedName(EncodedName)
	 * @see IUPACpackage.IUPACpackagePackage#getChain_EncodedName()
	 * @model default="Heptan"
	 * @generated
	 */
	EncodedName getEncodedName();

	/**
	 * Sets the value of the '{@link IUPACpackage.Chain#getEncodedName <em>Encoded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoded Name</em>' attribute.
	 * @see IUPACpackage.EncodedName
	 * @see #getEncodedName()
	 * @generated
	 */
	void setEncodedName(EncodedName value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' containment reference list.
	 * The list contents are of type {@link IUPACpackage.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' containment reference list.
	 * @see IUPACpackage.IUPACpackagePackage#getChain_Branch()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Branch> getBranch();

} // Chain
