package com.algorithms.hackerRank.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class ResultA {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (Integer value : arr) {
            if (value > 0) {
                positiveCount += 1;
            } else if (value < 0) {
                negativeCount += 1;
            } else {
                zeroCount += 1;
            }
        }

        final int size = arr.size();
        System.out.println((double) positiveCount / (double) size);
        System.out.println((double) negativeCount / (double) size);
        System.out.println((double) zeroCount / (double) size);
    }

}

public class PlusMinus {

    public static void main(String[] args) throws IOException {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        ResultA.plusMinus(arr);
    }

}
