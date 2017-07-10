package com.prasanth.main;

import com.prasanth.dao.PersonDAO;
import com.prasanth.entity.Person;
import com.prasanth.util.HibernateUtil;

/**
 * Created by prasanth.ramineni on 7/7/17.
 */
public class Start {

    public static void main(String[] args) {

        //HibernateUtil.getSessionFactory().openSession();

        Person person = new Person();
        person.setFirstName("Prasanth");
        person.setLastName("Ramineni");
        person.setId(1);

        PersonDAO dao = new PersonDAO();

        dao.savePerson(person);
    }
}
