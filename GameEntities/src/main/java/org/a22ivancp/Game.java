package org.a22ivancp;

import java.time.LocalDate;
import java.util.List;

public class Game {

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

    private List<Image> imagenes;


}
