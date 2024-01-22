package com.mycompany.biblioteca;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppLibrary {
    private static final String RUTA_ARCHIVOS = "/home/sanclemente.local/a22ivancp/Escritorio/AccesoDatos/coverbooks";
    public static void main(String[] args) {
        Connection con = ConnectionLibrary.getInstance().getConnection();

        if (con != null){

            try (PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO PUBLIC.Book " +
                            "(isbn, titulo, autor, anho, disponible, portada)" +
                            " VALUES " +
                            "(?, ?, ?, ?, ?, ?);"
            )){
                con.setAutoCommit(false);

                ps.setString(1,"9788499088150");
                ps.setString(2,"Verano");
                ps.setString(3,"J. M. Coetzee");
                ps.setInt(4, 2009);
                ps.setBoolean(5, true);
                ps.setBinaryStream(6, getBytesPicture("9788499088150"));
                ps.addBatch();

                ps.setString(1,"9788433960023");
                ps.setString(2,"Niveles de Vida");
                ps.setString(3,"Julian Barnes");
                ps.setInt(4, 2013);
                ps.setBoolean(5, true);
                ps.setBinaryStream(6, getBytesPicture("9788433960023"));
                ps.addBatch();


                int[] updateCounts = ps.executeBatch();
                con.commit();
            } catch (SQLException e) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }

    }

    private static InputStream getBytesPicture(String image) {
        try {
            return Files.newInputStream(Paths.get(RUTA_ARCHIVOS,image+".jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
