package ru.serializer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import ru.model.User;
import ru.model.UserCollection;

import java.io.File;
import java.util.ArrayList;

class SerializerTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Получить Json")
    void serializeJson() {
        UserCollection userCollection = getUserCollection();

        System.out.println(userCollection);

        JsonSerializer jsonUserSerializer = new JsonSerializer();
        jsonUserSerializer.serialize(userCollection, "Users.json");

        File file = new File("Users.json");

        Assertions.assertTrue(file.exists());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Получить Xml")
    void serializeXml() {
        UserCollection userCollection = getUserCollection();

        System.out.println(userCollection);

        XmlSerializer xmlSerializer = new XmlSerializer();
        xmlSerializer.serialize(userCollection, "Users.xml");

        File file = new File("Users.xml");

        Assertions.assertTrue(file.exists());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Получить CSV")
    void serializeCsv() {
        UserCollection userCollection = getUserCollection();

        System.out.println(userCollection);

        CsvSerializer csvSerializer = new CsvSerializer();
        csvSerializer.serialize(userCollection, "Users.csv");

        File file = new File("Users.csv");

        Assertions.assertTrue(file.exists());
    }


    private UserCollection getUserCollection() {
        User user1 = new User(1, "Pasha", "pashka@mail.ru");
        User user2 = new User(2, "Masha", "mashka@mail.ru");
        User user3 = new User(3, "Sasha", "sashka@mail.ru");
        User user4 = new User(4, "user4", "user4@mail.ru");
        User user5 = new User(5, "user5", "user5@mail.ru");
        User user6 = new User(6, "user6", "user6@mail.ru");
        User user7 = new User(7, "user7", "user7@mail.ru");
        User user8 = new User(8, "user8", "user8@mail.ru");
        User user9 = new User(9, "user9", "user9@mail.ru");
        User user10 = new User(10, "user10", "user10@mail.ru");


        UserCollection userCollection = new UserCollection(new ArrayList<>());
        userCollection.getUsers().add(user1);
        userCollection.getUsers().add(user2);
        userCollection.getUsers().add(user3);
        userCollection.getUsers().add(user4);
        userCollection.getUsers().add(user5);
        userCollection.getUsers().add(user6);
        userCollection.getUsers().add(user7);
        userCollection.getUsers().add(user8);
        userCollection.getUsers().add(user9);
        userCollection.getUsers().add(user10);
        return userCollection;
    }
}