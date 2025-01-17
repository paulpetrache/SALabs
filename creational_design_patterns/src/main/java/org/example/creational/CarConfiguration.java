package org.example.creational;

import org.example.creational.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {
        // TODO: Create and configure different cars using the Builder pattern

        Car car1 = new Car.Builder("V12", "manual")
                .setInterior("white leather")
                .setColor("fire red")
                .setHasSunroof(true)
                .setHasGPS(false)
                .setHasSafetyPackage(false)
                .build();

        System.out.println(car1);
    }
}

