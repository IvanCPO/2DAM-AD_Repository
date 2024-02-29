package org.a22ivancp.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSerie;
    private InfoContenido informacion;
    @Column(length = 10)
    @Convert(converter = LocalDateConvert.class)
    private LocalDate fechaEstreno;
    private int temporada;
    private int capitulos;
    @ElementCollection
    @CollectionTable(name = "Director", joinColumns = @JoinColumn(name = "idDirector"))
    @Column(name = "nombre")
    private List<String> directores;

    public Serie(InfoContenido informacion, LocalDate fechaEstreno, int temporada, int capitulos, List<String> directores) {
        this.informacion = informacion;
        this.fechaEstreno = fechaEstreno;
        this.temporada = temporada;
        this.capitulos = capitulos;
        this.directores = directores;
    }

    public long getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(long idSerie) {
        this.idSerie = idSerie;
    }

    public InfoContenido getInformacion() {
        return informacion;
    }

    public void setInformacion(InfoContenido informacion) {
        this.informacion = informacion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public List<String> getDirectores() {
        return directores;
    }

    public void setDirectores(List<String> directores) {
        this.directores = directores;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "idSerie=" + idSerie +
                ", informacion=" + informacion +
                ", fechaEstreno=" + fechaEstreno +
                ", temporada=" + temporada +
                ", capitulos=" + capitulos +
                ", directores=" + directores +
                '}';
    }
}
