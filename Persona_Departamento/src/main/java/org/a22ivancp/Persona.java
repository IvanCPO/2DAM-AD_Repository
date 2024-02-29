package org.a22ivancp;

import jakarta.persistence.*;

@Entity
public class Persona {
    @Id
    @Column (name = "idDepartamento")
    private int idPersona;
    private String nombre;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "idDepartamento")
//    @PrimaryKeyJoinColumn
    private Departamento departamento;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}
