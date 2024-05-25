package org.example.HW1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void minutesToSeconds() {
        assertEquals(Task1.minutesToSeconds("01:00"), 60);
        assertEquals(Task1.minutesToSeconds("13:56"), 836);
        assertEquals(Task1.minutesToSeconds("10:60"), -1);
    }
}