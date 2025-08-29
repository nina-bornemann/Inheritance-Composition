package com.ninabornemann;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void information_isEqual() {
    Car car = new Car("Audi", "A4", 2005, 4);
    String expected = "Audi, A4, 2005, 4";
    String actual = car.information();
    assertEquals(expected, actual);
    }

    @Test
    void getNumberOfDoors_isTrue() {
    Car car = new Car("Opel", "Corsa", 2006, 2);
    assertTrue(car.getNumberOfDoors() == 2);
    }
    @Test
    void getNumberOfDoors_isFalse() {
        Car car = new Car("Opel", "Corsa", 2006, 2);
        assertFalse(car.getNumberOfDoors() == 4);
    }
}