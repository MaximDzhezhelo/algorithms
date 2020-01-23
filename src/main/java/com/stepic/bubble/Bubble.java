package com.stepic.bubble;

import java.util.Arrays;
import java.util.List;

public class Bubble {

    public static void main(String[] args) {
        final List<Integer> sortList = sort(Arrays.asList(11, 1, 3, 2, 6, 4, 7, 2, 4, 7, 5, 9, 1));
        System.out.println(sortList);
    }

    private static List<Integer> sort(final List<Integer> list) {
        if (list == null || list.isEmpty()) return list;

        boolean flag = true;

        while (flag) {
            flag = false;
            for (int x = 1; x < list.size(); x++) {
                if (list.get(x-1) > list.get(x)) {
                    int temp = list.get(x);
                    list.set(x, list.get(x-1));
                    list.set(x-1, temp);
                    flag = true;
                }
            }
        }
        return list;
    }

}
