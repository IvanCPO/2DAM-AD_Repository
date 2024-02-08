package org.a22ivancp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "\"Juego\"")
public class Game {

    @Id
    @Column(length = 32)
    private int idJuego;
    @Column(length = 32)
    private int idGenero;
    @Column(length = 32)
    private int idPlataforma;
    private String titulo;
    private String miniatura;
    private String estado;
    private String descripcionCorta;
    private String descripcion;
    private String url;
    private String editor;
    private String desarrollador;
    private LocalDate fecha;
    @Transient
    private List<Image> imagenes;

    public Game() {
    }

    public Game(int idJuego, int idGenero, int idPlataforma, String titulo, String miniatura, String estado,
                 String descripcionCorta, String descripcion, String url, String editor, String desarrollador, LocalDate fecha) {
        this.idJuego = idJuego;
        this.idGenero = idGenero;
        this.idPlataforma = idPlataforma;
        this.titulo = titulo;
        this.miniatura = miniatura;
        this.estado = estado;
        this.descripcionCorta = descripcionCorta;
        this.descripcion = descripcion;
        this.url = url;
        this.editor = editor;
        this.desarrollador = desarrollador;
        this.fecha = fecha;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura=miniatura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado=estado;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta=descripcionCorta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url=url;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha=fecha;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public List<Image> getImagenes() {
        return imagenes;
    }

    public void addImagen(Image imagen) {
        this.imagenes.add(imagen);
    }

    public void setImagenes(List<Image> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game juego = (Game) o;
        return idJuego == juego.idJuego;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(idJuego);
    }

    @Override
    public String toString() {
        return "Juego{" +
                "idJuego=" + idJuego +
                ", idGenero=" + idGenero +
                ", idPlataforma=" + idPlataforma +
                ", titulo='" + titulo + '\'' +
                ", miniatura='" + miniatura + '\'' +
                ", estado='" + estado + '\'' +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                ", editor='" + editor + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", fecha=" + fecha +
                '}';
    }

}
