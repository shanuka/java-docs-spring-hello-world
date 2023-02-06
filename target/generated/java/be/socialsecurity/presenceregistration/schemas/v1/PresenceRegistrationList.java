
package be.socialsecurity.presenceregistration.schemas.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of presence registration that match the search request criteria
 * 
 * <p>Java class for PresenceRegistrationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresenceRegistrationList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresenceRegistrationResultCount" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationResultCountType"/&gt;
 *         &lt;element name="PresenceRegistration" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationType" maxOccurs="500" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresenceRegistrationList", propOrder = {
    "presenceRegistrationResultCount",
    "presenceRegistration"
})
public class PresenceRegistrationList {

    @XmlElement(name = "PresenceRegistrationResultCount")
    protected long presenceRegistrationResultCount;
    @XmlElement(name = "PresenceRegistration")
    protected List<PresenceRegistrationType> presenceRegistration;

    /**
     * Gets the value of the presenceRegistrationResultCount property.
     * 
     */
    public long getPresenceRegistrationResultCount() {
        return presenceRegistrationResultCount;
    }

    /**
     * Sets the value of the presenceRegistrationResultCount property.
     * 
     */
    public void setPresenceRegistrationResultCount(long value) {
        this.presenceRegistrationResultCount = value;
    }

    /**
     * Gets the value of the presenceRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presenceRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresenceRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresenceRegistrationType }
     * 
     * 
     */
    public List<PresenceRegistrationType> getPresenceRegistration() {
        if (presenceRegistration == null) {
            presenceRegistration = new ArrayList<PresenceRegistrationType>();
        }
        return this.presenceRegistration;
    }

}
