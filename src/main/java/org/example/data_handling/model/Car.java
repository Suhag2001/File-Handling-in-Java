package org.example.data_handling.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String model;
    private int year;
    private int price;
    private String transmission;
    private int mileage;
    private String fuelType;
    private int tax;
    private double mpg;
    private double engineSize;

    @Override
    public String toString() {
        return model+","+year+","+price+","+transmission+","+mileage+","+fuelType+","+tax+","+mpg+","+engineSize;
    }
}
