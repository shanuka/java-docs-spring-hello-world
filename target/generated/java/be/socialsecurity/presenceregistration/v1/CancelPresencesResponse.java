
package be.socialsecurity.presenceregistration.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import be.socialsecurity.presenceregistration.schemas.v1.CancelPresenceRegistrationResponse;


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
 *         &lt;element name="CancelPresenceResponse" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CancelPresenceRegistrationResponse" maxOccurs="200"/&gt;
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
    "cancelPresenceResponse"
})
@XmlRootElement(name = "CancelPresencesResponse")
public class CancelPresencesResponse {

    @XmlElement(name = "CancelPresenceResponse", required = true)
    protected List<CancelPresenceRegistrationResponse> cancelPresenceResponse;

    /**
     * Gets the value of the cancelPresenceResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPresenceResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPresenceResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelPresenceRegistrationResponse }
     * 
     * 
     */
    public List<CancelPresenceRegistrationResponse> getCancelPresenceResponse() {
        if (cancelPresenceResponse == null) {
            cancelPresenceResponse = new ArrayList<CancelPresenceRegistrationResponse>();
        }
        return this.cancelPresenceResponse;
    }

}
