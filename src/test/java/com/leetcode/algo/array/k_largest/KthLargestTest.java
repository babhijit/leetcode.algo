package com.leetcode.algo.array.k_largest;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestTest extends AbstractExecuteTests<TestCaseRecord> {

    private static final String FILE_NAME = "KthLargestTests.json";

    public KthLargestTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input, testCase.output);
    }

    private void executeTest(TestCaseInput input, TestCaseOutput expected) {
        var solution = new KthLargest(input.k, input.init);
        final int N = expected.expected.length;
        for (int i = 0; i < N; ++i) {
            assertEquals(expected.expected[i], solution.add(input.adds[i]));
        }
    }
}