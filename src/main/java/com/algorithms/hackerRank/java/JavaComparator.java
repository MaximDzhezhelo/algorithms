package com.algorithms.hackerRank.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(final Player o1, final Player o2) {
        if (o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }
        if (o1.score < o2.score) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class JavaComparator {

    public static void main(String[] args) {
        Player[] player = new Player[6];
        Checker checker = new Checker();

        player[0] = new Player("5", 5);
        player[1] = new Player("amy", 100);
        player[2] = new Player("david", 100);
        player[3] = new Player("heraldo", 50);
        player[4] = new Player("aakansha", 75);
        player[5] = new Player("aleksa", 150);

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
