package org.a22ivancp;

import jakarta.persistence.*;

@Entity
public class Departamento {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int idDepartamento;
    private String nombre;
    @OneToOne (mappedBy = "departamento", cascade = CascadeType.ALL, optional = false)
    private Persona persona;

    public Departamento() {
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "idDepartamento=" + idDepartamento +
                ", nombre='" + nombre + '\'' +
                ", persona=" + persona +
                '}';
    }
}
