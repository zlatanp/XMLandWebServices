//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.24 at 02:57:08 PM CEST 
//


package com.ftn.model.dto.mt102.mt102body;

import com.ftn.model.dto.types.TOznakaValute;
import com.ftn.model.dto.types.TPodaciPlacanje;
import com.ftn.model.dto.types.TPravnoLice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="podaci_o_duzniku" type="{http://www.ftn.uns.ac.rs/tipovi}TPravnoLice"/&gt;
 *         &lt;element name="podaci_o_poveriocu" type="{http://www.ftn.uns.ac.rs/tipovi}TPravnoLice"/&gt;
 *         &lt;element name="svrha_placanja"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="iznos"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.ftn.uns.ac.rs/tipovi&gt;TIznos"&gt;
 *                 &lt;attribute name="valuta"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.ftn.uns.ac.rs/tipovi}TOznakaValute"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="podaci_o_zaduzenju" type="{http://www.ftn.uns.ac.rs/tipovi}TPodaciPlacanje"/&gt;
 *         &lt;element name="podaci_o_odobrenju" type="{http://www.ftn.uns.ac.rs/tipovi}TPodaciPlacanje"/&gt;
 *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id_naloga"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="50"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "podaciODuzniku",
    "podaciOPoveriocu",
    "svrhaPlacanja",
    "iznos",
    "podaciOZaduzenju",
    "podaciOOdobrenju",
    "datumNaloga"
})
@XmlRootElement(name = "mt102_telo")
public class Mt102Telo {

    @XmlElement(name = "podaci_o_duzniku", required = true)
    protected TPravnoLice podaciODuzniku;
    @XmlElement(name = "podaci_o_poveriocu", required = true)
    protected TPravnoLice podaciOPoveriocu;
    @XmlElement(name = "svrha_placanja", required = true)
    protected String svrhaPlacanja;
    @XmlElement(required = true)
    protected Iznos iznos;
    @XmlElement(name = "podaci_o_zaduzenju", required = true)
    protected TPodaciPlacanje podaciOZaduzenju;
    @XmlElement(name = "podaci_o_odobrenju", required = true)
    protected TPodaciPlacanje podaciOOdobrenju;
    @XmlElement(name = "datum_naloga", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNaloga;
    @XmlAttribute(name = "id_naloga")
    protected String idNaloga;

    /**
     * Gets the value of the podaciODuzniku property.
     * 
     * @return
     *     possible object is
     *     {@link TPravnoLice }
     *     
     */
    public TPravnoLice getPodaciODuzniku() {
        return podaciODuzniku;
    }

    /**
     * Sets the value of the podaciODuzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPravnoLice }
     *     
     */
    public void setPodaciODuzniku(TPravnoLice value) {
        this.podaciODuzniku = value;
    }

    /**
     * Gets the value of the podaciOPoveriocu property.
     * 
     * @return
     *     possible object is
     *     {@link TPravnoLice }
     *     
     */
    public TPravnoLice getPodaciOPoveriocu() {
        return podaciOPoveriocu;
    }

    /**
     * Sets the value of the podaciOPoveriocu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPravnoLice }
     *     
     */
    public void setPodaciOPoveriocu(TPravnoLice value) {
        this.podaciOPoveriocu = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link Iznos }
     *     
     */
    public Iznos getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iznos }
     *     
     */
    public void setIznos(Iznos value) {
        this.iznos = value;
    }

    /**
     * Gets the value of the podaciOZaduzenju property.
     * 
     * @return
     *     possible object is
     *     {@link TPodaciPlacanje }
     *     
     */
    public TPodaciPlacanje getPodaciOZaduzenju() {
        return podaciOZaduzenju;
    }

    /**
     * Sets the value of the podaciOZaduzenju property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPodaciPlacanje }
     *     
     */
    public void setPodaciOZaduzenju(TPodaciPlacanje value) {
        this.podaciOZaduzenju = value;
    }

    /**
     * Gets the value of the podaciOOdobrenju property.
     * 
     * @return
     *     possible object is
     *     {@link TPodaciPlacanje }
     *     
     */
    public TPodaciPlacanje getPodaciOOdobrenju() {
        return podaciOOdobrenju;
    }

    /**
     * Sets the value of the podaciOOdobrenju property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPodaciPlacanje }
     *     
     */
    public void setPodaciOOdobrenju(TPodaciPlacanje value) {
        this.podaciOOdobrenju = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the idNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNaloga() {
        return idNaloga;
    }

    /**
     * Sets the value of the idNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNaloga(String value) {
        this.idNaloga = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.ftn.uns.ac.rs/tipovi&gt;TIznos"&gt;
     *       &lt;attribute name="valuta"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.ftn.uns.ac.rs/tipovi}TOznakaValute"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Iznos {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "valuta")
        protected TOznakaValute valuta;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the valuta property.
         * 
         * @return
         *     possible object is
         *     {@link TOznakaValute }
         *     
         */
        public TOznakaValute getValuta() {
            return valuta;
        }

        /**
         * Sets the value of the valuta property.
         * 
         * @param value
         *     allowed object is
         *     {@link TOznakaValute }
         *     
         */
        public void setValuta(TOznakaValute value) {
            this.valuta = value;
        }

    }

}
