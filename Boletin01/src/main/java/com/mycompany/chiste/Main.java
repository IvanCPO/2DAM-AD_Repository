/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chiste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author a22ivancp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://v2.jokeapi.dev/joke/Programming?lang=es");
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is));
        
        StringBuilder res = new StringBuilder();
        String linha;
        while ((linha = br.readLine())!= null) {
            res.append(linha).append(System.lineSeparator());
        }
        System.out.println(res.toString());
        Chiste ch = new ChisteDAO().readChisteJSON(res.toString());
        System.out.println(ch);
    }
    
}
