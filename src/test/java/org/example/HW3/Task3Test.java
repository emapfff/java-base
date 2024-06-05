package org.example.HW3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void freeqDict() {
        assertEquals(Task3.freeqDict(Arrays.asList("Geeks", "for", "Geeks")), "{bb: 2, a: 2}");
    }
}