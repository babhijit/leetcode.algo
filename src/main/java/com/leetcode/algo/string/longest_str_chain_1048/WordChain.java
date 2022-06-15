package com.leetcode.algo.string.longest_str_chain_1048;

import java.util.*;

public class WordChain {
    private int[] chainCount;
    private String[] words;

    public int longestStrChain(String[] words) {
        if (words.length == 0) {
            return 0;
        }

        chainCount = new int[words.length];
        this.words = Objects.requireNonNull(words);
        Arrays.sort(this.words, Comparator.comparingInt(String::length));

        int maxChainSize = 0;
        for (int i = 0; i < this.words.length; ++i) {
            int chainSize = calculateChainCount(i);
            maxChainSize = Math.max(maxChainSize, chainSize);
        }

        return maxChainSize;
    }

    private int calculateChainCount(int index) {
        if (chainCount[index] > 0) {
            return chainCount[index];
        }

        final String word = words[index];
        final int wordLength = word.length();
        int maxChainSize = 0;
        for (int i = index + 1; i < words.length; ++i) {
            if (isValidCandidate(word, words[i], wordLength)) {
                int chainSize = calculateChainCount(i);
                maxChainSize = Math.max(maxChainSize, chainSize);
            }
        }

        chainCount[index] = 1 + maxChainSize;
        return chainCount[index];
    }

    private boolean isValidCandidate(String word, String candidate, int wordLength) {
        if (word.length() != candidate.length() - 1) {
            return false;
        }

        for (int i = 0, j= 0; i < wordLength; ++j) {
            if (j > wordLength) {
                return false;
            }
            if (word.charAt(i) == candidate.charAt(j)) {
                ++i;
            }
        }

        return true;
    }
}
