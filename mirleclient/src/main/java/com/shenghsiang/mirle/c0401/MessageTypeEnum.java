//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.24 at 04:48:47 PM CST 
//


package com.shenghsiang.mirle.c0401;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="5"/>
 *     &lt;maxLength value="5"/>
 *     &lt;enumeration value="A0101"/>
 *     &lt;enumeration value="A0102"/>
 *     &lt;enumeration value="A0201"/>
 *     &lt;enumeration value="A0202"/>
 *     &lt;enumeration value="A0301"/>
 *     &lt;enumeration value="A0302"/>
 *     &lt;enumeration value="A0401"/>
 *     &lt;enumeration value="A0501"/>
 *     &lt;enumeration value="A0601"/>
 *     &lt;enumeration value="A1101"/>
 *     &lt;enumeration value="A1401"/>
 *     &lt;enumeration value="B0101"/>
 *     &lt;enumeration value="B0102"/>
 *     &lt;enumeration value="B0201"/>
 *     &lt;enumeration value="B0202"/>
 *     &lt;enumeration value="B0401"/>
 *     &lt;enumeration value="B0501"/>
 *     &lt;enumeration value="B1101"/>
 *     &lt;enumeration value="B1401"/>
 *     &lt;enumeration value="C0401"/>
 *     &lt;enumeration value="C0501"/>
 *     &lt;enumeration value="C0601"/>
 *     &lt;enumeration value="C0701"/>
 *     &lt;enumeration value="D0401"/>
 *     &lt;enumeration value="D0501"/>
 *     &lt;enumeration value="E0401"/>
 *     &lt;enumeration value="E0402"/>
 *     &lt;enumeration value="E0501"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageTypeEnum")
@XmlEnum
public enum MessageTypeEnum {

    @XmlEnumValue("A0101")
    A_0101("A0101"),
    @XmlEnumValue("A0102")
    A_0102("A0102"),
    @XmlEnumValue("A0201")
    A_0201("A0201"),
    @XmlEnumValue("A0202")
    A_0202("A0202"),
    @XmlEnumValue("A0301")
    A_0301("A0301"),
    @XmlEnumValue("A0302")
    A_0302("A0302"),
    @XmlEnumValue("A0401")
    A_0401("A0401"),
    @XmlEnumValue("A0501")
    A_0501("A0501"),
    @XmlEnumValue("A0601")
    A_0601("A0601"),
    @XmlEnumValue("A1101")
    A_1101("A1101"),
    @XmlEnumValue("A1401")
    A_1401("A1401"),
    @XmlEnumValue("B0101")
    B_0101("B0101"),
    @XmlEnumValue("B0102")
    B_0102("B0102"),
    @XmlEnumValue("B0201")
    B_0201("B0201"),
    @XmlEnumValue("B0202")
    B_0202("B0202"),
    @XmlEnumValue("B0401")
    B_0401("B0401"),
    @XmlEnumValue("B0501")
    B_0501("B0501"),
    @XmlEnumValue("B1101")
    B_1101("B1101"),
    @XmlEnumValue("B1401")
    B_1401("B1401"),
    @XmlEnumValue("C0401")
    C_0401("C0401"),
    @XmlEnumValue("C0501")
    C_0501("C0501"),
    @XmlEnumValue("C0601")
    C_0601("C0601"),
    @XmlEnumValue("C0701")
    C_0701("C0701"),
    @XmlEnumValue("D0401")
    D_0401("D0401"),
    @XmlEnumValue("D0501")
    D_0501("D0501"),
    @XmlEnumValue("E0401")
    E_0401("E0401"),
    @XmlEnumValue("E0402")
    E_0402("E0402"),
    @XmlEnumValue("E0501")
    E_0501("E0501");
    private final String value;

    MessageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTypeEnum fromValue(String v) {
        for (MessageTypeEnum c: MessageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
