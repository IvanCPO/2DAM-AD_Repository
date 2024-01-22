package com.mycompany.juego;

import com.mycompany.juego.dao.IDAO;
import com.mycompany.juego.dao.JuegoDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IDAO<Juego> dao = new JuegoDAO();
        List<Juego> lista = dao.getFromJson("juegos.json");
        for ( Juego juego: lista ) {
            System.out.println(juego);
        }
    }
}
