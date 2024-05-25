package org.example.HW1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void countK() {
        assertEquals(Task6.countK(6621), 5);
        assertEquals(Task6.countK(6554), 4);
        assertEquals(Task6.countK(1234), 3);
    }
}