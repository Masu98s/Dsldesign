/**
 */
package IUPACpackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IUPAC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.IUPAC#getChain <em>Chain</em>}</li>
 *   <li>{@link IUPACpackage.IUPAC#getBranch <em>Branch</em>}</li>
 *   <li>{@link IUPACpackage.IUPAC#getPosition <em>Position</em>}</li>
 *   <li>{@link IUPACpackage.IUPAC#getSummaryprefix <em>Summaryprefix</em>}</li>
 * </ul>
 *
 * @see IUPACpackage.IUPACpackagePackage#getIUPAC()
 * @model
 * @generated
 */
public interface IUPAC extends EObject {
	/**
	 * Returns the value of the '<em><b>Chain</b></em>' containment reference list.
	 * The list contents are of type {@link IUPACpackage.Chain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' containment reference list.
	 * @see IUPACpackage.IUPACpackagePackage#getIUPAC_Chain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chain> getChain();

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' containment reference list.
	 * The list contents are of type {@link IUPACpackage.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' containment reference list.
	 * @see IUPACpackage.IUPACpackagePackage#getIUPAC_Branch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranch();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference list.
	 * The list contents are of type {@link IUPACpackage.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference list.
	 * @see IUPACpackage.IUPACpackagePackage#getIUPAC_Position()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getPosition();

	/**
	 * Returns the value of the '<em><b>Summaryprefix</b></em>' containment reference list.
	 * The list contents are of type {@link IUPACpackage.SummaryPrefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summaryprefix</em>' containment reference list.
	 * @see IUPACpackage.IUPACpackagePackage#getIUPAC_Summaryprefix()
	 * @model containment="true"
	 * @generated
	 */
	EList<SummaryPrefix> getSummaryprefix();

} // IUPAC
