
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search Presence Registration request type
 * 
 * <p>Java class for SearchPresencesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPresencesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchPresenceRegistrationCriteria" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SearchPresenceRegistrationCriteria"/&gt;
 *         &lt;element name="PaginationProperties" type="{http://socialsecurity.be/presenceregistration/schemas/v1}PaginationPropertiesType" minOccurs="0"/&gt;
 *         &lt;element name="SortingProperties" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SortingPropertiesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPresencesRequestType", propOrder = {
    "searchPresenceRegistrationCriteria",
    "paginationProperties",
    "sortingProperties"
})
public class SearchPresencesRequestType {

    @XmlElement(name = "SearchPresenceRegistrationCriteria", required = true)
    protected SearchPresenceRegistrationCriteria searchPresenceRegistrationCriteria;
    @XmlElement(name = "PaginationProperties")
    protected PaginationPropertiesType paginationProperties;
    @XmlElement(name = "SortingProperties")
    protected SortingPropertiesType sortingProperties;

    /**
     * Gets the value of the searchPresenceRegistrationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPresenceRegistrationCriteria }
     *     
     */
    public SearchPresenceRegistrationCriteria getSearchPresenceRegistrationCriteria() {
        return searchPresenceRegistrationCriteria;
    }

    /**
     * Sets the value of the searchPresenceRegistrationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPresenceRegistrationCriteria }
     *     
     */
    public void setSearchPresenceRegistrationCriteria(SearchPresenceRegistrationCriteria value) {
        this.searchPresenceRegistrationCriteria = value;
    }

    /**
     * Gets the value of the paginationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationPropertiesType }
     *     
     */
    public PaginationPropertiesType getPaginationProperties() {
        return paginationProperties;
    }

    /**
     * Sets the value of the paginationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationPropertiesType }
     *     
     */
    public void setPaginationProperties(PaginationPropertiesType value) {
        this.paginationProperties = value;
    }

    /**
     * Gets the value of the sortingProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SortingPropertiesType }
     *     
     */
    public SortingPropertiesType getSortingProperties() {
        return sortingProperties;
    }

    /**
     * Sets the value of the sortingProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingPropertiesType }
     *     
     */
    public void setSortingProperties(SortingPropertiesType value) {
        this.sortingProperties = value;
    }

}
