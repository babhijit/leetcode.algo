package com.leetcode.algo.bsearch.two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        final int N = nums.length;

        final Map<Integer, Integer> numMapper = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            int remainder = target - nums[i];
            if (numMapper.containsKey(remainder)) {
                return new int[] {numMapper.get(remainder), i};
            }
            numMapper.put(nums[i], i);
        }

        return null;
    }
}
