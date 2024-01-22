/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lugar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22ivancp
 */
public class CodigoPostal {
    private int codigoPost;
    private String pais;
    private String abreviaturaPais;
    private List<Lugar> lugares;

    public CodigoPostal() {
        lugares = new ArrayList<>();
    }

    public CodigoPostal(int code, String country, String countryAbbrev) {
        this.codigoPost = code;
        this.pais = country;
        this.abreviaturaPais = countryAbbrev;
        lugares = new ArrayList<>();
    }

    public CodigoPostal(int codigoPost, String pais, String abreviaturaPais, List<Lugar> lugares) {
        this.codigoPost = codigoPost;
        this.pais = pais;
        this.abreviaturaPais = abreviaturaPais;
        this.lugares = lugares;
    }

    public int getCodigoPost() {
        return codigoPost;
    }

    public void setCodigoPost(int codigoPost) {
        this.codigoPost = codigoPost;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAbreviaturaPais() {
        return abreviaturaPais;
    }

    public void setAbreviaturaPais(String abreviaturaPais) {
        this.abreviaturaPais = abreviaturaPais;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }
    
    public void addLugar(Lugar l) {
        lugares.add(l);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Code= " + codigoPost ).append(System.lineSeparator());
        sb.append("Country= " + pais ).append(System.lineSeparator());
        sb.append("CountryAbbrev= " + abreviaturaPais ).append(System.lineSeparator());
        sb.append("places: [").append(System.lineSeparator());
            for (Lugar lugar : lugares) {
                sb.append("{").append(System.lineSeparator());
                sb.append(lugar).append(System.lineSeparator());
                sb.append("}").append(System.lineSeparator());
        }
        
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodigoPostal cl = (CodigoPostal) obj;
        return codigoPost==cl.codigoPost;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + codigoPost;
        return hash;
    }
    
    
    
    
}
