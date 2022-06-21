package com.leetcode.algo.string.short_encoding_words_820;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class ShortWordsEncodingTest extends AbstractExecuteTests<TestCase> {
    public ShortWordsEncodingTest() {
        super("ShortWordsEncodingTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new ShortWordsEncoding();
        assertEquals(testCase.output, solution.minimumLengthEncoding(testCase.words));
    }
}