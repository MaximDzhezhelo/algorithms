package com.algorithms.coursera.quick;

public class QuickUnion {

    private int[] id;

    public QuickUnion(final int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    private int root(int i) { // chase parent pointers until reach root(depth of i array accesses)
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(final int p, final int q) {
        return root(p) == root(q);
    }

    public void union(final int p, final int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

}