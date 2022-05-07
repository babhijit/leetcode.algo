package com.leetcode.algo.array.sort_by_parity;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class SortByParityTest extends AbstractExecuteTests<TestCase> {

    private static final String FILE_NAME = "SortByParityTests.json";

    public SortByParityTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new SortByParity();
        var actual = solution.sortArrayByParity(testCase.nums);
        assertTrue(arrayEquals(testCase.output, actual));
    }

    private boolean arrayEquals(int[][] output, int[] actual) {
        for (var expected: output) {
            if (arrayEquals(expected, actual)) {
                return true;
            }
        }

        return false;
    }

    private boolean arrayEquals(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            return false;
        }

        final int N = actual.length;
        for (int i = 0; i < N; ++i) {
            if (expected[i] != actual[i]) {
                return false;
            }
        }

        return true;
    }
}