package com.ninabornemann;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    @Test
    void informations_isEqual() {
        Train train = new Train("DB", "ICE", 2024, 300, 6);
        String expected = "Vehicle{manufacturer='DB', model='ICE', year=2024}, 300kmh, 6";
        String actual = train.informations();
        assertEquals(expected, actual);
    }

    @Test
    void getModel_isTrue() {
        Train train = new Train("DB", "ICE", 2024, 300, 6);
        assertTrue(train.getModel().equals("ICE"));
    }

    @Test
    void getModel_isFalse() {
        Train train = new Train("DB", "ICE", 2024, 300, 6);
        assertFalse(train.getModel().equals("RE"));
    }


    @Test
    void getSpeed_isTrue() {
        Train train = new Train("DB", "ICE", 2024, 300, 6);
        assertTrue(train.getSpeed() == 300);
    }
    @Test
    void getSpeed_isFalse() {
        Train train = new Train("DB", "ICE", 2024, 300, 6);
        assertFalse(train.getSpeed() == 350);
    }
}