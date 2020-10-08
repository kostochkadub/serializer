package ru.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import ru.model.UserList;

import java.io.File;
import java.io.IOException;

public class JsonSerializer implements UserListSerializer {

    public File serialize(UserList userList, String filename) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter objectWriter = mapper.writerFor(UserList.class);
        File file = new File(filename);

        try {
            objectWriter.writeValue(file, userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

}
