package com.algorithms.coursera.algorithms_part1;

/*
  Coursera - Algorithms Part II
  Week 1 - Interview Questions
  Question 3: Successor with delete.
  Given a set of N integers S={0,1,...,N−1} and a sequence of requests of the
  following form:
  - Remove x from S
  - Find the successor of x: the smallest y in S such that y≥x.
  Design a data type so that all operations (except construction) should take
  logarithmic time or better.
*/

import java.util.Arrays;

public class SuccessorWithDelete {

    private final QuickFindUF uf;

    public SuccessorWithDelete(int N) {
        this.uf = new QuickFindUF(N);
    }

    public void remove(int x) {
        uf.union(x, x+1);
    }

    public int successor(int x) {
        return uf.find(x);
    }

    public static void main(String[] args) {
        final int N = 50;

        final SuccessorWithDelete swd = new SuccessorWithDelete(N);

        System.out.println(">>10 " + swd.successor( 10));

        swd.remove(11);
        swd.remove(13);
        swd.remove(12);
        swd.remove(10);
        swd.remove(9);
        swd.remove(15);

        System.out.println(">>8 " + swd.successor(8));
        System.out.println(">>9 " + swd.successor(9));
        System.out.println(">>10 " + swd.successor(10));
    }

}