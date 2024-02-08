package org.a22ivancp;

import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtils.getEntityManager();

    }
}
