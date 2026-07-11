package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPlayersWithZeroOrOneLossesTest {

    @Test
    public void testBasicExample1() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 2, 10), result.get(0));
        assertEquals(List.of(4, 5, 7, 8), result.get(1));
    }

    @Test
    public void testBasicExample2() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{2,3},{1,3},{5,4},{6,4}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 2, 5, 6), result.get(0));
        assertEquals(List.of(), result.get(1));
    }

    @Test
    public void testSingleMatch() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2), result.get(1));
    }

    @Test
    public void testAllWinnersNeverLose() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{3,4},{5,6}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 3, 5), result.get(0));
        assertEquals(List.of(2, 4, 6), result.get(1));
    }

    @Test
    public void testPlayerLosesTwice() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{3,2}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 3), result.get(0));
        assertEquals(List.of(), result.get(1));
    }

    @Test
    public void testSamePlayerWinsMultiple() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{1,3},{1,4}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2, 3, 4), result.get(1));
    }

    @Test
    public void testMixedLosses() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,5},{2,5},{3,5},{4,5},{6,7}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 2, 3, 4, 6), result.get(0));
        assertEquals(List.of(7), result.get(1));
    }

    @Test
    public void testTwoMatches() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{3,4}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 3), result.get(0));
        assertEquals(List.of(2, 4), result.get(1));
    }

    @Test
    public void testChainOfMatches() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{2,3},{3,4},{4,5}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2, 3, 4, 5), result.get(1));
    }

    @Test
    public void testLargePlayerNumbers() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{100,200},{300,400}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(100, 300), result.get(0));
        assertEquals(List.of(200, 400), result.get(1));
    }

    @Test
    public void testMultipleLossesForSomePlayer() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,3},{2,3},{4,3},{5,6}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 2, 4, 5), result.get(0));
        assertEquals(List.of(6), result.get(1));
    }

    @Test
    public void testOnlyOneLossPlayers() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{3,2},{4,5},{6,5}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 3, 4, 6), result.get(0));
        assertEquals(List.of(), result.get(1));
    }

    @Test
    public void testUnsortedPlayerNumbers() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{10,5},{3,7},{8,2}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(3, 8, 10), result.get(0));
        assertEquals(List.of(2, 5, 7), result.get(1));
    }

    @Test
    public void testWinnerAlsoLosesOnce() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{3,1},{4,5}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(3, 4), result.get(0));
        assertEquals(List.of(1, 2, 5), result.get(1));
    }

    @Test
    public void testLongChain() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2, 3, 4, 5, 6, 7), result.get(1));
    }

    @Test
    public void testMultipleWinnersOneLoss() {
        var solution = new FindPlayersWithZeroOrOneLosses();
        int[][] matches = {{1,3},{2,3},{1,4},{2,5}};
        List<List<Integer>> result = solution.findWinners(matches);
        assertEquals(List.of(1, 2), result.get(0));
        assertEquals(List.of(4, 5), result.get(1));
    }
}
