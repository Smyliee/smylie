package org.example.Databse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBcon {
    public static EntityManager provideconnection(){
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("map");
        return emf1.createEntityManager();
    }
}
