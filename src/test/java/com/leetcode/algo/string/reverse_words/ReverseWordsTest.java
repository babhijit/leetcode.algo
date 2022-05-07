package com.leetcode.algo.string.reverse_words;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest extends AbstractExecuteTests<TestCaseRecord> {

    private static final String FILE_NAME = "ReverseWordsTests.json";

    public ReverseWordsTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input, testCase.output);
    }

    private void executeTest(String input, String expected) {
        var solution = new ReverseWords();
        assertEquals(expected, solution.reverseWords(input));
    }
}