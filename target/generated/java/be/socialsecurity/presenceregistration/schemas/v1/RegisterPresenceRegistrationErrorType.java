
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Presence Registration submitted and a list of generated errors
 * 
 * <p>Java class for RegisterPresenceRegistrationErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterPresenceRegistrationErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresenceRegistrationSubmitted" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationSubmitType"/&gt;
 *         &lt;element name="ErrorList" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RequestErrorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterPresenceRegistrationErrorType", propOrder = {
    "presenceRegistrationSubmitted",
    "errorList"
})
public class RegisterPresenceRegistrationErrorType {

    @XmlElement(name = "PresenceRegistrationSubmitted", required = true)
    protected PresenceRegistrationSubmitType presenceRegistrationSubmitted;
    @XmlElement(name = "ErrorList", required = true)
    protected RequestErrorType errorList;

    /**
     * Gets the value of the presenceRegistrationSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceRegistrationSubmitType }
     *     
     */
    public PresenceRegistrationSubmitType getPresenceRegistrationSubmitted() {
        return presenceRegistrationSubmitted;
    }

    /**
     * Sets the value of the presenceRegistrationSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceRegistrationSubmitType }
     *     
     */
    public void setPresenceRegistrationSubmitted(PresenceRegistrationSubmitType value) {
        this.presenceRegistrationSubmitted = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorType }
     *     
     */
    public RequestErrorType getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorType }
     *     
     */
    public void setErrorList(RequestErrorType value) {
        this.errorList = value;
    }

}
