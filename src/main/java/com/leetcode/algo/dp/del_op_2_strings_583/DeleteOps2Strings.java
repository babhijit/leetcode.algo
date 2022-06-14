package com.leetcode.algo.dp.del_op_2_strings_583;

public class DeleteOps2Strings {
    private int[][] memo = null;

    public int minDistance(String word1, String word2) {
        memo = new int[word1.length() + 1][word2.length() + 1];
        return word1.length() + word2.length() - 2 * longestCommonSubstring(word1, word1.length(), word2, word2.length());
    }

    private int longestCommonSubstring(String word1, int word1Index, String word2, int word2Index) {
        if (word1Index == 0 || word2Index == 0) {
            return 0;
        }

        if (memo[word1Index][word2Index] == 0) {
            char word1Char = word1.charAt(word1Index - 1);
            char word2Char = word2.charAt(word2Index - 1);
            if (word1Char == word2Char) {
                memo[word1Index][word2Index] = 1 + longestCommonSubstring(word1, word1Index - 1, word2, word2Index - 1);
            } else {
                memo[word1Index][word2Index] = Math.max(longestCommonSubstring(word1, word1Index - 1, word2, word2Index),
                        longestCommonSubstring(word1, word1Index, word2, word2Index - 1));
            }
        }

        return memo[word1Index][word2Index];
    }
}
