package org.example.HW1;

public class Task3 {
    public static boolean isNestable(int[] first, int[] second) {
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int j : first) {
            if (min1 > j) {
                min1 = j;
            }
            if (max1 < j) {
                max1 = j;
            }
        }

        for (int i : second) {
            if (min2 > i) {
                min2 = i;
            }
            if (max2 < i) {
                max2 = i;
            }
        }
        return min1 > min2 && max1 < max2;
    }

}
