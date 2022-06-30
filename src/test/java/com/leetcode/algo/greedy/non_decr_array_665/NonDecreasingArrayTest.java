package com.leetcode.algo.greedy.non_decr_array_665;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class NonDecreasingArrayTest extends AbstractExecuteTests<TestCase> {

    public NonDecreasingArrayTest() {
        super("NonDecreasingArrayTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.nums, testCase.output);
    }

    private void executeTest(int[] nums, boolean expected) {
        var solution = new NonDecreasingArray();
        boolean actual = solution.checkPossibility(nums);
        assertEquals(expected, actual);
    }
}