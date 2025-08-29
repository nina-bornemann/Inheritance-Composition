package com.ninabornemann;

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

        // Composition Trains

        Train train1 = new Train("Flixtrain", "special", 2020, 300, 5);
        System.out.println(train1);
        System.out.println(train1.informations());



    }
}