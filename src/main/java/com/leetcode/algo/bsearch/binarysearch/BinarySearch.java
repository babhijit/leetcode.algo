package com.leetcode.algo.bsearch.binarysearch;

public class BinarySearch {
    public int search(int [] nums, int target) {
        int low = 0;
        int high = nums.length;

        int mid;
        while (low < high) {
            mid = (low + high) >> 1;

            if (target == nums[mid]) {
                return mid;
            }

            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }

        return -1;
    }
}
