package com.leetcode.algo.array.rotate;

public class RotateArray_O1 {
    public void rotate(int[] nums, int k) {
        final int N = nums.length;
        reverse(nums, 0, N - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, N - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start <= end) {
            swap(nums, start++, end--);
        }
    }

    private void swap(int[] nums, int a, int b) {
        if (a != b) {
            nums[a] ^= nums[b];
            nums[b] ^= nums[a];
            nums[a] ^= nums[b];
        }
    }
}
