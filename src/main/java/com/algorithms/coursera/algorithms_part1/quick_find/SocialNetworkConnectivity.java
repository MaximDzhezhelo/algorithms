package com.algorithms.coursera.algorithms_part1.quick_find;


/**
 * Coursera - Algorithms Part I
 * Week 1 - Interview Questions - Union Find
 *
 * Question 1: Social network connectivity
 *
 * Given a social network containing n members and a log file containing m
 * timestamps at which times pairs of members formed friendships, design an
 * algorithm to determine the earliest time at which all members are connected
 * (i.e., every member is a friend of a friend of a friend ... of a friend).
 * Assume that the log file is sorted by timestamp and that friendship is an
 * equivalence relation. The running time of your algorithm should be mlogn or
 * better and use extra space proportional to N.
 */
public class SocialNetworkConnectivity {

    private final QuickFindUF uf;
    private int count;

    public SocialNetworkConnectivity(int n) {
        this.count = n;
        this.uf = new QuickFindUF(count);
    }

    public void addFriendship(int p1, int p2) {
        final int ceP1 = uf.find(p1);
        final int ceP2 = uf.find(p2);
        if (ceP1 != ceP2) {
            --count;
        }

        uf.union(p1,p2);
    }

    public boolean fullyConnected() {
        return this.count == 1;
    }

}