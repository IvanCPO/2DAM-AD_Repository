/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiempo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22ivancp
 */
class PrediccionConcello {
    private int idConcello;
    private String nome;
    private List<PredDiaConcello> listaPredDiaConcello;

    public PrediccionConcello() {
        listaPredDiaConcello = new ArrayList<>();
    }

    public PrediccionConcello(int idConcello, String nome) {
        this.idConcello = idConcello;
        this.nome = nome;
        listaPredDiaConcello = new ArrayList<>();
    }

    public List<PredDiaConcello> getListaPredDiaConcello() {
        return listaPredDiaConcello;
    }

    public void setListaPredDiaConcello(List<PredDiaConcello> listaPredDiaConcello) {
        this.listaPredDiaConcello = listaPredDiaConcello;
    }

    public int getIdConcello() {
        return idConcello;
    }

    public void setIdConcello(int idConcello) {
        this.idConcello = idConcello;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "idConcello=" + idConcello +","+ System.lineSeparator() +"nome=" + nome + ","+ System.lineSeparator() +"listaPredDiaConcello=" + listaPredDiaConcello + System.lineSeparator() + '}';
    }

    
    
}
