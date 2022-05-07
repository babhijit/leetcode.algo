package com.leetcode.algo.array.find_duplicate_number;

/**
 * {@link FindDuplicateNumber} solution using Floyd's algorithm : Tortoise and Hare
 */
public class FindDuplicateNumber  {
    public int findDuplicate(int[] nums) {
        int tortoise = 0;
        int hare = 0;

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        tortoise = 0;
        do {
            tortoise = nums[tortoise];
            hare = nums[hare];
        } while(tortoise != hare);

        return tortoise;
    }
}
