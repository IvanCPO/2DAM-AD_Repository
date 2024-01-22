/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basketball;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/**
 *
 * @author a22ivancp
 */
public class JReaderClasificacion {
    public static Clasificacion readClasificacion ( JsonReader reader ) throws IOException{
        
        Clasificacion clas = new Clasificacion();
        
        reader.beginObject();
        String eq = reader.nextName();
        reader.beginArray();
        while ( reader.hasNext() ){
            clas.addEquipo(readEquipo(reader));
        }
        reader.endArray();
        reader.endObject();
        
        return clas;
    }

    private static Equipo readEquipo(JsonReader reader) throws IOException {
        Equipo e = null;
        String nomeEquipo= "";
        int vitorias = 0;
        int derrotas = 0;
        int puntosFavor = 0;
        int puntosEnContra = 0;
        reader.beginObject();
        while ( reader.hasNext() ) {            
            String nome = reader.nextName();
            switch (nome) {
                case "nome" -> nomeEquipo = reader.nextString();
                case "vitorias" -> vitorias = reader.nextInt();
                case "derrotas" -> derrotas = reader.nextInt();
                case "puntosFavor" -> puntosFavor = reader.nextInt();
                case "puntosEnContra" -> puntosEnContra = reader.nextInt();
                default -> reader.skipValue();
            }
        }
        e = new Equipo(nomeEquipo, vitorias, derrotas, puntosFavor, puntosEnContra);
        reader.endObject();
        return e;
    }
}
