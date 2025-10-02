/**
 */
package IUPACpackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IUPACpackage.Position#getDigit <em>Digit</em>}</li>
 * </ul>
 *
 * @see IUPACpackage.IUPACpackagePackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Digit</b></em>' attribute.
	 * The default value is <code>"Two"</code>.
	 * The literals are from the enumeration {@link IUPACpackage.PositionInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digit</em>' attribute.
	 * @see IUPACpackage.PositionInformation
	 * @see #setDigit(PositionInformation)
	 * @see IUPACpackage.IUPACpackagePackage#getPosition_Digit()
	 * @model default="Two"
	 * @generated
	 */
	PositionInformation getDigit();

	/**
	 * Sets the value of the '{@link IUPACpackage.Position#getDigit <em>Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digit</em>' attribute.
	 * @see IUPACpackage.PositionInformation
	 * @see #getDigit()
	 * @generated
	 */
	void setDigit(PositionInformation value);

} // Position
