package com.leetcode.algo.string.valid_palindrome_2;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while ((low < high)) {
            if (s.charAt(low) != s.charAt(high)) {
                return isPalindrome(s, low, high - 1) || isPalindrome(s, low + 1, high);
            }

            ++low;
            --high;
        }

        return true;
    }

    private boolean isPalindrome(final String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
