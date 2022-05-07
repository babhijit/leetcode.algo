package com.leetcode.algo.bsearch.split_largest_array_sum;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int maxElement = 0;
        int sum = 0;
        for (var num: nums) {
            sum += num;
            maxElement = Math.max(maxElement, num);
        }

        int maxSumAllowed = 0; // effectively plays the role of mid in binary search
        int left = maxElement;
        int right = sum;
        int minLargestSplitSum = 0;
        while (left <= right) {
            maxSumAllowed = left + (right - left) / 2;
            if (minSplitRequeired(nums, maxSumAllowed) <= m) {
                minLargestSplitSum = maxSumAllowed;
                right = maxSumAllowed - 1;
            } else {
                left = maxSumAllowed + 1;
            }
        }

        return minLargestSplitSum;
    }

    private int minSplitRequeired(final int[] nums, int maxSumAllowed) {
        int sum = 0;
        int requiredSplits = 1;

        for (var num: nums) {
            if (sum + num <= maxSumAllowed) {
                sum += num;
            } else {
                sum = num;
                ++requiredSplits;
            }
        }

        return requiredSplits;
    }
}
