package com.leetcode.algo.string.longest_palindrome_substr_5;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest extends AbstractExecuteTests<TestCase> {
    public LongestPalindromeTest() {
        super("LongestPalindromeTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new LongestPalindrome();
        String actual = solution.longestPalindrome(testCase.s);
        assertTrue(testCase.hasMatch(actual));
    }
}