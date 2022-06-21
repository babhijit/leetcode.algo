package com.leetcode.algo.greedy.reach_furthest_bldg_1642;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class FurthestBuildingTest extends AbstractExecuteTests<TestCase> {

    public FurthestBuildingTest() {
        super("FurthestBuildingTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input, testCase.output);
    }

    private void executeTest(TestCaseInput input, int expected) {
        var solution = new FurthestBuilding();
        int actual = solution.furthestBuilding(input.heights, input.bricks, input.ladders);
        assertEquals(expected, actual);

    }
}