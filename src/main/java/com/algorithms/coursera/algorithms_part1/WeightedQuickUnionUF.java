package com.algorithms.coursera.algorithms_part1;

import java.util.Scanner;

/**
 * Coursera - Algorithms Part II
 * <p>
 * Week 1 - Interview Questions
 * Union-find with specific canonical element. Add a method find() to the
 * union-find data type so that find(i) returns the largest element in the
 * connected component containing i. The operations, union(), connected(), and
 * find() should all take logarithmic time or better.
 * <p>
 * For example, if one of the connected components is {1,2,6,9}, then the find()
 * method should return 9 for each of the four elements in the connected
 * components because 9 is larger 1, 2, and 6.
 */

public class WeightedQuickUnionUF {

    private int[] parent;   // parent[i] = parent of i
    private int[] size;     // size[i] = number of objects in subtree rooted at i
    private int[] max;		// max[i] = largest element in subtree rooted at i
    private int count;      // number of components

    /**
     * Initializes an empty union-find data structure with N isolated components 0 through N-1.
     * @param N the number of objects
     * @throws java.lang.IllegalArgumentException if N < 0
     */
    public WeightedQuickUnionUF(int N) {
        count = N;
        parent = new int[N];
        size = new int[N];
        max = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            size[i] = 1;
            max[i] = i;
        }
    }

    /**
     * Returns the number of components.
     * @return the number of components (between 1 and N)
     */
    public int count() {
        return count;
    }

    /**
     * Returns the component identifier for the component containing site <tt>p</tt>.
     * @param p the integer representing one site
     * @return the component identifier for the component containing site <tt>p</tt>
     * @throws java.lang.IndexOutOfBoundsException unless 0 <= p < N
     */
    public int find(int p) {
        validate(p);
        while (p != parent[p])
            p = parent[p];
        return p;
    }

    public int findMax(int p) {
        int rootP = find(p);
        return max[rootP];
    }

    // validate that p is a valid index
    private void validate(int p) {
        int N = parent.length;
        if (p < 0 || p >= N) { throw new IndexOutOfBoundsException("index " + p + " is not between 0 and " + N); }
    }

    /**
     * Are the two sites <tt>p</tt> and <tt>q</tt> in the same component?
     * @param p the integer representing one site
     * @param q the integer representing the other site
     * @return <tt>true</tt> if the two sites <tt>p</tt> and <tt>q</tt>
     *    are in the same component, and <tt>false</tt> otherwise
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= p < N and 0 <= q < N
     */
    public boolean connected(int p, int q) {
        final int ciP = find(p);
        final int ciQ = find(q);
        return ciP == ciQ;
    }


    /**
     * Merges the component containing site<tt>p</tt> with the component
     * containing site <tt>q</tt>.
     * @param p the integer representing one site
     * @param q the integer representing the other site
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= p < N and 0 <= q < N
     */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make smaller root point to larger one
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
            max[rootQ] = Math.max(max[rootP], max[rootQ]);
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
            max[rootP] = Math.max(max[rootP], max[rootQ]);
        }
        count--;
    }

    public static void main(String[] args) {
        final int N = 100;
        final WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);

        for(int i = 0; i < 10; i ++) {
            int p = i + 5;
            int q = i + 7;
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);
        }

        System.out.println(uf.count() + " components");

        for(int i = 0; i < N; ++i) {
            System.out.println("Max: " + i + " = " + uf.findMax(i));
        }

    }

}