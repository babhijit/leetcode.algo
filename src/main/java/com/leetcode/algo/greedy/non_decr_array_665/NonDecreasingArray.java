package com.leetcode.algo.greedy.non_decr_array_665;

import java.util.Objects;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        Objects.requireNonNull(nums, "nums can not be null");
        assert nums.length > 0 : "nums length must be at least 1";

        final int N = nums.length;
        int timesChanged = 0;
        int previous = nums[0];

        for (int i = 1; (timesChanged < 2) && (i < N); ++i) {
            if (nums[i] < previous) {
                ++timesChanged;

                if (i > 1) {
                    /* if previous to previous element is also greater then current
                     * then in current is greater than two elements in succession
                     * thus to keep the array sorted the current one should be the one that needs to be replaced
                     */
                    if (nums[i - 2] > nums[i]) {
                        continue;
                    }
                }
            }
            previous = nums[i];
        }

        return timesChanged < 2;
    }
}
