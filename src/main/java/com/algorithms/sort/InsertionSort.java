package com.algorithms.sort;

import java.util.List;

public class InsertionSort {

    /**
     * Insertion sort is based on the idea that one element from the input elements is consumed in each iteration to find its correct position i.e, the position to which it belongs in a sorted array.
     * <p>
     * It iterates the input elements by growing the sorted array at each iteration. It compares the current element with the largest value in the sorted array. If the current element is greater, then it leaves the element in its place and moves on to the next element else it finds its correct position in the sorted array and moves it to that position. This is done by shifting all the elements, which are larger than the current element, in the sorted array to one position ahead
     * <a href="https://www.youtube.com/watch?v=EdIKIf9mHk0">visualization</a>
     * <p>
     * Best Case: O(n) - This occurs when the array is already sorted. The algorithm will make only n−1 comparisons and no swaps.  <p>
     * Average Case: O(n^2) -  This is because, on average, each element is compared with half of the previous elements in the sorted part of the array.  <p>
     * Worst Case: O(n^2) - This occurs when the array is sorted in reverse order. Every element needs to be compared with all previous elements, resulting in the maximum number of comparisons and shifts.
     */
    public static List<Integer> sort(final List<Integer> list) {
        if (list == null || list.isEmpty()) return list;

        for (int i = 0; i < list.size() - 1; i++) {
            var cur = list.get(i);
            var next = list.get(i + 1);
            if (cur > next) {
                list.set(i, next);
                list.set(i + 1, cur);
                for (int j = i; j > 0; j--) {
                    cur = list.get(j);
                    var prev = list.get(j - 1);
                    if (prev > cur) {
                        list.set(j - 1, cur);
                        list.set(j, prev);
                    } else {
                        break;
                    }
                }
            }
        }

        return list;
    }
}
