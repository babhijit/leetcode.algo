package com.leetcode.algo.array.range_sum_array2d_304;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumMatrixTest extends AbstractExecuteTests<TestCase> {
    private static final int TOP_LEFT_X = 0;
    private static final int TOP_LEFT_Y = TOP_LEFT_X + 1;
    private static final int BOTTOM_RIGHT_X = TOP_LEFT_Y + 1;
    private static final int BOTTOM_RIGHT_Y = BOTTOM_RIGHT_X + 1;

    public NumMatrixTest() {
        super("NumMatrixTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new NumMatrix(testCase.input.numMatrix);
        int actual = solution.sumRegion(testCase.input.sumRegion[TOP_LEFT_X],
                testCase.input.sumRegion[TOP_LEFT_Y],
                testCase.input.sumRegion[BOTTOM_RIGHT_X],
                testCase.input.sumRegion[BOTTOM_RIGHT_Y]);
        assertEquals(testCase.output, actual);
    }
}