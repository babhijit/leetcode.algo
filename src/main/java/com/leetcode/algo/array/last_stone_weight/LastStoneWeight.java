package com.leetcode.algo.array.last_stone_weight;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        var pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int stone: stones)
            pq.add(stone);

        while (pq.size() > 1) {
            int largest = pq.remove();
            int secondLargest = pq.remove();
            int newStone = largest - secondLargest;
            if (newStone > 0) {
                pq.add(newStone);
            }
        }

        if (pq.isEmpty())  {
            return 0;
        }
        return pq.remove();
    }
}
