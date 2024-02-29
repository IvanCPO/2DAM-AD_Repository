package org.a22ivancp;

import jakarta.persistence.*;

@Entity
public class RequisitosSistema {

    @Id
    private int idJuego;
    private String os;
    @Column(name = "procesador", length = 128)
    private String processor;
    @Column(name = "graficos", length = 128)
    private String graphics;
    @Column(name = "memoria", length = 128)
    private String memory;
    @Column(name = "almacenamiento", length = 128)
    private String storage;

    public RequisitosSistema() {
    }

    public RequisitosSistema(int idJuego, String os, String processor, String graphics, String memory, String storage) {
        this.idJuego = idJuego;
        this.os = os;
        this.processor = processor;
        this.graphics = graphics;
        this.memory = memory;
        this.storage = storage;
    }

    public RequisitosSistema(String os, String processor, String graphics, String memory, String storage) {
        this.os = os;
        this.processor = processor;
        this.graphics = graphics;
        this.memory = memory;
        this.storage = storage;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "RequisitosSistema{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
