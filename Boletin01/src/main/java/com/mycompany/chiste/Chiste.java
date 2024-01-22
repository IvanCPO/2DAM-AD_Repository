/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22ivancp
 */
public class Chiste {
    private boolean error;
    private Categoria categoria;
    private String type;
    private String pregunta;
    private String chiste;
    private List<Bandera> banderas;
    private boolean seguro;
    private int id;
    private String idioma;

    public Chiste() {
        banderas = new ArrayList<>();
    }

    public Chiste(boolean error, Categoria categoria, String type, String pregunta, String chiste, List<Bandera> banderas, boolean seguro, int id, String idioma) {
        this.error = error;
        this.categoria = categoria;
        this.type = type;
        this.pregunta = pregunta;
        this.chiste = chiste;
        this.banderas = banderas;
        this.seguro = seguro;
        this.id = id;
        this.idioma = idioma;
    }

    public Chiste(boolean error, Categoria categoria, String type, String pregunta, String chiste, boolean seguro, int id, String idioma) {
        this.error = error;
        this.categoria = categoria;
        this.type = type;
        this.pregunta = pregunta;
        this.chiste = chiste;
        this.seguro = seguro;
        this.id = id;
        this.idioma = idioma;
        banderas = new ArrayList<>();
    }
    

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getChiste() {
        return chiste;
    }

    public void setChiste(String chiste) {
        this.chiste = chiste;
    }

    public List<Bandera> getBanderas() {
        return banderas;
    }

    public void setBanderas(List<Bandera> banderas) {
        this.banderas = banderas;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error=" + error + ",\n")
                .append("categoria=" + categoria + ",\n")
                .append("type=" + type + ",\n")
                .append("pregunta=" + pregunta + ",\n")
                .append("chiste=" + chiste + ",\n")
                .append("seguro=" + seguro + ",\n")
                .append("id=" + id + ",\n")
                .append("idioma=" + idioma + ",\n")
                .append("banderas=" + banderas + ",\n");
        return sb.toString();
    }
    
    
}
