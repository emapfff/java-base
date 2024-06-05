package org.example.HW3;

public class Task1 {
    public static String atBash(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                stringBuilder.setCharAt(i, (char) (90 - s.charAt(i) + 65));
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                stringBuilder.setCharAt(i, (char) (122 - s.charAt(i) + 97));
            }
        }
        return stringBuilder.toString();
    }
}
