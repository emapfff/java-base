package org.example.HW1;

public class Task7 {

    public static int rotateRight(int n, int shift) {
        String bin = Integer.toBinaryString(n);
        char[] rotating_num = new char[bin.length()];
        for (int i = 0; i < bin.length(); i++) {
            rotating_num[(i + shift) % bin.length()] = bin.charAt(i);
        }
        return Integer.parseInt(String.copyValueOf(rotating_num), 2);
    }

    public static int rotateLeft(int n, int shift) {
        String bin = Integer.toBinaryString(n);
        char[] rotating_num = new char[bin.length()];
        for (int i = 0; i < bin.length(); i++) {
            rotating_num[(i - shift + bin.length()) % bin.length()] = bin.charAt(i);
        }
        return Integer.parseInt(String.valueOf(rotating_num), 2);
    }
}
