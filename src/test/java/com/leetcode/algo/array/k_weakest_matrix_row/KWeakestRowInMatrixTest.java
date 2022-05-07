package com.leetcode.algo.array.k_weakest_matrix_row;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KWeakestRowInMatrixTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "kWeakestMatrixTests.json";

    public KWeakestRowInMatrixTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    private static void executeTest(final int[][] mat, final int k, final int[] output) {
        var solution = new KWeakestRowInMatrix();
        assertArrayEquals(output, solution.kWeakestRows(mat, k));
    }

    @Override
    protected void executeTest(TestCaseRecord testCaseRecord) {
        executeTest(testCaseRecord.input.mat, testCaseRecord.input.k, testCaseRecord.output);
    }
}