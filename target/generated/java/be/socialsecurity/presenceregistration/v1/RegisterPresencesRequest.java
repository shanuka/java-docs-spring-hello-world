
package be.socialsecurity.presenceregistration.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import be.socialsecurity.presenceregistration.schemas.v1.PresenceRegistrationSubmitType;


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
 *         &lt;element name="PresenceRegistrationRequest" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationSubmitType" maxOccurs="200"/&gt;
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
    "presenceRegistrationRequest"
})
@XmlRootElement(name = "RegisterPresencesRequest")
public class RegisterPresencesRequest {

    @XmlElement(name = "PresenceRegistrationRequest", required = true)
    protected List<PresenceRegistrationSubmitType> presenceRegistrationRequest;

    /**
     * Gets the value of the presenceRegistrationRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presenceRegistrationRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresenceRegistrationRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresenceRegistrationSubmitType }
     * 
     * 
     */
    public List<PresenceRegistrationSubmitType> getPresenceRegistrationRequest() {
        if (presenceRegistrationRequest == null) {
            presenceRegistrationRequest = new ArrayList<PresenceRegistrationSubmitType>();
        }
        return this.presenceRegistrationRequest;
    }

}
