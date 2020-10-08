package ru.serializer;

import ru.model.UserList;

import java.io.File;

public interface UserListSerializer {

    File serialize(UserList userList, String filename);
}
