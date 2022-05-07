package com.leetcode.algo.stack.validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void testEmptyString() {
        assertTrue(validParentheses.isValid(""));
    }

    @Test
    void testSimpleValidInputs() {
        assertTrue(validParentheses.isValid("(){}[]"));
    }

    @Test
    void testSimpleInvalidInputs() {
        assertFalse(validParentheses.isValid("(]"));
    }
}