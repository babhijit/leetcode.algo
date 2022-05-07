package com.leetcode.algo.stack.validparentheses;

import java.util.Stack;

public class ValidParentheses {
    private static final char[] PARENTHESES = {
            '(',
            '{',
            '[',
            ')',
            '}',
            ']'
    };

    private static final int CLOSE_PARENTHESIS_START_INDEX  = 3;

    private final Stack<Character> parenthesis = new Stack<>();

    public boolean isValid(String s) {
        final int N = s.length();
        for (int i = 0; i < N; ++i) {
            if (!isValidParenthesis(s.charAt(i))) {
                return false;
            }
        }

        if (!this.parenthesis.isEmpty()) {
            this.parenthesis.clear();
            return false;
        }

        return true;
    }

    private boolean isValidParenthesis(char parenthesis) {
        int parenthesisIndex = getParenthesisIndex(parenthesis);
        if (isOpenParenthesis(parenthesisIndex)) {
            this.parenthesis.push(parenthesis);
        } else {
            if (!hasMatched(parenthesisIndex)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasMatched(int parenthesisIndex) {
        if ((parenthesisIndex == -1) || this.parenthesis.isEmpty()) {
            return false;
        }

        return this.parenthesis.pop() == PARENTHESES[parenthesisIndex - CLOSE_PARENTHESIS_START_INDEX];
    }

    private boolean isOpenParenthesis(int parenthesisIndex) {
        return parenthesisIndex < CLOSE_PARENTHESIS_START_INDEX;
    }

    private int getParenthesisIndex(char parenthesis) {
        for (int i = 0; i < PARENTHESES.length; ++i) {
            if (parenthesis == PARENTHESES[i]) {
                return i;
            }
        }
        // -1 for non-matching character
        return -1;
    }
}
