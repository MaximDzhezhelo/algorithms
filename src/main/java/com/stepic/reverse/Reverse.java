package com.stepic.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

    public static void main(String[] args) {
        final int[] array = {1, 3, 5, 2, 4};

        final List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Collections.sort(list);

        for(int i = 0; i < array.length; i ++){

        }


    }

}