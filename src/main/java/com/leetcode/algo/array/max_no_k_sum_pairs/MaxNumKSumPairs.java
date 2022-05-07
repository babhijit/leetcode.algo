package com.leetcode.algo.array.max_no_k_sum_pairs;

import java.util.Arrays;

public class MaxNumKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum < k) {
                ++low;
            } else if (sum > k) {
                --high;
            } else {
                ++count;
                ++low;
                --high;
            }
        }

        return count;
    }
}
