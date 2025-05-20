/**
 */
package IUPACpackage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.Branch#getBranchName <em>Branch Name</em>}</li>
 *   <li>{@link IUPACpackage.Branch#getMono <em>Mono</em>}</li>
 *   <li>{@link IUPACpackage.Branch#getDi <em>Di</em>}</li>
 *   <li>{@link IUPACpackage.Branch#getTri <em>Tri</em>}</li>
 *   <li>{@link IUPACpackage.Branch#getTetra <em>Tetra</em>}</li>
 *   <li>{@link IUPACpackage.Branch#getSummaryprefix <em>Summaryprefix</em>}</li>
 *   <li>{@link IUPACpackage.Branch#getPosition <em>Position</em>}</li>
 *   <li>{@link IUPACpackage.Branch#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see IUPACpackage.IUPACpackagePackage#getBranch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constraint_1'"
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch Name</b></em>' attribute.
	 * The default value is <code>"Methyl"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.EncodedBranchName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Name</em>' attribute.
	 * @see IUPACpackage.EncodedBranchName
	 * @see #setBranchName(EncodedBranchName)
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_BranchName()
	 * @model default="Methyl"
	 * @generated
	 */
	EncodedBranchName getBranchName();

	/**
	 * Sets the value of the '{@link IUPACpackage.Branch#getBranchName <em>Branch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Name</em>' attribute.
	 * @see IUPACpackage.EncodedBranchName
	 * @see #getBranchName()
	 * @generated
	 */
	void setBranchName(EncodedBranchName value);

	/**
	 * Returns the value of the '<em><b>Mono</b></em>' attribute.
	 * The default value is <code>"Mono"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.Prefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Our new attributes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mono</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #setMono(Prefix)
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_Mono()
	 * @model default="Mono"
	 * @generated
	 */
	Prefix getMono();

	/**
	 * Sets the value of the '{@link IUPACpackage.Branch#getMono <em>Mono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mono</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #getMono()
	 * @generated
	 */
	void setMono(Prefix value);

	/**
	 * Returns the value of the '<em><b>Di</b></em>' attribute.
	 * The default value is <code>"Di"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.Prefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Di</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #setDi(Prefix)
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_Di()
	 * @model default="Di"
	 * @generated
	 */
	Prefix getDi();

	/**
	 * Sets the value of the '{@link IUPACpackage.Branch#getDi <em>Di</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Di</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #getDi()
	 * @generated
	 */
	void setDi(Prefix value);

	/**
	 * Returns the value of the '<em><b>Tri</b></em>' attribute.
	 * The default value is <code>"Tri"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.Prefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tri</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #setTri(Prefix)
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_Tri()
	 * @model default="Tri"
	 * @generated
	 */
	Prefix getTri();

	/**
	 * Sets the value of the '{@link IUPACpackage.Branch#getTri <em>Tri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tri</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #getTri()
	 * @generated
	 */
	void setTri(Prefix value);

	/**
	 * Returns the value of the '<em><b>Tetra</b></em>' attribute.
	 * The default value is <code>"Tetra"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.Prefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tetra</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #setTetra(Prefix)
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_Tetra()
	 * @model default="Tetra"
	 * @generated
	 */
	Prefix getTetra();

	/**
	 * Sets the value of the '{@link IUPACpackage.Branch#getTetra <em>Tetra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tetra</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #getTetra()
	 * @generated
	 */
	void setTetra(Prefix value);

	/**
	 * Returns the value of the '<em><b>Summaryprefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summaryprefix</em>' containment reference.
	 * @see #setSummaryprefix(SummaryPrefix)
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_Summaryprefix()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SummaryPrefix getSummaryprefix();

	/**
	 * Sets the value of the '{@link IUPACpackage.Branch#getSummaryprefix <em>Summaryprefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summaryprefix</em>' containment reference.
	 * @see #getSummaryprefix()
	 * @generated
	 */
	void setSummaryprefix(SummaryPrefix value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference list.
	 * The list contents are of type {@link IUPACpackage.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference list.
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_Position()
	 * @model containment="true" required="true" upper="4"
	 * @generated
	 */
	EList<Position> getPosition();

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' containment reference.
	 * @see #setBranch(Branch)
	 * @see IUPACpackage.IUPACpackagePackage#getBranch_Branch()
	 * @model containment="true"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link IUPACpackage.Branch#getBranch <em>Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' containment reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Summary prefix must be consistent with the number of positions of branches with the same length.\',\n\tstatus : Boolean = \n\t\t\t(self.summaryprefix.prefix = mono and self.position -&gt; size() = 1)\n\t\t\tor (self.summaryprefix.prefix = di and self.position -&gt; size() = 2)\n\t\t\tor (self.summaryprefix.prefix = tri and self.position -&gt; size() = 3)\n\t\t\tor (self.summaryprefix.prefix = tetra and self.position -&gt; size() = 4)\n}.status'"
	 * @generated
	 */
	boolean constraint_1(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Branch
