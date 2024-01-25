package org.a22ivancp.jpa.model;

import jakarta.persistence.*;

@Entity
public class Xogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJugador;
    private String nome;
    private int dorsal;

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public String toString() {
        return "Xogador{" +
                "idJugador=" + idJugador +
                ", nome='" + nome + '\'' +
                ", dorsal=" + dorsal +
                '}';
    }
}
