package com.mycompany.juego.dao;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDate;

public class DateAdapter extends TypeAdapter<LocalDate> {
    @Override
    public void write(JsonWriter jsonWriter, LocalDate localDate) throws IOException {

    }

    @Override
    public LocalDate read(JsonReader jsonReader) throws IOException {
        String date = jsonReader.nextString();
        String[] values = date.split("-");
        return LocalDate.of(Integer.parseInt(values[0]),Integer.parseInt(values[1]),Integer.parseInt(values[2]));
    }
}
