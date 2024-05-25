package org.example.HW1;

import java.util.Arrays;

public class Task6 {

    public static int countK(Integer num) {
        int k = 0;
        while (num != 6174) {
            k++;
            char[] numString = num.toString().toCharArray();
            Arrays.sort(numString);
            int min = Integer.parseInt(String.copyValueOf(numString));
            int max = Integer.parseInt(new StringBuilder(new String(numString)).reverse().toString());
            num = max - min;
        }
        return k;
    }
}
