package com.leetcode.algo.bit_manip.find_duplicate_number;

public class FindDuplicateNumber  {
    public int findDuplicate(int[] nums) {
        final int max = max(nums);
        final int mostSignificantBit = mostSignificantBit(max);

        int duplicate = 0;
        for (int bit = 0; bit < mostSignificantBit; ++bit) {
            int mask = 1 << bit;

            int baseCount = 0;
            int numCount = 0;
            for (int i = 0; i < nums.length; ++i) {
                if ((mask & i) > 0) {
                    ++baseCount;
                }

                if ((mask & nums[i]) > 0) {
                    ++numCount;
                }
            }

            if (numCount > baseCount) {
                duplicate = duplicate | mask;
            }
        }

        return  duplicate;
    }

    private int max(final int[] nums) {
        int max = -1;
        for (var num: nums) {
            max = Math.max(num, max);
        }
        return max;
    }

    private int mostSignificantBit(int num) {
        int mostSignificantBit = 0;
        do {
            num = num >> 1;
            ++mostSignificantBit;
        } while (num > 0);

        return mostSignificantBit;
    }
}
