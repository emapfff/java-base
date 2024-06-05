package org.example.HW3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;

public class Task6Test {
    @Test
    void treeTest() {
        TreeMap<String, String> tree = new TreeMap<>(new TreeComparator());
        tree.put(null, "test");
        List<Integer> inits = Arrays.asList(1, 2, 3);
        List<? extends Number> nums = inits;


        assertThat(tree.containsKey(null)).isTrue();
    }
}
