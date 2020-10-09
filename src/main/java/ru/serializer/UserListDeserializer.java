package ru.serializer;

import ru.model.UserCollection;

public interface UserListDeserializer {

    UserCollection deserialize(String filename);
}
