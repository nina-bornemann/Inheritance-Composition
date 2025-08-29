package com.ninabornemann;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Inheritance Cars and Motorcycles

        Vehicle vehicle1 = new Vehicle("MAN", "LKW", 1998);
        System.out.println(vehicle1);
        System.out.println(vehicle1.information());

        Car car1 = new Car("Renault", "Clio", 2002, 4);
        System.out.println(car1);
        System.out.println(car1.information());
        Car car2 = new Car("Audi", "A4", 2005, 2);
        System.out.println(car2);
        System.out.println(car2.information());

        Motorcycle bike1 = new Motorcycle("Honda", "Maisto", 2025, 200, "cute bike");
        System.out.println(bike1.typeInfo());
        System.out.println(bike1);
        System.out.println(bike1.information());

        // Polymorphism

        Vehicle[] vehicles = {vehicle1, car1, car2, bike1};
        System.out.println(Arrays.toString(vehicles));
        String [] ExpManufacturers = {vehicle1.getManufacturer(),
                car1.getManufacturer(),
                car2.getManufacturer(),
                bike1.getManufacturer()};
        System.out.println(Arrays.toString(ExpManufacturers));

        String[] manufacturers = new String[4];
        for (int i = 0; i < vehicles.length; i++) {
            manufacturers[i] = vehicles[i].getManufacturer();
        }
        System.out.println(Arrays.toString(manufacturers));


        // Composition Trains

        Train train1 = new Train("Flixtrain", "special", 2020, 300, 5);
        System.out.println(train1);
        System.out.println(train1.informations());



    }
}