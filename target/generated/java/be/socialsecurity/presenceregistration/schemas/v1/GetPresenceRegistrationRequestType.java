
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPresenceRegistrationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPresenceRegistrationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresenceRegistrationId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPresenceRegistrationRequestType", propOrder = {
    "presenceRegistrationId"
})
public class GetPresenceRegistrationRequestType {

    @XmlElement(name = "PresenceRegistrationId")
    protected long presenceRegistrationId;

    /**
     * Gets the value of the presenceRegistrationId property.
     * 
     */
    public long getPresenceRegistrationId() {
        return presenceRegistrationId;
    }

    /**
     * Sets the value of the presenceRegistrationId property.
     * 
     */
    public void setPresenceRegistrationId(long value) {
        this.presenceRegistrationId = value;
    }

}
