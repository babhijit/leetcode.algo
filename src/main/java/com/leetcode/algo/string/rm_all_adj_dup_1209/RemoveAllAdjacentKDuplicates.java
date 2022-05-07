package com.leetcode.algo.string.rm_all_adj_dup_1209;

public class RemoveAllAdjacentKDuplicates {
    public String removeDuplicates(String s, int k) {
        var prefix = new StringBuilder(s.length());
        return removeDuplicates(s, prefix, 0, k);
    }

    private String removeDuplicates(String s, StringBuilder prefix, int i, int k) {
        if (i < s.length()) {
            prefix.append(s.charAt(i));
            return removeDuplicates(s, removeAdjacentDuplicates(prefix, k), ++i, k);
        } else {
            return prefix.toString();
        }
    }

    private StringBuilder removeAdjacentDuplicates(StringBuilder str, int k) {
        final int N = str.length();
        if (N >= k) {
            char c = str.charAt(N - 1);
            int i = N - k;
            while (i < N - 1) {
                if (c != str.charAt(i)) {
                    return str;
                } else {
                    ++i;
                }
            }
            // we hare reached here means we have reached duplicate
            // pop the duplicates
            str.setLength(N - k);
        }

        return str;
    }
}
