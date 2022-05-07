package com.leetcode.algo.array.shift_2d_grid;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Shift2DGridTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "Shift2DGridTests.json";

    public Shift2DGridTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.matrix, testCase.input.k, testCase.output.expected);
    }

    private void executeTest(int[][] matrix, int k, int[][] expected) {
        List<List<Integer>> expectedList = crateList(expected);
        var solution = new Shift2DGrid();
        List<List<Integer>> actualList = solution.shiftGrid(matrix, k);
        assertEquals(expectedList, actualList);
    }

    private List<List<Integer>> crateList(int[][] matrix) {
        var matrixList = new ArrayList<List<Integer>>();
        for (int[] row: matrix) {
            matrixList.add(Arrays.stream(row).boxed().toList());
        }
        return matrixList;
    }
}