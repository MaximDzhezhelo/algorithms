package com.algorithms.hackerRank.java;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args) {
        Pattern r = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {
            String line = in.nextLine();
            Matcher m = r.matcher(line);

            boolean invalid = true;
            while (m.find()) {
                System.out.println(m.group(2));
                invalid = false;
            }
            if (invalid)
                System.out.println("None");
        }
    }

}
