package com.leetcode.algo.greedy.highest_product;

import java.util.Arrays;

public class HighestProduct {
    public long highestProduct(int[] nums) {
        assert nums.length > 2: "nums must have at least 3 elements";

        Arrays.sort(nums);
        final int N = nums.length;

        long highest3ElementsProduct = (long) nums[N - 1] * nums[N - 2] * nums[N - 3];
        long min2ElementMaxElementProduct = (long) nums[0] * nums[1] * nums[N - 1];

        return Math.max(highest3ElementsProduct, min2ElementMaxElementProduct);
    }
}
