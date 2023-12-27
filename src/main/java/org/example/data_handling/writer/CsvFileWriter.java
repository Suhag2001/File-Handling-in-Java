package org.example.data_handling.writer;

import org.example.data_handling.model.House;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class CsvFileWriter {
    public static void dataWrite(List<House> houses,String path) {
        File file = new File(path);
        StringBuffer sb = new StringBuffer();
        for (House house : houses) {
            String line = toCsv(house);
            sb.append(line);
            sb.append("\n");
        }
        try{
            FileWriter fw = new FileWriter(file);
            fw.write(sb.toString());
            fw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    private static String toCsv(House house) {
        return house.getSquareFeet()
                + "," + house.getBedrooms()
                + "," + house.getBathrooms()
                + "," + house.getNeighbourhood()
                + "," + house.getYear()
                + "," + house.getPrice();
    }
}
