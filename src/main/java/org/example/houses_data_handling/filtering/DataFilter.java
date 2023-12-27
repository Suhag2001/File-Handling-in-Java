package org.example.houses_data_handling.filtering;

import org.example.houses_data_handling.model.House;

import java.util.List;
import java.util.stream.Collectors;

public class DataFilter {
    public static List<House> filterList(List<House> list, int count){
        return   list.stream().filter(house -> house.getBedrooms()==count).collect(Collectors.toList());
    }

}
