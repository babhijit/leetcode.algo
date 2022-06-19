package com.leetcode.algo.string.search_suggest_sys_1268;

import java.util.List;

public class Suggest3Products {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        var searchTrie = new SearchTrie();

        for (var product: products) {
            searchTrie.put(product);
        }

        return searchTrie.search(searchWord);
    }
}
