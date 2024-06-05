package org.example.HW3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @ParameterizedTest
    @CsvSource({"Hello world!, Svool dliow!",
            "Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ― Martin Fowler," +
                    "Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi"})
    void atBash(String inputString, String expected) {
        assertEquals(Task1.atBash(inputString), expected);
    }
}