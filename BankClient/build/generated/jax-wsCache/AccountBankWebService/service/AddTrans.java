
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addTrans"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accIDReceive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transMoney" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="postage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTrans", propOrder = {
    "accID",
    "accIDReceive",
    "transName",
    "transMoney",
    "postage"
})
public class AddTrans {

    protected String accID;
    protected String accIDReceive;
    protected String transName;
    protected float transMoney;
    protected String postage;

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
     * Gets the value of the transMoney property.
     * 
     */
    public float getTransMoney() {
        return transMoney;
    }

    /**
     * Sets the value of the transMoney property.
     * 
     */
    public void setTransMoney(float value) {
        this.transMoney = value;
    }

    /**
     * Gets the value of the postage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostage() {
        return postage;
    }

    /**
     * Sets the value of the postage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostage(String value) {
        this.postage = value;
    }

}
