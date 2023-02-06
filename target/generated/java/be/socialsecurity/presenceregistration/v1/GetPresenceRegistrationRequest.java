
package be.socialsecurity.presenceregistration.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import be.socialsecurity.presenceregistration.schemas.v1.GetPresenceRegistrationRequestType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetPresenceRegistrationRequest" type="{http://socialsecurity.be/presenceregistration/schemas/v1}GetPresenceRegistrationRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPresenceRegistrationRequest"
})
@XmlRootElement(name = "GetPresenceRegistrationRequest")
public class GetPresenceRegistrationRequest {

    @XmlElement(name = "GetPresenceRegistrationRequest", required = true)
    protected GetPresenceRegistrationRequestType getPresenceRegistrationRequest;

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

}
