package com.algorithms.sort;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortTest extends TestCase {

    @Test
    public void testBubbleSort() {
        var list = new ArrayList<>(List.of(3, 1, 5, 3, 65, 23, 54, 1, 7856, 23, 56));

        var unsortedList = new ArrayList<>(list);
        Collections.sort(list);
        assertEquals(list, MergeSort.sort(unsortedList));
    }

}