package com.leetcode.algo.array.movezeroes;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "MoveZeroesTests.json";

    public MoveZeroesTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCaseRecord) {
        executeTest(testCaseRecord.nums,  testCaseRecord.output);
    }

    private void executeTest(final int[] nums, final int[] expected) {
        var solution = new MoveZeroes();
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}