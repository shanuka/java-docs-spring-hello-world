
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search Presence Registration request and a list of generated errors
 * 
 * <p>Java class for SearchPresenceRegistrationErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPresenceRegistrationErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorList" type="{http://socialsecurity.be/presenceregistration/schemas/v1}RequestErrorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPresenceRegistrationErrorType", propOrder = {
    "errorList"
})
public class SearchPresenceRegistrationErrorType {

    @XmlElement(name = "ErrorList", required = true)
    protected RequestErrorType errorList;

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorType }
     *     
     */
    public RequestErrorType getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorType }
     *     
     */
    public void setErrorList(RequestErrorType value) {
        this.errorList = value;
    }

}
