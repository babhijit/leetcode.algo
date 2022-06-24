package com.leetcode.algo.array.construct_target_mult_sums_1354;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class ConstructTargetArrayWithMultipleSumsTest extends AbstractExecuteTests<TestCase> {
    public ConstructTargetArrayWithMultipleSumsTest() {
        super("ConstructTargetArrayWithMultipleSumsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.target, testCase.output);
    }

    private void executeTest(int[] target, boolean expected) {
        var solution = new ConstructTargetArrayWithMultipleSums();
        boolean actual = solution.isPossible(target);
        assertEquals(expected, actual);
    }
}