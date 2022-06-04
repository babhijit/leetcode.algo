package com.leetcode.algo.array.range_sum_array2d_304;

import java.util.Objects;

public class NumMatrix {
    private final int[][] preSum;

    private final int M;
    private final int N;
    public NumMatrix(int[][] matrix) {
        M = matrix.length;
        N = matrix[0].length;
        preSum = new int[M][N];

        preprocess(matrix);
    }

    private void preprocess(int[][] matrix) {
        processRowPreSum(matrix);
        for (int c = 0; c < N; ++c) {
            int sum = 0;
            for (int r = 0; r < M; ++r) {
                preSum[r][c] += sum;
                sum = preSum[r][c];
            }
        }
    }

    private void processRowPreSum(int[][] matrix) {
        for (int r = 0; r < M; ++r) {
            int sum = 0;
            for (int c = 0; c < N; ++c) {
                preSum[r][c] += sum + matrix[r][c];
                sum = preSum[r][c];
            }
        }
    }

    public int sumRegion(int upperLeftX, int upperLeftY,
                         int bottomRightX, int bottomRightY) {
        return baseSum(bottomRightX, bottomRightY) -
                baseSum(bottomRightX, upperLeftY - 1) -
                baseSum(upperLeftX - 1, bottomRightY) +
                baseSum(upperLeftX - 1, upperLeftY - 1);
    }

    public int baseSum(int x, int y) {
        if ((x < 0) || (y < 0)) {
            return 0;
        }
        return preSum[x][y];
    }
}
