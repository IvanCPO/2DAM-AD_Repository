package org.a22ivancp.proyect.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class JPAUtils {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY;
    private JPAUtils(){}

    private static EntityManagerFactory generateFactory(){
        if (ENTITY_MANAGER_FACTORY==null)
            synchronized (JPAUtils.class){
                if (ENTITY_MANAGER_FACTORY==null)
                    ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("projectunit");
            }
        return ENTITY_MANAGER_FACTORY;
    }
    public static EntityManager getEntityManager(){
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }
}
