package com.leetcode.algo.array.spiral_matrix_2;

import com.leetcode.algo.AbstractExecuteTests;


import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrix2Test extends AbstractExecuteTests<TestCase> {

    private static final String FILE_NAME = "SpiralMatrix2Tests.json";

    public SpiralMatrix2Test() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new SpiralMatrix2();
        var actual = solution.generateMatrix(testCase.n);
        assertArrayEquals(testCase.expected, actual);
    }
}