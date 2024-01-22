package org.a22ivancp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
    EntityManagerFactory emf;
    public EntityManagerUtil(){
        emf = Persistence.createEntityManagerFactory("default");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public void shutdown() {
        emf.close();
    }
}
