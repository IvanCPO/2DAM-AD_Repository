/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiempo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author a22ivancp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://servizos.meteogalicia.gal/mgrss/predicion/"
                + "jsonPredConcellos.action?idConc=15078&request_locale=gl");
        InputStream in = url.openStream();
        
        BufferedReader br = new BufferedReader(
        new InputStreamReader(in));
        
        StringBuilder sb = new StringBuilder();
        String linha;
        while ((linha = br.readLine())!= null) {
            sb.append(linha).append(System.lineSeparator());
        }
        
        String json =sb.toString();
        System.out.println("json = " + json);
        
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        
        Prediccion pred =gson.fromJson(json, Prediccion.class);
        System.out.println( pred);
    }
    
}
