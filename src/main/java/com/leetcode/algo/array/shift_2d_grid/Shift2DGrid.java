package com.leetcode.algo.array.shift_2d_grid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        final int rows = grid.length;
        final int cols = grid[0].length;
        List<List<Integer>> matrix = new ArrayList<>(rows);
        for (int i = 0; i < rows; ++i) {
            matrix.add(i, new ArrayList<>(Collections.nCopies(cols, 0)));
        }

        int totalElements = rows * cols;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; ++j) {
                int m = i * cols + j;
                m = (m + k) % totalElements; // move forward
                int rowIndex = m / cols;
                int colIndex = m % cols;
                var row = matrix.get(rowIndex);
                row.set(colIndex, grid[i][j]);
            }
        }

        return matrix;
    }
}
