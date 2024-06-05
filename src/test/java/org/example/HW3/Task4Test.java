package org.example.HW3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void convertToRoman() {
        assertEquals(Task4.convertToRoman(12), "XII");
        assertEquals(Task4.convertToRoman(2), "II");
        assertEquals(Task4.convertToRoman(16), "XVI");
    }
}