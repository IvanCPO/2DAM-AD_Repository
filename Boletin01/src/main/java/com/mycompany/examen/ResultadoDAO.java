package com.mycompany.examen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResultadoDAO implements IResultadosDAO{
    private static Gson GSON;

    public ResultadoDAO(){
        GSON = new GsonBuilder()
                .registerTypeAdapter(Partido.class, new PartidoDeserializer())
                .registerTypeAdapter(Equipo.class, new EquipoTypeAdapter())
                .setPrettyPrinting()
                .create();
    }
    @Override
    public Resultados getResultadosFromJSON(String ruta) {
        Resultados res = null;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(ruta))){
            res=GSON.fromJson(br,Resultados.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return res;
    }

    @Override
    public boolean saveResultadosToTxt(Resultados resultados, String ruta) {
        boolean save = false;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            bw.write(resultados.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return save;
    }

    @Override
    public boolean saveResultadosToObject(Resultados resultados, String ruta) {
        boolean save = false;
        try (ObjectOutputStream ois = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ruta)))){
            ois.writeObject(resultados);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return save;
    }

    @Override
    public Resultados getResultadosFromObject(String ruta) {
        Resultados res = null;
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(ruta)))){
            res=(Resultados) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return res;
    }
}
