
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transactiondetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactiondetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accIDReceive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfTrans" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transMoney" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="transName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transPostage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactiondetails", propOrder = {
    "accID",
    "accIDReceive",
    "dateOfTrans",
    "transID",
    "transMoney",
    "transName",
    "transPostage"
})
public class Transactiondetails {

    protected String accID;
    protected String accIDReceive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfTrans;
    protected String transID;
    protected Float transMoney;
    protected String transName;
    protected Float transPostage;

    /**
     * Gets the value of the accID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccID() {
        return accID;
    }

    /**
     * Sets the value of the accID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccID(String value) {
        this.accID = value;
    }

    /**
     * Gets the value of the accIDReceive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccIDReceive() {
        return accIDReceive;
    }

    /**
     * Sets the value of the accIDReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccIDReceive(String value) {
        this.accIDReceive = value;
    }

    /**
     * Gets the value of the dateOfTrans property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfTrans() {
        return dateOfTrans;
    }

    /**
     * Sets the value of the dateOfTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfTrans(XMLGregorianCalendar value) {
        this.dateOfTrans = value;
    }

    /**
     * Gets the value of the transID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransID() {
        return transID;
    }

    /**
     * Sets the value of the transID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransID(String value) {
        this.transID = value;
    }

    /**
     * Gets the value of the transMoney property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransMoney() {
        return transMoney;
    }

    /**
     * Sets the value of the transMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransMoney(Float value) {
        this.transMoney = value;
    }

    /**
     * Gets the value of the transName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransName() {
        return transName;
    }

    /**
     * Sets the value of the transName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransName(String value) {
        this.transName = value;
    }

    /**
     * Gets the value of the transPostage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransPostage() {
        return transPostage;
    }

    /**
     * Sets the value of the transPostage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransPostage(Float value) {
        this.transPostage = value;
    }

}
