package com.mycompany.juego;

/**
 * Clase que representa una imagen.
 * CREATE TABLE PUBLIC.Imagen (
 * 	idImagen INTEGER NOT NULL AUTO_INCREMENT,
 * 	idJuego INTEGER NOT NULL,
 * 	url CHARACTER VARYING(512) NOT NULL,
 * 	imagen BLOB,
 * 	CONSTRAINT idImagenPK PRIMARY KEY (idImagen),
 * 	CONSTRAINT idJuegoFK FOREIGN KEY (idJuego) REFERENCES PUBLIC.Juego(idJuego) ON DELETE CASCADE ON UPDATE CASCADE
 * );
 */

public class Imagen {
    private Long idImagen;
    private Long idJuego;
    private String url;
    private byte[] imagen;

    public Imagen() {
    }

    public Imagen(Long idImagen, Long idJuego, String url, byte[] imagen) {
        this.idImagen = idImagen;
        this.idJuego = idJuego;
        this.url = url;
        this.imagen = imagen;
    }

    public long getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(long idImagen) {
        this.idImagen = idImagen;
    }

    public long getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(long idJuego) {
        this.idJuego = idJuego;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url=url;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen=imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Imagen)) return false;
        Imagen imagen = (Imagen) o;
        return idImagen == imagen.idImagen;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(idImagen);
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "idImagen=" + idImagen +
                ", idJuego=" + idJuego +
                ", url='" + url + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}
