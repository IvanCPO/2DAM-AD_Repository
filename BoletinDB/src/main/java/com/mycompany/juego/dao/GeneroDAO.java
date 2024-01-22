package com.mycompany.juego.dao;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mycompany.juego.Genero;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GeneroDAO implements IDAO<Genero>{
    private final GsonBuilder gson = new GsonBuilder()
            .setPrettyPrinting();
    @Override
    public List<Genero> getAll() {
        return null;
    }

    @Override
    public Genero getByID(int id) {
        return null;
    }

    @Override
    public void save(Genero genero) {

    }

    @Override
    public void saveAll(List<Genero> t) {

    }

    @Override
    public void delete(Genero genero) {

    }

    @Override
    public void deleteAll(List<Genero> t) {

    }

    @Override
    public List<Genero> getFromJson(String json) {

        List<Genero> lista = null;

        try (BufferedReader br = Files.newBufferedReader(Paths.get(json))){
            lista = gson.create().fromJson(br, new TypeToken<List<Genero>>(){}.getType());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }

    @Override
    public Genero getFromJson(String json, int id) {

        Genero genero = null;

        try (BufferedReader br = Files.newBufferedReader(Paths.get(json))){
            genero = gson
                    .setExclusionStrategies(new ExclusionStrategy() {
                        @Override
                        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                            return false;
                        }

                        @Override
                        public boolean shouldSkipClass(Class<?> aClass) {
                            return false;
                        }
                    })
                    .create().fromJson(br, Genero.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return genero;
    }

    @Override
    public void update(Genero genero) {

    }

    @Override
    public String getAsString(int id) {
        return null;
    }
}
