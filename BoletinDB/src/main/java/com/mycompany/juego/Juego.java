package com.mycompany.juego;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase que representa un juego.
 *
 *
 * CREATE TABLE PUBLIC.Juego (
 * 	idJuego INTEGER NOT NULL,
 * 	idGenero INTEGER NOT NULL,
 * 	idPlataforma INTEGER NOT NULL,
 * 	titulo CHARACTER VARYING(255) NOT NULL,
 * 	miniatura CHARACTER VARYING(256),
 * 	estado CHARACTER VARYING(64),
 * 	descripcionCorta CHARACTER VARYING(512),
 * 	descripcion CHARACTER VARYING(2000),
 * 	url CHARACTER VARYING(256),
 * 	editor CHARACTER VARYING(64),
 * 	desarrollador CHARACTER VARYING(64),
 * 	fecha DATE,
 * 	CONSTRAINT JUEGO_PK PRIMARY KEY (idJuego),
 * 	CONSTRAINT idGeneroFK FOREIGN KEY (idGenero) REFERENCES PUBLIC.Genero(idGenero) ON DELETE RESTRICT ON UPDATE CASCADE,
 * 	CONSTRAINT idPlataformaFK FOREIGN KEY (idPlataforma) REFERENCES PUBLIC.Plataforma(idPlataforma) ON DELETE RESTRICT ON UPDATE CASCADE
 * );
 * CREATE INDEX idGeneroIdx ON PUBLIC.Juego (idGenero);
 * CREATE INDEX idPlataformaIdx ON PUBLIC.Juego (idPlataforma);
 * CREATE UNIQUE INDEX idJuego ON PUBLIC.Juego (idJuego);
 */
public class Juego {
    private Long idJuego;
    private Long idGenero;
    private Long idPlataforma;
    private String titulo;
    private String miniatura;
    private String estado;
    private String descripcionCorta;
    private String descripcion;
    private String url;
    private String editor;
    private String desarrollador;
    private LocalDate fecha;

    private List<Imagen> imagenes;


    public Juego() {
    }

    public Juego(Long idJuego, Long idGenero, Long idPlataforma, String titulo, String miniatura, String estado,
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

    public long getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(long idJuego) {
        this.idJuego = idJuego;
    }

    public long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(long idGenero) {
        this.idGenero = idGenero;
    }

    public long getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(long idPlataforma) {
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

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void addImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Juego)) return false;
        Juego juego = (Juego) o;
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
