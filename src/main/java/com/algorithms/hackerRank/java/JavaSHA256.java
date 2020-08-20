package com.algorithms.hackerRank.java;

import java.security.MessageDigest;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final String message = in.nextLine();
        in.close();

        try {
            final MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) System.out.printf("%02x", b);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
