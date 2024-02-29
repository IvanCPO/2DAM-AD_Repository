package org.a22ivancp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private final static EntityManagerFactory ENTITY_MANAGER_FACTORY =
            Persistence.createEntityManagerFactory("persistence");

    private JPAUtil(){

    }

    public static EntityManager createManager(){
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }


}
