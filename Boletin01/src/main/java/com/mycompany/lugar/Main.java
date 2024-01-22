/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lugar;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author a22ivancp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://api.zippopotam.us/es/36980");
        InputStream in = url.openStream();
        
        BufferedReader br = new BufferedReader(
                new InputStreamReader(in));
        
        StringBuilder res = new StringBuilder();
        String linha;
        while ((linha = br.readLine())!= null) {
            res.append(linha).append(System.lineSeparator());
        }
        String json = res.toString();
        System.out.println(json);
        
        GsonBuilder gb = new GsonBuilder();
        Gson gson = gb.setPrettyPrinting()
                .registerTypeAdapter(CodigoPostal.class, new CodPostalDeserializer())
//                .registerTypeAdapter(Lugar.class, new LugarDeserializer())
                .create();
        
        CodigoPostal cp = gson.fromJson(json, CodigoPostal.class);
        
        System.out.println(cp);
    }
    
}
