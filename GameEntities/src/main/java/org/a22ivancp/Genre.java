package org.a22ivancp;

import jakarta.persistence.*;

@Entity(name = "\"Genero\"")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGenero",
            length = 32)
    private long idGenre;
    @Column(name = "nombre",
            length = 128,
            nullable = false)
    private String name;

    public Genre() {
    }

    public Genre(long idGenre, String name) {
        this.idGenre = idGenre;
        this.name = name;
    }

    public long getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(long idGenre) {
        this.idGenre = idGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
