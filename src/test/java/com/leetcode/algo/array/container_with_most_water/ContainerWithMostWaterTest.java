package com.leetcode.algo.array.container_with_most_water;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME  = "ContainerWithMostWaterTests.json";

    public ContainerWithMostWaterTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.height, testCase.output);
    }

    private void executeTest(int[] height, int expected) {
        var solution = new ContainerWithMostWater();
        int actual = solution.maxArea(height);
        assertEquals(expected, actual);
    }
}