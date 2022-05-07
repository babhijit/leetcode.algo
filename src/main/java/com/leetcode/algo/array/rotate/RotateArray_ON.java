package com.leetcode.algo.array.rotate;

public class RotateArray_ON {
    public void rotate(int[] nums, int k) {
        final int N = nums.length;
        int [] rotated = new int[N];
        System.arraycopy(nums, N - k, rotated, 0, k);
        System.arraycopy(nums, 0, rotated, k, N - k);
        System.arraycopy(rotated, 0, nums, 0, N);
    }
}
