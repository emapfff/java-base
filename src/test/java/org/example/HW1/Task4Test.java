package org.example.HW1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void fixString() {
        assertEquals(Task4.fixString("123456"), "214365");
        assertEquals(Task4.fixString("hTsii  s aimex dpus rtni.g"), "This is a mixed up string.");
        assertEquals(Task4.fixString("badce"),"abcde");
    }
}