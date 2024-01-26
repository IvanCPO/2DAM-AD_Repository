/*
 * Autor: Pepe Calo
 * Realizado con fines educativos.
 * Puede modificarlo siempre que no lo haga con fines comerciales.
 */
package com.a22ivancp.biblioteca.model.hibernate;

import com.a22ivancp.biblioteca.model.Book;
import com.a22ivancp.biblioteca.model.DAO;
import com.a22ivancp.biblioteca.model.EntityManagerUtil;
import jakarta.persistence.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @autor pepecalo
 */
public class BookDAOFactory implements DAO<Book> {

    private EntityManager em;

    public BookDAOFactory() {
    }

    @Override
    public Book get(long idBook) {
        em = EntityManagerUtil.createEntityManager();
        Book book = em.find(Book.class,idBook);
        em.close();
        return book;
    }

    @Override
    public List<Book> getAll() {
        em = EntityManagerUtil.createEntityManager();
        TypedQuery<Book> consulta = em.createQuery("SELECT b FROM Book b", Book.class);
        List<Book> biblioteca = consulta.getResultList();
        em.close();
        return biblioteca;
    }

    @Override
    public void save(Book book) {
        em = EntityManagerUtil.createEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();

    }

    private void setBookValues(Book book, PreparedStatement ps) throws SQLException {
        ps.setString(1, book.getIsbn());
        ps.setString(2, book.getTitle());
        ps.setString(3, book.getAuthor());
        ps.setInt(4, book.getYear());
        ps.setBoolean(5, book.isAvailable());
        ps.setBytes(6, book.getCover());
    }

    @Override
    public void update(Book book) {
        em = EntityManagerUtil.createEntityManager();
        em.getTransaction().begin();
        em.merge(book);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Book book) {
        em = EntityManagerUtil.createEntityManager();
        em.getTransaction().begin();
        em.remove(book);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean deleteById(long idBook) {
        Book book = get(idBook);
        if (book==null)
            return false;
        else{
            delete(book);
            return true;
        }
    }

    @Override
    public List<Integer> getAllIds() {
        em = EntityManagerUtil.createEntityManager();
        List<Integer> ids = em.createQuery("SELECT idBook FROM Book ORDER BY idBook", Integer.class).getResultList();
        em.close();
        return ids;
    }

    public void updateLOB(Book book, String f) {
        book.setPortada(f);
        em = EntityManagerUtil.createEntityManager();
        em.getTransaction().begin();
        em.merge(book);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void updateLOBById(long id, String f) {
        Book book = this.get(id);
        this.updateLOB(book,f);
    }

    @Override
    public void deleteAll() {
        em = EntityManagerUtil.createEntityManager();
        em.getTransaction().begin();
        List<Book> list = this.getAll();
        for (int i = 0; i < list.size(); i++) {
            em.remove(list.get(i));
        }
        em.getTransaction().commit();
        em.close();
    }


}
