
package be.socialsecurity.presenceregistration.schemas.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Date Interval used to search Presence Registration
 * 
 * <p>Java class for RegistrationPeriodListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationPeriodListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationPeriod" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RegistrationPeriodType" maxOccurs="31"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationPeriodListType", propOrder = {
    "registrationPeriod"
})
public class RegistrationPeriodListType {

    @XmlElement(name = "RegistrationPeriod", required = true)
    protected List<RegistrationPeriodType> registrationPeriod;

    /**
     * Gets the value of the registrationPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationPeriodType }
     * 
     * 
     */
    public List<RegistrationPeriodType> getRegistrationPeriod() {
        if (registrationPeriod == null) {
            registrationPeriod = new ArrayList<RegistrationPeriodType>();
        }
        return this.registrationPeriod;
    }

}
