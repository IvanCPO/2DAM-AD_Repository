package com.mycompany.juego;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class JuegoTypeAdapter extends TypeAdapter<Juego>{


    @Override
    public void write(JsonWriter jsonWriter, Juego juego) throws IOException {

    }

    @Override
    public Juego read(JsonReader jsonReader) throws IOException {

        if(jsonReader.hasNext()){
            if(jsonReader.peek() == null){
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            while(jsonReader.hasNext()){
                String name = jsonReader.nextName();
                switch(name){
                    case "id":
                        jsonReader.nextLong();
                        break;
                    case "title":
                        jsonReader.nextString();
                        break;
                    case "thumbnail":
                        jsonReader.nextString();
                        break;
                    case "status":
                        jsonReader.nextString();
                        break;
                    case "short_description":
                        jsonReader.nextString();
                        break;
                    case "description":
                        jsonReader.nextString();
                        break;
                    case "game_url":
                        jsonReader.nextString();
                        break;
                    case "genre":
                        jsonReader.nextLong();
                        break;
                    case "platform":
                        jsonReader.nextLong();
                        break;



                    case "fecha":
                        jsonReader.nextString();
                        break;

                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        }
        else{
            jsonReader.skipValue();
        }

        return null;
    }
}
