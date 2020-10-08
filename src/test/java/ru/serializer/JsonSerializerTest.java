package ru.serializer;

import ru.model.User;
import ru.model.UserList;

import java.util.ArrayList;

class JsonSerializerTest {

    @org.junit.jupiter.api.Test
    void serialize() {

        User user1 = new User(1, "Pasha", "pashka@mail.ru");
        User user2 = new User(2, "Masha", "mashka@mail.ru");

        UserList userList = new UserList(new ArrayList<User>());
        userList.getUsers().add(user1);
        userList.getUsers().add(user2);

        JsonSerializer jsonUserSerializer = new JsonSerializer();
        jsonUserSerializer.serialize(userList, "Users.json");
    }
}