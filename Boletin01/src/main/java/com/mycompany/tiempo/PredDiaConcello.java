/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiempo;

import java.time.LocalDateTime;

/**
 *
 * @author a22ivancp
 */
class PredDiaConcello {
    private String dataPredicion;
    private int nivelAviso;
    private int tMax;
    private int tMin;
    private int uvMax;

    public PredDiaConcello() {
    }

    public PredDiaConcello(String dataPredicion, int nivelAviso, int tMax, int tMin, int uvMax) {
        this.dataPredicion = dataPredicion;
        this.nivelAviso = nivelAviso;
        this.tMax = tMax;
        this.tMin = tMin;
        this.uvMax = uvMax;
    }

    public String getDataPredicion() {
        return dataPredicion;
    }

    public void setDataPredicion(String dataPredicion) {
        this.dataPredicion = dataPredicion;
    }

    public int getNivelAviso() {
        return nivelAviso;
    }

    public void setNivelAviso(int nivelAviso) {
        this.nivelAviso = nivelAviso;
    }

    public int gettMax() {
        return tMax;
    }

    public void settMax(int tMax) {
        this.tMax = tMax;
    }

    public int gettMin() {
        return tMin;
    }

    public void settMin(int tMin) {
        this.tMin = tMin;
    }

    public int getUvMax() {
        return uvMax;
    }

    public void setUvMax(int uvMax) {
        this.uvMax = uvMax;
    }

    @Override
    public String toString() {
        return System.lineSeparator() +"dataPredicion=" + dataPredicion + ","
                + System.lineSeparator() +"nivelAviso=" + nivelAviso + ","
                + System.lineSeparator() +"tMax=" + tMax + ","+ System.lineSeparator() 
                +"tMin=" + tMin + ","+ System.lineSeparator() +"uvMax=" + uvMax 
                + System.lineSeparator() + '}';
    }
    
    
}
