package com.prasanth.dao;

import com.prasanth.entity.Person;
import com.prasanth.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by prasanth.ramineni on 7/10/17.
 */
public class PersonDAO {

    private Session session;
    private Transaction transaction;

    public void savePerson(Person person) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = null;

        try{
            transaction = session.beginTransaction();
            session.saveOrUpdate(person);
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            transaction.commit();
            session.close();
        }
    }

    public void deletePerson(Person person) {

        session = HibernateUtil.getSessionFactory().openSession();
        transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(person);
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            transaction.commit();
            session.close();
        }

    }
}
