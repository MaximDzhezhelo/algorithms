package com.algorithms.coursera.quick;

public class QuickFind {
    private int[] id;

    public QuickFind(final int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)  // N array accesses
            id[i] = i;
    }

    public boolean connected(final int p, final int q) { //check whether p and q are in the same component (2 array accesses)
        return id[p] == id[q];
    }

    public void union(int p, int q) {  //change all entries with id[p] to id[q] (at most 2N + 2 array accesses)
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }

    // It takes N 2 array accesses to process a sequence of N union commands on N objects.
}