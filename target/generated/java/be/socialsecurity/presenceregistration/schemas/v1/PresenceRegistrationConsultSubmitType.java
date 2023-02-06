
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Definition of the Presence Registration Type
 * 
 * <p>Java class for PresenceRegistrationConsultSubmitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresenceRegistrationConsultSubmitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationDate" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RegistrationDateType" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="INSS" type="{http://socialsecurity.be/presenceregistration/schemas/v1}INSSType" minOccurs="0"/&gt;
 *           &lt;element name="CompanyID" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CompanyIDType" minOccurs="0"/&gt;
 *           &lt;element name="LimosaId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}LimosaIdType" minOccurs="0"/&gt;
 *           &lt;element name="VatNumber" type="{http://socialsecurity.be/presenceregistration/schemas/v1}VatNumberType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="WorkPlaceId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}WorkPlaceIdType"/&gt;
 *         &lt;element name="ClientPresenceRegistrationReference" type="{http://socialsecurity.be/presenceregistration/schemas/v1}ClientReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresenceRegistrationConsultSubmitType", propOrder = {
    "registrationDate",
    "inss",
    "companyID",
    "limosaId",
    "vatNumber",
    "workPlaceId",
    "clientPresenceRegistrationReference"
})
public class PresenceRegistrationConsultSubmitType {

    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "INSS")
    protected String inss;
    @XmlElement(name = "CompanyID")
    protected Long companyID;
    @XmlElement(name = "LimosaId")
    protected String limosaId;
    @XmlElement(name = "VatNumber")
    protected String vatNumber;
    @XmlElement(name = "WorkPlaceId", required = true)
    protected String workPlaceId;
    @XmlElement(name = "ClientPresenceRegistrationReference")
    protected String clientPresenceRegistrationReference;

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
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
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyID(Long value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the limosaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimosaId() {
        return limosaId;
    }

    /**
     * Sets the value of the limosaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimosaId(String value) {
        this.limosaId = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the workPlaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPlaceId() {
        return workPlaceId;
    }

    /**
     * Sets the value of the workPlaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPlaceId(String value) {
        this.workPlaceId = value;
    }

    /**
     * Gets the value of the clientPresenceRegistrationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPresenceRegistrationReference() {
        return clientPresenceRegistrationReference;
    }

    /**
     * Sets the value of the clientPresenceRegistrationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPresenceRegistrationReference(String value) {
        this.clientPresenceRegistrationReference = value;
    }

}
