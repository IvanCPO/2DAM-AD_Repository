/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.boletin01;

import com.google.gson.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22ivancp
 */
public class Boletin01 {

    public static GsonBuilder gsonb;
    private static String FILE_JSON = "accesoADatos.json";

    public static void main(String[] args) {
        Examen ex = new Examen("Acceso a Datos");
        ex.setFecha(LocalDateTime.of(2023, Month.NOVEMBER, 12, 9, 45));
        ex.getParticipantes().add("Ivan Cabaleiro");
        ex.getParticipantes().add("Mateo Perez");
        ex.getParticipantes().add("Martin Pouso");
        ex.getParticipantes().add("Angel Gomez");
        ex.getParticipantes().add("Alan Melendi");

        saveGsonExamen(ex);

        loadGsonExamen(ex);

    }

    private static void saveGsonExamen(Examen ex) {
        gsonb = new GsonBuilder();
        gsonb.setPrettyPrinting();
        gsonb.registerTypeAdapter(LocalDateTime.class, (JsonSerializer<LocalDateTime>) (LocalDateTime t, Type type, JsonSerializationContext jsc)
                -> new JsonPrimitive(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(t)));
        Gson gson = gsonb.create();
        String res = gson.toJson(ex, Examen.class);
        System.out.println(res);
        try {
            Files.writeString(Paths.get(FILE_JSON), res);
        } catch (IOException ex1) {
            Logger.getLogger(Boletin01.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }

    private static void loadGsonExamen(Examen ex) {
        gsonb = new GsonBuilder();
        gsonb.setPrettyPrinting();
        gsonb.registerTypeAdapter(LocalDateTime.class, (JsonDeserializer<LocalDateTime>) (JsonElement je, Type type, JsonDeserializationContext jdc)
                -> LocalDateTime.parse(je.getAsString(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withLocale(Locale.ENGLISH)));
        Gson gson = gsonb.create();
        try {
            ex = gson.fromJson(Files.readString(Paths.get(FILE_JSON)), Examen.class);
        } catch (IOException ex1) {
            System.out.println("NO SE LOGRÓ");
        }
        System.out.println(ex);
    }
}
