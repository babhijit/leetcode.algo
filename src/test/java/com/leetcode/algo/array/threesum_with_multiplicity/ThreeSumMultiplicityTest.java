package com.leetcode.algo.array.threesum_with_multiplicity;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumMultiplicityTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "ThreeSumMultiplicityTests.json";

    public ThreeSumMultiplicityTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.arr, testCase.input.target, testCase.output);
    }

    private void executeTest(int[] arr, int target, int expected) {
        var solution = new ThreeSumMultiplicity_Optimal();
        int actual = solution.threeSumMulti(arr, target);
        assertEquals(expected, actual);
    }
}