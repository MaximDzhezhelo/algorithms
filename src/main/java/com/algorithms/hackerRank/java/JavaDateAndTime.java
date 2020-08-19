package com.algorithms.hackerRank.java;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 *
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 *
 * For example, if you are given the date , the method should return  as the day on that date.
 *
 * Input Format
 *
 * A single line of input containing the space separated month, day and year, respectively, in    format.
 *
 * Constraints
 *
 * Output Format
 *
 * Output the correct day in capital letters.
 *
 * Sample Input
 *
 * 08 05 2015
 *
 */
public class JavaDateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        final LocalDate date = LocalDate.of(year, month, day);

        final DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.name();
    }

    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        final int month = Integer.parseInt(firstMultipleInput[0]);

        final int day = Integer.parseInt(firstMultipleInput[1]);

        final int year = Integer.parseInt(firstMultipleInput[2]);

        final String res = JavaDateAndTime.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}