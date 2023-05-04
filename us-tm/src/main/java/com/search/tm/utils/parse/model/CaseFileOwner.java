//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.11 at 02:26:20 PM EEST 
//


package com.search.tm.utils.parse.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}entry-number" minOccurs="0"/>
 *         &lt;element ref="{}party-type" minOccurs="0"/>
 *         &lt;element ref="{}nationality" minOccurs="0"/>
 *         &lt;element ref="{}legal-entity-type-code" minOccurs="0"/>
 *         &lt;element ref="{}entity-statement" minOccurs="0"/>
 *         &lt;element ref="{}party-name" minOccurs="0"/>
 *         &lt;element ref="{}address-1" minOccurs="0"/>
 *         &lt;element ref="{}address-2" minOccurs="0"/>
 *         &lt;element ref="{}city" minOccurs="0"/>
 *         &lt;element ref="{}state" minOccurs="0"/>
 *         &lt;element ref="{}country" minOccurs="0"/>
 *         &lt;element ref="{}other" minOccurs="0"/>
 *         &lt;element ref="{}postcode" minOccurs="0"/>
 *         &lt;element ref="{}dba-aka-text" minOccurs="0"/>
 *         &lt;element ref="{}composed-of-statement" minOccurs="0"/>
 *         &lt;element ref="{}name-change-explanation" maxOccurs="unbounded" minOccurs="0"/>
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
    "entryNumber",
    "partyType",
    "nationality",
    "legalEntityTypeCode",
    "entityStatement",
    "partyName",
    "address1",
    "address2",
    "city",
    "state",
    "country",
    "other",
    "postcode",
    "dbaAkaText",
    "composedOfStatement",
    "nameChangeExplanation"
})
@XmlRootElement(name = "case-file-owner")
public class CaseFileOwner {

    @XmlElement(name = "entry-number")
    protected String entryNumber;
    @XmlElement(name = "party-type")
    protected String partyType;
    protected Nationality nationality;
    @XmlElement(name = "legal-entity-type-code")
    protected String legalEntityTypeCode;
    @XmlElement(name = "entity-statement")
    protected String entityStatement;
    @XmlElement(name = "party-name")
    protected String partyName;
    @XmlElement(name = "address-1")
    protected String address1;
    @XmlElement(name = "address-2")
    protected String address2;
    protected String city;
    protected String state;
    protected String country;
    protected String other;
    protected String postcode;
    @XmlElement(name = "dba-aka-text")
    protected String dbaAkaText;
    @XmlElement(name = "composed-of-statement")
    protected String composedOfStatement;
    @XmlElement(name = "name-change-explanation")
    protected List<String> nameChangeExplanation;

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
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Nationality }
     *     
     */
    public Nationality getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nationality }
     *     
     */
    public void setNationality(Nationality value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the legalEntityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityTypeCode() {
        return legalEntityTypeCode;
    }

    /**
     * Sets the value of the legalEntityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityTypeCode(String value) {
        this.legalEntityTypeCode = value;
    }

    /**
     * Gets the value of the entityStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityStatement() {
        return entityStatement;
    }

    /**
     * Sets the value of the entityStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityStatement(String value) {
        this.entityStatement = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the dbaAkaText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbaAkaText() {
        return dbaAkaText;
    }

    /**
     * Sets the value of the dbaAkaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbaAkaText(String value) {
        this.dbaAkaText = value;
    }

    /**
     * Gets the value of the composedOfStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposedOfStatement() {
        return composedOfStatement;
    }

    /**
     * Sets the value of the composedOfStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposedOfStatement(String value) {
        this.composedOfStatement = value;
    }

    /**
     * Gets the value of the nameChangeExplanation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameChangeExplanation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameChangeExplanation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameChangeExplanation() {
        if (nameChangeExplanation == null) {
            nameChangeExplanation = new ArrayList<String>();
        }
        return this.nameChangeExplanation;
    }

}