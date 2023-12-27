package org.example.houses_data_handling;

import org.example.houses_data_handling.filtering.DataFilter;
import org.example.houses_data_handling.model.House;
import org.example.houses_data_handling.reader.file.csv.CsvFileReader;
import org.example.houses_data_handling.writer.IFileWriter;
import org.example.houses_data_handling.writer.csv.CsvFileWriter;
import org.example.houses_data_handling.writer.json.JsonFileWriter;

import java.util.Collections;
import java.util.List;

public class FileApp {
    public static void main(String[] args) {
        CsvFileReader reader = new CsvFileReader("src/main/resources/housing_price_dataset.csv");
        List<House> houses = reader.read();

        IFileWriter fwCsv = new CsvFileWriter();
        IFileWriter fwJson = new JsonFileWriter();

        List<House> house2bhk = DataFilter.filterList(houses, 2);
        List<House> house3bhk = DataFilter.filterList(houses, 3);
        List<House> house4bhk = DataFilter.filterList(houses, 4);
        List<House> house5bhk = DataFilter.filterList(houses, 5);

        Collections.sort(house2bhk);// this is use  for sortin the data by bathRooms

        fwCsv.write(house2bhk, "src/main/resources/bhk/house2bhk.csv");
        fwCsv.write(house3bhk, "src/main/resources/bhk/house3bhk.csv");
        fwCsv.write(house4bhk, "src/main/resources/bhk/house4bhk.csv");
        fwCsv.write(house5bhk, "src/main/resources/bhk/house5bhk.csv");


        fwJson.write(house2bhk, "src/main/resources/jsonFiles/house2bhk.json");
        fwJson.write(house3bhk, "src/main/resources/jsonFiles/house3bhk.json");
        fwJson.write(house4bhk, "src/main/resources/jsonFiles/house4bhk.json");
        fwJson.write(house5bhk, "src/main/resources/jsonFiles/house5bhk.json");

    }
}
