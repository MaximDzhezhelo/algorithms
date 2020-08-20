package com.algorithms.hackerRank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
 *
 * US: formattedPayment
 * India: formattedPayment
 * China: formattedPayment
 * France: formattedPayment
 * where  is  formatted according to the appropriate Locale's currency.
 *
 * Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
 *
 * Input Format
 *
 * A single double-precision number denoting .
 *
 * Constraints
 *
 * Output Format
 *
 * On the first line, print US: u where  is  formatted for US currency.
 * On the second line, print India: i where  is  formatted for Indian currency.
 * On the third line, print China: c where  is  formatted for Chinese currency.
 * On the fourth line, print France: f, where  is  formatted for French currency.
 */
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double payment = scanner.nextDouble();
        scanner.close();

        /* Create NumberFormats using Locales */
        final NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        final NumberFormat india  = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        final NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        final NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }

}
