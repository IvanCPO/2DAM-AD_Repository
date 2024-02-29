package org.a22ivancp.entities;

import jakarta.persistence.*;

@Embeddable
@Access(AccessType.FIELD)
public class InfoContenido {
    @Column(length = 100)
    private String titulo;
    @Column(length = 50)
    private String genero;
    @Column(length = 2)
    private String pais;
    private int duracion;
    private int year;
    @Lob
    private String sinopsis;

    public InfoContenido(String titulo, String genero, String pais, int duracion, int year, String sinopsis) {
        this.titulo = titulo;
        this.genero = genero;
        this.pais = pais;
        this.duracion = duracion;
        this.year = year;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "InfoContenido{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", pais='" + pais + '\'' +
                ", duracion=" + duracion +
                ", year=" + year +
                ", sinopsis='" + sinopsis + '\'' +
                '}';
    }
}
