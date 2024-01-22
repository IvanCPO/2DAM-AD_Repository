package org.a22ivancp;

public interface DAO <T>{
    void create (T object);
    void delete (T object);
    void update (T object);
    T read (Long id);
}
