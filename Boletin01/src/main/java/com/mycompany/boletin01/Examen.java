/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin01;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22ivancp
 */
public class Examen implements Serializable{
    private String materia;
    private LocalDateTime fecha;
    private List<String> participantes;

    public Examen(String materia, LocalDateTime fecha, List<String> participantes) {
        this.materia = materia;
        this.fecha = fecha;
        this.participantes = participantes;
    }

    public Examen(String materia) {
        this.materia = materia;
        participantes  = new ArrayList<>();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<String> participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Examen: {").append(System.lineSeparator());
        sb.append("materia: "+getMateria()).append(System.lineSeparator());
        sb.append("fecha: "+getFecha()).append(System.lineSeparator());
        sb.append("participantes: "+getParticipantes()).append(System.lineSeparator());
        sb.append("}");
        return sb.toString();
    }
}
