package com.leetcode.algo.string.longest_nonrepeat_substr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestNonRepeatingSubstringTest {
    private final LongestNonRepeatingSubstring nonRepeatingSubstring = new LongestNonRepeatingSubstring();

    @Test
    void test_pwwkew() {
        assertEquals(3, nonRepeatingSubstring.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void test_dvdf() {
        assertEquals(3, nonRepeatingSubstring.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void test_spaceString() {
        assertEquals(1, nonRepeatingSubstring.lengthOfLongestSubstring(" "));
    }

    @Test
    void test_emptySring() {
        assertEquals(0, nonRepeatingSubstring.lengthOfLongestSubstring(""));
    }
}