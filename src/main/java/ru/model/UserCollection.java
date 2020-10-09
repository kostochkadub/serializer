package ru.model;

import ru.serializer.JsonDeserializer;

import java.util.Collection;

public class UserCollection extends JsonDeserializer {

    Collection<User> users;

    public UserCollection() {
        super();
    }

    public UserCollection(Collection<User> users) {
        this.users = users;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserCollection{" +
                "users=" + users +
                '}';
    }
}
