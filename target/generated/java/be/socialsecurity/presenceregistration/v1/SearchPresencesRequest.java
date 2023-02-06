
package be.socialsecurity.presenceregistration.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import be.socialsecurity.presenceregistration.schemas.v1.SearchPresencesRequestType;


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
 *         &lt;element name="SearchPresenceRequest" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SearchPresencesRequestType"/&gt;
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
    "searchPresenceRequest"
})
@XmlRootElement(name = "SearchPresencesRequest")
public class SearchPresencesRequest {

    @XmlElement(name = "SearchPresenceRequest", required = true)
    protected SearchPresencesRequestType searchPresenceRequest;

    /**
     * Gets the value of the searchPresenceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPresencesRequestType }
     *     
     */
    public SearchPresencesRequestType getSearchPresenceRequest() {
        return searchPresenceRequest;
    }

    /**
     * Sets the value of the searchPresenceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPresencesRequestType }
     *     
     */
    public void setSearchPresenceRequest(SearchPresencesRequestType value) {
        this.searchPresenceRequest = value;
    }

}
