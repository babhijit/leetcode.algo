package com.leetcode.algo.string.search_suggest_sys_1268;

import java.util.*;

import static java.util.Objects.isNull;

public class SearchTrie {
    private static final int RADIX = 26;
    private final int MAX_SEARCH_RESULTS;

    private static class Node {
        Set<String> words = new TreeSet<>();
        Node[] children = new Node[RADIX];
    }

    private static int getRadix(char c) {
        return c - 'a';
    }

    private final Node root = new Node();

    public SearchTrie(int maxSearchResults) {
        MAX_SEARCH_RESULTS = maxSearchResults;
    }

    public SearchTrie() {
        this(3);
    }

    public void put(String s) {
        var parent = root;
        for (int i = 0; i < s.length(); ++i) {
            int radix = getRadix(s.charAt(i));
            if (isNull(parent.children[radix])) {
                parent.children[radix] = new Node();
            }
            parent.children[radix].words.add(s);
            parent = parent.children[radix];
        }
    }

    public List<List<String>> search(String s) {
        List<List<String>> matchedWords = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); ++i) {
            matchedWords.add(new LinkedList<>());
        }

        Node parent = root;
        for (int i = 0; i < s.length(); ++i) {
            int radix = getRadix(s.charAt(i));
            var child = parent.children[radix];
            if (isNull(child)) {
                break;
            }
            matchedWords.set(i, getSearchResults(child));
            parent = child;
        }
        return matchedWords;
    }

    private List<String> getSearchResults(Node node) {
        return node.words.stream().limit(MAX_SEARCH_RESULTS).toList();
    }
}
