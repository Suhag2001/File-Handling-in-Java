package org.example.file_handling2;

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
