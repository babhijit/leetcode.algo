package com.leetcode.algo.string.rm_all_adj_dup_1209;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentKDuplicatesTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "RemoveAllAdjacentKDuplicatesTests.json";

    public RemoveAllAdjacentKDuplicatesTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input.s, testCase.input.k, testCase.output);
    }

    private void executeTest(String s, int k, String expected) {
        var solution = new RemoveAllAdjacentKDuplicates();
        assertEquals(expected, solution.removeDuplicates(s, k));
    }
}