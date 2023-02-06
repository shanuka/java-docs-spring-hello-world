
package be.socialsecurity.presenceregistration.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import be.socialsecurity.presenceregistration.schemas.v1.CancelPresenceRequestType;


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
 *         &lt;element name="CancelPresenceRequest" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CancelPresenceRequestType" maxOccurs="200"/&gt;
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
    "cancelPresenceRequest"
})
@XmlRootElement(name = "CancelPresencesRequest")
public class CancelPresencesRequest {

    @XmlElement(name = "CancelPresenceRequest", required = true)
    protected List<CancelPresenceRequestType> cancelPresenceRequest;

    /**
     * Gets the value of the cancelPresenceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPresenceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPresenceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelPresenceRequestType }
     * 
     * 
     */
    public List<CancelPresenceRequestType> getCancelPresenceRequest() {
        if (cancelPresenceRequest == null) {
            cancelPresenceRequest = new ArrayList<CancelPresenceRequestType>();
        }
        return this.cancelPresenceRequest;
    }

}
