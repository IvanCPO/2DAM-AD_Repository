/*
 * Autor: Pepe Calo
 * Realizado con fines educativos.
 * Puede modificarlo siempre que no lo haga con fines comerciales.
 */
package com.a22ivancp.biblioteca.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * @author a22ivancp
 */
public class EntityManagerUtil {
    private static EntityManagerFactory emf;

    private EntityManagerUtil(){

    }
    public static EntityManagerFactory getInstance(){
        if (emf == null)
            synchronized (EntityManagerUtil.class) {
                if (emf == null)
                    emf = Persistence.createEntityManagerFactory("default"); // Nombre de la unidad de persistencia
            }
        return emf;
    }
    public static EntityManager createEntityManager(){
        EntityManager em = null;
        if (emf!=null && emf.isOpen())
            synchronized (EntityManagerUtil.class) {
                if (emf!=null && emf.isOpen())
                    em = emf.createEntityManager(); // Nombre de la unidad de persistencia
            }
        return em;
    }

}
