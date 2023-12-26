package org.example.data_handling.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class House {

    int squareFeet;
    int bedrooms;
    int bathrooms;
    String neighbourhood;
    int year;
    double price;
}