package com.leetcode.algo.stack.parentheses_score;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParenthesesScoreTest {
    private final ParenthesesScore solution = new ParenthesesScore();

    @Test
    void testEmptyParenthesis() {
        final String s = "()";
        final int score = 1;
        assertEquals(score, solution.scoreOfParentheses(s));
    }

    @Test
    void testEmptyNestedParenthesis() {
        final String s = "(())";
        final int score = 2;
        assertEquals(score, solution.scoreOfParentheses(s));
    }

    @Test
    void testSequentialParenthesis() {
        final String s = "()()";
        final int score = 2;
        assertEquals(score, solution.scoreOfParentheses(s));
    }

    @Test
    void testSequentialNestedParenthesis() {
        final String s = "(()(()))";
        final int score = 6;
        assertEquals(score, solution.scoreOfParentheses(s));
    }

    @Test
    void test2LayeredSequentialNestedParenthesis() {
        final String s = "((()(())))";
        final int score = 12;
        assertEquals(score, solution.scoreOfParentheses(s));
    }

    @Test
    void testSeq2LayeredSeqNestedParenthesis() {
        final String s = "((()(())))(()(()))";
        final int score = 18;
        assertEquals(score, solution.scoreOfParentheses(s));
    }
}