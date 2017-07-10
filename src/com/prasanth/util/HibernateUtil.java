package com.prasanth.util;

import com.prasanth.entity.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by prasanth.ramineni on 7/7/17.
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();


    private static SessionFactory buildSessionFactory() {

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Person.class);
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        System.out.println("Hibernate Configuration Successful!");

        return sessionFactory;
    }


    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }


}
