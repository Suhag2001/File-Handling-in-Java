package org.example.data_handling;

import org.example.data_handling.model.House;
import org.example.data_handling.reader.file.csv.CsvFileReader;
import org.example.data_handling.writer.DataWriter;


import java.util.List;

public class DataHandling {
    public static void main(String[] args) {
        CsvFileReader reader = new CsvFileReader("src/main/resources/housing_price_dataset.csv");
        List<House> houses = reader.read();
//        for (House house : houses) {
//            System.out.println(house.toString());
//        }

        List<House> house2bhk = DataWriter.filterList(houses, 2);
        List<House> house3bhk = DataWriter.filterList(houses, 3);
        List<House> house4bhk = DataWriter.filterList(houses, 4);
        List<House> house5bhk = DataWriter.filterList(houses, 5);

       for (House house : house5bhk){
           System.out.println(house.toString());
       }

    DataWriter.dataWrite( house2bhk,"src/main/resources/bhk/house2bhk.csv");
    DataWriter.dataWrite( house3bhk,"src/main/resources/bhk/house3bhk.csv");
    DataWriter.dataWrite( house4bhk,"src/main/resources/bhk/house4bhk.csv");
    DataWriter.dataWrite( house5bhk,"src/main/resources/bhk/house5bhk.csv");

    }
}
