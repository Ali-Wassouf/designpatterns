package com.wassouf.ali.builder;

import com.wassouf.ali.builder.classes.Car;
import com.wassouf.ali.builder.classes.ElectricCar;
import com.wassouf.ali.builder.classes.GasolineCar;

public class Demo
{
    public static void main(String... args)
    {
        Car electricalCar = ElectricCar.getBuilder()
            .setBatteryCapacity(10.0).setColor("pink")
            .setManufacturer("Mercedes")
            .setYearModel(1998)
            .build();

        Car fuelCar = GasolineCar.getBuilder()
            .setGasTankCapacity(10.0).setColor("pink")
            .setManufacturer("Mercedes")
            .setYearModel(1998)
            .build();


        System.out.println(electricalCar);
        System.out.println(fuelCar);
    }
}
