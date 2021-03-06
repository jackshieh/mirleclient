//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.03 at 07:53:50 PM CST 
//


package com.shenghsiang.mirle.d0501;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INVOICE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CANCELALLOWANCENUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ALLOWANCEDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BUYERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SELLERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CANCELDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CANCELTIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CANCELREASON" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SYSTIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoicecode",
    "possn",
    "posid",
    "cancelallowancenumber",
    "allowancedate",
    "buyerid",
    "sellerid",
    "canceldate",
    "canceltime",
    "cancelreason",
    "remark",
    "systime"
})
@XmlRootElement(name = "Invoice")
public class Invoice {

    @XmlElement(name = "INVOICE_CODE", required = true)
    protected String invoicecode;
    @XmlElement(name = "POSSN", required = true)
    protected String possn;
    @XmlElement(name = "POSID", required = true)
    protected String posid;
    @XmlElement(name = "CANCELALLOWANCENUMBER", required = true)
    protected String cancelallowancenumber;
    @XmlElement(name = "ALLOWANCEDATE", required = true)
    protected String allowancedate;
    @XmlElement(name = "BUYERID", required = true)
    protected String buyerid;
    @XmlElement(name = "SELLERID", required = true)
    protected String sellerid;
    @XmlElement(name = "CANCELDATE", required = true)
    protected String canceldate;
    @XmlElement(name = "CANCELTIME", required = true)
    protected String canceltime;
    @XmlElement(name = "CANCELREASON", required = true)
    protected String cancelreason;
    @XmlElement(name = "REMARK", required = true)
    protected String remark;
    @XmlElement(name = "SYSTIME", required = true)
    protected String systime;

    /**
     * Gets the value of the invoicecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICECODE() {
        return invoicecode;
    }

    /**
     * Sets the value of the invoicecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICECODE(String value) {
        this.invoicecode = value;
    }

    /**
     * Gets the value of the possn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSSN() {
        return possn;
    }

    /**
     * Sets the value of the possn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSSN(String value) {
        this.possn = value;
    }

    /**
     * Gets the value of the posid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSID() {
        return posid;
    }

    /**
     * Sets the value of the posid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSID(String value) {
        this.posid = value;
    }

    /**
     * Gets the value of the cancelallowancenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELALLOWANCENUMBER() {
        return cancelallowancenumber;
    }

    /**
     * Sets the value of the cancelallowancenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELALLOWANCENUMBER(String value) {
        this.cancelallowancenumber = value;
    }

    /**
     * Gets the value of the allowancedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWANCEDATE() {
        return allowancedate;
    }

    /**
     * Sets the value of the allowancedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWANCEDATE(String value) {
        this.allowancedate = value;
    }

    /**
     * Gets the value of the buyerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUYERID() {
        return buyerid;
    }

    /**
     * Sets the value of the buyerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUYERID(String value) {
        this.buyerid = value;
    }

    /**
     * Gets the value of the sellerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLERID() {
        return sellerid;
    }

    /**
     * Sets the value of the sellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLERID(String value) {
        this.sellerid = value;
    }

    /**
     * Gets the value of the canceldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELDATE() {
        return canceldate;
    }

    /**
     * Sets the value of the canceldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELDATE(String value) {
        this.canceldate = value;
    }

    /**
     * Gets the value of the canceltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELTIME() {
        return canceltime;
    }

    /**
     * Sets the value of the canceltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELTIME(String value) {
        this.canceltime = value;
    }

    /**
     * Gets the value of the cancelreason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELREASON() {
        return cancelreason;
    }

    /**
     * Sets the value of the cancelreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELREASON(String value) {
        this.cancelreason = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the systime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTIME() {
        return systime;
    }

    /**
     * Sets the value of the systime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTIME(String value) {
        this.systime = value;
    }

}
