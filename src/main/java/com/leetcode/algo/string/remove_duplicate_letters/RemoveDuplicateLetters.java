package com.leetcode.algo.string.remove_duplicate_letters;

public class RemoveDuplicateLetters {

    private static final int R = 26;

    public String removeDuplicateLetters(String s) {
        if (s.isEmpty()) {
            return s;
        }

        final int[] count = new int[R];
        final boolean[] visited = new boolean[R];

        final int N = s.length();
        for (int i = 0; i < N; ++i) {
            int index = s.charAt(i) - 'a';
            ++count[index];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; ++i) {
            char c = s.charAt(i);
            int radix = c - 'a';

            --count[radix];

            if (!visited[radix]) {
                int lastIndex = sb.length() - 1;
                while (lastIndex >= 0) {
                    int lastChar = sb.charAt(lastIndex);
                    int lastCharRadix = lastChar - 'a';
                    if ((lastChar > c) && (count[lastCharRadix] > 0)) {
                        visited[lastCharRadix] = false;
                        sb.deleteCharAt(lastIndex--);
                    } else {
                        break;
                    }
                }

                sb.append(c);
                visited[radix] = true;
            }
        }

        return sb.toString();
    }
}
