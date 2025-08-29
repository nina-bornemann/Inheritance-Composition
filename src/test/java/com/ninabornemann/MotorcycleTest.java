package com.ninabornemann;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void typeInfo_isEqual() {
    Motorcycle bike = new Motorcycle("Honda", "maisto", 2019, 200, "fast");
    String expected = "Motorcycle type= fast";
    String actual = bike.typeInfo();
    assertEquals(expected, actual);
    }

    @Test
    void information_isEqual() {
    Motorcycle bike = new Motorcycle("Honda", "maisto", 2019, 200, "fast");
    String expected = "Honda, maisto, 2019, 200, fast";
    String actual = bike.information();
    assertEquals(expected, actual);
    }

    @Test
    void getWeight_isTrue() {
    Motorcycle bike = new Motorcycle("Honda", "maisto", 2019, 200, "fast");
    assertTrue(bike.getWeight() == 200);
    }

    @Test
    void getWeight_isFalse() {
        Motorcycle bike = new Motorcycle("Honda", "maisto", 2019, 200, "fast");
        assertFalse(bike.getWeight() == 300);
    }
}