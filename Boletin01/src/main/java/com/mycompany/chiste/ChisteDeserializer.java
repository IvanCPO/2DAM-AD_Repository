/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiste;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22ivancp
 */
public class ChisteDeserializer implements JsonSerializer<Chiste>, JsonDeserializer<Chiste> {

    @Override
    public JsonElement serialize(Chiste t, Type type, JsonSerializationContext jsc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Chiste deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        Chiste chiste = null;
        JsonObject jo = je.getAsJsonObject();

        boolean error = jo.get("error").getAsBoolean();
        String categoria = jo.get("category").getAsString();
        Categoria categoria1 = Categoria.valueOf(categoria);

        String typec = jo.get("type").getAsString();
        
        String pregunta = jo.get("setup").getAsString();
        String joke = jo.get("delivery").getAsString();
        JsonObject banderas = jo.get("flags").getAsJsonObject();
        List<Bandera> flags = new ArrayList<>();
        String[] b = new String[]{"nsfw","religious","political","racist","sexist","explicit"};
        for (int i = 0; i < b.length; i++) {
            if (banderas.get(b[i]).getAsBoolean()) {
                flags.add(Bandera.valueOf(b[i]));
            }
        }
        
        
        boolean seguro = jo.get("safe").getAsBoolean();
        int id = jo.get("id").getAsInt();
        String idioma = jo.get("lang").getAsString();

        chiste = new Chiste(error, categoria1, typec, pregunta, joke, flags, seguro, id, idioma);
        return chiste;
    }

}
