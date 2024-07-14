package com.algorithms.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 34, 15, 0, 534, 22, 43, 124};
        System.out.println(binarySearch(1212, myIntArray));
        System.out.println(binarySearch(22, myIntArray));
    }

    private static int binarySearch(final int value, final int[] arr) {
        Arrays.sort(arr);
        System.out.println("After sort: " + Arrays.toString(arr));

        int start = 0;
        int finish = arr.length - 1;

        while (start <= finish) {
            int mid = start + (finish - start) / 2;

            if (value < arr[mid]) finish = mid - 1;
            else if (value > arr[mid]) start = mid + 1;
            else return mid;
        }

        return -1;
    }

}