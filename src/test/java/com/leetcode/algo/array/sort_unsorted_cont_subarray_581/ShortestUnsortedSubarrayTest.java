package com.leetcode.algo.array.sort_unsorted_cont_subarray_581;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class ShortestUnsortedSubarrayTest extends AbstractExecuteTests<TestCase> {

    public static final String FILE_NAME = "ShortestUnsortedSubarrayTests.json";

    public ShortestUnsortedSubarrayTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new ShortestUnsortedSubarray();
        int actual = solution.findUnsortedSubarray(testCase.nums);
        assertEquals(testCase.output, actual);
    }
}