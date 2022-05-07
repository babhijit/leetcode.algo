package com.leetcode.algo.bsearch.twosum_2;

import com.leetcode.algo.AbstractExecuteTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSum2Test extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "TwoSum2Tests.json";

    public TwoSum2Test() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.nums, testCase.input.target, testCase.output);
    }

    @Test
    private void executeTest(int[] nums, int target, int[] expected) {
        var solution = new TwoSum2();
        var actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}