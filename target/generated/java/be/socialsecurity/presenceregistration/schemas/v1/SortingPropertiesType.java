
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortingPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortingPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SortDirection" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SortDirectionType"/&gt;
 *         &lt;element name="SortCriteria" type="{http://socialsecurity.be/presenceregistration/schemas/v1}SortCriteriaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortingPropertiesType", propOrder = {
    "sortDirection",
    "sortCriteria"
})
public class SortingPropertiesType {

    @XmlElement(name = "SortDirection", required = true)
    @XmlSchemaType(name = "string")
    protected SortDirectionType sortDirection;
    @XmlElement(name = "SortCriteria", required = true)
    @XmlSchemaType(name = "string")
    protected SortCriteriaType sortCriteria;

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirectionType }
     *     
     */
    public SortDirectionType getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirectionType }
     *     
     */
    public void setSortDirection(SortDirectionType value) {
        this.sortDirection = value;
    }

    /**
     * Gets the value of the sortCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SortCriteriaType }
     *     
     */
    public SortCriteriaType getSortCriteria() {
        return sortCriteria;
    }

    /**
     * Sets the value of the sortCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortCriteriaType }
     *     
     */
    public void setSortCriteria(SortCriteriaType value) {
        this.sortCriteria = value;
    }

}
