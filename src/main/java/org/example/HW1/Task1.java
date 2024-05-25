package org.example.HW1;

public class Task1 {

    public static int minutesToSeconds(String ms) {
        String[] time  = ms.split(":");
        int m = Integer.parseInt(time[0]);
        int s = Integer.parseInt(time[1]);
        return s >= 60 ? -1 : m * 60 + s;
    }
}
