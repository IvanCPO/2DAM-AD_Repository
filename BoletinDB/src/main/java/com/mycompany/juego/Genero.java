package com.mycompany.juego;

import java.util.Objects;

public class Genero {
    private Long idGenero;
    private String nombre;

    public Genero() {
    }

    public Genero(Long idGenero, String nombre) {
        this.idGenero = idGenero;
        this.nombre = nombre;
    }

    public long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero genero)) return false;
        return genero.nombre.equalsIgnoreCase(nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre  );
    }

    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
