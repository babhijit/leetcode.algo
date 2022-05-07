package com.leetcode.algo.bsearch.search_in_rotated_array_unknown_index;

import java.util.Arrays;

public class SearchInRotatedArrayUnknownIndex {
    private static class EqualRange {
        private int start;
        private int end;

        public EqualRange(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private EqualRange getEqualRange(final int[] nums, int i) {
        int start = i > 1 ? (i - 1) : 0;
        int end = i < (nums.length - 1) ? (i + 1) : i;
        int ref = nums[i];

        var er = new EqualRange(i, i);
        boolean done = false;

        while (!done) {
            if ((start > 0) && (ref == nums[start])) {
                er.start = start--;
            } else {
                done = true;
            }

            if ((end < (nums.length - 1)) && (ref == nums[end])) {
                er.end = end++;
                done = false;
            }
        }
        return er;
    }

    private int findPartition(final int[] nums, int low, int high) {
        // edge case : the array may not be rotated
        if (nums[high] > nums[low]) {
            return nums.length;
        }

        boolean isRotated = false;
        int refIndex = low;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int compare = nums[refIndex] - nums[mid];
            if (!isRotated) {
                if (compare < 0) {
                    refIndex = mid;
                    low = mid;
                } else if (compare > 0) {
                    isRotated = true;
                    refIndex = mid;
                    high = mid - 1;
                } else {
                    var er = getEqualRange(nums, mid);
                    if (er.start > low) {
                        int prevIndex = er.start - 1;
                        if (nums[prevIndex] < nums[refIndex]) {
                            return prevIndex;
                        } else if (nums[prevIndex] > nums[refIndex]) {
                            refIndex = prevIndex;
                            low = refIndex;
                        } else {
                            refIndex = er.end;
                            low = refIndex + 1;
                        }
                    } else {
                        refIndex = er.end;
                        low = refIndex + 1;
                    }
                }
            } else {
                if (compare > 0) {
                    high = mid - 1;
                    refIndex = mid;
                } else if (compare < 0) {
                    low = mid + 1;
                } else {
                    var er = getEqualRange(nums, mid);
                    if (nums[er.start - 1] > nums[refIndex]) {
                        return er.start;
                    } else {
                        refIndex = er.start;
                        high = er.start - 1;
                    }
                }
            }
        }

        return refIndex;
    }

    public boolean search(int[] nums, int target) {
        int mid = findPartition(nums, 0, nums.length - 1);

        int targetIndex;
        if (target >= nums[0]) {
            // edge case for 1 element partition
            int high = mid;
            if (mid == 0) {
                mid = 1;
            }
            targetIndex = Arrays.binarySearch(nums, 0, mid, target);
        } else {
            targetIndex = Arrays.binarySearch(nums, mid, nums.length, target);
        }
        return targetIndex >= 0;
    }
}
