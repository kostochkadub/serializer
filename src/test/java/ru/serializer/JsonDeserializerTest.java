package ru.serializer;

import org.junit.jupiter.api.Test;
import ru.model.UserList;

import static org.junit.jupiter.api.Assertions.*;

class JsonDeserializerTest {

    @Test
    void deserialize() {
        JsonDeserializer jsonDeserializer= new JsonDeserializer();
        UserList deserialize = jsonDeserializer.deserialize("C:\\Users\\karikh\\Desktop\\serializer\\Users.json");
        //System.out.println(deserialize);
    }
}