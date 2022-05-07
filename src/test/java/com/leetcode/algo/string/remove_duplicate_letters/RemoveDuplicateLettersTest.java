package com.leetcode.algo.string.remove_duplicate_letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateLettersTest {

    private RemoveDuplicateLetters solution = new RemoveDuplicateLetters();

    @Test
    void testExample1() {
        String input = "bcabc";
        String expected = "abc";

        assertEquals(expected, solution.removeDuplicateLetters(input));
    }

    @Test
    void testExample2() {
        String input = "cbacdcbc";
        String expected = "acdb";

        assertEquals(expected, solution.removeDuplicateLetters(input));
    }

    @Test
    void testExample3() {
        String input = "leetcode";
        String expected = "letcod";

        assertEquals(expected, solution.removeDuplicateLetters(input));
    }

    @Test
    void testExample4() {
        String input = "abacb";
        String expected = "abc";

        assertEquals(expected, solution.removeDuplicateLetters(input));
    }
}