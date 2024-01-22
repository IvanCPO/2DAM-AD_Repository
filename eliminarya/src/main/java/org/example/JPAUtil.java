package org.example;

import jakarta.persistence.*;

public class JPAUtil {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = // equivalencia SessionFactory
            Persistence.createEntityManagerFactory("miUnidadDePersistencia");

    public static EntityManager getEntityManager(){ // equivalencia Session
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }
}
