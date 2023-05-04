//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.11 at 02:26:20 PM EEST 
//


package com.search.tm.utils.parse.model;

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
 *         &lt;element ref="{}filing-date" minOccurs="0"/>
 *         &lt;element ref="{}registration-date" minOccurs="0"/>
 *         &lt;element ref="{}registration-expiration-date" minOccurs="0"/>
 *         &lt;element ref="{}registration-renewal-date" minOccurs="0"/>
 *         &lt;element ref="{}registration-renewal-expiration-date" minOccurs="0"/>
 *         &lt;element ref="{}entry-number" minOccurs="0"/>
 *         &lt;element ref="{}application-number" minOccurs="0"/>
 *         &lt;element ref="{}country" minOccurs="0"/>
 *         &lt;element ref="{}other" minOccurs="0"/>
 *         &lt;element ref="{}registration-number" minOccurs="0"/>
 *         &lt;element ref="{}renewal-number" minOccurs="0"/>
 *         &lt;element ref="{}foreign-priority-claim-in" minOccurs="0"/>
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
    "filingDate",
    "registrationDate",
    "registrationExpirationDate",
    "registrationRenewalDate",
    "registrationRenewalExpirationDate",
    "entryNumber",
    "applicationNumber",
    "country",
    "other",
    "registrationNumber",
    "renewalNumber",
    "foreignPriorityClaimIn"
})
@XmlRootElement(name = "foreign-application")
public class ForeignApplication {

    @XmlElement(name = "filing-date")
    protected String filingDate;
    @XmlElement(name = "registration-date")
    protected String registrationDate;
    @XmlElement(name = "registration-expiration-date")
    protected String registrationExpirationDate;
    @XmlElement(name = "registration-renewal-date")
    protected String registrationRenewalDate;
    @XmlElement(name = "registration-renewal-expiration-date")
    protected String registrationRenewalExpirationDate;
    @XmlElement(name = "entry-number")
    protected String entryNumber;
    @XmlElement(name = "application-number")
    protected String applicationNumber;
    protected String country;
    protected String other;
    @XmlElement(name = "registration-number")
    protected String registrationNumber;
    @XmlElement(name = "renewal-number")
    protected String renewalNumber;
    @XmlElement(name = "foreign-priority-claim-in")
    protected String foreignPriorityClaimIn;

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDate(String value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDate(String value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the registrationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    /**
     * Sets the value of the registrationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationExpirationDate(String value) {
        this.registrationExpirationDate = value;
    }

    /**
     * Gets the value of the registrationRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationRenewalDate() {
        return registrationRenewalDate;
    }

    /**
     * Sets the value of the registrationRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationRenewalDate(String value) {
        this.registrationRenewalDate = value;
    }

    /**
     * Gets the value of the registrationRenewalExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationRenewalExpirationDate() {
        return registrationRenewalExpirationDate;
    }

    /**
     * Sets the value of the registrationRenewalExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationRenewalExpirationDate(String value) {
        this.registrationRenewalExpirationDate = value;
    }

    /**
     * Gets the value of the entryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumber(String value) {
        this.entryNumber = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the renewalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalNumber() {
        return renewalNumber;
    }

    /**
     * Sets the value of the renewalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalNumber(String value) {
        this.renewalNumber = value;
    }

    /**
     * Gets the value of the foreignPriorityClaimIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPriorityClaimIn() {
        return foreignPriorityClaimIn;
    }

    /**
     * Sets the value of the foreignPriorityClaimIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPriorityClaimIn(String value) {
        this.foreignPriorityClaimIn = value;
    }

}