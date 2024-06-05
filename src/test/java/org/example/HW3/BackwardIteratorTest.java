package org.example.HW3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BackwardIteratorTest {
    @Test
    void backwardIteratorTest() {
        Iterator<Integer> iter = new BackwardIterator<>(List.of(1, 2, 3));

        List<Integer> ans = new ArrayList<>();
        while (iter.hasNext()) {
            ans.add(iter.next());
        }
        assertEquals(List.of(3, 2, 1), ans);
    }

}