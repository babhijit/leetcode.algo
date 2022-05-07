package com.leetcode.algo.array.min_domino_rotations_for_equal_row;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDominoRotationsTest {
    private final MinDominoRotations solution = new MinDominoRotations();

    @Test
    void testMinDomRotations_d2_r1() {
        int[] tops = {2};
        int[] bottoms = {5};
        final int expected = 0;

        assertEquals(expected, solution.minDominoRotations(tops, bottoms));
    }

    @Test
    void testMinDomRotations_d2_r2() {
        int[] tops = {2, 1, 2, 4, 2, 2};
        int[] bottoms = {5, 2, 6, 2, 3, 2};
        final int expected = 2;

        assertEquals(expected, solution.minDominoRotations(tops, bottoms));
    }

    @Test
    void testMinDomRotations_d3_invalid() {
        int[] tops = {3, 5, 1, 2, 3};
        int[] bottoms = {3, 6, 3, 3, 4};
        final int expected = -1;

        assertEquals(expected, solution.minDominoRotations(tops, bottoms));
    }

    @Test
    void testMinDomRotations_d3_d2_equals() {
        int[] tops = {2, 3, 2, 3, 2, 3};
        int[] bottoms = {3, 2, 3, 2, 3, 2};
        final int expected = 3;

        assertEquals(expected, solution.minDominoRotations(tops, bottoms));
    }

    @Test
    void testMinDomRotations_d1_d2__d3_invalid() {
        int[] tops = {2, 1, 1, 3, 2, 1, 2, 2, 1};
        int[] bottoms = {3, 2, 3, 1, 3, 2, 3, 3, 2};
        final int expected = -1;

        assertEquals(expected, solution.minDominoRotations(tops, bottoms));
    }
}
