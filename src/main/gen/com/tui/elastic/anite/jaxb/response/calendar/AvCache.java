//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.04 at 06:22:11 PM IST 
//


package com.tui.elastic.anite.jaxb.response.calendar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Total">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Result" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Offers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="Avail" use="required" type="{}YesNo" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Error" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Node" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Xsd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "result",
    "error"
})
@XmlRootElement(name = "AvCache")
public class AvCache {

    @XmlElement(name = "Status")
    protected AvCache.Status status;
    @XmlElement(name = "Result")
    protected AvCache.Result result;
    @XmlElement(name = "Error")
    protected AvCache.Error error;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "Node")
    protected String node;
    @XmlAttribute(name = "Xsd")
    protected String xsd;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AvCache.Status }
     *     
     */
    public AvCache.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvCache.Status }
     *     
     */
    public void setStatus(AvCache.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link AvCache.Result }
     *     
     */
    public AvCache.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvCache.Result }
     *     
     */
    public void setResult(AvCache.Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link AvCache.Error }
     *     
     */
    public AvCache.Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvCache.Error }
     *     
     */
    public void setError(AvCache.Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the xsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsd() {
        return xsd;
    }

    /**
     * Sets the value of the xsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsd(String value) {
        this.xsd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Error {

        @XmlAttribute(name = "Code", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAttribute(name = "Text")
        @XmlSchemaType(name = "anySimpleType")
        protected String text;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }


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
     *         &lt;element name="Offers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="Avail" use="required" type="{}YesNo" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "offers"
    })
    public static class Result {

        @XmlElement(name = "Offers", required = true)
        protected AvCache.Result.Offers offers;

        /**
         * Gets the value of the offers property.
         * 
         * @return
         *     possible object is
         *     {@link AvCache.Result.Offers }
         *     
         */
        public AvCache.Result.Offers getOffers() {
            return offers;
        }

        /**
         * Sets the value of the offers property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvCache.Result.Offers }
         *     
         */
        public void setOffers(AvCache.Result.Offers value) {
            this.offers = value;
        }


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
         *         &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="Avail" use="required" type="{}YesNo" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "offer"
        })
        public static class Offers {

            @XmlElement(name = "Offer")
            protected List<AvCache.Result.Offers.Offer> offer;
            @XmlAttribute(name = "Count")
            @XmlSchemaType(name = "unsignedInt")
            protected Long count;

            /**
             * Gets the value of the offer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOffer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvCache.Result.Offers.Offer }
             * 
             * 
             */
            public List<AvCache.Result.Offers.Offer> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<AvCache.Result.Offers.Offer>();
                }
                return this.offer;
            }

            /**
             * Gets the value of the count property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCount() {
                return count;
            }

            /**
             * Sets the value of the count property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCount(Long value) {
                this.count = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="Avail" use="required" type="{}YesNo" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Offer {

                @XmlAttribute(name = "Date", required = true)
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "date")
                protected String date;
                @XmlAttribute(name = "Avail", required = true)
                protected YesNo avail;

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Gets the value of the avail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YesNo }
                 *     
                 */
                public YesNo getAvail() {
                    return avail;
                }

                /**
                 * Sets the value of the avail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YesNo }
                 *     
                 */
                public void setAvail(YesNo value) {
                    this.avail = value;
                }

            }

        }

    }


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
     *         &lt;element name="Total">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "total"
    })
    public static class Status {

        @XmlElement(name = "Total", required = true)
        protected AvCache.Status.Total total;

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link AvCache.Status.Total }
         *     
         */
        public AvCache.Status.Total getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvCache.Status.Total }
         *     
         */
        public void setTotal(AvCache.Status.Total value) {
            this.total = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Total {

            @XmlAttribute(name = "Count")
            @XmlSchemaType(name = "unsignedInt")
            protected Long count;

            /**
             * Gets the value of the count property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCount() {
                return count;
            }

            /**
             * Sets the value of the count property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCount(Long value) {
                this.count = value;
            }

        }

    }

}
