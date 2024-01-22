package com.mycompany.biblioteca;

import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Book implements Serializable {
    private long idBook;
    private String isbn;
    private String title;
    private String author;
    private int year;
    private boolean available;
    private byte[] portada;

    public Book() {
    }

    public Book(String isbn, String title, String author, int year, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public Book(long idBook, String isbn, String title, String author, int year, boolean available, byte[] portada) {
        this.idBook = idBook;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
        this.portada = portada;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public byte[] getPortada() {
        return portada;
    }

    public void setPortada(Path f) {
        try {
            this.portada=Files.readAllBytes(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setPortada(String ruta) {
        setPortada(Paths.get(ruta));
    }

    public void getImagen(){
        if (portada!= null) {
            ByteArrayInputStream flujo = new ByteArrayInputStream(portada);
            try {
                ImageIO.read(flujo);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public int hashCode() {
        int value = 5;
        value = value*3;
        String [] valueIsbn = isbn.split("-");
        for (int i = 0; i < valueIsbn.length; i++) {
            value+=Integer.parseInt(valueIsbn[i]);
        }
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;

        Book book = (Book) obj;
        if (this.isbn==((Book) obj).isbn)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
