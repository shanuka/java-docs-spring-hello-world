
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Presence Registration submitted Type
 * 
 * <p>Java class for PresenceRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresenceRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PresenceRegistrationSubmitted" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationSubmitType"/&gt;
 *           &lt;element name="PresenceRegistrationConsultSubmitted" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationConsultSubmitType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Sector" type="{http://socialsecurity.be/presenceregistration/schemas/v1}WorkSectorType" minOccurs="0"/&gt;
 *         &lt;element name="INSS" type="{http://socialsecurity.be/presenceregistration/schemas/v1}INSSType" minOccurs="0"/&gt;
 *         &lt;element name="PresenceRegistrationId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationIdType"/&gt;
 *         &lt;element name="CreationDate" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CreationDateType"/&gt;
 *         &lt;element name="Channel" type="{http://socialsecurity.be/presenceregistration/schemas/v1}ChannelType"/&gt;
 *         &lt;element name="LastValidation" type="{http://socialsecurity.be/presenceregistration/schemas/v1}ValidationType"/&gt;
 *         &lt;element name="ValidationHistory" type="{http://socialsecurity.be/presenceregistration/schemas/v1}ValidationHistoryType" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SenderType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresenceRegistrationType", propOrder = {
    "presenceRegistrationSubmitted",
    "presenceRegistrationConsultSubmitted",
    "sector",
    "inss",
    "presenceRegistrationId",
    "creationDate",
    "channel",
    "lastValidation",
    "validationHistory",
    "sender"
})
public class PresenceRegistrationType {

    @XmlElement(name = "PresenceRegistrationSubmitted")
    protected PresenceRegistrationSubmitType presenceRegistrationSubmitted;
    @XmlElement(name = "PresenceRegistrationConsultSubmitted")
    protected PresenceRegistrationConsultSubmitType presenceRegistrationConsultSubmitted;
    @XmlElement(name = "Sector")
    protected Integer sector;
    @XmlElement(name = "INSS")
    protected String inss;
    @XmlElement(name = "PresenceRegistrationId")
    protected long presenceRegistrationId;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "Channel", required = true)
    protected String channel;
    @XmlElement(name = "LastValidation", required = true)
    protected ValidationType lastValidation;
    @XmlElement(name = "ValidationHistory")
    protected ValidationHistoryType validationHistory;
    @XmlElement(name = "Sender")
    protected SenderType sender;

    /**
     * Gets the value of the presenceRegistrationSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceRegistrationSubmitType }
     *     
     */
    public PresenceRegistrationSubmitType getPresenceRegistrationSubmitted() {
        return presenceRegistrationSubmitted;
    }

    /**
     * Sets the value of the presenceRegistrationSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceRegistrationSubmitType }
     *     
     */
    public void setPresenceRegistrationSubmitted(PresenceRegistrationSubmitType value) {
        this.presenceRegistrationSubmitted = value;
    }

    /**
     * Gets the value of the presenceRegistrationConsultSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceRegistrationConsultSubmitType }
     *     
     */
    public PresenceRegistrationConsultSubmitType getPresenceRegistrationConsultSubmitted() {
        return presenceRegistrationConsultSubmitted;
    }

    /**
     * Sets the value of the presenceRegistrationConsultSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceRegistrationConsultSubmitType }
     *     
     */
    public void setPresenceRegistrationConsultSubmitted(PresenceRegistrationConsultSubmitType value) {
        this.presenceRegistrationConsultSubmitted = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSector(Integer value) {
        this.sector = value;
    }

    /**
     * Gets the value of the inss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSS() {
        return inss;
    }

    /**
     * Sets the value of the inss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSS(String value) {
        this.inss = value;
    }

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
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the lastValidation property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationType }
     *     
     */
    public ValidationType getLastValidation() {
        return lastValidation;
    }

    /**
     * Sets the value of the lastValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationType }
     *     
     */
    public void setLastValidation(ValidationType value) {
        this.lastValidation = value;
    }

    /**
     * Gets the value of the validationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationHistoryType }
     *     
     */
    public ValidationHistoryType getValidationHistory() {
        return validationHistory;
    }

    /**
     * Sets the value of the validationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationHistoryType }
     *     
     */
    public void setValidationHistory(ValidationHistoryType value) {
        this.validationHistory = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link SenderType }
     *     
     */
    public SenderType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderType }
     *     
     */
    public void setSender(SenderType value) {
        this.sender = value;
    }

}
