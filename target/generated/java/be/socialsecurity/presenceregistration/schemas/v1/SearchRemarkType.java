
package be.socialsecurity.presenceregistration.schemas.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRemarkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SearchRemarkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RELATED DIMONA NOT OK"/&gt;
 *     &lt;enumeration value="GIVEN INSS IS NOT THE FOUNDER OF THE COMPANY"/&gt;
 *     &lt;enumeration value="EMPLOYER IS NOT KNOWN AS COMPANY FOUNDER"/&gt;
 *     &lt;enumeration value="THE COMPANY DOESN'T EXISTS"/&gt;
 *     &lt;enumeration value="INDEPENDANT IS NOT KNOWN AS COMPANY FOUNDER"/&gt;
 *     &lt;enumeration value="LIMOSA ID IS NOT KNOWN"/&gt;
 *     &lt;enumeration value="LIMOSA ID IS NOT ACTIVE AT DATE"/&gt;
 *     &lt;enumeration value="NISS-BIS IS NOT KNOWN IN LIMOSA"/&gt;
 *     &lt;enumeration value="NISS-BIS IS NOT ACTIVE AT THIS DATE IN LIMOSA"/&gt;
 *     &lt;enumeration value="DUC IS NOT EXISTING"/&gt;
 *     &lt;enumeration value="DUC IS NOT ACTIVE AT THIS DATE"/&gt;
 *     &lt;enumeration value="COMPANY IS NOT KNOWN  AS BUILDER OR  SUBCONTRACTOR IN THIS DUC"/&gt;
 *     &lt;enumeration value="SITE IS NOT SUBJECT TO PRESENCE REGISTRATION"/&gt;
 *     &lt;enumeration value="SAME DECLARATION HAS ALREADY BEEN REGISTERED"/&gt;
 *     &lt;enumeration value="NISS IS NOT KNOW IN THE NATIONAL REGISTER"/&gt;
 *     &lt;enumeration value="EMPLOYER NOT ACTIVE"/&gt;
 *     &lt;enumeration value="THE COMPANY ID ASSOCIATED AT A NOT ACTIVE CONTRACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchRemarkType")
@XmlEnum
public enum SearchRemarkType {

    @XmlEnumValue("RELATED DIMONA NOT OK")
    RELATED_DIMONA_NOT_OK("RELATED DIMONA NOT OK"),
    @XmlEnumValue("GIVEN INSS IS NOT THE FOUNDER OF THE COMPANY")
    GIVEN_INSS_IS_NOT_THE_FOUNDER_OF_THE_COMPANY("GIVEN INSS IS NOT THE FOUNDER OF THE COMPANY"),
    @XmlEnumValue("EMPLOYER IS NOT KNOWN AS COMPANY FOUNDER")
    EMPLOYER_IS_NOT_KNOWN_AS_COMPANY_FOUNDER("EMPLOYER IS NOT KNOWN AS COMPANY FOUNDER"),
    @XmlEnumValue("THE COMPANY DOESN'T EXISTS")
    THE_COMPANY_DOESN_T_EXISTS("THE COMPANY DOESN'T EXISTS"),
    @XmlEnumValue("INDEPENDANT IS NOT KNOWN AS COMPANY FOUNDER")
    INDEPENDANT_IS_NOT_KNOWN_AS_COMPANY_FOUNDER("INDEPENDANT IS NOT KNOWN AS COMPANY FOUNDER"),
    @XmlEnumValue("LIMOSA ID IS NOT KNOWN")
    LIMOSA_ID_IS_NOT_KNOWN("LIMOSA ID IS NOT KNOWN"),
    @XmlEnumValue("LIMOSA ID IS NOT ACTIVE AT DATE")
    LIMOSA_ID_IS_NOT_ACTIVE_AT_DATE("LIMOSA ID IS NOT ACTIVE AT DATE"),
    @XmlEnumValue("NISS-BIS IS NOT KNOWN IN LIMOSA")
    NISS_BIS_IS_NOT_KNOWN_IN_LIMOSA("NISS-BIS IS NOT KNOWN IN LIMOSA"),
    @XmlEnumValue("NISS-BIS IS NOT ACTIVE AT THIS DATE IN LIMOSA")
    NISS_BIS_IS_NOT_ACTIVE_AT_THIS_DATE_IN_LIMOSA("NISS-BIS IS NOT ACTIVE AT THIS DATE IN LIMOSA"),
    @XmlEnumValue("DUC IS NOT EXISTING")
    DUC_IS_NOT_EXISTING("DUC IS NOT EXISTING"),
    @XmlEnumValue("DUC IS NOT ACTIVE AT THIS DATE")
    DUC_IS_NOT_ACTIVE_AT_THIS_DATE("DUC IS NOT ACTIVE AT THIS DATE"),
    @XmlEnumValue("COMPANY IS NOT KNOWN  AS BUILDER OR  SUBCONTRACTOR IN THIS DUC")
    COMPANY_IS_NOT_KNOWN_AS_BUILDER_OR_SUBCONTRACTOR_IN_THIS_DUC("COMPANY IS NOT KNOWN  AS BUILDER OR  SUBCONTRACTOR IN THIS DUC"),
    @XmlEnumValue("SITE IS NOT SUBJECT TO PRESENCE REGISTRATION")
    SITE_IS_NOT_SUBJECT_TO_PRESENCE_REGISTRATION("SITE IS NOT SUBJECT TO PRESENCE REGISTRATION"),
    @XmlEnumValue("SAME DECLARATION HAS ALREADY BEEN REGISTERED")
    SAME_DECLARATION_HAS_ALREADY_BEEN_REGISTERED("SAME DECLARATION HAS ALREADY BEEN REGISTERED"),
    @XmlEnumValue("NISS IS NOT KNOW IN THE NATIONAL REGISTER")
    NISS_IS_NOT_KNOW_IN_THE_NATIONAL_REGISTER("NISS IS NOT KNOW IN THE NATIONAL REGISTER"),
    @XmlEnumValue("EMPLOYER NOT ACTIVE")
    EMPLOYER_NOT_ACTIVE("EMPLOYER NOT ACTIVE"),
    @XmlEnumValue("THE COMPANY ID ASSOCIATED AT A NOT ACTIVE CONTRACT")
    THE_COMPANY_ID_ASSOCIATED_AT_A_NOT_ACTIVE_CONTRACT("THE COMPANY ID ASSOCIATED AT A NOT ACTIVE CONTRACT");
    private final String value;

    SearchRemarkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchRemarkType fromValue(String v) {
        for (SearchRemarkType c: SearchRemarkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
