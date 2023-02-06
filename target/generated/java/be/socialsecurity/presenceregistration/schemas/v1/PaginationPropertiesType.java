
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaginationPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaginationPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstRow" type="{http://socialsecurity.be/presenceregistration/schemas/v1}FirstRowType"/&gt;
 *         &lt;element name="FetchSize" type="{http://socialsecurity.be/presenceregistration/schemas/v1}FetchSizeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationPropertiesType", propOrder = {
    "firstRow",
    "fetchSize"
})
public class PaginationPropertiesType {

    @XmlElement(name = "FirstRow")
    protected int firstRow;
    @XmlElement(name = "FetchSize")
    protected int fetchSize;

    /**
     * Gets the value of the firstRow property.
     * 
     */
    public int getFirstRow() {
        return firstRow;
    }

    /**
     * Sets the value of the firstRow property.
     * 
     */
    public void setFirstRow(int value) {
        this.firstRow = value;
    }

    /**
     * Gets the value of the fetchSize property.
     * 
     */
    public int getFetchSize() {
        return fetchSize;
    }

    /**
     * Sets the value of the fetchSize property.
     * 
     */
    public void setFetchSize(int value) {
        this.fetchSize = value;
    }

}
