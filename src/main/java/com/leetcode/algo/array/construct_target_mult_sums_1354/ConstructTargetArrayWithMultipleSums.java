package com.leetcode.algo.array.construct_target_mult_sums_1354;

import java.util.*;

public class ConstructTargetArrayWithMultipleSums {

    public boolean isPossible(int[] target) {
        Queue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        long targetSum = 0;
        for (int i : target) {
            maxHeap.add((long)i);
            targetSum += i;
        }

        return isPossible(maxHeap, targetSum);
    }

    private boolean isPossible(Queue<Long> maxHeap, long arraySum) {
        while (!maxHeap.isEmpty()) {
            // extract max element... effectively reducing dimension of array by 1
            long max = maxHeap.remove();


            // If max element is 1, all the remaining elements must 1
            if (max == 1) {
                return true;
            }

            /*
             * 1. Extract max element = sum(prev_array)
             * 2. Effectively converting from prev_array[n] -> array[n - 1]
             */
            long remainingSum = arraySum - max;

            /*
             * Constraints:
             *  1. max = sum(prev_array[n])
             *  2. after extraction, arraySum = sum(prev_array[n-1]) < max
             */
            if (max < remainingSum) {
                return false; // e.g. [1, 1, 1, 2]
            } else if (remainingSum == 1) {
                // effectively after extracting only 1 element is left
                return true;
            } else if (remainingSum == 0) {
                return false; // e.g. [1, 1, 2]
            }

            /*
             * Extract the next max element from prev_array.
             * Use modulo for the scenario like [3, 100] -> repeated subtration done all at once
             */
            long newMax = max % remainingSum;

            // constraint violation: next number for array is 0!
            if (newMax == 0) {
                return false;
            }

            // increase dimensionality of array by 1 -- adding newMax back as new element
            arraySum = remainingSum + newMax;
            maxHeap.add(newMax);
        }

        return false;
    }
}
