package com.mycompany.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static final String DB_URL = "jdbc:h2:/home/sanclemente.local/a22ivancp/Documentos/profe/library.mv.db" +
            ";DB_CLOSE_ON_EXIT=TRUE;FILE_LOCK=NO";
    public static final String DB_DRIVER = "org.h2.Driver";

    private Connection conexion;

    public ConnectionManager(){
        try {
            Class.forName(DB_DRIVER);
            conexion = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.err.println("Error al conectar coa base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el driver: " + e.getMessage());
        }
    }

    public Connection getConnection(){
        return conexion;
    }

}
