package org.a22ivancp;

import java.util.Objects;

public class Plataform {


    private Long idPlataforma;
    private String nombre;

    public Plataform() {
    }

    public Plataform(Long idPlataforma, String nombre) {
        this.idPlataforma = idPlataforma;
        this.nombre = nombre;
    }

    public long getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(long idPlataforma) {
        this.idPlataforma = idPlataforma;
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
        if (!(o instanceof Plataform plataforma)) return false;
        return nombre.equalsIgnoreCase(plataforma.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "idPlataforma=" + idPlataforma +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
