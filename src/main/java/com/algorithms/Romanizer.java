package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Romanizer {

    public static List<String> romanizer(List<Integer> numbers) {
        int[] values =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        List<String> result = new ArrayList<>();

        for (int num : numbers) {
            StringBuilder roman = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    num -= values[i];
                    roman.append(symbols[i]);
                }
            }
            result.add(roman.toString());
        }

        return result;
    }

}
