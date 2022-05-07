package com.leetcode.algo.array.two_city_sched;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCitySchedulingTest {

    private TwoCityScheduling solution = new TwoCityScheduling();

    @Test
    void testInput1() {
        int[][] costs = {
                {10, 20},
                {30, 200},
                {400, 50},
                {30, 20}
        };
        int expectedCost = 110;

        int actualCost = solution.twoCitySchedCost(costs);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    void testInput2() {
        int[][] costs = {
                {259,770},
                {448,54},
                {926,667},
                {184,139},
                {840,118},
                {577,469}
        };
        int expectedCost = 1859;

        int actualCost = solution.twoCitySchedCost(costs);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    void testInput3() {
        int[][] costs = {
                {515,563},
                {451,713},
                {537,709},
                {343,819},
                {855,779},
                {457,60},
                {650,359},
                {631,42}
        };
        int expectedCost = 3086;

        int actualCost = solution.twoCitySchedCost(costs);
        assertEquals(expectedCost, actualCost);
    }

}