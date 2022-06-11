package com.leetcode.algo.array.min_ops_reduce_x_to_zero_1658;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinOpsToReduceXTest extends AbstractExecuteTests<TestCase> {
    public MinOpsToReduceXTest() {
        super("MinOpsToReduceXTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new MinOpsToReduceX();
        int actual = solution.minOperations(testCase.input.nums, testCase.input.x);
        assertEquals(testCase.output, actual);
    }
}