package com.leetcode.algo.array.movezeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroAt = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                swap(nums, i, lastNonZeroAt++);
            }
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
