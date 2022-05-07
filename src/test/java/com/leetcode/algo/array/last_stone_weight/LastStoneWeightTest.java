package com.leetcode.algo.array.last_stone_weight;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastStoneWeightTest extends AbstractExecuteTests<TestCaseRecord> {

    private static final String FILE_NAME = "LastStoneWeightTests.json";

    public LastStoneWeightTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.stones, testCase.output);
    }

    private void executeTest(int[] stones, int expected) {
        var solution = new LastStoneWeight();
        int actual = solution.lastStoneWeight(stones);
        assertEquals(expected, actual);
    }
}