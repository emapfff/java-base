package org.example.HW1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {

    @Test
    void buildNewNumberTest() {
        assertEquals(Task5.buildNewNumber(11211230), 2333);
        assertEquals(Task5.buildNewNumber(2333), 56);
        assertEquals(Task5.buildNewNumber(56), 11);
    }

    @Test
    void validPalindromeTest() {
        assertTrue(Task5.validPalindrome(11));
        assertTrue(Task5.validPalindrome(363));
        assertFalse(Task5.validPalindrome(2345));
    }

    @Test
    void isPalindromeDescendant() {
        assertTrue(Task5.isPalindromeDescendant(11211230));
        assertTrue(Task5.isPalindromeDescendant(13001120));
        assertTrue(Task5.isPalindromeDescendant(23336014));
        assertTrue(Task5.isPalindromeDescendant(11));
        assertFalse(Task5.isPalindromeDescendant(2345));
    }
}