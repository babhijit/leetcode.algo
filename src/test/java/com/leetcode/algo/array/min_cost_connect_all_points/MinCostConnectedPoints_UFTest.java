package com.leetcode.algo.array.min_cost_connect_all_points;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class MinCostConnectedPoints_UFTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "MinCostConnectedPointsTests.json";

    public MinCostConnectedPoints_UFTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new MinCostConnectedPoints_UF();
        assertEquals(testCase.expected, solution.minCostConnectPoints(testCase.points));
    }
}