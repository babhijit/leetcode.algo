package com.leetcode.algo.dp.triangle_120;

import java.util.List;

public class Triangle {
    private int[][] minSums = null;

    public int minimumTotal(List<List<Integer>> triangle) {
        final int N = triangle.size();
        minSums = new int[N][N];

        var lastRow = triangle.get(N - 1);
        for (int j = 0; j < lastRow.size(); ++j) {
            minSums[N - 1][j] = lastRow.get(j);
        }

        for (int i = N - 2; i >= 0; --i) {
            var row = triangle.get(i);
            for (int j = 0; j < row.size(); ++j) {
                int value = row.get(j);
                minSums[i][j] = value + Math.min(minSums[i+1][j], minSums[i+1][j+1]);
            }
        }

        return minSums[0][0];
    }
}
