package com.mycompany.biblioteca.dao;

import com.mycompany.biblioteca.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO implements DAO<Book> {
    List<Book> books = new ArrayList<>();
    @Override
    public Book get(long id) {
        for ( Book book: books ) {
            if (book.getIdBook()==id)
                return book;
        }
        return null;
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public void save(Book book) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void updateImage(Book book, String f) {

    }

    @Override
    public void updateImageById(long id, String f) {

    }

    @Override
    public void deleteAll() {

    }
}
