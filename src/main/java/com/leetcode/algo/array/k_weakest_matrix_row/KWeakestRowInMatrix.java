package com.leetcode.algo.array.k_weakest_matrix_row;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KWeakestRowInMatrix {
    private static class IndexCount {
        private final int index;
        private final int count;

        public IndexCount(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        final Comparator<IndexCount> icComp = (a, b) -> {
            if (a.count == b.count) return a.index - b.index;
            else                    return a.count - b.count;
        };

        var pq = new PriorityQueue<>(icComp);
        final int N = mat.length;
        for (int i = 0; i < N; ++i) {
            pq.offer(new IndexCount(i, sum(mat[i])));
        }

        int [] result = new int[k];
        for (int i = 0; i < k; ++i) {
            var item = pq.remove();
            result[i] = item.index;
        }

        return result;
    }

    private int sum(final int[] v) {
        int sum = 0;
        for (var e: v) {
            if (e == 1)     ++sum;
        }
        return sum;
    }
}
