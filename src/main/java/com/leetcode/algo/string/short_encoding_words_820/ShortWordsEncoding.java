package com.leetcode.algo.string.short_encoding_words_820;

import java.util.*;

public class ShortWordsEncoding {
    public int minimumLengthEncoding(String[] words) {
        var encodedWords = new HashSet<>(Arrays.asList(words));
        for (var word: words) {
            for (int i = 1; i < word.length(); ++i) {
                encodedWords.remove(word.substring(i));
            }
        }

        int encodedStringLength = 0;
        for (var word: encodedWords) {
            encodedStringLength += word.length() + 1;
        }

        return encodedStringLength;
    }
}
