package org.example.HW3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3  {
    public static String freeqDict(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.merge(s, 1, Integer::sum);
        }
        return map.toString();
    }
}
