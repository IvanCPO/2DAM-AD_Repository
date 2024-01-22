/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lugar;

/**
 *
 * @author a22ivancp
 */
class Lugar {
    private String nombre;
    private double longitud;
    private String estado;
    private String abreviaturaEstado;
    private double latitud;

    public Lugar() {
    }

    public Lugar(String name, double longitude, String state, String stateAbbrev, double latitud) {
        this.nombre = name;
        this.longitud = longitude;
        this.estado = state;
        this.abreviaturaEstado = stateAbbrev;
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAbreviaturaEstado() {
        return abreviaturaEstado;
    }

    public void setAbreviaturaEstado(String abreviaturaEstado) {
        this.abreviaturaEstado = abreviaturaEstado;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    @Override
    public String toString() {
        return "\tname= " + nombre + ",\n"
                +"\tlongitude= " + longitud + ",\n"
                +"\tstate= " + estado + ",\n"
                +"\tstateAbbrev= " + abreviaturaEstado + ",\n"
                +"\tlatitud= " + latitud;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Lugar lug = (Lugar) obj;
        if (Double.hashCode(longitud) != Double.hashCode(lug.longitud)) {
            return false;
        }
        return Double.hashCode(latitud) == Double.hashCode(lug.latitud);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int)longitud;
        hash = 43 * hash + (int)latitud;
        hash = 43 * hash + nombre.hashCode();
        hash = 43 * hash + estado.hashCode();
        return hash;
    }
    
    
}
