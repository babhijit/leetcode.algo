package com.leetcode.algo.array.k_largest;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
    private final Queue<Integer> pq = new PriorityQueue<>();
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num: nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.add(val);
        }
        else if (pq.element() < val) {
            pq.remove();
            pq.add(val);
        }
        return pq.element();
    }
}
