
package mil.dtic.sitemaps.management.resources.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonValue;


/**
 * <p>Java class for tChangeFreq.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tChangeFreq">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="always"/>
 *     &lt;enumeration value="hourly"/>
 *     &lt;enumeration value="daily"/>
 *     &lt;enumeration value="weekly"/>
 *     &lt;enumeration value="monthly"/>
 *     &lt;enumeration value="yearly"/>
 *     &lt;enumeration value="never"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tChangeFreq", namespace = "http://www.sitemaps.org/schemas/sitemap/0.9")
@XmlEnum
public enum TChangeFreq {

    @XmlEnumValue("always")
    ALWAYS("always"),
    @XmlEnumValue("hourly")
    HOURLY("hourly"),
    @XmlEnumValue("daily")
    DAILY("daily"),
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),
    @XmlEnumValue("monthly")
    MONTHLY("monthly"),
    @XmlEnumValue("yearly")
    YEARLY("yearly"),
    @XmlEnumValue("never")
    NEVER("never");
    private final String value;

    TChangeFreq(String v) {
        value = v;
    }
    
    @JsonValue
    public String value() {
        return value;
    }

    public static TChangeFreq fromValue(String v) {
        for (TChangeFreq c: TChangeFreq.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
