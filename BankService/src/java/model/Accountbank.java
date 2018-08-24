/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lonely
 */
@Entity
@Table(name = "accountbank")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accountbank.findAll", query = "SELECT a FROM Accountbank a"),
    @NamedQuery(name = "Accountbank.findByAccID", query = "SELECT a FROM Accountbank a WHERE a.accID = :accID"),
    @NamedQuery(name = "Accountbank.findByCustomerName", query = "SELECT a FROM Accountbank a WHERE a.customerName = :customerName"),
    @NamedQuery(name = "Accountbank.findByPassword", query = "SELECT a FROM Accountbank a WHERE a.password = :password"),
    @NamedQuery(name = "Accountbank.findByBalance", query = "SELECT a FROM Accountbank a WHERE a.balance = :balance"),
    @NamedQuery(name = "Accountbank.findByToken", query = "SELECT a FROM Accountbank a WHERE a.token = :token")})
public class Accountbank implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "AccID")
    private String accID;
    @Size(max = 45)
    @Column(name = "CustomerName")
    private String customerName;
    @Size(max = 45)
    @Column(name = "Password")
    private String password;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Balance")
    private Float balance;
    @Size(max = 545)
    @Column(name = "Token")
    private String token;

    public Accountbank() {
    }

    public Accountbank(String accID) {
        this.accID = accID;
    }

    public String getAccID() {
        return accID;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accID != null ? accID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accountbank)) {
            return false;
        }
        Accountbank other = (Accountbank) object;
        if ((this.accID == null && other.accID != null) || (this.accID != null && !this.accID.equals(other.accID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accountbank[ accID=" + accID + " ]";
    }
    
}
