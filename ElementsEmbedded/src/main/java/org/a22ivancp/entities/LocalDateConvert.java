package org.a22ivancp.entities;

import jakarta.persistence.AttributeConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateConvert implements AttributeConverter<LocalDate, String> {
    @Override
    public String convertToDatabaseColumn(LocalDate attribute) {
        if (attribute==null)
            return null;
        return attribute.toString().replace("-","");
    }

    @Override
    public LocalDate convertToEntityAttribute(String dbData) {
        if (dbData==null)
            return null;
        return LocalDate.parse(dbData, DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}
