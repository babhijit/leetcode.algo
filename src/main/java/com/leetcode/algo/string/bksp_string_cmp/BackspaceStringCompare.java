package com.leetcode.algo.string.bksp_string_cmp;

import java.util.NoSuchElementException;
import java.util.Objects;

public class BackspaceStringCompare {
    private static class MyString {
        private final char[] chars;
        private int top;

        public MyString(final String s) {
            Objects.requireNonNull(s);
            chars = new char[s.length()];
            top = -1;

            process(s);
        }

        private void process(String s) {
            for (int i = 0; i < s.length(); ++i) {
                add(s.charAt(i));
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        private void add(char c) {
            if (c == '#') {
                if (!isEmpty()) {
                    --top;
                }
            } else {
                chars[++top] = c;
            }
        }

        public int size() {
            return top + 1;
        }

        public char charAt(int i) {
            if (i < 0 || i >= size()) {
                throw new NoSuchElementException();
            }
            return chars[i];
        }
    }

    public boolean backspaceCompare(String s, String t) {
        var sString = new MyString(s);
        var tString = new MyString(t);

        if (sString.size() != tString.size()) {
            return false;
        }

        for (int i = 0; i < sString.size(); ++i) {
            if (sString.charAt(i) != tString.charAt(i))
                return false;
        }

        return true;
    }
}
