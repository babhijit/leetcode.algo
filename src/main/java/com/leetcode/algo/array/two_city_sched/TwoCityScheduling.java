package com.leetcode.algo.array.two_city_sched;

public class TwoCityScheduling {
    private static class HeapSortByIndex {
        private static final int ROOT_INDEX = 1;

        private int[] indices;
        private int[] values;

        public HeapSortByIndex(int[] indices, int[] values) {
            this.indices = indices;
            this.values = values;

            heapify();
            sort();
        }

        private void heapify() {
            for (int i = 2; i < this.indices.length; ++i) {
                swim(i);
            }
        }

        private void sort() {
            final int N = indices.length - 1;
            for (int i = N; i > ROOT_INDEX; --i) {
                swap(i, ROOT_INDEX);
                sink(i - 1);
            }
        }

        private void swim(int child) {
            int parent = child >> 1;
            while (parent >= ROOT_INDEX) {
                if (less(parent, child)) {
                    break;
                }
                swap(child, parent);
                child = parent;
                parent = child >> 1;
            }
        }

        private void sink(int maxLeafIndex) {
            int parent = ROOT_INDEX;
            int child = parent << 1;
            while (child <= maxLeafIndex) {
                if (child < maxLeafIndex) {
                    if (less(child + 1, child)) {
                        ++child;
                    }
                }
                if (less(parent, child)) {
                    break;
                }
                swap(child, parent);
                parent = child;
                child = parent << 1;
            }
        }

        private boolean less(final int a, final int b) {
            final int A = values[indices[a]];
            final int B = values[indices[b]];
            return A < B;
        }

        private void swap(final int a, final int b) {
            if (a == b) {
                return;
            }
            indices[a] ^= indices[b];
            indices[b] ^= indices[a];
            indices[a] ^= indices[b];
        }
    }

    public int twoCitySchedCost(int[][] costs) {
        final int N = costs.length;
        final int[] costDiff = new int[N];
        final int[] costIndices = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            costDiff[i] = costs[i][0] - costs[i][1];
            costIndices[i + 1] = i;
        }

        var heapSort = new HeapSortByIndex(costIndices, costDiff);

        int totalCost = 0;
        for (int i = 1; i <= N/2; ++i) {
            int costAIndex = costIndices[N +1 - i];
            totalCost += costs[costAIndex][0];
            int costBIndex  = costIndices[i];
            totalCost += costs[costBIndex][1];
        }

        return totalCost;
    }
}
