package com.mycompany.juego.dao;

import java.util.List;

public interface IDAO<T> {
    List<T> getAll();
    T getByID(int id);
    void save(T t);
    void saveAll(List<T> t);
    void delete(T t);
    void deleteAll(List<T> t);
    List<T> getFromJson(String json);
    T getFromJson(String json, int id);
    void update(T t);
    String getAsString(int id);

}
