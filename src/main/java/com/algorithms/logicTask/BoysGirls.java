package com.algorithms.logicTask;

import java.util.Scanner;

public class BoysGirls {

    public static void main(String[] args) throws InterruptedException {
        final Scanner sc = new Scanner(System.in);
        final int X = sc.nextInt();
        final int Y = sc.nextInt();

        final BoysGirls boysGirls = new BoysGirls();
        boysGirls.solution(X, Y);
    }

    public void solution(int X, int Y) {
        System.out.println(count(X, Y));
    }

    public int count(int X, int Y) {
        if (X == 0 && Y == 0) return 0;
        if (X < 0 && Y < 0) return 0;
        if (X < 0 && Y > 0) return Y;
        if (X > 0 && Y < 0) return X;

        return Math.max(X, Y) - Math.min(X, Y) - 1;
    }

}