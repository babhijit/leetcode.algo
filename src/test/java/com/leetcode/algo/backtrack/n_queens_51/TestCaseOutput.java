package com.leetcode.algo.backtrack.n_queens_51;

import java.util.*;

public class TestCaseOutput {
    public final Set<List<String>> expected;

    public TestCaseOutput(String[][] expected) {
        this.expected = new HashSet<>();
        for (var output: expected){
            this.expected.add(List.of(output));
        }
    }
}
