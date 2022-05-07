package com.leetcode.algo.array.next_permutation;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        final int N = nums.length;
        int pivot = N - 1;
        while (pivot > 0) {
            if (less(nums, pivot - 1, pivot))
                break;
            --pivot;
        }

        if (pivot == 0) {
            reverse(nums, 0, N);
        } else {
            int nextGreater = upperBound(nums, pivot, N, nums[pivot - 1]);
            swap(nums, pivot - 1, nextGreater);
            reverse(nums, pivot, N);
        }
    }

    private int upperBound(final int[] nums, int start, int end, int target) {
        int upperBound = -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            while ((mid < end) && (target == nums[mid])) {
                --mid;
            }
            if (target < nums[mid]) {
                if (upperBound < mid) {
                    upperBound = mid;
                    start = mid + 1;
                } else {
                    break;
                }
            } else {
                end = mid;
            }
        }
        return upperBound;
    }

    private boolean less(final int[] nums, final int a, final int b) {
        final int A = nums[a];
        final int B = nums[b];
        return A < B;
    }

    private void reverse(final int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, --end);
        }
    }

    private void swap(final int[] nums, final int a, final int b) {
        if (a != b) {
            nums[a] ^= nums[b];
            nums[b] ^= nums[a];
            nums[a] ^= nums[b];
        }
    }
}
