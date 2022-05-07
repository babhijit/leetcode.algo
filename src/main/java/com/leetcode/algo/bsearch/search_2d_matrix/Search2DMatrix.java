package com.leetcode.algo.bsearch.search_2d_matrix;

import java.util.Arrays;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int compare = compareRange(matrix[mid], target);
            if (compare < 0) {
                high = mid;
            } else if (compare > 0) {
                low = mid + 1;
            } else {
                return Arrays.binarySearch(matrix[mid], target) >= 0;
            }
        }

        return false;
    }

    private int compareRange(final int[] array, final int target) {
        if (target < array[0]) {
            return -1;
        } else if (target > array[array.length - 1]) {
            return +1;
        } else {
            return 0;
        }
    }
}
