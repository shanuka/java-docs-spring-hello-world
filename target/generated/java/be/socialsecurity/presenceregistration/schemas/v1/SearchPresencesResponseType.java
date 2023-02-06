
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search Presence Registration response Type
 * 
 * <p>Java class for SearchPresencesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPresencesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchPresencesRequest" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SearchPresencesRequestType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PresenceRegistrationList" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PresenceRegistrationList"/&gt;
 *           &lt;element name="PresenceRegistrationError" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SearchPresenceRegistrationErrorType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPresencesResponseType", propOrder = {
    "searchPresencesRequest",
    "presenceRegistrationList",
    "presenceRegistrationError"
})
public class SearchPresencesResponseType {

    @XmlElement(name = "SearchPresencesRequest", required = true)
    protected SearchPresencesRequestType searchPresencesRequest;
    @XmlElement(name = "PresenceRegistrationList")
    protected PresenceRegistrationList presenceRegistrationList;
    @XmlElement(name = "PresenceRegistrationError")
    protected SearchPresenceRegistrationErrorType presenceRegistrationError;

    /**
     * Gets the value of the searchPresencesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPresencesRequestType }
     *     
     */
    public SearchPresencesRequestType getSearchPresencesRequest() {
        return searchPresencesRequest;
    }

    /**
     * Sets the value of the searchPresencesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPresencesRequestType }
     *     
     */
    public void setSearchPresencesRequest(SearchPresencesRequestType value) {
        this.searchPresencesRequest = value;
    }

    /**
     * Gets the value of the presenceRegistrationList property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceRegistrationList }
     *     
     */
    public PresenceRegistrationList getPresenceRegistrationList() {
        return presenceRegistrationList;
    }

    /**
     * Sets the value of the presenceRegistrationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceRegistrationList }
     *     
     */
    public void setPresenceRegistrationList(PresenceRegistrationList value) {
        this.presenceRegistrationList = value;
    }

    /**
     * Gets the value of the presenceRegistrationError property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPresenceRegistrationErrorType }
     *     
     */
    public SearchPresenceRegistrationErrorType getPresenceRegistrationError() {
        return presenceRegistrationError;
    }

    /**
     * Sets the value of the presenceRegistrationError property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPresenceRegistrationErrorType }
     *     
     */
    public void setPresenceRegistrationError(SearchPresenceRegistrationErrorType value) {
        this.presenceRegistrationError = value;
    }

}
