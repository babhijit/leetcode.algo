package com.leetcode.algo.greedy.bulbs;

public class Bulbs {
    private static final int ON = 1;
    private static final int OFF = 0;

    public int minFlips(int[] bulbs) {
        int flips = 0;

        for (int bulb: bulbs) {
            if (getBulbState(bulb, flips) == OFF) {
                ++flips;
            }
        }

        return flips;
    }

    private int getBulbState(int bulbState, int flips) {
        // even number of flips toggles back to the same bulb state
        if ((flips & 1) == 0) {
            return bulbState;
        }

        // odd flips toggles state from ON -> OFF and vice versa
        return bulbState == OFF ? ON : OFF;
    }
}
