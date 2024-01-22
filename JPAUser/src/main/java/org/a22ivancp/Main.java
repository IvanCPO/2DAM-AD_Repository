package org.a22ivancp;

import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        //TIP Ayuda por favor. Me estoy muriendo de hambre
        EntityManager em = JPAUtil.getEntityManager();


    }
}