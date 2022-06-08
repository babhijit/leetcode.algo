package com.leetcode.algo.string.remove_palindromic_subsequence_1332;

public class RemovePalindromicSubsequence {
    public int removePalindromeSub(String s) {
        final int N = s.length();
        return removePalindromeSub(s, 0, N - 1);
    }

    private int removePalindromeSub(String s, int start, int end) {
        int low = start;
        int high = end;
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--))
                return 2;
        }

        return 1;
    }
}
