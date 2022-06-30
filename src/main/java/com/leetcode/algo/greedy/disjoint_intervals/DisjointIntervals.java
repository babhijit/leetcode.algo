package com.leetcode.algo.greedy.disjoint_intervals;

import java.util.Arrays;
import java.util.Comparator;

public class DisjointIntervals {

    private static final int START = 0;
    private static final int END = 1;

    public int getMaxDisjointIntervals(int[][] intervals) {
        // sort the intervals based on END. the first to end will be at index 0... the last to end will be at index N - 1
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[END]));

        int[] prevInterval = intervals[0];
        int intervalCount = 1;
        for (int[] currentInterval : intervals) {
            // check if the previous interval END is after current interval's START -- indicating an overlap
            if (currentInterval[START] > prevInterval[END]) {
                prevInterval = currentInterval;
                ++intervalCount;
            }
        }

        System.out.println();

        return intervalCount;
    }
}
