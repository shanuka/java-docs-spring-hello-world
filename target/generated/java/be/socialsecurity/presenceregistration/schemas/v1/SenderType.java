
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * bloc containing informations about the sender of the declaration
 * 
 * <p>Java class for SenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SenderId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}UserIDType" minOccurs="0"/&gt;
 *         &lt;element name="SenderCompanyId" type="{http://socialsecurity.be/presenceregistration/schemas/v1}CompanyIDType" minOccurs="0"/&gt;
 *         &lt;element name="SenderUserType" type="{http://socialsecurity.be/presenceregistration/schemas/v1}UserType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderType", propOrder = {
    "senderId",
    "senderCompanyId",
    "senderUserType"
})
public class SenderType {

    @XmlElement(name = "SenderId")
    protected String senderId;
    @XmlElement(name = "SenderCompanyId")
    protected Long senderCompanyId;
    @XmlElement(name = "SenderUserType")
    protected String senderUserType;

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the senderCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderCompanyId() {
        return senderCompanyId;
    }

    /**
     * Sets the value of the senderCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderCompanyId(Long value) {
        this.senderCompanyId = value;
    }

    /**
     * Gets the value of the senderUserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderUserType() {
        return senderUserType;
    }

    /**
     * Sets the value of the senderUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderUserType(String value) {
        this.senderUserType = value;
    }

}
