package com.ninabornemann;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private int weight;
    private String type;

    public Motorcycle(String manufacturer, String model, int year, int weight, String type) {
        super(manufacturer, model, year);
        this.weight = weight;
        this.type = type;
    }

    public String typeInfo() {
        return "Motorcycle type= " + type;
    }

    @Override
    public String toString() {
        return super.toString() + " Motorcycle{weight=" + weight + "kg, Type='" + type + "'}";
    }

    @Override
    public String information() {
        return super.information() + ", " + weight + ", " + type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return weight == that.weight && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, type);
    }
}
