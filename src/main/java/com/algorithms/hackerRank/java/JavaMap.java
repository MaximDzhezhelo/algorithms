package com.algorithms.hackerRank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] argh) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        in.nextLine();

        final Map<String, Integer> contactBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final String name = in.nextLine();
            final int phone = in.nextInt();

            contactBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            final String name = in.nextLine();
            final Integer phone = contactBook.get(name);
            if (phone == null) System.out.println("Not found");
            else System.out.println(name + "=" + phone);
        }
    }

}
