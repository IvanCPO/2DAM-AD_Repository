/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiempo;

/**
 *
 * @author a22ivancp
 */
public class Prediccion {
    private PrediccionConcello predConcello;

    public Prediccion(PrediccionConcello predConcello) {
        this.predConcello = predConcello;
    }

    public PrediccionConcello getPredConcello() {
        return predConcello;
    }

    public void setPredConcello(PrediccionConcello predConcello) {
        this.predConcello = predConcello;
    }

    @Override
    public String toString() {
        return predConcello+ "";
    }
    
    
}
