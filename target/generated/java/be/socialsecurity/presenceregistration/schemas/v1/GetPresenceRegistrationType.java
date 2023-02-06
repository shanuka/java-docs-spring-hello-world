
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get presence registration response type
 * 
 * <p>Java class for GetPresenceRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPresenceRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresenceRegistrationType" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPresenceRegistrationType", propOrder = {
    "presenceRegistrationType"
})
public class GetPresenceRegistrationType {

    @XmlElement(name = "PresenceRegistrationType")
    protected PresenceRegistrationType presenceRegistrationType;

    /**
     * Gets the value of the presenceRegistrationType property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceRegistrationType }
     *     
     */
    public PresenceRegistrationType getPresenceRegistrationType() {
        return presenceRegistrationType;
    }

    /**
     * Sets the value of the presenceRegistrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceRegistrationType }
     *     
     */
    public void setPresenceRegistrationType(PresenceRegistrationType value) {
        this.presenceRegistrationType = value;
    }

}
