package com.algorithms.hackerRank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaAnagrams {

    public static boolean isAnagram(final String a, final String b) {
        // Complete the function
        if (a == null) return false;
        if (b == null) return false;
        if (a.length() != b.length()) return false;

        final String lowerCaseA = a.toLowerCase();
        final String lowerCaseB = b.toLowerCase();

        final char[] chars = lowerCaseA.toCharArray();
        final Map<Character, Integer> mapA = new HashMap<>(chars.length);
        for (final char aChar : chars) {
            final boolean contains = lowerCaseB.indexOf(aChar) >= 0;
            if (!contains) return false;
            mapA.merge(aChar, 1, Integer::sum);
        }

        final Set<Map.Entry<Character, Integer>> entries = mapA.entrySet();

        for (final Map.Entry<Character, Integer> entry : entries) {
            final Character character = entry.getKey();
            final Integer count = entry.getValue();

            int index = 0;
            for (int i = 0; i < count; i++) {
                index = lowerCaseB.indexOf(character, index);
                if(index == -1) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

//        final Scanner scan = new Scanner(System.in);
//        final String a = scan.next();
//        final String b = scan.next();
//        scan.close();
//        final String a = "Hello";
//        final String b = "hello";

        final String a = "anagramm";
        final String b = "marganaa";

        final boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
