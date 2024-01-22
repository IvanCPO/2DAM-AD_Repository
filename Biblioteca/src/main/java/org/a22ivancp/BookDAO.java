package org.a22ivancp;

import jakarta.persistence.EntityManager;

public class BookDAO implements DAO<Book>{
    private EntityManagerUtil emu;
    BookDAO(){
        emu = Singleton.getInstance();
    }
    @Override
    public void create(Book book) {
        EntityManager em = emu.getEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Book book) {
        EntityManager em = emu.getEntityManager();
        em.getTransaction().begin();
        em.remove(book);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Book book) {
        EntityManager em = emu.getEntityManager();
        em.getTransaction().begin();
        em.merge(book);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Book read(Long id) {
        EntityManager em = emu.getEntityManager();
        Book book = em.find(Book.class, id);
        em.close();
        return book;
    }
}
