package org.a22ivancp.jpa;

import jakarta.persistence.EntityManager;
import org.a22ivancp.jpa.model.Xogador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Creando EntityManager...");
        EntityManager em = JPAUtil.getEntityManager();
        System.out.println("Creado correctamente");

        Xogador xogador = new Xogador("Iván Cabaleiro", 43);
        Xogador xogador2 = new Xogador("Angel Gomez", 33);

        em.getTransaction().begin();
        em.persist(xogador2);
        em.getTransaction().commit();
    }
}