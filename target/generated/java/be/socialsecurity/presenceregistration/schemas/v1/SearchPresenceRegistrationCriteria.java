
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Search Presence Registration response Type
 * 
 * <p>Java class for SearchPresenceRegistrationCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPresenceRegistrationCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INSS" type="{http://socialsecurity.be/presenceregistration/schemas/v1}INSSType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CompanyIDType" minOccurs="0"/&gt;
 *         &lt;element name="WorkPlaceId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}WorkPlaceIdType" minOccurs="0"/&gt;
 *         &lt;element name="StatusList" type="{http://socialsecurity.be/presenceregistration/schemas/v1}StatusListType" minOccurs="0"/&gt;
 *         &lt;element name="RemarkList" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SearchRemarkListType" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationPeriodList" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RegistrationPeriodListType"/&gt;
 *         &lt;element name="CreationStartDate" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CreationDateType" minOccurs="0"/&gt;
 *         &lt;element name="CreationEndDate" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CreationDateType" minOccurs="0"/&gt;
 *         &lt;element name="Sector" type="{http://socialsecurity.be/presenceregistration/schemas/v1}WorkSectorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPresenceRegistrationCriteria", propOrder = {
    "inss",
    "companyID",
    "workPlaceId",
    "statusList",
    "remarkList",
    "registrationPeriodList",
    "creationStartDate",
    "creationEndDate",
    "sector"
})
public class SearchPresenceRegistrationCriteria {

    @XmlElement(name = "INSS")
    protected String inss;
    @XmlElement(name = "CompanyID")
    protected Long companyID;
    @XmlElement(name = "WorkPlaceId")
    protected String workPlaceId;
    @XmlElement(name = "StatusList")
    protected StatusListType statusList;
    @XmlElement(name = "RemarkList")
    protected SearchRemarkListType remarkList;
    @XmlElement(name = "RegistrationPeriodList", required = true)
    protected RegistrationPeriodListType registrationPeriodList;
    @XmlElement(name = "CreationStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationStartDate;
    @XmlElement(name = "CreationEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationEndDate;
    @XmlElement(name = "Sector")
    protected Integer sector;

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
     * Gets the value of the statusList property.
     * 
     * @return
     *     possible object is
     *     {@link StatusListType }
     *     
     */
    public StatusListType getStatusList() {
        return statusList;
    }

    /**
     * Sets the value of the statusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusListType }
     *     
     */
    public void setStatusList(StatusListType value) {
        this.statusList = value;
    }

    /**
     * Gets the value of the remarkList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRemarkListType }
     *     
     */
    public SearchRemarkListType getRemarkList() {
        return remarkList;
    }

    /**
     * Sets the value of the remarkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRemarkListType }
     *     
     */
    public void setRemarkList(SearchRemarkListType value) {
        this.remarkList = value;
    }

    /**
     * Gets the value of the registrationPeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationPeriodListType }
     *     
     */
    public RegistrationPeriodListType getRegistrationPeriodList() {
        return registrationPeriodList;
    }

    /**
     * Sets the value of the registrationPeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationPeriodListType }
     *     
     */
    public void setRegistrationPeriodList(RegistrationPeriodListType value) {
        this.registrationPeriodList = value;
    }

    /**
     * Gets the value of the creationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationStartDate() {
        return creationStartDate;
    }

    /**
     * Sets the value of the creationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationStartDate(XMLGregorianCalendar value) {
        this.creationStartDate = value;
    }

    /**
     * Gets the value of the creationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationEndDate() {
        return creationEndDate;
    }

    /**
     * Sets the value of the creationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationEndDate(XMLGregorianCalendar value) {
        this.creationEndDate = value;
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

}
