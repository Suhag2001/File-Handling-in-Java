package org.example.data_handling.reader.file.csv;

import org.example.data_handling.model.Car;
import org.example.data_handling.model.House;
import org.example.data_handling.reader.file.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CarCsvFileReader implements FileReader {
    private String path;
    public CarCsvFileReader(String inputFilePath) {
        this.path = inputFilePath;
    }
    private static Car buildHouse(String line) {
        String[] tokens = line.split(",");
        return Car.builder()
                .model(tokens[0])
                .year(Integer.valueOf(tokens[1]))
                .price(Integer.valueOf(tokens[2]))
                .transmission(tokens[3])
                .mileage(Integer.valueOf(tokens[4]))
                .fuelType(tokens[5])
                .tax(Integer.parseInt(tokens[6]))
                .mpg(Double.parseDouble(tokens[7]))
                .engineSize(Double.parseDouble(tokens[8])).build();
    }

    @Override
    public List read() {
        File file = new File(path);
        try {
            BufferedReader bReader = new BufferedReader(new java.io.FileReader(file));
            String line = bReader.readLine();
            List<Car> cars = new ArrayList<>();
            while ((line = bReader.readLine()) != null) {
                Car car = buildHouse(line);
                cars.add(car);
            }
            return cars;

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
}
