package ru.serializer;

import ru.model.UserList;

public interface UserListDeserializer {

    UserList deserialize(String filename);
}
