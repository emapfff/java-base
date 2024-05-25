package org.example.HW1;

public class Task2 {
    public static int countDigits(Integer num) {
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num != 0);
        return count;
    }

}
