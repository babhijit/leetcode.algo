package com.leetcode.algo.greedy.reach_furthest_bldg_1642;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class FurthestBuilding {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Objects.requireNonNull(heights, "heights have to non null");

        /* Keep the number bricks used for scaling the next building
           Keep the largest number of bricks used to scale the next building first, and so on
           This ensures that if a ladder is used, then make sure the ladder is used to get back the maximum number of bricks
         */
        var biggestJumps = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for(int i = 0; i < heights.length - 1; ++i) {
            int heightDifference = heights[i + 1] - heights[i];

            // no need to scale, just jump
            if (heightDifference <= 0)      continue;

            // try to use the bricks to scale the next building.
            bricks -= heightDifference;
            biggestJumps.add(heightDifference);

            /* If all the bricks are exhausted try the following approach:
                1. Return immediately if no ladder is left
                2. If any ladder is left:
                    i. Get back the number of bricks used for the last biggest jump
                    ii. Use the ladder (decrement by a count of 1)
             */
            if (bricks < 0) {
                if (ladders > 0) {
                    --ladders;
                    if (!biggestJumps.isEmpty()) {
                        // bricks used for this jump swapped out jump is biggestJumps.poll() - heightDifference
                        bricks += biggestJumps.poll();
                    }
                } else {
                    return i; // this is the maximum number of buildings that can be scaled.
                }
            }
        }

        // so we have reached all of the buildings!
        return heights.length - 1;
    }
}
