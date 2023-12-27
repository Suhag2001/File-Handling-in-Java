package org.example.data_handling;

import org.example.data_handling.model.Car;
import org.example.data_handling.reader.file.csv.CarCsvFileReader;
import org.example.data_handling.writer.IFileWriter;
import org.example.data_handling.writer.csv.CarCsvFileWriter;
import org.example.data_handling.writer.json.JsonFileWriter;

import java.util.ArrayList;
import java.util.List;

public class CarFileApp {
  private static List<Car> allCars = new ArrayList<>();
    public static void main(String[] args) {
        String[] fileNames = {"audi","bmw","ford","hyundi","merc","skoda","toyota","vauxhall","vw"};
       for (String fileName : fileNames) {
           CarCsvFileReader reader = new CarCsvFileReader("src/main/resources/cars/"+fileName+".csv");
           List<Car> cars = reader.read();
           System.out.println(cars.size());
           allCars.addAll(cars);
       }
        System.out.println("All File size : "+allCars.size());

        IFileWriter fwCsv = new CarCsvFileWriter();
        IFileWriter fwJson = new JsonFileWriter();

        fwCsv.write(allCars, "src/main/resources/oneCarList/allCars.csv");

        fwJson.write(allCars, "src/main/resources/carJson/allCars.json");


    }
}
