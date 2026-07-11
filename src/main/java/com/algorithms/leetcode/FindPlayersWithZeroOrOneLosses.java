package com.algorithms.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindPlayersWithZeroOrOneLosses {

    /**
     * You are given an integer array matches where matches[i] = [winneri, loseri]
     * indicates that the player winneri defeated player loseri in a match.
     *
     * Return a list answer of size 2 where:
     * - answer[0] is a list of all players that have not lost any matches.
     * - answer[1] is a list of all players that have lost exactly one match.
     *
     * The values in the two lists should be returned in increasing order.
     *
     * Note:
     * - You should only consider the players that have played at least one match.
     * - The testcases will be generated such that no two matches will have the same outcome.
     *
     * Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
     * Output: [[1,2,10],[4,5,7,8]]
     * Explanation:
     * Players 1, 2, and 10 have not lost any matches.
     * Players 4, 5, 7, and 8 each have lost one match.
     * Players 3, 6, and 9 each have lost two matches.
     * Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
     *
     * Input: matches = [[2,3],[1,3],[5,4],[6,4]]
     * Output: [[1,2,5,6],[]]
     * Explanation:
     * Players 1, 2, 5, and 6 have not lost any matches.
     * Players 3 and 4 each have lost two matches.
     * Thus, answer[0] = [1,2,5,6] and answer[1] = [].
     *
     * Constraints:
     * - 1 <= matches.length <= 10^5
     * - matches[i].length == 2
     * - 1 <= winneri, loseri <= 10^5
     * - winneri != loseri
     * - All matches[i] are unique
     *
     * Time Complexity: O(n log n) where n = number of unique players (due to sorting)
     * Space Complexity: O(n)
     *
     * @param matches the array of match results [winner, loser]
     * @return a list of two lists: [zero losses, one loss]
     */
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        Map<Integer, Integer> losers = new HashMap<>();

        for (var match : matches) {
            winners.add(match[0]);
            losers.merge(match[1], 1, Integer::sum);
        }

        winners.removeAll(losers.keySet());
        List<List<Integer>> result = new ArrayList<>();
        result.add(winners.stream().sorted().toList());

        List<Integer> losersWithOneLose = losers.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();

        result.add(losersWithOneLose);
        return result;
    }
}
