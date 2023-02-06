
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SortDirectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASCENDING"/&gt;
 *     &lt;enumeration value="DESCENDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortDirectionType")
@XmlEnum
public enum SortDirectionType {

    ASCENDING,
    DESCENDING;

    public String value() {
        return name();
    }

    public static SortDirectionType fromValue(String v) {
        return valueOf(v);
    }

}
