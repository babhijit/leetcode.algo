package com.leetcode.algo.array.max_no_k_sum_pairs;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumKSumPairsTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "MaxNumKSumPairsTests.json";

    public MaxNumKSumPairsTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input, testCase.output);
    }

    private void executeTest(TestCaseInput input, TestCaseOutput output) {
        var solution = new MaxNumKSumPairs();
        int actual = solution.maxOperations(input.nums, input.k);
        assertEquals(output.expected, actual);
    }
}