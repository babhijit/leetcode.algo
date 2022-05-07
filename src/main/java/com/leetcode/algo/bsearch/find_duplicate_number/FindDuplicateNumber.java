package com.leetcode.algo.bsearch.find_duplicate_number;

/**
 * {@link FindDuplicateNumber} uses binary search and takes O(n*log(n)) time and O(1) space.
 */
public class FindDuplicateNumber {
    private int count(final int[] nums, final int element) {
        int count = 0;
        for (var num: nums) {
            if (num <= element) {
                ++count;
            }
        }
        return count;
    }

    public int findDuplicate(int[] nums) {
        final int N = nums.length;
        int low = 0;
        int high = N - 1;
        int duplicate = 0;

        while (low <= high) {
            final int mid = low + (high - low) / 2;
            int count = count(nums, mid);
            if (count > mid) {
                duplicate = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return duplicate;
    }
}
