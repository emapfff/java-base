package org.example.HW3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @ParameterizedTest
    @CsvSource({"()()(), () () ()",
            "((())), ((()))",
            "((()))(())()()(()()), ((())) (()) () () (()())",
            "((())())(()(()())), ((())()) (()(()()))"})
    void clusterize(String input, String expected) {
        assertEquals(Task2.clusterize(input), expected);
    }
}