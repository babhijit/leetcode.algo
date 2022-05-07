package com.leetcode.algo.dp.split_largest_array_sum;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.dp.SplitArrayLargestSum_TopDownDP;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitArrayLargestSumTopDownDPTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "SplitArrayLargestSumTests.json";

    public SplitArrayLargestSumTopDownDPTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    private void executeTest(final int[] nums, int m, int expected) {
        var solution = new SplitArrayLargestSum_TopDownDP();
        var actual = solution.splitArray(nums, m);
        assertEquals(expected, actual);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.nums, testCase.input.m, testCase.output);
    }

}