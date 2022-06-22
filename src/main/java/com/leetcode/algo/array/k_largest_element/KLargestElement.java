package com.leetcode.algo.array.k_largest_element;


public class KLargestElement {
    public int findKthLargest(int[] nums, int k) {
        if (k < 1 || k > nums.length) {
            throw new IllegalArgumentException("k is out of bounds");
        }
        return kthLargest(nums, k - 1, 0, nums.length - 1);
    }

    private int kthLargest(int[] nums, int k, int start, int end) {
        // sorting must be done on a valid range and range should at least be 2 elements wide
        if (start > end) {
            throw new IllegalArgumentException("k is out of bounds for the give range");
        }

        int pivotIndex = start + (int)(Math.random() * (end - start + 1));
        swap(nums, pivotIndex, start);

        int lt = start;
        int gt = end;

        int pivot = nums[start];
        int i = lt + 1;
        while (i <= gt) {
            int cmp = pivot - nums[i];
            if (cmp < 0) {
                swap(nums, lt++, i++);
            } else if (cmp > 0) {
                swap(nums, gt--, i);
            } else {
                ++i;
            }
        }

        // nums[start..lt-1] < pivot = nums[lt..gt] < nums[gt+1..end]
        if (k < lt) {
            return kthLargest(nums, k, start, lt - 1);
        } else if (k > gt) {
            return kthLargest(nums, k, gt + 1, end);
        } else {
            return nums[k];
        }
    }

    private void swap(int[] nums, int a, int b) {
        if (a == b) {
            return;
        }

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
