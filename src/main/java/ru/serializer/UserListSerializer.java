package ru.serializer;

import ru.model.UserCollection;

import java.io.File;

public interface UserListSerializer {

    File serialize(UserCollection userCollection, String filename);
}
