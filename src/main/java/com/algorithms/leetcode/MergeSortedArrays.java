package com.algorithms.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArrays {

    /**
     * Given two sorted integer arrays arr1 and arr2, return a new array that combines both of them and is also sorted.
     */
    public int[] mergeSortedArrays(int[] a, int[] b) {
        int lA = a.length;
        int lB = b.length;

        int length = lA + lB;
        var array = new int[length];

        int i = 0, j = 0, k = 0;

        while (i < lA && j < lB) {
            int vA = a[i];
            int vB = b[j];

            if (vA > vB) {
                array[k++] = vB;
                j++;
            } else {
                array[k++] = vA;
                i++;
            }
        }

        while (i < lA) {
            array[k++] = a[i++];
        }

        while (j < lB) {
            array[k++] = b[j++];
        }

        return array;
    }

    public int[] mergeSortedArraysWithSystemTool(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        System.arraycopy(a, 0, array, 0, a.length);
        System.arraycopy(b, 0, array, a.length, b.length);
        Arrays.sort(array);
        return array;
    }

    public int[] mergeSortedArrayWithIntStream(int[] a, int[] b) {
        return IntStream.concat(IntStream.of(a), IntStream.of(b))
                .sorted()
                .toArray();
    }

}
