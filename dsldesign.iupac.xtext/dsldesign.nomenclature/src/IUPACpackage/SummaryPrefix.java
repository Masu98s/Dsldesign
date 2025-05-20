/**
 */
package IUPACpackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summary Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.SummaryPrefix#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see IUPACpackage.IUPACpackagePackage#getSummaryPrefix()
 * @model
 * @generated
 */
public interface SummaryPrefix extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>"Mono"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.Prefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #setPrefix(Prefix)
	 * @see IUPACpackage.IUPACpackagePackage#getSummaryPrefix_Prefix()
	 * @model default="Mono"
	 * @generated
	 */
	Prefix getPrefix();

	/**
	 * Sets the value of the '{@link IUPACpackage.SummaryPrefix#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see IUPACpackage.Prefix
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(Prefix value);

} // SummaryPrefix
