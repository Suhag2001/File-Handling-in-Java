package org.example.data_handling.writer.csv;

import org.example.data_handling.writer.IFileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HouseCsvFileWriter implements IFileWriter {
    @Override
    public void write(List data, String outputPath) {
        try{
            File file = new File(outputPath);
            FileWriter fw = new FileWriter(file);
            fw.write("SquareFeet,Bedrooms,Bathrooms,Neighborhood,YearBuilt,Price");
            fw.write("\n");
            data.forEach(d -> {
                try{
                    fw.write(d.toString());
                    fw.write("\n");
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            });
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
