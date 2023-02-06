
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPresenceRegistrationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPresenceRegistrationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetPresenceRegistrationRequest" type="{http://socialsecurity.be/presenceregistration/schemas/v1}GetPresenceRegistrationRequestType"/&gt;
 *         &lt;element name="GetPresenceRegistrationType" type="{http://socialsecurity.be/presenceregistration/schemas/v1}GetPresenceRegistrationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPresenceRegistrationResponseType", propOrder = {
    "getPresenceRegistrationRequest",
    "getPresenceRegistrationType"
})
public class GetPresenceRegistrationResponseType {

    @XmlElement(name = "GetPresenceRegistrationRequest", required = true)
    protected GetPresenceRegistrationRequestType getPresenceRegistrationRequest;
    @XmlElement(name = "GetPresenceRegistrationType", required = true)
    protected GetPresenceRegistrationType getPresenceRegistrationType;

    /**
     * Gets the value of the getPresenceRegistrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetPresenceRegistrationRequestType }
     *     
     */
    public GetPresenceRegistrationRequestType getGetPresenceRegistrationRequest() {
        return getPresenceRegistrationRequest;
    }

    /**
     * Sets the value of the getPresenceRegistrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPresenceRegistrationRequestType }
     *     
     */
    public void setGetPresenceRegistrationRequest(GetPresenceRegistrationRequestType value) {
        this.getPresenceRegistrationRequest = value;
    }

    /**
     * Gets the value of the getPresenceRegistrationType property.
     * 
     * @return
     *     possible object is
     *     {@link GetPresenceRegistrationType }
     *     
     */
    public GetPresenceRegistrationType getGetPresenceRegistrationType() {
        return getPresenceRegistrationType;
    }

    /**
     * Sets the value of the getPresenceRegistrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPresenceRegistrationType }
     *     
     */
    public void setGetPresenceRegistrationType(GetPresenceRegistrationType value) {
        this.getPresenceRegistrationType = value;
    }

}
