package com.ninabornemann;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void information_isEqual() {
        Vehicle vehicle = new Vehicle("Opel", "Corsa", 2000);
        String expected = "Opel, Corsa, 2000";
        String actual = vehicle.information();
        assertEquals(expected, actual);
    }
    @Test
    void information_isNotEqual() {
        Vehicle vehicle = new Vehicle("Opel", "Corsa", 2005);
        String unexpected = "Opel, Corsa, 2000";
        String actual = vehicle.information();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void getManufacturer_isTrue() {
        Vehicle vehicle = new Vehicle("Opel", "Corsa", 2000);
        assertTrue(vehicle.getManufacturer().equals("Opel"));
    }
    @Test
    void getManufacturer_isFalse() {
        Vehicle vehicle = new Vehicle("Audi", "A6", 2015);
        assertFalse(vehicle.getManufacturer().equals("Honda"));
    }

    @Test
    void testToString() {
    Vehicle vehicle = new Vehicle("Audi", "A6", 2015);
    String expected = "Vehicle{manufacturer='Audi', model='A6', year=2015}";
    String actual = vehicle.toString();
    assertEquals(expected, actual);
    }

    @Test
    void getModel_isTrue() {
        Vehicle vehicle = new Vehicle("Opel", "Corsa", 2000);
        assertTrue(vehicle.getModel().equals("Corsa"));
    }
    @Test
    void getModel_isFalse() {
        Vehicle vehicle = new Vehicle("Opel", "Corsa", 2000);
        assertFalse(vehicle.getModel().equals("RandomModel"));
    }

    @Test
    void getYear_isTrue() {
        Vehicle vehicle = new Vehicle("Opel", "Corsa", 2000);
        assertTrue(vehicle.getYear() == 2000);
    }
    @Test
    void getYear_isFalse() {
        Vehicle vehicle = new Vehicle("Opel", "Corsa", 2000);
        assertFalse(vehicle.getYear() == 2006);
    }
}