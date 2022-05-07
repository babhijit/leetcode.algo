package com.leetcode.algo.array.sortedsquares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArraySquaresTest {
    private SortedArraySquares sortedArraySquares = new SortedArraySquares();

    @Test
    void testExample1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, sortedArraySquares.sortedSquares(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        assertArrayEquals(expected, sortedArraySquares.sortedSquares(nums));
    }
}