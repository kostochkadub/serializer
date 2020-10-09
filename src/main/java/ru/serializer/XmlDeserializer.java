package ru.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ru.model.UserCollection;

import java.io.File;
import java.io.IOException;

public class XmlDeserializer {

    public UserCollection deserialize(String filename) {

        XmlMapper objectMapper = new XmlMapper();
        ObjectReader objectReader = objectMapper.readerFor(UserCollection.class);
        UserCollection o = null;
        try {
            o = objectReader.readValue(new File(filename), UserCollection.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return o;
    }

}
