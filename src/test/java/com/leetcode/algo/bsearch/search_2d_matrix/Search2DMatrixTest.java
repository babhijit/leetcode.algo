package com.leetcode.algo.bsearch.search_2d_matrix;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "SearchIn2DMatrix.json";

    public Search2DMatrixTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCaseRecord) {
        executeTest(testCaseRecord.input.matrix, testCaseRecord.input.target, testCaseRecord.output);
    }

    private void executeTest(final int[][] matrix, final int target, final boolean expected) {
        var solution = new Search2DMatrix();
        boolean actual = solution.searchMatrix(matrix, target);
        if (expected) {
            assertTrue(actual);
        } else {
            assertFalse(actual);
        }
    }
}