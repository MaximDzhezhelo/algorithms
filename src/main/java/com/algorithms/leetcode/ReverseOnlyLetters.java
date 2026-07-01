package com.algorithms.leetcode;

public class ReverseOnlyLetters {

    /**
     * Given a string s, reverse the string according to the following rules:
     * - All the characters that are not English letters remain in the same position.
     * - All the English letters (lowercase or uppercase) should be reversed.
     *
     * Example 1:
     * Input: s = "ab-cd"
     * Output: "dc-ba"
     *
     * Example 2:
     * Input: s = "a-bC-dEf-ghIj"
     * Output: "j-Ih-gfE-dCba"
     *
     * Example 3:
     * Input: s = "Test1ng-Leet=code-Q!"
     * Output: "Qedo1ct-eeLg=ntse-T!"
     *
     * @param s the input string
     * @return the string with only letters reversed
     */
    public String reverseOnlyLetters(String s) {

        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            boolean asciiRight = isAscii(charArray[right]);
            boolean asciiLeft = isAscii(charArray[left]);
            if (asciiRight && asciiLeft) {
                left++;
                right--;
            } else if (asciiLeft) {
                left++;
            } else if (asciiRight) {
                right--;
            } else {
                char rightValue = charArray[right];
                char leftValue = charArray[left];

                charArray[right] = leftValue;
                charArray[left] = rightValue;

                left++;
                right--;
            }
        }


        return new String(charArray);
    }

    public boolean isAscii(char c) {
        return (c < 'A' || c > 'Z') && (c < 'a' || c > 'z');
    }

}
