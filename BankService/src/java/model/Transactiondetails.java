package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lonely
 */
@Entity
@Table(name = "transactiondetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transactiondetails.findAll", query = "SELECT t FROM Transactiondetails t"),
    @NamedQuery(name = "Transactiondetails.findByTransID", query = "SELECT t FROM Transactiondetails t WHERE t.transID = :transID"),
    @NamedQuery(name = "Transactiondetails.findByAccID", query = "SELECT t FROM Transactiondetails t WHERE t.accID = :accID"),
    @NamedQuery(name = "Transactiondetails.findByAccIDReceive", query = "SELECT t FROM Transactiondetails t WHERE t.accIDReceive = :accIDReceive"),
    @NamedQuery(name = "Transactiondetails.findByTransName", query = "SELECT t FROM Transactiondetails t WHERE t.transName = :transName"),
    @NamedQuery(name = "Transactiondetails.findByTransMoney", query = "SELECT t FROM Transactiondetails t WHERE t.transMoney = :transMoney"),
    @NamedQuery(name = "Transactiondetails.findByTransPostage", query = "SELECT t FROM Transactiondetails t WHERE t.transPostage = :transPostage"),
    @NamedQuery(name = "Transactiondetails.findByDateOfTrans", query = "SELECT t FROM Transactiondetails t WHERE t.dateOfTrans = :dateOfTrans")})
public class Transactiondetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 145)
    @Column(name = "TransID")
    private String transID;
    @Size(max = 45)
    @Column(name = "AccID")
    private String accID;
    @Size(max = 45)
    @Column(name = "AccIDReceive")
    private String accIDReceive;
    @Size(max = 45)
    @Column(name = "TransName")
    private String transName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TransMoney")
    private Float transMoney;
    @Column(name = "TransPostage")
    private Float transPostage;
    @Column(name = "DateOfTrans")
    @Temporal(TemporalType.DATE)
    private Date dateOfTrans;

    public Transactiondetails() {
    }

    public Transactiondetails(String transID) {
        this.transID = transID;
    }

    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public String getAccID() {
        return accID;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public String getAccIDReceive() {
        return accIDReceive;
    }

    public void setAccIDReceive(String accIDReceive) {
        this.accIDReceive = accIDReceive;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    public Float getTransMoney() {
        return transMoney;
    }

    public void setTransMoney(Float transMoney) {
        this.transMoney = transMoney;
    }

    public Float getTransPostage() {
        return transPostage;
    }

    public void setTransPostage(Float transPostage) {
        this.transPostage = transPostage;
    }

    public Date getDateOfTrans() {
        return dateOfTrans;
    }

    public void setDateOfTrans(Date dateOfTrans) {
        this.dateOfTrans = dateOfTrans;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transID != null ? transID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactiondetails)) {
            return false;
        }
        Transactiondetails other = (Transactiondetails) object;
        if ((this.transID == null && other.transID != null) || (this.transID != null && !this.transID.equals(other.transID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Transactiondetails[ transID=" + transID + " ]";
    }

    public Transactiondetails(String transID, String accID, String accIDReceive, String transName, Float transMoney, Float transPostage, Date dateOfTrans) {
        this.transID = transID;
        this.accID = accID;
        this.accIDReceive = accIDReceive;
        this.transName = transName;
        this.transMoney = transMoney;
        this.transPostage = transPostage;
        this.dateOfTrans = dateOfTrans;
    }
    
}
