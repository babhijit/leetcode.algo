package com.leetcode.algo.array.prefect_card_2player;

import java.util.Arrays;

public class PerfectCard2Player {
    public String play(int[] numberCards) {
        Arrays.sort(numberCards);

        final int N = numberCards.length;
        if (N % 2 != 0) {
            return "lose";
        }

        int[] playerScores = {0, 0};
        int index = 0;
        int playerIndex = 0;
        while (index < N) {
            int cardNumber = numberCards[index];
            int nextIndex = lowerBound(numberCards, index, N - 1, cardNumber);
            playerScores[playerIndex] += nextIndex - index;
            index = nextIndex;
            playerIndex = ++playerIndex & 1;
        }

        if ((playerIndex == 0) && (playerScores[0] == playerScores[1])) {
            return "win";
        } else {
            return "lose";
        }
    }

    private int lowerBound(final int[] nums, int low, int high, final int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = target - nums[mid];
            if (comparison < 0) {
                high = mid - 1;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                ++low; // check for equality. It should be inserted at the end
            }
        }
        return low;
    }
}
