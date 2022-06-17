package com.leetcode.algo.string.longest_palindrome_substr_5;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCase {

    public final String s;
    public final String[] output;

    public TestCase(String s, String[] output) {
        this.s = s;
        this.output = output;
    }

    public boolean hasMatch(String s) {
        Set<String> expected = Arrays.stream(this.output).collect(Collectors.toSet());
        return expected.contains(s);
    }
}
