package com.mycompany.sudoku;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a22ivancp
 */
public class SudokuDAO {
    private String JSON_FILE = "sudoku.json";
    private Gson gson;

    public SudokuDAO() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    public void saveToObject(Sudoku sudo, String file){
        try (ObjectOutputStream ois = new ObjectOutputStream(
                    new BufferedOutputStream(Files.newOutputStream(Path.of(file))))) {
            ois.writeObject(sudo);
        } catch (IOException ex) {
            Logger.getLogger(SudokuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveToJson(Sudoku sudo, String file){
        try {
            gson.toJson(sudo, Files.newBufferedWriter(Path.of(file)));
        } catch (IOException ex) {
            Logger.getLogger(SudokuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveToJson(Sudoku sudo){
        saveToJson(sudo, JSON_FILE);
    }
    
    public Sudoku getFromJson(String file){
        Sudoku su = null;
        
        return su;
    }
    
    public Sudoku getFromJson(){
        return getFromJson(JSON_FILE);
    }
    
    
    
}
