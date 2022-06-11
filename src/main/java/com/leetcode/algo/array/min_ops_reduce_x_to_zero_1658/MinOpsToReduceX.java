package com.leetcode.algo.array.min_ops_reduce_x_to_zero_1658;

public class MinOpsToReduceX {
    private int[] prefixSum;
    private int[] suffixSum;

    public int minOperations(int[] nums, int x) {
        final int N = nums.length;
        prefixSum = new int[N + 1];
        suffixSum = new int[N + 1];

        setupPrefixAndSuffixSum(nums);

        int operations = Integer.MAX_VALUE;
        for (int prefixIndex = 0; prefixIndex < prefixSum.length; ++prefixIndex) {
            int remainder = x - prefixSum[prefixIndex];
            if (remainder < 0)
                break;
            int suffixIndex = binarySearch(suffixSum, remainder);
            operations = Math.min(operations, prefixIndex + suffixIndex);
        }

        if (operations > N) {
            return -1;
        }
        return operations;
    }

    private void setupPrefixAndSuffixSum(final int[] nums) {
        final int N = nums.length;
        for (int i = 0; i < N; ++i) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        for (int i = 1; i <= N; ++i) {
            suffixSum[i] = suffixSum[i - 1] + nums[N - i];
        }
    }

    private int binarySearch(final int[] sum, int target) {
        int start = 0;
        int end = sum.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            int diff = target - sum[mid];
            if (diff == 0)
                return mid;
            else if (diff > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return sum.length;
    }
}
