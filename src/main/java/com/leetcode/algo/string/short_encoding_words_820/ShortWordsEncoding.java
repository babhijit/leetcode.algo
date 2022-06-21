package com.leetcode.algo.string.short_encoding_words_820;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ShortWordsEncoding {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());

        int encodedStringLength = 0;
        for (int i = 0; i < words.length; ++i) {
            if (!wordCanBePartOfExistingEncodedString(words, i)) {
                encodedStringLength += (words[i].length() + 1); // space for #
            }
        }

        return encodedStringLength;
    }

    private boolean wordCanBePartOfExistingEncodedString(String[] words, int lastIndex) {
        boolean canBePartOfExistingEncoding = false;

        final String word = words[lastIndex];
        final int wordLength = word.length();
        for (int i = 0; i < lastIndex; ++i) {
            String referenceWord = words[i];
            int substringStart = referenceWord.length() - wordLength;
            if (substringStart >= 0) {
                if (Objects.equals(word, referenceWord.substring(substringStart))) {
                    return true;
                }
            }
        }

        return canBePartOfExistingEncoding;
    }
}
