package com.leetcode.algo.string.valid_palindrome_2;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindrome2Test extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "ValidPalindrome2Tests.json";
    public ValidPalindrome2Test() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCaseRecord) {
        executeTestCase(testCaseRecord.input, testCaseRecord.output);
    }

    private void executeTestCase(final String s, final boolean expected) {
        var solution = new ValidPalindrome2();
        boolean actual = solution.validPalindrome(s);
        assertEquals(expected, actual);
    }

}