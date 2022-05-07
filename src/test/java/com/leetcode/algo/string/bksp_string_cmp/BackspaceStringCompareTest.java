package com.leetcode.algo.string.bksp_string_cmp;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest extends AbstractExecuteTests<TestCase> {
    public BackspaceStringCompareTest() {
        super("BackspaceStringCompareTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new BackspaceStringCompare();
        Boolean expected = testCase.output;
        String s = testCase.input.s;
        String t = testCase.input.t;
        assertEquals(expected, solution.backspaceCompare(s, t));
    }
}