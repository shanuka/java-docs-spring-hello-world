
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Presence Registration submitted to cancel
 * 
 * <p>Java class for CancelPresenceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPresenceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresenceRegistrationId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationIdType"/&gt;
 *         &lt;element name="CancellationReason" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CancelReasonType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPresenceRequestType", propOrder = {
    "presenceRegistrationId",
    "cancellationReason"
})
public class CancelPresenceRequestType {

    @XmlElement(name = "PresenceRegistrationId")
    protected long presenceRegistrationId;
    @XmlElement(name = "CancellationReason", required = true)
    protected String cancellationReason;

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

    /**
     * Gets the value of the cancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * Sets the value of the cancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReason(String value) {
        this.cancellationReason = value;
    }

}
