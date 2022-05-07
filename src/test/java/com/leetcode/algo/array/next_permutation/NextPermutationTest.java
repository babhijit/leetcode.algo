package com.leetcode.algo.array.next_permutation;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "NextPermutationTests.json";

    public NextPermutationTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.nums, testCase.output);
    }

    private void executeTest(int[] nums, int[] expected) {
        var solution = new NextPermutation();
        solution.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }
}