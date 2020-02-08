package com.algorithms.reverse;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int[] reversed = reverseSimple(array);
        System.out.println(Arrays.toString(reversed));

        final int[] arrayOdd = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] reversedOdd = reverseOdd(arrayOdd);
        System.out.println(Arrays.toString(reversedOdd));
        final int[] reversedEven = reverseEven(array);
        System.out.println(Arrays.toString(reversedEven));
    }

    private static int[] reverseSimple(final int[] array) {
        if (array == null) throw new RuntimeException();

        final int length = array.length;
        final int[] newArray = new int[length];
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];
        }

        return newArray;
    }

    private static int[] reverseOdd(final int[] array) {
        if (array == null) throw new RuntimeException();

        final int length = array.length;
        if(length % 2 == 0) throw new RuntimeException();

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            final int tailValue = array[i];
            final int firstValue = array[j];

            if (tailValue == firstValue) break;

            array[j] = tailValue;
            array[i] = firstValue;
        }

        return array;
    }

    private static int[] reverseEven(final int[] array) {
        if (array == null) throw new RuntimeException();

        final int length = array.length;
        if(length % 2 != 0) throw new RuntimeException();

        for (int i = length - 1, j = 0; i >= (length - 1)/2; i--, j++) {
            final int tailValue = array[i];
            final int firstValue = array[j];

            if (tailValue == firstValue) break;

            array[j] = tailValue;
            array[i] = firstValue;
        }

        return array;
    }

}