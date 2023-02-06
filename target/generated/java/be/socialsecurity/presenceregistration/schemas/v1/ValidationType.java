
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Validation Type of submitted presence registration
 * 
 * <p>Java class for ValidationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://socialsecurity.be/presenceregistration/schemas/v1}StatusType"/&gt;
 *         &lt;element name="ValidationDate" type="{http://socialsecurity.be/presenceregistration/schemas/v1}ValidationDateType" minOccurs="0"/&gt;
 *         &lt;element name="RemarkList" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RemarkListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationType", propOrder = {
    "status",
    "validationDate",
    "remarkList"
})
public class ValidationType {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StatusType status;
    @XmlElement(name = "ValidationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validationDate;
    @XmlElement(name = "RemarkList")
    protected RemarkListType remarkList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationDate(XMLGregorianCalendar value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the remarkList property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkListType }
     *     
     */
    public RemarkListType getRemarkList() {
        return remarkList;
    }

    /**
     * Sets the value of the remarkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkListType }
     *     
     */
    public void setRemarkList(RemarkListType value) {
        this.remarkList = value;
    }

}
