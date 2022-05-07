package com.leetcode.algo.array.top_k_freq_elements;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFreqElements_OptimalTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "TopKFrequentElementsTests.json";

    public TopKFreqElements_OptimalTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new TopKFreqElements_Optimal();
        var actual = solution.topKFrequent(testCase.input.nums, testCase.input.k);
        Arrays.sort(testCase.output.expected);
        Arrays.sort(actual);
        assertArrayEquals(testCase.output.expected, actual);
    }

}