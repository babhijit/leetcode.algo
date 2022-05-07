package com.leetcode.algo.array.sort_unsorted_cont_subarray_581;

public class ShortestUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        final int N = nums.length;

        int low = -1;

        // get lowe anomaly
        for (int i = 1; i < N; ++i) {
            if (nums[i] < nums[i - 1]) {
                low = i;
                break;
            }
        }

        // get high anomaly
        int high = N;
        for (int i = N - 1; i > 0; --i) {
            if (nums[i - 1] > nums[i]) {
                high = i - 1;
                break;
            }
        }

        // edge case when the array is already sorted
        if ((low == -1) && (high == N)) {
            return 0;
        }

        int unsortedMinValue = nums[low];
        int unsortedMaxValue = nums[high];

        // first find the low anomaly
        for (int i = low - 1; i <= high + 1; ++i) {
            unsortedMinValue = Math.min(unsortedMinValue, nums[i]);
            unsortedMaxValue = Math.max(unsortedMaxValue, nums[i]);
        }

        int subStartIndex = lowerBound(nums, 0, low - 1, unsortedMinValue);
        int subEndIndex = upperBound(nums, high + 1, N - 1, unsortedMaxValue);

        return subEndIndex - subStartIndex + 1;
    }

    private int lowerBound(final int[] nums, int low, int high, final int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = target - nums[mid];
            if (comparison < 0) {
                high = mid - 1;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                ++low; // check for equality. It should be inserted at the end
            }
        }
        return low;
    }

    private int upperBound(final int[] nums, int low, int high, final int target) {
        int upperBound = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = target - nums[mid];
            if (comparison < 0) {
                high = mid - 1;
            } else if (comparison > 0) {
                upperBound = mid;
                low = mid + 1;
            } else {
                ++low; // check for equality. It should be inserted at the end
            }
        }
        return upperBound;
    }
}
