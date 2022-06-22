package com.leetcode.algo.array.k_largest_element;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class KLargestElementTest extends AbstractExecuteTests<TestCase> {

    public KLargestElementTest() {
        super("KLargestElementTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input, testCase.output);
    }

    private void executeTest(TestCaseInput input, int expected) {
        var solution = new KLargestElement();
        int kthLargest = solution.findKthLargest(input.nums, input.k);
        assertEquals(expected, kthLargest);
    }
}