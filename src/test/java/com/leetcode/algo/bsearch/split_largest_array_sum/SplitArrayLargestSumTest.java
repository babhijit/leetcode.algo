package com.leetcode.algo.bsearch.split_largest_array_sum;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class SplitArrayLargestSumTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "SplitArrayLargestSumTests.json";

    public SplitArrayLargestSumTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    private void executeTest(final int[] nums, int m, int expected) {
        var solution = new SplitArrayLargestSum();
        var actual = solution.splitArray(nums, m);
        assertEquals(expected, actual);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.nums, testCase.input.m, testCase.output);
    }

}