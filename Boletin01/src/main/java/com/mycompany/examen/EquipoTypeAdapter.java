package com.mycompany.examen;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Formato del archivo JSON para Equipo:
 * {
 *       "id": 2,
 *       "abbreviation": "BOS",
 *       "city": "Boston",
 *       "conference": "East",
 *       "division": "Atlantic",
 *       "full_name": "Boston Celtics",
 *       "name": "Celtics"
 *     }
 * Adaptador para convertir de JSON a Equipo y viceversa.
 * Se utiliza para que el campo conferencia y division se conviertan a objetos Conferencia y Division.
 */
public class EquipoTypeAdapter extends TypeAdapter<Equipo> {
    /**
     * Método para convertir de Equipo a JSON.
     * No se usa, pero hay que implantarlo.
     * La Conferencia y la Division se convierten a String por medio de los métodos getNombre().
     * @param writer flujo de salida.
     * @param equipo objeto de tipo Equipo.
     * @throws IOException excepción de entrada/salida.
     * @see Conferencia#getNombre()
     * @see Division#getNombre()
     * @see com.google.gson.stream.JsonWriter#name(String)
     */
    @Override
    public void write(JsonWriter writer, Equipo equipo) throws IOException {

        writer.beginObject();
        writer.name("id").value(equipo.getIdEquipo());
        writer.name("abbreviation").value(equipo.getAbreviatura());
        writer.name("city").value(equipo.getCiudad());
        writer.name("conference").value(equipo.getConferenciaAsString());
        writer.name("division").value(equipo.getDivisionAsString());
        writer.name("full_name").value(equipo.getNombreCompleto());
        writer.name("name").value(equipo.getNombre());
        writer.endObject();
    }

    /**
     * Método para convertir de JSON a Equipo.
     * La Conferencia y la Division se convierten a objetos Conferencia y Division por medio de los métodos
     * getConferencia(String) y getDivision(String), respectivamente, que recogen la cadena del archivo JSON y
     * devuelven el objeto correspondiente.
     * @param reader flujo de entrada.
     * @return objeto de tipo Equipo.
     * @throws IOException excepción de entrada/salida.
     * @see Conferencia#getConferencia(String)
     * @see Division#getDivision(String)
     * @see JsonReader#nextName()
     */
    @Override
    public Equipo read(JsonReader reader) throws IOException {
        if (reader.peek() == JsonToken.NULL){
            reader.nextNull();
            return null;
        }
        Equipo equipo;
        int idEquipo = 0;
        String abreviatura = null;
        String ciudad = null;
        Conferencia conferencia = null;
        Division division = null;
        String nombreCompleto = null;
        String nombre = null;

        reader.beginObject();
        while (reader.hasNext()){
            String nameAtrib= reader.nextName();
            switch (nameAtrib){
                case "id" -> idEquipo=reader.nextInt();
                case "abbreviation" -> abreviatura=reader.nextString();
                case "city" -> ciudad=reader.nextString();
                case "conference" -> conferencia=Conferencia.getConferencia(reader.nextString());
                case "division" -> division=Division.getDivision(reader.nextString());
                case "full_name" -> nombreCompleto=reader.nextString();
                case "name" -> nombre=reader.nextString();
            }
        }
        reader.endObject();

        equipo =new Equipo(idEquipo,abreviatura,ciudad,conferencia,division,nombreCompleto,nombre);
        return equipo;
    }
}
