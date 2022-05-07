package com.leetcode.algo.array.sort_by_parity;

import java.util.Objects;

public class SortByParity {
    public int[] sortArrayByParity(int[] nums) {
        Objects.requireNonNull(nums);

        int low = 0;
        int high = nums.length - 1;

        while(low < high) {
            while((low < high) && isEven(nums[low])) {
                ++low;
            }

            while((low < high) && isOdd(nums[high])) {
                --high;
            }

            swap(nums, low++, high--);
        }

        return nums;
    }
    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    private boolean isEven(int num) {
        return (num & 1) == 0;
    }

    private boolean isOdd(int num) {
        return (num & 1) != 0;
    }
}
