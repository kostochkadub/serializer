package ru.serializer;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import ru.model.UserCollection;

import java.io.File;
import java.io.IOException;


public class CsvSerializer {

    public File serialize(UserCollection userCollection, String filename) {

        CsvSchema schema = CsvSchema.builder()
                .addColumn("users")
                .addColumn("id", CsvSchema.ColumnType.NUMBER)
                .addColumn("name")
                .addColumn("email")
                .build();
        CsvMapper mapper = new CsvMapper();

        mapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);
        //mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN,true);

        ObjectWriter objectWriter = mapper.writer(schema.withLineSeparator("\n").withColumnSeparator(' '));
        File file = new File(filename);

        try {
            objectWriter.writeValue(file, userCollection.getUsers().toArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


}
