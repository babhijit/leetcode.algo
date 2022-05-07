package com.leetcode.algo.stack.validate_stack_seq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateStackSequencesTest {
    private final ValidateStackSequences solution = new ValidateStackSequences();

    @Test
    void testValidStackSequence() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        assertTrue(solution.validateStackSequences(pushed, popped));
    }

    @Test
    void testInvalidStackSequence() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 3, 5, 1, 2};

        assertFalse(solution.validateStackSequences(pushed, popped));
    }

    @Test
    void testExample3() {
        int[] pushed = {0, 2, 1};
        int[] popped = {0, 1, 2};

        assertTrue(solution.validateStackSequences(pushed, popped));
    }

    @Test
    void testExample4() {
        int[] pushed = {1, 2, 3, 4, 5, 6, 7};
        int[] popped = {1, 2, 5, 3, 6, 7, 4};

        assertFalse(solution.validateStackSequences(pushed, popped));
    }
}