package com.leetcode.algo.array.flood_fill;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "FloodFillTests.json";

    public FloodFillTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new FloodFill();
        var actual = solution.floodFill(testCase.input.image, testCase.input.sr, testCase.input.sc, testCase.input.newColour);
        assertArrayEquals(testCase.output.expected, actual);
    }
}