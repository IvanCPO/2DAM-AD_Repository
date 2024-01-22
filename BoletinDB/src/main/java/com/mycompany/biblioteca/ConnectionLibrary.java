package com.mycompany.biblioteca;

public class ConnectionLibrary {
    private static ConnectionManager instance;

    private ConnectionLibrary(){
        instance = new ConnectionManager();
    }

    public static ConnectionManager getInstance(){
        if (instance == null)
            synchronized (ConnectionManager.class) {
                if (instance == null)
                    new ConnectionLibrary();
            }
        return instance;
    }

}
