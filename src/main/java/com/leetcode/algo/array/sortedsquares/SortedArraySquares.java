package com.leetcode.algo.array.sortedsquares;

public class SortedArraySquares {

    public int[] sortedSquares(int[] nums) {
        final int N = nums.length;
        int [] squares = new int[N];

        int left = 0;
        int right = N - 1;
        int i = N - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                squares[i--] = nums[right] * nums[right];
                --right;
            } else {
                squares[i--]  = nums[left] * nums[left];
                ++left;
            }
        }

        return squares;
    }
}
