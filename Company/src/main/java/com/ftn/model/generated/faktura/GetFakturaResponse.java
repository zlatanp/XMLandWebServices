//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.25 at 12:24:50 PM CEST 
//


package com.ftn.model.generated.faktura;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faktura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "faktura"
})
@XmlRootElement(name = "getFakturaResponse")
public class GetFakturaResponse {

    @XmlElement(required = true)
    protected String faktura;

    /**
     * Gets the value of the faktura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaktura() {
        return faktura;
    }

    /**
     * Sets the value of the faktura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaktura(String value) {
        this.faktura = value;
    }

}