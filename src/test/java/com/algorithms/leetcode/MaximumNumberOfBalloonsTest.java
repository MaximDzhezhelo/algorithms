package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfBalloonsTest {

    @Test
    public void testExample1() {
        var solution = new MaximumNumberOfBalloons();
        String text = "nlaebolko";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(1, result);
    }

    @Test
    public void testExample2() {
        var solution = new MaximumNumberOfBalloons();
        String text = "loonbalxballpoon";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(2, result);
    }

    @Test
    public void testExample3() {
        var solution = new MaximumNumberOfBalloons();
        String text = "leetcode";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

    @Test
    public void testExactlyOneBalloon() {
        var solution = new MaximumNumberOfBalloons();
        String text = "balloon";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(1, result);
    }

    @Test
    public void testMissingCharacter() {
        var solution = new MaximumNumberOfBalloons();
        String text = "balloonballoon";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(2, result);
    }

    @Test
    public void testInsufficientL() {
        var solution = new MaximumNumberOfBalloons();
        String text = "bbaalloonn";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(1, result);
    }

    @Test
    public void testInsufficientO() {
        var solution = new MaximumNumberOfBalloons();
        String text = "bbaallllnn";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

    @Test
    public void testExtraCharacters() {
        var solution = new MaximumNumberOfBalloons();
        String text = "balloonxyzabc";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(1, result);
    }

    @Test
    public void testMultipleBalloons() {
        var solution = new MaximumNumberOfBalloons();
        String text = "balon";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

    @Test
    public void testNoRelevantCharacters() {
        var solution = new MaximumNumberOfBalloons();
        String text = "xyz";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

    @Test
    public void testManyBalloons() {
        var solution = new MaximumNumberOfBalloons();
        String text = "balloonballoonballoon";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(3, result);
    }

    @Test
    public void testSingleCharacter() {
        var solution = new MaximumNumberOfBalloons();
        String text = "b";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

    @Test
    public void testAlmostTwoBalloons() {
        var solution = new MaximumNumberOfBalloons();
        String text = "balloonballon";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(1, result);
    }

    @Test
    public void testMixedCharacters() {
        var solution = new MaximumNumberOfBalloons();
        String text = "loonbalxballpoonballoo";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(2, result);
    }

}
