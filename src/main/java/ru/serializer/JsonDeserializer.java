package ru.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import ru.model.UserList;

import java.io.File;
import java.io.IOException;

public class JsonDeserializer implements UserListDeserializer {

    public UserList deserialize(String filename) {

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.readerFor(UserList.class);
        UserList o = null;
        try {
            o = objectReader.readValue(new File(filename), UserList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return o;
    }
}
