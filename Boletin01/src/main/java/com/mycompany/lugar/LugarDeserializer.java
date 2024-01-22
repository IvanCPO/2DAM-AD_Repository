/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lugar;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author a22ivancp
 */
public class LugarDeserializer implements JsonSerializer<Lugar>, JsonDeserializer<Lugar>{

    @Override
    public JsonElement serialize(Lugar t, Type type, JsonSerializationContext jsc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Lugar deserialize(JsonElement je, Type type, 
            JsonDeserializationContext jdc)
            throws JsonParseException {
        
            JsonObject jObject = je.getAsJsonObject();
            String name = jObject.get("place name").getAsString();
            double longit = jObject.get("longitude").getAsDouble();
            String estado = jObject.get("state").getAsString();
            String abrevEstado = jObject.get("state abbreviation").getAsString();
            double latitud = jObject.get("latitude").getAsDouble();
            return new Lugar(name,  longit,  estado, abrevEstado, latitud);
    }
    
}
