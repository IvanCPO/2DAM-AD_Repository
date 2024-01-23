/*
 * Autor: Pepe Calo
 * Realizado con fines educativos.
 * Puede modificarlo siempre que no lo haga con fines comerciales.
 */
package com.a22ivancp.biblioteca.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

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
public class BookDAO implements DAO<Book> {

    private EntityManager em;

    public BookDAO() {
    }

    @Override
    public Book get(long idBook) {
        em = EntityManagerUtil.getInstance().createEntityManager();
        Book book = em.find(Book.class,idBook);
        em.close();
        return book;
    }

    @Override
    public List<Book> getAll() {
        em = EntityManagerUtil.getInstance().createEntityManager();
        TypedQuery<Book> consulta = em.createQuery("SELECT b FROM Book b", Book.class);
        List<Book> biblioteca = consulta.getResultList();
        em.close();
        return biblioteca;
    }

    @Override
    public void save(Book book) {
        em = EntityManagerUtil.getInstance().createEntityManager();
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
        em = EntityManagerUtil.getInstance().createEntityManager();
        em.getTransaction().begin();
        em.merge(book);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Book book) {
        em = EntityManagerUtil.getInstance().createEntityManager();
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
        List<Integer> ids = new ArrayList<>();
        try {
            if (con != null && !con.isClosed()) {
                // Crear Statement
                try ( Statement st = con.createStatement();) {
                    // ResultSet:
                    ResultSet rs = st.executeQuery("SELECT idBook FROM Book ORDER BY idBook");
                    while (rs.next()) {
                        ids.add(rs.getInt("idBook"));
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al leer libros: " + ex.getMessage());
        }
        return ids;
    }

    public void updateLOB(Book book, String f) {
        try {
            if (con != null && !con.isClosed()) {
                // Crear Statement
                try ( PreparedStatement ps = con.prepareStatement("UPDATE  "
                        + "Book SET portada=? WHERE idBook= ?");
                      var bis = new BufferedInputStream(new FileInputStream(f));) {
                    // 
                    ps.setBinaryStream(1, bis);
                    ps.setInt(2, book.getIdBook());
                    ps.executeUpdate();
                    book.setPortada(f);
                } catch (FileNotFoundException ex) {
                    System.out.println("Archivo non atopado: "
                            + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println("Erro de E/S : " + ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
    }

    @Override
    public void updateLOBById(long id, String f) {
        try {
            if (con != null && !con.isClosed()) {
                // Crear Statement
                try ( PreparedStatement ps = con.prepareStatement("UPDATE  "
                        + "Book SET portada=? WHERE idBook= ?");
                      var bis = new BufferedInputStream(new FileInputStream(f));) {
                    //
                    ps.setBinaryStream(1, bis);
                    ps.setLong(2, id);
                    ps.executeUpdate();
                } catch (FileNotFoundException ex) {
                    System.out.println("Archivo non atopado: " + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println("Erro de E/S : " + ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
    }

    @Override
    public void deleteAll() {
        try {
            if (con != null && !con.isClosed()) {
                try ( Statement ps = con.createStatement()) {
                    ps.executeUpdate("DELETE FROM Book");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al borrar los Libros. " + ex.getMessage());
        }
}

}
