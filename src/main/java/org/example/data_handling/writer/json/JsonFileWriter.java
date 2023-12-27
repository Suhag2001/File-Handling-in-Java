package org.example.data_handling.writer.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.data_handling.writer.IFileWriter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonFileWriter implements IFileWriter {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void write(List data, String outputPath) {
        try {
            objectMapper.writeValue(new File(outputPath), data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
