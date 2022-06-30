package com.leetcode.algo.greedy.largest_permutation;

import java.util.*;

public class LargestPermutation {
    public int[] largestPermutation(int[] nums, int swaps) {
        Objects.requireNonNull(nums, "nums can not be null");

        final int N = nums.length;
        int[] locations = new int[N + 1]; // 1-indexed

        // this gives the sorted array (sorted through index numbers)
        for (int i = 0; i < N; ++i) {
            locations[nums[i]] = i;
        }

        for (int i = 0; (i < N) && (swaps > 0); ++i) {
            // skip if value is at desired location
            if (nums[i] == N - i) {
                continue;
            }

            // swap the largest element
            --swaps;
            int location = locations[N - i];

            // update locations
            locations[nums[i]] = location;
            locations[N - i] = i;

            swap(nums, i, location);
        }

        return nums;
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
