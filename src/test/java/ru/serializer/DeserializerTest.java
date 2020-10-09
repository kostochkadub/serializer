package ru.serializer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.model.UserCollection;

class DeserializerTest {

    @Test
    void deserializeJson() {
        JsonDeserializer jsonDeserializer= new JsonDeserializer();
        UserCollection deserialize = jsonDeserializer.deserialize(".\\Users.json");
        System.out.println(deserialize);
        Assertions.assertNotNull(deserialize);
    }

    @Test
    void deserializeXml() {
        XmlDeserializer xmlDeserializer= new XmlDeserializer();
        UserCollection deserialize = xmlDeserializer.deserialize(".\\Users.xml");
        System.out.println(deserialize);
        Assertions.assertNotNull(deserialize);
    }

    @Test
    void deserializeCsv() {
        JsonDeserializer jsonDeserializer= new JsonDeserializer();
        UserCollection deserialize = jsonDeserializer.deserialize(".\\Users.csv");
        System.out.println(deserialize);
        Assertions.assertNotNull(deserialize);
    }
}