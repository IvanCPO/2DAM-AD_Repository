/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.chiste;

/**
 *
 * @author a22ivancp
 */
public enum Categoria {
    Programming("Programming"),
    MISCELLANEOUS("Miscellaneous"),
    DARK("Dark"),
    PUN("Pun"),
    SPOOKY("Spooky"),
    CHRISTMAS("Christmas");
    String name;

    private Categoria(String name) {
        this.name = name;
    }
}
