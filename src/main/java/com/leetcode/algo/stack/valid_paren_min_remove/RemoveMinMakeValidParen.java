package com.leetcode.algo.stack.valid_paren_min_remove;

import java.util.Stack;

public class RemoveMinMakeValidParen {
    private static final char OPEN_FIRST = '(';
    private static final char CLOSED_FIRST = ')';

    private final Stack<Integer> parentheses = new Stack<>();
    private final StringBuilder validParen = new StringBuilder();

    public String minRemoveToMakeValid(String s) {
        final int N = s.length();
        for (int i = 0; i < N; ++i) {
            char c = s.charAt(i);
            processChar(c);
        }

        String validParenString = getValidParenString();

        parentheses.clear();
        validParen.delete(0, validParen.length());
        return validParenString;
    }

    private String getValidParenString() {
        while (!parentheses.isEmpty()) {
            int indexToDelete = parentheses.pop();
            validParen.deleteCharAt(indexToDelete);
        }

        return validParen.toString();
    }

    private void processChar(final char c) {
        if (c == CLOSED_FIRST) {
            if (!parentheses.isEmpty()) {
                parentheses.pop();
                validParen.append(c);
            }
        } else {
            if (c == OPEN_FIRST) {
                parentheses.push(validParen.length());
            }
            validParen.append(c);
        }
    }

}
