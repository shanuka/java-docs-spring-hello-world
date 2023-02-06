
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortCriteriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SortCriteriaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="REGISTRATION DATE"/&gt;
 *     &lt;enumeration value="CREATION DATE"/&gt;
 *     &lt;enumeration value="STATUS"/&gt;
 *     &lt;enumeration value="PLACE OF WORK"/&gt;
 *     &lt;enumeration value="COMPANY ID"/&gt;
 *     &lt;enumeration value="CHANNEL"/&gt;
 *     &lt;enumeration value="SENDER ID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortCriteriaType")
@XmlEnum
public enum SortCriteriaType {

    ID("ID"),
    @XmlEnumValue("REGISTRATION DATE")
    REGISTRATION_DATE("REGISTRATION DATE"),
    @XmlEnumValue("CREATION DATE")
    CREATION_DATE("CREATION DATE"),
    STATUS("STATUS"),
    @XmlEnumValue("PLACE OF WORK")
    PLACE_OF_WORK("PLACE OF WORK"),
    @XmlEnumValue("COMPANY ID")
    COMPANY_ID("COMPANY ID"),
    CHANNEL("CHANNEL"),
    @XmlEnumValue("SENDER ID")
    SENDER_ID("SENDER ID");
    private final String value;

    SortCriteriaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortCriteriaType fromValue(String v) {
        for (SortCriteriaType c: SortCriteriaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
