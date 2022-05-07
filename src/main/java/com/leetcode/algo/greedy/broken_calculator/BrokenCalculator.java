package com.leetcode.algo.greedy.broken_calculator;

public class BrokenCalculator {
    private boolean isOdd(final int number) {
        return (number & 0x1) != 0;
    }

    private int reverseSubtract(int number) {
        return number + 1;
    }

    private int reverseMultiply(int number) {
        return number >> 1;
    }

    public int brokenCalc(int startValue, int target) {
        int operations = 0;

        while (target > startValue) {
            ++operations;
            if (isOdd(target)) {
                target = reverseSubtract(target);
            } else {
                target = reverseMultiply(target);
            }
        }

        return startValue - target + operations;
    }
}
