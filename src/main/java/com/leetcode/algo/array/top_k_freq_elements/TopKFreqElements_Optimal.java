package com.leetcode.algo.array.top_k_freq_elements;

import java.util.*;

public class TopKFreqElements_Optimal {
    private static class Range {
        private int min = Integer.MAX_VALUE;
        private int max = Integer.MIN_VALUE;

        public int size() {
            return max - min + 1; // min inclusive
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        var range = getRange(nums);
        var freq = getFrequencies(nums, range);
        var buckets = getFreqBucket(freq, range);

        int[] topFreq = new int[k];
        int elementCount = 0;
        for (int i = buckets.length - 1; (elementCount < k) && (i >= 0); --i) {
            if (Objects.isNull(buckets[i]))   {
                continue;
            }

            for (int num: buckets[i]) {
                topFreq[elementCount++] = num;
                if (elementCount == k) {
                    break;
                }
            }
        }

        return topFreq;
    }

    private List<Integer>[] getFreqBucket(final int[] freq, final Range range) {
        var buckets = (List<Integer>[]) new List[range.size() + 1];
        for (int i = 0; i < freq.length; ++i) {
            int count = freq[i];
            if (count == 0)   continue;

            int num = i + range.min;
            if (Objects.isNull(buckets[count])) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(num);
        }
        return buckets;
    }

    private int[] getFrequencies(final int[] nums, final Range range) {
        var freq = new int[range.size()];
        for (int num: nums) {
            ++freq[num - range.min];
        }
        return freq;
    }

    private Range getRange(final int[] nums) {
        var range = new Range();
        for (int num: nums) {
            range.min = Math.min(num, range.min);
            range.max = Math.max(num, range.max);
        }
        return range;
    }
}
