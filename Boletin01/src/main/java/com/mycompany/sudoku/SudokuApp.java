
package com.mycompany.sudoku;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class SudokuApp {

    public static void main(String[] args) throws Exception {

        char[][] tabla = {
    {'5', '3', '0', '0', '7', '0', '0', '0', '0'},
    {'6', '0', '0', '1', '9', '5', '0', '0', '0'},
    {'0', '9', '8', '0', '0', '0', '0', '6', '0'},
    {'8', '0', '0', '0', '6', '0', '0', '0', '3'},
    {'4', '0', '0', '8', '0', '3', '0', '0', '1'},
    {'7', '0', '0', '0', '2', '0', '0', '0', '6'},
    {'0', '6', '0', '0', '0', '0', '2', '8', '0'},
    {'0', '0', '0', '4', '1', '9', '0', '0', '5'},
    {'0', '0', '0', '0', '8', '0', '0', '7', '9'}
};
        Sudoku sudok = new Sudoku(tabla);
        sudok.saveSudoku("sudoku.txt");
        /*Sudoku sudo = Sudoku.loadSudokuFromTXT("sudoku.txt");
        System.out.println(sudo);
        System.out.println("sudo.isCompleted() = " + sudo.isCompleted());
        System.out.println("sudo.isValid() = " + sudo.isValid());*/
//        List<Sudoku> sudos = sudo.getChildren();
//        if(sudos!=null)
//        for (Object sudo1 : sudos) {
//            System.out.println(sudo1);
//        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(sudok);
        System.out.println(json);
    }
}
