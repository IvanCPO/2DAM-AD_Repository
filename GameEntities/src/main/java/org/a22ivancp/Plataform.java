package org.a22ivancp;

import jakarta.persistence.*;

import java.util.Objects;
@Entity(name = "\"Plataforma\"")
public class Plataform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 32)
    private Long idPlataforma;
    @Column(length = 128,
            nullable = false)
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
