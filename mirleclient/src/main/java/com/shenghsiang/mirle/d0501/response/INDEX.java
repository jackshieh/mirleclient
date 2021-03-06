//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.03 at 08:06:40 PM CST 
//


package com.shenghsiang.mirle.d0501.response;

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
 *         &lt;element name="FUNCTIONCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPLY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CANCELALLOWANCENUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ALLOWANCEDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SELLERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "functioncode",
    "reply",
    "errorcode",
    "message",
    "cancelallowancenumber",
    "allowancedate",
    "sellerid",
    "posid",
    "possn",
    "systime"
})
@XmlRootElement(name = "INDEX")
public class INDEX {

    @XmlElement(name = "FUNCTIONCODE", required = true)
    protected String functioncode;
    @XmlElement(name = "REPLY")
    protected int reply;
    @XmlElement(name = "ERROR_CODE", required = true)
    protected String errorcode;
    @XmlElement(name = "MESSAGE", required = true)
    protected String message;
    @XmlElement(name = "CANCELALLOWANCENUMBER", required = true)
    protected String cancelallowancenumber;
    @XmlElement(name = "ALLOWANCEDATE", required = true)
    protected String allowancedate;
    @XmlElement(name = "SELLERID", required = true)
    protected String sellerid;
    @XmlElement(name = "POSID", required = true)
    protected String posid;
    @XmlElement(name = "POSSN", required = true)
    protected String possn;
    @XmlElement(name = "SYSTIME", required = true)
    protected String systime;

    /**
     * Gets the value of the functioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONCODE() {
        return functioncode;
    }

    /**
     * Sets the value of the functioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONCODE(String value) {
        this.functioncode = value;
    }

    /**
     * Gets the value of the reply property.
     * 
     */
    public int getREPLY() {
        return reply;
    }

    /**
     * Sets the value of the reply property.
     * 
     */
    public void setREPLY(int value) {
        this.reply = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORCODE(String value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGE(String value) {
        this.message = value;
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
