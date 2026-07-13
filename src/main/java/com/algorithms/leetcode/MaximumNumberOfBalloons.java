package com.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

    /**
     * Given a string text, you want to use the characters of text to form as many instances
     * of the word "balloon" as possible.
     *
     * You can use each character in text at most once. Return the maximum number of instances
     * that can be formed.
     *
     * Example 1:
     *
     * Input: text = "nlaebolko"
     *
     * Output: 1
     *
     * Example 2:
     *
     * Input: text = "loonbalxballpoon"
     *
     * Output: 2
     *
     * Example 3:
     *
     * Input: text = "leetcode"
     *
     * Output: 0
     *
     * Constraints:
     *
     * 1 <= text.length <= 10^4
     * text consists of lower case English letters only.
     */
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : text.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }

        return Math.min(
                Math.min(
                        counts.getOrDefault('b', 0),
                        counts.getOrDefault('a', 0)
                ),
                Math.min(
                        counts.getOrDefault('l', 0) / 2,
                        Math.min(
                                counts.getOrDefault('o', 0) / 2,
                                counts.getOrDefault('n', 0)
                        )
                )
        );
    }

}
