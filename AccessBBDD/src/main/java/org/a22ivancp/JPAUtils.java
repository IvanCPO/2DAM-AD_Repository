package org.a22ivancp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class JPAUtils {
    private final static EntityManagerFactory ENTITY_MANAGER_FACT = Persistence.createEntityManagerFactory("peliculas");

    private JPAUtils(){}
    public static EntityManager getEntityManager(){
        return ENTITY_MANAGER_FACT.createEntityManager();
    }
}
