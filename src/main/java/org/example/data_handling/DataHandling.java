package org.example.data_handling;

import org.example.data_handling.filtering.DataFilter;
import org.example.data_handling.model.House;
import org.example.data_handling.reader.file.csv.CsvFileReader;
import org.example.data_handling.writer.CsvFileWriter;


import java.util.List;

public class DataHandling {
    public static void main(String[] args) {
        CsvFileReader reader = new CsvFileReader("src/main/resources/housing_price_dataset.csv");
        List<House> houses = reader.read();
//        for (House house : houses) {
//            System.out.println(house.toString());
//        }

        List<House> house2bhk = DataFilter.filterList(houses, 2);
        List<House> house3bhk = DataFilter.filterList(houses, 3);
        List<House> house4bhk = DataFilter.filterList(houses, 4);
        List<House> house5bhk = DataFilter.filterList(houses, 5);

       for (House house : house5bhk){
           System.out.println(house.toString());
       }

    CsvFileWriter.dataWrite( house2bhk,"src/main/resources/bhk/house2bhk.csv");
    CsvFileWriter.dataWrite( house3bhk,"src/main/resources/bhk/house3bhk.csv");
    CsvFileWriter.dataWrite( house4bhk,"src/main/resources/bhk/house4bhk.csv");
    CsvFileWriter.dataWrite( house5bhk,"src/main/resources/bhk/house5bhk.csv");

    }
}
