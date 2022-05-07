package com.leetcode.algo.string.reverse_words;

public class ReverseWords {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int prev = 0;
        int next = s.indexOf(' ');
        while (next != -1) {
            reverse(str, prev, next - 1);
            prev = next + 1;
            next = s.indexOf(' ', prev);
        }

        reverse(str, prev, s.length() - 1);
        return new String(str);
    }

    private void reverse(final char[] str, int low, int high) {
        while (low < high) {
            char c = str[low];
            str[low] = str[high];
            str[high] = c;

            ++low;
            --high;
        }
    }
}
