/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.logging.*;
import model.Accountbank;
import org.hibernate.*;
import util.NewHibernateUtil;

/**
 *
 * @author Lonely
 */
public class AccountBankDao {

    public Accountbank findByAccID(String accID) {
        Session session = NewHibernateUtil.getSessionAndBeginTransaction();
        try {
            String hql = "SELECT a FROM Accountbank a WHERE a.accID = :accID";
            Query query = session.createQuery(hql);
            query.setParameter("accID", accID);
            return (Accountbank) query.uniqueResult();
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

    public boolean login(String accID, String password) {
        Session session = NewHibernateUtil.getSessionAndBeginTransaction();

        try {
            String hql = "SELECT a FROM Accountbank a WHERE a.accID = :accID AND a.password = :password";
            Query query = session.createQuery(hql);
            query.setParameter("accID", accID);
            query.setParameter("password", password);
            List<Accountbank> list = query.list();
            if (list.size() == 1) {
                session.close();
                return true;
            }
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
        return false;
    }

    public boolean updateToken(String accID, String token) {
        Session session = NewHibernateUtil.getSessionAndBeginTransaction();
        try {
            String hql = "UPDATE Accountbank SET token = :token WHERE accID = :accID";
            Query query = session.createQuery(hql);
            query.setParameter("accID", accID);
            query.setParameter("token", token);

            query.executeUpdate();
            return true;
        } catch (Exception ex) {
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
        return false;
    }

    public boolean updateMoney(Session session,String accID, float balance) {
        try {
            String hql = "UPDATE Accountbank SET balance = :balance WHERE accID = :accID";
            Query query = session.createQuery(hql);
            query.setParameter("accID", accID);
            query.setParameter("balance", balance);
            query.executeUpdate();
            return true;
        } catch (Exception e) {
            NewHibernateUtil.rollBackCurrentSessions();
        } 
        return false;
    }
}
