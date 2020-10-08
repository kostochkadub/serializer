package ru.model;

import ru.serializer.JsonDeserializer;

import java.util.List;

public class UserList extends JsonDeserializer {

    List<User> users;

    public UserList(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
