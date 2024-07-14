package com.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /**
     * Merge sort is a divide-and-conquer algorithm based on the idea of breaking down a list into several sub-lists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.
     * <a href="https://www.youtube.com/watch?v=dENca26N6V4">visualization</a>
     * <p>
     * <p>Idea:</p>
     * <ol>
     *   <li>Divide the unsorted list into sublists, each containing one element.</li>
     *   <li>Take adjacent pairs of singleton lists and merge them to form a list of two elements.</li>
     *   <li>This process converts the sublists into lists of size 2, 4, 8, and so on.</li>
     *   <li>Repeat the process until a single sorted list is obtained.</li>
     * </ol>
     *
     * <p>While comparing two sublists for merging, the first element of both lists is taken into consideration.
     * When sorting in ascending order, the element that is of lesser value becomes a new element of the sorted list.
     * This procedure is repeated until both the smaller sublists are empty and the new combined sublist
     * comprises all the elements of both sublists.</p>
     * <p>
     * Best Case: O(n log n) - The algorithm always divides the list into two halves and then merges them back together, leading to consistent O(n log n) performance. <p>
     * Average Case: O(n log n) - On average, the time complexity remains O(n log n) due to the consistent nature of the divide-and-conquer approach.
     * Worst Case: O(n log n) - Even in the worst case, Merge Sort performs O(n log n) operations because it always divides the list into two halves and merges them back together.
     */
    public static List<Integer> sort(final List<Integer> list) {
        if (list == null || list.size() <= 1) return list;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int middle = list.size() / 2;

        for (int i = 0; i < middle; i++) {
            left.add(list.get(i));
        }
        for (int i = middle; i < list.size(); i++) {
            right.add(list.get(i));
        }

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int leftPointer = 0;
        int rightPointer = 0;

        while (leftPointer < left.size() && rightPointer < right.size()) {
            if (left.get(leftPointer) < right.get(rightPointer)) {
                result.add(left.get(leftPointer));
                leftPointer++;
            } else {
                result.add(right.get(rightPointer));
                rightPointer++;
            }
        }

        while (leftPointer < left.size()) {
            result.add(left.get(leftPointer));
            leftPointer++;
        }

        while (rightPointer < right.size()) {
            result.add(right.get(rightPointer));
            rightPointer++;
        }

        return result;
    }
}
