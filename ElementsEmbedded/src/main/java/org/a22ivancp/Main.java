package org.a22ivancp;

import jakarta.persistence.EntityManager;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtils.getEntityManager();
    }
}