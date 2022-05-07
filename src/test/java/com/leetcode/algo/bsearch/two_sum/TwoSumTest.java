package com.leetcode.algo.bsearch.two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    void testExample1() {
        int[] numbers = {2, 7, 15, 11};
        int target = 9;
        int[] expected = {0, 1};

        int[] actual = twoSum.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testExample2() {
        int[] numbers = {3, 4, 2};
        int target = 6;
        int[] expected = {1, 2};

        int[] actual = twoSum.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testExample3() {
        int[] numbers = {0, -1};
        int target = -1;
        int[] expected = {0, 1};

        int[] actual = twoSum.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }
}