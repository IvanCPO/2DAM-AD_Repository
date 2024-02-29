package org.a22ivancp.entities;

import jakarta.persistence.*;

@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula;
    @Embedded
    @AttributeOverride(name = "pais", column = @Column(name = "paisPelicula", length = 2))
    private InfoContenido informacion;

    public Pelicula(InfoContenido informacion) {
        this.informacion = informacion;
    }

    public long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public InfoContenido getInformacion() {
        return informacion;
    }

    public void setInformacion(InfoContenido informacion) {
        this.informacion = informacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "idPelicula=" + idPelicula +
                ", informacion=" + informacion +
                '}';
    }
}
