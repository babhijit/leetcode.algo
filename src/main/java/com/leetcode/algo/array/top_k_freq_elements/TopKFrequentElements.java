package com.leetcode.algo.array.top_k_freq_elements;

import java.util.*;

public class TopKFrequentElements {
    private static class Count {
        private final int number;
        private final int count;

        public Count(int number, int count) {
            this.number = number;
            this.count = count;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int current = nums[0];
        int count = 1;
        PriorityQueue<Count> maxPq = new PriorityQueue<>((c1, c2)->Integer.compare(c2.count, c1.count));
        for (int i = 1; i < nums.length; ++i) {
            if (current != nums[i]) {
                maxPq.add(new Count(current, count));

                current = nums[i];
                count = 1;
            } else {
                ++count;
            }
        }
        // the last element needs to be accounted for
        maxPq.add(new Count(current, count));

        int[] mostFreq = new int[k];
        for (int i = 0; i < k; ++i) {
            mostFreq[i] = maxPq.remove().number;
        }
        return mostFreq;
    }
}
