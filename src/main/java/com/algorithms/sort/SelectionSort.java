package com.algorithms.sort;

import java.util.List;

public class SelectionSort {

    /**
     * The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted array and then putting it in its correct position in a sorted array.
     * <a href="https://www.youtube.com/watch?v=0-W8OEwLebQ">visualization</a>
     * <p>
     * Best Case: O(n^2) - This occurs because even if the array is already sorted, the algorithm still goes through the entire array to find the minimum element in each pass.
     * Average Case: O(n^2) - This is because each element is compared with every other element, regardless of the initial order of the array.
     * Worst Case: O(n^2) - This occurs when the array is sorted in reverse order, which also requires the maximum number of comparisons.
     */
    public static List<Integer> sort(final List<Integer> list) {
        if (list == null || list.isEmpty()) return list;

        for (int i = 0; i < list.size(); i++) {
            var min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                var temp = list.get(j);
                if (temp < min) {
                    min = temp;
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }

        return list;
    }
}
