package com.ninabornemann;

public class Train {
    private Vehicle vehicle;
    private int speed;
    private int wagons;

    public Train(String manufacturer, String model, int year, int speed, int wagons) {
        this.vehicle = new Vehicle(manufacturer, model, year);
        this.speed = speed;
        this.wagons = wagons;
    }

    @Override
    public String toString() {
        return "Train{" + vehicle +
                ", speed=" + speed +
                ", wagons=" + wagons +
                '}';
    }

    public String informations() {
        return  vehicle + ", " + speed +  "kmh, " + wagons;
    }

    public String getManufacturer() {
        return vehicle.getManufacturer();
    }
    public String getModel() {
        return vehicle.getModel();
    }
    public int getYear() {
        return vehicle.getYear();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }
}
