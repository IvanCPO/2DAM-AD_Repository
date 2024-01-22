/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiste;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author a22ivancp
 */
public class ChisteDAO implements IChisteDAO{

    @Override
    public Chiste readChisteJSON(String json) {
        Chiste chiste = null;
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting()
                .registerTypeAdapter(Chiste.class, new ChisteDeserializer());
        
        Gson gson = gb.create();
        chiste = gson.fromJson(json, Chiste.class);
        return chiste;
    }

    @Override
    public URL getChiste() throws MalformedURLException {
        return new URL("https://v2.jokeapi.dev/joke");
    }

    @Override
    public URL getChisteByLang(String lang) throws MalformedURLException {
        return new URL("https://v2.jokeapi.dev/joke/?lang=es");
    }

    @Override
    public URL getChisteByCategory(String category) throws MalformedURLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
