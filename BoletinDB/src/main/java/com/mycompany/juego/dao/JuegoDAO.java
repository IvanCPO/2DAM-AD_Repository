package com.mycompany.juego.dao;

import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mycompany.juego.Genero;
import com.mycompany.juego.Juego;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class JuegoDAO implements IDAO<Juego> {
    private final GsonBuilder gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new DateAdapter())
            .setPrettyPrinting();
    @Override
    public List<Juego> getAll() {
        return null;
    }

    @Override
    public Juego getByID(int id) {
        return null;
    }

    @Override
    public void save(Juego juego) {

    }

    @Override
    public void saveAll(List<Juego> t) {

    }

    @Override
    public void delete(Juego juego) {

    }

    @Override
    public void deleteAll(List<Juego> t) {

    }

    @Override
    public List<Juego> getFromJson(String json) {

        List<Juego> lista = null;

        try (BufferedReader br = Files.newBufferedReader(Paths.get(json))){
            lista = gson.create().fromJson(br, new TypeToken<List<Juego>>(){}.getType());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }

    @Override
    public Juego getFromJson(String json, int id) {
        return null;
    }

    @Override
    public void update(Juego juego) {

    }

    @Override
    public String getAsString(int id) {
        return null;
    }
}
