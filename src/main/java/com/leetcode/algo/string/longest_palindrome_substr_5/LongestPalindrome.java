package com.leetcode.algo.string.longest_palindrome_substr_5;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); ++i) {
            int leftLength = expandAroundCentre(s, i, i);
            int rightLength = expandAroundCentre(s, i, i + 1);
            int length = Math.max(leftLength, rightLength);
            if (length > (end - start)) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCentre(String s, int leftCentre, int rightCentre) {
        int left = leftCentre, right = rightCentre;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            } else {
                left--;
                right++;
            }
        }
        return right - left - 1;
    }
}
