package com.leetcode.algo.string.smallest_str_with_given_numeric_val;

import java.util.Arrays;

public class SmallestStringWithGivenNumericValue {
    private static final int R = 26;

    public String getSmallestString(int n, int k) {
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');
        k -= n;

        while (k > 0) {
            if (k > 25) {
                chars[n - 1] = 'z';
                k -= 25;
            } else {
                chars[n - 1] += k;
                break;
            }
            --n;
        }

        return String.valueOf(chars);
    }
}
