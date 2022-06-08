package com.leetcode.algo.string.remove_palindromic_subsequence_1332;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class RemovePalindromicSubsequenceTest extends AbstractExecuteTests<TestCase> {
    public RemovePalindromicSubsequenceTest() {
        super("RemovePalindromicSubsequenceTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new RemovePalindromicSubsequence();
        assertEquals(testCase.output, solution.removePalindromeSub(testCase.s));
    }
}