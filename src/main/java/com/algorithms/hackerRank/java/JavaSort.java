package com.algorithms.hackerRank.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        final List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            final int id = in.nextInt();
            final String fname = in.next();
            final double cgpa = in.nextDouble();

            final Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(
                Comparator
                        .comparing(Student::getCgpa)
                        .reversed().
                        thenComparing(Student::getFname)
                        .thenComparing(Student::getId)
        );

        for (final Student st : studentList) {
            System.out.println(st.getFname());
        }

    }
}

