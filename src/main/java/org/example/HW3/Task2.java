package org.example.HW3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class Task2 {
    public static String clusterize(String s) {
        List<String> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }
            if (stack.empty()) {
                list.add(s.substring(j, i + 1));
                j = i + 1;
            }
        }
        return String.join(" ", list);
    }
}
