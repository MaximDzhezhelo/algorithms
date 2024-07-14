package com.algorithms.sort;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        final List<Integer> sortList = sort(Arrays.asList(11, 1, 3, 2, 6, 4, 7, 2, 4, 7, 5, 9, 1));
        System.out.println(sortList);
    }

    /**
     * Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their positions if they exist in the wrong order.
     * <a href="https://opendsa-server.cs.vt.edu/embed/bubblesortAV">visualization</a>
     * <p>
     * Best Case: 𝑂(𝑛) - This occurs when the array is already sorted, and the algorithm can detect that no swaps are needed.  <p>
     * Average Case: O(n^2) - This is because each element is compared with every other element.  <p>
     * Worst Case: O(n^2) - This occurs when the array is sorted in reverse order, necessitating the maximum number of swaps.
     */
    public static List<Integer> sort(final List<Integer> list) {
        if (list == null || list.isEmpty()) return list;

        boolean flag = true;

        while (flag) {
            flag = false;
            for (int x = 1; x < list.size(); x++) {
                if (list.get(x - 1) > list.get(x)) {
                    int temp = list.get(x);
                    list.set(x, list.get(x - 1));
                    list.set(x - 1, temp);
                    flag = true;
                }
            }
        }
        return list;
    }

}
