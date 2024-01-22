package org.a22ivancp;

import jakarta.persistence.EntityManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BookDAO dao = new BookDAO();
        Book libro = new Book("9788424937744", "Tractatus logico-philosophicus-investigaciones filosóficas", "Ludwig Wittgenstein", 2017, false);

        libro = new Book("9788499088150", "Verano", "J. M. Coetzee", 2011, true);
        //dao.create(libro);

        libro = dao.read(2l);
        System.out.println(libro);

    }
}