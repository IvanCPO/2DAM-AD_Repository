/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prueba;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;

/**
 *
 * @author a22ivancp
 */
public class AppFolga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Poeta.class, (InstanceCreator<Poeta>) type -> {
            Poeta p = new Poeta();
            p.setCategoria("Poesía");
            return p;
        });
        Gson gson = gsonBuilder.create();

        String poetaJson = "{ \"nome\" : \"Anne Sexton\",  \"idade\" : 45}";
        Poeta poeta = gson.fromJson(poetaJson, Poeta.class);

// se supone que poeta tiene un campo denominado categoria.
        System.out.println(poeta.getCategoria());
        System.out.println(poeta);

    }

}
