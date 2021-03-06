package ru.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import ru.model.UserCollection;

import java.io.File;
import java.io.IOException;

public class JsonDeserializer implements UserListDeserializer {

    public UserCollection deserialize(String filename) {

        ObjectMapper objectMapper = new ObjectMapper();
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
