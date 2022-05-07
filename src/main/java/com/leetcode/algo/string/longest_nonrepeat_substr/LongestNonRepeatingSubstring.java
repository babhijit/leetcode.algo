package com.leetcode.algo.string.longest_nonrepeat_substr;

public class LongestNonRepeatingSubstring {

    public int lengthOfLongestSubstring(String s) {
        final int N = s.length();
        int longestSubstringLength = 0;
        int start = 0;
        int index;
        for (int i = 1; i < N; ++i) {
            index = s.substring(start, i).indexOf(s.charAt(i));
            if (index != -1) {
                longestSubstringLength = getLongestSubstringLength(s, start, i, longestSubstringLength);
                start += (index + 1);
            }
        }

        return getLongestSubstringLength(s, start, N, longestSubstringLength);
    }

    private int getLongestSubstringLength(String s, int start, int end, final int previousLongestSubstringLength) {
        int length = s.substring(start, end).length();
        if (previousLongestSubstringLength < length) {
            return length;
        }
        return previousLongestSubstringLength;
    }
}
