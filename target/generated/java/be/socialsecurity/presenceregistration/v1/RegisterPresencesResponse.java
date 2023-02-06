
package be.socialsecurity.presenceregistration.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import be.socialsecurity.presenceregistration.schemas.v1.RegisterPresenceRegistrationResponse;


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
 *         &lt;element name="PresenceRegistrationResponse" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RegisterPresenceRegistrationResponse" maxOccurs="200"/&gt;
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
    "presenceRegistrationResponse"
})
@XmlRootElement(name = "RegisterPresencesResponse")
public class RegisterPresencesResponse {

    @XmlElement(name = "PresenceRegistrationResponse", required = true)
    protected List<RegisterPresenceRegistrationResponse> presenceRegistrationResponse;

    /**
     * Gets the value of the presenceRegistrationResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presenceRegistrationResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresenceRegistrationResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterPresenceRegistrationResponse }
     * 
     * 
     */
    public List<RegisterPresenceRegistrationResponse> getPresenceRegistrationResponse() {
        if (presenceRegistrationResponse == null) {
            presenceRegistrationResponse = new ArrayList<RegisterPresenceRegistrationResponse>();
        }
        return this.presenceRegistrationResponse;
    }

}
