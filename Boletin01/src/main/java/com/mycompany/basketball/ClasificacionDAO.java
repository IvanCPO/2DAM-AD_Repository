/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basketball;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22ivancp
 */
public class ClasificacionDAO {

    private final static String OBJECT_FILE = "clasificacion.dat";
    private final static String JSON_FILE = "clasificacion.json";
    private Gson gson;

    public ClasificacionDAO() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void saveToObject(Clasificacion c) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(OBJECT_FILE)))) {
            oos.writeObject(c);
        } catch (IOException ex) {
            Logger.getLogger(ClasificacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    public void saveToJSON(Clasificacion c, String file) {
        try {
            gson.toJson(c, Files.newBufferedWriter(Path.of(file)));
        } catch (IOException ex) {
            Logger.getLogger(ClasificacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveToJSON(Clasificacion c) {
        saveToJSON(c, JSON_FILE);
    }

    public Clasificacion getFromObject() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(OBJECT_FILE)))) {
            return (Clasificacion)ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ClasificacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }

    public Clasificacion getFromJSON(String file) {
        try {
            return gson.fromJson(new FileReader(file), Clasificacion.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClasificacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Clasificacion getFromJSON() {
        return getFromJSON(JSON_FILE);
    }
}
