package com.leetcode.algo.greedy.largest_permutation;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class LargestPermutationTest extends AbstractExecuteTests<TestCase> {

    public LargestPermutationTest() {
        super("LargestPermutationTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input.nums, testCase.input.swaps, testCase.output.expected);
    }

    private void executeTest(int[] nums, int swaps, int[] expected) {
        var solution = new LargestPermutation();
        int[] actual = solution.largestPermutation(nums, swaps);
        assertArrayEquals(expected, actual);
    }
}