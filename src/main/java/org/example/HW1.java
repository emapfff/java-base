package org.example;
import java.util.*;
public class HW1 {
    public static Integer k = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int shift = scanner.nextInt();
        System.out.println(rotateLeft(num, shift));
    }

    public static int minutesToSeconds(String ms) {
        String[] time  = ms.split(":");
        int m = Integer.parseInt(time[0]);
        int s = Integer.parseInt(time[1]);
        return s >= 60 ? -1 : m * 60 + s;
    }

    public static int countDigits(Integer num) {
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num != 0);
        return count;
    }

    public static boolean isNestable(int[] first, int[] second) {
        Integer min1 = Integer.MAX_VALUE;
        Integer max1 = Integer.MIN_VALUE;
        Integer min2 = Integer.MAX_VALUE;
        Integer max2 = Integer.MIN_VALUE;
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

    public static Boolean isPalindromeDescendant (Integer num) {
        String numString = num.toString();
        for (int i = 0 ; i < (numString.length() + 1) / 2; i++) {
            if (numString.charAt(i) != numString.charAt(numString.length() - i - 1)) {

            }
        }
        return true;
    }

    public static Integer countK(Integer num) {
        char[] numString = num.toString().toCharArray();
        Arrays.sort(numString);
        Integer min = Integer.parseInt(String.copyValueOf(numString));
        Integer max = Integer.parseInt(new StringBuilder(new String(numString)).reverse().toString());
        if (num != 6174) {
            k++;
            countK(max - min);
        }
        return k;
    }

    private static int rotateRight(int n, int shift) {
        String bin = Integer.toBinaryString(n);
        char[] rotating_num = new char[bin.length()];
        for (int i = 0; i < bin.length(); i++) {
            rotating_num[(i + shift) % bin.length()] = bin.charAt(i);
        }
        return Integer.parseInt(String.copyValueOf(rotating_num), 2);
    }

    private static int rotateLeft(int n, int shift) {
        String bin = Integer.toBinaryString(n);
        char[] rotating_num = new char[bin.length()];
        for (int i = 0; i < bin.length(); i++) {
            rotating_num[(i - shift + bin.length()) % bin.length()] = bin.charAt(i);
        }
        return Integer.parseInt(String.valueOf(rotating_num), 2);
    }

}