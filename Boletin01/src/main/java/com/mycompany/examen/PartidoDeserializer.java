package com.mycompany.examen;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que implementa la interfaz JsonDeserializer para deserializar el archivo JSON de partidos.
 * Formato del archivo JSON para Partido:
 * {
 * "id": 857369,
 * "date": "2022-10-20T00:00:00.000Z",
 * "home_team": {
 * "id": 14,
 * "abbreviation": "LAL",
 * "city": "Los Angeles",
 * "conference": "West",
 * "division": "Pacific",
 * "full_name": "Los Angeles Lakers",
 * "name": "Lakers"
 * },
 * "home_team_score": 97,
 * "period": 4,
 * "postseason": false,
 * "season": 2022,
 * "status": "Final",
 * "time": "Final",
 * "visitor_team": {
 * "id": 13,
 * "abbreviation": "LAC",
 * "city": "LA",
 * "conference": "West",
 * "division": "Pacific",
 * "full_name": "LA Clippers",
 * "name": "Clippers"
 * },
 * "visitor_team_score": 103
 * }
 * <p>
 * Esta clase se utiliza para deserializar el archivo JSON de partidos:
 * - Los campos equipoLocal (home_team) y equipoVisitante (visitor_team) se conviertan a objetos Equipo,
 * invocando al método deserialize del contexto.
 * - La fecha recogida como cadena se convierte en LocalDate por medio del método estático parse de la clase LocalDate.
 * Este método recoge la cadena en formato "yyyy-mm-dd" y devuelve un objeto LocalDate.
 * - La correspondencia del resto de campos es directa (getAsInt(), getAsString(), getAsBoolean()).
 */

public class PartidoDeserializer implements JsonDeserializer<Partido> {

    @Override
    public Partido deserialize(JsonElement jsonElement, Type type,
                               JsonDeserializationContext contexto) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
/*        {
 * "id": 857369,
 * "date": "2022-10-20T00:00:00.000Z",
 * "home_team": { value equipo },
 * "home_team_score": 97,
 * "period": 4,
 * "postseason": false,
 * "season": 2022,
 * "status": "Final",
 * "time": "Final",
 * "visitor_team": { value equipo },
 * "visitor_team_score": 103
                * }*/
        int idPartido = jsonObject.get("id").getAsInt();
        String[] date = jsonObject.get("date").getAsString().split("T");
        String[] valuesFecha = date[0].split("-");
        LocalDate fecha = LocalDate.of(Integer.parseInt(valuesFecha[0]),Integer.parseInt(valuesFecha[1]),Integer.parseInt(valuesFecha[2]));
        Equipo equipoLocal = contexto.deserialize(jsonObject.getAsJsonObject("home_team"),Equipo.class);
        int puntosLocal = jsonObject.get("home_team_score").getAsInt();
        int periodo = jsonObject.get("period").getAsInt();
        boolean postemporada = jsonObject.get("postseason").getAsBoolean();
        int temporada = jsonObject.get("season").getAsInt();
        String estado = jsonObject.get("status").getAsString();
        String tiempo = (!jsonObject.get("time").isJsonNull()) ? jsonObject.get("time").getAsString() : null;
        Equipo equipoVisitante = contexto.deserialize(jsonObject.getAsJsonObject("visitor_team"),Equipo.class);
        int puntosVisitante = jsonObject.get("visitor_team_score").getAsInt();

        return new Partido(idPartido,fecha,equipoLocal,puntosLocal,periodo,postemporada,temporada,estado,tiempo,equipoVisitante,puntosVisitante);
    }
}
