package org.example;

import org.example.Databse.DBcon;
import org.example.Modelclasses.EmloyeDetails;
import org.example.Modelclasses.Employe;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager m = DBcon.provideconnection();
        m.getTransaction().begin();
//        m.persist(new Employe("Smylie"));
        Employe e = new Employe("SMYLIE");
        EmloyeDetails ed = new EmloyeDetails("CSE","JALANDHAR",1);
        e.setEmloyeDetails(ed);
        m.persist(e);
        m.getTransaction().commit();
        m.close();

    }
}