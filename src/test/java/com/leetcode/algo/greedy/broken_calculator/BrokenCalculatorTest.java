package com.leetcode.algo.greedy.broken_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrokenCalculatorTest {

    private final BrokenCalculator solution = new BrokenCalculator();

    @Test
    void testBrokenCalc_sv2_tg3() {
        int startValue = 2;
        int target = 3;
        int minOperations = 2;

        assertEquals(minOperations, solution.brokenCalc(startValue, target));
    }

    @Test
    void testBrokenCalc_sv5_tg8() {
        int startValue = 5;
        int target = 8;
        int minOperations = 2;

        assertEquals(minOperations, solution.brokenCalc(startValue, target));
    }

    @Test
    void testBrokenCalc_sv3_tg10() {
        int startValue = 3;
        int target = 10;
        int minOperations = 3;

        assertEquals(minOperations, solution.brokenCalc(startValue, target));
    }

}