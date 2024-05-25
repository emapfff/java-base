package org.example.HW1;

import java.util.*;

public class Task5 {
    public static boolean isPalindromeDescendant(Integer num) {
        while (true) {
            if (num.toString().length() < 2) {
                return false;
            }
            if (!validPalindrome(num)) {
                num = buildNewNumber(num);
            } else {
                return true;
            }
        }
    }

    public static Integer buildNewNumber(Integer num) {
        String numString = num.toString();
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < numString.length(); j+=2) {
            stringBuilder.append((numString.charAt(j) - '0') + (numString.charAt(j + 1) - '0'));
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static boolean validPalindrome(Integer num) {
        String numString = num.toString();
        int i = 0;
        int j = numString.length() - 1;
        while (i < j) {
            if (numString.charAt(i) != numString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
