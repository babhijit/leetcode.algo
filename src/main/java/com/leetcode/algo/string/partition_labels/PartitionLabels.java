package com.leetcode.algo.string.partition_labels;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    private static final int R = 26;

    private static class CharStat {
        int start;
        int last;
        boolean visited;
    }

    private CharStat[] charStats = new CharStat[R];
    int[] partitions;
    int partitionCount;

    public PartitionLabels() {
        for (int i = 0; i < R; ++i) {
            charStats[i] = new CharStat();
        }
    }

    public List<Integer> partitionLabels(String s) {
        reinitCounters(s.length());

        processString(s);

        return getPartitionLabels(s);
    }

    private void reinitCounters(int stringLength) {
        partitions = new int[stringLength];
        partitionCount = 0;

        for (var cs : charStats) {
            cs.visited = false;
        }
    }

    private void processString(final String s) {
        final int N = s.length();
        for (int i = 0; i < N; ++i) {
            updateCharstats(s.charAt(i), i);
        }
    }

    private void updateCharstats(final char c, final int i) {
        int r = c - 'a';

        if (!charStats[r].visited) {
            charStats[r].start = i;
            charStats[r].visited = true;
        }
        charStats[r].last = i;
    }

    private List<Integer> getPartitionLabels(String s) {
        final int N = s.length();
        int i = -1;
        while (++i < N) {
            int r = s.charAt(i) - 'a';
            updatePartitions(r);
        }

        return getPartitionSizes();
    }

    private void updatePartitions(final int r) {
        int charStartIndex = charStats[r].start;
        int charLastIndex = charStats[r].last;
        int partitionIndex = partitionCount - 1;

        // check for increase in partitions
        if ((partitionCount == 0) ||
                (charStartIndex > partitions[partitionIndex])) {
            partitions[partitionCount++] = charLastIndex;
            return;
        }

        // partition adjustment
        int partitionStartIndex = getPartitionStartIndex(partitionIndex);
        while ((partitionIndex > 0) && (charStartIndex < partitionStartIndex)) {
            partitionStartIndex = getPartitionStartIndex(--partitionIndex);
        }

        partitionCount = partitionIndex + 1;
        partitions[partitionIndex] = charLastIndex;
        return;
    }

    private List<Integer> getPartitionSizes() {
        List<Integer> partitionSizes = new ArrayList<>();

        int startIndex = 0;
        for (int i = 0; i < partitionCount; ++i) {
            partitionSizes.add(partitions[i] - startIndex + 1); // correction for 0-based index
            startIndex = partitions[i] + 1;
        }

        return partitionSizes;
    }

    private int getPartitionStartIndex(int partitionIndex) {
        if (partitionIndex == 0) {
            return 0;
        }
        return partitions[partitionIndex - 1] + 1; // partition end index is inclusive for the partition
    }
}
