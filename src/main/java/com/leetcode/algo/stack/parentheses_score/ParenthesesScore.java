package com.leetcode.algo.stack.parentheses_score;

public class ParenthesesScore {
    private static final char OPEN_PAREN = '(';
    private static final char CLOSE_PAREN = ')';

    private static class Index {
        int index;

        Index(int index) {
            this.index = index;
        }
    }

    public int scoreOfParentheses(String s) {
        int score = 0;
        var index = new Index(1);
        while (index.index < s.length()) {
            score += scoreOfParentheses(s, index);
            ++index.index;
        }
        return score;
    }

    private int scoreOfParentheses(String s, Index index) {
        int score = 0;

        char c;
        while (index.index < s.length()) {
            c = s.charAt(index.index);
            ++index.index;
            switch (c) {
                case OPEN_PAREN -> score += 2 * scoreOfParentheses(s, index);
                case CLOSE_PAREN -> {
                    return score == 0 ? 1 : score;
                }
            }
        }

        return score;
    }
}
