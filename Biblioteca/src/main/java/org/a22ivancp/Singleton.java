package org.a22ivancp;


public class Singleton {
    private static EntityManagerUtil instance;
    private Singleton(){

    }

    public static EntityManagerUtil getInstance(){
        if (instance==null)
            instance = new EntityManagerUtil();

        return instance;
    }
}
