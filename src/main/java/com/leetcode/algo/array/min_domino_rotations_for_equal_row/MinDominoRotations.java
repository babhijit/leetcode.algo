package com.leetcode.algo.array.min_domino_rotations_for_equal_row;

import java.util.Objects;

public class MinDominoRotations {
    private static final int FACES = 6;

    public int minDominoRotations(int[] tops, int[] bottoms) {
        Objects.requireNonNull(tops, "top is null");
        Objects.requireNonNull(bottoms, "bottoms is null");
        assert tops.length == bottoms.length;

        final int N = tops.length;

        // edge case
        final int[] topCounts = new int[1 + FACES];
        final int[] bottomCounts = new int[1 + FACES];

        ++topCounts[tops[0]];
        int topMaxDiceIndex = tops[0];
        ++bottomCounts[bottoms[0]];
        int bottomMaxDiceIndex = bottoms[0];

        // the first element is used for tracking the die faces of the first draw
        topCounts[0] = tops[0];
        bottomCounts[0] = bottoms[0];

        for (int i = 1; i < N; ++i) {
            if (!diceMatchesFirstSlot(topCounts, bottomCounts, tops[i], bottoms[i])) {
                return -1;
            }

            ++topCounts[tops[i]];
            ++bottomCounts[bottoms[i]];

            if (topCounts[tops[i]] > topCounts[topMaxDiceIndex]) {
                topMaxDiceIndex = tops[i];
            }
            if (bottomCounts[bottoms[i]] > bottomCounts[bottomMaxDiceIndex]) {
                bottomMaxDiceIndex = bottoms[i];
            }
        }

        int maxDieIndex = Math.max(topCounts[topMaxDiceIndex], bottomCounts[bottomMaxDiceIndex]);
        return N - maxDieIndex;
    }

    private boolean diceMatchesFirstSlot(final int[] topCounts, final int[] bottomCounts, final int topDie, final int bottomDie) {
        if (topDie != topCounts[0] && bottomDie != topCounts[0]) {
            topCounts[0] = -1;
        }

        if (topDie != bottomCounts[0] && bottomDie != bottomCounts[0])  {
            bottomCounts[0] = -1;
        }

        return topCounts[0] != -1 || bottomCounts[0] != -1;
    }
}
