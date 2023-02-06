
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Date Interval for searching Presence Registration
 * 
 * <p>Java class for RegistrationPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationPeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationPeriodStartDate" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RegistrationDateType"/&gt;
 *         &lt;element name="RegistrationPeriodEndDate" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RegistrationDateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationPeriodType", propOrder = {
    "registrationPeriodStartDate",
    "registrationPeriodEndDate"
})
public class RegistrationPeriodType {

    @XmlElement(name = "RegistrationPeriodStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationPeriodStartDate;
    @XmlElement(name = "RegistrationPeriodEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationPeriodEndDate;

    /**
     * Gets the value of the registrationPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationPeriodStartDate() {
        return registrationPeriodStartDate;
    }

    /**
     * Sets the value of the registrationPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationPeriodStartDate(XMLGregorianCalendar value) {
        this.registrationPeriodStartDate = value;
    }

    /**
     * Gets the value of the registrationPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationPeriodEndDate() {
        return registrationPeriodEndDate;
    }

    /**
     * Sets the value of the registrationPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationPeriodEndDate(XMLGregorianCalendar value) {
        this.registrationPeriodEndDate = value;
    }

}
