
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Presence Registration submitted
 * 
 * <p>Java class for RegisterPresenceRegistrationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterPresenceRegistrationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PresenceRegistration" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationType"/&gt;
 *         &lt;element name="PresenceRegistrationError" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RegisterPresenceRegistrationErrorType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterPresenceRegistrationResponse", propOrder = {
    "presenceRegistration",
    "presenceRegistrationError"
})
public class RegisterPresenceRegistrationResponse {

    @XmlElement(name = "PresenceRegistration")
    protected PresenceRegistrationType presenceRegistration;
    @XmlElement(name = "PresenceRegistrationError")
    protected RegisterPresenceRegistrationErrorType presenceRegistrationError;

    /**
     * Gets the value of the presenceRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceRegistrationType }
     *     
     */
    public PresenceRegistrationType getPresenceRegistration() {
        return presenceRegistration;
    }

    /**
     * Sets the value of the presenceRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceRegistrationType }
     *     
     */
    public void setPresenceRegistration(PresenceRegistrationType value) {
        this.presenceRegistration = value;
    }

    /**
     * Gets the value of the presenceRegistrationError property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterPresenceRegistrationErrorType }
     *     
     */
    public RegisterPresenceRegistrationErrorType getPresenceRegistrationError() {
        return presenceRegistrationError;
    }

    /**
     * Sets the value of the presenceRegistrationError property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterPresenceRegistrationErrorType }
     *     
     */
    public void setPresenceRegistrationError(RegisterPresenceRegistrationErrorType value) {
        this.presenceRegistrationError = value;
    }

}
