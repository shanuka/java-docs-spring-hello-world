
package be.socialsecurity.presenceregistration.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import be.socialsecurity.presenceregistration.schemas.v1.GetPresenceRegistrationResponseType;


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
 *         &lt;element name="GetPresenceRegistrationResponseType" type="{http://socialsecurity.be/presenceregistration/schemas/v1}GetPresenceRegistrationResponseType"/&gt;
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
    "getPresenceRegistrationResponseType"
})
@XmlRootElement(name = "GetPresenceRegistrationResponse")
public class GetPresenceRegistrationResponse {

    @XmlElement(name = "GetPresenceRegistrationResponseType", required = true)
    protected GetPresenceRegistrationResponseType getPresenceRegistrationResponseType;

    /**
     * Gets the value of the getPresenceRegistrationResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link GetPresenceRegistrationResponseType }
     *     
     */
    public GetPresenceRegistrationResponseType getGetPresenceRegistrationResponseType() {
        return getPresenceRegistrationResponseType;
    }

    /**
     * Sets the value of the getPresenceRegistrationResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPresenceRegistrationResponseType }
     *     
     */
    public void setGetPresenceRegistrationResponseType(GetPresenceRegistrationResponseType value) {
        this.getPresenceRegistrationResponseType = value;
    }

}
