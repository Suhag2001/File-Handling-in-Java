
 package org.example.file_handling2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 public class DataReader {

    
    public static void main(String[] args) {
        File file = new File("/scr/main/resoursec/housing_price_dataset.csv");
        try {

            BufferedReader bReader = new BufferedReader(new FileReader(file));
            String line = bReader.readLine();

            List<House> houses = new ArrayList<>();
            while( (line = bReader.readLine()) != null){
               House house = buildHouse(line);
               houses.add(house);
            }
            System.out.println("Total Houses: " + houses.size());

            List<House> houses2bhk = houses.stream().filter(house -> house.bedrooms == 2)
                    .collect(Collectors.toList());

            dataWrite(houses2bhk);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

     private static void dataWrite(List<House> houses2bhk) {
         File file = new File("./2bhk.csv");
         StringBuffer sb = new StringBuffer();
         for(House house : houses2bhk){
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
                + "," + house.bedrooms
                + "," + house.bathrooms
                + "," + house.neighbourhood
                + "," + house.year
                + "," + house.price;
     }

     private static House buildHouse(String line) {
        String[] tokens = line.split(",");
        return House.builder()
                .squareFeet(Integer.valueOf(tokens[0]))
                .bedrooms(Integer.valueOf(tokens[1]))
                .bathrooms(Integer.valueOf(tokens[2]))
                .neighbourhood(tokens[3])
                .year(Integer.valueOf(tokens[4]))
                .price(Double.valueOf(tokens[5]))
        .build();
    }
}