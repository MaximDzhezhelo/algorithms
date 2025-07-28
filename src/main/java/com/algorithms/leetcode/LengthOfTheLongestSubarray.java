package com.algorithms.leetcode;

public class LengthOfTheLongestSubarray {

    /**
     * Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less than or equal to k.
     */
    public int bySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (k == 0) {
            return 0;
        }

        int leftB = 0;
        int curr = 0; // curr is the current sum of the window
        int answer = 0;

        for (int rightB = 0; rightB < nums.length; rightB++) {
            curr += nums[rightB];
            while (curr > k) {
                curr -= nums[leftB];
                leftB++;
            }
            answer = Math.max(answer, rightB - leftB + 1);
        }

        return answer;
    }

    /**
     * You are given a binary string s (a string containing only "0" and "1"). You may choose up to one "0" and flip it to a "1". What is the length of the longest substring achievable that contains only "1"?
     */
    public int byContainedSymbol(String arr, int k) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }

        if (k == 0) {
            return 0;
        }

        int left = 0;
        int curr = 0;
        int answer = 0;

        for (int right = 0; right < arr.length(); right++) {
            if (arr.charAt(right) == '0') {
                curr++;
            }

            while (curr > k) {
                if (arr.charAt(left) == '0') {
                    curr--;
                }
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }

}
