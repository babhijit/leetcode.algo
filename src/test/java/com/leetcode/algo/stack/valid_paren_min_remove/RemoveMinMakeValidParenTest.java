package com.leetcode.algo.stack.valid_paren_min_remove;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveMinMakeValidParenTest {
    private final RemoveMinMakeValidParen solution = new RemoveMinMakeValidParen();

    @Test
    void test1ElementValidInput() {
        assertEquals("a", solution.minRemoveToMakeValid("a"));
    }

    @Test
    void testEmptyParenInput() {
        assertEquals("()", solution.minRemoveToMakeValid("()"));
    }

    @Test
    void testInvalidParenEmptyInput() {
        assertEquals("", solution.minRemoveToMakeValid("))(("));
    }

    @Test
    void testInvalidParenInput() {
        assertEquals("ab(c)d", solution.minRemoveToMakeValid("a)b(c)d"));
    }

    @Test
    void testInvalidParenInput2() {
        assertEquals("lee(t(c)o)de", solution.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}