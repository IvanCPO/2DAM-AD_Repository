/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lugar;

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
public class CodPostalDeserializer implements JsonSerializer<CodigoPostal>, JsonDeserializer<CodigoPostal> {

    @Override
    public JsonElement serialize(CodigoPostal t, Type type, JsonSerializationContext jsc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CodigoPostal deserialize(JsonElement je, Type type,
            JsonDeserializationContext jdc)
            throws JsonParseException {

        JsonObject jObject = je.getAsJsonObject();
        int codigoPost = jObject.get("post code").getAsInt();
        String pais = jObject.get("country").getAsString();
        String abrevPais = jObject.get("country abbreviation").getAsString();

        JsonArray ja = jObject.get("places").getAsJsonArray();
        List<Lugar> lugares = new ArrayList<>();
        for (JsonElement lugar : ja) {
            JsonObject obj = lugar.getAsJsonObject();
            String name = obj.get("place name").getAsString();
            double longit = obj.get("longitude").getAsDouble();
            String estado = obj.get("state").getAsString();
            String abrevEstado = obj.get("state abbreviation").getAsString();
            double latitud = obj.get("latitude").getAsDouble();
            lugares.add(new Lugar(name, longit, estado, abrevEstado, latitud));
        }
//            List<Lugar> lugares =(List<Lugar>) jObject.get("places");
        return new CodigoPostal(codigoPost, pais, abrevPais, lugares);
    }

}
