package org.example.HW1;

import java.util.Scanner;

public class Task4 {
    public static String fixString(String s) {
        char[] fixS = new char[s.length()];
        int i = 0;
        for (; i < s.length() - 1; i += 2) {
            fixS[i] = s.charAt(i + 1);
            fixS[i + 1] = s.charAt(i);
        }
        if (s.length() % 2 == 1) {
            fixS[i] = s.charAt(i);
        }
        return new String(fixS);
    }
}
