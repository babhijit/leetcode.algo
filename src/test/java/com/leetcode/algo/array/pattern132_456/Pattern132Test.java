package com.leetcode.algo.array.pattern132_456;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class Pattern132Test extends AbstractExecuteTests<TestCase> {
    public Pattern132Test() {
        super("Pattern132Tests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new Pattern132();
        var actual = solution.find132pattern(testCase.nums);
        assertEquals(testCase.output, actual);
    }
}