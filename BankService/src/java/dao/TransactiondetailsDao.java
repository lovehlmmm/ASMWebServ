/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;
import java.util.logging.*;
import model.Transactiondetails;
import org.hibernate.*;
import util.NewHibernateUtil;

/**
 *
 * @author Lonely
 */
public class TransactiondetailsDao {

    public boolean insertTrans(Session session, String transID, String accID, String accIDReceive, String transName, Float transMoney, Float transPostage, Date dateOfTrans) {
        try {
            Transactiondetails ts = new Transactiondetails();
            ts.setTransID(transID);
            ts.setAccID(accID);
            ts.setAccIDReceive(accIDReceive);
            ts.setTransName(transName);
            ts.setTransMoney(transMoney);
            ts.setTransPostage(transPostage);
            ts.setDateOfTrans(dateOfTrans);
            session.persist(ts);
            return true;
        } catch (Exception ex) {
            NewHibernateUtil.rollBackSessions(session);
        }
        return false;
    }
    
    public List<Transactiondetails> findByDate(String accID,Date beginDate, Date endDate) {
        Session session = NewHibernateUtil.getSessionAndBeginTransaction();
        try {
            Query query = session.createQuery("SELECT t FROM Transactiondetails t WHERE t.accID = :accID AND (t.dateOfTrans BETWEEN :beginDate AND :endDate)");
            query.setParameter("accID", accID);
            query.setParameter("beginDate", beginDate);
            query.setParameter("endDate", endDate);
            return query.list();
        } catch (Exception e) {
            NewHibernateUtil.rollBackSessions(session);
        } finally {
            try {
                NewHibernateUtil.commitCurrentSessions();
            } catch (Exception ex) {
                Logger.getLogger(AccountBankDao.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    NewHibernateUtil.closeCurrentSessions();
                } catch (Exception ex) {
                    Logger.getLogger(AccountBankDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

}
