package com.leetcode.algo.array.merge_sorted_88;

public class MergetSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int idx1 = 0;
        int idx2 = 0;
        int idx = 0;

        while ((idx1 < m) && (idx2 < n)) {
            if (nums1[idx1] < nums2[idx2]) {
                result[idx++] = nums1[idx1++];
            } else {
                result[idx++] = nums2[idx2++];
            }
        }

        if (idx1 < m) {
            System.arraycopy(nums1, idx1, result, idx, m - idx1);
        }  else if (idx2 < n) {
            System.arraycopy(nums2, idx2, result, idx, n - idx2);
        }

        System.arraycopy(result, 0, nums1, 0, result.length);
    }
}
